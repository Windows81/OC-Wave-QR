package androidx.lifecycle;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

@Metadata
public final class BlockRunner<T> {

    /* renamed from: a  reason: collision with root package name */
    public final CoroutineLiveData f21859a;

    /* renamed from: b  reason: collision with root package name */
    public final Function2 f21860b;

    /* renamed from: c  reason: collision with root package name */
    public final long f21861c;

    /* renamed from: d  reason: collision with root package name */
    public final CoroutineScope f21862d;

    /* renamed from: e  reason: collision with root package name */
    public final Function0 f21863e;

    /* renamed from: f  reason: collision with root package name */
    public Job f21864f;

    /* renamed from: g  reason: collision with root package name */
    public Job f21865g;

    public final void g() {
        if (this.f21865g == null) {
            this.f21865g = BuildersKt__Builders_commonKt.d(this.f21862d, Dispatchers.c().H0(), (CoroutineStart) null, new BlockRunner$cancel$1(this, (Continuation) null), 2, (Object) null);
            return;
        }
        throw new IllegalStateException("Cancel call cannot happen without a maybeRun");
    }

    public final void h() {
        Job job = this.f21865g;
        if (job != null) {
            Job.DefaultImpls.a(job, (CancellationException) null, 1, (Object) null);
        }
        this.f21865g = null;
        if (this.f21864f == null) {
            this.f21864f = BuildersKt__Builders_commonKt.d(this.f21862d, (CoroutineContext) null, (CoroutineStart) null, new BlockRunner$maybeRun$1(this, (Continuation) null), 3, (Object) null);
        }
    }
}
