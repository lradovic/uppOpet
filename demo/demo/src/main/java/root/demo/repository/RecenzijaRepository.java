package root.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import root.demo.model.*;

@Repository
public interface RecenzijaRepository extends JpaRepository<Recenzija,Long> {
	
	List<Recenzija> findByRad(String rad);
}

