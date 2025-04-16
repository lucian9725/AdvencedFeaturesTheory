package org.example.part2_class_principles;

import org.example.part2_class_principles.encapsulation.UserAccount;
import org.example.part2_class_principles.inheritance.Chef;
import org.example.part2_class_principles.inheritance.Employee;
import org.example.part2_class_principles.inheritance.Waiter;

public class Main {
    public static void main(String[] args)  {
        /* Encapsulation */
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername("jianu14");
        userAccount.setPassword("catelusCuParulCret14*");

        System.out.println(userAccount.toString());

        /* Inheritance */
        Employee employee = new Employee("1234", "John", "Doe", 30);
        Chef chef = new Chef("5678", "Jane", "Smith", 28, "Senior");
        Waiter waiter = new Waiter("91011", "Bob", "Brown", 25, 100.0);

        System.out.println("Input din parent class Employee: " + employee.generateText());
        employee.sayHi();

        System.out.println("Input din parent class Employee: " + chef.generateText());
        chef.sayHi();

        System.out.println("Input din parent class Employee: " + waiter.generateText());
        waiter.sayHi();

    }
}
