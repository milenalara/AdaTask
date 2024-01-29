package be.com.ada.pooii.Controller;

import be.com.ada.pooii.Repository.TaskRepository;

import java.time.LocalDateTime;
import java.util.Scanner;

public class ConsoleInterface {
  public static void menuPrincipal() {
    System.out.println("----------MENU PRINCIPAL----------");
    System.out.println("Informe o código da tarefa que deseja executar");
    System.out.println("1 - Adicionar tarefa");
    System.out.println("2 - Buscar tarefa(s)");
    System.out.println("3 - Editar tarefa");
    System.out.println("4 - Remover tarefa");
    System.out.println("0 - SAIR");
  }

  public static void createTask (Scanner sc) {
    int tipo;

    System.out.println("Informe o tipo de tarefa:");
    System.out.println("1 - Pessoal");
    System.out.println("2 - Trabalho");
    System.out.println("3 - Estudos");

    tipo = Integer.parseInt(sc.nextLine());

    System.out.println("Informe o título da tarefa: ");
    String title = sc.nextLine();

    System.out.println("Informe a descrição da tarefa: ");
    String description = sc.nextLine();

    LocalDateTime creationDate = LocalDateTime.now();


//    private String title;
//    private String description;
//    private LocalDateTime creation;
//    private LocalDateTime deadline;
//    private static int nextId = 0;
  }

  public static void main(String[] args) {
    TaskRepository repository = new TaskRepository();
    Scanner sc = new Scanner(System.in);
    int op;

    do {
      menuPrincipal();

      op = Integer.parseInt(sc.nextLine());
      switch (op) {
        case 0:
          System.out.println("ENCERRANDO PROGRAMA");
          break;
        case 1:
          // criar tarefa
          break;
        case 2:
          // exibir tarefa
          break;
        case 3:
          // alterar tarefa
          break;
        case 4:
          // deletar tarefa
          break;
        default:
          System.out.println("Opção inválida");
      }
    } while (op != 0);
  }
}
