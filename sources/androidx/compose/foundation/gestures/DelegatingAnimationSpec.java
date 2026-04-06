package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VectorizedAnimationSpec;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.internal.FloatCompanionObject;

@Metadata
final class DelegatingAnimationSpec implements AnimationSpec<AnimationData> {

    /* renamed from: a  reason: collision with root package name */
    public final AnimationSpec f3449a;

    /* renamed from: b  reason: collision with root package name */
    public final AnimationSpec f3450b;

    /* renamed from: c  reason: collision with root package name */
    public final AnimationSpec f3451c;

    public VectorizedAnimationSpec a(TwoWayConverter twoWayConverter) {
        AnimationSpec animationSpec = this.f3449a;
        FloatCompanionObject floatCompanionObject = FloatCompanionObject.f40896a;
        return new DelegatingAnimationSpec$vectorize$1(twoWayConverter, animationSpec.a(VectorConvertersKt.i(floatCompanionObject)), this.f3450b.a(VectorConvertersKt.b(Offset.f15855b)), this.f3451c.a(VectorConvertersKt.i(floatCompanionObject)));
    }
}
