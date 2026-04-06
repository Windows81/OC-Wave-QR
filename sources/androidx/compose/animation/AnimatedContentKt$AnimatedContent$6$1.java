package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AnimatedContentKt$AnimatedContent$6$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Object f2030A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f2031B;
    public final /* synthetic */ AnimatedContentTransitionScopeImpl C;
    public final /* synthetic */ SnapshotStateList D;
    public final /* synthetic */ Function4 E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Transition f2032z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimatedContentKt$AnimatedContent$6$1(Transition transition, Object obj, Function1 function1, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl, SnapshotStateList snapshotStateList, Function4 function4) {
        super(2);
        this.f2032z = transition;
        this.f2030A = obj;
        this.f2031B = function1;
        this.C = animatedContentTransitionScopeImpl;
        this.D = snapshotStateList;
        this.E = function4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: kotlin.jvm.functions.Function2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(androidx.compose.runtime.Composer r15, int r16) {
        /*
            r14 = this;
            r0 = r14
            r9 = r15
            r1 = r16
            r2 = r1 & 3
            r3 = 2
            r4 = 1
            if (r2 == r3) goto L_0x000c
            r2 = r4
            goto L_0x000d
        L_0x000c:
            r2 = 0
        L_0x000d:
            r3 = r1 & 1
            boolean r2 = r15.E(r2, r3)
            if (r2 == 0) goto L_0x0152
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0024
            r2 = -1
            java.lang.String r3 = "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous> (AnimatedContent.kt:817)"
            r5 = 885640742(0x34c9ce26, float:3.758916E-7)
            androidx.compose.runtime.ComposerKt.Y(r5, r1, r2, r3)
        L_0x0024:
            kotlin.jvm.functions.Function1 r1 = r0.f2031B
            androidx.compose.animation.AnimatedContentTransitionScopeImpl r2 = r0.C
            java.lang.Object r3 = r15.g()
            androidx.compose.runtime.Composer$Companion r5 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r6 = r5.a()
            if (r3 != r6) goto L_0x003e
            java.lang.Object r1 = r1.invoke(r2)
            r3 = r1
            androidx.compose.animation.ContentTransform r3 = (androidx.compose.animation.ContentTransform) r3
            r15.N(r3)
        L_0x003e:
            androidx.compose.animation.ContentTransform r3 = (androidx.compose.animation.ContentTransform) r3
            androidx.compose.animation.core.Transition r1 = r0.f2032z
            androidx.compose.animation.core.Transition$Segment r1 = r1.o()
            java.lang.Object r1 = r1.d()
            java.lang.Object r2 = r0.f2030A
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r1, r2)
            boolean r1 = r15.d(r1)
            androidx.compose.animation.core.Transition r2 = r0.f2032z
            java.lang.Object r6 = r0.f2030A
            kotlin.jvm.functions.Function1 r7 = r0.f2031B
            androidx.compose.animation.AnimatedContentTransitionScopeImpl r8 = r0.C
            java.lang.Object r10 = r15.g()
            if (r1 != 0) goto L_0x0068
            java.lang.Object r1 = r5.a()
            if (r10 != r1) goto L_0x008c
        L_0x0068:
            androidx.compose.animation.core.Transition$Segment r1 = r2.o()
            java.lang.Object r1 = r1.d()
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r1, r6)
            if (r1 == 0) goto L_0x007e
            androidx.compose.animation.ExitTransition$Companion r1 = androidx.compose.animation.ExitTransition.f2277a
            androidx.compose.animation.ExitTransition r1 = r1.a()
        L_0x007c:
            r10 = r1
            goto L_0x0089
        L_0x007e:
            java.lang.Object r1 = r7.invoke(r8)
            androidx.compose.animation.ContentTransform r1 = (androidx.compose.animation.ContentTransform) r1
            androidx.compose.animation.ExitTransition r1 = r1.a()
            goto L_0x007c
        L_0x0089:
            r15.N(r10)
        L_0x008c:
            r6 = r10
            androidx.compose.animation.ExitTransition r6 = (androidx.compose.animation.ExitTransition) r6
            java.lang.Object r1 = r0.f2030A
            androidx.compose.animation.core.Transition r2 = r0.f2032z
            java.lang.Object r7 = r15.g()
            java.lang.Object r8 = r5.a()
            if (r7 != r8) goto L_0x00ad
            androidx.compose.animation.AnimatedContentTransitionScopeImpl$ChildData r7 = new androidx.compose.animation.AnimatedContentTransitionScopeImpl$ChildData
            java.lang.Object r2 = r2.q()
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r1, r2)
            r7.<init>(r1)
            r15.N(r7)
        L_0x00ad:
            androidx.compose.animation.AnimatedContentTransitionScopeImpl$ChildData r7 = (androidx.compose.animation.AnimatedContentTransitionScopeImpl.ChildData) r7
            androidx.compose.animation.EnterTransition r8 = r3.c()
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.f15489d
            boolean r2 = r15.l(r3)
            java.lang.Object r10 = r15.g()
            if (r2 != 0) goto L_0x00c5
            java.lang.Object r2 = r5.a()
            if (r10 != r2) goto L_0x00cd
        L_0x00c5:
            androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1 r10 = new androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1
            r10.<init>(r3)
            r15.N(r10)
        L_0x00cd:
            kotlin.jvm.functions.Function3 r10 = (kotlin.jvm.functions.Function3) r10
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.layout.LayoutModifierKt.a(r1, r10)
            java.lang.Object r2 = r0.f2030A
            androidx.compose.animation.core.Transition r3 = r0.f2032z
            java.lang.Object r3 = r3.q()
            boolean r2 = kotlin.jvm.internal.Intrinsics.d(r2, r3)
            r7.b(r2)
            androidx.compose.ui.Modifier r3 = r1.o0(r7)
            androidx.compose.animation.core.Transition r1 = r0.f2032z
            java.lang.Object r2 = r0.f2030A
            boolean r2 = r15.l(r2)
            java.lang.Object r7 = r0.f2030A
            java.lang.Object r10 = r15.g()
            if (r2 != 0) goto L_0x00fc
            java.lang.Object r2 = r5.a()
            if (r10 != r2) goto L_0x0104
        L_0x00fc:
            androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$3$1 r10 = new androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$3$1
            r10.<init>(r7)
            r15.N(r10)
        L_0x0104:
            r2 = r10
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            boolean r7 = r15.W(r6)
            java.lang.Object r10 = r15.g()
            if (r7 != 0) goto L_0x0117
            java.lang.Object r5 = r5.a()
            if (r10 != r5) goto L_0x011f
        L_0x0117:
            androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$4$1 r10 = new androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$4$1
            r10.<init>(r6)
            r15.N(r10)
        L_0x011f:
            r7 = r10
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$5 r5 = new androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$5
            androidx.compose.runtime.snapshots.SnapshotStateList r10 = r0.D
            java.lang.Object r11 = r0.f2030A
            androidx.compose.animation.AnimatedContentTransitionScopeImpl r12 = r0.C
            kotlin.jvm.functions.Function4 r13 = r0.E
            r5.<init>(r10, r11, r12, r13)
            r10 = 54
            r11 = -616195562(0xffffffffdb459a16, float:-5.561999E16)
            androidx.compose.runtime.internal.ComposableLambda r10 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r11, r4, r5, r15, r10)
            r11 = 12582912(0xc00000, float:1.7632415E-38)
            r12 = 64
            r13 = 0
            r4 = r8
            r5 = r6
            r6 = r7
            r7 = r13
            r8 = r10
            r9 = r15
            r10 = r11
            r11 = r12
            androidx.compose.animation.AnimatedVisibilityKt.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x0155
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x0155
        L_0x0152:
            r15.B()
        L_0x0155:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1.b(androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
