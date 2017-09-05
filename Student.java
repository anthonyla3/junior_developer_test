//Student class.
public class Student {
	
	private int id; //ID of student.
	private String name; //Name of student.
	private float gpa; //GPA of student.
	
	protected Student(int _id, String _name, float _gpa) {
		id = _id; //Assign provided ID passed to class.
		name = _name; //Assign provided Name passed to class.
		gpa = _gpa; //Assign provided GPA passed to class.
	}
	
	protected int getID() {
		return id; //Return ID.
	}
	
	protected String getName() {
		return name; //Return Name.
	}
	
	protected float getGPA() {
		return gpa; //Return GPA.
	}

}
