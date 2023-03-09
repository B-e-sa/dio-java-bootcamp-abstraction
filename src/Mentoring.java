import java.time.LocalDate;

public class Mentoring extends Content {

    private LocalDate data;

    @Override
    public double calcXp() {
        return DEFAULT_XP + 20d;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoring{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", data=" + data +
                '}';
    }
}
