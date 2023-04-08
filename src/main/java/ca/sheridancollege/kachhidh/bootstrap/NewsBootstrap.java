package ca.sheridancollege.kachhidh.bootstrap;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ca.sheridancollege.kachhidh.domain.Newspost;
import ca.sheridancollege.kachhidh.services.NewsService;
import lombok.AllArgsConstructor;

@AllArgsConstructor     
@Component
public class NewsBootstrap implements CommandLineRunner {

	@Autowired
	private NewsService nService;
	
	
	@Override
	public void run(String... args) throws Exception{

        Newspost p1 = new Newspost("Facebook's announcement of a name change to Meta and their new focus on building the metaverse has generated significant buzz and speculation about the future of technology.", "Dhairya Kachhia", LocalDate.parse("2023-02-01"));
        Newspost p2 = new Newspost("The rise of NFTs has shaken up the traditional art and gaming industries, with many artists and creators embracing this new form of digital ownership and monetization.", "John Dave", LocalDate.parse("2022-03-19"));
        Newspost p3 = new Newspost("The ongoing global chip shortage has caused disruptions in the tech industry, with some companies struggling to keep up with demand for electronic devices and others forced to increase prices.", "Alex Hood", LocalDate.parse("2023-02-23"));
        
       nService.save(p1);
       nService.save(p2);
       nService.save(p3);
        
	}

}
