package hello.core.sington;


public class SingletonService {

    //자기자신을 내부에 private로 선언한다. 단 하나만 생성된다.
    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance() {
        return instance;
    }

    //private 생성자를 통해 new를 통한 객체 생성을 막는다.
    private SingletonService() {}
    
    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}