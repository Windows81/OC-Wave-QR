package com.google.android.gms.tasks;

public interface Continuation<TResult, TContinuationResult> {
    Object a(Task task);
}
