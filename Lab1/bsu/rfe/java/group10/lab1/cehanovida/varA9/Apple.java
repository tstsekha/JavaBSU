package bsu.rfe.java.group10.lab1.cehanovida.varA9;

public class Apple extends Food {

	private String size;
	
	public Apple(String size) {
		super("Яблоко");
		this.size = size;
	}
	
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return super.toString() + " размера '" + size.toUpperCase() + "'";
		}
	
	@Override
	public void consume() {
		System.out.println(this + " съедено");
	}

	public boolean equals(Object arg0) {
		if (super.equals(arg0)) {
			if (!(arg0 instanceof Apple)) return false; // если принадлежит классу apple
			return size.equals(((Apple)arg0).size);
		}
		else
			return false;
	}
}