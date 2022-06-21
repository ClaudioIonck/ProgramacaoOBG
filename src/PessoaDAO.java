// Com entrada de dados...

import java.util.ArrayList;
import java.util.Scanner;

public class PessoaDAO {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        ArrayList<Pessoa> lista = new ArrayList<Pessoa>();

        char controle = 's';
        do {
            System.out.println("Digite o nome: ");
            String n = leia.next();
            System.out.println("Digite a codigo: ");
            int i = leia.nextInt();
            Pessoa p = new Pessoa(n,i);
            lista.add(p);
            System.out.println("Deseja cadastrar outra pessoa? s ou S para sim. Ou qualquer outra letra para finalizar");
            controle = leia.next().charAt(0);
        }while(controle == 's' || controle == 'S');

        for (Pessoa i: lista){
            System.out.println(i);
        }

        String nome = lista.get(0).getNome();
        int codigo = lista.get(0).getCodigo();

        System.out.println("Nome: "+nome+"; codigo: "+codigo);
    }
}
