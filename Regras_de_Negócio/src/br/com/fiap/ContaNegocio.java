package br.com.fiap;

import java.sql.Date;
import java.util.Scanner;

public class ContaNegocio {
	
	Scanner c = new Scanner(System.in);
	
	private int numeroContrato;
	private double vl_totalContrato;
	private Date dtContrato;
	private int numParcelas = 3;
	private double vParcela;
	private double juros = numParcelas;

	public ContaNegocio(Scanner c, int numeroContrato, double vl_totalContrato, Date dtContrato, int numParcelas, double vParcela) {
		super();
		this.c = c;
		this.numeroContrato = numeroContrato;
		this.vl_totalContrato = vl_totalContrato;
		this.dtContrato = dtContrato;
		this.numParcelas = numParcelas;
		this.vParcela = vParcela;
	}
	
	public void calcularContrato (double vl_totalContrato) {
		vParcela = vl_totalContrato / numParcelas;
		System.out.println("Entre com o valor do contrato :");
	}
	
	public void calcularP1(double vl_totalContrato) {
		vParcela = (vParcela + vParcela * 0.01) + 0.02 ;
	}
	public void calcularP2(double vl_totalContrato) {
		numParcelas += vl_totalContrato;
	}
	public void calcularP3(double vl_totalContrato) {
		numParcelas += vl_totalContrato;
	}
	public Scanner getC() {
		return c;
	}


	public void setC(Scanner c) {
		this.c = c;
	}


	public int getNumeroContrato() {
		return numeroContrato;
	}


	public void setNumeroContrato(int numeroContrato) {
		this.numeroContrato = numeroContrato;
	}


	public double getVl_totalContrato() {
		return vl_totalContrato;
	}


	public void setVl_totalContrato(double vl_totalContrato) {
		this.vl_totalContrato = vl_totalContrato;
	}


	public Date getDtContrato() {
		return dtContrato;
	}


	public void setDtContrato(Date dtContrato) {
		this.dtContrato = dtContrato;
	}


	public int getNumParcelas() {
		return numParcelas;
	}


	public void setNumParcelas(int numParcelas) {
		this.numParcelas = numParcelas;
	}

	
	
	
	
}
