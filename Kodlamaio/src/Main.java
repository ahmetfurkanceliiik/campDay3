
public class Main {

	public static void main(String[] args) {
		
		
		User user=new User(1, "Furkan", "Çelik", "ahmetfurkan@gmail.com");
		user.setId(1);
		user.setFirstName("Furkan");
		user.setLastName("Çelik");
		user.setEmail("ahmetfurkan@gmail.com");
		UserManager userManager=new UserManager();
		userManager.addUser(user);
		
		
		
		System.out.println("***********************");
		
		Instructor instructor=new Instructor("Java","JAVA & REACT");
		instructor.setId(1);
		instructor.setFirstName("Ahmet");
		instructor.setLastName("Çelik");
		instructor.setCourseAbout("JAVA & REACT");
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.addCourse(instructor);
		
		System.out.println("***********************");
		
		Student student=new Student("Java");
		student.setId(1);
		student.setFirstName("Furkan");
		student.setLastName("Çelik");
		student.setSelectedCourse("Java");
		StudentManager studentManager=new StudentManager();
		studentManager.selectedCourse(student);
		
		
		
		

	}

}
