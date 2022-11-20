import Factories.BuharestToyFactory;
import Factories.LondonToyFactory;
import Factories.MichiganToyFactory;
import Factories.RigaToyFactory;

public class TestFactory {
    public static void main(String[] args) {
        BuharestToyFactory factory = new BuharestToyFactory();

        for (int i = 0; i < 3; i++) {
            factory.tie("Lisa");
        }

        for (int i = 0; i < 5; i++) {
            factory.tie("Teddy");
        }

        for (int i = 0; i < 2; i++) {
            factory.tie("Billy");
        }

        System.out.println("Lisa: "+factory.getToyProd("Lisa"));
        System.out.println("Billy: "+factory.getToyProd("Billy"));
        System.out.println("Susan: "+factory.getToyProd("Susan"));
        System.out.println("Teddy: "+factory.getToyProd("Teddy"));

        System.out.println("-".repeat(20));
       RigaToyFactory factory1 = new RigaToyFactory();

        for (int i = 0; i < 1; i++) {
            factory1.tie("Lisa");
        }

        for (int i = 0; i < 3; i++) {
            factory1.tie("Teddy");
        }

        for (int i = 0; i < 5; i++) {
            factory1.tie("Billy");
        }

        for (int i = 0; i < 2; i++) {
            factory1.tie("Susan");
        }

        System.out.println("Lisa: "+factory1.getToyProd("Lisa"));
        System.out.println("Billy: "+factory1.getToyProd("Billy"));
        System.out.println("Susan: "+factory1.getToyProd("Susan"));
        System.out.println("Teddy: "+factory1.getToyProd("Teddy"));

        System.out.println("-".repeat(20));

        MichiganToyFactory factory2 = new MichiganToyFactory();

        for (int i = 0; i < 1; i++) {
            factory2.tie("Lisa");
        }

        for (int i = 0; i < 3; i++) {
            factory2.tie("Billy");
        }

        for (int i = 0; i < 4; i++) {
            factory2.tie("Susan");
        }

        System.out.println("Lisa: "+factory2.getToyProd("Lisa"));
        System.out.println("Billy: "+factory2.getToyProd("Billy"));
        System.out.println("Susan: "+factory2.getToyProd("Susan"));
        System.out.println("Teddy: "+factory2.getToyProd("Teddy"));

        System.out.println("-".repeat(20));

        LondonToyFactory factory3 = new LondonToyFactory();

        for (int i = 0; i < 1; i++) {
            factory3.tie("Lisa");
        }

        for (int i = 0; i < 2; i++) {
            factory3.tie("Billy");
        }

        for (int i = 0; i < 1; i++) {
            factory3.tie("Susan");
        }

        System.out.println("Lisa: "+factory3.getToyProd("Lisa"));
        System.out.println("Billy: "+factory3.getToyProd("Billy"));
        System.out.println("Susan: "+factory3.getToyProd("Susan"));
        System.out.println("Teddy: "+factory3.getToyProd("Teddy"));
    }
}
