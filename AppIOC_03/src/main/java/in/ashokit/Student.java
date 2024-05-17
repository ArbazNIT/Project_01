package in.ashokit;

import java.util.List;
import java.util.Set;

public class Student {
	private Integer id;
	private Set name;
	private List course;
	private Integer fees;
	
	public Student()
	{
		
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Set getName() {
		return name;
	}
	public void setName(Set name) {
		this.name = name;
	}
	public List getCourse() {
		return course;
	}
	public void setCourse(List course) {
		this.course = course;
	}
	public Integer getFees() {
		return fees;
	}
	public void setFees(Integer fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + ", fees=" + fees + "]";
	}
	
	
	

}
