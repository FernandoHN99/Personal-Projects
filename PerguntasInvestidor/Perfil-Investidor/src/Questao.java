public abstract class Questao{
    protected final String pergunta;
    protected final double peso;
    protected int pontuacaoResposta;

    public Questao(String pergunta, double peso) {
        this.pergunta = pergunta + " ?";
        this.peso = peso;
    }

    public String getPergunta() {
        return pergunta;
    }
    public double getPeso() {
        return peso;
    }

    public int getPontuacaoResposta() {
        return pontuacaoResposta;
    }

    public void setPontuacaoResposta(int pontuacaoResposta) {
        this.pontuacaoResposta = pontuacaoResposta;
    }
    
}
