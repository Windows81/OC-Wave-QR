package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationVector4D;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AnimationDataConverter$convertToVector$1 extends Lambda implements Function1<AnimationData, AnimationVector4D> {

    /* renamed from: z  reason: collision with root package name */
    public static final AnimationDataConverter$convertToVector$1 f3397z = new AnimationDataConverter$convertToVector$1();

    public AnimationDataConverter$convertToVector$1() {
        super(1);
    }

    /* renamed from: b */
    public final AnimationVector4D invoke(AnimationData animationData) {
        return new AnimationVector4D(animationData.c(), Float.intBitsToFloat((int) (animationData.b() >> 32)), Float.intBitsToFloat((int) (animationData.b() & 4294967295L)), animationData.a());
    }
}
