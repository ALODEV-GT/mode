package gt.com.arcada;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Integer[] input = {1,2,3,4,2,6,6,8};
        var result = new Mode().getResult(input);
        System.out.println(result);
    }
}
