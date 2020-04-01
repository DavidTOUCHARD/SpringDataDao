package eu.ensup.springjpa.test;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import eu.ensup.springjpa.domaine.Eleve;
import eu.ensup.springjpa.service.EleveService;

public class TestSpringService {
	
	private Eleve eleve;
	private EleveService eleveservice;
	private ClassPathXmlApplicationContext appContext;

	@Before
	public void initialisation(){
		eleve = new Eleve("douglas", "mdpdoug");
		appContext = new ClassPathXmlApplicationContext("spring-data.xml");
		eleveservice = (EleveService) appContext.getBean("eleveservice");
	}

	@After
	public void destruction(){		
		eleve = null;
		appContext = null;
		eleveservice = null;
	}
	
	@Test
	public void saveEleve() {
	
		eleveservice.ajouterEleve(eleve);
	}
	@Test
	public void testFindByNom() {
		
		List<Eleve> eleve = eleveservice.trouverParNom("douglas");
		for (Eleve e : eleve) {
			System.out.println("Eleve : " + e.getNom());
		}
		assertNotNull(eleve);
	}
}
