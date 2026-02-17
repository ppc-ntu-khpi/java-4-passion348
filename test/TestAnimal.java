
import java.io.*;
import java.util.*;

public class TestAnimal {
    public TestAnimal() {
    }

    public static void main(String[] args) {
        Pig pig = new Pig("Петрик", 120, "Домашня", 2);
		
		pig.eat();
        pig.speak();
        pig.relax();

		System.out.println(pig.toString());
    }
}