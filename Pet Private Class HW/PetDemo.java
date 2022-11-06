import javax.lang.model.util.ElementScanner6;

public class PetDemo {
    private String name;
    private int age;
    private String location;
    private String type; 

    public PetDemo(String initialName, int initialAge, String initialLocation, String initialType)
    {
        name = initialName;
        location = initialLocation;
        type = initialType;
        if ((initialAge < 0))
        
        {
            System.out.println("Error: Negative age.");
            System.exit(0);
        }
        else
        {
            age = newAge;
            boolean newAge = true;
            System.out.println("Good job following directions this time.");
        }
    }

    public PetDemo(String initialName)
    {
        name = initialName;
        age = 0;
    }

    public void setName(String newName)
    {
        name = newName; //age unchanged.
    }

    public PetDemo(int initialAge)
    {
        name = "Timothy Brown Jonquavius XIII";
    //Setup for acceptable integer inputs
        if (initialAge < 0);
        {
            System.out.println("Error: Negative age.");
            System.exit(0);
        }
        else
        age = initialAge;
    }

    public void setAge(int newAge) {
        if (newAge < 0)
        {
            System.out.println("Error: Cannot use this number.");
            System.exit(0);
        }
        else
            age = newAge;
            
    }

    public void setLocation(String initialLocation)
    {
        name = newLocation; 
    }
    public void setType(String newType)
    {
        name = newType; 
    }

//Get Methods
    public String getName( )
    {
        return name;
    } 

    public int getAge( )
    {
        return age;
    }

    public String getLocation ( )
    {
        return location;
    }  

    public String getType( )
    {
        return type;
    }

//Output
    public void writeOutput( )
    {
        System.out.println("Pet's name: " + name);
        System.out.println("Pet's Age: " + age + " Years old");
        System.out.println("Location Pet received " + location);
        System.out.println("Type of Pet: " + type);
    }
     
    
}
    