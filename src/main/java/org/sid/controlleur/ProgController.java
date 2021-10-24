package org.sid.controlleur;

import java.util.List;
import java.util.Optional;

import org.sid.entites.Programme;
import org.sid.entites.Semestre;
import org.sid.entites.UniteEnseignement;
import org.sid.service.ProgrameServ;
import org.sid.service.SemestreService;
import org.sid.service.UniteenseigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins ="http://localhost:8000")
public class ProgController {
	@Autowired
	private ProgrameServ progServ;
	@Autowired
	private UniteenseigService unitServ;
	@Autowired
	private SemestreService semServ;
	//findall
	@GetMapping("/Programme/liste")
	public List<Programme> lesProgrammes(){
		return progServ.getProgmrames();	
	}
	//find by nom pro
	@GetMapping("/Programmenom/{ch}")
	public Programme trouver(@PathVariable String ch){
		return progServ.rest(ch);
	}
	//find by id 
	@GetMapping("/Programme/{id}")
	public Optional<Programme> findProgramme(@PathVariable Long id){
		return progServ.findProgramme(id);
	}
	//insert
	@PutMapping("/Programme/cree")
	public void creeProgramme(@RequestBody Programme prog){
		Programme p = progServ.enregistrer(prog);
		System.out.println("*************************************");
		System.out.println(p.toString());
	
	}
	//trouver 
	@GetMapping("/ProgrammeCode/{id}")
	public Programme find(@PathVariable String id){
		return progServ.trouver(id);
	}
	
	//modifier 
	@PutMapping("/Programme/miseajour")
	public Programme miseajourProgramme(@RequestBody Programme prog){
		Programme p = progServ.findProgramme(prog.getId()).get();
		Semestre s = semServ.findSemestre(prog.getSymestre().getId()).get();
		if(p==null|| s==null)
			return null;
		p.setNbrunite(prog.getNbrunite());
		p.setSymestre(s);
		return progServ.update(p);
	
	}
	
	@PostMapping("/Programme/add")
	public Programme add(@RequestBody Programme prog){

		return progServ.save(prog);
	
	}
	@GetMapping("/GenerCodeUnite")
	public UniteEnseignement genereuniteCode ()
	{
		return unitServ.genereuniteCode();
	}
	
	
	@PutMapping("/Programme/ajoutueprog")
	public Programme ajoutUeProg(@RequestBody Programme prog){
		boolean test=false;
		if(prog==null)
			return null;

		Programme p = (Programme) progServ.findbycode(prog.getCodePro());
		System.out.println("***************************************");
		for (UniteEnseignement ue : prog.getLesUniter())
		{	
			unitServ.save(ue);
			p.getLesUniter().add(ue);
			test=true;
			break;
		}
		if(test)
		{
		System.out.println("***************************************");
		System.out.println(prog);
		System.out.println("***************************************");
		return progServ.save(p);
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
	
	
	
}
