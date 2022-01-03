package Animal;

public class HouseDog extends Dog {
    // 생성자 설정
    public HouseDog(String name){
        this.setName(name);
    }

    // 메소드 오버라이딩
    public void sleep(){
        System.out.println(this.name+" zzz in house ");
    }

    // 메소드 오버로딩
    // 같은 이름이지만 입력항목이 다르기 때문에 가능
    public void sleep(int hour) {
        System.out.println(this.name+" zzz in house for "+hour+"hours");
    }
    public static void main(String[] args) {
        HouseDog dog = new HouseDog("berry");
        dog.setName("berry");
        dog.sleep();
        dog.sleep(4);
    }
}
