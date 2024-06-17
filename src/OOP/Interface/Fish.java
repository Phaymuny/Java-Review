package OOP.Interface;

public class Fish implements Prey,Predetor{
public void hunt(){
    System.out.println("This fish can hunt");
}
public void flee(){
    System.out.println("This fish flee");
}

}
