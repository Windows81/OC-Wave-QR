package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

@ElementTypesAreNonnullByDefault
public final class ExecutionSequencer {

    /* renamed from: a  reason: collision with root package name */
    public ThreadConfinedTaskQueue f29482a;

    /* renamed from: com.google.common.util.concurrent.ExecutionSequencer$1  reason: invalid class name */
    class AnonymousClass1 implements AsyncCallable<Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Callable f29483a;

        public ListenableFuture call() {
            return Futures.e(this.f29483a.call());
        }

        public String toString() {
            return this.f29483a.toString();
        }
    }

    /* renamed from: com.google.common.util.concurrent.ExecutionSequencer$2  reason: invalid class name */
    class AnonymousClass2 implements AsyncCallable<Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TaskNonReentrantExecutor f29484a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ AsyncCallable f29485b;

        public ListenableFuture call() {
            return !this.f29484a.b() ? Futures.c() : this.f29485b.call();
        }

        public String toString() {
            return this.f29485b.toString();
        }
    }

    public enum RunningState {
        NOT_RUN,
        CANCELLED,
        STARTED
    }

    public static final class TaskNonReentrantExecutor extends AtomicReference<RunningState> implements Executor, Runnable {

        /* renamed from: A  reason: collision with root package name */
        public Executor f29489A;

        /* renamed from: B  reason: collision with root package name */
        public Runnable f29490B;
        public Thread C;

        /* renamed from: z  reason: collision with root package name */
        public ExecutionSequencer f29491z;

        public final boolean b() {
            return compareAndSet(RunningState.NOT_RUN, RunningState.STARTED);
        }

        public void execute(Runnable runnable) {
            if (get() == RunningState.CANCELLED) {
                this.f29489A = null;
                this.f29491z = null;
                return;
            }
            this.C = Thread.currentThread();
            try {
                ExecutionSequencer executionSequencer = this.f29491z;
                Objects.requireNonNull(executionSequencer);
                ThreadConfinedTaskQueue a2 = executionSequencer.f29482a;
                if (a2.f29492a == this.C) {
                    this.f29491z = null;
                    Preconditions.w(a2.f29493b == null);
                    a2.f29493b = runnable;
                    Executor executor = this.f29489A;
                    Objects.requireNonNull(executor);
                    a2.f29494c = executor;
                    this.f29489A = null;
                } else {
                    Executor executor2 = this.f29489A;
                    Objects.requireNonNull(executor2);
                    this.f29489A = null;
                    this.f29490B = runnable;
                    executor2.execute(this);
                }
            } finally {
                this.C = null;
            }
        }

        public void run() {
            Executor executor;
            Thread currentThread = Thread.currentThread();
            if (currentThread != this.C) {
                Runnable runnable = this.f29490B;
                Objects.requireNonNull(runnable);
                this.f29490B = null;
                runnable.run();
                return;
            }
            ThreadConfinedTaskQueue threadConfinedTaskQueue = new ThreadConfinedTaskQueue((AnonymousClass1) null);
            threadConfinedTaskQueue.f29492a = currentThread;
            ExecutionSequencer executionSequencer = this.f29491z;
            Objects.requireNonNull(executionSequencer);
            ThreadConfinedTaskQueue unused = executionSequencer.f29482a = threadConfinedTaskQueue;
            this.f29491z = null;
            try {
                Runnable runnable2 = this.f29490B;
                Objects.requireNonNull(runnable2);
                this.f29490B = null;
                runnable2.run();
                while (true) {
                    Runnable runnable3 = threadConfinedTaskQueue.f29493b;
                    if (runnable3 != null && (executor = threadConfinedTaskQueue.f29494c) != null) {
                        threadConfinedTaskQueue.f29493b = null;
                        threadConfinedTaskQueue.f29494c = null;
                        executor.execute(runnable3);
                    }
                }
            } finally {
                threadConfinedTaskQueue.f29492a = null;
            }
        }
    }

    public static final class ThreadConfinedTaskQueue {

        /* renamed from: a  reason: collision with root package name */
        public Thread f29492a;

        /* renamed from: b  reason: collision with root package name */
        public Runnable f29493b;

        /* renamed from: c  reason: collision with root package name */
        public Executor f29494c;

        public ThreadConfinedTaskQueue() {
        }

        public /* synthetic */ ThreadConfinedTaskQueue(AnonymousClass1 r1) {
            this();
        }
    }
}
