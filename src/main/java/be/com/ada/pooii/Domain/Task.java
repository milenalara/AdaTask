package be.com.ada.pooii.Domain;

import java.util.Date;

public abstract class Task {
  private final int id;
  private String title;
  private String description;
  private Date creationDate;
  private Date deadline;
  private static int nextId = 0;

  public Task(String title, String description, Date creation, Date deadline) {
    this.id = nextId++;
    this.title = title;
    this.description = description;
    this.creationDate = creation;
    this.deadline = deadline;
  }

  public int getId() {
    return id;
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

  public Date getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(Date creationDate) {
    this.creationDate = creationDate;
  }

  public Date getDeadline() {
    return deadline;
  }

  public void setDeadline(Date deadline) {
    this.deadline = deadline;
  }
}
