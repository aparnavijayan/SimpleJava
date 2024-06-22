public class SingleTon {
    public static SingleTon instane;

    private SingleTon(){

    }
    public static SingleTon getInstane() {
        if(null==instane)
        {
            instane = new SingleTon();

        }
        return instane;
    }

    public void SingleTonMethod() {
        System.out.println("Hello singleton");
    }
}
