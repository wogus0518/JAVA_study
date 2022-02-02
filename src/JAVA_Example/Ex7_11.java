package JAVA_Example;

class Point {
    static int r = 10;
    int x, y;

    Point(){}
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class Point3D extends Point{
    int z;
//    Point3D(){}
//    Point3D(int x, int y, int z){
//        this.x = x;
//        this.y = y;
//        this.z = z;
//    }
}
public class Ex7_11 {
    public static void main(String[] args) {
        Point p = new Point(1,2);
        System.out.println(p.x);
        Point3D p3 = new Point3D();
        p.x = 2;
        System.out.println(p3.r);

//        System.out.println(p3.x);

    }

}
