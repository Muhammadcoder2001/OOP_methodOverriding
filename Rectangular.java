package OOP_overriding;

public class Rectangular extends  GeometricFigure{

    private int sideA;
    private int sideB;
    private double per;

    public Rectangular(int sideA, int sideB){
        this.sideA = sideA;
        this.sideB = sideB;

    }

    public  void perimetr(){
        this.per = 2 * (this.sideA + this.sideB);
        System.out.println("Perimetr of Rectangular is equal to " + this.per);
    }

    public void area(){
        double S = this.sideA * this.sideB;
        System.out.println("Area of the Rectangular is equal to " + S);
    }

    public static void main(String[] args) {
        Rectangular rectangular = new Rectangular(4, 7);
        rectangular.perimetr();
        rectangular.area();

    }
}