package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$1 extends Lambda implements Function1<Offset, AnimationVector2D> {

    /* renamed from: z  reason: collision with root package name */
    public static final SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$1 f6869z = new SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$1();

    public SelectionMagnifierKt$UnspecifiedSafeOffsetVectorConverter$1() {
        super(1);
    }

    public final AnimationVector2D b(long j2) {
        return (9223372034707292159L & j2) != 9205357640488583168L ? new AnimationVector2D(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L))) : SelectionMagnifierKt.f6865a;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((Offset) obj).t());
    }
}
