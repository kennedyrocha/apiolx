package br.com.olx.leadIntegration.controllers;

import org.springframework.web.bind.annotation.*;
import br.com.olx.leadIntegration.models.Lead;

@RestController
@RequestMapping("/leads")
public class LeadIntegrationController {
    
    @PostMapping("/lead")
    public String lead(@RequestBody Lead lead){
        return "{\"message\": \"Lead successfully received\"}";
    }

    @RequestMapping(method=RequestMethod.GET)
	public String mainPage() {
		
		return "This is working!";
	}

    @RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody Lead obj){

		return null;
	}
}
