//Main.java
import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();
		
		// Adding 10 students to the ArrayList
		students.add(new Student(101, "Alice", "1234 Elm St"));
		students.add(new Student(102, "Bob", "5678 Oak St"));
		students.add(new Student(103, "Charlie", "9101 Pine St"));
		students.add(new Student(104, "Dave", "1112 Maple St"));
		students.add(new Student(105, "Eve", "1314 Birch St"));
		students.add(new Student(106, "Frank", "1516 Cedar St"));
		students.add(new Student(107, "Grace", "1718 Fir St"));
		students.add(new Student(108, "Heidi", "1920 Redwood St"));
		students.add(new Student(109, "Ivy", "2122 Willow St"));
		students.add(new Student(110, "Jack", "2324 Spruce St"));
		
		
		// Printing original list
		System.out.println("Original list of students:");
		for (Student student : students) {
			System.out.println(student);
		}
		
		// Sorting by name
		SelectionSort.selectionSort(students, new NameComparator());
		System.out.println("\nSorted by name:");
		for (Student student : students) {
			System.out.println(student);
		}
		
		// Sorting by roll number
		SelectionSort.selectionSort(students, new RollNoComparator());
		System.out.println("\nSorted by roll number:");
		for (Student student : students) {
			System.out.println(student);
		}

	}

}
