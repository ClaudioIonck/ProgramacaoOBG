import java.util.HashMap;

public class PessoaDAO{
    HashMap<Integer, String> pessoas = new HashMap<Integer, String>();

    public String getById(int id){
        return pessoas.get(id);
    }

    public HashMap getAll(){
        return pessoas;
    }

    public void add(Pessoa pessoa){
        pessoas.put(pessoa.getId(), pessoa.getNome());
    }

    public void delete(Pessoa pessoa){
        pessoas.remove(pessoa.getId(), pessoa.getNome());
    }
}