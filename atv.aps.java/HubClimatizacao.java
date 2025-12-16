public class HubClimatizacao extends Hub {
    @Override
    protected IDispositivo criarDispositivo(IModoOperacao modoInicial) {
        return new ArCondicionado(modoInicial);
    }
}