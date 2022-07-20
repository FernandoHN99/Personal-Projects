public class Sistema {

    public static void main(String[] args) throws Exception {

        //****************Criação do Formulário****************
        Formulario.criarFormulario();

        //****************Criação dos Usuarios****************
        Usuario user1 = new Usuario("Fernando");
        Usuario user2 = new Usuario("Vinincius");

        //****************Interação com Usuarios****************
        Formulario.iniciarFormulario(user1);
        Formulario.iniciarFormulario(user2);
        
        //****************Exibição de Perfil dos Usuários****************
        user1.exibirPerfilDoInvestidor();
        user2.exibirPerfilDoInvestidor();
         
    }


}