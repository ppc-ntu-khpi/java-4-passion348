
import java.io.*;
import java.util.*;


public class Animal {

    protected String name;
    protected int weight;
    protected int age;
	
	public Animal() {
        System.out.println("Створено тварину");
    }
	
	public void eat() {
        System.out.println(name + " їсть їжу.");
    }

    public void speak() {
        System.out.println(name + " видає звуки.");
    }

    @Override
    public String toString() {
        return "Animal{name='" + name + "', weight=" + weight + ", age=" + age + "}";
    }
}