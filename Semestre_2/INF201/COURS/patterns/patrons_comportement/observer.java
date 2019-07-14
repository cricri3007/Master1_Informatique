//Classe repr�sentant un GPS (appareil permettant de conna�tre sa position).
public class Gps extends Observable
{
        private String position;// Position du GPS.
        private int precision;// Pr�cision accord� � cette position (suivant le nombre de satellite utilis�s).
        
        // Constructeur.
        public Gps()
        {
                position="inconnue";
                precision=0;
        }
        
        // M�thode permettant de notifier tous les observateurs lors d'un changement d'�tat du GPS.
        public void notifierObservateurs()
        {
                setChanged();// M�thode de l'API.
                notifyObservers();// Egalement une m�thode de l'API.
        }
 
        // M�thode qui permet de mettre � jour de fa�on artificielle le GPS.
        // Dans un cas r�el, on utiliserait les valeurs retourn�es par les capteurs.
        public void setMesures(String position, int precision)
        {
                this.position=position;
                this.precision=precision;
                notifierObservateurs();
        }
        
        // M�thode "tir�" donc c'est aux observeurs d'aller chercher les valeurs d�sir� gr�ce � un objet Gps.
        // Pour cela on trouve un accesseur en lecture pour position.
        public String getPosition()
        {
                return position;
        }
        // Un accesseur en lecture pour pr�cision.
        public int getPrecision()
        {
                return precision;
        }
}

//Affiche un r�sum� en console des informations (position) du GPS.
public class AfficheResume implements Observer
{
      // M�thode appel�e automatiquement lors d'un changement d'�tat du GPS.
      public void update(Observable o, Object obj)
      {
              if(o instanceof Gps)
              {       
                      Gps g = (Gps) o;
                      System.out.println("Position : "+g.getPosition());
              }       
      }

}

//Classe principale du projet observeurApi.
public class Main
{
      // M�thode principale.
      public static void main(String[] args)
      {
              // Cr�ation de l'objet Gps observable.
              Gps g = new Gps();
              // Cr�ation de deux observeurs AfficheResume et AfficheComplet
              AfficheResume ar = new AfficheResume();
              // On ajoute AfficheResume comme observeur de Gps.
              g.addObserver(ar);
              // On simule l'arriv�e de nouvelles valeurs via des capteurs.
              g.setMesures("N 39�59�993 / W 123�00�000", 4);
              // On ajoute AfficheComplet comme observeur de Gps.
              g.addObserver(ac);
              // Nouvelle simulation d'arriv�e de nouvelles valeurs via des capteurs.
              g.setMesures("N 37�48�898 / W 124�12�011", 5);
      }
}
