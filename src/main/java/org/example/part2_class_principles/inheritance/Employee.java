package org.example.part2_class_principles.inheritance;
/* Mostenirea permite unei clase (copil)
   sa preaia proprietati si metode dintr-o alta clasa existenta (parinte)
 */
public class Employee {
    protected String id;
    protected String name;
    protected String surname;
    protected int age;

    public Employee(String id, String name, String surname, int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void sayHi() {
        System.out.println("Hi, I'm an employee");
    }

    public final String generateText() {
        return "test test test";
    }
}
