import Factories.GermanyToyFactory;
import Factories.USAToyFactory;

public class TestFactory {
    public static void main(String[] args) {
        GermanyToyFactory GTF = new GermanyToyFactory();

        for (int i = 0; i < 4; i++) {
            GTF.tie("bear");
        }

        for (int i = 0; i < 3; i++) {
            GTF.tie("train");
        }

        USAToyFactory UTF = new USAToyFactory();

        for (int i = 0; i < 3; i++) {
            UTF.tie("bear");
        }

        for (int i = 0; i < 2; i++) {
            UTF.tie("train");
        }
        System.out.println("-".repeat(40));
        System.out.println("Germany: \n\tBilly - "+ GTF.getToyProd("Billy")+"\n\tTeddy - "+ GTF.getToyProd("Teddy"));
        System.out.println("USA: \n\tBilly - "+ UTF.getToyProd("Billy")+"\n\tTeddy - "+ UTF.getToyProd("Teddy"));

    }
}
