package com.hibernate.Mappings.Assosiation_mapping.onetomany;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_course_100")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int course_id;
	
	private String courseName;
	private int duration;
	private String taughtBy;

	@ManyToOne
	@JoinColumn(name = "sid")
	private Student std;

	@Override
	public String toString() {
		return "Course [course_id=" + course_id + ", courseName=" + courseName + ", duration=" + duration
				+ ", taughtBy=" + taughtBy + "]";
	}

	public Course() {
		super();
	}

	public Course(String courseName, int duration, String taughtBy) {
		super();
		this.courseName = courseName;
		this.duration = duration;
		this.taughtBy = taughtBy;
	}

	public int getCourse_id() {
		return course_id;
	}

	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getTaughtBy() {
		return taughtBy;
	}

	public void setTaughtBy(String taughtBy) {
		this.taughtBy = taughtBy;
	}

	public Student getStd() {
		return std;
	}

	public void setStd(Student std) {
		this.std = std;
	}

		
}
