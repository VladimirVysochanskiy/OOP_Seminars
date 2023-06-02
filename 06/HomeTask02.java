// 2) Переписать код SpeedCalculation в соответствии с Open-Closed Principle:
// Подсказка: создайте два дополнительных класса Car и Bus(наследников Vehicle), 
// напишите метод calculateAllowedSpeed(). Использование этого метода позволит сделать 
// класс SpeedCalculation соответствующим OCP

public class HomeTask02 {
    public static void main(String[] args) {
                
    }
}

public class SpeedCalculation {
    public double calculateAllowedSpeed(Vehicle vehicle) {
        return vehicle.getMaxSpeed() * vehicle.getSpeedRatio();
    }
}

public class Vehicle {
    int maxSpeed;
    String type;
    Double speedRatio = 1.0;

    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public String getType() {
        return this.type;
    }

    public Double getSpeedRatio() {
        return speedRatio;
    }
}

public class Car extends Vehicle {
    
    public Car(int maxSpeed, String type) {
        super(maxSpeed, type);
    }

    @Override
    public Double getSpeedRatio() {
        return speedRatio * 0.8;
    }

}

public class Bus extends Vehicle {
    
    public Bus(int maxSpeed, String type) {
        super(maxSpeed, type);
    }

    @Override
    public Double getSpeedRatio() {
        return speedRatio * 0.6;
    }

}