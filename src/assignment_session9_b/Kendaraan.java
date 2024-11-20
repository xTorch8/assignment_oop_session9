package assignment_session9_b;

public abstract class Kendaraan {
	private int tahunKendaraan;
	private String namaModel;
	private String noPolisi;
	private long harga;
	
	public abstract void cetakHarga();
	public abstract void cetakInfoKendaraan();
	
	public Kendaraan(int tahunKendaraan, String namaModel, String noPolisi, long harga) {
		super();
		this.tahunKendaraan = tahunKendaraan;
		this.namaModel = namaModel;
		this.noPolisi = noPolisi;
		this.harga = harga;
	}
	public int getTahunKendaraan() {
		return tahunKendaraan;
	}
	
	public void setTahunKendaraan(int tahunKendaraan) {
		this.tahunKendaraan = tahunKendaraan;
	}
	
	public String getNamaModel() {
		return namaModel;
	}
	
	public void setNamaModel(String namaModel) {
		this.namaModel = namaModel;
	}
	
	public String getNoPolisi() {
		return noPolisi;
	}
	
	public void setNoPolisi(String noPolisi) {
		this.noPolisi = noPolisi;
	}
	
	public long getHarga() {
		return harga;
	}
	
	public void setHarga(long harga) {
		this.harga = harga;
	}
}
