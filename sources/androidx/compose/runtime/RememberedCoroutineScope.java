package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionErrorContextImpl;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;

@Metadata
public final class RememberedCoroutineScope implements CoroutineScope, RememberObserver {
    public static final Companion D = new Companion((DefaultConstructorMarker) null);
    public static final int E = 8;
    public static final CoroutineContext F = new CancelledCoroutineContext();

    /* renamed from: A  reason: collision with root package name */
    public final CoroutineContext f14834A;

    /* renamed from: B  reason: collision with root package name */
    public final Object f14835B = this;
    public volatile CoroutineContext C;

    /* renamed from: z  reason: collision with root package name */
    public final CoroutineContext f14836z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public RememberedCoroutineScope(CoroutineContext coroutineContext, CoroutineContext coroutineContext2) {
        this.f14836z = coroutineContext;
        this.f14834A = coroutineContext2;
    }

    public final void c() {
        synchronized (this.f14835B) {
            try {
                CoroutineContext coroutineContext = this.C;
                if (coroutineContext == null) {
                    this.C = F;
                } else {
                    JobKt.c(coroutineContext, new ForgottenCoroutineScopeException());
                }
                Unit unit = Unit.f40552a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e() {
        c();
    }

    public void f() {
        c();
    }

    public CoroutineContext getCoroutineContext() {
        CoroutineContext coroutineContext;
        CoroutineContext coroutineContext2 = this.C;
        if (coroutineContext2 == null || coroutineContext2 == F) {
            CompositionErrorContextImpl compositionErrorContextImpl = (CompositionErrorContextImpl) this.f14836z.d(CompositionErrorContextImpl.f15392A);
            CoroutineContext rememberedCoroutineScope$special$$inlined$CoroutineExceptionHandler$1 = compositionErrorContextImpl != null ? new RememberedCoroutineScope$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.f41378w, compositionErrorContextImpl, this) : EmptyCoroutineContext.f40721z;
            synchronized (this.f14835B) {
                try {
                    coroutineContext = this.C;
                    if (coroutineContext == null) {
                        CoroutineContext coroutineContext3 = this.f14836z;
                        coroutineContext = coroutineContext3.y(JobKt.a((Job) coroutineContext3.d(Job.f41415x))).y(this.f14834A).y(rememberedCoroutineScope$special$$inlined$CoroutineExceptionHandler$1);
                    } else if (coroutineContext == F) {
                        CoroutineContext coroutineContext4 = this.f14836z;
                        CompletableJob a2 = JobKt.a((Job) coroutineContext4.d(Job.f41415x));
                        a2.c(new ForgottenCoroutineScopeException());
                        coroutineContext = coroutineContext4.y(a2).y(this.f14834A).y(rememberedCoroutineScope$special$$inlined$CoroutineExceptionHandler$1);
                    }
                    this.C = coroutineContext;
                    Unit unit = Unit.f40552a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            coroutineContext2 = coroutineContext;
        }
        Intrinsics.f(coroutineContext2);
        return coroutineContext2;
    }

    public void h() {
    }
}
