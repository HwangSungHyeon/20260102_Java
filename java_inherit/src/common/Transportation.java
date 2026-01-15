package common;

public abstract class Transportation {
	
	protected String name;
	
	public Transportation(String name) {
		this.name = name;
	}
	public final void vehicleName() {
		System.out.println(name);
	}
	
	public abstract void speed();
	public abstract void seats();
}
