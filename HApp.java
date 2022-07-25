public class HApp {
    
    public static void main(String[] args) {
	
Hund Bonnie = new Hund("Bonnie", "Mischling");
Bonnie.setBesitzer("Irina"); 


// if (Bonnie.isHund() == true) {
//     System.out.println("super");
// }
// if (Bonnie.getHundeAlter() == 5) {
//     System.out.println("super");
// }

Hund Sira = new Hund("Sira", "Mischling");
Sira.setBesitzer("Tom");


Hundebesitzer Tom = new Hundebesitzer("Tom", "Klapettek","Am Erlenhof", "Pohlheim");

Ausgabe bildschirmAusgabe = new Ausgabe(Tom, Sira);
    bildschirmAusgabe.bildschirmAusgabe();

Hundebesitzer Irina = new Hundebesitzer("Irina", "Nedosyp", "Rochusstr", "Köln");

bildschirmAusgabe = new Ausgabe(Irina, Bonnie);
    bildschirmAusgabe.bildschirmAusgabe();

}
}


