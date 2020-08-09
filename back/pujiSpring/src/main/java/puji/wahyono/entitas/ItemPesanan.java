package puji.wahyono.entitas;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@javax.persistence.Entity
@javax.persistence.Table(name="item_pesanan")
public class ItemPesanan {

	@javax.persistence.Id
	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name="nomor")
	private int nomor;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "nota", referencedColumnName = "nota")
	private Pesanan nota;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "menu", referencedColumnName = "kode")
	private Menu menu;
	@Column(name="sat")
	private BigDecimal sat;
	@Column(name="tot")
	private BigDecimal tot;

	public ItemPesanan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ItemPesanan(int nomor, Pesanan nota, Menu menu, BigDecimal sat, BigDecimal tot) {
		super();
		this.nomor = nomor;
		this.nota = nota;
		this.menu = menu;
		this.sat = sat;
		this.tot = tot;
	}

	public int getNomor() {
		return nomor;
	}

	public void setNomor(int nomor) {
		this.nomor = nomor;
	}

	public Pesanan getNota() {
		return nota;
	}

	public void setNota(Pesanan nota) {
		this.nota = nota;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public BigDecimal getSat() {
		return sat;
	}

	public void setSat(BigDecimal sat) {
		this.sat = sat;
	}

	public BigDecimal getTot() {
		return tot;
	}

	public void setTot(BigDecimal tot) {
		this.tot = tot;
	}

}
