package be.com.ada.pooii.Repository;

import be.com.ada.pooii.Domain.Task;

import java.util.ArrayList;
import java.util.List;

public class WorkTaskRepository implements Repository {
  private static List<Task> tasks;

  public WorkTaskRepository() {
    tasks = new ArrayList<>();
  }

  @Override
  public void save(Task task) {
    tasks.add(task);
    System.out.println("Tarefa criada");
  }

  @Override
  public Task getById(int id) {
    for (Task task : tasks) {
      if(task.getId()==id) return task;
    }
    return null;
  }

  @Override
  public List<Task> getAll() {
    return tasks;
  }

  @Override
  public void update(int id, Task newTask) {
    tasks.set(id, newTask);
    System.out.println("Tarefa alterada");
    System.out.println(newTask.toString());
  }

  @Override
  public void delete(int id) {
    Task task = getById(id);
    tasks.remove(task);
    System.out.println("Tarefa removida");
  }
}
