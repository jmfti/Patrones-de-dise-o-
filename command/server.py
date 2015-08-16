import asyncore, logging, socket, asynchat
 
class Server(asyncore.dispatcher):
    def __init__(self):
        asyncore.dispatcher.__init__(self)
        self.create_socket(socket.AF_INET, socket.SOCK_STREAM)
        self.bind(("localhost", 30500))
        self.listen(1)
        self.clients = []
 
    def handle_accept(self):
        cinfo = self.accept()
        handler = MyHandler(cinfo)
        client = [cinfo, handler]
        self.clients.append(client)
        print 'client connected'
        return
 
    def handle_close(self):
        self.close()
        return
 
class MyHandler(asynchat.async_chat):
    def __init__(self, cinfo):
        asynchat.async_chat.__init__(self, sock=cinfo[0])
        self.address = cinfo[1]
        self.ibuffer = ""
        self.obuffer = ""
        self.set_terminator("\n")
 
    def collect_incoming_data(self, data):
        print 'receiving '
        self.ibuffer += str(data)
        #print str(data)
 
    def found_terminator(self):
        #print type(self.ibuffer)
        args = str(self.ibuffer).split(";")
        print args
        if "echo" in args[0]:
            print 'echo in args[0]'
            cmd = echo((self, [self] + args[1:]))
            cmd.execute()
        self.ibuffer = ""
 
#
 
class Command:
    def __init__(self, args):
 
        self.args = args
 
    def execute(self):
        return
 
class echo(Command):
    def __init__(self, args):
        #print args
        Command.__init__(self, args)
        self.handler = args[0]
        self.data = args[1]
 
    def execute(self):
        self.handler.send(str(self.data))