package modelos;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name="Autores")
public class Autor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//id autoincrementables
    @Column(name="id_autor", nullable=false)
	private Long id;
	
	@Column(name="nombre_autor")//,columnDefinition="VARCHAR(255) DEFAULT NULL FIRST"
	private String nombreoAutor;
	
	@Column(name="apellidos_autor")
	private String apellidosAutor;
	
		
	@ManyToMany
    @JoinTable(
        name = "Rel_Autores_Libros",
        joinColumns = @JoinColumn(name = "id_autor"),//esta entidad/tabla
        inverseJoinColumns = @JoinColumn(name = "id_libro")//la otra tabla
    )
    private List<Libro> libros;
    
}
