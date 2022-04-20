package br.com.fiap.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import br.com.fiap.entity.Contrato;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número do contrato !");
		System.out.print("Numero: ");
		int number = sc.nextInt();
		
		System.out.print("Data modelo (DD/MM/YYYY): ");
		String date1 = sc.next();
		Date date = sdf1.parse(date1);
		
		System.out.print("Valor do contrato: ");
		double contratoValor = sc.nextDouble();
		
		System.out.print("Digite o número de parcelas: ");
		int parcelas = sc.nextInt();
		
		Contrato contrato = new Contrato(number, date, contratoValor, parcelas);
		contrato.CalculoParcelas(contrato);
		
		
	
	}

}
