package classes1718;
import java.util.List;

public class DrivercClass {
	
	public static void main( String[ ] args ) {
		//this section will test adding students to the database
		CreateStudent.addStudent("Sage", "Blue", 2, 101001); 
	
		Student[] class_roster = new Student[5];
		class_roster[0] = new Student("Jordan", "Burns", 2, 101002);
		class_roster[1] = new Student("Emma", "Bair", 2, 101003);
		class_roster[2] = new Student("Sam", "Brown", 2, 101004);
		class_roster[3] = new Student("Shane", "Lamb", 2, 101005);
		class_roster[4] = new Student("Janell", "Lewis", 2, 101006);
		CreateStudent.addStudents(class_roster);
		
		//this section will test retrieving and printing student information
		System.out.println("#########Queries#########");
		System.out.println("----Single Student----");
		Student studentByID = GetStudent.fetchByID(101002);
		System.out.println("");
		System.out.println(studentByID.toString());
		System.out.println("----All Students----");
		List<Student> fullList = GetStudent.fetchAll(); 
		
		for(Student i:fullList){
			System.out.println(i.toString());
		}

		//this section tests updating students
		System.out.println("----Updated Student----");
		Student replacement = new Student("James", "Bond", 8, 101002);
		System.out.println(UpdateStudent.update(replacement));
		
		//this section deletes a record
		UpdateStudent.delete(101002);
		
		
	}
}
