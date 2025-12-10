public class App {
    public static void main(String[] args) throws Exception {
        HubArcondicionado hubAr = new HubArcondicionado();
        Dispositivo ar = hubAr.criarDispositivo();
        ar.ativar_Dispositivo();

        HubLampada hubLam = new HubLampada();
        Dispositivo lam = hubLam.criarDispositivo();
        lam.ativar_Dispositivo();

    }
}
