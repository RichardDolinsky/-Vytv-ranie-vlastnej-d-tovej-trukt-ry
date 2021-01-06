package sk.richard.uloha_7_1;

public class BankaTester {

	public static void main(String[] args) {
		
	
		
        final int UCET1_ID = 0;
        final int UCET2_ID = 1;
        final int UCET3_ID = 2;
        final int UCET4_ID = 3;
        
    /**	BankovyUcet ucet = new BankovyUcet(0, 1000);
    	BankovyUcet ucet1 = new BankovyUcet(1, 2000);
    	BankovyUcet ucet2 = new BankovyUcet(2, 3000);
    	BankovyUcet ucet3 = new BankovyUcet(3, 10000);*/
        Banka banka = new Banka();
        
   //     banka.pridajUcet(ucet1);
     //   banka.pridajUcet(ucet2);
      //  banka.pridajUcet(ucet3);
       // banka.pridajUcet(ucet);
        banka.pridajUcet(123, 100);
        banka.pridajUcet(002, 100);
        banka.pridajUcet(003, 200);
        banka.pridajUcet(004, 1000);
        
        System.out.println(banka.getCelkovyZostatok());
        System.out.println(banka.getAktualnyZostatok(002));
       // banka.vloz(0, 500);
     //   banka.pridajUcet(007, 10100);
 
       
    /**    
        System.out.println("Aktulny zostatok na ucte : \n" + ucet.toString());
        System.out.println("Aktulny zostatok na ucte : \n" + ucet1.toString());
        System.out.println("Aktulny zostatok na ucte : \n" + ucet2.toString());
        System.out.println("Aktulny zostatok na ucte : \n" + ucet3.toString());
        System.out.println("Najvacsiu hodnotu ma ucet : \n" + banka.getMaximum());
        
        System.out.println("Najdi ucet ID 0: \n" + banka.najdiUcet(0));
        System.out.println("Pocet uctov s hodnotou vyssou ako 1500: " +banka.najdiUctyZoZostatkomVyssimAko(1500));
        System.out.println("spolocny zostatok spolu: "+banka.getCelkovyZostatok());
        

       // System.out.println(banka.pridajUcet(UCET1_ID, UCET1_ID));
        
        banka.vloz(ucet, 200);
        banka.vyber(ucet1, 500);
        banka.vloz(ucet2, 1000);
        banka.vyber(ucet3, 7000);
        
        System.out.print("Zostatok na ucte s ID " + UCET1_ID);
        System.out.println(" je " + banka.getAktualnyZostatok(ucet) + " EUR.");
        System.out.println("Ocakavana hodnota: 1200");

        System.out.print("Zostatok na ucte s ID " + UCET2_ID);
        System.out.println(" je " + banka.getAktualnyZostatok(ucet1) + " EUR.");
        System.out.println("Ocakavana hodnota: 1500");

        System.out.print("Zostatok na ucte s ID " + UCET3_ID);
        System.out.println(" je " + banka.getAktualnyZostatok(ucet2) + " EUR.");
        System.out.println("Ocakavana hodnota: 4000");

        System.out.print("Zostatok na ucte s ID " + UCET4_ID);
        System.out.println(" je " + banka.getAktualnyZostatok(ucet3) + " EUR.");
        System.out.println("Ocakavana hodnota: 3000");
*/
	}

}
