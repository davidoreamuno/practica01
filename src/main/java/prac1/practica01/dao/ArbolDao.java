package prac1.practica01.dao;

import prac1.practica01.domain.Arbol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArbolDao extends JpaRepository <Arbol,Long> {
    
}
