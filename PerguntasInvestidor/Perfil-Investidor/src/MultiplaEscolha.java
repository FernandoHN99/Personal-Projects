import java.util.ArrayList;
import java.util.*;

public class MultiplaEscolha extends Questao{
    private static final List<String>  listAlternativasSimbolos = Arrays.asList("a","b","c","d","e","f","g","h","i");
    private ArrayList<Alternativa> listAlternativas = new ArrayList<Alternativa>();
    private int indiceResposta;


    public MultiplaEscolha(String pergunta, double peso, ArrayList<Alternativa> listAlternativas) {
        super(pergunta, peso);
        this.listAlternativas = listAlternativas;
    }

    public void mostrarQuestao(){
        System.out.println(super.getPergunta());

        for(int i=0; i<listAlternativas.size(); i++)
            System.out.println(listAlternativasSimbolos.get(i) + "-) " + listAlternativas.get(i).getTexto());
    }

    public void preencherRespostaMultiplaEscolha(int indiceResposta){
        setIndiceResposta(indiceResposta);
        int pontuacaoResposta = getListAlternativas().get(getIndiceResposta()).getPontuacao();
        setPontuacaoResposta(pontuacaoResposta);
    }


    public ArrayList<Alternativa> getListAlternativas() {
        return listAlternativas;
    }

    public int getIndiceResposta() {
        return indiceResposta;
    }

    public void setIndiceResposta(int indiceResposta) {
        this.indiceResposta = indiceResposta;
    }

    @Override
    public String toString() {
        return "MultiplaEscolha [indiceResposta=" + this.indiceResposta + ", pontuacaoResposta=" + super.pontuacaoResposta + "]";
    }

    public static List<String> getlistAlternativasSimbolos() {
        return listAlternativasSimbolos;
    }
 
}
