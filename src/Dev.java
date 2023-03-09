import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String name;
    private Set<Content> concludedContent, subscribedContent = new LinkedHashSet<>();

    public void subscribeToBootcamp(Bootcamp bootcamp) {
        this.concludedContent.addAll(bootcamp.getContent());
        bootcamp.getSubscribedDevs().add(this);
    }

    public void progress() {
        Optional<Content> content = this.concludedContent.stream().findFirst();
        if (content.isPresent()) {
            this.subscribedContent.add(content.get());
            this.concludedContent.remove(content.get());
        } else {
            System.err.println("You're not subscribed to any content!");
        }
    }

    public double calcXp() {
        Iterator<Content> iterator = this.subscribedContent.iterator();
        double soma = 0;
        while (iterator.hasNext()) {
            double next = iterator.next().calcXp();
            soma += next;
        }
        return soma;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getConcludedContent() {
        return concludedContent;
    }

    public void setConcludedContent(Set<Content> concludedContent) {
        this.concludedContent = concludedContent;
    }

    public Set<Content> getSubscribedContent() {
        return subscribedContent;
    }

    public void setSubscribedContent(Set<Content> subscribedContent) {
        this.subscribedContent = subscribedContent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(concludedContent, dev.concludedContent)
                && Objects.equals(subscribedContent, dev.subscribedContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, concludedContent, subscribedContent);
    }

}
