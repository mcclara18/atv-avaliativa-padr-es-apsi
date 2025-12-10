public class HubArcondicionado extends HubCentral {
    @Override
    public Dispositivo criarDispositivo() {
        return new Arcondicionado();
    }
}