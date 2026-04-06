package androidx.compose.material3;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.runtime.MutableFloatState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;

@Metadata
final class EnterAlwaysSearchBarScrollBehavior implements SearchBarScrollBehavior {

    /* renamed from: g  reason: collision with root package name */
    public static final Companion f9915g = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final Function0 f9916a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f9917b;

    /* renamed from: c  reason: collision with root package name */
    public final AnimationSpec f9918c;

    /* renamed from: d  reason: collision with root package name */
    public final DecayAnimationSpec f9919d;

    /* renamed from: e  reason: collision with root package name */
    public MutableFloatState f9920e;

    /* renamed from: f  reason: collision with root package name */
    public final MutableFloatState f9921f;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public static final Unit j(Ref.FloatRef floatRef, EnterAlwaysSearchBarScrollBehavior enterAlwaysSearchBarScrollBehavior, Ref.FloatRef floatRef2, AnimationScope animationScope) {
        float floatValue = ((Number) animationScope.e()).floatValue() - floatRef.f40905z;
        float f2 = enterAlwaysSearchBarScrollBehavior.f();
        enterAlwaysSearchBarScrollBehavior.h(f2 + floatValue);
        float abs = Math.abs(f2 - enterAlwaysSearchBarScrollBehavior.f());
        floatRef.f40905z = ((Number) animationScope.e()).floatValue();
        floatRef2.f40905z = ((Number) animationScope.f()).floatValue();
        if (Math.abs(floatValue - abs) > 0.5f) {
            animationScope.a();
        }
        return Unit.f40552a;
    }

    public static final Unit k(EnterAlwaysSearchBarScrollBehavior enterAlwaysSearchBarScrollBehavior, AnimationScope animationScope) {
        enterAlwaysSearchBarScrollBehavior.h(((Number) animationScope.e()).floatValue());
        return Unit.f40552a;
    }

    public final Function0 d() {
        return this.f9916a;
    }

    public final boolean e() {
        return this.f9917b;
    }

    public float f() {
        return this.f9920e.c();
    }

    public float g() {
        return this.f9921f.c();
    }

    public void h(float f2) {
        this.f9920e.j(RangesKt.n(f2, g(), 0.0f));
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0103 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(float r24, kotlin.coroutines.Continuation r25) {
        /*
            r23 = this;
            r0 = r23
            r1 = r25
            boolean r2 = r1 instanceof androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior$settleSearchBar$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior$settleSearchBar$1 r2 = (androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior$settleSearchBar$1) r2
            int r3 = r2.G
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.G = r3
            goto L_0x001c
        L_0x0017:
            androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior$settleSearchBar$1 r2 = new androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior$settleSearchBar$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.E
            java.lang.Object r11 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r3 = r2.G
            r10 = 2
            r4 = 1
            r12 = 0
            if (r3 == 0) goto L_0x0049
            if (r3 == r4) goto L_0x003e
            if (r3 != r10) goto L_0x0036
            java.lang.Object r2 = r2.D
            kotlin.jvm.internal.Ref$FloatRef r2 = (kotlin.jvm.internal.Ref.FloatRef) r2
            kotlin.ResultKt.b(r1)
            goto L_0x0105
        L_0x0036:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x003e:
            float r3 = r2.C
            java.lang.Object r4 = r2.D
            kotlin.jvm.internal.Ref$FloatRef r4 = (kotlin.jvm.internal.Ref.FloatRef) r4
            kotlin.ResultKt.b(r1)
            goto L_0x00b5
        L_0x0049:
            kotlin.ResultKt.b(r1)
            float r1 = r23.g()
            int r1 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r1 != 0) goto L_0x0056
            r1 = r12
            goto L_0x005f
        L_0x0056:
            float r1 = r23.f()
            float r3 = r23.g()
            float r1 = r1 / r3
        L_0x005f:
            r3 = 1008981770(0x3c23d70a, float:0.01)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 < 0) goto L_0x0111
            r3 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x006e
            goto L_0x0111
        L_0x006e:
            kotlin.jvm.internal.Ref$FloatRef r13 = new kotlin.jvm.internal.Ref$FloatRef
            r13.<init>()
            r5 = r24
            r13.f40905z = r5
            float r6 = java.lang.Math.abs(r24)
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x00b7
            kotlin.jvm.internal.Ref$FloatRef r3 = new kotlin.jvm.internal.Ref$FloatRef
            r3.<init>()
            r21 = 28
            r22 = 0
            r14 = 0
            r16 = 0
            r18 = 0
            r20 = 0
            r15 = r24
            androidx.compose.animation.core.AnimationState r5 = androidx.compose.animation.core.AnimationStateKt.c(r14, r15, r16, r18, r20, r21, r22)
            androidx.compose.animation.core.DecayAnimationSpec r6 = r0.f9919d
            androidx.compose.material3.t2 r7 = new androidx.compose.material3.t2
            r7.<init>(r3, r0, r13)
            r2.D = r13
            r2.C = r1
            r2.G = r4
            r8 = 0
            r9 = 2
            r14 = 0
            r3 = r5
            r4 = r6
            r5 = r8
            r6 = r7
            r7 = r2
            r8 = r9
            r9 = r14
            java.lang.Object r3 = androidx.compose.animation.core.SuspendAnimationKt.i(r3, r4, r5, r6, r7, r8, r9)
            if (r3 != r11) goto L_0x00b3
            return r11
        L_0x00b3:
            r3 = r1
            r4 = r13
        L_0x00b5:
            r1 = r3
            r13 = r4
        L_0x00b7:
            float r3 = r23.g()
            float r4 = r23.f()
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x0106
            float r3 = r23.f()
            int r3 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r3 >= 0) goto L_0x0106
            float r14 = r23.f()
            r21 = 30
            r22 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r20 = 0
            androidx.compose.animation.core.AnimationState r3 = androidx.compose.animation.core.AnimationStateKt.c(r14, r15, r16, r18, r20, r21, r22)
            r4 = 1056964608(0x3f000000, float:0.5)
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x00e6
            r1 = r12
            goto L_0x00ea
        L_0x00e6:
            float r1 = r23.g()
        L_0x00ea:
            java.lang.Float r4 = kotlin.coroutines.jvm.internal.Boxing.b(r1)
            androidx.compose.animation.core.AnimationSpec r5 = r0.f9918c
            androidx.compose.material3.u2 r7 = new androidx.compose.material3.u2
            r7.<init>(r0)
            r2.D = r13
            r2.G = r10
            r6 = 0
            r9 = 4
            r10 = 0
            r8 = r2
            java.lang.Object r1 = androidx.compose.animation.core.SuspendAnimationKt.k(r3, r4, r5, r6, r7, r8, r9, r10)
            if (r1 != r11) goto L_0x0104
            return r11
        L_0x0104:
            r2 = r13
        L_0x0105:
            r13 = r2
        L_0x0106:
            float r1 = r13.f40905z
            long r1 = androidx.compose.ui.unit.VelocityKt.a(r12, r1)
            androidx.compose.ui.unit.Velocity r1 = androidx.compose.ui.unit.Velocity.b(r1)
            return r1
        L_0x0111:
            androidx.compose.ui.unit.Velocity$Companion r1 = androidx.compose.ui.unit.Velocity.f19186b
            long r1 = r1.a()
            androidx.compose.ui.unit.Velocity r1 = androidx.compose.ui.unit.Velocity.b(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.EnterAlwaysSearchBarScrollBehavior.i(float, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
