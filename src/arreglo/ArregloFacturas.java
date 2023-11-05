package arreglo;

import java.util.ArrayList;
import clase.Factura;

public class ArregloFacturas {
	ArrayList<Factura>  fac;
	
	public ArregloFacturas(){
		fac = new ArrayList<Factura>();
		fac.add(new Factura("46465654654", "Tambo", 10, 32.6));
		fac.add(new Factura("54687946544", "Oxxo", 7, 21.5));
		fac.add(new Factura("54646464645", "Shell", 3, 11.0));
	}
	
	//  Operaciones públicas básicas
	public void adicionar(Factura x) {
		fac.add(x);
	}
	public int tamanio() {
		return fac.size();
	}
	public Factura obtener(int i) {
		return fac.get(i);
	}
	
	//  Operaciones públicas complementarias
	public double sumaImportes(){
		double suma = 0;
		for(int i=0;i<tamanio();i++){
			suma += obtener(i).importeFacturado();
		}
		return suma;
	}
	public double promedioImportes(){
		return sumaImportes()/tamanio();
	}
	public double importeMenor(){
		double menor = obtener(0).importeFacturado();
		for(int i=1; i<tamanio(); i++){
			if(menor > obtener(i).importeFacturado()){
				menor = obtener(i).importeFacturado();
			}
		}
		return menor;
	}
	public double importeMayor(){
		double mayor = 0;
		for(int i=0; i<tamanio(); i++){
			if(mayor < obtener(i).importeFacturado()){
				mayor = obtener(i).importeFacturado();
			}
		}
		return mayor;
	}
	public String primeraEmpresaImpMenor(){
		String nombre = null;
		for(int i=1; i<tamanio(); i++){
			if(obtener(i).importeFacturado() < promedioImportes()){
				nombre = obtener(i).getEmpresa();
			}
		}
		return  nombre;
	}
}
