package tarefa_m15.factory;

public abstract class Car {

    private String modelo;
    private int horsePower;
    private int maxSpeed;
    private double price;

    public Car(String modelo, int horsePower, int maxSpeed, double price) {
        this.modelo = modelo;
        this.horsePower = horsePower;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void startEngine() {
        System.out.println("O motor deu partida");
    }

    public void clean() {
        System.out.println("Agora o carro está limpo.");
    }

    @Override
    public String toString() {
        return "Car{" +
                "modelo='" + modelo + '\'' +
                ", horsePower=" + horsePower +
                ", maxSpeed=" + maxSpeed +
                ", price=" + price +
                '}';
    }
}
