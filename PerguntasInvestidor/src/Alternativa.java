public class Alternativa {
    private String texto;
    private double pontuacao;

    public Alternativa(String texto, double pontuacao) {
        this.texto = texto;
        this.pontuacao = pontuacao;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Double getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(double pontuacao) {
        this.pontuacao = pontuacao;
    }

}
