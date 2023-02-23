package run;

import entities.Employee;

import java.awt.*;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("How many employees will be registered? ");
        int n = sc.nextInt();
        ArrayList<Employee> list = new ArrayList<Employee>();


        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i + 1) + ":");
            System.out.println("Id: ");
            int id = sc.nextInt();
            System.out.println("Name: ");
            //Teste
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Salary: ");
            double salary = sc.nextDouble();
            list.add(i, new Employee(id, name, salary));
        }
        System.out.println("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (id == list.get(i).getId())
            {
                System.out.println("Enter the percentage: ");
                double percentage = sc.nextDouble() / 100; // 10
                double increase = list.get(i).getSalary() + (percentage * list.get(i).getSalary());
                list.get(i).setSalary(increase);
            } else {
                System.out.println("This id does not exist!\n");
            }
        }
        System.out.println("List of employees: ");
        for(int i=0; i<n; i++)
        {
            System.out.println(list.get(i).toString());
        }


    }
}