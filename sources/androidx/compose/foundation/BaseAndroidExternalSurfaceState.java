package androidx.compose.foundation;

import android.view.Surface;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
abstract class BaseAndroidExternalSurfaceState implements AndroidExternalSurfaceScope, SurfaceScope {

    /* renamed from: A  reason: collision with root package name */
    public Function5 f2927A;

    /* renamed from: B  reason: collision with root package name */
    public Function3 f2928B;
    public Function1 C;
    public Job D;

    /* renamed from: z  reason: collision with root package name */
    public final CoroutineScope f2929z;

    public BaseAndroidExternalSurfaceState(CoroutineScope coroutineScope) {
        this.f2929z = coroutineScope;
    }

    public final void c(Surface surface, int i2, int i3) {
        Function3 function3 = this.f2928B;
        if (function3 != null) {
            function3.d(surface, Integer.valueOf(i2), Integer.valueOf(i3));
        }
    }

    public final void d(Surface surface, int i2, int i3) {
        if (this.f2927A != null) {
            this.D = BuildersKt__Builders_commonKt.d(this.f2929z, (CoroutineContext) null, CoroutineStart.UNDISPATCHED, new BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1(this, surface, i2, i3, (Continuation) null), 1, (Object) null);
        }
    }

    public final void e(Surface surface) {
        Function1 function1 = this.C;
        if (function1 != null) {
            function1.invoke(surface);
        }
        Job job = this.D;
        if (job != null) {
            Job.DefaultImpls.a(job, (CancellationException) null, 1, (Object) null);
        }
        this.D = null;
    }
}
