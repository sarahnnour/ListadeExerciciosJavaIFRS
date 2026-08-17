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
    
}
