package bsu.rfe.java.group10.lab1.cehanovida.varA9;

public class Food implements Consumable {

	String name = null;
	
    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object arg0) {
        if (!(arg0 instanceof Food)) return false;
        if (name==null || ((Food)arg0).name==null) return false;
        return name.equals(((Food)arg0).name);
    }
    
    @Override
    public void consume() {
        System.out.println(name + " съедено");
    }
}