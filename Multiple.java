
interface A {

    void show();
}

interface B {

    default void show() {
        System.out.println("Facebook");
    }
}

class C implements A, B {

}

public class Multiple {

}
 ̰