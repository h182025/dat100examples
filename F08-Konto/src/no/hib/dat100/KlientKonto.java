package no.hib.dat100;
public class KlientKonto {
  public static void main(String[] args) {
   
	int innskudd = 500;

    Konto k1 = new Konto("Ole Olsen", "Torget 1",0);
    Konto k2 = new Konto("Kari Ludt", "Strandgt 10",0);
    
    k1.settInn(innskudd);
  
    System.out.println("A: Min saldo er = " + k1.giSaldo());

    k1.settInn(1000);
    System.out.println("B: Min saldo er = " + k1.giSaldo());

    k1.settInn(500);
    System.out.println("C: Min saldo er = " + k1.giSaldo());
    
    boolean overfort = k1.overforTilAnnenKonto(k2, 1000);
    if(overfort){
        System.out.println("Overf�rt fra kontonummer " + k1.getKontonummer() + " til kontonummer " + k2.getKontonummer() + " bel�p " + k2.giSaldo());
    }
    else{
        System.out.println("Ble ikke overf�rt");
    }
    k1.skrivTilstand();
    k2.skrivTilstand();
  }
}
