package ca.sheridancollege.kachhidh.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ca.sheridancollege.kachhidh.domain.Newspost;
import ca.sheridancollege.kachhidh.services.NewsService;

@RestController
@RequestMapping("/api/newsposts")  // http://localhost:8080/api/newsposts
public class NewsController {

	@Autowired
	private NewsService nService;
	
	/*
	 * This is basic function where anybody can see news feed, date created, and author's name*/
	 @GetMapping(value= {"","/"})
	 public List<Newspost> getStudentCollection(){
		 return nService.OrderByDate();
	 }
	 
	 
	 /*
	  * For Extra functionality I have added function where anybody can add News Post, Author, 
	  * and date created. So that everyone can be add news if they like to share any
	  * */
	  
	
	 @PostMapping(value = {"", "/"})
	 public Newspost save(@RequestBody Newspost post) {
		 return nService.save(post);

	 }
	
}
