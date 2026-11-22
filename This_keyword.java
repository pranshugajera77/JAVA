// Get data using this keyword.....

class student{
    int id = 101;
    String name = "Alice";

    void desc(){
        this.id = id;
        this.name = name;
    }
    void getdata(){
        System.out.println("ID :" +id);
        System.out.println("Name :" +name);
    }
    
}

public class This_keyword {
    
    public static void main(String[] args) {
    
        student ob = new student();
        ob.getdata();

    }
}
