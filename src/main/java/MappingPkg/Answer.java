package MappingPkg;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Answer {
	@Id
	private int aId;
	private String ans;
	private String answerSaidBy;
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	public String getAnswerSaidBy() {
		return answerSaidBy;
	}
	public void setAnswerSaidBy(String answerSaidBy) {
		this.answerSaidBy = answerSaidBy;
	}
}
