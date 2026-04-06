package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.TwoWayConverter;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata
final class AnimationDataConverter implements TwoWayConverter<AnimationData, AnimationVector4D> {

    /* renamed from: a  reason: collision with root package name */
    public static final AnimationDataConverter f3395a = new AnimationDataConverter();

    public Function1 a() {
        return AnimationDataConverter$convertToVector$1.f3397z;
    }

    public Function1 b() {
        return AnimationDataConverter$convertFromVector$1.f3396z;
    }
}
