public class Rectangulo extends Cuadrado implements Calculable{

    private int altura;

    public Rectangulo(String name, int base, int altura) {
        super(name, base);
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "altura=" + altura +
                "} " + super.toString();
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return getBase() * getAltura();
    }

    @Override
    public double calcularPerimetro() {
        return (2*getBase()) + (2*getAltura());
    }
}
