import java.util.*;
public class modulusclock
{
	public static void main(String[] args)
	{
		int hour, futurHour, nhours, minutes, newhour, minute, newmin, modmin, intmin, overallmin, newnewhour;
		Scanner userinput = new Scanner(System.in);

		System.out.println("What hour is it?");
		hour = userinput.nextInt();
		System.out.println("What minute is it?");
		minute = userinput.nextInt();
		System.out.println("Hours later?");
		nhours = userinput.nextInt();
		System.out.println("Minutes later?");
		minutes = userinput.nextInt();
		newmin = minute + minutes;
		intmin = ((newmin)/60);
		modmin = ((newmin)%60);
		newhour = hour + nhours + intmin;
		if(newhour>12);
		{
			newnewhour = (newhour%12);
		}


        if(modmin<10)
        {
			System.out.println("The new time is: "+newnewhour+":0"+modmin);
		}
		else
		{
			System.out.println("The new time is: "+newnewhour+":"+modmin);
		}

	}
}