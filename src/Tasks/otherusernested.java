package Tasks;

public class otherusernested {

	public static void nestedif()
	{
		String username="lakhanadewar"; //string declared and assign
		String password="121118114";
	if("lakhanadewar"==username)//checking if username is correct
		{
			System.out.println("Username is correct: "+username);
				if("121118114"==password)//checking if passord is correct
				{
					System.out.println("Successfully Login");
					System.out.print("Username: "+username);
					System.out.println("Password: "+password);
				}else
				{
					System.out.println("Please Check Your Password!! "+password);
							}
	}else
		{
			System.out.println("Your Username "+username+" is Incorrect");
		}}}
