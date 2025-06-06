import java.util.Scanner;

public class calculadora {
    private double numeroUm;
    private double numeroDois;

    public calculadora(double numeroUm, double numeroDois) {
        this.numeroUm = numeroUm;
        this.numeroDois = numeroDois;
    }

    public double somar() {
        return numeroUm + numeroDois;
    }

    public double subtrair() {
        return numeroUm - numeroDois;
    }

    public double multiplicar() {
        return numeroUm * numeroDois;
    }

    public String dividir() {
        if (numeroDois == 0) {
            return "Impossível realizar uma divisão por zero.";
        }
        return String.valueOf(numeroUm / numeroDois);
    }

    public double potencia() {
        if (numeroDois == 0) {
            return 1;
        }
        return Math.pow(numeroUm, numeroDois);
    }

    public String raizQuadrada() {
        if (numeroUm < 0) {
            return "Não existe raiz de número negativo.";
        }
        return String.valueOf(Math.sqrt(numeroUm));
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String opcao;

        do {
            System.out.println("\nEscolha a operação:");
            System.out.println("[1] Adição");
            System.out.println("[2] Subtração");
            System.out.println("[3] Multiplicação");
            System.out.println("[4] Divisão");
            System.out.println("[5] Potência");
            System.out.println("[6] Raiz quadrada do primeiro número");
            System.out.println("[Q] Sair");
            System.out.print("Opção: ");
            opcao = scn.next().toUpperCase();

            if (opcao.equals("Q")) {
                System.out.println("Programa encerrado.");
                break;
            }

            double num1 = 0, num2 = 0;
            if (!opcao.equals("Q")) {
                System.out.print("Digite o primeiro número: ");
                num1 = scn.nextDouble();
            }
            if (!opcao.equals("6") && !opcao.equals("Q")) {
                System.out.print("Digite o segundo número: ");
                num2 = scn.nextDouble();
            }

            calculadora calc = new calculadora(num1, num2);

            switch (opcao) {
                case "1":
                    System.out.println("Resultado: " + calc.somar());
                    break;
                case "2":
                    System.out.println("Resultado: " + calc.subtrair());
                    break;
                case "3":
                    System.out.println("Resultado: " + calc.multiplicar());
                    break;
                case "4":
                    System.out.println("Resultado: " + calc.dividir());
                    break;
                case "5":
                    System.out.println("Resultado: " + calc.potencia());
                    break;
                case "6":
                    System.out.println("Resultado: " + calc.raizQuadrada());
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (true);

        scn.close();
    }
}
