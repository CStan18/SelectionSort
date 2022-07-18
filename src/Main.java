import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    static ArrayList<Student> studentArrayList = new ArrayList<>();
    static Scanner scnr = new Scanner(System.in);
    static SelectionSorter selectionSorter = new SelectionSorter();

    public static void main(String[] args) {

        studentArrayList.add(new Student(16, "Darin", "123 Main St"));
        studentArrayList.add(new Student(21, "Chris", "1953 Applewood"));
        studentArrayList.add(new Student(7, "Megatron", "188 Brown St"));
        studentArrayList.add(new Student(64, "Bjornson", "27 Blue St"));
        studentArrayList.add(new Student(113, "Marg", "34 Green St"));
        studentArrayList.add(new Student(19, "Rainn", "78 Red St"));
        studentArrayList.add(new Student(4, "Michael", "55 Teal St"));
        studentArrayList.add(new Student(8, "Typhus", "11 Orange St"));
        studentArrayList.add(new Student(20, "Cornellius", "33 Maroon St"));
        studentArrayList.add(new Student(6, "Sabastion", "53 Black St"));

        System.out.println("Choose sorting method: " +
                "\n1. Comparator - Roll Number" +
                "\n2. Comparator - Name" +
                "\n3. MyMethod - Roll Number" +
                "\n4. MyMethod - Name");

        int userInput = scnr.nextInt();

        switch(userInput)
        {
            case 1:
                System.out.println("Unsorted");

                for (int i = 0; i < studentArrayList.size(); i++)
                {
                    System.out.println(studentArrayList.get(i));
                }

                Collections.sort(studentArrayList, new RollNoComparator());

                System.out.println("Sorted");
                for (int i = 0; i < studentArrayList.size(); i++)
                {
                    System.out.println(studentArrayList.get(i));
                }
                break;

            case 2:
                System.out.println("Unsorted");

                for (int i = 0; i < studentArrayList.size(); i++)
                {
                    System.out.println(studentArrayList.get(i));
                }

                Collections.sort(studentArrayList, new NameComparator());

                System.out.println("Sorted");
                for (int i = 0; i < studentArrayList.size(); i++)
                {
                    System.out.println(studentArrayList.get(i));
                }
                break;

            case 3:
                System.out.println("Unsorted");

                for (int i = 0; i < studentArrayList.size(); i++)
                {
                    System.out.println(studentArrayList.get(i));
                }

                studentArrayList = selectionSorter.sortByRollNo(studentArrayList);

                System.out.println("Sorted");
                for (int i = 0; i < studentArrayList.size(); i++)
                {
                    System.out.println(studentArrayList.get(i));
                }

                break;

            case 4:
                System.out.println("Unsorted");

                for (int i = 0; i < studentArrayList.size(); i++)
                {
                    System.out.println(studentArrayList.get(i));
                }

                studentArrayList = selectionSorter.sortByRollName(studentArrayList);

                System.out.println("Sorted");
                for (int i = 0; i < studentArrayList.size(); i++)
                {
                    System.out.println(studentArrayList.get(i));
                }
                break;
        }

    }
}