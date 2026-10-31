package src.inheritance;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
public class GardenTask extends Task{

    private final String gardenLocation;

    public GardenTask(String name, String description, String gardenLocation) {
        super(name, description);
        this.gardenLocation = gardenLocation;
    }
}
