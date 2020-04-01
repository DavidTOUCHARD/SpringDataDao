package eu.ensup.springjpa.service;

import java.util.List;

import eu.ensup.springjpa.dao.IEleveDao;
import eu.ensup.springjpa.domaine.Eleve;

public class EleveService {

	private IEleveDao ielevedao;

	public IEleveDao getIelevedao() {
		return ielevedao;
	}

	public void setIelevedao(IEleveDao ielevedao) {
		this.ielevedao = ielevedao;
	}

	public EleveService(IEleveDao elevedao) {
		super();
		this.ielevedao = elevedao;
	}

	public EleveService() {
		super();
	}


	public List<Eleve> trouverParNom(String Nom){
		return ielevedao.findByNom(Nom);
	}
	
	public void ajouterEleve(Eleve eleve) {
		ielevedao.save(eleve);
	}

	public void initialisation() {
		System.out.println("Creation de l'objet service");
	}

	public void destruction() {
		System.out.println("Destruction de l'objet service");
	}
	
//	public void creerEleve(Eleve eleve) {
//	elevedao.createStudent(new Eleve("TOUCHARD", "DAVID"));
//}

//public Eleve lireEleve(int id) {
//	return elevedao.getEleveById(id);
//}
//
//public void supprimerEleve(Eleve eleve) {
//	elevedao.delete(eleve);
//}
//
//public List<Eleve> getAll() {
//	return elevedao.getAll();
//}


}
