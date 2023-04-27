public class Romboide  extends Rectangulo implements Calculable{
    public Romboide(String name, int base, int altura) {
        super(name, base, altura);
    }

    @Override
    public String toString() {
        return "Romboide{} " + super.toString();
    }
}
