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
@Table(name="Generos")
public class Genero {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//id autoincrementables
    @Column(name="id_genero", nullable=false)
	private Long id;
	
	@Column(name="nombre_genero")
	private String nombreGenero;
	
	@Column(name="descripcion_genero")
	private String descripcionGenero;
	
		
	//Genero-Libros
	@OneToMany(mappedBy = "genero")
    private List<Libro> libros;

}
