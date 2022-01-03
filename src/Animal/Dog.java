package Animal;

public class Dog extends Animal{  // 부모 Animal => 자식 Dog 상속
    public void sleep() {       // 부모 클래스의 기능을 확장
        System.out.println("ZZZ");
    }
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "cherry";
        System.out.println(dog.name);
        dog.sleep();

        Animal dog2 = new Dog();  // IS-A 관계
        dog2.setName("jerry");
        System.out.println(dog2.name);
    }
}
