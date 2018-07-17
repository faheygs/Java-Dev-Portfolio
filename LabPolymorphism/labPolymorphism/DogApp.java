package labPolymorphism;

public class DogApp
{
    public static void main(String[] args)
    {
        Dog myDog = new Dog("Greyhound");
        actAsDog(myDog);

        SledDog mySledDog = new SledDog("Husky");
        actAsDog(mySledDog);

        CircusDog myCircusDog = new CircusDog("Terrier");
        actAsDog(myCircusDog);
        
        System.out.println("Using an Array:\n");
        
        Dog[] dogs = {myDog, mySledDog, myCircusDog};
        
        for(Dog d: dogs) {
        	d.toString();
        	if (d instanceof SledDog){
        		((SledDog) d).pullSled();
        	}
        	actAsDog(d);	
        }
    }

    private static void actAsDog(Dog d)
    {
    	System.out.println(d);
        d.communicate();
        d.move();
        System.out.println();
    }
}
