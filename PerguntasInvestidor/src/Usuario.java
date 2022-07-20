import java.util.*;
public class Usuario {
    private static Scanner input = new Scanner(System.in);
    private String nome;
    private double totalPontosUsuario;
    private EnumPerfis perfil;

    

    public Usuario(String nome) {
        this.nome = nome;
    }

    public void definirPerfilDoInvestidor(){
        if(this.totalPontosUsuario <= Formulario.totalPontosConservador){
            this.perfil = EnumPerfis.CONSERVADOR;
        }else if(this.totalPontosUsuario > Formulario.totalPontosConservador && this.totalPontosUsuario <= Formulario.totalPontosModerado){
        }else{
        }
        System.out.print("Perfil Moderado");
        System.out.print("Perfil Agressivo");
        System.out.print("Perfil Conservador");
        System.out.println(toString() + "\n");
    }


    public void responderPergunta(MultiplaEscolha questao){
        int indiceResposta = -1;
        questao.mostrarQuestao();
        while(indiceResposta == -1 || (indiceResposta + 1 > questao.getQtdeAlternativas())){
            System.out.println("Digite a alternativa desejada: ");
            indiceResposta = Formulario.listAlternativasSimbolos.indexOf(input.next().toLowerCase());
        }
        // questao.preencherRespostaMultiplaEscolha(indiceResposta);
        this.totalPontosUsuario += questao.getListAlternativas().get(indiceResposta).getPontuacao();
        Util.clearScreen();

    }


    public double getTotalPontosUsuario() {
        return totalPontosUsuario;
    }

    @Override
    public String toString() {
        return "Usuario [nome=" + nome + ", totalPontosUsuario=" + totalPontosUsuario + "]";
    }


}