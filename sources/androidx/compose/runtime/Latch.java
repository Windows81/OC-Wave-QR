package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlinx.coroutines.CancellableContinuationImpl;

@Metadata
public final class Latch {

    /* renamed from: a  reason: collision with root package name */
    public final Object f14696a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public List f14697b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public List f14698c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public boolean f14699d = true;

    public final Object c(Continuation continuation) {
        if (e()) {
            return Unit.f40552a;
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.c(continuation), 1);
        cancellableContinuationImpl.G();
        synchronized (this.f14696a) {
            this.f14697b.add(cancellableContinuationImpl);
        }
        cancellableContinuationImpl.u(new Latch$await$2$2(this, cancellableContinuationImpl));
        Object A2 = cancellableContinuationImpl.A();
        if (A2 == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return A2 == IntrinsicsKt.f() ? A2 : Unit.f40552a;
    }

    public final void d() {
        synchronized (this.f14696a) {
            this.f14699d = false;
            Unit unit = Unit.f40552a;
        }
    }

    public final boolean e() {
        boolean z2;
        synchronized (this.f14696a) {
            z2 = this.f14699d;
        }
        return z2;
    }

    public final void f() {
        synchronized (this.f14696a) {
            try {
                if (!e()) {
                    List list = this.f14697b;
                    this.f14697b = this.f14698c;
                    this.f14698c = list;
                    this.f14699d = true;
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        Result.Companion companion = Result.f40519A;
                        ((Continuation) list.get(i2)).q(Result.b(Unit.f40552a));
                    }
                    list.clear();
                    Unit unit = Unit.f40552a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
