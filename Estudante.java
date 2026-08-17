import java.util.Scanner;

public class Estudante {
    private String nome;
    private double[] nota = new double[5];

    public Estudante(String nome, double[] nota) {
        this.nome = nome;
        this.nota = nota;
    }

// insereNotas – permite ler do teclado as cinco notas do estudante e as atribui às cinco posições do array.
    public void insereNotas() {
        try (Scanner entrada = new Scanner(System.in)) {
            for (int i = 0; i < nota.length; i++) {
                System.out.print("Digite a nota " + (i + 1) + ": ");
                nota[i] = entrada.nextDouble();
            }
        }
    }

// + calculaMedia – devolve o valor da média aritmética das notas do estudante
    public double calculaMedia() {
        double soma = 0;
        for (double n : nota) {
            soma += n;
        }
        return soma / nota.length;
    }

// + métodos get – são dois. O método get para as notas devolve o array de notas
    public String getNome() {
        return nome;
    }

    public double[] getNota() {
        return nota;
    }

// + menorNota – devolve o valor da menor nota do estudante
    public double menorNota() {
        double menor = nota[0];
        for (int i = 1; i < nota.length; i++) {
            if (nota[i] < menor) {
                menor = nota[i];
            }
        }
        return menor;
    }

// + aprovados – recebe um array de estudantes e devolve só aqueles aprovados (média >= 6)
    public static Estudante[] aprovados(Estudante[] estudantes) {
        if (estudantes == null || estudantes.length == 0) {
            return null;
        }

        int quantidadeAprovados = 0;
        for (Estudante estudante : estudantes) {
            if (estudante != null && estudante.calculaMedia() >= 6) {
                quantidadeAprovados++;
            }
        }

        if (quantidadeAprovados == 0) {
            return null;
        }

        Estudante[] aprovados = new Estudante[quantidadeAprovados];
        int indice = 0;

        for (Estudante estudante : estudantes) {
            if (estudante != null && estudante.calculaMedia() >= 6) {
                aprovados[indice] = estudante;
                indice++;
            }
        }

        return aprovados;
    }

    // + calculaMedia – sobrecarga para média ponderada: recebe os pesos das cinco notas
    public double calculaMedia(int[] pesos) {
        if (pesos == null || pesos.length != 5) {
            throw new IllegalArgumentException("O array de pesos deve ter exatamente 5 elementos.");
        }

        double somaPonderada = 0;
        double somaPesos = 0;

        for (int i = 0; i < 5; i++) {
            somaPonderada += nota[i] * pesos[i];
            somaPesos += pesos[i];
        }

        return somaPonderada / somaPesos;
    }
    
}
