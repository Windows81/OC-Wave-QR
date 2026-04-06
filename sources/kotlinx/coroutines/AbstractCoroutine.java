package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

@Metadata
public abstract class AbstractCoroutine<T> extends JobSupport implements Job, Continuation<T>, CoroutineScope {

    /* renamed from: B  reason: collision with root package name */
    public final CoroutineContext f41359B;

    public AbstractCoroutine(CoroutineContext coroutineContext, boolean z2, boolean z3) {
        super(z3);
        if (z2) {
            L0((Job) coroutineContext.d(Job.f41415x));
        }
        this.f41359B = coroutineContext.y(this);
    }

    public final void K0(Throwable th) {
        CoroutineExceptionHandlerKt.a(this.f41359B, th);
    }

    public String T0() {
        String g2 = CoroutineContextKt.g(this.f41359B);
        if (g2 == null) {
            return super.T0();
        }
        return '\"' + g2 + "\":" + super.T0();
    }

    public final void a1(Object obj) {
        if (obj instanceof CompletedExceptionally) {
            CompletedExceptionally completedExceptionally = (CompletedExceptionally) obj;
            s1(completedExceptionally.f41376a, completedExceptionally.a());
            return;
        }
        t1(obj);
    }

    public boolean b() {
        return super.b();
    }

    public final CoroutineContext f() {
        return this.f41359B;
    }

    public CoroutineContext getCoroutineContext() {
        return this.f41359B;
    }

    public final void q(Object obj) {
        Object S0 = S0(CompletionStateKt.b(obj));
        if (S0 != JobSupportKt.f41426b) {
            r1(S0);
        }
    }

    public String r0() {
        return DebugStringsKt.a(this) + " was cancelled";
    }

    public void r1(Object obj) {
        h0(obj);
    }

    public void s1(Throwable th, boolean z2) {
    }

    public void t1(Object obj) {
    }

    public final void u1(CoroutineStart coroutineStart, Object obj, Function2 function2) {
        coroutineStart.f(function2, obj, this);
    }
}
