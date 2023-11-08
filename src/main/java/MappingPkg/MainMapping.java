package MappingPkg;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainMapping {
	
	public static void main(String[] args) {
		Question q1 = new Question();
		q1.setqId(1);
		q1.setQstName("Where humans live?");

		Question q2 = new Question();
		q2.setqId(2);
		q2.setQstName("India's capital?");

		Answer a1 = new Answer();
		a1.setaId(101);
		a1.setAns("Earth");
		a1.setAnswerSaidBy("Lishanth");

		Answer a2 = new Answer();
		a2.setaId(102);
		a2.setAns("New Delhi");
		a2.setAnswerSaidBy("Barbie");

		q1.setMatchAnswer(a1);
		q2.setMatchAnswer(a2);

		Configuration configuration = new Configuration().configure().addAnnotatedClass(Question.class)
				.addAnnotatedClass(Answer.class);
		SessionFactory sf = configuration.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();

		session.save(q1);
		session.save(q2);

		session.save(a1);
		session.save(a2);

		transaction.commit();
	}
}
