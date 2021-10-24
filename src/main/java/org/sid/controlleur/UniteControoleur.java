package org.sid.controlleur;

import java.util.List;
import java.util.Optional;

import org.sid.entites.ElementConstitutif;
import org.sid.entites.Programme;
import org.sid.entites.UniteEnseignement;
import org.sid.service.ElementConsectuifService;
import org.sid.service.ProgrameServ;
import org.sid.service.UniteenseigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins ="http://localhost:8000")
public class UniteControoleur {
	@Autowired 
	private UniteenseigService ute ;
	@Autowired
	private ElementConsectuifService elc;
	@Autowired
	private ProgrameServ progServ;
	//findall
	@GetMapping("/Unite/liste")
	public List<UniteEnseignement> lesProgrammes(){
		return ute.getUnite();
	}
	//find by id
	@GetMapping("/Unite/{id}")
	public  Optional<UniteEnseignement> findUnite(@PathVariable Long id){
		return ute.findUnite(id);
	}
	
	
	//insert
	@PutMapping("/Unite/cree/{id}")
	public boolean creeProgramme(@PathVariable long id ,@RequestBody UniteEnseignement unite){
		Programme p =progServ.findProgramme(id).get();
		System.out.println(p.getLesUniter().size()==p.getNbrunite());
		if(p==null)
		{
			return false;
		}
		if(p.getLesUniter().size()==p.getNbrunite())
		{
			p.setEtat(true);
			return false;
		}
		p.getLesUniter().add(unite);
		  Programme prog = progServ.enregistrer(p);
		  unite.setProg(prog);
		  ute.save(unite);
		  if(prog.getLesUniter().size()==prog.getNbrunite())
				p.setEtat(true);
		  return true;
		  
	
	}
	//modifier
	@PutMapping("/Unite/miseajour")
	public UniteEnseignement miseajourProgramme(@RequestBody UniteEnseignement unite){
		
		return ute.update(unite);
	
	}
	
	@PutMapping("/Unite/ajoutueprog")
	public UniteEnseignement ajoutUeProg(@RequestBody UniteEnseignement prog){
		boolean test=false;
		if(prog==null)
			return null;

		UniteEnseignement p = (UniteEnseignement) ute.findbycode(prog.getCodeUnit());
		System.out.println("***************************************");
		for (ElementConstitutif ue : prog.getLeselements())
		{	
			elc.save(ue);
			p.getLeselements().add(ue);
			test=true;
			break;
		}
		if(test)
		{
		System.out.println("***************************************");
		System.out.println(prog);
		System.out.println("***************************************");
		return  ute.save(p);
		}
		else
		return p ;
		
		
		/*for (UniteEnseignement ue : prog.getLesUniter())
		{
			unitServ.save(ue);
			test=true;
		}
		if(test)
		return progServ.save(prog);
		else 
		return null;*/
	
	}
	//find by code unit 
	@GetMapping("/Unites/{id}")
	public  UniteEnseignement findUnite(@PathVariable String id){
		return ute.findbycode(id);
	}
	

}
