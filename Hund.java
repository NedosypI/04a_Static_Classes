public class Hund {
    
    
        private String Besitzer; 
        private String Hundename; 
        private String Hunderasse;
        
        
        //Konstruktor
        public Hund() {
        }
        
        
        public Hund( String hundename, String hunderasse) {
            Hundename = hundename;
            Hunderasse = hunderasse;
        }



        //Getter / Setter
        // mit get hole ich ohne Übergabewert
        public String getBesitzer() {
            return Besitzer;
        }
        
        public int getHundeAlter() {
            return 5;
        }

        public boolean isHund() {
            return true;
        }

        public void setBesitzer(String besitzer) {
            Besitzer = besitzer;
        }
        
        
        public String getHundename() {
            return Hundename;
        }
        
        
        public void setHundename(String hundename) {
            Hundename = hundename;
        }
        
        
        public String getHunderasse() {
            return Hunderasse;
        }
        
        
        public void setHunderasse(String hunderasse) {
            Hunderasse = hunderasse;
        }
       
        public String getBesitzerNameRasse() {      
            return Besitzer + ", " + Hundename + ", " + Hunderasse;
        }
        
        public String returnBesitzerNameRasse(String neuerBesitzer) {      
            Besitzer = neuerBesitzer;
            return Besitzer + ", " + Hundename + ", " + Hunderasse;
        }



        }
        


