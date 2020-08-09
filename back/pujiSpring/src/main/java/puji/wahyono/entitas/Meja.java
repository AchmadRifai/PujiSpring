package puji.wahyono.entitas;

import javax.persistence.Column;

@javax.persistence.Entity
@javax.persistence.Table(name="meja")
public class Meja {

	@javax.persistence.Id
	@Column(name="nomor")
	private int nomor;
	@Column(name="ket")
	private String ket;

	public Meja() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Meja(int nomor, String ket) {
		super();
		this.nomor = nomor;
		this.ket = ket;
	}

	public int getNomor() {
		return nomor;
	}

	public void setNomor(int nomor) {
		this.nomor = nomor;
	}

	public String getKet() {
		return ket;
	}

	public void setKet(String ket) {
		this.ket = ket;
	}

}
