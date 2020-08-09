package puji.wahyono.entitas;

import javax.persistence.Column;

@javax.persistence.Entity
@javax.persistence.Table(name = "karyawan")
public class Karyawan {

	@javax.persistence.Id
	@Column(name="kode")
	private String kode;
	@Column(name="pass")
	private String pass;
	@Column(name="nama")
	private String nama;
	@Column(name="almt")
	private String almt;
	@Column(name="jab")
	private String jab;
	@Column(name="mlebu")
	private boolean mlebu;

	public Karyawan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Karyawan(String kode, String pass, String nama, String almt, String jab, boolean mlebu) {
		super();
		this.kode = kode;
		this.pass = pass;
		this.nama = nama;
		this.almt = almt;
		this.jab = jab;
		this.mlebu = mlebu;
	}

	public String getKode() {
		return kode;
	}

	public void setKode(String kode) {
		this.kode = kode;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getAlmt() {
		return almt;
	}

	public void setAlmt(String almt) {
		this.almt = almt;
	}

	public String getJab() {
		return jab;
	}

	public void setJab(String jab) {
		this.jab = jab;
	}

	public boolean isMlebu() {
		return mlebu;
	}

	public void setMlebu(boolean mlebu) {
		this.mlebu = mlebu;
	}

}
