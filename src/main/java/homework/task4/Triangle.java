package homework.task4;

public class Triangle extends Shape{

    private final double sideAB, sideBC, sideCA;

    public Triangle(Point A, Point B, Point C) {
        super(new Point[] {
                new Point (A.x,A.y),
                new Point(B.x,B.y),
                new Point(C.x,C.y)
        });
        this.sideAB = sideDistance(A, B);
        this.sideBC = sideDistance(B, C);
        this.sideCA = sideDistance(C, A);
    }

    public double sideDistance (Point A, Point B){
        return Math.sqrt(Math.pow((B.x - A.x), 2) + Math.pow((B.y - A.y), 2));
    }

    public double getPerimeter (){
        return sideAB+sideBC+sideCA;
    }

    @Override
    double area() {
        double s = getPerimeter()/2;
        // Heron's formula:
        // A = SquareRoot(s * (s - a) * (s - b) * (s - c))
        // where s = (a + b + c) / 2, or 1/2 of the perimeter of the triangle
        return Math.sqrt(s * (s-sideAB) * (s-sideBC) * (s-sideCA));
    }

    public boolean isScalene () {  // różnoboczny
        if ((sideAB != sideBC) && (sideAB != sideCA) && (sideBC != sideCA))
            return true;
        else
            return false;
    }

    public boolean isIscosceles () {  // równoramienny
        if (((sideAB == sideBC) && (sideAB != sideBC)) ||
                ((sideAB == sideCA) && (sideAB != sideBC)) ||
                ((sideBC == sideCA) && (sideBC != sideAB)))
            return true;
        else
            return false;
    }

        public boolean isEquilateral () {  // równoboczny
            if ((sideAB == sideBC) && (sideAB == sideCA))
                return true;
            else
                return false;
    }
}
