import java.lang.Math;

public class BMI {
    private double weight;
    private double height;
    private double myBMI;
    private final static double weight_conversion = 0.45359237 ;
    private final static double height_conversion = 0.0254 ;

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
        double myBMI = (this.weight*weight_conversion)/ Math.pow(this.height * height_conversion,2);
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
