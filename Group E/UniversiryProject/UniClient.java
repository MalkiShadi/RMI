import java.rmi.Naming;
import java.util.Scanner;

public class UniClient {

	public static String stugpa;


	public static void main (String args[]){


		try{
			UniInterface u1 = (UniInterface) Naming.lookup("groupE");
			Scanner input = new Scanner(System.in);

			int enter = 1;
				
			

				System.out.println("***************___Welcome to FOT Student Management System___***************");

			while(enter == 1){

			
				
				System.out.println("\t1.Add Student Details.");
				System.out.println("\t2.View Subjects.");
				System.out.println("\t3.Calculate GPA.");
				System.out.println("\t4.Retrive Student details");
				System.out.println("\t");
				System.out.println("\tSelect Option to Continue: ");

				int op = input.nextInt();

				switch(op){

					//INITIALIZED VALUE
					case 1:
						input.nextLine();
						System.out.println("Enter Student name: ");
						String name = input.nextLine();
						u1.setName(name);

						
						System.out.println("Enter Student ID: ");
						String id = input.nextLine();
						u1.setId(id);

					
						System.out.println("Enter Student gender: ");
						String gender = input.nextLine();
						u1.setGender(gender);

						
						System.out.println("Enter Student DOB: ");
						String dob = input.nextLine();
						u1.setDob(dob);

						
						System.out.println("Enter Student address: ");
						String address = input.nextLine();
						u1.setAddress(address);

						
						System.out.println("Enter Student telephone number: ");
						String tno = input.nextLine();
						u1.setTno(tno);

					
						System.out.println("Enter Student faculty: ");
						String fac = input.nextLine();
						u1.setFac(fac);

						break;

					case 2:
							int count=1;

							loop:while(count==1){


								System.out.println("\t1.ICT. ");
								System.out.println("\t2.BST. ");
								System.out.println("\t0 to Exit.");
								

								int choose = input.nextInt();

								switch(choose){
									case 0:
										break loop;

									case 1:

										System.out.println("\t1.1st Year. ");
										System.out.println("\t2.2nd Year. ");
										System.out.println("\t3.3rd Year. ");
										System.out.println("\t4.4th Year. ");


										int iyear = input.nextInt();

										switch(iyear){

											case 1:
												System.out.println("Essentials of ICT & PC Application");
												System.out.println("Practica for Essentials of ICT & PC Application");
												System.out.println("Database Design");
												System.out.println("Practical for Database Design");
												System.out.println("Mathematics for ICT");

												break;
											case 2:
												System.out.println("OOAD");
												System.out.println("Digital Electronics");
												System.out.println("Distributed & Cloud Computin");
												System.out.println("Practica for Distributed & Cloud Computin");
												System.out.println("E-Commerce");

												break;
											case 3:

												System.out.println("\t Select your Specialization: ");
												System.out.println("\t1.Software. ");
												System.out.println("\t2.Network. ");
												System.out.println("\t0 to Exit.");
												
												int spcial1= input.nextInt();

												int spec1=1;

												loop1:while(spec1==1){
													switch(spcial1){

														case 0:
															break loop1;

														case 1:

															System.out.println("Mobile application Development");
															System.out.println("Wireless Network");
															System.out.println("Practical for Mobile application Development");
															System.out.println("Practical for Wireless Network");
															System.out.println("Embedded System");

															break;

														case 2:

															System.out.println("Servide oriented web application");
															System.out.println("Information System Security");
															System.out.println("lecture survey");
															System.out.println("Practical for Wireless Network");
															System.out.println("Embedded System");

															break;
														default:
															System.out.println("ERROR.....Please enter valid Input......");
													}
													System.out.println("\tGo back to Departments 1 ,To Exit 0:  ");
													count= input.nextInt();
												}
												
										// }
										//System.out.println("\tGo back to Departments 1 ,To Exit 0: ");
										//count= input.nextInt();

										break;


											case 4:

												System.out.println("\t Select your Specialization: ");
												System.out.println("\t1.Software. ");
												System.out.println("\t2.Network. ");
												System.out.println("\t0 to Exit.");
												
												int spcial2= input.nextInt();

												int spec2=1;

												loop2:while(spec2==1){
													switch(spcial2){

														case 0:
															break loop2;

														case 1:

															System.out.println("Mobile application Development");
															System.out.println("Wireless Network");
															System.out.println("Practical for Mobile application Development");
															System.out.println("Practical for Wireless Network");
															System.out.println("Embedded System");

															break;

														case 2:

															System.out.println("Servide oriented web application");
															System.out.println("Information System Security");
															System.out.println("lecture survey");
															System.out.println("Practical for Wireless Network");
															System.out.println("Embedded System");

															break;
														default:
															System.out.println("ERROR.....Please enter valid Input......");
													}
													System.out.println("\tGo back to Departments 1 ,To Exit 0:  ");
													count= input.nextInt();
												}
												
												break;
											default:
												System.out.println("ERROR.....Please enter valid Input......");

										}
							System.out.println("\tGo back to Departments 1 ,To Exit 0: ");
							count= input.nextInt();

							break;


									case 2:

										System.out.println("\t1.1st Year. ");
										System.out.println("\t2.2nd Year. ");
										System.out.println("\t3.3rd Year. ");
										System.out.println("\t4.4th Year. ");

										int byear = input.nextInt();

										switch(byear){

											case 1:
												System.out.println("");
												System.out.println("");
												System.out.println("");

												break;
											case 2:
												System.out.println("");
												System.out.println("");
												System.out.println("");

												break;
											case 3:
												System.out.println("");
												System.out.println("");
												System.out.println("");

												break;
											case 4:
												System.out.println("");
												System.out.println("");
												System.out.println("");

												break;
										default:
											System.out.println("ERROR.....Please enter valid Input......");

										}

									}
							
						}		
						break;

					case 3:
																 			
									       
						String[] cal = new String[7];
						int[] credit = new int[7];
						int cred;
									        
						System.out.println("-----GPA Calculation-----");     
									        	
						java.text.DecimalFormat dfm = new java.text.DecimalFormat("0.00");

						System.out.println("enter your credits \t");
									        
						for(int i=0 ; i< 7;++i){
							
							credit[i] = input.nextInt();	        
						
						}
									        
						double grade = 0;
						double total = 0;
						int sum = 0;
						input.nextLine();
						for(int i=0; i<7;i++){
							
							System.out.println(i+1 + " subject grade: ");
							cal[i] = input.nextLine();

											
							if(cal[i].equalsIgnoreCase("A")){
								grade = 4;
							}else if(cal[i].equalsIgnoreCase("B+")){
								grade = 3.5;
							}else if(cal[i].equalsIgnoreCase("B")){
								grade = 3;
							}else if(cal[i].equalsIgnoreCase("C+")){
								grade = 2.5;
							}else if(cal[i].equalsIgnoreCase("C")){
								grade = 2;
							}else if(cal[i].equalsIgnoreCase("D+")){
								grade = 1.5;
							}else if(cal[i].equalsIgnoreCase("D")){
								grade = 1;
							}else{
								grade = 0;
							}
							

							for(int c=0 ; c<7; ++c){	
								total = total + (grade * credit[c]);
								sum = sum+=credit[c];	
							}
						}
						stugpa = dfm.format(total/sum);
						System.out.println("Your GPA : " + stugpa);
									            
						break;

					case 4:
						System.out.println(".......... Students Details ..........");
									
						System.out.println("Student name: "+u1.getName());
						System.out.println("Student Id: "+u1.getId());
						System.out.println("Student Gender: "+u1.getGender());
						System.out.println("Student DOB: "+u1.getDob());
						System.out.println("Student Address: "+u1.getAddress());
						System.out.println("Student telephone number: "+u1.getTno());
						System.out.println("Student faculty: "+u1.getFac());
						System.out.println("Student GPA: "+ stugpa);

						break;

					default:
						System.out.println("ERROR.....Please enter valid Input!!!!");
				}
			}

				System.out.println("\tIf you want to continue enter 1 if not enter 0: ");
				enter = input.nextInt();

			} 

		
		
		catch(Exception e){
			System.out.println("ERROR " +e );
		}
	}
}




