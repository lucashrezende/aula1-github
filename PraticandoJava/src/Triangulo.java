public class Triangulo extends FiguraGeometrica {
	private double base;
	private double altura;

	@Override
	public double getArea() {
		return (getBase() * getAltura()) / 2;
	}

	@Override
	public String getDescricao() {
		String texto = "Dados do " + getNomeFigura() + "\nAltura: " + getAltura() + "\tBase: " + getBase();
		return texto;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

}
