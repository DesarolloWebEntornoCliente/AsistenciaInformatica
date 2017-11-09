package es.altair.hibernate.bean;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tecnicos")
public class Tecnico implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idTecnico;
	private String compania;
	private String nombre;
	private String telefono; 
	private String correo;
	
	// asociación 1:N desde la tabla tecnicos a la tabla asistencias	@OneToMany(mappedBy="grupos")
	@OneToMany(mappedBy = "tecnico")
	private Set<Asistencia> asistencias = new HashSet<Asistencia>();
	
	
	public Tecnico() {
		super();
	}
	public Tecnico(String compania, String nombre, String telefono, String correo) {
		super();
		this.compania = compania;
		this.nombre = nombre;
		this.telefono = telefono;
		this.correo = correo;
	}
	public int getIdTecnico() {
		return idTecnico;
	}
	public void setIdTecnico(int idTecnico) {
		this.idTecnico = idTecnico;
	}
	public String getCompania() {
		return compania;
	}
	public void setCompania(String compania) {
		this.compania = compania;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public Set<Asistencia> getAsistencias() {
		return asistencias;
	}
	public void setAsistencias(Set<Asistencia> asistencias) {
		this.asistencias = asistencias;
	}
	
	
	
}
