public class Main {
    public static void main(String[] args) {
        IPhone iphone = new IPhone();

        // Funções de ReprodutorMusical
        iphone.tocarMusica();
        iphone.pausarMusica();
        iphone.proximaMusica();

        // Funções de AparelhoTelefonico
        iphone.fazerLigacao("123456789");
        iphone.atenderLigacao();
        iphone.encerrarLigacao();

        // Funções de NavegadorInternet
        iphone.navegar("www.exemplo.com");
        iphone.atualizarPagina();
        iphone.adicionarAosFavoritos();
    }
}
