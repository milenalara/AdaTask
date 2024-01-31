package be.com.ada.pooii.Domain;

import java.util.Date;

public class StudyTask extends Task {
  private String subject;

  public StudyTask(String title, String description, Date creation, Date deadline, String subject) {
    super(title, description, creation, deadline);
    this.subject = subject;
  }

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  @Override
  public String toString() {
    return "\nId: " + this.getId() +
        "\nTítulo: " + this.getTitle() +
        "\nDescrição: " + this.getDescription() +
        "\nData de criação: " + this.getCreationDate() +
        "\nDeadline: " + this.getDeadline() +
        "\nDisciplina: " + this.getSubject() +
        "\n";
  }
}
