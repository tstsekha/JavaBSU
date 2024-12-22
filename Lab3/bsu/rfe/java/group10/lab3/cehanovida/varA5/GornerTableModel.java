package bsu.rfe.java.group10.lab3.cehanovida.varA5;

import javax.swing.table.AbstractTableModel;

@SuppressWarnings("serial")
public class GornerTableModel extends AbstractTableModel {
	private Double[] coefficients;
	private Double from;
	private Double to;
	private Double step;

	public GornerTableModel(Double from, Double to, Double step, Double[] coefficients) {
		this.from = from;
		this.to = to;
		this.step = step;
		this.setCoefficients(coefficients);
	}

	public Double getFrom() {
		return from;
	}

	public Double getTo() {
		return to;
	}

	public Double getStep() {
		return step;
	}

	public int getColumnCount() {
		return 3; 
	}

	public int getRowCount() { // Вычислить количество точек между началом и концом отрезка исходя из шага табулирования
		return new Double(Math.ceil((to - from) / step)).intValue() + 1;
	}

	public Object getValueAt(int row, int col) {
		double x = from + step * row; // Вычислить значение X как НАЧАЛО_ОТРЕЗКА + ШАГ*НОМЕР_СТРОКИ
		
		Double result = 0.0;
        for (int i = coefficients.length - 1; i >= 0; i--) {
            result = result * x + coefficients[i];
        }
		
        double primitiveValue = result;
        primitiveValue = primitiveValue - Math.floor(primitiveValue);
        double sqrt = Math.sqrt(primitiveValue * 100);
        Boolean trig1 = true;
        if (sqrt <= 0) {
        	trig1 = false;
        }
        else {
        	trig1 = sqrt == Math.floor(sqrt);
        }
        
		switch(col) {
		case 0:
			return x;
		case 1:
	        return result;
		case 2:
			return trig1;
		}
		return 0;
	}

	public String getColumnName(int col) {
		switch (col) {
		case 0:
			return "Значение X"; // Название 1-го столбца
		case 1:
			return "Значение многочлена"; // Название 2-го столбца
		case 2:
			return "Дробная часть является квадратом?";
		}
		return null;
	}

	public Class<?> getColumnClass(int col) {
		switch(col) {
		case 0:
			return Double.class;
		case 1:
			return Double.class;
		case 2:
			return Boolean.class;
		}
		return null;
	}

	public Double[] getCoefficients() {
		return coefficients;
	}

	public void setCoefficients(Double[] coefficients) {
		this.coefficients = coefficients;
	}
}
