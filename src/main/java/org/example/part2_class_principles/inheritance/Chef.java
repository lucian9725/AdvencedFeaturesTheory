package org.example.part2_class_principles.inheritance;

public class Chef extends Employee {

    private String seniority;

    public Chef(String id, String name, String surname, int age, String seniority) {
        super(id, name, surname, age);
        this.seniority = seniority;
    }

    @Override
    public void sayHi() {
        super.sayHi();
        System.out.println(super.id);
    }
}
