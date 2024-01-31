package be.com.ada.pooii;

import be.com.ada.pooii.Controller.TaskController;
import be.com.ada.pooii.Domain.Task;

import java.util.List;
import java.util.Scanner;

public class Main {
  public static void menuPrincipal() {
    System.out.println("----------MENU PRINCIPAL----------");
    System.out.println("Informe o código da tarefa que deseja executar");
    System.out.println("1 - Adicionar tarefa");
    System.out.println("2 - Exibir todas as tarefas");
    System.out.println("3 - Buscar tarefa por Id");
    System.out.println("4 - Editar tarefa");
    System.out.println("5 - Remover tarefa");
    System.out.println("0 - SAIR");
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    TaskController taskController = new TaskController(sc);

    int op;

    do {
      menuPrincipal();

      op = Integer.parseInt(sc.nextLine());
      switch (op) {
        case 0:
          System.out.println("ENCERRANDO PROGRAMA");
          break;
        case 1:
          taskController.createTask();
          break;
        case 2:
          taskController.showAllTasks();
          break;
        case 3:
          taskController.showTaskById();
          break;
        case 4:
          taskController.updateTask();
          break;
        case 5:
          taskController.deleteTasks();
          break;
        default:
          System.out.println("Opção inválida");
      }
    } while (op != 0);
  }
}
