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

    public boolean equals(Object x){
        if (this == x) return true;
        if (x == null) return false;
        if (this.getClass() != x.getClass()) return false;
        Date that = (Date) x;
        if (this.day != that.day) return false;
        if (this.month != that.month) return false;
        if (this.year != that.year) return false;
        return true;
    }

    public static void main(String[] args) {
        int m = 12;
        int d = 31;
        int y = 1999;
        Date date = new Date(m,d,y);
        System.out.println(date);
        Date date1 = new Date(m,d,y);
        System.out.println(date.equals(date1));
        Date date2 = new Date(1,1,2011);
        date1 = date2;
        System.out.println(date.equals(date1));
    }
}
