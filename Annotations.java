//Functional interface
@FunctionalInterface
interface Demo
{
    void disp();
    // void disp2();
}
//This is Parent class
@Deprecated
class Plane
{
    public void planeFliesAtGoodHeight()
    {
        System.out.println("Plane is flying");
    }

}

//THis is child class or subclass
class CargoPlane extends Plane
{
    //Overriden method from parent class
    @Override
    public void planeFliesAtGoodHeight()
    {
        System.out.println("Cargoplane flies at low height");
    }
}

public class Annotations
{
    public static void main(String[] args) 
    {
        Plane cp=new CargoPlane();
        cp.planeFliesAtGoodHeight();
    }
}