interface Playable
{
  void play();
}
class Veena implements Playable
{
   public void play()
{  
      System.out.println("play the music1");
}
}
class saxophone implements Playable
{
{
   public void play()
{  
      System.out.println("play the music2");
}
}
class Playable
{
public static void main(String args[])
{
Playable p;
p=new Veena();
p.play();

p=new saxophone();
p.play();
}
}
