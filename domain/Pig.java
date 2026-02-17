
import java.io.*;
import java.util.*;

public class Pig extends Animal {

	public Pig() {
        System.out.println("Створено свиню");
    }
	
    public Pig(void String name, void int weight, void String kind, void int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.kind = kind;
        System.out.println("Створено свиню виду " + kind);
    }

    public void relax() {
        System.out.println(name + " відпочиває.");
    }

    public void eat() {
        System.out.println(name + " їсть.");
    }

    public void speak() {
        System.out.println(name + " говорить.");
    }

	@Override
    public String toString() {
        return "Pig{name='" + name + "', weight=" + weight + ", kind='" + kind + "', age=" + age + "}";
    }
}