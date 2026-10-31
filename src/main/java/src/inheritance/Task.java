package src.inheritance;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Task {

    private String name;
    private String description;
    private boolean isComplete;

    public Task(String name, String description) {
        this.name = name;
        this.description = description;
        this.isComplete = false;
    }

}
