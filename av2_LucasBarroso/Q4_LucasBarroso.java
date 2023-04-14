
package av2_LucasBarroso;
import java.util.*;

public class Q4_LucasBarroso {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a string:");
        String a = s.nextLine();
        String [] tokens = a.split(" "); //vai separar a minha frase em uma substring sempre que estiver um espaco 
        for (String token : tokens) { //o token e cada palara e o toKENS e a frase toda
       
            if (token.startsWith("s") || token.startsWith("S")) { 
            	System.out.println("os tokens que comecam com s : ");
            
            	System.out.println(token);
            }
            
            	                   
        }
    }
}

