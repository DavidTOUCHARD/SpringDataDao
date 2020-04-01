package eu.ensup.springjpa.presentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import eu.ensup.springjpa.service.EleveService;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		load le conteneur
		ApplicationContext appContext = (ApplicationContext) new ClassPathXmlApplicationContext("demospringinjection.xml");
		
//		recupéreration du bean service
		EleveService eleveservice = (EleveService) appContext.getBean("eleveservice");
		
//		manipulation du bean service (lecture d'un élève dont l'identifiant 1)
//		System.out.println(eleveservice.lireEleve(1).toString());
		test();
	
		
	}
	
	public static void test()
	{
		ConfigurableApplicationContext context = 
				new ClassPathXmlApplicationContext("demospringinjection.xml");
			
		EleveService eleveservice = (EleveService) context.getBean("eleveservice");
		    		    	
		    	
		    	context.close();
	}

}
