package eu.ensup.springjpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import eu.ensup.springjpa.domaine.Eleve;

public interface IEleveDao extends JpaRepository<Eleve, Integer>{
	
	List<Eleve> findByNom(String Nom);
	boolean deleteById(int id);
//	public void createStudent(Eleve eleve);
//
//	public Eleve getEleveById(int id);
//
//	public void delete(Eleve eleve);
//
//	public List<Eleve> getAll();
}
