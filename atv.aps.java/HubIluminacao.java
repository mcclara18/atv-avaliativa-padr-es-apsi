public class HubIluminacao extends Hub {
    @Override
    protected IDispositivo criarDispositivo(IModoOperacao modoInicial) {
        return new Lampada(modoInicial); 
    }
}