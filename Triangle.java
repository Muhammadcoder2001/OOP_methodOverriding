package OOP_overriding;

public class Triangle extends GeometricFigure {
    private  int a;
    private int b;
    private int c;
    private double per;

    public Triangle(int a, int b, int c){
    this.a = a;
    this.b = b;
    this.c = c;

    }
    @Override
    public void perimetr(){
        super.perimetr();
        double per = this.a + this.b + this.c;
        this.per = per;
        System.out.println("Perimetr : " + this.per);

    }
    @Override
    public  void area(){
        super.area();
        double area = Math.sqrt(per * (per - this.a)* (per - this.b)* (per - this.c));
        System.out.println("Area of Triangle is equal to " + area);
    }
    public static void main(String[] args) {
        GeometricFigure triangle = new Triangle(2, 3, 6);
        triangle.perimetr();
        triangle.area();
    }
}
