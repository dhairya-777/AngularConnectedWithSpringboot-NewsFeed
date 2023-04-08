package ca.sheridancollege.kachhidh.repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ca.sheridancollege.kachhidh.domain.Newspost;

@Repository
public interface NewsRepository extends JpaRepository<Newspost, Long>{

	public Newspost findByPost(String post);
	
	//public List<Newspost> OrderByDate(LocalDate date);
	public List<Newspost> findAllByOrderByDateDesc();
}
