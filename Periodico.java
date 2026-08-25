// periódico nao sai da biblioteca, por isso nao tem emprestimo nem situacao
public class Periodico extends Publicacao {
    private int numeroVolume;

    public Periodico(String titulo, int numeroVolume) {
        super(titulo);
        this.numeroVolume = numeroVolume;
    }

// + metodo get do volume
    public int getNumeroVolume() {
        return numeroVolume;
    }
}
