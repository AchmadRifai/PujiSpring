package puji.wahyono.entitas;

import javax.persistence.Column;

@javax.persistence.Entity
@javax.persistence.Table(name="persediaan")
public class Persediaan {

	@javax.persistence.Id
	@Column(name="kode")
	private String kode;
	@Column(name="nama")
	private String nama;
	@Column(name="stok")
	private float stok;
	@Column(name="satuan")
	private String satuan;

	public Persediaan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Persediaan(String kode, String nama, float stok, String satuan) {
		super();
		this.kode = kode;
		this.nama = nama;
		this.stok = stok;
		this.satuan = satuan;
	}

	public String getKode() {
		return kode;
	}

	public void setKode(String kode) {
		this.kode = kode;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public float getStok() {
		return stok;
	}

	public void setStok(float stok) {
		this.stok = stok;
	}

	public String getSatuan() {
		return satuan;
	}

	public void setSatuan(String satuan) {
		this.satuan = satuan;
	}

}
