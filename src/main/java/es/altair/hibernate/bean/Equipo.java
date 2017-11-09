package es.altair.hibernate.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="equiposInformaticos")
public class Equipo implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idEquipo;
	private String fabricante;
	private String ubicacion;

	@Temporal(TemporalType.DATE)
	private Date fecha_compra;
	private double precio_compra;
	
	// asociación 1:N desde la tabla equiposInformaticos a la tabla asistencias
	@OneToMany(mappedBy="equipo")
	private Set<Asistencia> asistencias = new HashSet<Asistencia>();

	public Equipo() {
		super();
	}



	public Equipo(String fabricante, String ubicacion, Date fecha_compra, double precio_compra) {
		super();
		this.fabricante = fabricante;
		this.ubicacion = ubicacion;
		this.fecha_compra = fecha_compra;
		this.precio_compra = precio_compra;
	}



	public int getIdEquipo() {
		return idEquipo;
	}

	public void setIdEquipo(int idEquipo) {
		this.idEquipo = idEquipo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public Date getFecha_compra() {
		return fecha_compra;
	}

	public void setFecha_compra(Date fecha_compra) {
		this.fecha_compra = fecha_compra;
	}

	public double getPrecio_compra() {
		return precio_compra;
	}

	public void setPrecio_compra(double precio_compra) {
		this.precio_compra = precio_compra;
	}

	public Set<Asistencia> getAsistencias() {
		return asistencias;
	}

	public void setAsistencias(Set<Asistencia> asistencias) {
		this.asistencias = asistencias;
	}
	
	
	
	

}
