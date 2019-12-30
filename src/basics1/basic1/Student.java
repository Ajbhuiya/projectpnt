package basics1.basic1;

public class Student {
	public String stName; // Declared Variable
	public String stID;

	public Student() {
		// Default constructor

	}

	public Student(String stName) {
		this.stName = stName;
		System.out.println("Student Name is" + stName);

	}

	public Student(String stName, String stID) {
		this.stName = stName;
		this.stID = stID;
	}
	public void getStudentInfo(){
		System.out.println("Student name is Aj, Student Id is 123456, Student address is 123 fake st, Student email is abc123@yahoo.com, and his" +
				"date of birth is 01/01/2000");
	}

}


