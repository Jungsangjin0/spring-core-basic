package hello.core.sington;

public class StatefulService {

//    private int price; //상태를 유지하는 필드 10000원이 -> 20000원이 됨.

    public int order(String name, int price) {
        System.out.println("name = " + name + " price = " + price);
//        this.price = price; //여기가 문제!
        return price;
    }

//    public int getPrice() {
//        return this.price;
//    }

}
