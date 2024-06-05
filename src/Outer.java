public class Outer {
    private int data;
    private static int sdata = 70;

    public Outer(){
        data = 40;
    }
    public Outer(int data){
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }


    public static void setSdata(int sdata) {
        Outer.sdata = sdata;
    }

    public void display(){
        System.out.println("my data is:"+data);
    }

    public Object task(){
        final int local = 99;

        class Maths{
            public int increment(int val){
                System.out.println("data:"+data);
                System.out.println("sdata:"+sdata);
                return val++;
            }

            @Override
            public String toString() {
                return "Outer{ }"+" "+local;
            }
        }

        Maths m1 = new Maths();
        data = m1.increment(20);
        System.out.println(data);

        return m1;
    }

}
