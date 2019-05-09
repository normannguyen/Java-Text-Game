public class Player
{
   //Variables
   private int health;
   private String object;
   //Constructor
   //These are the default settings, mostly for the speed.
   public Player(int Hlth, String Obj)
   {
      health = Hlth;
      object = Obj;
   }
   //Getters/Accessors
   public int gethealth()
   {
      return health;
   }
   public String getobject()
   {
      return object;
   }
   //Setters/Mutators
   public void sethealth(int newhealth)
   {
      health = newhealth;
   }
   public void setobject(String newobject)
   {
      object = newobject;
   }
}