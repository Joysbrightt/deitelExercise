package NewExampleOnEight;

public enum People {
    WORM("Amaka"),
    BUNMI( "Love");

private String boyFriendName;

People(String name){
    boyFriendName = name;
}


//overiding the String functionalities of the objects;
public String toString(){
    switch (this){
        case WORM: return "Deji";
        case BUNMI: return  "Bunmi";
        default: return null;

    }
}








}
