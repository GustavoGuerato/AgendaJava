package Agenda;

public class Main {
    public static void main(String[] args) {

        Agenda minhaAgenda = new Agenda(10);

        Contato contato1 = new Contato("Alice", 123456789, "alice@example.com");
        Contato contato2 = new Contato("Bob", 987654321, "bob@example.com");

        minhaAgenda.adicionarContato(contato1);
        minhaAgenda.adicionarContato(contato2);

        System.out.println("Contatos na agenda:");
        minhaAgenda.listarContatos();

        Contato contatoBuscado = minhaAgenda.buscarContato("Alice");
        if (contatoBuscado != null) {
            System.out.println("Contato encontrado: " + contatoBuscado);
        } else {
            System.out.println("Contato não encontrado.");
        }

        minhaAgenda.removerContato("Bob");

        System.out.println("Contatos na agenda após a remoção:");
        minhaAgenda.listarContatos();
    }
}
