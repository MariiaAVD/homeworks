import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Fitness extends Abonyment{
    private String typeAbonyment;
    private Zone[] zone;
    private LocalTime oneTime;
    private LocalTime tooTime;


    public Fitness(String typeAbonyment, LocalDate registrate) {
        super(registrate);
        this.typeAbonyment = typeAbonyment;

        LocalTime oneTime = LocalTime.of();
        oneTime = LocalTime.of();
        LocalTime tooTime = LocalTime.of();
        tooTime = LocalTime.of();
    }

    public Zone getZone() {
        return zone;
    }

    public void setZone(Zone zone) {
        this.zone = zone;
    }

    public void setOneTime(int i, int i1, int i2) {
    }

    public enum Zone {
        POOL, GYM, GROUP
    }

    public LocalTime getOneTime() {
        return oneTime;
    }

    public void setOneTime(LocalTime oneTime) {
        this.oneTime = oneTime;
    }

    public LocalTime getTooTime() {
        return tooTime;
    }

    public void setTooTime(LocalTime tooTime) {
        this.tooTime = tooTime;
    }
}
