package br.com.fiap.entity;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Contrato {
	private int number;
	private Date date;
	private double valorContrato;
	private int parcelas;

	public Contrato(int number, Date date, double valorContrato, int parcelas) {
		super();
		this.number = number;
		this.date = date;
		this.valorContrato = valorContrato;
		this.parcelas = parcelas;
	}

	public void CalculoParcelas(Contrato contrato) throws ParseException {
		double valorParcelas = contrato.valorContrato / contrato.parcelas;
		for (int i = 1; contrato.parcelas >= i; i++) {

			double valorJuros = valorParcelas + (valorParcelas * 0.01) * i;
			valorJuros += valorJuros * 0.02;
			contrato.date.setMonth(contrato.date.getMonth() + 1);
			System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(date) + " - " + valorJuros + " R$");

		}
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getContractValue() {
		return valorContrato;
	}

	public void setContractValue(double contractValue) {
		this.valorContrato = contractValue;
	}

	public int getInstallments() {
		return parcelas;
	}

	public void setInstallments(int installments) {
		this.parcelas = installments;
	}

}
