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
@Table(name="Editoriales")
public class Editorial {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//id autoincrementables
    @Column(name="id_editorial", nullable=false)
	private Long id;
	
	@Column(name="nombre_editorial")
	private String nombreEditorial;	
	
	
	//Editorial-Libros
	@OneToMany(mappedBy = "editorial")
	private List<Libro> libros;
}
