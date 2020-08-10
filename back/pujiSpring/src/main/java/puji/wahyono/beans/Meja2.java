package puji.wahyono.beans;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;
import java.util.List;

import puji.wahyono.entitas.ItemPesanan;
import puji.wahyono.entitas.Meja;

public class Meja2 {

	private String nota;
	private Meja meja;
	private Date tgl;
	private Time jam;
	private BigDecimal byr, susuk, total;
	private boolean terima, cetak, pergi;
	private List<ItemPesanan> items;

	public Meja2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Meja2(String nota, Meja meja, Date tgl, Time jam, BigDecimal byr, BigDecimal susuk, BigDecimal total,
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
		items = new java.util.LinkedList<>();
	}

	public Meja2(String nota, Meja meja, Date tgl, Time jam, BigDecimal byr, BigDecimal susuk, BigDecimal total,
			boolean terima, boolean cetak, boolean pergi, List<ItemPesanan> items) {
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
		this.items = items;
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

	public List<ItemPesanan> getItems() {
		return items;
	}

	public void setItems(List<ItemPesanan> items) {
		this.items = items;
	}

}
