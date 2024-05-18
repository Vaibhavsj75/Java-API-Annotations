public class Enum1{
enum Week
{
    MON, TUE, WED, THU, FRI, SAT, SUN;
}


    enum Result
    {
        PASS, FAIL, NR;
    }


public static void main(String[] args)
{

    Week w=Week.MON;
    System.out.println(w);

    int index=Week.MON.ordinal();
    System.out.println(index);

    Week []wr=Week.values();

    for(Week w1: wr)
    {
        System.out.println(w1+ ":" +w1.ordinal());
    }
}
}
