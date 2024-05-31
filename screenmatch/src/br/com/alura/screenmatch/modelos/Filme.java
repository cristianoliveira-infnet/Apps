public class Filme {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalAvaliacoes;
    private int duracaoEmMinutos;

    public Filme(String nome, int anoDeLancamento, int duracaoEmMinutos) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica() {
        System.out.println("Nome do filme: "+this.nome);
        System.out.println("Ano de Lancamento: "+this.anoDeLancamento+" min");
        System.out.println("Duração: "+this.duracaoEmMinutos);
    }

    public void avaliaFilme(double nota) {
        totalAvaliacoes++;
        this.somaDasAvaliacoes += nota;
    }

    public double obterMediaDasAvaliacoes() {
        return Math.floor(somaDasAvaliacoes/totalAvaliacoes);
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }
}
