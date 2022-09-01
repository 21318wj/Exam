package Exam;

public class ExamList {
	private Exam[] exams;
	private int current;

	public ExamList() {
		this(10);
	}
	
	public ExamList(int size) {
		exams = new Exam[size];
		current = 0;
	}
	
	public int size() {
		return current;
	}
		
	public Exam get(int i) {
		return this.exams[i];
	}

	public void add(Exam e) {
		if(this.exams.length == this.current) {
			Exam[] temp = new Exam[this.exams.length+3];
			
			for(int i=0; i<this.exams.length; i++)
				temp[i] = this.exams[i];
			
			this.exams = temp;
		}
		
		this.exams[this.current] = e;
		this.current++;
	}
}



















