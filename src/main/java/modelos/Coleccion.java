package modelos;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Colecciones")
public class Coleccion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//id autoincrementables
    @Column(name="id_coleccion", nullable=false)
	private Long id;
	
	@Column(name="nombre_coleccion")
	private String nombreColeccion;
	
	
	//Coleccion-Libros
	@OneToMany(mappedBy = "coleccion")
	private List<Libro> libros;
}
