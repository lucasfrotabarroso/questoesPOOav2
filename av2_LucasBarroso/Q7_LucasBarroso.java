package av2_LucasBarroso;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileReader;

public class Q7_LucasBarroso {
	public static void main (String [] args) throws IOException {
		System.out.println("digite o caminho do arquivo: ");
		Scanner s = new Scanner(System.in);
		String path = s.nextLine();
		BufferedReader leitor = new BufferedReader(new FileReader(path)); //ler o txt
		
		String linha;
		int numero;
		int soma = 0;
		String [] palavra;
		ArrayList <Integer> listaNumeros = new ArrayList<Integer>();
		
		while ((linha = leitor.readLine()) != null){ //ler todas as linhas do txt
			palavra = linha.split("\\s+"); //vai pegar cada palavra do texto
			for (String p : palavra) { //vai analisar cada letra da palavra
				try {
					int num = Integer.parseInt(p); // vai tentar transformar para inteiro e armazenar na variavel num
					soma += num; // vai somar cada num
					listaNumeros.add(num); //vai guardar no arraylist o numero
				}catch(NumberFormatException e) {}
									
								
			}
			
		}
		System.out.println("o documento tem esses numeros: " + listaNumeros + " e somando todos vai dar : "+ soma);
		 
	
	}
}
