package com.google.android.gms.tasks;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class Tasks {
    public static Object a(Task task) {
        Preconditions.k();
        Preconditions.i();
        Preconditions.n(task, "Task must not be null");
        if (task.m()) {
            return k(task);
        }
        zzad zzad = new zzad((zzac) null);
        l(task, zzad);
        zzad.c();
        return k(task);
    }

    public static Object b(Task task, long j2, TimeUnit timeUnit) {
        Preconditions.k();
        Preconditions.i();
        Preconditions.n(task, "Task must not be null");
        Preconditions.n(timeUnit, "TimeUnit must not be null");
        if (task.m()) {
            return k(task);
        }
        zzad zzad = new zzad((zzac) null);
        l(task, zzad);
        if (zzad.d(j2, timeUnit)) {
            return k(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static Task c(Executor executor, Callable callable) {
        Preconditions.n(executor, "Executor must not be null");
        Preconditions.n(callable, "Callback must not be null");
        zzw zzw = new zzw();
        executor.execute(new zzz(zzw, callable));
        return zzw;
    }

    public static Task d(Exception exc) {
        zzw zzw = new zzw();
        zzw.q(exc);
        return zzw;
    }

    public static Task e(Object obj) {
        zzw zzw = new zzw();
        zzw.r(obj);
        return zzw;
    }

    public static Task f(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return e((Object) null);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((Task) it.next()) == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        zzw zzw = new zzw();
        zzaf zzaf = new zzaf(collection.size(), zzw);
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            l((Task) it2.next(), zzaf);
        }
        return zzw;
    }

    public static Task g(Task... taskArr) {
        return (taskArr == null || taskArr.length == 0) ? e((Object) null) : f(Arrays.asList(taskArr));
    }

    public static Task h(Collection collection) {
        return i(TaskExecutors.f27184a, collection);
    }

    public static Task i(Executor executor, Collection collection) {
        return (collection == null || collection.isEmpty()) ? e(Collections.emptyList()) : f(collection).i(executor, new zzab(collection));
    }

    public static Task j(Task... taskArr) {
        return (taskArr == null || taskArr.length == 0) ? e(Collections.emptyList()) : h(Arrays.asList(taskArr));
    }

    public static Object k(Task task) {
        if (task.n()) {
            return task.k();
        }
        if (task.l()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.j());
    }

    public static void l(Task task, zzae zzae) {
        Executor executor = TaskExecutors.f27185b;
        task.f(executor, zzae);
        task.e(executor, zzae);
        task.a(executor, zzae);
    }
}
