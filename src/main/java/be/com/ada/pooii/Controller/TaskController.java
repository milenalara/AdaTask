package be.com.ada.pooii.Controller;

import be.com.ada.pooii.Domain.*;
import be.com.ada.pooii.Repository.PersonalTaskRepository;
import be.com.ada.pooii.Repository.StudyTaskRepository;
import be.com.ada.pooii.Repository.TaskRepository;
import be.com.ada.pooii.Repository.WorkTaskRepository;
import be.com.ada.pooii.Service.DateFormatterService;
import be.com.ada.pooii.Service.TaskService;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class TaskController {
  private final Scanner sc;

  TaskRepository repository = new TaskRepository();

  TaskService taskService = new TaskService(repository);

  PersonalTaskRepository personalTaskRepo = new PersonalTaskRepository();
  TaskService personalService = new TaskService(personalTaskRepo);

  WorkTaskRepository workTaskRepo = new WorkTaskRepository();
  TaskService workService = new TaskService(workTaskRepo);

  StudyTaskRepository studyTaskRepo = new StudyTaskRepository();
  TaskService studyService = new TaskService(studyTaskRepo);

  public TaskController(Scanner sc) {
    this.sc = sc;
  }

  public void createTask() {
    Task task;
    int taskType;

    System.out.println("Informe o tipo de tarefa:");
    System.out.println("1 - Pessoal");
    System.out.println("2 - Trabalho");
    System.out.println("3 - Estudos");

    taskType = Integer.parseInt(sc.nextLine());

    System.out.println("Informe o título da tarefa: ");
    String title = sc.nextLine();

    System.out.println("Informe a descrição da tarefa: ");
    String description = sc.nextLine();

    Date creationDate = new Date();

    System.out.println("Informe a data final da tarefa no formato DD/MM/YYYY");
    String strDeadline = sc.nextLine();

    Date deadline = DateFormatterService.formatDate(strDeadline);

    switch (taskType) {
      case 1:
        System.out.println("Informe a categoria da tarefa:");
        String category = sc.nextLine();

        task = new PersonalTask(title, description, creationDate, deadline, category);
        personalService.saveNewTask(task);

        break;
      case 2:
        System.out.println("Informe o projeto ao qual a tarefa pertence:");
        String project = sc.nextLine();

        task = new WorkTask(title, description, creationDate, deadline, project);
        workService.saveNewTask(task);

        break;
      case 3:
        System.out.println("Informe a disciplina à qual a tarefa pertence:");
        String subject = sc.nextLine();

        task = new StudyTask(title, description, creationDate, deadline, subject);
        studyService.saveNewTask(task);

        break;
      default:
        System.out.println("Tipo inexistente");
        task = null;

    }
    taskService.saveNewTask(task);
  }

  public void updateTask() {
    Task task;

    System.out.println("Informe o Id da tarefa que deseja alterar: ");
    int id = Integer.parseInt(sc.nextLine());
    task = repository.getById(id);

    System.out.println("Informe o novo título da tarefa ou digite ENTER se não quiser alterar: ");
    String title = sc.nextLine();

    System.out.println("Informe a nova descrição da tarefa ou digite ENTER se não quiser alterar: ");
    String description = sc.nextLine();

    System.out.println("Informe a nova data final da tarefa no formato DD/MM/YYYY ou digite ENTER se não quiser alterar: ");
    String strDeadline = sc.nextLine();
    Date deadline = DateFormatterService.formatDate(strDeadline);

    if (task instanceof PersonalTask) {
      System.out.println("Informe a categoria da tarefa:");
      String category = sc.nextLine();

      task = new PersonalTask(id, title, description, task.getCreationDate(), deadline, category);
      personalTaskRepo.update(id, task);
    } else if (task instanceof WorkTask) {
      System.out.println("Informe o projeto ao qual a tarefa pertence:");
      String project = sc.nextLine();

      task = new WorkTask(id, title, description, task.getCreationDate(), deadline, project);
      workTaskRepo.update(id, task);

    } else if (task instanceof StudyTask) {
      System.out.println("Informe a disciplina à qual a tarefa pertence:");
      String subject = sc.nextLine();

      task = new StudyTask(id, title, description, task.getCreationDate(), deadline, subject);
      studyTaskRepo.update(id, task);
    } else {
      System.out.println("ERRO: classe inexistente");
      return;
    }

    repository.update(id, task);
  }

  public void showTaskById() {
    Task task;
    int id;

    System.out.println("Informe o Id da tarefa que deseja exibir:");
    id = Integer.parseInt(sc.nextLine());

    task = taskService.getTask(id);

    System.out.println(task.toString());
  }

  public void showAllTasks() {
    int taskType;
    List<Task> allTasks;

    System.out.println("Informe o tipo de tarefa:");
    System.out.println("1 - Pessoal");
    System.out.println("2 - Trabalho");
    System.out.println("3 - Estudos");
    System.out.println("4 - Todas");

    taskType = Integer.parseInt(sc.nextLine());

    switch (taskType) {
      case 1:
        allTasks = personalService.getAllTasks();
        break;
      case 2:
        allTasks = workService.getAllTasks();
        break;
      case 3:
        allTasks = studyService.getAllTasks();
        break;
      case 4:
        allTasks = taskService.getAllTasks();
        break;
      default:
        System.out.println("Opção inválida");
        return;
    }

    for (Task task : allTasks) {
      System.out.println(task.toString());
    }

  }

  public void deleteTasks() {
    Task task;

    System.out.println("Informe o Id da tarefa que deseja alterar: ");
    int id = Integer.parseInt(sc.nextLine());
    task = repository.getById(id);

    if (repository.getClass().getName().equals("be.com.ada.pooii.Repository.PersonalTaskRepository")) {
      personalTaskRepo.delete(id);
    } else if (repository.getClass().getName().equals("be.com.ada.pooii.Repository.WorkTaskRepository")) {
      workTaskRepo.delete(id);
    } else if (repository.getClass().getName().equals("be.com.ada.pooii.Repository.StudyTaskRepository")) {
      studyTaskRepo.delete(id);
    } else {
      System.out.println("ERRO: classe inexistente");
      return;
    }
    repository.delete(id);
  }
}
