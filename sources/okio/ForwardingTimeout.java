package okio;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public class ForwardingTimeout extends Timeout {

    /* renamed from: g  reason: collision with root package name */
    public Timeout f43382g;

    public ForwardingTimeout(Timeout timeout) {
        Intrinsics.i(timeout, "delegate");
        this.f43382g = timeout;
    }

    public void a(Condition condition) {
        Intrinsics.i(condition, "condition");
        this.f43382g.a(condition);
    }

    public Timeout b() {
        return this.f43382g.b();
    }

    public Timeout c() {
        return this.f43382g.c();
    }

    public long d() {
        return this.f43382g.d();
    }

    public Timeout e(long j2) {
        return this.f43382g.e(j2);
    }

    public boolean f() {
        return this.f43382g.f();
    }

    public void g() {
        this.f43382g.g();
    }

    public Timeout h(long j2, TimeUnit timeUnit) {
        Intrinsics.i(timeUnit, "unit");
        return this.f43382g.h(j2, timeUnit);
    }

    public long i() {
        return this.f43382g.i();
    }

    public void j(Object obj) {
        Intrinsics.i(obj, "monitor");
        this.f43382g.j(obj);
    }

    public final Timeout k() {
        return this.f43382g;
    }

    public final ForwardingTimeout l(Timeout timeout) {
        Intrinsics.i(timeout, "delegate");
        this.f43382g = timeout;
        return this;
    }
}
