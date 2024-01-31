package be.com.ada.pooii.Service;

import be.com.ada.pooii.Repository.Repository;
import be.com.ada.pooii.Domain.Task;

import java.util.List;

public class TaskService {
  private final Repository repository;

  public TaskService(Repository repository) {
    this.repository = repository;
  }

  public void saveNewTask(Task task) {
    System.out.println("Salvando a tarefa com o repository: " + this.repository.getClass().getName());
    repository.save(task);

  }

  public Task getTask(int id) {
    Task task = repository.getById(id);
    System.out.println(task.toString());
    return task;
  }

  public List<Task> getAllTasks(){
    return repository.getAll();
  }
}
