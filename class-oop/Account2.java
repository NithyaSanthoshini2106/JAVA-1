public class Account2 {
    int acc_Id;
    String acc_Name;
    int acc_Bal;

    public Account2(int id,String name,int amount){
        this.acc_Id=id;
        this.acc_Name=name;
        this.acc_Bal=amount;
    }
    public boolean deposit_Amount(int amount){
        this.acc_Bal=this.acc_Bal+amount;
        return true;
    }
    public static void main(String[] args) {
       Account2 a1=new Account2(101,"Nithya Raju",5000);
       Account2 a2=new Account2(102,"Spoorthi Raju",50000);

       System.out.println(a1.acc_Name);
       System.out.println(a2.acc_Name);
       a1.deposit_Amount(100);
       a1.deposit_Amount(50);
       a2.deposit_Amount(10);
       System.out.println(a1.acc_Bal);
       System.out.println(a2.acc_Bal);
    }
}