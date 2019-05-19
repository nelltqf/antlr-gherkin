package domain;

import java.util.List;

public class Step extends GherkinElement {

    private String name;

    private List<String> parameters;

    private List<Row> rows;

    public Step(Location location, String text) {
        super(location, text);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setParameters(List<String> parameters) {
        this.parameters = parameters;
    }

    public List<String> getParameters() {
        return parameters;
    }

    public List<Row> getRows() {
        return rows;
    }

    public void setRows(List<Row> rows) {
        this.rows = rows;
    }
}