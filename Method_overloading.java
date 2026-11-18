// Method overloading 

class student {

    void sum(int a, int b){
        System.out.println(a+b);
    }

    void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }
}

public class Method_overloading {
    public static void main(String[] args) {
        
        student ob = new student();
        ob.sum(10,20);
        ob.sum(10,20,30);

    }
}
