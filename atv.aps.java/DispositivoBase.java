public abstract class DispositivoBase implements IDispositivo {
    protected IModoOperacao modo; 
    protected final String tipo; 

    public DispositivoBase(String tipo, IModoOperacao modoInicial) {
        this.tipo = tipo;
        this.modo = modoInicial; 
    }

    @Override
    public void operar() {
        System.out.println("Dispositivo: " + this.tipo + " acionado.");
        this.modo.aplicarModo(this.tipo); 
    }
    
    @Override
    public void setModoOperacao(IModoOperacao novoModo) {
        this.modo = novoModo;
        System.out.println("Modo de operação do " + this.tipo + " alterado para: " + novoModo.getClass().getSimpleName());
    }
    
    public String getTipo() {
        return tipo;
    }
}