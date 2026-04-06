package androidx.compose.foundation.text.input.internal;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;

@Metadata
public final class CursorAnimationState {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f6176a;

    /* renamed from: b  reason: collision with root package name */
    public AtomicReference f6177b = new AtomicReference((Object) null);

    /* renamed from: c  reason: collision with root package name */
    public final MutableFloatState f6178c = PrimitiveSnapshotStateKt.a(0.0f);

    public CursorAnimationState(boolean z2) {
        this.f6176a = z2;
    }

    public final void c() {
        Job job = (Job) this.f6177b.getAndSet((Object) null);
        if (job != null) {
            Job.DefaultImpls.a(job, (CancellationException) null, 1, (Object) null);
        }
    }

    public final boolean d() {
        return this.f6176a;
    }

    public final float e() {
        return this.f6178c.c();
    }

    public final void f(float f2) {
        this.f6178c.j(f2);
    }

    public final Object g(Continuation continuation) {
        Object f2 = CoroutineScopeKt.f(new CursorAnimationState$snapToVisibleAndAnimate$2(this, (Continuation) null), continuation);
        return f2 == IntrinsicsKt.f() ? f2 : Unit.f40552a;
    }
}
