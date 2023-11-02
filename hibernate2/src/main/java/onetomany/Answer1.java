package onetomany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;
@Entity
@Table(name = "a12")
public class Answer1 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aid;
	@Column(name = "answer")
	private String answer;
	
	@ManyToOne
	@JoinColumn(name = "qid")
	private Question1 qstn;
	
	
	public Question1 getQstn() {
		return qstn;
	}
	public void setQstn(Question1 qstn) {
		this.qstn = qstn;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
}
	
