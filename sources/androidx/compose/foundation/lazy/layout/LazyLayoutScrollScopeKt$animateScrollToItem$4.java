package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationVector1D;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;

@Metadata
public final class LazyLayoutScrollScopeKt$animateScrollToItem$4 extends Lambda implements Function1<AnimationScope<Float, AnimationVector1D>, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f4920A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ float f4921B;
    public final /* synthetic */ Ref.FloatRef C;
    public final /* synthetic */ Ref.BooleanRef D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ float F;
    public final /* synthetic */ Ref.IntRef G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int I;
    public final /* synthetic */ Ref.ObjectRef J;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LazyLayoutScrollScope f4922z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyLayoutScrollScopeKt$animateScrollToItem$4(LazyLayoutScrollScope lazyLayoutScrollScope, int i2, float f2, Ref.FloatRef floatRef, Ref.BooleanRef booleanRef, boolean z2, float f3, Ref.IntRef intRef, int i3, int i4, Ref.ObjectRef objectRef) {
        super(1);
        this.f4922z = lazyLayoutScrollScope;
        this.f4920A = i2;
        this.f4921B = f2;
        this.C = floatRef;
        this.D = booleanRef;
        this.E = z2;
        this.F = f3;
        this.G = intRef;
        this.H = i3;
        this.I = i4;
        this.J = objectRef;
    }

    public final void b(AnimationScope animationScope) {
        int i2;
        int i3;
        int i4;
        if (!LazyLayoutScrollScopeKt.d(this.f4922z, this.f4920A)) {
            float i5 = (this.f4921B > 0.0f ? RangesKt.i(((Number) animationScope.e()).floatValue(), this.f4921B) : RangesKt.d(((Number) animationScope.e()).floatValue(), this.f4921B)) - this.C.f40905z;
            float g2 = this.f4922z.g(i5);
            if (!LazyLayoutScrollScopeKt.d(this.f4922z, this.f4920A) && !LazyLayoutScrollScopeKt.c(this.E, this.f4922z, this.f4920A, this.I)) {
                if (i5 == g2) {
                    this.C.f40905z += i5;
                    if (this.E) {
                        if (((Number) animationScope.e()).floatValue() > this.F) {
                            animationScope.a();
                        }
                    } else if (((Number) animationScope.e()).floatValue() < (-this.F)) {
                        animationScope.a();
                    }
                    if (this.E) {
                        if (this.G.f40906z >= 2 && this.f4920A - this.f4922z.c() > (i4 = this.H)) {
                            this.f4922z.e(this.f4920A - i4, 0);
                        }
                    } else if (this.G.f40906z >= 2 && this.f4922z.h() - (i2 = this.f4920A) > (i3 = this.H)) {
                        this.f4922z.e(i2 + i3, 0);
                    }
                } else {
                    animationScope.a();
                    this.D.f40901z = false;
                    return;
                }
            }
        }
        if (LazyLayoutScrollScopeKt.c(this.E, this.f4922z, this.f4920A, this.I)) {
            this.f4922z.e(this.f4920A, this.I);
            this.D.f40901z = false;
            animationScope.a();
        } else if (LazyLayoutScrollScopeKt.d(this.f4922z, this.f4920A)) {
            throw new ItemFoundInScroll(LazyLayoutScrollScope.a(this.f4922z, this.f4920A, 0, 2, (Object) null), (AnimationState) this.J.f40908z);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((AnimationScope) obj);
        return Unit.f40552a;
    }
}
