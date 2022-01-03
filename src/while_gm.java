public class while_gm {
    public static void main(String[] args){
        int treeHit = 0;
        while (treeHit<10) {
            treeHit++;
            System.out.println(String.format("나무 찍은 횟수: %d번", treeHit));
            if(treeHit==10){
                System.out.println("나무 넘어간다.");
            }
        }

//        while(true){
//            System.out.println("무한 루프");
//        }
        int i = 0;
        while(i<10){
            i++;
            if(i%2 == 0){
                continue;
            }
            System.out.println(i);
        }


    }
}
