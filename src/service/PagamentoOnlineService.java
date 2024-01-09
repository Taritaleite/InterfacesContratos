package service;

public interface PagamentoOnlineService {

    double taxa (double valor);

    double jurosMensal (double valor, Integer meses);
}
