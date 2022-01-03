public class Animal {
        String name;                // 객체 변수

        public void setName(String name){
            this.name = name;      // 이 메소드를 호출한 객체가 this가 된다.
        }


    public static void main(String[] args) {
        Animal cat = new Animal();      // cat은 객체(object)이다. == cat은 Animal의 인스턴스이다.
        System.out.println(cat.name);
        cat.setName("jenny");       // setName() 메소드를 cat 객체가 호출한다.
        System.out.println(cat.name);

        Animal dog = new Animal();
        dog.setName("jae");
        dog.name = "dafsdf";
        System.out.println(dog.name);

    }
}
