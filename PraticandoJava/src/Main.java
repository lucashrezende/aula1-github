import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String args[]) {

		Retangulo retangulo = new Retangulo();
		retangulo.setNomeFigura("Retângulo");
		retangulo.setBase(10);
		retangulo.setAltura(20);
		
		Triangulo triangulo = new Triangulo();
		triangulo.setNomeFigura("Triângulo");
		triangulo.setBase(10);
		triangulo.setAltura(20);
		
		Circulo circulo = new Circulo();
		circulo.setNomeFigura("Círculo");
		circulo.setRaio(2);
		
		List<FiguraGeometrica> listaFigurasGeometricas = new ArrayList<>();
		listaFigurasGeometricas.add(retangulo);
		listaFigurasGeometricas.add(triangulo);
		listaFigurasGeometricas.add(circulo);

		for(FiguraGeometrica figuraGeometrica : listaFigurasGeometricas) {
			System.out.println(figuraGeometrica.getDescricao());
			System.out.printf( "Area da figura: %.2f \n\n", figuraGeometrica.getArea());
		}
		
	}
}