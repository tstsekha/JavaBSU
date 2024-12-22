package bsu.rfe.java.group10.lab1.cehanovida.varA9;

public class Cheese extends Food {
	
	private String sort;
	
    public Cheese(String sort) {
        super("Сыр");
        this.sort = sort;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }
    
    public void consume() {
        System.out.println(this + " съеден");
    }

    public String toString() {
        return super.toString() + " сорт '" + sort.toUpperCase() + "'";
    }
    
    @Override
    public boolean equals(Object arg0) {
        if (super.equals(arg0)) {
            if (!(arg0 instanceof Cheese)) return false;
            return sort.equals(((Cheese)arg0).sort);
        }
        else
            return false;
    }
    
}