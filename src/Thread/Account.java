package Thread;

public class Account
{
    int balance = 1000;
    public void withdraw(int money)
    {
        // 잔고가 찾으려는 금액보다 클 때
        if(balance >= money)
        {
            try
            {    // 1초
                Thread.sleep(1000);
            }catch(Exception e) { }
            balance -= money;
        }
    }
}

