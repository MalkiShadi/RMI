import java.rmi.*;
import java.rmi.registry.*;

public class UniSever {

	public static void main(String args[]){
		try{
			Uni u1 = new Uni();

			Naming.rebind("groupE",u1);
			System.out.println("Server is ready");

		}catch(Exception e){
			System.out.println("error "+ e);
		}
	}
}