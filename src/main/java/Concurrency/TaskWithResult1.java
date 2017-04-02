package Concurrency;

import java.util.concurrent.Callable;

/**
 * @author tengqingya
 * @create 2017-04-02 14:46
 */
public class TaskWithResult1 implements Callable<String> {

    private int id;

    public TaskWithResult1( int id) {
        this.id = id;
    }

    public String call() throws Exception {
        return "result of TaskWithResult1 " + id;

    }
}
