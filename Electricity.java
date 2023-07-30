import java.util.Scanner;
class Generates
{
    Scanner sc = new Scanner(System.in);
    String name;
    int id;
    float units, units2;
    float payment;
    float bill;
    float[] arr = new float[12];
    Generates(){
        name="";
        id=0;
        units=0;
        payment=0;
        bill=0;
    }
    Generates(String name , int id , float units , float units2, float payment, float bill)
    {
        this.name=name;
        this.id=id;
        this.units=units;
        this.payment=payment;
        this.bill=bill;
        arr[0] = units;
        arr[1] = units2;
        int i;
        for(i=2;i<12;i++)
        {
            arr[i] = 0;
        }
    }
    void Display()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("******ELECTRICITY BILL RECORD******");
        System.out.println("\n\tNAME : "+name);
        System.out.println("\n\tJanuary   =1," + "  February   =2," + "  March       =3," +
                "\n\tApril     =4," + "  May        =5," + "  June        =6," +
                "\n\tJuly      =7," + "  August     =8," + "  September   =9," +
                "\n\tOctober   =10," + " November   =11," + " December    =12");
        System.out.printf("\n\tEnter the month: ");
        int i =sc.nextInt();
        while(i==0 || i>12)
        {
            System.out.println("Invalid choice...");
            System.out.println("Enter again:");
            i=sc.nextInt();
        }
        int j=i-1;
        if(arr[j]==-1)
        {
            System.out.println("\t\nNo record present for this month.");
        }
        else {
            bill=(float)(1.18*3*arr[j]);
            System.out.println("\tUnits : "+arr[j]);
            System.out.println("\tGST = 18%");
            System.out.println("\n\tYour bill for this month is : "+bill+" Rs\n");
        }
    }
    void Payment()
    {
        System.out.println("\t"+name);
        System.out.println("\tYour pending bill is : "+payment);
        int amount;
        if(payment!=0)
        {
            System.out.println("\n\tEnter how much amount you want to pay now : ");
            amount=sc.nextInt();
            if(amount>payment){
                System.out.println("You are paying more money than pending bill..");
                return;
            }
            System.out.println("\n\t"+amount + " debited from your account successfully....");
            payment=payment-amount;
        }
    }
    void Meter_reading()
    {
        System.out.println("\t"+name);
        System.out.println("\n\tJanuary   =1," + "  February   =2," + "  March       =3," +
                "\n\tApril     =4," + "  May        =5," + "  June        =6," +
                "\n\tJuly      =7," + "  August     =8," + "  September   =9," +
                "\n\tOctober   =10," + " November   =11," + " December    =12");
        System.out.printf("\n\tEnter the month: ");
        int i =sc.nextInt();
        while(i==0 || i>12)
        {
            System.out.println("Invalid choice...");
            System.out.println("Enter again:");
            i=sc.nextInt();
        }
        int j=i-1;

        if(arr[j]==-1)
        {
            System.out.println("\tNo record present for this month.");
        }
        else {
            System.out.println("\tYour meter reading for this month is "+ arr[j]+" units");
        }
    }
    void Details(int j)
    {
        System.out.println("\t"+name+"\t\t\t\t"+id+"\t\t\t\t"+arr[j]+"\t\t\t\t"+payment);
    }
    void Iunit()
    {
        System.out.println("\n\tJanuary   =1," + "  February   =2," + "  March       =3," +
                "\n\tApril     =4," + "  May        =5," + "  June        =6," +
                "\n\tJuly      =7," + "  August     =8," + "  September   =9," +
                "\n\tOctober   =10," + " November   =11," + " December    =12");
        System.out.printf("\n\tEnter the month: ");
        int i =sc.nextInt();
        while(i==0 || i>12)
        {
            System.out.println("Invalid choice...");
            System.out.println("Enter again:");
            i=sc.nextInt();
        }
        int j=i-1;
        System.out.println("\tEnter the unit: ");
        arr[j] = sc.nextFloat();
    }
}

