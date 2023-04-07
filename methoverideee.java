class A{
    int a;
    public int harsh( )
    {
        return 4;

    }
    void meth2(){
        System.out.println("class A of  meth2");
    }
    
}
class B extends A
{   
    @Override    
    void meth2(){
        System.out.println("class B of  meth2");
    }
    void meth3(){
        System.out.println("class B of  meth3");
    }
}
public class methoverideee {
    public static void main(String[] args)
    {
        A a=new A();
        a.meth2();
        B b=new B();
        b.meth2();


    }
    
}
