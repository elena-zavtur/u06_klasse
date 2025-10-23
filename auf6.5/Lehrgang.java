// u06_klasse
// auf6.5

public class Lehrgang
{
   public static void main(String[] args)
   {  
      Teilnehmer teilnehmer1;
      Teilnehmer teilnehmer2;
      Teilnehmer teilnehmer3;
      Teilnehmer teilnehmer4;
      Teilnehmer teilnehmer5;

      teilnehmer1 = new Teilnehmer();
      teilnehmer2 = new Teilnehmer();
      teilnehmer3 = new Teilnehmer();
      teilnehmer4 = new Teilnehmer();
      teilnehmer5 = new Teilnehmer();

	  teilnehmer1.name = "Zavtur";
      teilnehmer2.name = "Schindler";	
      teilnehmer3.name = "Andres";
      teilnehmer4.name = "Mueller";
      teilnehmer5.name = "Cirino-Reis";

      teilnehmer1.vorname = "Elena";
      teilnehmer2.vorname = "Wolfgang";
      teilnehmer3.vorname = "Lara";
      teilnehmer4.vorname = "Hans";
      teilnehmer5.vorname = "Pedro";

      teilnehmer1.alter = 44;
      teilnehmer2.alter = 60;
      teilnehmer3.alter = 29;
      teilnehmer4.alter = 52;
      teilnehmer5.alter = 27;

      teilnehmer1.fachrichtung = "Systemintegration";
      teilnehmer2.fachrichtung = "Systemintegration";
      teilnehmer3.fachrichtung = "Anwendungsentwickler";
      teilnehmer4.fachrichtung = "Systemintegration";
      teilnehmer5.fachrichtung = "Anwendungsentwickler";


      System.out.println();
      System.out.println(teilnehmer1.name + " " + teilnehmer1.vorname + "," + teilnehmer1.alter + "," + 
      teilnehmer1.fachrichtung);
      System.out.println();
      System.out.println(teilnehmer2.name + " " + teilnehmer2.vorname + "," + teilnehmer2.alter + "," + 
      teilnehmer2.fachrichtung);
      System.out.println();
      System.out.println(teilnehmer3.name + " " + teilnehmer3.vorname + "," + teilnehmer3.alter + "," + 
      teilnehmer3.fachrichtung);
      System.out.println();
      System.out.println(teilnehmer4.name + " " + teilnehmer4.vorname + "," + teilnehmer4.alter + "," + 
      teilnehmer4.fachrichtung);
      System.out.println();
      System.out.println(teilnehmer5.name + " " + teilnehmer5.vorname + "," + teilnehmer5.alter + "," + 
      teilnehmer5.fachrichtung);
      System.out.println();

   }

}
