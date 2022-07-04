package TestNG222;

import javax.print.attribute.standard.Compression;

import org.testng.internal.Configuration;

import bsh.util.Sessiond;

public class CriteriaTest {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnntatedClass(Employee.class);
		SessionFactory factory = cfg.BuildSessionFactory();
		Session session = factory.openSession();
		Criteria criteria = session.(Employee.class);
		criteria.add(Restriction.gt("eid","5000"));
		criteria.add(Restriction.eq("ename","kiranacademy"));
		List<Emplyee> empList = criteria.list();
		for(Employee employee : empList) {
			System.out.println(employee);
		}
	}

}
