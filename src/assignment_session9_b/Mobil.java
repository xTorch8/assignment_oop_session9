package assignment_session9_b;

public class Mobil extends Kendaraan implements KendaraanInterface {

	public Mobil(int tahunKendaraan, String namaModel, String noPolisi, long harga) {
		super(tahunKendaraan, namaModel, noPolisi, harga);
	}

	@Override
	public void bergerak() {
		System.out.printf("Mobil dengan nomor polisi %s bergerak! Brum... Brum...\n", this.getNoPolisi());
		
	}

	@Override
	public void perbaiki() {
		System.out.printf("Mobil dengan nomor polisi %s diperbaiki!\n", this.getNoPolisi());
		
	}

	@Override
	public void cetakHarga() {
		System.out.printf("%-10d\n", this.getHarga());
		
	}

	@Override
	public void cetakInfoKendaraan() {
		System.out.printf("%-10d | %-40s | %-15s | ", 
				this.getTahunKendaraan(), 
				this.getNamaModel(),
				this.getNoPolisi());
		
		this.cetakHarga();
		
	}

}
