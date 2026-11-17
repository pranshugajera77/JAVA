// Extends keyword....

class animal{
    void eat(){
    System.out.println("Animal is eating");
    }
}

class dog extends animal{

    void bark(){
        System.out.println("Dog is barking");
    }
}

class cat extends animal{

    void meow(){
        System.out.println("Cat is meowing");
    }
}

public class Extends {
    
    public static void main(String[] args) {
        
        dog ob = new dog();
        ob.eat();
        ob.bark();

        cat obj = new cat();
        obj.eat();
        obj.meow();

    }
}
