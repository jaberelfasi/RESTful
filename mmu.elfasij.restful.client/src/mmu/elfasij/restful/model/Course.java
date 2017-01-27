package mmu.elfasij.restful.model;


import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Course {
	
	
	private String CourseID;
	private String CourseName;
	private String CourseCredits;
	private String CourseDuration;
	private String CourseTutor;
	
	
	public Course(){
		}
	
	public Course(String courseName, String courseCredits,
			String courseDuration, String courseTutor) {
		this.CourseName = courseName;
		this.CourseCredits = courseCredits;
		this.CourseDuration = courseDuration;
		this.CourseTutor = courseTutor;
	}
	
	public Course(String CourseID, String courseName, String courseCredits,
			String courseDuration, String courseTutor) {
		this.CourseID = CourseID;
		this.CourseName = courseName;
		this.CourseCredits = courseCredits;
		this.CourseDuration = courseDuration;
		this.CourseTutor = courseTutor;
	}

	public String getCourseID() {
		return CourseID;
	}
	
	public void setCourseID(String courseID) {
		this.CourseID = courseID;
	}

	public String getCourseName() {
		return CourseName;
	}
	
	public void setCourseName(String courseName) {
		this.CourseName = courseName;
	}

	public String getCourseCredits() {
		return CourseCredits;
	}
	
	public void setCourseCredits(String courseCredits) {
		this.CourseCredits = courseCredits;
	}

	public String getCourseDuration() {
		return CourseDuration;
	}

	public void setCourseDuration(String courseDuration) {
		this.CourseDuration = courseDuration;
	}

	public String getCourseTutor() {
		return CourseTutor;
	}

	public void setCourseTutor(String courseTutor) {
		this.CourseTutor = courseTutor;
	}
}
