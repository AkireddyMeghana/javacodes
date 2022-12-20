
    class Table2 extends Thread{
        Table t;
        Table2(Table t){
            this.t=t;
        }
        synchronized public void run(){
            t.tab(8);
        }

    }



