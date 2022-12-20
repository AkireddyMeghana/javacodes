public class Variable {
    public static void main(String...args) {
        val();
        val(1);
        val(2,4);
        val(4,5,6);

    }
      static   void val(int...value){
            if(value.length==0){
            System.out.println("welcome");
        }else if(value.length==1){
                System.out.println("add 10 to the number"+(value[0]+10));


            }
            else if (value.length==2){
                int avg=(value[0]+value[1])/2;
                System.out.println("average of two numbers"+avg);
            }
        else if(value.length==3){
            System.out.println("sum of three numbers"+(value[0]+value[1] +value[2]));
            }
    }
}
