package modelos;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Prestamos")
public class Prestamo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//id autoincrementables
    @Column(name="id_prestamo", nullable=false)
	private Long id;
	
	@Column(name="fch_inicio_prestamo")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar fchInicioPrestamo;
	
	@Column(name="fch_fin_prestamo")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar fchFinPrestamo;
	
	@Column(name="fch_entrega_prestamo")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar fchEntregaPrestamo;

	
	
	//Prestamos-Estado
	@ManyToOne
    @JoinColumn(name = "id_estado_prestamo")
    private EstadoPrestamo estadoPrestamo;
	
	//Prestamos-Usuario
	@ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;	
	
	//Prestamos-Libros
	@ManyToMany
    @JoinTable(
        name = "Rel_Prestamos_Libros",
        joinColumns = @JoinColumn(name = "id_prestamo"),//esta entidad/tabla
        inverseJoinColumns = @JoinColumn(name = "id_autor")//la otra tabla
    )
    private List<Libro> libros;
	
}
