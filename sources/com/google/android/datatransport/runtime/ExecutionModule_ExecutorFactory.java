package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import java.util.concurrent.Executor;

public final class ExecutionModule_ExecutorFactory implements Factory<Executor> {

    public static final class InstanceHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final ExecutionModule_ExecutorFactory f24057a = new ExecutionModule_ExecutorFactory();
    }

    public static ExecutionModule_ExecutorFactory a() {
        return InstanceHolder.f24057a;
    }

    public static Executor b() {
        return (Executor) Preconditions.d(ExecutionModule.a());
    }

    /* renamed from: c */
    public Executor get() {
        return b();
    }
}
