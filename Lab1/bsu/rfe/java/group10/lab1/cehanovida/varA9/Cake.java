package bsu.rfe.java.group10.lab1.cehanovida.varA9;

public class Cake extends Food {

	private String icing;
	
	public Cake(String icing) {
		super("Пирожное");
		this.icing = icing;
	}
	
	public String getSize() {
		return icing;
	}

	public void setSize(String icing) {
		this.icing = icing;
	}

	@Override
	public String toString() {
		return super.toString() + " с глазурью '" + icing.toUpperCase() + "'";
		}
	
	@Override
	public void consume() {
		System.out.println(this + " съедено");
	}
}