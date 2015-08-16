class Component{
 
    protected $tagbegin, $tagend;
    protected $components;
 
    public function __construct(){
        $this->tagbegin = "";
        $this->tagend = "";
        $this->components = [];
    }
 
    public function toString(){
        $str = $this->tagbegin;
        foreach($this->components as $component){
            if (!is_null($component))
            $str .= $component->toString();
        }
        $str .= $this->tagend;
        return $str;
    }
 
    public function append(Component $component){
        array_push($this->components, $component);
        return $this;
    }
 
}
 
class Table extends Component{
 
    public function __construct(){
        $this->tagbegin = "<table class=\"MyTable\">\n";
        $this->tagend = "</table>\n";
        $this->components = [];
    }
 
    public function setMatriz($matriz){
        // de momento no lo implemento
        return;
    }
}
 
class Row extends Component {
 
    protected $pairclass;
 
    public static $pair = false;
 
    public function __construct($title = false){
        $this->components = [];
        if (!$title){
            $this->pairclass = [ true => "pair", false => "notpair"];
            $this->tagbegin = "<tr class=\"" . $this->pairclass[Row::$pair] . "\">\n";
            Row::$pair = !Row::$pair;
        }
        else{
            $this->tagbegin = "<tr class=\"title\">\n";
            $this->tagend = "</tr>\n";
        }
        $this->tagend = "</tr>\n";
    }
}
 
class Cell extends Component {
    public function __construct($el){
        $this->components = [];
        $this->tagbegin = "<td>";
        $this->tagend = "</td>";
 
        if (is_string($el) )
            array_push($this->components, new PTag ($el));
        else array_push($this->components, $el);
    }
}
 
class Section extends Component{
    public function __construct($title){
        $this->components = [];
        $this->tagbegin = "<div class=\"title_Section\">\n";
        $this->tagend = "</div>";
        array_push($this->components, new PTag($title));
 
    }
}
 
class PTag extends Component{
 
    protected $str;
 
    public function __construct($str){
        $this->components = [];
        $this->tagbegin = "<p>";
        $this->tagend = "</p>";
        $this->str = $str;
 
    }
 
    public function toString(){
        return $this->tagbegin . $this->str . $this->tagend . "\n";
    }
}
 
class Div extends Component{
 
    public function __construct(){
        $this->components = [];
        $this->tagbegin = "<div>";
        $this->tagend = "</div>";
    }
}
 
class ExampleDiv extends Div{
 
    public function __construct($clase){
        $this->components = [];
        $this->tagbegin = "<div class=\"$clase\">";
        $this->tagend = "</div>";
    }
}