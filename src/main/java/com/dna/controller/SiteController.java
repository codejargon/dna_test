package com.dna.controller;

import java.security.Principal;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/site")
public class SiteController {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	

	@RequestMapping(value="/greet", method=RequestMethod.POST)
	public String greet(Principal principal,@RequestBody Map<String, Object> hmap) {
		
		logger.debug("Debug message");
        logger.info("Info message");
        logger.warn("Warn message");
        logger.error("Error message");
        return "Done";
				
		
		/*Set set = hmap.entrySet();
	      Iterator iterator = set.iterator();
	      while(iterator.hasNext()) {
	         Map.Entry mentry = (Map.Entry)iterator.next();
	         
	         if(mentry.getKey() == "mobile" && (mentry.getValue() != null )) {
	        	 
	        	 System.out.print("key is: "+ mentry.getKey() + " & Value is: " + mentry.getValue());
	        	 
	         }
	         
	         
	      }*/
		
		
	}
	
	
	
	
	
}
