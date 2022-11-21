import Factories.AustriaToyFactory;
import Factories.GermanyToyFactory;
import Factories.MexicoToyFactory;
import Factories.USAToyFactory;

public class TestFactory {
    public static void main(String[] args) {
        AustriaToyFactory ATF = new AustriaToyFactory();

        for (int i = 0; i < 1; i++) {
            ATF.tie("Teddy");
        }

        for (int i = 0; i < 2; i++) {
            ATF.tie("Billy");
        }

        GermanyToyFactory GTF = new GermanyToyFactory();

        for (int i = 0; i < 5; i++) {
            GTF.tie("Teddy");
        }

        for (int i = 0; i < 1; i++) {
            GTF.tie("Billy");
        }

        MexicoToyFactory MTF = new MexicoToyFactory();

        for (int i = 0; i < 4; i++) {
            MTF.tie("Teddy");
        }

        for (int i = 0; i < 3; i++) {
            MTF.tie("Billy");
        }

        USAToyFactory UTF = new USAToyFactory();

        for (int i = 0; i < 3; i++) {
            UTF.tie("Teddy");
        }

        for (int i = 0; i < 2; i++) {
            UTF.tie("Billy");
        }
        System.out.println("-".repeat(40));
        System.out.println("Austria: \n\tBilly - "+ ATF.getToyProd("Billy")+"\n\tTeddy - "+ ATF.getToyProd("Teddy"));
        System.out.println("Germany: \n\tBilly - "+ GTF.getToyProd("Billy")+"\n\tTeddy - "+ GTF.getToyProd("Teddy"));
        System.out.println("Mexico: \n\tBilly - "+ MTF.getToyProd("Billy")+"\n\tTeddy - "+ MTF.getToyProd("Teddy"));
        System.out.println("USA: \n\tBilly - "+ UTF.getToyProd("Billy")+"\n\tTeddy - "+ UTF.getToyProd("Teddy"));

    }
}
