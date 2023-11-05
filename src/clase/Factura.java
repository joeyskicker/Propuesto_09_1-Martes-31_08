package clase;

public class Factura {
	private String ruc, empresa;
	private int unidades;
	private double precio;

	public Factura(String ruc, String empresa, int unidades, double precio) {
		super();
		this.ruc = ruc;
		this.empresa = empresa;
		this.unidades = unidades;
		this.precio = precio;
	}

	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double importeFacturado() {
		return unidades * precio;
	}
}
