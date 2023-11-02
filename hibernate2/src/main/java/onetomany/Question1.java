package onetomany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;

import javax.persistence.Table;



@Entity
@Table(name = "q12")
public class Question1 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int qid;
	@Column(name = "question")
	private String question;
	
	
	@OneToMany()
	private List<Answer1> answers;

	public List<Answer1> getAnswers() {
		return answers;
	}
	public void setAnswers(List<Answer1> answers) {
		this.answers = answers;
	}
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	

}
