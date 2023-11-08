package MappingPkg;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Question {
	@Id
	private int qId;
	private String QstName;
	@OneToOne
	private Answer matchAnswer;

	public Answer getMatchAnswer() {
		return matchAnswer;
	}

	public void setMatchAnswer(Answer matchAnswer) {
		this.matchAnswer = matchAnswer;
	}

	public int getqId() {
		return qId;
	}

	public void setqId(int qId) {
		this.qId = qId;
	}

	public String getQstName() {
		return QstName;
	}

	public void setQstName(String qstName) {
		QstName = qstName;
	}
}
