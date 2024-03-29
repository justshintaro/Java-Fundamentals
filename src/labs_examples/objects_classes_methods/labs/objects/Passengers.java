package labs_examples.objects_classes_methods.labs.objects;

public class Passengers {

    private String name;
    private int age;
    private float height;

    public Passengers(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }




    @Override
    public String toString() {
        return "Passengers{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}
