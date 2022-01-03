import java.util.ArrayList;

public class if_gm{
    public static void main(String[] args){
        boolean hasCard = true;
        ArrayList<String> pocket = new ArrayList<>();
        pocket.add("headphone");
        pocket.add("paper");

        if (pocket.contains("money")) {
            System.out.println("ride taxi");
        } else if(hasCard) {
            System.out.println("ride taxi");
        } else {
            System.out.println("walk");
        }
    }
}