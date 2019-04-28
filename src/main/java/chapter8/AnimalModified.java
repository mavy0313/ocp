package chapter8;

import java.io.Serializable;

public class AnimalModified implements Serializable {
    private static final long serialVersionUID = 2L;
    private transient String name;
    private transient int age = 10;
    private static char type = 'C';

    {this.age = 14;}

    public AnimalModified() {
        this.name = "Unknown";
        this.age = 12;
        this.type = 'Q';
    }

    public AnimalModified(String name, int age, char type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public char getType() { return type; }

    public String toString() {
        return "Animal [name=" + name + ", age=" + age + ", type=" + type + "]";
    }
}
