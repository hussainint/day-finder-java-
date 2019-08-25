package Project;


import java.util.Scanner;
public class day_finder
{

    public static void main(String args[])
    {
        while(true)
        {
            int mnth[]={31,29,31,30,31,30,31,31,30,31,30,31};
            int s=0;
            int day[]=new int [366];
            int k=0,m=1;
            int i,j;
            int b=0;
            int yr,dt,mt;
            int a=2;

            int opt;  

        
            Scanner sc=new Scanner(System.in);

            System.out.println("\n\n\t\t\t\t\tEnter 1 to know about the program\n\t\t\t\t\tEnter 2 to start");
            
            opt=sc.nextInt();
            if(opt==1)
            {
                System.out.println("\n\n\t\t\tIn This Program you can find the DAY of any DATE and Year\n\n\t\t\tBut you can find the day only after from the year 1900");
            }
            if(opt==2)
            {
                System.out.println("\n\t\t\t\t\t(:Enter the year:)only number");
                yr=sc.nextInt();

                System.out.println("\n\t\t\t\t\t(:Enter the month:)");
                mt=sc.nextInt();

                System.out.println("\n\t\t\t\t\t(:Enter the date:)");
                dt=sc.nextInt();
                int l=0;
                if(yr>=1900)
                {
                    if(mt>=1&&mt<=12)
                    {
                        if(mt==2)
                        {
                            if(mt%4==0)
                            {
                                if(dt<=29)
                                {
                                    l=1;
                                }
                                else
                                {
                                    System.out.println("\n\n\t\t\t\t\t\tYOU ENTERED A WRONG DATE");
                                }
                            }
                            else
                            {
                                if(dt<=28)
                                {
                                    l=1;
                                }
                                else
                                {
                                    System.out.println("\n\n\t\t\t\t\t\tYOU ENTERED A WRONG DATE");
                                }
                            }
                        }

                        if(mt==1||mt==3||mt==5||mt==7||mt==8||mt==10||mt==12)
                        {
                            if(dt<=31)
                                l=1;
                            else
                            {
                                System.out.println("\n\n\t\t\t\t\t\tYOU ENTERED A WRONG DATE");
                            }
                        }
                        if(mt==4||mt==6||mt==9||mt==11)
                        {
                            if(dt<=30)
                                l=1;
                            else
                            {
                                System.out.println("\n\n\t\t\t\t\t\tYOU ENTERED A WRONG DATE");
                            }
                        }

                        
                    
                    }
                    else
                    {
                        System.out.println("\n\n\t\t\t\t\t\tYOU ENTERED A WRONG MONTH");
                    }
                }
                else
                {
                    System.out.println("\n\n\t\t\t\t\t\tYOU SHOULD ENTER A YEAR AFTER 1900.....");
                }
                if(l==1)
                {
                    for(i=0;i<12;i++)
                    {
                        for(j=1;j<=mnth[i];j++)
                        {
                            day[k]=m;
                            ++k;
                            ++m;
                            if(m>7)
                                m=1;

                        }
                    }

                    if(mt>=2)
                    {
                        for(i=0;i<mt-1;i++)
                        {
                            s=s+mnth[i];

                        }
                        s=s+dt;
                        s=s-1;
                    }
                    else
                    {
                        s=dt;
                    }

                    if(mt==1||mt==2)
                        a=1;

                    b=day[s];
                    switch(a)
                    {
                        case 1:
                        for(i=1901;i<=yr;i++)
                        {
                            b=b+1;
                            if((i-1)%4==0)
                                ++b;

                            if(b>=8)
                                b=b-7;
                        }
                        break;

                        case 2:
                        for(i=1901;i<=yr;i++)
                        {
                            b=b+1;
                            if(i%4==0)
                                ++b;

                            if(b>=8)
                                b=b-7;
                        }
                        break;
                    }

                
                    switch(b)
                    {
                        case 1:
                        System.out.println("\n\n\t\t\t\t*****It Is SUNDAY*****");
                        break;

                        case 2:
                        System.out.println("\n\n\t\t\t\t*****It Is MONDAY*****");
                        break;

                        case 3:
                        System.out.println("\n\n\t\t\t\t*****It Is TUESDAY*****");
                        break;

                        case 4:
                        System.out.println("\n\n\t\t\t\t*****It Is WEDNESDAY*****");
                        break;

                        case 5:
                        System.out.println("\n\n\t\t\t\t*****It Is THURSDAY*****");
                        break;

                        case 6:
                        System.out.println("\n\n\t\t\t\t*****It Is FRIDAY*****");
                        break;

                        case 7:
                        System.out.println("\n\n\t\t\t\t*****It Is SATURDAY*****");
                        break;
                    }
                }
            }
            int ot;
            System.out.println("\n\n\t\t\t\t\t\tEnter 1 to restart...");
            System.out.println("\n\n\t\t\t\t\t\tEnter 0 to stop...");
            ot=sc.nextInt();
            if(ot==1)
                System.out.println('\u000c');

            if(ot==0)
            {
                System.out.println('\u000c');
                System.exit(0);
                break;
            }
        }
    }
}

