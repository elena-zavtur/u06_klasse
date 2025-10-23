// u06_klasse
// auf6.1

public class Autoverleih
{
   public static void main(String[] args)
   {
      Auto auto1;
      Auto auto2;
      Auto auto3;
      Kunde kunde1;
      Kunde kunde2;
      Kunde kunde3;

      auto1 = new Auto();
      auto2 = new Auto();
      auto3 = new Auto();

      kunde1 = new Kunde();
      kunde2 = new Kunde();
      kunde3 = new Kunde();

      auto1.autonummer = "HH EZ";
      auto2.autonummer = "HH AK";
      auto3.autonummer = "HH BG";

      auto1.farbe = Farbe.blau;
      auto2.farbe = Farbe.gelb;
      auto3.farbe = Farbe.rot;

      auto1.tagespreis = 50;
      auto2.tagespreis = 40;
      auto3.tagespreis = 80;

      kunde1.name = "Schindler";
      kunde2.name = "Zavtur";
      kunde3.name = "Andreas";
      kunde1.stammkunde = true;
      kunde2.stammkunde = false;
      kunde3.stammkunde = true;


      Darsteller.zeige(auto1, auto2, auto3, kunde1, kunde2, kunde3);
   }
}