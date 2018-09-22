
package exercicio10;

public final class Social {
    int consumo;
    float tarifa = 0.28117f;
    char programaSocial;
    boolean ePaticipante;

    public Social(int consumo, char programaSocial) {
        this.consumo = consumo;
        this.programaSocial = programaSocial;
        
        // Método que verifica se usuário é ou não parcitipante do programa social
        getEParticipante();
    }
    
    public float totalAPagar() {
        return (getImposto() + conta());
    }

    public float conta() {
        return (this.consumo * this.tarifa);
    }
    
    public boolean getEParticipante() {
        // verifica se o usuário é participante do programa social
        if (this.programaSocial == 's' || this.programaSocial == 'S') {
            return this.ePaticipante = true;
        } else {
            return this.ePaticipante = false;
        }
    }

    public int getConsumo() {
        return this.consumo;
    }
    
    public float getTarifa() {
        // Calcula a tarifa baseado no consumo
        if (this.consumo <= 30 && this.ePaticipante == true) {
            //  Desconto de 65% no valor da tarifa
            return this.tarifa -= (this.tarifa * 0.65f);
            
        }else if (this.consumo <= 100 && this.ePaticipante == true) {
            //  Desconto de 40% no valor da tarifa
            return this.tarifa -= (this.tarifa * 0.40f);
              
        } else if (this.consumo <= 220 && this.ePaticipante == true) {
            //  Desconto de 10% no valor da tarifa
            return this.tarifa -= (this.tarifa * 0.10f);

        } else {
            // Se o valor passar 220 ou se o usuário não fizer parte do programa social
            // a tarifa é cobrada de forma integral
            return this.tarifa;
        }
        
    }

    public float getImposto() {
       // Cobra imposto de 54% no valor total da conta
       return (conta() * 0.54f);
    }

    // Gera o boleto baseado no perfil do usuário
    public String boleto() {
        String saida = "\n\nBoleto do Consumidor";
        saida += "\nConsumo\t\t\t\t" + getConsumo() + "KWh";
        saida += "\nTarifa\t\t\t\tR$ " + getTarifa();
        saida += "\nConta de Consumo\t\tR$ " + conta();
        saida += "\nImposto (54%)\t\t\tR$ " + getImposto();
        saida += "\nValor total da fatura\t\tR$ " + totalAPagar();
        return saida;
    }
    
}
