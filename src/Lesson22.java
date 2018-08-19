public class Lesson22 {
    public static void main(String[] args) {
        System.out.println(Test.CONSTANT);
        final int x =10;
        System.out.println(x);
    }
}
class Test{
    public static final int CONSTANT =1000;

}