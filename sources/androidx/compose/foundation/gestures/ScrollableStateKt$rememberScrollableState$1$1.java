package androidx.compose.foundation.gestures;

import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class ScrollableStateKt$rememberScrollableState$1$1 extends Lambda implements Function1<Float, Float> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ State f3578z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollableStateKt$rememberScrollableState$1$1(State state) {
        super(1);
        this.f3578z = state;
    }

    public final Float b(float f2) {
        return (Float) ((Function1) this.f3578z.getValue()).invoke(Float.valueOf(f2));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((Number) obj).floatValue());
    }
}
