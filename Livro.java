// livro pode sair da biblioteca: fica emprestado e depois volta a ficar disponível
public class Livro extends Publicacao {
    private boolean disponivel;

    public Livro(String titulo) {
        super(titulo);
        this.disponivel = true;
    }

// marca o livro como emprestado só funciona se ele estiver disponível
    public boolean emprestar() {
        if (!disponivel) {
            return false;
        }
        disponivel = false;
        return true;
    }

// devolve o livro à situação de disponível
    public boolean devolver() {
        if (disponivel) {
            return false;
        }
        disponivel = true;
        return true;
    }

// devolve o estado de disponibilidade do livro
    public boolean isDisponivel() {
        return disponivel;
    }

// devolve a situação por extenso
    public String getSituacao() {
        return disponivel ? "disponível" : "emprestado";
    }
}
