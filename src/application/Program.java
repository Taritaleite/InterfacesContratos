package application;

import entities.Contrato;
import entities.Parcelas;
import service.ContratoService;
import service.PayPalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os Dados do Contrato: ");
        System.out.print("Numero: ");
        int numeroContrato = sc.nextInt();
        System.out.println("Data (dd/MM/yyyy): ");
        LocalDate dataInicial = LocalDate.parse(sc.next(), fmt);
        System.out.print("Valor do Contrato: ");
        double valorContrato = sc.nextDouble();

        Contrato contrato = new Contrato(numeroContrato, dataInicial, valorContrato);

        System.out.print("Entre com número de parcelas: ");
        int numParcelas = sc.nextInt();

        ContratoService contratoService = new ContratoService(new PayPalService());

        contratoService.processamentoContrato(contrato, numParcelas);

        System.out.println("Parcelas: ");
        for (Parcelas parcelas : contrato.getParcelas()) {
            System.out.println(parcelas);
        }

        sc.close();

    }
}