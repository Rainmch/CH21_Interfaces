public class Trapecio  extends  Triangulo implements Calculable{
    private int baseMayor;
    private int lado2;
    private int lado3;
    private int lado4;

    public Trapecio(String name, double base, double altura, double lado, int baseMayor, int lado2, int lado3, int lado4) {
        super(name, base, altura, lado);
        this.baseMayor = baseMayor;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.lado4 = lado4;
    }

    @Override
    public double calcularArea() {
        return (((getBaseMayor() + getBase() )*getAltura() )/2 );
    }

    @Override
    public double calcularPerimetro() {
        return getLado()+getLado2()+getLado3()+getLado4();
    }

    public int getBaseMayor() {
        return baseMayor;
    }

    public void setBaseMayor(int baseMayor) {
        this.baseMayor = baseMayor;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int getLado3() {
        return lado3;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }

    public int getLado4() {
        return lado4;
    }

    public void setLado4(int lado4) {
        this.lado4 = lado4;
    }
}
