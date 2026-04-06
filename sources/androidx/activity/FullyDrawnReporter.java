package androidx.activity;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class FullyDrawnReporter {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f61a;

    /* renamed from: b  reason: collision with root package name */
    public final Function0 f62b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f63c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public int f64d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f65e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f66f;

    /* renamed from: g  reason: collision with root package name */
    public final List f67g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public final Runnable f68h = new q(this);

    public FullyDrawnReporter(Executor executor, Function0 function0) {
        Intrinsics.i(executor, "executor");
        Intrinsics.i(function0, "reportFullyDrawn");
        this.f61a = executor;
        this.f62b = function0;
    }

    public static final void h(FullyDrawnReporter fullyDrawnReporter) {
        synchronized (fullyDrawnReporter.f63c) {
            try {
                fullyDrawnReporter.f65e = false;
                if (fullyDrawnReporter.f64d == 0 && !fullyDrawnReporter.f66f) {
                    fullyDrawnReporter.f62b.invoke();
                    fullyDrawnReporter.d();
                }
                Unit unit = Unit.f40552a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Function0 function0) {
        boolean z2;
        Intrinsics.i(function0, "callback");
        synchronized (this.f63c) {
            if (this.f66f) {
                z2 = true;
            } else {
                this.f67g.add(function0);
                z2 = false;
            }
        }
        if (z2) {
            function0.invoke();
        }
    }

    public final void c() {
        synchronized (this.f63c) {
            try {
                if (!this.f66f) {
                    this.f64d++;
                }
                Unit unit = Unit.f40552a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        synchronized (this.f63c) {
            try {
                this.f66f = true;
                for (Function0 invoke : this.f67g) {
                    invoke.invoke();
                }
                this.f67g.clear();
                Unit unit = Unit.f40552a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean e() {
        boolean z2;
        synchronized (this.f63c) {
            z2 = this.f66f;
        }
        return z2;
    }

    public final void f() {
        if (!this.f65e && this.f64d == 0) {
            this.f65e = true;
            this.f61a.execute(this.f68h);
        }
    }

    public final void g() {
        int i2;
        synchronized (this.f63c) {
            try {
                if (!this.f66f && (i2 = this.f64d) > 0) {
                    this.f64d = i2 - 1;
                    f();
                }
                Unit unit = Unit.f40552a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
