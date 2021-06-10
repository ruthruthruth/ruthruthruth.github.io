public class Hello {
    public static void main(String[] args) {
        int x = 200;
        int y = 20;

        //Call the ‘myfunction’ function
        myfunction(y);

        //Print x, y, z
        System.out.println(""x); //50
        System.out.println(y); //30
        System.out.println(z); //undefined
    }



// This code launches the ‘myfunction’ function that gets called above
        public void myfunction( y ) {// y=20
        int z = y; //z = 20
        int y = 30; //y = 30
        int x = 50;
            System.out.println(x); //50
            System.out.println(y); //30
            System.out.println(z); //20
    }
}