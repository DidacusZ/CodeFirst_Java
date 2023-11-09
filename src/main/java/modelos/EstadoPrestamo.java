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
@Table(name="Estados_Prestamos")
public class EstadoPrestamo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//id autoincrementables
    @Column(name="id_estado_prestamo", nullable=false)
	private Long id;
	
	@Column(name="codigo_estado_prestamo")
	private String codigoEstadoPrestamo;
	
	@Column(name="descripcion_estado_prestamo")
	private String descripcionEstadoPrestamo;
	
	
	//Estado-Prestamos
	@OneToMany(mappedBy = "estadoPrestamo")
	private List<Prestamo> prestamo;
}