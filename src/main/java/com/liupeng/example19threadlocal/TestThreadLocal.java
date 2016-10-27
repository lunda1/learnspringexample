package com.liupeng.example19threadlocal;

/**
 * Created by liupeng on 2016/10/27.
 */
public class TestThreadLocal {
    //虽然是static类型，但是每个线程的seqNum是独立的
    private static ThreadLocal<Integer> seqNum = new ThreadLocal<Integer>() {
        public Integer initialValue() {
            return 0;
        }
    };

    private static ThreadLocal<Integer> seqNum2 = new ThreadLocal<Integer>() {
        public Integer initialValue() {
            return 100;
        }
    };

    // ②获取下一个序列值
    public int getNextNum() {
        seqNum.set(seqNum.get() + 1);
        return seqNum.get();
    }

    // ②获取下一个序列值
    public int getNextNum2() {
        seqNum2.set(seqNum2.get() + 1);
        return seqNum2.get();
    }

    public static void main(String[] args) {
        TestThreadLocal sn = new TestThreadLocal();
        // ③ 3个线程共享sn，各自产生序列号
        TestClient t1 = new TestClient(sn);
        TestClient t2 = new TestClient(sn);
        TestClient t3 = new TestClient(sn);
        t1.start();
        t2.start();
        t3.start();
    }

    private static class TestClient extends Thread {
        private TestThreadLocal sn;

        public TestClient(TestThreadLocal sn) {
            this.sn = sn;
        }

        public void run() {
            for (int i = 0; i < 10; i++) {
                // ④每个线程打出3个序列值
                if("Thread-0".equals(Thread.currentThread().getName())){
                    System.out.println("    [" + Thread.currentThread().getName() + "] --> sn[" + sn.getNextNum() + "]");
                    System.out.println("      [" + Thread.currentThread().getName() + "] --> sn[" + sn.getNextNum2() + "]");
                }else if("Thread-1".equals(Thread.currentThread().getName())){
                    System.out.println("        [" + Thread.currentThread().getName() + "] --> sn[" + sn.getNextNum() + "]");
                    System.out.println("          [" + Thread.currentThread().getName() + "] --> sn[" + sn.getNextNum2() + "]");
                }else if("Thread-2".equals(Thread.currentThread().getName())){
                    System.out.println("            [" + Thread.currentThread().getName() + "] --> sn[" + sn.getNextNum() + "]");
                    System.out.println("              [" + Thread.currentThread().getName() + "] --> sn[" + sn.getNextNum2() + "]");
                }
            }
        }
    }
}
