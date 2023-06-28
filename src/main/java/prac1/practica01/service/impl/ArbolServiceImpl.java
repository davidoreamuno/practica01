package prac1.practica01.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import prac1.practica01.dao.ArbolDao;
import prac1.practica01.domain.Arbol;
import prac1.practica01.service.ArbolService;

@Service
public class ArbolServiceImpl implements ArbolService {

    @Autowired
    private ArbolDao arbolDao;

   

    @Transactional(readOnly = true)
    public Arbol getArbol(Arbol arbol) {
        return arbolDao.findById(arbol.getIdArbol()).orElse(null);
    }

    @Transactional
    public void save(Arbol arbol) {
        arbolDao.save(arbol);
    }

    @Transactional
    public void delete(Arbol arbol) {
        arbolDao.delete(arbol);
    }

    @Override
    public List<Arbol> getArboles(boolean Clasificacion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

