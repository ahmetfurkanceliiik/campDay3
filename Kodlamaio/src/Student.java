
public class Student extends User {
	
	
	private static int id;

	public Student( String selectedCourse) {
		super(id, selectedCourse, selectedCourse, selectedCourse);
		this.selectedCourse = selectedCourse;
	}
	String selectedCourse;
	
	public String getSelectedCourse() {
		return selectedCourse;
	}
	public void setSelectedCourse(String selectedCourse) {
		this.selectedCourse = selectedCourse;
	}
}
