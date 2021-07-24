package hello.core.order;

public interface OrderService {
    /*
    * 주문생성
    * 1. 회원 id
    * 2. 상품명
    * 3. 상품 가격
    * */
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
