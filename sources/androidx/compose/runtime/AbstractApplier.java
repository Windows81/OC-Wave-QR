package androidx.compose.runtime;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public abstract class AbstractApplier<T> implements Applier<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Object f14529a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f14530b = Stack.c((ArrayList) null, 1, (DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public Object f14531c;

    public AbstractApplier(Object obj) {
        this.f14529a = obj;
        this.f14531c = obj;
    }

    public Object b() {
        return this.f14531c;
    }

    public final void clear() {
        Stack.a(this.f14530b);
        n(this.f14529a);
        m();
    }

    public void d(Object obj) {
        Stack.l(this.f14530b, b());
        n(obj);
    }

    public void h() {
        n(Stack.k(this.f14530b));
    }

    public final Object l() {
        return this.f14529a;
    }

    public abstract void m();

    public void n(Object obj) {
        this.f14531c = obj;
    }
}
