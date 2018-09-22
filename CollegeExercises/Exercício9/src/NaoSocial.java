
public class NaoSocial {

    int consumo;
    float tarifa = 0.28117f;

    public NaoSocial(int consumo) {
        this.consumo = (consumo >= 30) ? consumo : 30;
    }

    public float Conta() {
        return (this.consumo * tarifa) + getICMS() + getPIS() + getCOFINS() + getCOSIP();
    }

    public int getConsumo() {
        return this.consumo;
    }

    public float getICMS() {
        return (this.consumo * 0.17f);
    }

    public float getPIS() {
        return (this.consumo * 0.107f);
    }

    public float getCOFINS() {
        return (this.consumo * 0.491f);
    }

    public float getCOSIP() {
        return (8.19f);
    }

    public String info() {
        String saida = "\tBoleto do Consumidor";
        saida += "\nConsumo\t\t\t\t" + getConsumo() + "KWh";
        saida += "\nTarifa\t\t\t\tR$ " + tarifa;
        saida += "\nICMS\t\t\t\tR$ " + getICMS();
        saida += "\nPIS\t\t\t\tR$ " + getPIS();
        saida += "\nCOFINS\t\t\t\tR$ " + getCOFINS();
        saida += "\nCOSIP\t\t\t\tR$ " + getCOSIP();
        saida += "\nValor total da fatura\t\tR$ " + Conta();
        return saida;
    }

}
