package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AnimationDataConverter$convertFromVector$1 extends Lambda implements Function1<AnimationVector4D, AnimationData> {

    /* renamed from: z  reason: collision with root package name */
    public static final AnimationDataConverter$convertFromVector$1 f3396z = new AnimationDataConverter$convertFromVector$1();

    public AnimationDataConverter$convertFromVector$1() {
        super(1);
    }

    /* renamed from: b */
    public final AnimationData invoke(AnimationVector4D animationVector4D) {
        float f2 = animationVector4D.f();
        float g2 = animationVector4D.g();
        float h2 = animationVector4D.h();
        return new AnimationData(f2, Offset.e((((long) Float.floatToRawIntBits(g2)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(h2)))), animationVector4D.i(), (DefaultConstructorMarker) null);
    }
}
