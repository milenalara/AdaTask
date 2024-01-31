package be.com.ada.pooii.Domain;

import java.util.Date;

public class WorkTask extends Task {
  private String project;

  public WorkTask(String title, String description, Date creation, Date deadline, String project) {
    super(title, description, creation, deadline);
    this.project = project;
  }

  public WorkTask(int id, String title, String description, Date creation, Date deadline, String project) {
    super(id, title, description, creation, deadline);
    this.project = project;
  }

  public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }

  @Override
  public String toString() {
    return "\nId: " + this.getId() +
        "\nTítulo: " + this.getTitle() +
        "\nDescrição: " + this.getDescription() +
        "\nData de criação: " + this.getCreationDate() +
        "\nDeadline: " + this.getDeadline() +
        "\nProjeto: " + this.getProject() +
        "\n";
  }
}
