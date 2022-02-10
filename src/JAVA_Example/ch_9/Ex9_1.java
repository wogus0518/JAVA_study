package JAVA_Example.ch_9;

class Value{
    int value;

    Value(){}
    Value(int value){ this.value = value; }

    @Override
    public boolean equals(Object obj){
        //Object 리모콘으로는 value에 접근할 수 없으니까 형변환을 해준다.
        if(!(obj instanceof Value)) return false;
        Value v = (Value) obj;

        return this.value == v.value;
    }

    @Override
    public String toString(){
        return "value : " + this.value;
    }
}
public class Ex9_1 {
    public static void main(String[] args) {
        Value v1 = new Value(10);
        Value v2 = new Value(10);

        String msg = (v1.equals(v2)) ? "같습니다." : "다릅니다.";

        System.out.println("v 1과 v2는 " + msg);
        System.out.println(v1.toString());
    }
}
