public class Director {
    private String name;
    private int age;
    private double time;

    public void start(){
        switch(time){
            case 08.30:
                System.out.println("Начало занятий");
                break;}}

    public void end(){
        switch(time){
            case 16.30:
                System.out.println("Конец занятий");
                break;
        }
    }
}
