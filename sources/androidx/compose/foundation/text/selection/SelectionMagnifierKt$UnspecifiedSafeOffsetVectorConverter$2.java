package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$2 extends Lambda implements Function1<AnimationVector2D, Offset> {

    /* renamed from: z  reason: collision with root package name */
    public static final SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$2 f6870z = new SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$2();

    public SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$2() {
        super(1);
    }

    public final long b(AnimationVector2D animationVector2D) {
        return Offset.e((((long) Float.floatToRawIntBits(animationVector2D.f())) << 32) | (((long) Float.floatToRawIntBits(animationVector2D.g())) & 4294967295L));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Offset.d(b((AnimationVector2D) obj));
    }
}
