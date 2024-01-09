package service;

public class PayPalService implements PagamentoOnlineService {

    @Override
    public double taxa(double valor) {
        return valor * 0.02;
    }

    @Override
    public double jurosMensal(double valor, Integer meses) {
        return valor * 0.01 * meses;
    }
}
