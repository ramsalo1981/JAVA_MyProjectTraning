import java.util.Objects;

public class Car {
    private String Maker;
    private int Model;

    public Car(){


    }
    public Car(String maker , int model){
        if (!Objects.equals(maker, "Honda") && !Objects.equals(maker, "Ford")) {
            throw new IllegalArgumentException("Invalid maker");
        }
        if (model <= 2010) {
            throw new IllegalArgumentException("Invalid model");
        }
        this.Maker = maker;
        this.Model = model;

    }
    public void setMaker(String maker) {
        if(Objects.equals(maker, "Honda") || Objects.equals(maker, "Ford")){
            Maker = maker;
        }
        else
            System.out.println("Invalid Maker");

    }

    public void setModel(int model) {
        if(model > 2010){
            Model = model;
        }
        else {
            System.out.println("Invalid model");
        }
    }

    public String getMaker() {
        return Maker;
    }

    public int getModel() {
        return Model;
    }
    public void modifyCar(Car c){
        c.Maker = "Honda";
        c.Model = 2019;
    }
}
