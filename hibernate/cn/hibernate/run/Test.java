package cn.hibernate.run;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import cn.hibernate.bean.Province;


public class Test {
	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure("resources/hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
//		session.save(new Province("成都"));
		Province pro = (Province) session.get(Province.class, 3);
		System.out.println(pro);
		transaction.commit();
		session.close();
		sessionFactory.close();
	}
	
	
}
