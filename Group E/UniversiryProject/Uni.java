import java.rmi.*;
import java.rmi.server.*;

public class Uni extends UnicastRemoteObject implements UniInterface 
{
	public Uni() throws RemoteException{}

	public  String name;
	public  String id;
	public  String gender;
	public  String dob;
	public  String address;
	public  String tno;
	public  String fac;
	public float gpa;



	public void setName(String name){
		this.name = name;
	}

	public void setId(String id){
		this.id = id;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setTno(String tno){
		this.tno =  tno;
	}
	public void setFac(String fac){
		this.fac = fac;
	}
		
		


	

	public float gpa()
	{
		return gpa;
	}

	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	public String getGender() {
		return gender;
	}
	public String getDob() {
		return dob;
	}
	public String getAddress() {
		return address;
	}
	public String getTno() {
		return tno;
	}
	public String getFac() {
		return fac;
	}

	/*public float showgpa(float gpa)
	{
		return gpa;
	}*/

}