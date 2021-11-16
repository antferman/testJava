package trabajo.examen.streams;

import java.time.LocalDate;
import java.util.List;

public class Vuelo {

	private Integer id;
	private String codigo;
	private Aeropuerto origen;
	private Aeropuerto destino;
	private LocalDate fecha;
	private Integer plazas;
	private List<Billete> billetes;
	
	public Vuelo() {
		
	}
	
	public Vuelo(Integer id, String codigo, Aeropuerto origen, Aeropuerto destino, LocalDate fecha, Integer plazas ,List<Billete> billetes) {
		this.id = id;
		this.codigo = codigo;
		this.origen = origen;
		this.destino = destino;
		this.fecha = fecha;
		this.plazas = plazas;
		this.billetes = billetes;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Aeropuerto getOrigen() {
		return origen;
	}
	public void setOrigen(Aeropuerto origen) {
		this.origen = origen;
	}
	public Aeropuerto getDestino() {
		return destino;
	}
	public void setDestino(Aeropuerto destino) {
		this.destino = destino;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public Integer getPlazas() {
		return plazas;
	}
	public void setPlazas(Integer plazas) {
		this.plazas = plazas;
	}
	public List<Billete> getBilletes(){
		return billetes;
	}
	public void setBilletes (List<Billete> billete) {
		this.billetes = billetes;
	}
	@Override
	public String toString() {
		return "Vuelo [id=" + id + ", codigo=" + codigo + ", origen=" + origen + ", destino=" + destino + ", fecha="
				+ fecha + ", plazas=" + plazas + "]";
	}
	
	
}
