import java.time.LocalDate;
public class Abonyment {
    protected LocalDate registrate;
    private LocalDate endRegistrate;
    private String name;
    private String family;
    private int year;

    public Abonyment(LocalDate registrate) {
        this.registrate = registrate;
    }

   void setName(String Name){
        if (Name == null || Name.trim().length()<3){
            throw new IllegalArgumentException("Значение <3");
        }
        this.name=name;
    }
    void setFamily(String family){
        if (family == null || family.trim().length()<3){
            throw new IllegalArgumentException("Значение fullName<3");
        }
        this.family=family;
    }
    void setYear(int year){
        if(year<1921) {
            throw new IllegalArgumentException("Возраст более 100 лет");
        }
        this.year = year;//
    }


}
