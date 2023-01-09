package Thread;

import java.util.TimerTask;

public class MyTask extends TimerTask
{
    // "타이머 호출"
    public synchronized void run()
    {
        System.out.println("운동 중에는 틈틈이 물을 섭취해주세요!");
    }
}