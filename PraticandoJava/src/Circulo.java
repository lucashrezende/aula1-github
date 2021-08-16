public class Circulo extends FiguraGeometrica {
	private double raio;

	@Override
	public double getArea() {
		return 3.14 * getRaio() * getRaio();
	}

	@Override
	public String getDescricao() {
		String texto = "Dados do " + getNomeFigura() + "\nRaio: " + getRaio();
		return texto;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
}
