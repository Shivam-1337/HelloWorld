
interface bike
{
 	int time = 30;
	public void coverDistance();
}
interface car
{
int distance = 60;
public void speed();
}

class TwoWheeler implements bike,car
{
@Override
public void speed()
{
System.out.println("Speed "+distance/time+"m/s");
}
@Override
public void coverDistance()
{
System.out.println("Distance "+distance+"m");
}

}
public class Tester
{
public static void main(String args[]){
TwoWheeler splender = new TwoWheeler();
splender.speed();
splender.coverDistance();
}
}
