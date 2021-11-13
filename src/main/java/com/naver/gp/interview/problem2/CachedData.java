package com.naver.gp.interview.problem2;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author gongpan
 * @date 2021-11-13
 * ReentrantReadWriteLock based on the CAS
 * better than ReentrantLock
 */
public class CachedData {
    ReentrantReadWriteLock read = new ReentrantReadWriteLock();
    Object data;

    // volatile 保证了线程的可见性和有序性
    volatile boolean isCachevalid = true;

    public void processCachedData() throws Exception {
        read.readLock();
        if (isCachevalid) {
            doSomething(data);
        } else {
            try {
                read.readLock().unlock();
                read.writeLock().lock();
                data = "setData(...)";
                System.out.println("setData(...)");
            } catch (Exception e) {
                throw e;
            } finally {
                read.writeLock().unlock();
            }
            read.readLock().unlock();
            doSomething(data);
        }
    }

    void doSomething(Object data) {
        // do something with data...
        System.out.println("doSomething(...)");
    }

}
