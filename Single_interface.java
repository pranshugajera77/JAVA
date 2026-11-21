// Single Interface....

interface animal{
    public void bark();
    public void meow();
    public void roar();
}

class dog implements animal{
    public void bark(){
        System.out.println("Dog is barking");
    }
    public void meow(){
        System.out.println("Cat is meowing");
    }
    public void roar(){
        System.out.println("Lion is roaring");
    }
}

public class Single_interface {
    
    public static void main(String[] args) {
        
        dog ob = new dog();
        ob.bark();
        ob.meow();
        
    }

}
