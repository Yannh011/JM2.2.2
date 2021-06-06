package web.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car {

    private String model;
    private String series;
    private String color;

    public Car() {
    }

    public Car(String model, String series, String color) {
        this.model = model;
        this.series = series;
        this.color = color;
    }
}
