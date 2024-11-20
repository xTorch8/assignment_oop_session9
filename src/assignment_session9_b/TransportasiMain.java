package assignment_session9_b;

import java.util.ArrayList;
import java.util.Scanner;

public class TransportasiMain {
	public static Scanner input = new Scanner(System.in);
	
	public static ArrayList<Mobil> carList = new ArrayList<Mobil>();
	
	public static void main(String[] args) {
		int menuChosen = 0;
		do {
			try {
				displayMenuListHandler();
				menuChosen = input.nextInt();
				input.nextLine();
				navigateMenuHandler(menuChosen);
			}
			catch (Exception e) {
				System.out.println("[ERR] Harap hanya input angka dari 1-3.");
				input.nextLine();
			}
		} while (menuChosen != 3);
	}
	
	public static void displayMenuListHandler() {
		System.out.println("=== Dealer Mobil ===");
		System.out.println("1. Isi Data Mobil");
		System.out.println("2. Tampilkan Informasi Mobil");
		System.out.println("3. Keluar Aplikasi");
		System.out.println("");
		System.out.print("Pilih (1-3): ");
	}
	
	public static void navigateMenuHandler(int menuChosen) {
		switch (menuChosen) {
			case 1:
				addCarHandler();
				System.out.println("");
				break;
			case 2:
				getCarListHandler();
				System.out.println("");
				break;
			case 3:
				System.out.println("Terima kasih, sampai jumpa");
				break;
			default:
				System.out.println("[ERR] Harap hanya input angka dari 1-3.");
				break;
		}
	}
	
	public static void addCarHandler() {
		try {
			System.out.print("Isi Model Mobil: ");
			String model = input.nextLine();
			
			System.out.print("Tahun Produksi: ");
			int year = input.nextInt(); 
			input.nextLine();
			
			System.out.print("No Polisi: ");
			String number = input.nextLine();
			
			System.out.print("Price: ");
			long price = input.nextLong();
			input.nextLine();
			
			carList.add(new Mobil(year, model, number, price));
		}
		catch (Exception e) {
			System.out.println("[ERR] " + e.getMessage());
			input.nextLine();
		}
	}
	
	public static void getCarListHandler() {
		System.out.printf("| %-4s | %-10s | %-40s | %-15s | %-10s\n", "No.", "Tahun", "Model", "No Polisi", "Harga");
		
		for (int i = 0; i < 100; i++) {
			System.out.print("-");
		}
		
		System.out.println("");
		
		if (carList.size() == 0) {
			System.out.println("Belum ada mobil pada daftar!");
		}
		else {
			for (int i = 0; i < carList.size(); i++) {
				System.out.printf("| %-4d | ", i + 1);
				carList.get(i).cetakInfoKendaraan();
			}			
		}
	}
}
