public abstract class Hub {
    protected IDispositivo dispositivo;

    public Hub() {
        this.dispositivo = criarDispositivo(new ModoEconomico()); 
    }
    
    protected abstract IDispositivo criarDispositivo(IModoOperacao modoInicial);
    
    public void operar() {
        System.out.println("\n*** Executando Operação no Hub (" + this.dispositivo.getTipo() + ") ***");
        this.dispositivo.operar();
    }
    
    public void setModoGlobal(IModoOperacao novoModo) {
        this.dispositivo.setModoOperacao(novoModo);
    }
}