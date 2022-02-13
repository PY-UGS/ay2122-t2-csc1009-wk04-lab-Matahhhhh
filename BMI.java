import java.lang.Math;

public class BMI {
    private double weight;
    private double height;
    private double myBMI;

    public BMI(double weight, double height){
        this.weight = weight;
        this.height = height;
    }

    public double getWeight(){
        return weight;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }

    public double calculateBMI(){
        double myBMI = (this.weight*0.45359237)/ Math.pow(this.height * 0.0254,2);
        return myBMI;
    }

    public String categoryBMI() {
        double myBMI = calculateBMI();
        if (myBMI <18.5){
            return ("Underweight");
        }
        else if (18.5 <= myBMI && myBMI < 25.0){
            return ("Normal");
        }
        else if (25.0 <= myBMI && myBMI < 30.0){
            return ("Overweight");
        }
        else{
            return ("Obese");
        }
    }

}
