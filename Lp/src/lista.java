import java.util.ArrayList;
import  java.util.Scanner;
    public class lista{
        public static void main(String[] args) {
            menu();
        }

        public static void menu() {
            System.out.printf("Menu");
            ArrayList<pessoa> agendaPessoas = new ArrayList<pessoa>();
            int opcao = 1;
            Scanner in = new Scanner(System.in);
            do {
                System.out.println("**** Sistema de Cadastro *****");
                System.out.println("1: Cadastrar pessoa na agenda");
                System.out.println("2: Lista de pessoas na agenda");
                System.out.println("0: Sair");

                System.out.println("**********************************)");

                System.out.println("Digite a opção");
                opcao = in.nextInt();
                System.out.println("**********************************)");
                switch (opcao){
                    case 1:
                        System.out.println("Opção 1 escolhida.");
                        cadastro(agendaPessoas);
                        break;
                    case 2:
                        System.out.println(" Opção 2 escolhida.");
                        lista(agendaPessoas);
                        break;
                    case 0:
                        System.out.println("Opção 0 escolhida.");
                        break;
                    default:
                        System.out.println("O número escolhido é invalido.");
                }
            } while (opcao != 0);
        }
        private static void cadastro(ArrayList<pessoa> agendaPessoas){
            Scanner scn = new Scanner(System.in);
            System.out.println("Nome: ");
            String nome = scn.nextLine();
            System.out.println("Endereço: ");
            String endereco = scn.nextLine();
            System.out.println("Telefone: ");
            String telefone = scn.nextLine();
            pessoa p = new pessoa(nome,endereco,telefone);
            agendaPessoas.add(p);
    }
        private static void lista(ArrayList<pessoa> agendaPessoas){
            System.out.println(agendaPessoas.toString());
    }
    }