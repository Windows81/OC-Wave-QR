package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;

@Metadata
public final class DecayAnimation<T, V extends AnimationVector> implements Animation<T, V> {

    /* renamed from: a  reason: collision with root package name */
    public final VectorizedDecayAnimationSpec f2525a;

    /* renamed from: b  reason: collision with root package name */
    public final TwoWayConverter f2526b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f2527c;

    /* renamed from: d  reason: collision with root package name */
    public final AnimationVector f2528d;

    /* renamed from: e  reason: collision with root package name */
    public final AnimationVector f2529e;

    /* renamed from: f  reason: collision with root package name */
    public final AnimationVector f2530f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f2531g;

    /* renamed from: h  reason: collision with root package name */
    public final long f2532h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f2533i;

    public DecayAnimation(VectorizedDecayAnimationSpec vectorizedDecayAnimationSpec, TwoWayConverter twoWayConverter, Object obj, AnimationVector animationVector) {
        this.f2525a = vectorizedDecayAnimationSpec;
        this.f2526b = twoWayConverter;
        this.f2527c = obj;
        AnimationVector animationVector2 = (AnimationVector) c().a().invoke(obj);
        this.f2528d = animationVector2;
        this.f2529e = AnimationVectorsKt.e(animationVector);
        this.f2531g = c().b().invoke(vectorizedDecayAnimationSpec.d(animationVector2, animationVector));
        this.f2532h = vectorizedDecayAnimationSpec.b(animationVector2, animationVector);
        AnimationVector e2 = AnimationVectorsKt.e(vectorizedDecayAnimationSpec.c(b(), animationVector2, animationVector));
        this.f2530f = e2;
        int b2 = e2.b();
        for (int i2 = 0; i2 < b2; i2++) {
            AnimationVector animationVector3 = this.f2530f;
            animationVector3.e(i2, RangesKt.n(animationVector3.a(i2), -this.f2525a.a(), this.f2525a.a()));
        }
    }

    public boolean a() {
        return this.f2533i;
    }

    public long b() {
        return this.f2532h;
    }

    public TwoWayConverter c() {
        return this.f2526b;
    }

    public AnimationVector d(long j2) {
        return !e(j2) ? this.f2525a.c(j2, this.f2528d, this.f2529e) : this.f2530f;
    }

    public Object f(long j2) {
        return !e(j2) ? c().b().invoke(this.f2525a.e(j2, this.f2528d, this.f2529e)) : g();
    }

    public Object g() {
        return this.f2531g;
    }

    public DecayAnimation(DecayAnimationSpec decayAnimationSpec, TwoWayConverter twoWayConverter, Object obj, AnimationVector animationVector) {
        this(decayAnimationSpec.a(twoWayConverter), twoWayConverter, obj, animationVector);
    }
}
