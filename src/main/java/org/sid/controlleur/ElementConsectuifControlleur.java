package org.sid.controlleur;

import java.util.List;
import java.util.Optional;

import org.sid.entites.ElementConstitutif;
import org.sid.entites.FamilleElementConstitutif;
import org.sid.entites.UniteEnseignement;
import org.sid.service.ElementConsectuifService;
import org.sid.service.FamilleElementConsectuifServ;
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
public class ElementConsectuifControlleur {
	@Autowired 
	private ElementConsectuifService elc;
	@Autowired 
	private UniteenseigService utc;
	@Autowired
	private FamilleElementConsectuifServ utf;
	//findall
	@GetMapping("/ELmentConsctuif/liste")
	public List<ElementConstitutif> lesProgrammes(){
		return elc.getElementConsectuif();	
	}
	//find by id 
	@GetMapping("/ELmentConsctuif/{id}")
	public Optional<ElementConstitutif> findProgramme(@PathVariable Long id){
		return elc.findElementConsectuif(id);
	}
	
	//insert
		@PutMapping("/ELmentConsctuif/cree/{id}")
		public UniteEnseignement creeProgramme(@PathVariable Long id,@RequestBody ElementConstitutif eltc){
		
			System.out.println(eltc.getUnite());
			if(eltc.getUnite()==null)
				return null;
			ElementConstitutif e =  elc.save(eltc);
			
			UniteEnseignement ute=utc.findUnite(id).get();
			if (ute==null)
				return null; 
			ute.getLeselements().add(e);
			return utc.save(ute);
			
		}
		//modifier 
		@PutMapping("/ELmentConsctuif/miseajour")
		public ElementConstitutif miseajourProgramme(@RequestBody ElementConstitutif eltc){
			ElementConstitutif el=elc.findElementConsectuif(eltc.getId()).get();
			//UniteEnseignement ute=utc.findUnite(eltc.getUnite().getId()).get();
			//FamilleElementConstitutif f=utf.findFamille(eltc.getFam().getId()).get();
			if(el==null)
				return null;
			//el.setFam(f);
			el.setRegime(eltc.getRegime());
			
			return elc.update(el);
		
		}
	
	
	
	

}
