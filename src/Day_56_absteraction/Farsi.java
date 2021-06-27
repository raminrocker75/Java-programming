package Day_56_absteraction;

public class Farsi implements Greeting{
    @Override
    public void hi(){
        System.out.println("درود بر شما");
    }
    @Override
    public void bye(){
        System.out.println("بدرود");
    }
}
