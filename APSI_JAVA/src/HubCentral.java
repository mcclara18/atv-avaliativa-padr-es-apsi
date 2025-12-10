public abstract class HubCentral {
    public abstract Dispositivo criarDispositivo();

    
    public void LigarDispositivo() {
        Dispositivo dispositivo = criarDispositivo(); 
        dispositivo.ativar_Dispositivo(); 
    }
}
