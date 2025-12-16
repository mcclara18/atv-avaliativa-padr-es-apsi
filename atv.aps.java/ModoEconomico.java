public class ModoEconomico implements IModoOperacao {
    @Override
    public void aplicarModo(String tipoDispositivo) {
        if (tipoDispositivo.equals("Lampada")) {
             System.out.println("-> " + tipoDispositivo + ": Lâmpada ligada com 50% de luminosidade (Eco).");
        } else if (tipoDispositivo.equals("ArCondicionado")) {
             System.out.println("-> " + tipoDispositivo + ": AC ligado em 24 graus (baixo consumo - Eco).");
        }
    }
}