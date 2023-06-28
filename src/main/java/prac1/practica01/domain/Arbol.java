package prac1.practica01.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="Arbol")
public class Arbol implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_Abol")
    private Long idArbol;
    private String Nombre_Arbol;
    private String Imaggen;
    private String Clasificacion;

    public Arbol() {
    }

    public Arbol(String categoria, boolean activo) {
        this.Nombre_Arbol = Nombre_Arbol;
        this.Clasificacion = Clasificacion;
    }
}