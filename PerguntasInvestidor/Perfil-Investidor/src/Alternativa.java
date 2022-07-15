public class Alternativa {
    private String texto;
    private int pontuacao;

    public Alternativa(String texto, int pontuacao) {
        this.texto = texto;
        this.pontuacao = pontuacao;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

}
