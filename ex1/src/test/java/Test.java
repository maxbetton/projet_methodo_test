import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;

public class Test {

    private Main main = new Main();

    @org.junit.jupiter.api.Test
    public void test_join(){

        ArrayList<String> words = new ArrayList<>();
        words.add("Hello"); words.add("world");

        String join = String.join(" ", words);

        Assertions.assertEquals(join, "Hello world");

    }

    @org.junit.jupiter.api.Test
    public void test_sum1(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(6); list.add(9); list.add(12);

        double sum = main.sum(list);

        Assertions.assertEquals(sum, 9);
    }

    @org.junit.jupiter.api.Test
    public void test_sum2(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(15);
        list.add(0);

        double sum = main.sum(list);

        Assertions.assertEquals(sum, 5);
    }

    @org.junit.jupiter.api.Test
    public void test_moy3(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-100); list.add(100); list.add(30);

        double sum = main.sum(list);

        Assertions.assertEquals(sum, 10);
    }

    @org.junit.jupiter.api.Test
    public void test_moy4(){
        ArrayList<Integer> list = new ArrayList<>();

        double sum = main.sum(list);

        Assertions.assertEquals(sum, Double.NaN);
    }


}