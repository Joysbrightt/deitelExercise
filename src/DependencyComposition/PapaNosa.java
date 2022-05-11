package DependencyComposition;

public class PapaNosa {

    private Walk walk;
    private Pray pray;
    public PapaNosa( Walk walk, Pray pray){
        this.walk = walk;
        this.pray = pray;
    }

    public  void pray(){
        this.pray.pray();
    }

    public void Walk(){
        this.walk.walk();
    }


    public void setPray(PrayOne prayOne) {
        
    }

//    creating a dependencies in a OOP, an object can behave in a multiple way while
//    an object can behave in several ways 
}
