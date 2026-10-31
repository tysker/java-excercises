package src.enums;

import lombok.Getter;

@Getter
public enum Weekdays {
    MONDAY(7.5),
    TUESDAY(7.5),
    WEDNESDAY(7.5),
    THURSDAY(7.5),
    FRIDAY(7.5),
    SATURDAY(0),
    SUNDAY(0);

    final double workingHours;
    Weekdays(double workingHours) {
        this.workingHours = workingHours;
    }

}
