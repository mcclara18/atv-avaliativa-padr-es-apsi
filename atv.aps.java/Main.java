public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("--- Teste Simples do SmartHome Hub ---");

        Hub hubLampada = new HubIluminacao();
        
        System.out.println("\n--- Ação 1: Ligar Lâmpada no Modo Padrao (Eco) ---");
        hubLampada.operar();
        
        System.out.println("\n--- Ação 2: Trocando para Modo Performance ---");
     
        IModoOperacao modoVeloz = new ModoPerformance();

        hubLampada.setModoGlobal(modoVeloz); 
        
        hubLampada.operar();
        
        System.out.println("\n----------------------------------------");

        Hub hubAC = new HubClimatizacao();
        
        System.out.println("--- Ação 3: Ligar Ar-Condicionado no Modo Padrao (Eco) ---");
        hubAC.operar(); 
        
        System.out.println("\n--- Fim do Teste ---");
    }
}