public class Cuadrado implements Calculable{
    private String name;
    private int base;

    public Cuadrado(String name, int lado) {
        this.name = name;
        this.base = lado;
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "name='" + name + '\'' +
                ", base=" + base +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int lado) {
        this.base = lado;
    }
    public double calcularArea(){
        return (getBase() * getBase());
    }
    public double calcularPerimetro(){
        return getBase() * 4;
    }
}
