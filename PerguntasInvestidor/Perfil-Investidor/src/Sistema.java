import java.util.ArrayList;


public class Sistema {
    //****************Variaveis necessarias para Sistema admnistrar questoes ****************
    public static double totalPontosConservador, totalPontosModerado, totalPontosAgressivo;
    private static ArrayList<MultiplaEscolha> listMultiplaEscolhas = new ArrayList<MultiplaEscolha>();
    private ArrayList<Alternativa> listAlternativas  = new ArrayList<Alternativa>();

    public void run(){
        //****************Limpar Tela****************
        Util.clearScreen();

        //****************Criação Questão 1****************
        
        listAlternativas.add(new Alternativa("Curto-Prazo",1));
        listAlternativas.add(new Alternativa("Médio-Prazo", 2));
        listAlternativas.add(new Alternativa("Longo-Prazo", 3));
        MultiplaEscolha questao1 = new MultiplaEscolha("Qual o prazo de seus investimentos", 1, listAlternativas);
        
        listMultiplaEscolhas.add(questao1);
        listAlternativas  = new ArrayList<Alternativa>();
        
        //****************Criação Questão 2****************
        listAlternativas.add(new Alternativa("0%-20%",1));
        listAlternativas.add(new Alternativa("20%-40%", 2));
        listAlternativas.add(new Alternativa("40%-60%", 3));
        listAlternativas.add(new Alternativa("60%-80%", 4));
        listAlternativas.add(new Alternativa("80%-100%", 5));
        MultiplaEscolha questao2 = new MultiplaEscolha("Qual a porcentagem do patrimônio está em bitcoin", 1, listAlternativas);
        
        listMultiplaEscolhas.add(questao2);
        listAlternativas  = new ArrayList<Alternativa>();
        
        //****************Criação dos Usuarios****************
        Usuario user1 = new Usuario("Fernando");
        Usuario user2 = new Usuario("Vinincius");
        
        //****************Interação com Usuarios****************
        
        somarPontosQuestoes();
        iniciarFormulario(user1);
        iniciarFormulario(user2);
        
        //****************Exibição de Interface e Pefil do Investidor****************
        user1.exibirPerfilDoInvestidor();
        user2.exibirPerfilDoInvestidor();
    }

    private void somarPontosQuestoes(){
        for (MultiplaEscolha questao : Sistema.listMultiplaEscolhas){
            totalPontosConservador += questao.getPontosConservador();
            totalPontosConservador += questao.getPontosConservador();
            totalPontosConservador += questao.getPontosConservador();
        }
    }

    public void iniciarFormulario(Usuario user){
        for (MultiplaEscolha questao : Sistema.listMultiplaEscolhas) {
            user.responderPergunta(questao);
        }
    }

}
