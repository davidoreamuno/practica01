package prac1.practica01.service;

import prac1.practica01.domain.Arbol;
import java.util.List;

public interface ArbolService {
    
    List<Arbol> getArboles(boolean Clasificacion);
    
    Arbol getArbol(Arbol arbol);
    
    void save(Arbol arbol);
    
    void delete(Arbol arbol);
}