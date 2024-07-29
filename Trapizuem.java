package OOP_overriding;

public class Trapizuem extends GeometricFigure{
    private int sideA;
    private int sideB;
//    private int mainA;
//    private int mainB;
    private int high;
    private double per;

    public Trapizuem(int sideA, int sideB,  int high){
        this.sideA = sideA;
        this.sideB = sideB;
        this.high = high;

    }

    public void  perimetr(){
        this.per = (this.sideA * 2) + (this.sideB * 2);
        System.out.println("Perimetr of the Trapizuem is equal to " + this.per);
    }

    public void area (){
        double S =( double) 1/2 * (this.sideA + this.high) * this.high;
        System.out.println("Area of the Trapizuem is equal to " + S);
    }

    public static void main(String[] args) {
        Trapizuem trapetsiya = new Trapizuem(12, 8, 4);

        trapetsiya.perimetr();
        trapetsiya.area();

    }
}
