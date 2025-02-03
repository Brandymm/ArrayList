// Student.java
public class Student {
	int rollno;
	String name;
	String address;
	
	public Student(int rollno, String name, String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}

	// Getter methods for encapsulation
	public int getRollno() {
		return rollno;
	}

	public String getName() {
		return name;
	}

	public String getAddresses() {
		return addresses;
	}
	
	
	@Override
	public String toString() {
		return "Student{" +
				"rollno=" + rollno +
				", name='" + name + '\'' +
				". address='" + address + '\'' +
				'}';
	}

}
