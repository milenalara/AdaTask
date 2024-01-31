package be.com.ada.pooii.Repository;

import be.com.ada.pooii.Domain.Task;

import java.util.ArrayList;
import java.util.List;

public class StudyTaskRepository implements Repository {
  private static List<Task> tasks;

  public StudyTaskRepository() {
    tasks = new ArrayList<>();
  }

  @Override
  public void save(Task task) {
    tasks.add(task);
    System.out.println("Tarefa criada");
  }

  @Override
  public Task getById(int id) {
    return tasks.get(id);
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
    tasks.remove(id);
    System.out.println("Tarefa removida");
  }
}
