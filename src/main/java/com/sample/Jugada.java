package com.sample;

public class Jugada 
{
	int fila;
	int col;
	String ficha;
	boolean analizada;
	
	public Jugada() 
	{
		fila = -1;
		col = -1;
		analizada = false;
		ficha = Celda.OES;
	}

	public Jugada(int fila, int col) 
	{
		this.fila = fila;
		this.col = col;
		analizada = false;
		ficha = Celda.OES;
	}

	public String getFicha() 
	{
		return ficha;
	}

	public void setFicha(String pFicha) 
	{
		ficha = pFicha;
	}

	public boolean getAnalizada () 
	{
		return analizada;
	}

	public void setAnalizada(boolean estado) 
	{
		analizada = estado;
	}

	public int getFila() 
	{
		return fila;
	}

	public int getCol() 
	{
		return col;
	}
	
	public void setFila(int f) 
	{
		fila = f;
	}

	public void setCol(int c) 
	{
		col = c;
	}
	
}