class Admin extends Generates
{
    Admin()
    {
        super();
    }
    void getter()
    {
        System.out.println("\tEnter the name of the consumer :");
        name=sc.nextLine();
        System.out.println("\tEnter the id :");
        id= sc.nextInt();
        System.out.println("\n\tJanuary   =1," + "  February   =2," + "  March       =3," +
                "\n\tApril     =4," + "  May        =5," + "  June        =6," +
                "\n\tJuly      =7," + "  August     =8," + "  September   =9," +
                "\n\tOctober   =10," + " November   =11," + " December    =12");
        System.out.printf("\n\tEnter the month: ");
        int i =sc.nextInt();
        while(i==0 || i>12)
        {
            System.out.println("Invalid choice...");
            System.out.println("Enter again:");
            i=sc.nextInt();
        }
        int j=i-2;
        System.out.println("\tEnter the units of electricity used :");
        arr[i-1]= sc.nextFloat();
        while(j>=0)
        {
            arr[j]=0;
            j--;
        }
        payment=0;
        bill=0;
    }
    void Details(int j)
    {
        System.out.println("\t"+name+"\t\t\t\t"+id+"\t\t\t\t"+arr[j]+"\t\t\t\t"+payment);
    }
    void Iunit()
    {
        System.out.println("\n\tJanuary   =1," + "  February   =2," + "  March       =3," +
                "\n\tApril     =4," + "  May        =5," + "  June        =6," +
                "\n\tJuly      =7," + "  August     =8," + "  September   =9," +
                "\n\tOctober   =10," + " November   =11," + " December    =12");
        System.out.printf("\n\tEnter the month: ");
        int i =sc.nextInt();
        while(i==0 || i>12)
        {
            System.out.println("Invalid choice...");
            System.out.println("Enter again:");
            i=sc.nextInt();
        }
        int j=i-1;
        System.out.println("Enter the unit: ");
        arr[j] = sc.nextFloat();
    }
}

