package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.PessoaJuridica;
import entities.Pessoafisica;
import entities.RendaAnual;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		List<RendaAnual> list = new ArrayList<>();
		
		for(int i = 1;i <=n;i++) {
			System.out.println("Tax payer #" +i+ " data:");
			System.out.println("Individual or company (i/c)?");
			char c = sc.next().charAt(0);
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Anual income:");
			double rendaanual = sc.nextDouble();
			if(c == 'i') {
				System.out.println("Health expenditures: ");
				double planodesaude = sc.nextDouble();
				RendaAnual ren = new Pessoafisica(name, rendaanual, planodesaude);
				list.add(ren);
			}
			else {
				System.out.println("Number of employees: ");
				int numerodef = sc.nextInt();
				RendaAnual ren = new PessoaJuridica(name, rendaanual, numerodef);
				list.add(ren);
			}
			}
		
		System.out.println("TAXES PAID: ");
		for(RendaAnual ren: list) {
			System.out.println(ren.getName()+" $"+ren.tax());
		}
		double sum = 0;
		for(RendaAnual ren: list) {
			
			sum += ren.tax();
		}
		System.out.println("TOTAL TAXES: $" + sum);
		
		sc.close();

	}

}
