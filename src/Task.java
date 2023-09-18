public class Task {
    private String name;
    private String descriptions;

    public Task(String name, String descriptions) {
        this.name = name;
        this.descriptions = descriptions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", descriptions='" + descriptions + '\'' +
                '}';
    }
}
