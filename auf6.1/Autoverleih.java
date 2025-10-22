// u06_klasse
// auf6.1

public class Autoverleih
{
   public static void main(String[] args)
   {
      Auto auto1;
      Auto auto2;
      Auto auto3;

      // Hier soll der Programmcode stehen, mit dem neue
      // Auto-Objekte erzeugt und den deklarierten Variablen
      // auto1, auto2 und auto3 zugewiesen werden.

      auto1 = new Auto();
      auto2 = new Auto();
      auto3 = new Auto();

      // Hier soll der Programmcode stehen, mit dem den
      // Auto-Objekten die vorgesehenen Attributwerte
      // zugewiesen werden.

      auto1.autonummer = "HH EZ";
      auto2.autonummer = "HH AK";
      auto3.autonummer = "HH BG";

      auto1.farbe = Farbe.blau;
      auto2.farbe = Farbe.gelb;
      auto3.farbe = Farbe.rot;

      auto1.tagespreis = 50;
      auto2.tagespreis = 40;
      auto3.tagespreis = 80;
      
      // Die folgende Zeile darf nicht veraendert werden:
      Darsteller.zeige(auto1, auto2, auto3);
   }
}