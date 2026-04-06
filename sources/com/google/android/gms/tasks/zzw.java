package com.google.android.gms.tasks;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

final class zzw<TResult> extends Task<TResult> {

    /* renamed from: a  reason: collision with root package name */
    public final Object f27239a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final zzr f27240b = new zzr();

    /* renamed from: c  reason: collision with root package name */
    public boolean f27241c;

    /* renamed from: d  reason: collision with root package name */
    public volatile boolean f27242d;

    /* renamed from: e  reason: collision with root package name */
    public Object f27243e;

    /* renamed from: f  reason: collision with root package name */
    public Exception f27244f;

    public final Task a(Executor executor, OnCanceledListener onCanceledListener) {
        this.f27240b.a(new zzh(executor, onCanceledListener));
        y();
        return this;
    }

    public final Task b(OnCompleteListener onCompleteListener) {
        this.f27240b.a(new zzj(TaskExecutors.f27184a, onCompleteListener));
        y();
        return this;
    }

    public final Task c(Executor executor, OnCompleteListener onCompleteListener) {
        this.f27240b.a(new zzj(executor, onCompleteListener));
        y();
        return this;
    }

    public final Task d(OnFailureListener onFailureListener) {
        e(TaskExecutors.f27184a, onFailureListener);
        return this;
    }

    public final Task e(Executor executor, OnFailureListener onFailureListener) {
        this.f27240b.a(new zzl(executor, onFailureListener));
        y();
        return this;
    }

    public final Task f(Executor executor, OnSuccessListener onSuccessListener) {
        this.f27240b.a(new zzn(executor, onSuccessListener));
        y();
        return this;
    }

    public final Task g(Continuation continuation) {
        return h(TaskExecutors.f27184a, continuation);
    }

    public final Task h(Executor executor, Continuation continuation) {
        zzw zzw = new zzw();
        this.f27240b.a(new zzd(executor, continuation, zzw));
        y();
        return zzw;
    }

    public final Task i(Executor executor, Continuation continuation) {
        zzw zzw = new zzw();
        this.f27240b.a(new zzf(executor, continuation, zzw));
        y();
        return zzw;
    }

    public final Exception j() {
        Exception exc;
        synchronized (this.f27239a) {
            exc = this.f27244f;
        }
        return exc;
    }

    public final Object k() {
        Object obj;
        synchronized (this.f27239a) {
            try {
                v();
                w();
                Exception exc = this.f27244f;
                if (exc == null) {
                    obj = this.f27243e;
                } else {
                    throw new RuntimeExecutionException(exc);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public final boolean l() {
        return this.f27242d;
    }

    public final boolean m() {
        boolean z2;
        synchronized (this.f27239a) {
            z2 = this.f27241c;
        }
        return z2;
    }

    public final boolean n() {
        boolean z2;
        synchronized (this.f27239a) {
            try {
                z2 = false;
                if (this.f27241c && !this.f27242d && this.f27244f == null) {
                    z2 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    public final Task o(SuccessContinuation successContinuation) {
        Executor executor = TaskExecutors.f27184a;
        zzw zzw = new zzw();
        this.f27240b.a(new zzp(executor, successContinuation, zzw));
        y();
        return zzw;
    }

    public final Task p(Executor executor, SuccessContinuation successContinuation) {
        zzw zzw = new zzw();
        this.f27240b.a(new zzp(executor, successContinuation, zzw));
        y();
        return zzw;
    }

    public final void q(Exception exc) {
        Preconditions.n(exc, "Exception must not be null");
        synchronized (this.f27239a) {
            x();
            this.f27241c = true;
            this.f27244f = exc;
        }
        this.f27240b.b(this);
    }

    public final void r(Object obj) {
        synchronized (this.f27239a) {
            x();
            this.f27241c = true;
            this.f27243e = obj;
        }
        this.f27240b.b(this);
    }

    public final boolean s() {
        synchronized (this.f27239a) {
            try {
                if (this.f27241c) {
                    return false;
                }
                this.f27241c = true;
                this.f27242d = true;
                this.f27240b.b(this);
                return true;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public final boolean t(Exception exc) {
        Preconditions.n(exc, "Exception must not be null");
        synchronized (this.f27239a) {
            try {
                if (this.f27241c) {
                    return false;
                }
                this.f27241c = true;
                this.f27244f = exc;
                this.f27240b.b(this);
                return true;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public final boolean u(Object obj) {
        synchronized (this.f27239a) {
            try {
                if (this.f27241c) {
                    return false;
                }
                this.f27241c = true;
                this.f27243e = obj;
                this.f27240b.b(this);
                return true;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public final void v() {
        Preconditions.r(this.f27241c, "Task is not yet complete");
    }

    public final void w() {
        if (this.f27242d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    public final void x() {
        if (this.f27241c) {
            throw DuplicateTaskCompletionException.a(this);
        }
    }

    public final void y() {
        synchronized (this.f27239a) {
            try {
                if (this.f27241c) {
                    this.f27240b.b(this);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }
}
