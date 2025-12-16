public class ModoPerformance implements IModoOperacao {
    @Override
    public void aplicarModo(String tipoDispositivo) {
        if (tipoDispositivo.equals("Lampada")) {
             System.out.println("-> " + tipoDispositivo + ": Lâmpada ligada com 100% de luminosidade (Performance).");
        } else if (tipoDispositivo.equals("ArCondicionado")) {
             System.out.println("-> " + tipoDispositivo + ": AC ligado em 18 graus (turbo - Performance).");
        }
    }
}