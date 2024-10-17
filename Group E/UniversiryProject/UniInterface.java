import java.rmi.*;

public interface UniInterface extends Remote {

	public void setName(String name) throws RemoteException;
	public void setId(String id) throws RemoteException;
	public void setGender(String gender) throws RemoteException;
	public void setDob(String dob) throws RemoteException;
	public void setAddress(String address) throws RemoteException;
	public void setTno(String tno) throws RemoteException;
	public void setFac(String fac) throws RemoteException;

	
	public float gpa() throws RemoteException;
	
	//ABSTRACT GET METHODS TO RETURN DETAILS
	public String getName() throws RemoteException;
	public String getId() throws RemoteException;
	public String getGender() throws RemoteException;
	public String getDob() throws RemoteException;
	public String getAddress() throws RemoteException;
	public String getTno() throws RemoteException;
	public String getFac() throws RemoteException;
	//public float showgpa(float gpa)throws RemoteException;
}