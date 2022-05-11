package DependencyComposition;

public class Main {

    public static void main(String[] args) {
        Walk walk = new Walk();
        PrayTwo prayTwo = new PrayTwo();
        PapaNosa nosa  = new PapaNosa(walk, prayTwo);

        nosa.pray();
        PrayOne prayOne = new PrayOne();
        nosa.setPray(prayOne);
        nosa.pray();


    }



}
