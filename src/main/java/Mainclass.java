

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
        int a1 = 1;
        int b1 = 1;
        int c =2;
System.out.println(a1+b1+c);
    }
}
