import java.util.Scanner;
public enum Month{

    January(1),
    Febraury(2),
    March(3),
    April(4),
    May(5),
    june(6),
    july(7),
    august(8),
    september(9),
    october(10),
    november(11),
    december(12);

    private  int month;

    Month(int i) {

    }
    private void MonthEnum(int month)

    {
        this.month=month;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();

        for(Month m:Month.values())
        {
            if( m.month==x)
            {
                System.out.println(m);
            }
        }

    }
}

