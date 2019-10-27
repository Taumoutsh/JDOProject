package eTest;
import java.util.ArrayList;

public class Student {

	private String ID;
	private String name;
	private String surname;
	private String email;
	private ArrayList<Exam> exams = new ArrayList<Exam>();
	private double total = 0;
	
	public double averageGrade() {
		for (Exam exam : exams) {
			total = total+exam.getGrade();
		}
		return (total/exams.size());
	}
}
