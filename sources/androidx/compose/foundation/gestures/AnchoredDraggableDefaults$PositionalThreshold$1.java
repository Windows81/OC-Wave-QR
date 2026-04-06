package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AnchoredDraggableDefaults$PositionalThreshold$1 extends Lambda implements Function1<Float, Float> {

    /* renamed from: z  reason: collision with root package name */
    public static final AnchoredDraggableDefaults$PositionalThreshold$1 f3324z = new AnchoredDraggableDefaults$PositionalThreshold$1();

    public AnchoredDraggableDefaults$PositionalThreshold$1() {
        super(1);
    }

    public final Float b(float f2) {
        return Float.valueOf(f2 / 2.0f);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((Number) obj).floatValue());
    }
}
