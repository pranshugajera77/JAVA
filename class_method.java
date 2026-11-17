// Class and Method

class student{
    int id = 101;
    String name = "Pranshu";

    void getdata(){                         // Get Student's id and name
        System.out.println("Id: "+ id);
        System.out.println("Name: "+ name);
    }
}

public class class_method {
    
    public static void main(String[] args) {
        
        student obj = new student();
        obj.getdata();
    }
}
