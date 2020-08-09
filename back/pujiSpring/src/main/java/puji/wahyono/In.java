package puji.wahyono;

public class In<T, W> {

	private W what;
	private T val;

	public In() {
		super();
		// TODO Auto-generated constructor stub
	}

	public In(W what, T val) {
		super();
		this.what = what;
		this.val = val;
	}

	public W getWhat() {
		return what;
	}

	public void setWhat(W what) {
		this.what = what;
	}

	public T getVal() {
		return val;
	}

	public void setVal(T val) {
		this.val = val;
	}

}
