package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {

    private Integer numeroContrato;

    private LocalDate data;

    private Double valorTotal;

    private List<Parcelas> parcelas = new ArrayList<>();

    public Contrato () {
    }

    public Contrato(Integer numeroContrato, LocalDate data, Double valorTotal) {
        this.numeroContrato = numeroContrato;
        this.data = data;
        this.valorTotal = valorTotal;
    }

    public Integer getNumeroContrato() {
        return numeroContrato;
    }

    public LocalDate getData() {
        return data;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setNumeroContrato(Integer numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<Parcelas> getParcelas() {
        return parcelas;
    }
}
