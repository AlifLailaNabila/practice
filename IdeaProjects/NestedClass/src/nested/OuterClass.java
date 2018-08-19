package nested;

public class OuterClass {
    int outerNum1=10;

    public OuterClass(){
    }
    public InnerA innerA=new InnerA();
    public InnerB innerB=new InnerB();



    public void outerMethodA(){
        System.out.println("Outer class method A");
        innerA.innerAMethodA();
        innerB.innerBMethodA();
    }


    //innerA.innerAMethodA;

    public class InnerA {
        int innerAnum1 = 20;

        public InnerA() {
        }

        public void innerAMethodA() {
            System.out.println("Inner class A method A");
        }
    } //InnerA ends


        public class InnerB{
            int innerBnum1=30;
            public InnerB(){
            }
            public void innerBMethodA() {
                System.out.println("Inner class B method A");
            }
        }//InnerB ends
    }//Outer ends
