public class testFiguras {
	public static void main(String[] args) {
		Triangulo t1 = new  Triangulo("Triángulo t1", 20.0, 10.0, 15.0);
		Triangulo t2 = new  Triangulo("Bermudas", 87.0, 121.0, 101.0);
		// TODO: Aquí se deben instanciar las otras figuras geométricas
		Cuadrado c1 = new Cuadrado("Cuadrado1", 10);
		Cuadrado c2 = new Cuadrado("Cuadrado2", 20);

		Rectangulo r1 = new Rectangulo("Rect1",10,10);
		Rectangulo r2 = new Rectangulo("Rect2",20,30);

		Rombo rombo1 = new Rombo("Rombito", 15, 13, 13);
		Rombo rombo2 = new Rombo("Rombote", 20, 19, 19);

		Romboide romboide1 = new Romboide("Romboide-1", 15,20);
		Romboide romboide2 = new Romboide("Romboide-2", 20,22);

		Trapecio trap1 = new Trapecio("Trape1",10, 15,9,15,9,9,9);
		Trapecio trap2 = new Trapecio("Trape2",15, 10,5,20,5,9,9);

		imprimirCalculo(t1); imprimirCalculo(t2);

		imprimirCalculo(c1); imprimirCalculo(c2);

		imprimirCalculo(r1); imprimirCalculo(r2);

		imprimirCalculo(rombo1); imprimirCalculo(rombo2);

		imprimirCalculo(romboide1); imprimirCalculo(romboide2);

		imprimirCalculo(trap1); imprimirCalculo(trap2);
		
		// TODO: Aquí se debe probar cada figura con el método imprimirCalculo
		
	}//main

	public static void imprimirCalculo(Calculable t) {
		System.out.println(t);
		System.out.println("+========================================");
		System.out.println("|El área de ["+t.getName()+"] es: " + t.calcularArea() + 
				"\n" + "|El perímetro de ["+t.getName()+"] es: " + t.calcularPerimetro());
		System.out.println("+========================================");
	}//imprimirCalculo
}//class testFiguras