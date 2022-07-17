import java.util.ArrayList;
import java.util.*;

public class MultiplaEscolha extends Questao{
    private static final List<String>  listAlternativasSimbolos = Arrays.asList("a","b","c","d","e","f");
    private double pontosConservador, pontosModerado, media, desvioPadrao;
    private ArrayList<Alternativa> listAlternativas = new ArrayList<Alternativa>();
    private int qtdeAlternativas;

    public int getQtdeAlternativas() {
        return qtdeAlternativas;
    }

    public MultiplaEscolha(String pergunta, double peso, ArrayList<Alternativa> listAlternativas) {
        super(pergunta, peso);
        this.listAlternativas = listAlternativas;
        this.qtdeAlternativas = this.listAlternativas.size();
        setDePontosAlternativas();
        setDePontosMultiplaEcolha();
    }

    public void mostrarQuestao(){
        System.out.println(super.pergunta);
        for(int i=0; i<listAlternativas.size(); i++)
            System.out.println(listAlternativasSimbolos.get(i) + "-) " + listAlternativas.get(i).getTexto());
    }


    public void desvioPadraoArray(){
        double auxDesvioPadrao = 0;
        for (Alternativa alternativa : listAlternativas) {
            auxDesvioPadrao += Math.pow(alternativa.getPontuacao() - this.media, 2);
        }
        this.desvioPadrao = Math.sqrt(auxDesvioPadrao / qtdeAlternativas); 
    }

    public void mediaArray(){
        double auxMedia = 0;
        for (Alternativa alternativa : this.listAlternativas) {
            auxMedia += alternativa.getPontuacao();
        }
        this.media = auxMedia / qtdeAlternativas ;
    }

    public void setDePontosMultiplaEcolha(){
        mediaArray();
        desvioPadraoArray();
        this.pontosConservador = (2*media - desvioPadrao)/2;
        this.pontosModerado    = (2*media + desvioPadrao)/2;
    }

    public void setDePontosAlternativas(){
        for (int i = 0; i < qtdeAlternativas; i++) {
            this.listAlternativas.get(i).setPontuacao((i+1)*super.peso);
        }
    }

    public ArrayList<Alternativa> getListAlternativas() {
        return listAlternativas;
    }

    public static List<String> getlistAlternativasSimbolos() {
        return listAlternativasSimbolos;
    }

    public double getPontosConservador() {
        return pontosConservador;
    }

    public double getPontosModerado() {
        return pontosModerado;
    }


 
}
