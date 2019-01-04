import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.lti.model.AccountEntity;
import com.lti.model.EmployeeEntity;

import hibernateUtil.HibernateUtil;

public class TestOnetoOne {
public static void main(String args[])
{

	SessionFactory factory = HibernateUtil.getSessionFactory();
	Session session = factory.openSession();
	Transaction tx =session.beginTransaction();
	AccountEntity actent=new AccountEntity("1234");
	EmployeeEntity empent=new EmployeeEntity("Sayak","Mitra");
//bec Employee has account
	empent.setAccount(actent);
	//save managing first
	
	session.save(actent);
	session.save(empent);
	tx.commit();
	Query query=session.createQuery("from EmployeeEntity");
	List<EmployeeEntity> emplist=query.list();
	for(EmployeeEntity ent:emplist)
	{
		System.out.println(ent);
	}
	
}
}
