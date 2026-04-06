package com.google.android.datatransport.runtime.retries;

public final class Retries {
    public static Object a(int i2, Object obj, Function function, RetryStrategy retryStrategy) {
        Object apply;
        if (i2 < 1) {
            return function.apply(obj);
        }
        do {
            apply = function.apply(obj);
            obj = retryStrategy.a(obj, apply);
            if (obj == null || i2 - 1 < 1) {
                return apply;
            }
            apply = function.apply(obj);
            obj = retryStrategy.a(obj, apply);
            break;
        } while (i2 - 1 < 1);
        return apply;
    }
}
