import java.util.ArrayList;
import java.util.*;


public class Sistema {
    //****************Variaveis necessarias para Sistema admnistrar questoes ****************
    private Scanner input = new Scanner(System.in);
    private ArrayList<Alternativa> listAlternativas  = new ArrayList<Alternativa>();
    private ArrayList<MultiplaEscolha> listMultiplaEscolhas = new ArrayList<MultiplaEscolha>();
    private int totalDePontosUsuario, pontosConservador, pontosModerado, pontosAgressivo;


    public void run(){
        //****************Limpar Tela****************
        Util.clearScreen();

        //****************Questão 1****************
        
        listAlternativas.add(new Alternativa("Curto-Prazo",1));
        listAlternativas.add(new Alternativa("Médio-Prazo", 6));
        listAlternativas.add(new Alternativa("Longo-Prazo", 11));
        MultiplaEscolha questao1 = new MultiplaEscolha("Qual o prazo de seus investimentos", 1, listAlternativas);
        listAlternativas  = new ArrayList<Alternativa>();
        
        //****************Questão 2****************
        listAlternativas.add(new Alternativa("0%-20%",1));
        listAlternativas.add(new Alternativa("20%-40%", 3));
        listAlternativas.add(new Alternativa("40%-60%", 5));
        listAlternativas.add(new Alternativa("60%-80%", 7));
        listAlternativas.add(new Alternativa("80%-100%", 9));
        MultiplaEscolha questao2 = new MultiplaEscolha("Qual a porcentagem do patrimônio está em bitcoin", 1, listAlternativas);
        listAlternativas  = new ArrayList<Alternativa>();
        

        //****************Exibição das Questões e Respotas****************
        listMultiplaEscolhas.add(questao1);
        listMultiplaEscolhas.add(questao2);
        exibirFormulario(listMultiplaEscolhas);
        mostrarTodasRespostas(listMultiplaEscolhas);
    }

    private void exibirFormulario(ArrayList<MultiplaEscolha> listMultiplaEscolhas){
        for(MultiplaEscolha questao : listMultiplaEscolhas){
            questao.mostrarQuestao();
            interacaoComUsuario(questao);
            totalDePontosUsuario += questao.pontuacaoResposta;
        }
    }

    private void mostrarTodasRespostas(ArrayList<MultiplaEscolha> listMultiplaEscolhas){
        for(MultiplaEscolha questao : listMultiplaEscolhas){
            System.out.println(questao.toString()); 
        }
        System.out.println("totalDePontosUsuario: " + totalDePontosUsuario);
    }

    private void interacaoComUsuario(MultiplaEscolha questao){
        int indiceResposta = -1;
        while(indiceResposta == -1){
            System.out.println("Digite a alternativa desejada: ");
            indiceResposta = MultiplaEscolha.getlistAlternativasSimbolos().indexOf(input.next());
        }
        questao.preencherRespostaMultiplaEscolha(indiceResposta);
        Util.clearScreen();

    }

    private void calcularPerfilDoInvestidor(MultiplaEscolha questao){
        
    }

}
