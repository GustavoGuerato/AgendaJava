package Agenda;

class Agenda {
    private Contato[] contatos;
    private int quantidade;

    // Construtor da classe Agenda
    public Agenda(int tamanho) {
        this.contatos = new Contato[tamanho];
        this.quantidade = 0;
    }

    // Método para adicionar um contato
    public boolean adicionarContato(Contato contato) {
        if (quantidade < contatos.length) {
            contatos[quantidade] = contato;
            quantidade++;
            return true;
        } else {
            System.out.println("Agenda cheia! Não é possível adicionar mais contatos.");
            return false;
        }
    }

    // Método para remover um contato pelo nome
    public boolean removerContato(String nome) {
        for (int i = 0; i < quantidade; i++) {
            if (contatos[i].getNome().equals(nome)) {
                contatos[i] = contatos[quantidade - 1]; // Substitui o contato removido pelo último
                contatos[quantidade - 1] = null;
                quantidade--;
                return true;
            }
        }
        System.out.println("Contato não encontrado.");
        return false;
    }

    // Método para buscar um contato pelo nome
    public Contato buscarContato(String nome) {
        for (int i = 0; i < quantidade; i++) {
            if (contatos[i].getNome().equals(nome)) {
                return contatos[i];
            }
        }
        return null; // Retorna null se não encontrar o contato
    }

    // Método para listar todos os contatos
    public void listarContatos() {
        if (quantidade == 0) {
            System.out.println("Agenda vazia.");
        } else {
            for (int i = 0; i < quantidade; i++) {
                System.out.println(contatos[i]);
            }
        }
    }
}
