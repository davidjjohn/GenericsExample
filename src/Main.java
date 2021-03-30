import java.util.Random;
import java.util.NoSuchElementException;

public class Main {

    private static Random rand;
    private static Stack<Double> XXX;

    private static void populate(){
        int howmany = rand.nextInt(16);
        for(int i=0;i<howmany;i++){
            XXX.push(rand.nextDouble());
        }
    }

    public static void main(String[] args) {

        rand = new Random();
        XXX = new LinkedStack<Double>();

        //Triple<Integer,Integer,Integer> YYY = new Triple<Integer,Integer,Integer>(1,2,3);
        //System.out.println(YYY);

        populate();

        for(int i=0; i<16; i++) {

            try {
                System.out.printf("%4d  %6.2f%n",i,XXX.pop());
            } catch (NoSuchElementException e) {
                System.out.println("Whoops!  The stack is empty.  Be more careful!!!");
            }

        }








    }
}
