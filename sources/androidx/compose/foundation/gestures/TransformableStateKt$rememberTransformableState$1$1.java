package androidx.compose.foundation.gestures;

import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
final class TransformableStateKt$rememberTransformableState$1$1 extends Lambda implements Function3<Float, Offset, Float, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ State f3630z;

    public final void b(float f2, long j2, float f3) {
        ((Function3) this.f3630z.getValue()).d(Float.valueOf(f2), Offset.d(j2), Float.valueOf(f3));
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b(((Number) obj).floatValue(), ((Offset) obj2).t(), ((Number) obj3).floatValue());
        return Unit.f40552a;
    }
}
