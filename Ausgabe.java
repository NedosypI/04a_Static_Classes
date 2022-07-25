public class Ausgabe {

    private Hundebesitzer Besitzer;
    private Hund myHund;

    public Ausgabe() {
    }

    public Ausgabe(Hundebesitzer besitzer, Hund myhund) {
        Besitzer = besitzer;
        myHund = myhund; 
    }

public void bildschirmAusgabe() {
    if (myHund.getBesitzer()=="Irina") 

    {
        System.out.println("super");
    } else {
        
    }
    
    System.out.println(myHund.getBesitzerNameRasse());
    System.out.println(myHund.returnBesitzerNameRasse("Mine"));
    System.out.println(Besitzer.returnAnschrift());
}

    



}