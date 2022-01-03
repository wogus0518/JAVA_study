
// 파일명과 같은 클래스명 앞에 public을 붙여주고 이게 핵심 클래스라는 것을 의미
public class GuGu {

    // public: method에 접근 할 수 있는 접근제어자, 어디서든지 호출이 가능하다는 뜻
    public void printGugudan(int num){
        for (int i=1; i<10; i++){
            System.out.println(i*num);
        }
    }

    public static void main(String[] args){
        int num = 2;

        // printGugudan method를 호출하기 위해서는 main method에서 호출 해야 한다.
        // 왜냐하면 GuGu클래스는 반드시 main 메소드부터 시작하기 때문에

        // printGugudan method를 호출하기 위한 순서
        // GuGu 클래스의 객체를 먼저 생성한 후에 그 객체의 printGugudan 메소드를 호출한다.
        GuGu gugu = new GuGu(); // 근데 static 메소드라면 이 부분을 생략하고 printGugudan()으로 바로 사용가능

        for (int i=2; i<10; i++){
            gugu.printGugudan(i);
        }

    }
}
