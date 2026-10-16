package Singleton;

public class Main {
    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        s1.display();
        s2.display();

        //we can observe in the output, the private constructor is called only once even though we are trying to create
        //2 objects s1 and s2, It is because of Singleton design pattern, the private constructor is called only
        //once because the object is created once in the Singleton class, not simply because the constructor is private.
    }
}