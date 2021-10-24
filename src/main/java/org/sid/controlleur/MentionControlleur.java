package org.sid.controlleur;

import java.util.List;
import java.util.Optional;

import org.sid.entites.Mention;
import org.sid.entites.Programme;
import org.sid.service.MentionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins ="http://localhost:8000")
public class MentionControlleur {
	@Autowired
	private MentionService ms;
	
	//findall
		@GetMapping("/Mention/liste")
		public List<Mention> lesmention(){
			return ms.getMention();
		}
		//find by id 
		@GetMapping("/Mention/{id}")
		public Optional<Mention> findProgramme(@PathVariable Long id){
			return ms.findMention(id);
		}
		
		//insert
		@PutMapping("/Mention/cree")
		public Mention creeMention(@RequestBody Mention met){
		
			return ms.save(met);
		
		}
		//modifier 
		@PutMapping("/Mention/miseajour")
		public Mention miseajourMntion(@RequestBody Mention met){

			return ms.update(met);
		
		}
		//trouver par codemention 
		@GetMapping("/Mentiontrouve/{id}")
		public Mention findbycodmention(@PathVariable String id){
			return ms.trouver(id);
		}
		
		
}
