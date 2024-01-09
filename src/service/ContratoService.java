package service;

import entities.Contrato;
import entities.Parcelas;

import java.time.LocalDate;

public class ContratoService {

    private PagamentoOnlineService pagamentoOnlineService;

    public ContratoService(PagamentoOnlineService pagamentoOnlineService) {
        this.pagamentoOnlineService = pagamentoOnlineService;
    }

    public void processamentoContrato(Contrato contrato, int meses) {

        double parcelaBasica = contrato.getValorTotal() / meses;
        for (int i = 1; i <= meses; i++) {
            LocalDate vencimentoParcela = contrato.getData().plusMonths(i);//adiciona 1 mes

            double juros = pagamentoOnlineService.jurosMensal(parcelaBasica, i);
            double taxa = pagamentoOnlineService.taxa(parcelaBasica + juros);

            double parcelaFinal = parcelaBasica + juros + taxa;

            contrato.getParcelas().add(new Parcelas(vencimentoParcela, parcelaFinal));

        }
    }
}
