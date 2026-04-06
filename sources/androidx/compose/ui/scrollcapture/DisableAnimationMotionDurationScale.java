package androidx.compose.ui.scrollcapture;

import androidx.compose.ui.MotionDurationScale;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

@Metadata
final class DisableAnimationMotionDurationScale implements MotionDurationScale {

    /* renamed from: z  reason: collision with root package name */
    public static final DisableAnimationMotionDurationScale f18005z = new DisableAnimationMotionDurationScale();

    public float H() {
        return 0.0f;
    }

    public CoroutineContext.Element d(CoroutineContext.Key key) {
        return MotionDurationScale.DefaultImpls.b(this, key);
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
