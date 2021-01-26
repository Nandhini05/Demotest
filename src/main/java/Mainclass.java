

import org.junit.Test;

import java.util.ArrayList;

public class Mainclass implements Fruit10
{
    public ArrayList<String> getEx1() {
        return ex1;
    }

    public void setEx1(ArrayList<String> ex1) {
        this.ex1 = ex1;
    }

    ArrayList<String> ex1 = new ArrayList<>();
    @Test
    public void calculate()
    {
        int a = 1;
        int b = 1;
System.out.println(a+b);
    }
}
