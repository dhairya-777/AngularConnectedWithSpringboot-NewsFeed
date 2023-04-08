package ca.sheridancollege.kachhidh.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ca.sheridancollege.kachhidh.domain.Newspost;
import ca.sheridancollege.kachhidh.repositories.NewsRepository;

@Service
public class NewsServiceImpl implements NewsService {

	@Autowired
	private NewsRepository nRepo;
	
	@Override
	public List<Newspost> findAll() {
		return nRepo.findAll();
	}

	@Override
	public Newspost findById(Long id) {
		// TODO Auto-generated method stub
		return nRepo.findById(id).get();
	}

	@Override
	public Newspost findByPost(String post) {
		// TODO Auto-generated method stub
		return nRepo.findByPost(post);
		
	}

	@Override
	public Newspost save(Newspost newspost) {
		// TODO Auto-generated method stub
		return nRepo.save(newspost);
	}
	
	@Override
	public List<Newspost> OrderByDate() {
		return nRepo.findAllByOrderByDateDesc();
	}
	
	
	
	// 	public List<Newspost> findByDateAfter(LocalDate date);
	

}
