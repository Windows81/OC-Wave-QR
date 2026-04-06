package androidx.compose.ui.platform;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.ui.MotionDurationScale;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

@Metadata
final class MotionDurationScaleImpl implements MotionDurationScale {

    /* renamed from: z  reason: collision with root package name */
    public final MutableFloatState f17819z = PrimitiveSnapshotStateKt.a(1.0f);

    public float H() {
        return this.f17819z.c();
    }

    public CoroutineContext.Element d(CoroutineContext.Key key) {
        return MotionDurationScale.DefaultImpls.b(this, key);
    }

    public void e(float f2) {
        this.f17819z.j(f2);
    }

    public CoroutineContext g(CoroutineContext.Key key) {
        return MotionDurationScale.DefaultImpls.c(this, key);
    }

    public Object k(Object obj, Function2 function2) {
        return MotionDurationScale.DefaultImpls.a(this, obj, function2);
    }

    public CoroutineContext y(CoroutineContext coroutineContext) {
        return MotionDurationScale.DefaultImpls.d(this, coroutineContext);
    }
}
