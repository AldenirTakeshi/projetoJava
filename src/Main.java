import service.ContaService;
import repository.ContaRepository;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static void main(String[] args) {
        ContaRepository repo = new ContaRepository();
        ContaService service = new ContaService(repo);

        int opcao;
        do {
            System.out.println("\n=== Sistema de Contas ===");
            System.out.println("1. Lançar conta");
            System.out.println("2. Listar contas");
            System.out.println("3. Marcar como paga");
            System.out.println("4. Ver totais");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 1 -> lancarConta(service);
                case 2 -> service.listarContas();
                case 3 -> marcarComoPaga(service);
                case 4 -> service.mostrarTotais();
                case 0 -> System.out.println("Encerrando...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private static void lancarConta(ContaService service) {
        System.out.print("Tipo (PAGAR/RECEBER): ");
        String tipo = sc.nextLine();
        System.out.print("Valor: ");
        double valor = Double.parseDouble(sc.nextLine());
        System.out.print("Descrição: ");
        String desc = sc.nextLine();
        System.out.print("Data de vencimento (dd/MM/yyyy): ");
        LocalDate data = LocalDate.parse(sc.nextLine(), fmt);

        service.lancarConta(tipo, valor, desc, data);
    }

    private static void marcarComoPaga(ContaService service) {
        service.listarContas();
        System.out.print("Número da conta: ");
        int indice = Integer.parseInt(sc.nextLine()) - 1;
        service.marcarComoPaga(indice);
    }
}
