public abstract class Questao{
    protected final String pergunta;
    protected final double peso;
    protected double pontuacaoResposta;

    public Questao(String pergunta, double peso) {
        this.pergunta = pergunta + "?";
        this.peso = peso;
    }

    public String getPergunta() {
        return pergunta;
    }
    public double getPeso() {
        return peso;
    }

    public double getPontuacaoResposta() {
        return pontuacaoResposta;
    }
    
}
