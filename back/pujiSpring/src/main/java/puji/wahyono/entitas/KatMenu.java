package puji.wahyono.entitas;

import javax.persistence.Column;

@javax.persistence.Entity
@javax.persistence.Table(name="kat_menu")
public class KatMenu {

	@javax.persistence.Id
	@Column(name="kode")
	private int kode;
	@Column(name="nama")
	private String nama;
	@Column(name="gbr")
	private String gbr;

	public KatMenu() {
		super();
	}

	public KatMenu(int kode, String nama, String gbr) {
		super();
		this.kode = kode;
		this.nama = nama;
		this.gbr = gbr;
	}

	public int getKode() {
		return kode;
	}

	public void setKode(int kode) {
		this.kode = kode;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getGbr() {
		return gbr;
	}

	public void setGbr(String gbr) {
		this.gbr = gbr;
	}

}
