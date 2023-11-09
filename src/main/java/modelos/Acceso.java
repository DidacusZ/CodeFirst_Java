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
@Table(name="Accesos")
public class Acceso {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//id autoincrementables
    @Column(name="id_acceso", nullable=false)
	private Long id;
	
	@Column(name="codigo_acceso")
	private String codigoAcceso;	
	
	@Column(name="descripcion_acceso")
	private String descripcionAcceso;	
	
	
	//Acceso-Usuarios
	@OneToMany(mappedBy = "usuario")
	private List<Usuario> usuario;
}
