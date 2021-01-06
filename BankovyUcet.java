package sk.richard.uloha_7_1;

public class BankovyUcet {
	
	private int cisloUctu;
	private double aktualnyZostatok;
	private double pociatocnyZostatok;
	//private double ciastka;

	public BankovyUcet(int cisloUctu, double pociatocnyZostatok) {
		
		this.cisloUctu = cisloUctu;
		this.pociatocnyZostatok=pociatocnyZostatok;
		aktualnyZostatok=+pociatocnyZostatok;
	}
	

	public double getAktualnyZostatok() {

		return aktualnyZostatok;
	}
	
	public void vloz(double ciastka) {
		aktualnyZostatok=+ciastka;
	}
	public void  vyber(double ciastka) {
		aktualnyZostatok =-ciastka; 
	}
	
	public int getCisloUctu() {
		return cisloUctu;
	}
	@Override
	public String toString() {
		return "BankovyUcet [cisloUctu=" + cisloUctu + ", aktualnyZostatok=" + aktualnyZostatok + "]";
	}






}
