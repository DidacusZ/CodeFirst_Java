package modelos;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Libros")
public class Libro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//id autoincrementables
    @Column(name="id_libro", nullable=false)
	private Long id;
	
	@Column(name="isbn_libro")
	private String isbnLibro;
	
	@Column(name="titulo_libro")
	private String tituloLibro;
	
	@Column(name="edicion_libro")
	private String edicionLibro;
	
	@Column(name="cantidad_libro")
	private int cantidadLibro;	
	
	
	//RELACIONES
	
	//Libros-Genero
	@ManyToOne
    @JoinColumn(name = "id_genero")
    private Genero genero;
	
	//Libros-Editorial
	@ManyToOne
	@JoinColumn(name = "id_editorial")
	private Editorial editorial;
	
	//Libros-Editorial
	@ManyToOne
	@JoinColumn(name = "id_coleccion")
	private Coleccion coleccion;
	
	
	
	//Libros-Autores
	@ManyToMany(mappedBy = "libros")
    private List<Autor> autores;
	
	//Libros-Prestamos
	@ManyToMany(mappedBy = "libros")
	private List<Prestamo> prestamos;    
}
