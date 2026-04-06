package androidx.compose.ui;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

@Metadata
public interface MotionDurationScale extends CoroutineContext.Element {

    /* renamed from: e  reason: collision with root package name */
    public static final Key f15495e = Key.f15496z;

    @Metadata
    public static final class DefaultImpls {
        public static Object a(MotionDurationScale motionDurationScale, Object obj, Function2 function2) {
            return CoroutineContext.Element.DefaultImpls.a(motionDurationScale, obj, function2);
        }

        public static CoroutineContext.Element b(MotionDurationScale motionDurationScale, CoroutineContext.Key key) {
            return CoroutineContext.Element.DefaultImpls.b(motionDurationScale, key);
        }

        public static CoroutineContext c(MotionDurationScale motionDurationScale, CoroutineContext.Key key) {
            return CoroutineContext.Element.DefaultImpls.c(motionDurationScale, key);
        }

        public static CoroutineContext d(MotionDurationScale motionDurationScale, CoroutineContext coroutineContext) {
            return CoroutineContext.Element.DefaultImpls.d(motionDurationScale, coroutineContext);
        }
    }

    @Metadata
    public static final class Key implements CoroutineContext.Key<MotionDurationScale> {

        /* renamed from: z  reason: collision with root package name */
        public static final /* synthetic */ Key f15496z = new Key();
    }

    float H();

    CoroutineContext.Key getKey() {
        return f15495e;
    }
}
