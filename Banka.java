package sk.richard.uloha_7_1;

import java.util.ArrayList;

public class Banka {

	ArrayList<BankovyUcet> banka = new ArrayList<BankovyUcet>();

	public void pridajUcet(BankovyUcet ucet) {

		banka.add(ucet);

	}

	public void pridajUcet(int cisloUctu, double pociatocnyZostatok) {
		BankovyUcet ucet = new BankovyUcet(cisloUctu, pociatocnyZostatok);
		banka.add(ucet);
	}

	/**
	 * vklada ciastku na ucet do triedy BankovyUcet
	 * 
	 * @param ucet    vyberieme ucet
	 * @param ciastka napiseme ciastku
	 * @return cisloVkladu aktualny zostatok po vlozeni
	 */

	public double vloz(BankovyUcet ucet, int ciastka) {
		ucet.vloz(ucet.getAktualnyZostatok() + ciastka);
		double cisloVkladu = ucet.getAktualnyZostatok();
		return cisloVkladu;
	}

	public void vloz(int cisloUctu, double ciastka) {
		BankovyUcet hladanyUcet = najdiUcet(cisloUctu);
		if (hladanyUcet == null) {
			System.out.println("Hladany ucet sa nenasiel");
		} else {
			hladanyUcet.vloz(ciastka);
		}
		// hladanyUcet.vloz(ciastka);

	}
	// double cisloVkladu = ucet.getAktualnyZostatok();
	// return cisloVkladu; }

	/**
	 * vyberie ciastku ktoru napiseme do triedy BankovyUcet
	 * 
	 * @param ucet    vyberieme ucet
	 * @param ciastka napiseme ciastku
	 * @return aktualnyZostatok vrati aktualny zostatok
	 */
	public double vyber(BankovyUcet ucet, int ciastka) {
		ucet.vyber(-ucet.getAktualnyZostatok() + ciastka);

		return ucet.getAktualnyZostatok();
	}

	public void vyber(int cisloUctu, double ciastka) {
		BankovyUcet hladanyUcet = najdiUcet(cisloUctu);
		if (hladanyUcet == null) {
			System.out.println("Hladany ucet sa nenasiel");
		} else {
			hladanyUcet.vyber(ciastka);
		}
		// hladanyUcet.vloz(ciastka);

	}

	// zistime aktualny zostatok
	public double getAktualnyZostatok(BankovyUcet ucet) {
		return ucet.getAktualnyZostatok();

	}

	public double getAktualnyZostatok(int cisloUctu) {

		BankovyUcet hladanyUcet = najdiUcet(cisloUctu);
		if (hladanyUcet == null) {
			System.out.println("Hladany ucet sa nenasiel");
			return -1;
		} else {
			return hladanyUcet.getAktualnyZostatok();
		}
		// hladanyUcet.vloz(ciastka);

	}
	// ucet s maximalnou hodnotou

	public BankovyUcet getMaximum() {
		if (banka.size() == 0) // v banke nie su ziadne ucty
			return null;

		BankovyUcet maxZostatok = banka.get(0);

		for (int i = 1; i < banka.size(); i++) {
			BankovyUcet ucet = banka.get(i);
			if (ucet.getAktualnyZostatok() > maxZostatok.getAktualnyZostatok())
				maxZostatok = ucet;
		}
		return maxZostatok; // ucet s najvyssim zostatkom
	}

	// najdeme ucet
	public BankovyUcet najdiUcet(int cisloUctu) {
		for (BankovyUcet ucet : banka) {
			if (ucet.getCisloUctu() == cisloUctu) {
				return ucet;
			}
		}
		return null; // nenasiel sa ucet s danym cislom uctu
	}

	@Override
	public String toString() {
		return "Banka [banka=" + banka + "]";
	}
	// najdeme ucet so zostatok vacsim ako kriterium

	public int najdiUctyZoZostatkomVyssimAko(double kriterium) {
		int pocetUctov = 0;
		for (BankovyUcet ucet : banka) {
			if (ucet.getAktualnyZostatok() >= kriterium) {
				pocetUctov++;
			}

		}
		return pocetUctov;
	}

	// ziskame celkovu sumu zo vsetkych uctov
	public double getCelkovyZostatok() {
		double celkovyZostatok = 0;

		for (BankovyUcet ucet : banka) {
			celkovyZostatok += ucet.getAktualnyZostatok();
		}
		return celkovyZostatok;
	}

}
