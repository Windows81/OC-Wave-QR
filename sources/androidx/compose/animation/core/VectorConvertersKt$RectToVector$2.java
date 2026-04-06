package androidx.compose.animation.core;

import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class VectorConvertersKt$RectToVector$2 extends Lambda implements Function1<AnimationVector4D, Rect> {

    /* renamed from: z  reason: collision with root package name */
    public static final VectorConvertersKt$RectToVector$2 f2807z = new VectorConvertersKt$RectToVector$2();

    public VectorConvertersKt$RectToVector$2() {
        super(1);
    }

    /* renamed from: b */
    public final Rect invoke(AnimationVector4D animationVector4D) {
        return new Rect(animationVector4D.f(), animationVector4D.g(), animationVector4D.h(), animationVector4D.i());
    }
}
