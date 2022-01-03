public class switch_case_gm {
    public static void main(String[] args){
        int month = 1;
        String monthString = "";
        switch (month) {
            case 1: monthString = "Jan";
                    break;
            case 2: monthString = "Feb";
                    break;
            case 3: monthString = "Mar";
                    break;
            case 4: monthString = "Apr";
                    break;
            case 5: monthString = "May";
                    break;
        }
        System.out.println(monthString);
    }
}
