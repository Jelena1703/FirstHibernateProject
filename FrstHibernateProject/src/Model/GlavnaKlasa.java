package Model;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import bussinesService.CrudMetode;

public class GlavnaKlasa {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Unesite id marke: ");
		int idMarke = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Unesite zemlju:  ");
        String zemlja = scanner.nextLine();
		
	scanner.close();
	
	CrudMetode metode = new CrudMetode();
	
metode.azurirajZemlju(idMarke, zemlja);

	}

}
