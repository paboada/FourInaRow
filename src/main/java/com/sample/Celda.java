package com.sample;

public class Celda
{
	public static final String EQUIS = "X";
	public static final String OES = "O";
	public static final String NADA = "-";

	private static final int MIN = 0;
	private static final int MAX = 2;

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
		return (i == MIN || i == MAX) && (j == MIN || j == MAX);
	}

	public boolean opuesta (Celda c2)
	{
		return (i == MIN && j == MIN && c2.i == MAX && c2.j == MAX) || 
				(i == MIN && j == MAX && c2.i == MAX && c2.j == MIN) || 
				(i == MAX && j == MIN && c2.i == MIN && c2.j == MAX) || 
				(i == MAX && j == MAX && c2.i == MIN && c2.j == MIN);
	}
}
