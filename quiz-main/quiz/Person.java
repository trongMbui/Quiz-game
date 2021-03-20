package quiz;


import java.io.Serializable;
import java.util.Scanner;

abstract public class Person implements Serializable {

    String name;
    int age;
    String eMail;

    public Person(String name, int age, String eMail) {
        this.name = name;
        this.age = age;
        this.eMail = eMail;
    }

    public Person() {
    }

}
