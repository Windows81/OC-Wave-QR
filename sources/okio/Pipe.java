package okio;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;

@Metadata
public final class Pipe {

    /* renamed from: a  reason: collision with root package name */
    public final long f43410a;

    /* renamed from: b  reason: collision with root package name */
    public final Buffer f43411b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f43412c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f43413d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f43414e;

    /* renamed from: f  reason: collision with root package name */
    public Sink f43415f;

    /* renamed from: g  reason: collision with root package name */
    public final ReentrantLock f43416g;

    /* renamed from: h  reason: collision with root package name */
    public final Condition f43417h;

    /* renamed from: i  reason: collision with root package name */
    public final Sink f43418i;

    public final Buffer a() {
        return this.f43411b;
    }

    public final boolean b() {
        return this.f43412c;
    }

    public final Condition c() {
        return this.f43417h;
    }

    public final Sink d() {
        return this.f43415f;
    }

    public final ReentrantLock e() {
        return this.f43416g;
    }

    public final long f() {
        return this.f43410a;
    }

    public final boolean g() {
        return this.f43413d;
    }

    public final boolean h() {
        return this.f43414e;
    }

    public final void i(boolean z2) {
        this.f43413d = z2;
    }

    public final void j(boolean z2) {
        this.f43414e = z2;
    }

    public final Sink k() {
        return this.f43418i;
    }
}
