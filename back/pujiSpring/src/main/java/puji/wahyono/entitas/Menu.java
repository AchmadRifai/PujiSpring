package puji.wahyono.entitas;

import java.math.BigDecimal;

import javax.persistence.Column;

@javax.persistence.Entity
@javax.persistence.Table(name="menu")
public class Menu {

	@javax.persistence.Id
	@Column(name="kode")
	private String kode;
	@javax.persistence.ManyToOne(fetch = javax.persistence.FetchType.LAZY)
	@javax.persistence.JoinColumn(name = "kat", referencedColumnName = "kode")
	private KatMenu kat;
	@Column(name="harga")
	private BigDecimal harga;
	@Column(name="gbr")
	private String gbr;
	@Column(name="nama")
	private String nama;
	@Column(name="satuan")
	private String satuan;

	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Menu(String kode, KatMenu kat, BigDecimal harga, String gbr, String nama, String satuan) {
		super();
		this.kode = kode;
		this.kat = kat;
		this.harga = harga;
		this.gbr = gbr;
		this.nama = nama;
		this.satuan = satuan;
	}

	public String getKode() {
		return kode;
	}

	public void setKode(String kode) {
		this.kode = kode;
	}

	public KatMenu getKat() {
		return kat;
	}

	public void setKat(KatMenu kat) {
		this.kat = kat;
	}

	public BigDecimal getHarga() {
		return harga;
	}

	public void setHarga(BigDecimal harga) {
		this.harga = harga;
	}

	public String getGbr() {
		return gbr;
	}

	public void setGbr(String gbr) {
		this.gbr = gbr;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getSatuan() {
		return satuan;
	}

	public void setSatuan(String satuan) {
		this.satuan = satuan;
	}

}
