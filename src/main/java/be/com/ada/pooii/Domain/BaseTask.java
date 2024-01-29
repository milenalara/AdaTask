package be.com.ada.pooii.Domain;

import java.time.LocalDateTime;

public abstract class BaseTask {
  private final int id;
  private String title;
  private String description;
  private LocalDateTime creationDate;
  private LocalDateTime deadline;
  private static int nextId = 0;

  public BaseTask(String title, String description, LocalDateTime creation, LocalDateTime deadline) {
    this.id = nextId++;
    this.title = title;
    this.description = description;
    this.creationDate = creation;
    this.deadline = deadline;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LocalDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(LocalDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public LocalDateTime getDeadline() {
    return deadline;
  }

  public void setDeadline(LocalDateTime deadline) {
    this.deadline = deadline;
  }
}
