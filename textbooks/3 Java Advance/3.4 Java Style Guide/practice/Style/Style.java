package Style;

public class Style {
public final static long maxPosition = 1000;
	
	private class inner{
	public static int POSITION = 0;
	
	inner()
	{
		System.out.println("Build Inner");
	}
	
		private void methoda()
		{
			System.out.println("Doing Method A");
		}
		
		private void methodb(String command) {
			System.out.println("Doing Method B");
			switch(command){
				case"left":
				POSITION-=1;break;
				case"right":
				POSITION+=1;
				System.out.println("Doing Method B");break;
				default:
				System.out.println("Unkown command");			
			}
			
			if(POSITION>maxPosition)
			{
				System.out.println(
					"Position too big. " +
					"Position: " + POSITION +
					"Max position: " + maxPosition
				);
			}
			else
			{
			  System.out.println("It's OK");
			}
		}}
	}