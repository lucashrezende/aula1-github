public abstract class FiguraGeometrica {
	private String nomeFigura;

	abstract public double getArea();

	abstract public String getDescricao();

	public String getNomeFigura() {
		return nomeFigura;
	}

	public void setNomeFigura(String nomeFigura) {
		this.nomeFigura = nomeFigura;
	}
}
