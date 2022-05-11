package vehiculos;

import java.util.ArrayList;

public class Pais {
	private String nombre;
	private static ArrayList<Pais> paises = new ArrayList<Pais>();
	private ArrayList<Fabricante> fabricasPorPais = new ArrayList<Fabricante>();

	public Pais(String nombre) {
		this.nombre = nombre;
		paises.add(this);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void anadirFabrica(Fabricante i) {
		fabricasPorPais.add(i);
	}
	
	private int totalUnidades() {
		int total = fabricasPorPais.stream().mapToInt(a -> a.getCantidadVehiculos()).sum();
		return total;
	}
	
	public static Pais paisMasVendedor() {
		Pais p1 = paises.get(0);
		for (Pais i:paises) {
			if (i.totalUnidades() > p1.totalUnidades()) {
				p1 = i;
			}			
		}
		return p1;
	}
}
