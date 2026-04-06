package androidx.compose.animation.core;

import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class VectorConvertersKt$RectToVector$1 extends Lambda implements Function1<Rect, AnimationVector4D> {

    /* renamed from: z  reason: collision with root package name */
    public static final VectorConvertersKt$RectToVector$1 f2806z = new VectorConvertersKt$RectToVector$1();

    public VectorConvertersKt$RectToVector$1() {
        super(1);
    }

    /* renamed from: b */
    public final AnimationVector4D invoke(Rect rect) {
        return new AnimationVector4D(rect.o(), rect.r(), rect.p(), rect.i());
    }
}
