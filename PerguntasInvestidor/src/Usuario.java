import java.util.*;
public class Usuario {
    private static Scanner input = new Scanner(System.in);
    private String nome;
    private double totalPontosUsuario;
    
    public Usuario(String nome) {
        this.nome = nome;
    }

    public void exibirPerfilDoInvestidor(){
        System.out.print("Usuário: " + this.nome + " --> ");
        if(this.totalPontosUsuario <= Sistema.totalPontosConservador){
            System.out.print("Perfil Conservador");
        }else if(this.totalPontosUsuario > Sistema.totalPontosConservador && this.totalPontosUsuario <= Sistema.totalPontosModerado){
            System.out.print("Perfil Moderado");
        }else{
            System.out.print("Perfil Agressivo");
        }
        // System.out.println(toString() + "\n");
        System.out.println("\n");
    }


    public void responderPergunta(MultiplaEscolha questao){
        int indiceResposta = -1;
        questao.mostrarQuestao();
        while(indiceResposta == -1 || (indiceResposta + 1 > questao.getQtdeAlternativas())){
            System.out.println("Digite a alternativa desejada: ");
            indiceResposta = MultiplaEscolha.getlistAlternativasSimbolos().indexOf(input.next().toLowerCase());
        }
        // questao.preencherRespostaMultiplaEscolha(indiceResposta);
        this.totalPontosUsuario += questao.getListAlternativas().get(indiceResposta).getPontuacao();
        Util.clearScreen();

    }

    @Override
    public String toString() {
    return "[totalPontosUsuario= " + totalPontosUsuario +  " totalPontosConservador= " + Sistema.totalPontosConservador + " totalPontosModerado= " + Sistema.totalPontosModerado + "]";
    }


}