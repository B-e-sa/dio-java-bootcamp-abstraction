import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {

        Course javaCourse = new Course();
        javaCourse.setTitle("Java Course");
        javaCourse.setDescription("Java Course");
        javaCourse.setWorkload(8);

        Mentoring javaMentoring = new Mentoring();
        javaMentoring.setTitle("Java javaMentoring");
        javaMentoring.setDescription("Java javaMentoring");
        javaMentoring.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp("Java Developer Bootcamp", "Java Bootcamp");
        bootcamp.setName("Java Developer Bootcamp");
        bootcamp.setDescription("Java Developer Bootcamp");
        bootcamp.getContent().add(javaCourse);
        bootcamp.getContent().add(javaMentoring);

        Dev besa = new Dev();
        besa.setName("Besa");
        besa.subscribeToBootcamp(bootcamp);
        System.out.println("Besa subscribed content:" + besa.getSubscribedContent());
        besa.progress();
        besa.progress();
        System.out.println("-");
        System.out.println("Besa subscribed content: " + besa.getSubscribedContent());
        System.out.println("Besa concluded content: " + besa.getConcludedContent());
        System.out.println("XP:" + besa.calcXp());
    }
}