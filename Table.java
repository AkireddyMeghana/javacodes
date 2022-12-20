
public class Table {

    synchronized void tab(int n)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+" x "+i+" = " +n*i);
            try
            {
                Thread.sleep(5000);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }

    }
}
class First extends Thread{
    Table t;
    First(Table t){
        this.t=t;
    }
    synchronized  public void run(){
        t.tab(5);
    }

}
class TableC
{
    public TableC() {
        super();
    }

    public static void main(String ar[])
    {
        Table tab=new Table();
        First obj=new First(tab);
        Table2 o=new Table2(tab);
        obj.start();
        o.start();

    }
}




// Use synchronized method to display table of 5 and table of 8 in the same way that we did in last example


