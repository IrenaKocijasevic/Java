package zadatak04032019;

public class AutoG {

	public static void main(String[] args) {

		Auto a1 = new Auto(1700, 44, 5, "Opel", "Adam", 6000);
		Auto a2 = new Auto(2000, 77, 5, "Renault", "Capture", 10000);
		Auto a3 = new Auto(1200, 33, 5, "Fiat", "Punto", 5000);

		IspisiA(a1);
		IspisiA(a2);
		IspisiA(a3);

		System.out.println();
		System.out.println("Novosetovane vrednosti: ");

		a1.setModel("Astra");
		a2.setCena(11999.99);
		a3.setBrVrata(2);

		IspisiA(a1);
		IspisiA(a2);
		IspisiA(a3);
	}

	public static void IspisiA(Auto a) {
		System.out.println("Kubikaza: " + a.getKubikaza() + ", "
				+ "Broj vrata: " + a.getBrVrata() + ", " + "Proizvodjac: "
				+ a.getProizvodjac() + ", " + "Model: " + a.getModel() + ", "
				+ "Cena: " + a.getCena());
	}
}