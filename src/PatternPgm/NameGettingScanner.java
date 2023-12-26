package PatternPgm;
import java.util.*;
public class NameGettingScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name : ");
		String name = sc.nextLine();
		int delay = 200;
		System.out.println("**************************************************************************************************************************************************************************************************");
		System.out.println();
		
		for(int i=1;i<=5;i++)
		{
			for(int j=0;j<name.length();j++)
			{
				char ch = name.charAt(j);
						
				switch(ch)
				{
					case 'A' : for(int k=1;k<=5;k++)
								{
									if(k==1 || i==3 ||k==5 || i==1)
									{
										System.out.print("* ");
									}
									else
									{
										System.out.print("  ");
									}
								}
									System.out.print("   ");
								
									break;
					
					case 'B' : for(int k=1;k<=5;k++)
								{
									if((i==1) || (i==5) || (k==1) || (i==3 && i+k==5 && i*k==6) || (i==3 && i+k==6 && i*k==9) || (i==3 && i+k==7 && i*k==12) || (i==2 && i+k==7 && i*k==10) || (i==4 && i+k==9 && i*k==20))
									{
										System.out.print("* ");
									}
									else
									{
										System.out.print("  ");
									}
								}
									System.out.print("   ");
									break;
									
					case 'C' : for(int k=1;k<=5;k++)
								{
									if(i==1 || i==5 ||k==1 )
									{
										System.out.print("* ");
									}
									else
									{
										System.out.print("  ");
									}
								}		
									System.out.print("   ");
									break;
					
					case 'D' : for(int k=1;k<=5;k++)
								{
									if(i==1 || i==5 ||k==2 ||k==5)
									{
										System.out.print("* ");
									}
									else
									{
										System.out.print("  ");
									}
								}		
									System.out.print("   ");
									break;
									
					case 'E' : for(int k=1;k<=5;k++)
								{
									if(i==1 || i==5 ||i==3 ||k==1)
									{
										System.out.print("* ");
									}
									else
									{
										System.out.print("  ");
									}
								}		
									System.out.print("   ");
									break;
					
					case 'F' : for(int k=1;k<=5;k++)
							{
								if(i==1 || i==3 ||k==1)
								{
									System.out.print("* ");
								}
								else
								{
									System.out.print("  ");
								}
							}		
								System.out.print("   ");
								break;
					
					case 'G' : for(int k=1;k<=5;k++)
					{
								if(k==1 || i==3 && i+k==6 && i*k==9  ||i==3 && i+k==7 && i*k==12 || 
								i==3 && i+k==8 && i*k==15 || i==4 && i+k==7 && i*k==12 ||i==4 && i+k==9 && i*k==20 ||
								i==5 && i+k==7 && i*k==10 || i==5 && i+k==8 && i*k==15 ||i==5 && i+k==10 && i*k==25)
								{
									System.out.print("* ");
								}
								else
								{
									System.out.print("  ");
								}
							}		
								System.out.print("   ");
								break;
					
					case 'H' : for(int k=1;k<=5;k++)
								{
									if(i==3 || k==1 ||k==5)
									{
										System.out.print("* ");
									}
									else
									{
										System.out.print("  ");
									}
								}		
								System.out.print("   ");
								break;
							
					case 'I' : for(int k=1;k<=5;k++)
								{
									if(i==1 || i==5 ||k==3 )
									{
										System.out.print("* ");
									}
									else
									{
										System.out.print("  ");
									}
								}		
									System.out.print("   ");
									break;
									
					case 'J' : for(int k=1;k<=5;k++)
								{
									if(i==1 || i==5 && i+k==7 && i*k==10 || i==5 && i+k==6 && i*k==5 || i==4 && i+k==5 && i*k==4 ||k==3 )
									{
										System.out.print("* ");
									}
									else
									{
										System.out.print("  ");
									}
								}		
									System.out.print("   ");
									break;
									
					case 'K' : for(int k=1;k<=5;k++)
								{
									if(k==1 || i==1 && i+k==5 && i*k==4 || i==2 && i+k==5 && i*k==6 || i==3 && i+k==5 && i*k==6 
											|| i==4 && i+k==7 && i*k==12 || i==5 && i+k==9 && i*k==20 )
									{
										System.out.print("* ");
									}
									else
									{
										System.out.print("  ");
									}
								}		
									System.out.print("   ");
									break;
									
					case 'L' : for(int k=1;k<=5;k++)
								{
									if(i==5 || k==1 )
									{
										System.out.print("* ");
									}
									else
									{
										System.out.print("  ");
									}
								}		
									System.out.print("   ");
									break;
									
					case 'M' : for(int k=1;k<=5;k++)
								{
									if(k==1 || k==5 || i+k==4 && i*k==4 || i+k==6 && i*k==8 && i==2 || i+k==6 && i*k==9 && i==3)
									{
										System.out.print("* ");
									}
									else
									{
										System.out.print("  ");
									}
								}		
									System.out.print("   ");
									break;
					case 'N' : for(int k=1;k<=5;k++)
								{
									if(i==k || k==1 || k==5)
									{
										System.out.print("* ");
									}
									else
									{
										System.out.print("  ");
									}
								}		
									System.out.print("   ");
									break;
					case 'O' : for(int k=1;k<=5;k++)
								{
									if(i==1 || k==1 || k==5 ||i==5)
									{
										System.out.print("* ");
									}
									else
									{
										System.out.print("  ");
									}
								}		
									System.out.print("   ");
									break;
									
					case 'P' : for(int k=1;k<=5;k++)
								{
									if(i==1 || k==1 || i==2 && i+k==7 && i*k==10 ||i==3)
									{
										System.out.print("* ");
									}
									else
									{
										System.out.print("  ");
									}
								}		
									System.out.print("   ");
									break;
					
					case 'Q' : for(int k=1;k<=5;k++)
								{
									if( k==1 || k==4 ||i==5 || i==3 && i+k==6 && i*k==9 || i==5 && i+k==10 && i*j==25
										|| i==1 && i+k==3 && i*k==2	|| i==1 && i+k==4 && i*k==3	)
									{
										System.out.print("* ");
									}
									else
									{
										System.out.print("  ");
									}
								}		
									System.out.print("   ");
									break;
									
					case 'R' : for(int k=1;k<=5;k++)
								{
									if(i==1 || k==1 ||i==3 || i==2 && i+k==7 && i*k==10 || 
											i==4 && i+k==8 && i*k==16 || i==5 && i+k==10 && i*k==25 )
									{
										System.out.print("* ");
									}
									else
									{
										System.out.print("  ");
									}
								}		
									System.out.print("   ");
									break;
									
					case 'S' : for(int k=1;k<=5;k++)
								{
									if(i==1 || i==3 || i==5 ||i==2 && i+k==3 && i*k==2 || i==4 && i+k==9 && i*k==20)
									{
										System.out.print("* ");
									}
									else
									{
										System.out.print("  ");
									}
								}		
									System.out.print("   ");
									break;
									
					case 'T' : for(int k=1;k<=5;k++)
								{
									if(i==1 || k==3 )
									{
										System.out.print("* ");
									}
									else
									{
										System.out.print("  ");
									}
								}		
									System.out.print("   ");
									break;
					case 'U' : for(int k=1;k<=5;k++)
								{
									if(i==5 || k==1 ||k==5 )
									{
										System.out.print("* ");
									}
									else
									{
										System.out.print("  ");
									}
								}		
									System.out.print("   ");
									break;
						
					case 'V' : for(int k=1;k<=5;k++)
								{
									if(i==1 && i+k==2 && i*k==1 || i==1 && i+k==6 && i*k==5 
											|| i==2 && i+k==3 && i*k==2 || i==2 && i+k==7 && i*k==10 
											|| i==3 && i+k==4 && i*k==3 || i==3 && i+k==8 && i*k==15
											|| i==4 && i+k==6 && i*k==8 || i==4 && i+k==8 && i*k==16 
											|| i==5 && i+k==8 && i*k==15 )
									{
										System.out.print("* ");
									}
									else
									{
										System.out.print("  ");
									}
								}		
									System.out.print("   ");
									break;
									
					case 'W' : for(int k=1;k<=5;k++)
								{
									if( k==1 ||k==5 || i==3 && i+k==6 && i*k==9
											|| i==4 && i+k==6 && i*k==8 || i==4 && i+k==8 && i*k==16)
									{
										System.out.print("* ");
									}
									else
									{
										System.out.print("  ");
									}
								}		
									System.out.print("   ");
									break;
									
					case 'X' : for(int k=1;k<=5;k++)
								{
									if(i==k || i+k==6 )
									{
										System.out.print("* ");
									}
									else
									{
										System.out.print("  ");
									}
								}		
									System.out.print("   ");
									break;
									
					case 'Y' : for(int k=1;k<=5;k++)
								{
									if(i==1 && i+k==2 && i*k==1 ||i==2 && i+k==4 && i*k==4  || i+k==6 )
									{
										System.out.print("* ");
									}
									else
									{
										System.out.print("  ");
									}
								}		
								System.out.print("   ");
								break;
								
					case 'Z' : for(int k=1;k<=5;k++)
								{
									if(i==1 || i+k==6 ||i==5)
									{
										System.out.print("* ");
									}
									else
									{
										System.out.print("  ");
									}
								}		
									System.out.print("   ");
									break;
									
					case '*' : for(int k=1;k<=5;k++)
								{
									if(i==1 && i+k==3 && i*k==2 || i==1 && i+k==5 && i*k==4 
											|| i==2 && i+k==3 && i*k==2 || i==2 && i+k==7 && i*k==10 
											|| i==3 && i+k==4 && i*k==3 || i==3 && i+k==8 && i*k==15 || i==3 && i+k==6 && i*k==9
											|| i==4 && i+k==6 && i*k==8 || i==4 && i+k==8 && i*k==16 
											|| i==5 && i+k==8 && i*k==15)
									{
										System.out.print("* ");
									}
									else
									{
										System.out.print("  ");
									}
								}		
									System.out.print("   ");
									break;
									
				}
				
				try {
					Thread.sleep(delay);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("**************************************************************************************************************************************************************************************************");
		
	}

}
