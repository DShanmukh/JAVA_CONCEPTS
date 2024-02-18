import java.util.Scanner;
class Best_hero
{
 public static void main (String args[])
{
 Scanner sc= new Scanner(System.in);
 String Hero1,Hero2;
int  Hero1_total_movies;
int Hero1_hits;
int Hero1_Average;
int Hero1_Flop;
int  Hero2_total_movies;
int Hero2_hits;
int Hero2_Average;
int Hero2_Flop;
system.out.println("enter hero1 detalis");
Hero1_name=sc.next();
Hero1_hits=sc.nextInt();
Hero1_Average=sc.nextInt();
Hero1_Flop=sc.nextInt();
sc.nextLine();
system.out.println("enter hero2 detalis");
Hero2_name=sc.next();
Hero2_hits=sc.nextInt();
Hero2_Average=sc.nextInt();
Hero2_Flop=sc.nextInt();

Hero1_total_movies=Hero1_hits*10+Hero1_average*5+Hero1_flop*-5;
Hero2_total_movies=Hero2_hits*10+Hero2_average*5+Hero2_flop*-5;

if(Hero1_total_movies>Hero2_total_movies)
  System.out.print("Hero1 is the best hero"+Hero1_total_movies);

if(Hero1_total_movies<Hero2_total_movies)
  System.out.print("Hero2 is the best hero"+Hero2_total_movies);
sc.close();
 }
}