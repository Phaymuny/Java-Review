package Generics;


//public class Mygenrics <Things extends Number, Thing2 extends Number>{
//above is if you need your java generics work with number
public class Mygenrics <Things , Thing2>{
    Things x;
    Thing2 y;
    Mygenrics(Things x, Thing2 y){
        this.y = y;
        this.x = x;
    }
    public Thing2 getX(){
        return y;
    }
}
