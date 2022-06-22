public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa(1, "Claudio");
        Pessoa pessoa2 = new Pessoa(2, "Luiz");
        Pessoa pessoa3 = new Pessoa(3, "Defrein");
        Pessoa pessoa4 = new Pessoa(4, "Ionck");
        PessoaDAO pessoaDAO = new PessoaDAO();


        pessoaDAO.add(pessoa1);
        pessoaDAO.add(pessoa2);
        pessoaDAO.add(pessoa3);
        pessoaDAO.add(pessoa4);
        System.out.println(pessoaDAO.getAll());

        pessoaDAO.delete(pessoa2);
        System.out.println(pessoaDAO.getAll());
    }
}