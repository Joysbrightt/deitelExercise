package NewExampleOnEight;

public enum Regionns {
   NN("Ajegunle", "Ikeja", "Abuja"),
    NE("VI", "BI"),
   NC("Mushin", "Ketu", "Okoko", "Ipaja"),
    SE("Ibadan", "Ekiti", "Ijebu"),
    SS("Sabo", "Bariga", "Somolu"),
    SW("Challenge", "Molete", "Mowe");

    private String[] states;

    Regionns(String... states){
        this.states = states;
    }
}
