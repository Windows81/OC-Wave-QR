package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VectorizedAnimationSpec;
import androidx.compose.animation.core.VectorizedFiniteAnimationSpec;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;

@Metadata
public final class DelegatingAnimationSpec$vectorize$1 implements VectorizedFiniteAnimationSpec<AnimationVector> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TwoWayConverter f3452a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ VectorizedAnimationSpec f3453b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ VectorizedAnimationSpec f3454c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ VectorizedAnimationSpec f3455d;

    public DelegatingAnimationSpec$vectorize$1(TwoWayConverter twoWayConverter, VectorizedAnimationSpec vectorizedAnimationSpec, VectorizedAnimationSpec vectorizedAnimationSpec2, VectorizedAnimationSpec vectorizedAnimationSpec3) {
        this.f3452a = twoWayConverter;
        this.f3453b = vectorizedAnimationSpec;
        this.f3454c = vectorizedAnimationSpec2;
        this.f3455d = vectorizedAnimationSpec3;
    }

    public long b(AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        AnimationData animationData = (AnimationData) this.f3452a.b().invoke(animationVector);
        AnimationData animationData2 = (AnimationData) this.f3452a.b().invoke(animationVector2);
        AnimationData animationData3 = (AnimationData) this.f3452a.b().invoke(animationVector3);
        return Math.max(this.f3453b.b(k(animationData), k(animationData2), k(animationData3)), Math.max(this.f3454c.b(i(animationData), i(animationData2), i(animationData3)), this.f3455d.b(h(animationData), h(animationData2), h(animationData3))));
    }

    public AnimationVector c(long j2, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        AnimationData animationData = (AnimationData) this.f3452a.b().invoke(animationVector);
        AnimationData animationData2 = (AnimationData) this.f3452a.b().invoke(animationVector2);
        AnimationData animationData3 = (AnimationData) this.f3452a.b().invoke(animationVector3);
        return j((AnimationVector1D) this.f3453b.c(j2, k(animationData), k(animationData2), k(animationData3)), (AnimationVector2D) this.f3454c.c(j2, i(animationData), i(animationData2), i(animationData3)), (AnimationVector1D) this.f3455d.c(j2, h(animationData), h(animationData2), h(animationData3)));
    }

    public AnimationVector f(long j2, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
        AnimationData animationData = (AnimationData) this.f3452a.b().invoke(animationVector);
        AnimationData animationData2 = (AnimationData) this.f3452a.b().invoke(animationVector2);
        AnimationData animationData3 = (AnimationData) this.f3452a.b().invoke(animationVector3);
        return j((AnimationVector1D) this.f3453b.f(j2, k(animationData), k(animationData2), k(animationData3)), (AnimationVector2D) this.f3454c.f(j2, i(animationData), i(animationData2), i(animationData3)), (AnimationVector1D) this.f3455d.f(j2, h(animationData), h(animationData2), h(animationData3)));
    }

    public final AnimationVector1D h(AnimationData animationData) {
        return (AnimationVector1D) VectorConvertersKt.i(FloatCompanionObject.f40896a).a().invoke(Float.valueOf(animationData.a()));
    }

    public final AnimationVector2D i(AnimationData animationData) {
        return (AnimationVector2D) VectorConvertersKt.b(Offset.f15855b).a().invoke(Offset.d(Offset.e((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (animationData.b() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (animationData.b() & 4294967295L)))) & 4294967295L))));
    }

    public final AnimationVector j(AnimationVector1D animationVector1D, AnimationVector2D animationVector2D, AnimationVector1D animationVector1D2) {
        Function1 a2 = this.f3452a.a();
        float f2 = animationVector1D.f();
        float f3 = animationVector2D.f();
        float g2 = animationVector2D.g();
        long floatToRawIntBits = (long) Float.floatToRawIntBits(f3);
        return (AnimationVector) a2.invoke(new AnimationData(f2, Offset.e((((long) Float.floatToRawIntBits(g2)) & 4294967295L) | (floatToRawIntBits << 32)), animationVector1D2.f(), (DefaultConstructorMarker) null));
    }

    public final AnimationVector1D k(AnimationData animationData) {
        return (AnimationVector1D) VectorConvertersKt.i(FloatCompanionObject.f40896a).a().invoke(Float.valueOf(animationData.c()));
    }
}
