//arv / subbklass till create_account
public class create_account extends Account{
    create_account(String n,int acc_num,int b,String a_t){ // Valet att göra ett konto, namn, nummer och kontotyp

    }
    create_account(){
        super();
    }

    void insert(String n,int acc_num,String a_t){ // sätta in namn, nummer och typ
        name=n;
        acc_type=a_t;
        Acc_num=acc_num; // generate random number
        Acc_Balance=0;
    }
// val 5 (att visa all information)
    void display_details(){
        System.out.println("Depositor Name :" +name);
        System.out.println("Account Number : "+Acc_num);
        System.out.println("Account Balance : "+Acc_Balance);
        System.out.println("Account Type : "+acc_type);
    }

    void deposite(int acc_num,int money){
        Acc_Balance=money;
    }

    int withdraw(int withd){
        Acc_Balance=Acc_Balance-withd;
        return Acc_Balance;
    }
}
