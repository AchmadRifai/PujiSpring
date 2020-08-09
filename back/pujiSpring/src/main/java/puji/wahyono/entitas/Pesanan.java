package puji.wahyono.entitas;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@javax.persistence.Entity
@javax.persistence.Table(name="pesanan")
public class Pesanan {

	@javax.persistence.Id
	@Column(name="nota")
	private String nota;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "meja", referencedColumnName = "nomor")
	private Meja meja;
	@Column(name="tgl")
	private Date tgl;
	@Column(name="jam")
	private Time jam;
	@Column(name="byr")
	private BigDecimal byr;
	@Column(name="susuk")
	private BigDecimal susuk;
	@Column(name="total")
	private BigDecimal total;
	@Column(name="terima")
	private boolean terima;
	@Column(name="cetak")
	private boolean cetak;
	@Column(name="pergi")
	private boolean pergi;

	public Pesanan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pesanan(String nota, Meja meja, Date tgl, Time jam, BigDecimal byr, BigDecimal susuk, BigDecimal total,
			boolean terima, boolean cetak, boolean pergi) {
		super();
		this.nota = nota;
		this.meja = meja;
		this.tgl = tgl;
		this.jam = jam;
		this.byr = byr;
		this.susuk = susuk;
		this.total = total;
		this.terima = terima;
		this.cetak = cetak;
		this.pergi = pergi;
	}

	public String getNota() {
		return nota;
	}

	public void setNota(String nota) {
		this.nota = nota;
	}

	public Meja getMeja() {
		return meja;
	}

	public void setMeja(Meja meja) {
		this.meja = meja;
	}

	public Date getTgl() {
		return tgl;
	}

	public void setTgl(Date tgl) {
		this.tgl = tgl;
	}

	public Time getJam() {
		return jam;
	}

	public void setJam(Time jam) {
		this.jam = jam;
	}

	public BigDecimal getByr() {
		return byr;
	}

	public void setByr(BigDecimal byr) {
		this.byr = byr;
	}

	public BigDecimal getSusuk() {
		return susuk;
	}

	public void setSusuk(BigDecimal susuk) {
		this.susuk = susuk;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public boolean isTerima() {
		return terima;
	}

	public void setTerima(boolean terima) {
		this.terima = terima;
	}

	public boolean isCetak() {
		return cetak;
	}

	public void setCetak(boolean cetak) {
		this.cetak = cetak;
	}

	public boolean isPergi() {
		return pergi;
	}

	public void setPergi(boolean pergi) {
		this.pergi = pergi;
	}

}
