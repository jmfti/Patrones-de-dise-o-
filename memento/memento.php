<?php
 
interface Memento{
    public function push();
    public function pop();
}
 
class HugeForm implements Memento{
    private $hashset;
    private $stack;
 
    function __construct() {
        $this->hashset = [];
        $this->stack = new SplStack();
    }
 
    public function get($key){
        try{
            return $this->hashset[$key];
        } catch (Exception $ex) {
            return "";
        }
    }
 
    public function set($key, $value){
        $this->hashset[$key] = $value;
    }
 
    public function pop() {
        try{
            $t = $this->stack->pop();
            $this->hashset = $t;
            return true;
        } catch (Exception $ex) {
            return false;
        }
    }
 
    public function push() {
        // create a copy
        $t = $this->hashset;
        $this->stack->push($t);
    }
 
    public function __toString() {
        return json_encode($this->hashset);
    }
 
}
 
?><!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        <?php
        $f = new HugeForm();
 
        $f->set("key1", "1");
        $f->push();
        printf("<p>%s</p>", $f);
 
        $f->set("key1", "2");
        $f->push();
        printf("<p>%s</p>", $f);
 
        $f->set("key1", "3");
        $f->push();
        printf("<p>%s</p>", $f);
 
        $f->set("key1", "4");
        $f->push();
        printf("<p>%s</p>", $f);
 
        $f->pop();
        printf("<p>%s</p>", $f);
 
        $f->pop();
        printf("<p>%s</p>", $f);
 
        $f->pop();
        printf("<p>%s</p>", $f);
 
        $f->pop();  // there stops popping out states
        printf("<p>%s</p>", $f);
 
        $f->pop();  // there an exception is thrown and catched
        printf("<p>%s</p>", $f);
 
        ?>
    </body>
</html>