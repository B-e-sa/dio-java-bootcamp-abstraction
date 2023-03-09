public abstract class Content {

    protected static final double DEFAULT_XP = 40d;

    private String title, description;

    public abstract double calcXp();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}