package OOP_overriding;

public class Rectangular extends  GeometricFigure{

    private int sideA;
    private int sideB;
    private double per;

    public Rectangular(int sideA, int sideB){
        this.sideA = sideA;
        this.sideB = sideB;

    }
    @Override
    public  void perimetr(){
        super.perimetr();
        this.per = 2 * (this.sideA + this.sideB);
        System.out.println("Perimetr of Rectangular is equal to " + this.per);
    }
    @Override
    public void area(){
        super.area();
        double S = this.sideA * this.sideB;
        System.out.println("Area of the Rectangular is equal to " + S);
    }

    public static void main(String[] args) {
        Rectangular rectangular = new Rectangular(4, 7);
        rectangular.perimetr();
        rectangular.area();

    }
}