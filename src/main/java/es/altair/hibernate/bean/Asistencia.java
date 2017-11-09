package es.altair.hibernate.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
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

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name="asistenciasV1")
public class Asistencia implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idAsistencia;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="idTecnico")
	private Tecnico tecnico;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="idEquipo")
	private Equipo equipo;
	
	@Temporal(TemporalType.DATE)
	private Date fecha_hora;
	
	private String motivo;

	public Asistencia() {
		super();
	}

	public Asistencia(Tecnico tecnico, Equipo equipo, Date fecha_registro, String motivo) {
		super();
		this.tecnico = tecnico;
		this.equipo = equipo;
		this.fecha_hora = fecha_registro;
		this.motivo = motivo;
	}

	public int getIdAsistencia() {
		return idAsistencia;
	}

	public void setIdAsistencia(int idAsistencia) {
		this.idAsistencia = idAsistencia;
	}

	public Tecnico getTecnico() {
		return tecnico;
	}

	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}

	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	public Date getFecha_registro() {
		return fecha_hora;
	}

	public void setFecha_registro(Date fecha_registro) {
		this.fecha_hora = fecha_registro;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	
	
	
}
