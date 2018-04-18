package com.sample;

public class Celda
{
	public static final String EQUIS = "X";
	public static final String OES = "O";
	public static final String NADA = "-";

	private static final int MIN_COL = 0;
	private static final int MAX_COL = 6;
	
	private static final int MIN_FIL = 0; 
	private static final int MAX_FIL = 5;

	private int i;
	private int j;
	private String valor;

	public Celda (int ii, int jj)
	{
		i = ii;
		j = jj;
		valor = NADA;
	}
	
	public Celda (int ii, int jj, String val)
	{
		i = ii;
		j = jj;
		valor = val;
	}
	
	public String getValor ()
	{
		return valor;
	}
	
	public void setValor (String valor)
	{
		this.valor = valor;
	}
	
	public void setI (int i)
	{
		this.i = i;
	}
	public void setJ (int j)
	{
		this.j = j;
	}
	
	public int getI ()
	{
		return i;
	}
	
	public int getJ ()
	{
		return j;
	}
	
	public String toString ()
	{
		return "(" + i + ", " + j + ")";
	}
	
	public boolean esEsquina ()
	{
		return (i == MIN_FIL || i == MAX_FIL) && (j == MIN_COL || j == MAX_COL);
	}
	
	/*public int estaVacio(Celda c1) {
		
		
	}*/

	public boolean opuesta (Celda c2)
	{
		return (i == MIN_FIL && j == MIN_COL && c2.i == MAX_FIL && c2.j == MAX_COL) || 
				(i == MIN_FIL && j == MAX_COL && c2.i == MAX_FIL && c2.j == MIN_COL) || 
				(i == MAX_FIL && j == MIN_COL && c2.i == MIN_FIL && c2.j == MAX_COL) || 
				(i == MAX_FIL && j == MAX_COL && c2.i == MIN_FIL && c2.j == MIN_COL);
	}
}
