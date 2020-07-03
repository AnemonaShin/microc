package cl.microc.microc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.microc.microc.model.perfil;

@Repository
public interface pRepo extends JpaRepository<perfil, Integer>{
    
}