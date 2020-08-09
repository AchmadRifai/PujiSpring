package puji.wahyono.entitas;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@javax.persistence.Entity
@javax.persistence.Table(name="bahan")
public class Bahan {

	@javax.persistence.Id
	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name="nomor")
	private int nomor;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "menu", referencedColumnName = "kode")
	private Menu menu;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "bahan", referencedColumnName = "kode")
	private Persediaan bahan;
	@Column(name="qty")
	private float qty;

	public Bahan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bahan(int nomor, Menu menu, Persediaan bahan, float qty) {
		super();
		this.nomor = nomor;
		this.menu = menu;
		this.bahan = bahan;
		this.qty = qty;
	}

	public int getNomor() {
		return nomor;
	}

	public void setNomor(int nomor) {
		this.nomor = nomor;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public Persediaan getBahan() {
		return bahan;
	}

	public void setBahan(Persediaan bahan) {
		this.bahan = bahan;
	}

	public float getQty() {
		return qty;
	}

	public void setQty(float qty) {
		this.qty = qty;
	}

}
