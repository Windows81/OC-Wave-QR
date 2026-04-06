package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.collect.ObjectArrays;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@ElementTypesAreNonnullByDefault
public final class SimpleTimeLimiter implements TimeLimiter {

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f29583a;

    /* renamed from: com.google.common.util.concurrent.SimpleTimeLimiter$1  reason: invalid class name */
    class AnonymousClass1 implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f29584a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ long f29585b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ TimeUnit f29586c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ Set f29587d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ SimpleTimeLimiter f29588e;

        public static /* synthetic */ Object b(Method method, Object obj, Object[] objArr) {
            try {
                return method.invoke(obj, objArr);
            } catch (InvocationTargetException e2) {
                throw SimpleTimeLimiter.e(e2, false);
            }
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            return this.f29588e.c(new e(method, this.f29584a, objArr), this.f29585b, this.f29586c, this.f29587d.contains(method));
        }
    }

    public static void d(long j2) {
        Preconditions.i(j2 > 0, "timeout must be positive: %s", j2);
    }

    public static Exception e(Exception exc, boolean z2) {
        Throwable cause = exc.getCause();
        if (cause != null) {
            if (z2) {
                cause.setStackTrace((StackTraceElement[]) ObjectArrays.d(cause.getStackTrace(), exc.getStackTrace(), StackTraceElement.class));
            }
            if (cause instanceof Exception) {
                throw ((Exception) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw exc;
            }
        } else {
            throw exc;
        }
    }

    public final Object c(Callable callable, long j2, TimeUnit timeUnit, boolean z2) {
        Preconditions.q(callable);
        Preconditions.q(timeUnit);
        d(j2);
        Future submit = this.f29583a.submit(callable);
        if (!z2) {
            return Uninterruptibles.b(submit, j2, timeUnit);
        }
        try {
            return submit.get(j2, timeUnit);
        } catch (InterruptedException e2) {
            submit.cancel(true);
            throw e2;
        } catch (ExecutionException e3) {
            throw e(e3, true);
        } catch (TimeoutException e4) {
            submit.cancel(true);
            throw new UncheckedTimeoutException(e4);
        }
    }
}
