package puji.wahyono;

public class Out<T> {

	private String msg;
	private T val;

	public Out() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Out(String msg, T val) {
		super();
		this.msg = msg;
		this.val = val;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getVal() {
		return val;
	}

	public void setVal(T val) {
		this.val = val;
	}

}
