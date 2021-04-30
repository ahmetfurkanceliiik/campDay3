
public class Instructor extends User {
	
	
	
	private static int id;
	private String courseName;
	String courseAbout;
	public Instructor(String courseName, String courseAbout) {
		super(id, courseAbout, courseAbout, courseAbout);
		this.courseName = courseName;
		this.courseAbout = courseAbout;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseAbout() {
		return courseAbout;
	}
	public void setCourseAbout(String courseAbout) {
		this.courseAbout = courseAbout;
	}

	

	
	
	

}
