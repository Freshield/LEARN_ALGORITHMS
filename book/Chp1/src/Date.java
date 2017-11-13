public class Date {

    private final int month;
    private final int day;
    private final int year;

    public Date(int m, int d, int y){
        month = m;
        day = d;
        year = y;
    }

    public int month(){
        return month;
    }

    public int day(){
        return day;
    }

    public int year(){
        return year;
    }

    @Override
    public String toString() {
        return month() + "/" + day() + "/" + year();
    }

    public static void main(String[] args) {
        int m = 12;
        int d = 31;
        int y = 1999;
        Date date = new Date(m,d,y);
        System.out.println(date);
    }
}
