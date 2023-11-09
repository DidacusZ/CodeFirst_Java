package modelos;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Usuarios")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//id autoincrementables
    @Column(name="id_usuario", nullable=false)
	private Long id;
	
	@Column(name="dni_usuario")
	private String dniUsuario;
	
	@Column(name="nombre_usuario")
	private String nombreUsuario;
	
	@Column(name="apellidos_usuario")
	private String apellidosUsuario;
	
	@Column(name="tlf_usuario")
	private String tlfUsuario;
	
	@Column(name="email_usuario")
	private String emailUsuario;
	
	@Column(name="clave_usuario")
	private String claveUsuario;
	
	@Column(name="estaBloqueado_usuario")
	private boolean estaBloqueado_usuario;
	
	@Column(name="fch_fin_bloqueo_usuario")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar fchFinBloqueo;
	
	@Column(name="fch_alta_usuario")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar fchAltaUsuario;
	
	@Column(name="fch_baja_usuario")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar fchBajaUsuario;
	
	
	//Usuario-Prestamos
	@OneToMany(mappedBy = "usuario")
	private List<Prestamo> prestamos;
	
	//Usuarios-Acceso
	@ManyToOne
    @JoinColumn(name = "id_acceso")
    private Usuario usuario;	
}
