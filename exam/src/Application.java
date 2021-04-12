import java.time.LocalDate;
import java.time.LocalTime;

public class Application {
    public static void main(String[] args) {
        Fitness one = new Fitness("Разовый", LocalDate.now());
        one.setOneTime(8,0,0);
        one.setTooTime(LocalTime.of(22,0,0));
        one.setZone(Fitness.Zone.POOL);
        registrated.plusDays(1);


        Fitness day = new Fitness("Дневной",LocalDate.now());
        one.setOneTime(8,0,0);
        one.setTooTime(LocalTime.of(16,0,0));
        one.setZone(Fitness.Zone.GYM);
        registrated.plusMonth(6);

        Fitness full = new Fitness("Полный",LocalDate.now());
        one.setOneTime(8,0,0);
        one.setTooTime(LocalTime.of(22,0,0));
        one.setZone(Fitness.Zone.GROUP);
        registrated.plusYears(1);
        

        System.out.println(one);
        System.out.println(day);
        System.out.println(full);
    }
}
