package JAVA_Example.Ch_12;

enum Direction { EAST, SOUTH, WEST, NORTH }
enum Vertical { UP, DOWN }

public class Ex12_5 {
    public static void main(String[] args) {
        Direction d1 = Direction.EAST;
        Direction d2 = Direction.valueOf("WEST"); // 문자열로
        Direction d3 = Enum.valueOf(Direction.class, "EAST");

        Vertical v1 = Vertical.DOWN;
        Vertical v2 = Vertical.valueOf("UP");

        System.out.println("d1="+d1);
        System.out.println("d2="+d2);
        System.out.println("d3="+d3);

        System.out.println("d1==d2 ? " + (d1==d2));
        System.out.println("d1==d3 ? " + (d1==d3));
//        System.out.println("d1==v1 ? " + (d1==v1)); // 에러! incomparable types
        System.out.println("d1.equals(d3) ? " + d1.equals(d3));
        System.out.println("d1.equals(v1) ? " + d1.equals(v1));
        System.out.println("d1.compareTo(d3) ? " + d1.compareTo(d3));
        System.out.println("d2.compareTo(d3) ? " + d2.compareTo(d3));
//        System.out.println("d1.compareTo(v1) ? " + d1.compareTo(v1)); // 에러! incomparable types

        switch (d1) {
            case EAST : System.out.println("EAST"); break;
            case SOUTH : System.out.println("SOUTH"); break;
            case WEST : System.out.println("WEST"); break;
            case NORTH : System.out.println("NORTH"); break;
        }

        Direction[] dirArr = Direction.values();
        for(Direction d : dirArr) {
            System.out.printf("%s=%d%n", d.name(), d.ordinal());
        }
    }
}
