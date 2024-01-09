package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Parcelas {


    private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private LocalDate dataVencimento;

    private Double valorParcela;

    public Parcelas() {
    }

    public Parcelas(LocalDate dataVencimento, Double valorParcela) {
        this.dataVencimento = dataVencimento;
        this.valorParcela = valorParcela;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public Double getValorParcela() {
        return valorParcela;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public void setValorParcela(Double valorParcela) {
        this.valorParcela = valorParcela;
    }

    @Override
    public String toString() {
        return  dataVencimento.format(fmt) + " - " + String.format("%.2f", valorParcela);
    }
}
