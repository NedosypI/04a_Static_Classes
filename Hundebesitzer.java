public class Hundebesitzer {
    
private String Vorname; 
private String Nachname; 
private String Straße;
private String Ort;


//Konstruktor
public Hundebesitzer() {
}


public Hundebesitzer(String vorname, String nachname, String straße, String ort) {
    Vorname = vorname;
    Nachname = nachname;
    Straße = straße;
    Ort = ort;
}

// /Getter / Setter 


public String getVorname() {
    return Vorname;
}


public void setVorname(String vorname) {
    Vorname = vorname;
}


public String getNachname() {
    return Nachname;
}


public void setNachname(String nachname) {
    Nachname = nachname;
}


public String getStraße() {
    return Straße;
}


public void setStraße(String straße) {
    Straße = straße;
}


public String getOrt() {
    return Ort;
}


public void setOrt(String ort) {
    Ort = ort;
}

public String returnAnschrift(){
    return Vorname + ", " + Nachname + ", " + Straße + ", " + Ort;
}



}
