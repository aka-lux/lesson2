package oopExamples;

public class Car {
   private String carName;  //строка название машини
   private int maxSpeed; //число максимальная скорость
   private int carWeight; // вес машины
   private CarColors color; //цвет машины
   private double loading; // грузоподемность машины, дробное число

    // т.н. конструктор со всеми аргументами, необходим для создания экземплаяра класа Car
    public Car(String carName, int maxSpeed, int carWeight, CarColors color, double loading) {
        this.carName = carName;
        this.maxSpeed = maxSpeed;
        this.carWeight = carWeight;
        this.color = color;
        this.loading = loading;
    }

    // еще один конструктор, заоплняет только имя остальные поля null
    public Car(String carName) {
        this.carName = carName;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", carWeight=" + carWeight +
                ", color=" + color +
                ", loading=" + loading +
                '}';
    }
}
