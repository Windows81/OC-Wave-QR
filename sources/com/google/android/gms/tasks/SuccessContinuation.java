package com.google.android.gms.tasks;

public interface SuccessContinuation<TResult, TContinuationResult> {
    Task a(Object obj);
}