public class Electricity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Generates ob1= new Generates("Nupur Gandhi" , 123 , 56.5f , 82.5f, 2000f , 0);
        Generates ob2= new Generates("Diksha Sharma" , 231, 45f , 85.6f,  2534f, 0);
        Generates ob3= new Generates("Dhruvi dholakia" , 345, 32.6f , 93.3f, 3541f , 0);
        Generates ob4= new Generates("Siddhi Pandya" , 456, 67f , 56.5f, 5754f, 0);
        Generates ob5= new Generates("Vrushti Patel" , 789, 70f , 74.4f, 1313f, 0);
        int i=0,n=1;
        Admin obj[]=new Admin[100];
        obj[i]=new Admin();
        Generates objs[]=new Generates[100];
        int opt,uid;
        int opt2;

        String pass;
        do {
            System.out.println("\n-----------------ELECTRICITY BILL SYSTEM------------------");
            System.out.println("\nEnter : ");
            System.out.println("\t1. To generate the bill");
            System.out.println("\t2. To check payment record");
            System.out.println("\t3. To make payment");
            System.out.println("\t4. To check your meter readings");
            System.out.println("\t5. To access admin rights");
            System.out.println("\t0. To exit");
            opt=sc.nextInt();

            switch(opt)
            {
                case 1:
                    System.out.println("\tEnter your id :");
                    uid=sc.nextInt();
                    if(uid==ob1.id || uid==ob2.id || uid==ob3.id || uid==ob4.id || uid==ob5.id){
                        if(uid==ob1.id)
                            ob1.Display();
                        else if (uid==ob2.id)
                            ob2.Display();
                        else if (uid==ob3.id)
                            ob3.Display();
                        else if (uid==ob4.id)
                            ob4.Display();
                        else if (uid==ob5.id)
                            ob5.Display();
                    }
                    else if(objs[0]!=null){
                        for (int j = 0; j < n; j++) {
                            if (uid == objs[j].id)
                            {
                                objs[j].Display();
                                break;
                            }
                            else {
                                System.out.println("\tNot valid id....");
                                break;
                            }
                        }
                    }
                    else {
                        System.out.println("\tNot valid id...");
                    }
                    break;
                case 2:
                    System.out.println("\tEnter your id :");
                    uid=sc.nextInt();
                    if(uid==ob1.id || uid==ob2.id || uid==ob3.id || uid==ob4.id || uid==ob5.id){
                        if(uid==ob1.id)
                            System.out.println("\t"+ob1.payment+" Rs is pending");
                        else if (uid==ob2.id)
                            System.out.println("\t"+ob2.payment+" Rs is pending");
                        else if (uid==ob3.id)
                            System.out.println("\t"+ob3.payment+" Rs is pending");
                        else if (uid==ob4.id)
                            System.out.println("\t"+ob4.payment+" Rs is pending");
                        else if (uid==ob5.id)
                            System.out.println("\t"+ob5.payment+" Rs is pending");
                        else
                            System.out.println("\tNot valid id");
                    }
                    else if(objs[0]!=null){
                        for (int j = 0; j < n; j++) {
                            if (uid == objs[j].id)
                            {
                                System.out.println("\t"+objs[j].payment+" Rs is pending");
                                break;
                            }
                        }
                    }
                    else {
                        System.out.println("\tnot valid id...");
                    }
                    break;
                case 3:
                    System.out.println("\tEnter your id :");
                    uid=sc.nextInt();
                    if(uid==ob1.id || uid==ob2.id || uid==ob3.id || uid==ob4.id || uid==ob5.id){
                        if(uid==ob1.id)
                            ob1.Payment();
                        else if (uid==ob2.id)
                            ob2.Payment();
                        else if (uid==ob3.id)
                            ob3.Payment();
                        else if (uid==ob4.id)
                            ob4.Payment();
                        else if (uid==ob5.id)
                            ob5.Payment();
                        else
                            System.out.println("\tNot valid id");
                    }
                    else if(objs[0]!=null){
                        for (int j = 0; j < n; j++) {
                            if (uid == objs[j].id)
                            {
                                objs[j].Payment();
                                break;
                            }
                        }
                    }
                    else {
                        System.out.println("Invalid id....");
                    }
                    break;
                case 4:
                    System.out.println("\tEnter your id :");
                    uid=sc.nextInt();
                    if(uid==ob1.id || uid==ob2.id || uid==ob3.id || uid==ob4.id || uid==ob5.id){
                        if(uid==ob1.id)
                            ob1.Meter_reading();
                        else if (uid==ob2.id)
                            ob2.Meter_reading();
                        else if (uid==ob3.id)
                            ob3.Meter_reading();
                        else if (uid==ob4.id)
                            ob4.Meter_reading();
                        else if (uid==ob5.id)
                            ob5.Meter_reading();
                        else
                            System.out.println("\tNot valid id");
                    }
                    else if(objs[0]!=null){
                        for (int j = 0; j < n; j++) {
                            if (uid == objs[j].id) {
                                objs[j].Meter_reading();
                                break;
                            } else {
                                System.out.println("\tNot valid id");
                                break;
                            }
                        }
                    }
                    else
                    {
                        System.out.println("Invalid id...");
                    }
                    break;
                case 5:
                    System.out.println("\tEnter the password");
                    sc.nextLine();
                    pass = sc.nextLine();
                    if(pass.equals("123password"))
                    {
                        do {
                            System.out.println("\n-----------------ADMIN RIGHTS------------------");
                            System.out.println("\nEnter :");
                            System.out.println("\t1. To insert data of new customer");
                            System.out.println("\t2. To insert data of existing customer");
                            System.out.println("\t3. To view details of all the consumers");
                            System.out.println("\t0. To exit admin portal");

                            opt2 = sc.nextInt();

                            switch(opt2)
                            {
                                case 1:

                                    obj[i]=new Admin();
                                    obj[i].getter();
                                    objs[i]=new Generates(obj[i].name,obj[i].id,obj[i].units,obj[i].units2,obj[i].payment,obj[i].bill);
                                    i++;
                                    n++;
                                    break;
                                case 2:
                                    System.out.println("\tEnter the id :");
                                    uid=sc.nextInt();
                                    if(uid==ob1.id || uid==ob2.id || uid==ob3.id || uid==ob4.id || uid==ob5.id){
                                        if(uid==ob1.id)
                                            ob1.Iunit();
                                        else if (uid==ob2.id)
                                            ob2.Iunit();
                                        else if (uid==ob3.id)
                                            ob3.Iunit();
                                        else if (uid==ob4.id)
                                            ob4.Iunit();
                                        else if (uid==ob5.id)
                                            ob5.Iunit();
                                        else
                                            System.out.println("\tNot valid id");
                                    }
                                    else if(objs[0]!=null){
                                        for (int j = 0; j < n; j++) {
                                            if (uid == objs[j].id) {
                                                objs[j].Iunit();
                                                break;
                                            } else {
                                                System.out.println("\tNot valid id");
                                                break;
                                            }
                                        }
                                    }
                                    else {
                                        System.out.println("Invalid id...");
                                    }
                                    break;
                                case 3:
                                    System.out.println("\n\tJanuary   =1," + "  February   =2," + "  March       =3," +
                                            "\n\tApril     =4," + "  May        =5," + "  June        =6," +
                                            "\n\tJuly      =7," + "  August     =8," + "  September   =9," +
                                            "\n\tOctober   =10," + " November   =11," + " December    =12");
                                    System.out.printf("\n\tEnter the month: ");
                                    int k =sc.nextInt();
                                    while(k==0 || k>12)
                                    {
                                        System.out.println("Invalid choice...");
                                        System.out.println("Enter again:");
                                        k=sc.nextInt();
                                    }
                                    int j=k-1;
                                    System.out.println("\tName: \t\t\t\tId: \t\t\t\tUnits: \t\t\t\tPayment: ");
                                    System.out.println("");
                                    ob1.Details(j);
                                    ob2.Details(j);
                                    ob3.Details(j);
                                    ob4.Details(j);
                                    ob5.Details(j);
                                    for(int l=0;l<n-1;l++)
                                    {
                                        obj[l].Details(j);
                                    }
                                    break;
                                default:
                                    System.out.println("Wrong choice.");
                                    break;
                            }

                        }while(opt2!=0);
                    }
                    else {
                        System.out.println("\tNot valid password");
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid choice ....");1

                    break;
            }
        }while(opt!=0);
    }
}