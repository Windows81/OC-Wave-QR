package androidx.compose.animation;

import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
final class SharedTransitionScopeImpl$sharedBoundsImpl$1 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Transition f2356A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f2357B;
    public final /* synthetic */ SharedTransitionScopeImpl C;
    public final /* synthetic */ SharedTransitionScope.PlaceHolderSize D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ SharedTransitionScope.OverlayClip F;
    public final /* synthetic */ float G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ BoundsTransform I;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SharedTransitionScope.SharedContentState f2358z;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: androidx.compose.animation.BoundsAnimation} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.ui.Modifier b(androidx.compose.ui.Modifier r15, androidx.compose.runtime.Composer r16, int r17) {
        /*
            r14 = this;
            r0 = r14
            r12 = r16
            r1 = -1843478929(0xffffffff921ebe6f, float:-5.0090737E-28)
            r12.X(r1)
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            r3 = -1
            if (r2 == 0) goto L_0x0017
            java.lang.String r2 = "androidx.compose.animation.SharedTransitionScopeImpl.sharedBoundsImpl.<anonymous> (SharedTransitionScope.kt:915)"
            r4 = r17
            androidx.compose.runtime.ComposerKt.Y(r1, r4, r3, r2)
        L_0x0017:
            androidx.compose.animation.SharedTransitionScope$SharedContentState r1 = r0.f2358z
            java.lang.Object r1 = r1.c()
            r2 = -359689844(0xffffffffea8f918c, float:-8.678186E25)
            r12.r(r2, r1)
            androidx.compose.animation.SharedTransitionScopeImpl r2 = r0.C
            java.lang.Object r4 = r16.g()
            androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r5 = r7.a()
            if (r4 != r5) goto L_0x0038
            androidx.compose.animation.SharedElement r4 = r2.z(r1)
            r12.N(r4)
        L_0x0038:
            r8 = r4
            androidx.compose.animation.SharedElement r8 = (androidx.compose.animation.SharedElement) r8
            r2 = -359686031(0xffffffffea8fa071, float:-8.681703E25)
            androidx.compose.animation.core.Transition r4 = r0.f2356A
            r12.r(r2, r4)
            androidx.compose.animation.core.Transition r2 = r0.f2356A
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x00d3
            r2 = 1734686048(0x67653560, float:1.0824065E24)
            r12.X(r2)
            androidx.compose.animation.core.Transition r2 = r0.f2356A
            java.lang.String r5 = r1.toString()
            kotlin.jvm.functions.Function1 r1 = r0.f2357B
            boolean r6 = r12.W(r2)
            java.lang.Object r9 = r16.g()
            if (r6 != 0) goto L_0x0067
            java.lang.Object r6 = r7.a()
            if (r9 != r6) goto L_0x006e
        L_0x0067:
            java.lang.Object r9 = r2.i()
            r12.N(r9)
        L_0x006e:
            boolean r6 = r2.v()
            if (r6 == 0) goto L_0x0078
            java.lang.Object r9 = r2.i()
        L_0x0078:
            r6 = 1329676753(0x4f4141d1, float:3.24231603E9)
            r12.X(r6)
            boolean r10 = androidx.compose.runtime.ComposerKt.P()
            java.lang.String r11 = "androidx.compose.animation.SharedTransitionScopeImpl.sharedBoundsImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SharedTransitionScope.kt:925)"
            if (r10 == 0) goto L_0x0089
            androidx.compose.runtime.ComposerKt.Y(r6, r4, r3, r11)
        L_0x0089:
            java.lang.Object r9 = r1.invoke(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            r9.booleanValue()
            boolean r10 = androidx.compose.runtime.ComposerKt.P()
            if (r10 == 0) goto L_0x009b
            androidx.compose.runtime.ComposerKt.X()
        L_0x009b:
            r16.M()
            java.lang.Object r10 = r2.q()
            r12.X(r6)
            boolean r13 = androidx.compose.runtime.ComposerKt.P()
            if (r13 == 0) goto L_0x00ae
            androidx.compose.runtime.ComposerKt.Y(r6, r4, r3, r11)
        L_0x00ae:
            java.lang.Object r1 = r1.invoke(r10)
            r3 = r1
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            r3.booleanValue()
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x00c1
            androidx.compose.runtime.ComposerKt.X()
        L_0x00c1:
            r16.M()
            r6 = 0
            r1 = r2
            r2 = r9
            r4 = r5
            r5 = r16
            androidx.compose.animation.core.Transition r1 = androidx.compose.animation.core.TransitionKt.d(r1, r2, r3, r4, r5, r6)
            r16.M()
        L_0x00d1:
            r9 = r1
            goto L_0x0124
        L_0x00d3:
            r1 = 1734936683(0x6769086b, float:1.1004667E24)
            r12.X(r1)
            kotlin.jvm.functions.Function1 r1 = r0.f2357B
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.Function1<kotlin.Unit, kotlin.Boolean>"
            kotlin.jvm.internal.Intrinsics.g(r1, r2)
            java.lang.Object r1 = kotlin.jvm.internal.TypeIntrinsics.e(r1, r5)
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            kotlin.Unit r2 = kotlin.Unit.f40552a
            java.lang.Object r1 = r1.invoke(r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r2 = r1.booleanValue()
            java.lang.Object r3 = r16.g()
            java.lang.Object r6 = r7.a()
            if (r3 != r6) goto L_0x0113
            androidx.compose.animation.core.MutableTransitionState r3 = new androidx.compose.animation.core.MutableTransitionState
            androidx.compose.ui.geometry.Rect r6 = r8.c()
            if (r6 == 0) goto L_0x0108
            if (r2 != 0) goto L_0x0109
            r4 = r5
            goto L_0x0109
        L_0x0108:
            r4 = r2
        L_0x0109:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            r3.<init>(r2)
            r12.N(r3)
        L_0x0113:
            androidx.compose.animation.core.MutableTransitionState r3 = (androidx.compose.animation.core.MutableTransitionState) r3
            r3.h(r1)
            int r1 = androidx.compose.animation.core.MutableTransitionState.f2620d
            r2 = 2
            r4 = 0
            androidx.compose.animation.core.Transition r1 = androidx.compose.animation.core.TransitionKt.h(r3, r4, r12, r1, r2)
            r16.M()
            goto L_0x00d1
        L_0x0124:
            androidx.compose.animation.SharedTransitionScopeImpl r1 = r0.C
            boolean r1 = r1.q()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = -359623378(0xffffffffea90952e, float:-8.73949E25)
            r12.r(r2, r1)
            androidx.compose.ui.geometry.Rect$Companion r1 = androidx.compose.ui.geometry.Rect.f15860e
            androidx.compose.animation.core.TwoWayConverter r2 = androidx.compose.animation.core.VectorConvertersKt.c(r1)
            r5 = 0
            r6 = 2
            r3 = 0
            r1 = r9
            r4 = r16
            androidx.compose.animation.core.Transition$DeferredAnimation r1 = androidx.compose.animation.core.TransitionKt.e(r1, r2, r3, r4, r5, r6)
            r16.Q()
            boolean r2 = r12.W(r9)
            androidx.compose.animation.SharedTransitionScopeImpl r3 = r0.C
            androidx.compose.animation.BoundsTransform r4 = r0.I
            java.lang.Object r5 = r16.g()
            if (r2 != 0) goto L_0x015b
            java.lang.Object r2 = r7.a()
            if (r5 != r2) goto L_0x0163
        L_0x015b:
            androidx.compose.animation.BoundsAnimation r5 = new androidx.compose.animation.BoundsAnimation
            r5.<init>(r3, r9, r1, r4)
            r12.N(r5)
        L_0x0163:
            r3 = r5
            androidx.compose.animation.BoundsAnimation r3 = (androidx.compose.animation.BoundsAnimation) r3
            androidx.compose.animation.BoundsTransform r2 = r0.I
            r3.m(r1, r2)
            r16.Q()
            androidx.compose.animation.SharedTransitionScopeImpl r1 = r0.C
            androidx.compose.animation.SharedTransitionScope$PlaceHolderSize r4 = r0.D
            boolean r5 = r0.E
            androidx.compose.animation.SharedTransitionScope$SharedContentState r6 = r0.f2358z
            androidx.compose.animation.SharedTransitionScope$OverlayClip r7 = r0.F
            float r9 = r0.G
            boolean r10 = r0.H
            r11 = 0
            r2 = r8
            r8 = r9
            r9 = r10
            r10 = r16
            androidx.compose.animation.SharedElementInternalState r1 = r1.v(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r16.Q()
            androidx.compose.animation.SharedBoundsNodeElement r2 = new androidx.compose.animation.SharedBoundsNodeElement
            r2.<init>(r1)
            r1 = r15
            androidx.compose.ui.Modifier r1 = r15.o0(r2)
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x019c
            androidx.compose.runtime.ComposerKt.X()
        L_0x019c:
            r16.M()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.SharedTransitionScopeImpl$sharedBoundsImpl$1.b(androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int):androidx.compose.ui.Modifier");
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        return b((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }
}
