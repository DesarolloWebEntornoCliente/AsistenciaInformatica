package es.altair.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import es.altair.hibernate.bean.Asistencia;

public class AsistenciaDAIImplemHibernate implements AsistenciaDAO {

	public void save(Asistencia as) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session sesion = sf.openSession();
		
		try {
			sesion.beginTransaction();
			sesion.save(as);
			sesion.getTransaction().commit();
		}catch (Exception err) {
			err.printStackTrace();
		} 
		finally {
			sesion.close();
			sf.close();
		}

	}

}
