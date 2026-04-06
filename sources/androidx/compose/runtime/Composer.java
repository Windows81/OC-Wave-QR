package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionData;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

@Metadata
public interface Composer {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f14567a = Companion.f14568a;

    @Metadata
    public static final class Companion {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ Companion f14568a = new Companion();

        /* renamed from: b  reason: collision with root package name */
        public static final Object f14569b = new Composer$Companion$Empty$1();

        public final Object a() {
            return f14569b;
        }
    }

    void A(Object obj, Function2 function2);

    void B();

    Object C(CompositionLocal compositionLocal);

    long D();

    boolean E(boolean z2, int i2);

    void F(int i2);

    CoroutineContext G();

    void H();

    CompositionLocalMap I();

    boolean J();

    void K();

    void L(RecomposeScope recomposeScope);

    void M();

    void N(Object obj);

    int O() {
        return Long.hashCode(D());
    }

    CompositionContext P();

    void Q();

    void R();

    void S();

    void T();

    void U();

    void V(MovableContent movableContent, Object obj);

    boolean W(Object obj);

    void X(int i2);

    void Y(Function0 function0);

    void Z(ProvidedValue[] providedValueArr);

    void a();

    RecomposeScope b();

    int c();

    boolean d(boolean z2) {
        return d(z2);
    }

    void e();

    void f(int i2);

    Object g();

    boolean h(float f2) {
        return h(f2);
    }

    boolean i(int i2) {
        return i(i2);
    }

    boolean j(long j2) {
        return j(j2);
    }

    CompositionData k();

    boolean l(Object obj) {
        return W(obj);
    }

    boolean m(char c2) {
        return m(c2);
    }

    boolean n();

    void o(boolean z2);

    void p();

    Composer q(int i2);

    void r(int i2, Object obj);

    void s();

    boolean t();

    void u(ProvidedValue providedValue);

    Applier v();

    void w(int i2, Object obj);

    ScopeUpdateScope x();

    void y(Function0 function0);

    void z();
}
