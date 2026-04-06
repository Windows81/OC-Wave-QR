package com.google.firebase.crashlytics.internal.common;

import android.os.Looper;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class Utils {

    /* renamed from: a  reason: collision with root package name */
    public static final ExecutorService f30105a = ExecutorUtils.c("awaitEvenIfOnMainThread task continuation executor");

    public static Object f(Task task) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        task.h(f30105a, new s(countDownLatch));
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(3, TimeUnit.SECONDS);
        } else {
            countDownLatch.await(4, TimeUnit.SECONDS);
        }
        if (task.n()) {
            return task.k();
        }
        if (task.l()) {
            throw new CancellationException("Task is already canceled");
        } else if (task.m()) {
            throw new IllegalStateException(task.j());
        } else {
            throw new TimeoutException();
        }
    }

    public static boolean g(CountDownLatch countDownLatch, long j2, TimeUnit timeUnit) {
        long nanos;
        boolean await;
        boolean z2 = false;
        try {
            nanos = timeUnit.toNanos(j2);
            while (true) {
                await = countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                break;
            }
            if (z2) {
                Thread.currentThread().interrupt();
            }
            return await;
        } catch (InterruptedException unused) {
            z2 = true;
            nanos = (System.nanoTime() + nanos) - System.nanoTime();
        } catch (Throwable th) {
            if (z2) {
                Thread.currentThread().interrupt();
            }
            throw th;
        }
    }

    public static Task h(Executor executor, Callable callable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor.execute(new t(callable, executor, taskCompletionSource));
        return taskCompletionSource.a();
    }

    public static /* synthetic */ Object j(TaskCompletionSource taskCompletionSource, Task task) {
        if (task.n()) {
            taskCompletionSource.c(task.k());
            return null;
        } else if (task.j() == null) {
            return null;
        } else {
            taskCompletionSource.b(task.j());
            return null;
        }
    }

    public static /* synthetic */ void k(Callable callable, Executor executor, TaskCompletionSource taskCompletionSource) {
        try {
            ((Task) callable.call()).h(executor, new v(taskCompletionSource));
        } catch (Exception e2) {
            taskCompletionSource.b(e2);
        }
    }

    public static /* synthetic */ Void l(TaskCompletionSource taskCompletionSource, Task task) {
        if (task.n()) {
            taskCompletionSource.e(task.k());
            return null;
        } else if (task.j() == null) {
            return null;
        } else {
            taskCompletionSource.d(task.j());
            return null;
        }
    }

    public static /* synthetic */ Void m(TaskCompletionSource taskCompletionSource, Task task) {
        if (task.n()) {
            taskCompletionSource.e(task.k());
            return null;
        } else if (task.j() == null) {
            return null;
        } else {
            taskCompletionSource.d(task.j());
            return null;
        }
    }

    public static Task n(Task task, Task task2) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        u uVar = new u(taskCompletionSource);
        task.g(uVar);
        task2.g(uVar);
        return taskCompletionSource.a();
    }

    public static Task o(Executor executor, Task task, Task task2) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        w wVar = new w(taskCompletionSource);
        task.h(executor, wVar);
        task2.h(executor, wVar);
        return taskCompletionSource.a();
    }
}
