import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Loteria {
        private Random random;
        private Scanner scanner;

        public Loteria() {
            random = new Random();
            scanner = new Scanner(System.in);
        }

        public void apostarDe0a100() {
            try {
                System.out.println("\nAposte um número de 0 a 100: ");
                int aposta = scanner.nextInt();

                if (aposta < 0 || aposta > 100) {
                    System.out.println("\n**************************");
                    System.out.println("------OPÇÃO INVÁLIDA------");
                    System.out.println("**************************\n");
                    return;
                }

                int numeroSorteado = random.nextInt(101);

                if (aposta == numeroSorteado) {
                    System.out.println("\n-----Você ganhou R$ 1.000,00 reais.-----");
                } else {
                    System.out.println("\nQue pena! :( O número sorteado foi: " + numeroSorteado);
                }
            } catch (InputMismatchException e) {
                System.out.println("\n**************************");
                System.out.println("------OPÇÃO INVÁLIDA------");
                System.out.println("**************************\n");
                System.out.print(e.getMessage());
            }
        }

        public void apostarDeAaZ() {
            try {
                System.out.println("\nAposte uma letra de A a Z: ");
                int aposta = System.in.read();
                char letraEscolhida = Character.toUpperCase((char)aposta);

                if (!Character.isLetter(letraEscolhida) || (letraEscolhida < 'A' || letraEscolhida > 'Z')) {
                    System.out.println("\n**************************");
                    System.out.println("------OPÇÃO INVÁLIDA------");
                    System.out.println("**************************\n");
                    return;
                }

                char letraPremiada = 'G';

                if (letraEscolhida == letraPremiada) {
                    System.out.println("\n-----Você ganhou R$ 500,00 reais.-----");
                } else {
                    System.out.println("\nQue pena! :( A letra sorteada foi: " + letraPremiada);
                }
            } catch (IOException e) {
                System.out.println("Ocorreu um erro de I/O: " + e.getMessage());
                throw new RuntimeException(e);
            } catch (InputMismatchException e) {
                System.out.println("\n**************************");
                System.out.println("------OPÇÃO INVÁLIDA------");
                System.out.println("**************************\n");
                System.out.print(e.getMessage());

            }
        }

        public void apostarParOuImpar() {
            try {
                System.out.println("\nAposte um número inteiro: ");
                int aposta = scanner.nextInt();

                if (!scanner.hasNextInt()) {
                    System.out.println("\n**************************");
                    System.out.println("------OPÇÃO INVÁLIDA------");
                    System.out.println("**************************\n");

                } else {
                    if (aposta % 2 == 0) {
                        System.out.println("\n-----Você ganhou R$ 100,00 reais.-----");
                    } else {
                        System.out.println("\nQue pena! :( O número digitado é ímpar e a premiação foi para números pares.");
                    }
                }
            }  catch (InputMismatchException e) {
                System.out.println("\n**************************");
                System.out.println("------OPÇÃO INVÁLIDA------");
                System.out.println("**************************\n");
                System.out.print(e.getMessage());
            }
        }
    }


