package data;

import io.quarkiverse.roq.data.runtime.annotations.DataMapping;

import java.util.List;

@DataMapping(value = "partners", parentArray = true)
public record Partners(List<Partner> list) {
    public record Partner(String name, String image, String url){}
}
