import java.util.Comparator;

//Student Sort inheriting from Comparator<Student>.
public class StudentSort implements Comparator<Student>{
	
	protected StudentSort() {
		
	}
	
	//Compares student details to sort them.
	@Override
	public int compare(Student s1, Student s2) {
		float gpa1 = s1.getGPA(); //Store GPA for student 1.
		float gpa2 = s2.getGPA(); //Store GPA for student 2.
		//If first student GPA is lower than second student, don't change them around.
		if (gpa1 < gpa2) {
			return 1;
		}
		//If first student GPA is higher than second student, changed them around.
		else if (gpa1 > gpa2) {
			return -1;
		}
		//If student GPA are the same.
		else {
			String name1 = s1.getName(); //Store Name for student 1.
			String name2 = s2.getName(); //Store Name for student 2.
			//If name is the same.
			if (name1.toLowerCase().equals(name2.toLowerCase())) {
				int id1 = s1.getID(); //Store ID for student 1.
				int id2 = s2.getID(); //Store ID for student 2.
				//If first student id higher than second student change them around.
				if (id1 > id2) {
					return 1;
				}
				//If second student id lower than second student don't change them around.
				else {
					return -1;
				}
			}
			//If name is not the same, change them around depending if already in alphabetical order or not.
			else {
				return name1.compareToIgnoreCase(name2);
			}
		}
	}
	
}
