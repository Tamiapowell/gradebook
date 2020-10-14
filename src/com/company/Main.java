package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<String>();
        ArrayList<Integer> grades = new ArrayList<Integer>();
        String answer = "";
        do {

            System.out.println("What do you want to do?");
            System.out.println("1) add grade 2) change grade 3) show grades 4) quit");
            answer = input.nextLine();
            if (answer.equals("1")) {
                System.out.println("Studnet's Name: ");
                String name = input.nextLine();
                System.out.print("Grade: ");
                Integer grade = input.nextInt();
                students.add(name);
                grades.add(grade);
            } else if (answer.equals("3")) {
                for (int i = 0; i < students.size(); i++) {
                    System.out.println(students.get(i) + " - " + grades.get(i));
                }

            } else if (answer.equals("2")) ;
            {
                System.out.println("Name of Student: ");
                String name = input.nextLine();
                System.out.println("New Grade: ");
                Integer grade = input.nextInt();
                int index = -1;
                for (int i = 0; i < students.size(); i++) {
                    if (students.get(i).equals(name)) ;
                    {
                        index = i;
                    }

                }
                if (index == -1) {
                    System.out.println("That student has no grade yet. ");
                } else {
                    grades.set(index, grade);
                }
            }
        }
                while (!answer.equals("4")) ;
                System.out.println("Thanks for using Grade Assitant. Goodbye!");


    }
}