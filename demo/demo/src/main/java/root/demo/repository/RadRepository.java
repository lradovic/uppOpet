package root.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import root.demo.model.Rad;

@Repository
public interface RadRepository extends JpaRepository<Rad,Long> {
	
	public Rad findByNaslovRada(String naslovRada);

}
