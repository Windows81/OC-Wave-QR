package androidx.compose.foundation.gestures;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AnchoredDraggableKt$anchoredDraggableFlingBehavior$1 extends Lambda implements Function0<Float> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Density f3340z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableKt$anchoredDraggableFlingBehavior$1(Density density) {
        super(0);
        this.f3340z = density;
    }

    /* renamed from: b */
    public final Float invoke() {
        return Float.valueOf(this.f3340z.B1(Dp.m((float) 125)));
    }
}
