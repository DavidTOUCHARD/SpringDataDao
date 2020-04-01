package eu.ensup.springjpa.test;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import eu.ensup.springjpa.dao.IEleveDao;
import eu.ensup.springjpa.domaine.Eleve;

public class TestSpringJPA {

	private Eleve emp;
	private IEleveDao springDao;
	private ClassPathXmlApplicationContext appContext;

	@Before
	public void initialisation(){
		emp = new Eleve("douglas", "mdpdoug");
		appContext = new ClassPathXmlApplicationContext("spring-data.xml");
		springDao = (IEleveDao) appContext.getBean("IEleveDao");
	}

	@After
	public void destruction(){		
		emp = null;
		appContext = null;
		springDao = null;
	}
	
	@Test
	public void saveEleve() {
		
		springDao.save(emp);
	}
	@Test
	public void testFindByEmail() {
		
		List<Eleve> eleve = springDao.findByNom(emp.getNom());
		for (Eleve e : eleve) {
			System.out.println("Eleve : " + e.getNom());
		}
		assertNotNull(eleve);
	}
}
