function State(){
     
}
 
State.prototype.run = function(){
    /**/
}
 
State.prototype.nextState = function(){
    this.end();
     
}
 
State.prototype.end = function(){
    /**/
     
}
 
function State1(){
    State.call(this);
    // initialize data
}
 
// make State1  a subclass of State 
 
State1.prototype = new State();
 
// override member function setting the right state
 
State1.prototype.nextState = function(){
    // first do end stuff, hiding things ....
    this.end();
    return new State2();
}
 
State1.prototype.run = function(){
    // do draw stuff, show buttons, images, marquee...
     
}
 
State1.prototype.end = function(){
    // hide things, set zindex, change display style...
}
 
function State2(){
    // llamamos al constructor padre
    State.call(this);
}
 
State2.prototype = new State();
 
State2.prototype.run = function(){
    // do draw stuff, show buttons, images, marquee...
}
 
State2.prototype.nextState = function(){
    this.end();
    return new State1();
}
 
State2.prototype.end = function(){
    // hide things, set zindex, change display style...
}



/* *****************************************
inside document.ready   
*******************************************/
 
t = new State1();
t.run();
 
function transition(){
    /*
     *
     */
    t = t.nextState();
    t.run();
     
}
 
         
setInterval(transition, 10000); // let's do a transition every 10 seconds