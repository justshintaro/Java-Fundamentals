package labs_examples.objects_classes_methods.labs.methods;

import java.sql.Ref;

public class Reference {
    public int age;
    public int height;
    public String name;

   public Reference(){
        age = 23;
        height = 175;
        name = "shin";
    }
    public Reference(int age, int height, String name){
        this.age = age;
        this.height = height;
        this.name = name;
    }

    public void person(int age, int height, String name){
        System.out.println("age= "+ age +" height= " + height +" name= "+ name);
    }

    public void person(){
        System.out.println("age= "+ this.age +" height= " + this.height +" name= "+ this.name);
    }
}
