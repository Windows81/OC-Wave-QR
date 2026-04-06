package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import java.util.concurrent.Callable;

@ElementTypesAreNonnullByDefault
public final class Callables {
    public static /* synthetic */ Object c(Supplier supplier, Callable callable) {
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        boolean g2 = g((String) supplier.get(), currentThread);
        try {
            return callable.call();
        } finally {
            if (g2) {
                g(name, currentThread);
            }
        }
    }

    public static /* synthetic */ void d(Supplier supplier, Runnable runnable) {
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        boolean g2 = g((String) supplier.get(), currentThread);
        try {
            runnable.run();
        } finally {
            if (g2) {
                g(name, currentThread);
            }
        }
    }

    public static Runnable e(Runnable runnable, Supplier supplier) {
        Preconditions.q(supplier);
        Preconditions.q(runnable);
        return new c(supplier, runnable);
    }

    public static Callable f(Callable callable, Supplier supplier) {
        Preconditions.q(supplier);
        Preconditions.q(callable);
        return new b(supplier, callable);
    }

    public static boolean g(String str, Thread thread) {
        try {
            thread.setName(str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }
}
