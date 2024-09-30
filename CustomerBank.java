class customer{
    private int accno;
    private String accname;
    private int bal;
    customer(int an,String aname ,int balance){
        this.accno=an;
        this.accname=aname;
        this.bal=balance;
    }
    synchronized void deposite(int money){
        System.out.println("try to deposite "+ money);
        bal = bal + money;
        System.out.println("Deposite succesfull");
        System.out.println("Avail Balance is "+ bal);
        notify();
    }
    synchronized void withdraw(int amount){
        System.out.println("try withdrawal" + amount);
        while(amount>bal){
            try{
                wait();
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        bal = bal - amount;
        System.out.println("withdrawal successful");
        System.out.println("Avail balance is "+ bal);
    }
}
class CustomerBank{
    public static void main(String args[]){
        customer c=new customer(1001,"sai",1000);
        Thread tw=new Thread(()->{
            c.withdraw(1500);
        });
        Thread td = new Thread(()->{
            c.deposite(2000);
        });
        tw.start();
        td.start();
    }
}

