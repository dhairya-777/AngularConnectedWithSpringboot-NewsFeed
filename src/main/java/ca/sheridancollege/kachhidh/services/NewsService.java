package ca.sheridancollege.kachhidh.services;

import java.time.LocalDate;
import java.util.List;

import ca.sheridancollege.kachhidh.domain.Newspost;


public interface NewsService {

	
public List<Newspost> findAll();
	
	public Newspost findById(Long id);
	
	public Newspost findByPost(String post);
	
	public Newspost save(Newspost newspost);
	
	public List<Newspost> OrderByDate();
	
//	public List<Newspost> OrderByDate(LocalDate date);

//	public List<Newspost> orderByDate(LocalDate date);
}
