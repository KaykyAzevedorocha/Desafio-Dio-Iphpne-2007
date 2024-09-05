public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // Métodos do ReprodutorMusical
    @Override
    public void tocarMusica() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada.");
    }

    @Override
    public void proximaMusica() {
        System.out.println("Tocando a próxima música.");
    }

    // Métodos do AparelhoTelefonico
    @Override
    public void fazerLigacao(String numero) {
        System.out.println("Ligando para " + numero + "...");
    }

    @Override
    public void encerrarLigacao() {
        System.out.println("Ligação encerrada.");
    }

    @Override
    public void atenderLigacao() {
        System.out.println("Ligação atendida.");
    }

    // Métodos do NavegadorInternet
    @Override
    public void navegar(String url) {
        System.out.println("Navegando para " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página.");
    }

    @Override
    public void adicionarAosFavoritos() {
        System.out.println("Página adicionada aos favoritos.");
    }
}

