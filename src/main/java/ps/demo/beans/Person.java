package ps.demo.beans;

import java.util.List;

public class Person {
    private String name;
    private int age;
    private List<Car> carList = null;

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        String baseInfo = String.format("name is [%s], age is [%d]", this.getName(),this.getAge());
        if(this.getCarList() != null && this.getCarList().size() > 0){
            String carInfo = "";
            for(Car c : this.getCarList()){
                carInfo += String.format("car name: [%s], pailiang: [%f]", c.getName(), c.getPailiang());
                carInfo += "\r\n";
            }
            baseInfo += "\r\n" + carInfo;
        }
        return baseInfo;
    }

}
