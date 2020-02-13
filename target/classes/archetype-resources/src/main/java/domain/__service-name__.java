package ${package}.domain;

public class ${service-name} {

    private final long id;
    private final String content;

    public ${service-name}(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

}
