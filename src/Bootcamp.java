import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {

    String name, description;

    private final LocalDate INITIAL_DATE = LocalDate.now();

    private final LocalDate FINAL_DATE = INITIAL_DATE.plusDays(45);

    private Set<Dev> subscribedDevs = new HashSet<>();

    private Set<Content> content = new LinkedHashSet<>();

    public Bootcamp(String name, String description) {
        this.description = description;
        this.name = name;
        this.description = description;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getInitialDate() {
        return INITIAL_DATE;
    }

    public LocalDate getFinalDate() {
        return FINAL_DATE;
    }

    public Set<Dev> getSubscribedDevs() {
        return subscribedDevs;
    }

    public void setSubscribedDevs(Set<Dev> subscribedDevs) {
        this.subscribedDevs = subscribedDevs;
    }

    public Set<Content> getContent() {
        return content;
    }

    public void setContent(Set<Content> content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(name, bootcamp.name) && Objects.equals(description, bootcamp.description) && Objects.equals(INITIAL_DATE, bootcamp.INITIAL_DATE) && Objects.equals(FINAL_DATE, bootcamp.FINAL_DATE) && Objects.equals(subscribedDevs, bootcamp.subscribedDevs) && Objects.equals(content, bootcamp.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, INITIAL_DATE, FINAL_DATE, subscribedDevs, content);
    }

}
