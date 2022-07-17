import java.util.ArrayList;
public class Sistema {
    //****************Variaveis statics necessarias para Sistema administrar questoes ****************
    public static double totalPontosConservador, totalPontosModerado;
    private static ArrayList<MultiplaEscolha> listMultiplaEscolhas = new ArrayList<MultiplaEscolha>();
    
    public static void main(String[] args) throws Exception {
        ArrayList<Alternativa> listAlternativas;
        //****************Limpar Tela****************
        Util.clearScreen();

        //****************Criação Questão 1****************
        listAlternativas = new ArrayList<Alternativa>();
        listAlternativas.add(new Alternativa("Curto-Prazo"));
        listAlternativas.add(new Alternativa("Médio-Prazo"));
        listAlternativas.add(new Alternativa("Longo-Prazo"));
        MultiplaEscolha questao1 = new MultiplaEscolha("Qual o prazo de seus investimentos", 1, listAlternativas);
        listMultiplaEscolhas.add(questao1);
        
        
        //****************Criação Questão 2****************
        listAlternativas = new ArrayList<Alternativa>();
        listAlternativas.add(new Alternativa("0%-20%"));
        listAlternativas.add(new Alternativa("20%-40%"));
        listAlternativas.add(new Alternativa("40%-60%"));
        listAlternativas.add(new Alternativa("60%-80%"));
        listAlternativas.add(new Alternativa("80%-100%"));
        MultiplaEscolha questao2 = new MultiplaEscolha("Qual a porcentagem do seu patrimônio está em bitcoin", 1, listAlternativas);
        listMultiplaEscolhas.add(questao2);
        
        //****************Calculo das Alternativas****************
        calcularPontosParaPerfil();

        //****************Criação dos Usuarios****************
        Usuario user1 = new Usuario("Fernando");
        Usuario user2 = new Usuario("Vinincius");
        
        //****************Interação com Usuarios****************
        iniciarFormulario(user1);
        iniciarFormulario(user2);
        
        //****************Exibição de Interface e Pefil do Investidor****************
        user1.exibirPerfilDoInvestidor();
        user2.exibirPerfilDoInvestidor();
    }

    private static void calcularPontosParaPerfil(){
        for (MultiplaEscolha questao : Sistema.listMultiplaEscolhas){
            totalPontosConservador += questao.getPontosConservador();
            totalPontosModerado += questao.getPontosModerado();
        }
    }

    public static void iniciarFormulario(Usuario user){
        for (MultiplaEscolha questao : Sistema.listMultiplaEscolhas) {
            user.responderPergunta(questao);
        }
    }

}
