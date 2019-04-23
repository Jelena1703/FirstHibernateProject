package Model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GlavnaKlasa {

	public static void main(String[] args) {
		
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		Marka marka = new Marka ();
		marka.setNazivMarke("Fiat");
		marka.setZemlja("Italija");
		
		System.out.println();
		
		Session sesija = sf.openSession();
		sesija.beginTransaction();
		
		try {
			
			sesija.persist(marka);
			sesija.save(marka);

			
			sesija.getTransaction().commit();
		} catch (Exception e) {
			sesija.getTransaction().rollback();
		}
		sesija.close();
		
	

	}

}
