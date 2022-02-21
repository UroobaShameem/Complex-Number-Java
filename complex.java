public class complex {
    int real;
    int imag;

    public complex()  //null constructor
    {
        real=5;
        imag=2;
        //System.out.println("null constructor");
    }
    public complex(int r, int i)  //parametric constructor
    {
        this.real=r;
        this.imag=i;
    }
    public complex(complex copy)  //copy constructor
    {
        real=copy.real;
        imag=copy.imag;
    }

    public void display()  //display
    {
        System.out.println(+real+"+("+imag+")i");
    }

    complex add(complex a, complex b) //addition
    {
        complex tadd= new complex();
        tadd.real= a.real + b.real;
        tadd.imag= a.imag + b.imag;
        return tadd;
    }

    complex sub(complex a, complex b) //subtraction
    {
        complex tsub= new complex();
        tsub.real= a.real - b.real;
        tsub.imag= a.imag - b.imag;
        return tsub;
    }

    complex mul(complex a, complex b) //multiplication
    {
        complex tmul= new complex();
        tmul.real= a.real * b.real;
        tmul.imag= a.imag * b.imag;
        return tmul;
    }

    public static void main(String[] args) {
    complex obj=  new complex(); //envoke null constructor

    complex obj2= new complex(3,4); //envoke parametric constructor 
    System.out.println("Parametric constructor output:");
    obj2.display();

    complex obj3= new complex(6,1);
    complex obj4= new complex(obj3); //envoke copy constructor
    System.out.println("Copy constructor output:");
    obj4.display();

    complex addno= new complex();
    addno= addno.add(obj2, obj3);
    System.out.println("Addition: ");
    addno.display();

    complex subno= new complex();
    subno= addno.sub(obj2, obj3);
    System.out.println("Subtraction: ");
    subno.display();

    complex mulno= new complex();
    mulno= mulno.mul(obj2, obj3);
    System.out.println("Multiplication: ");
    mulno.display();
 }
 }