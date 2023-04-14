package av2_LucasBarroso;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Q5_LucasBarroso {
	
	 public static void main(String[] args) throws IOException {
		 System.out.println("digite o caminho do arquivo: ");
		 Scanner s = new Scanner(System.in);
		 String path = s.nextLine();
		 BufferedReader leitor = new BufferedReader(new FileReader(path));
		 List <String> palavrasComLink = new ArrayList<String>();
		 String linha;
		 
		 while((linha = leitor.readLine())!= null) {
			 String[] palavras = linha.split("\\s+");//o "\\s+" quer dizer um ou mais espaco em branco
			 for (String palavra : palavras) {
				 if(palavra.contains("link")) {
					 palavrasComLink.add(palavra);
				 }
			 }
		 }
		 System.out.println("palavras com subsequencia link no arquivo de texto: " + palavrasComLink);
	 }
}
