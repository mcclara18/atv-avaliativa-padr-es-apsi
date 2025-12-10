public class HubLampada extends HubCentral {
    @Override
    public Dispositivo criarDispositivo() {
        return new Lampada();
    }
}
