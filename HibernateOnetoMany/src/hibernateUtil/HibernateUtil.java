package hibernateUtil;



import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
private static final SessionFactory sessionFactory;
/*Use this if the annotated method below does'nt work. While using this, no need of the getter used below.
 
 * static 
 * {
 * Configuration configuration=new Configuration();
 * configuration.configure();
 * ServiceRegistry seviceRegistry= new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
 * sessionFactory =configuration.buildSessionFactory(serviceRegistry);
 * return sessionFactory;
 * }
 */
static {
	try {

	sessionFactory =new Configuration().configure().buildSessionFactory();

	
	}
catch(Throwable ex)
{
System.err.println("SessionFactory creation failed" +ex);
throw new ExceptionInInitializerError(ex);
}
}
public static SessionFactory getSessionFactory()
{
	return sessionFactory;
}
}

	

