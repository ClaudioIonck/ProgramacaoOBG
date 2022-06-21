import java.util.*;
import java.util.HashMap;
public class Pessoa_PessoaDAO {
    public static void main(String[] args) {
        HashMap<Integer,String> pessoa = new HashMap<>();
        pessoa.put(1, "Cláudio");
        pessoa.put(2, "Luiz");
        pessoa.put(3, "Defrein");
        pessoa.put(4, "Ionck" );
        pessoa.put(5, null);

        // todos os valores de pessoa
        System.out.println("Lista de pessoas");
        for(Map.Entry<Integer, String> entry : pessoa.entrySet()){

            System.out.println("Numero total de pessoas: "+entry.getKey()+"Nome: "+entry.getValue());
        }

        System.out.println("Total de pessoas "+pessoa.size());
        String antigo = pessoa.replace(1, "Claudio");
        System.out.println("Nome alterado: "+pessoa.get(1));
        String removido = pessoa.remove(2);
        System.out.println("Pessoa excluida "+removido);

        for(Map.Entry<Integer, String> entry : pessoa.entrySet()){
            if(entry.getValue() == null){
                System.out.println("Pessoa sem nome"+entry.getKey());
            }
        }

        System.out.println("Lista de pessoas: ");
        for(Map.Entry<Integer, String> entry : pessoa.entrySet()){
            System.out.println("Numero de pessoas: "+entry.getKey()+" Nome: "+entry.getValue());
        }

    }
}
