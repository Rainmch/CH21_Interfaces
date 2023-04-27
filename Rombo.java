public class Rombo extends Cuadrado implements Calculable{
    private int diagMenor;
    private int diagMayor;

    public Rombo(String name, int lado, int diagMenor, int diagMayor) {
        super(name, lado);
        this.diagMenor = diagMenor;
        this.diagMayor = diagMayor;
    }

    @Override
    public String toString() {
        return "Rombo{" +
                "diagMenor=" + diagMenor +
                ", diagMayor=" + diagMayor +
                "} " + super.toString();
    }

    @Override
    public double calcularArea() {
        return (getDiagMayor() * getDiagMenor())/2f;
    }


    public int getDiagMenor() {
        return diagMenor;
    }

    public void setDiagMenor(int diagMenor) {
        this.diagMenor = diagMenor;
    }

    public int getDiagMayor() {
        return diagMayor;
    }

    public void setDiagMayor(int diagMayor) {
        this.diagMayor = diagMayor;
    }

}
