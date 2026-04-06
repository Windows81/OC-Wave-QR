package com.google.android.datatransport.runtime.synchronization;

public interface SynchronizationGuard {

    public interface CriticalSection<T> {
        Object D();
    }

    Object b(CriticalSection criticalSection);
}
