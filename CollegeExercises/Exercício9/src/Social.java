
public class Social {

    int consumo;
    float tarifa;

    public Social(int consumo) {
        tarifa = 0.28117f;
        this.consumo = consumo;
        if (consumo <= 30) {
            this.tarifa *= 0.6f;
        }else if (consumo > 30 && consumo <= 100) {
            this.tarifa *= 0.4f;
        } else if (consumo > 100 && consumo <= 220) {
            this.tarifa *= 0.1f;
        }
    }

    public float Conta() {
        return (this.consumo * this.tarifa) + getICMS() + getPIS() + getCOFINS() + getCOSIP();
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
