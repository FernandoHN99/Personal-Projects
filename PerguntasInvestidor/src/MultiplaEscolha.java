import java.util.ArrayList;

public class MultiplaEscolha extends Questao{
    private ArrayList<Alternativa> listAlternativas = new ArrayList<Alternativa>();
    private double pontosConservador, pontosConservadorMediano, pontosModerado, pontosAgressivoMediano, pontosAgressivo;

    private int qtdeAlternativas;

    public MultiplaEscolha(String pergunta, double peso, ArrayList<Alternativa> listAlternativas) {
        super(pergunta, peso);
        this.listAlternativas = listAlternativas;
        this.qtdeAlternativas = this.listAlternativas.size();
        this.pontuacaoMinima = 0;
        this.pontuacaoMaxima = 999;
        setDePontosAlternativas();
        setDePontosMultiplaEcolha();
    }

    public MultiplaEscolha(String pergunta, double peso, double pontuacaoMinima, double pontuacaoMaxima, ArrayList<Alternativa> listAlternativas) {
        super(pergunta, peso);
        this.listAlternativas = listAlternativas;
        this.qtdeAlternativas = this.listAlternativas.size();
        super.pontuacaoMinima = pontuacaoMinima;
        super.pontuacaoMaxima = pontuacaoMaxima;
        setDePontosAlternativas();
        setDePontosMultiplaEcolha();
    }

    public void mostrarQuestao(){
        System.out.println(super.pergunta);
        for(int i=0; i<listAlternativas.size(); i++)
            System.out.println(Formulario.listAlternativasSimbolos.get(i) + "-) " + listAlternativas.get(i).getTexto());
    }

    private double calcularDesvioPadrao(double media){
        double desvioPadrao = 0;
        for (Alternativa alternativa : listAlternativas) {
            desvioPadrao += Math.pow(alternativa.getPontuacao() - media, 2);
        }
        return desvioPadrao = Math.sqrt(desvioPadrao / qtdeAlternativas); 
    }

    private double calcularMedia(){
        double media = 0;
        for (Alternativa alternativa : this.listAlternativas) {
            media += alternativa.getPontuacao();
        }
        return media = (media/qtdeAlternativas);
    }

    private void setDePontosMultiplaEcolha(){
        double media = calcularMedia();
        double desvioPadrao = calcularDesvioPadrao(media);
        this.pontosConservador = media - desvioPadrao;
        this.pontosModerado    = media;
        this.pontosAgressivo   = media + desvioPadrao;
    }

    private void setDePontosAlternativas(){
        for (int i = 0; i < qtdeAlternativas; i++) {
            this.listAlternativas.get(i).setPontuacao((i+1)*super.peso);
        }
    }

    public int getQtdeAlternativas() {
        return qtdeAlternativas;
    }

    public double getPontosAgressivo() {
        return pontosAgressivo;
    }

    public ArrayList<Alternativa> getListAlternativas() {
        return listAlternativas;
    }

    public double getPontosConservador() {
        return pontosConservador;
    }

    public double getPontosModerado() {
        return pontosModerado;
    }

    public double getPontuacaoMinima() {
        return pontuacaoMinima;
    }

    public double getPontosAgressivoMediano() {
        return pontosAgressivoMediano;
    }

    public double getPontosConservadorMediano() {
        return pontosConservadorMediano;
    }

 
}
