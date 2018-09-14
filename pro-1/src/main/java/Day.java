
public enum Day {
    MONDAY(),
    TUESDAY,WENSDAY,
    THURSDAY,FIRDAY,SATURDAY,SUNDAY;


}
enum SeasonEnum {
    SPRING("春天"),SUMMER("夏天"),FALL("秋天"),WINTER("冬天");

    private final String name;

    SeasonEnum(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
class Test{
    public static void main(String[] args) {
        Day day = Day.FIRDAY;
        System.out.println(day);
        Day[] days = new Day[]{};
        System.out.println(SeasonEnum.SPRING.getName());
    }
}

