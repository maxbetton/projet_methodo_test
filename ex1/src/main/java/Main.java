import java.util.ArrayList;

public class Main {

    public double sum(ArrayList list){
        double total = 0;
        for (Object o : list) total += new Double((Integer) o);
        return total / list.size();
    }
}