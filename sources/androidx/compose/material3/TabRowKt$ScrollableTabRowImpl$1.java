package androidx.compose.material3;

import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

@Metadata
final class TabRowKt$ScrollableTabRowImpl$1 implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f11302A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f11303B;
    public final /* synthetic */ float C;
    public final /* synthetic */ float D;
    public final /* synthetic */ int E;
    public final /* synthetic */ Function3 F;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ScrollState f11304z;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: androidx.compose.material3.ScrollableTabData} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: androidx.compose.material3.TabRowKt$ScrollableTabRowImpl$1$1$2$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: androidx.compose.material3.TabRowKt$ScrollableTabRowImpl$1$1$2$1} */
    /* JADX WARNING: type inference failed for: r11v8 */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0177, code lost:
        if (r11 == r3.a()) goto L_0x0179;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(androidx.compose.runtime.Composer r23, int r24) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r2 & 3
            r4 = 1
            r5 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r7 = 2
            if (r3 == r7) goto L_0x0013
            r3 = r4
            goto L_0x0014
        L_0x0013:
            r3 = r5
        L_0x0014:
            r8 = r2 & 1
            boolean r3 = r1.E(r3, r8)
            if (r3 == 0) goto L_0x0225
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x002b
            r3 = -1
            java.lang.String r8 = "androidx.compose.material3.ScrollableTabRowImpl.<anonymous> (TabRow.kt:523)"
            r9 = 1878374785(0x6ff5b981, float:1.5209618E29)
            androidx.compose.runtime.ComposerKt.Y(r9, r2, r3, r8)
        L_0x002b:
            java.lang.Object r2 = r23.g()
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r8 = r3.a()
            if (r2 != r8) goto L_0x0040
            kotlin.coroutines.EmptyCoroutineContext r2 = kotlin.coroutines.EmptyCoroutineContext.f40721z
            kotlinx.coroutines.CoroutineScope r2 = androidx.compose.runtime.EffectsKt.j(r2, r1)
            r1.N(r2)
        L_0x0040:
            kotlinx.coroutines.CoroutineScope r2 = (kotlinx.coroutines.CoroutineScope) r2
            androidx.compose.material3.tokens.MotionSchemeKeyTokens r8 = androidx.compose.material3.tokens.MotionSchemeKeyTokens.DefaultSpatial
            r9 = 6
            androidx.compose.animation.core.FiniteAnimationSpec r10 = androidx.compose.material3.MotionSchemeKt.b(r8, r1, r9)
            androidx.compose.animation.core.FiniteAnimationSpec r8 = androidx.compose.material3.MotionSchemeKt.b(r8, r1, r9)
            androidx.compose.foundation.ScrollState r9 = r0.f11304z
            boolean r9 = r1.W(r9)
            boolean r11 = r1.W(r2)
            r9 = r9 | r11
            androidx.compose.foundation.ScrollState r11 = r0.f11304z
            java.lang.Object r12 = r23.g()
            if (r9 != 0) goto L_0x0066
            java.lang.Object r9 = r3.a()
            if (r12 != r9) goto L_0x006e
        L_0x0066:
            androidx.compose.material3.ScrollableTabData r12 = new androidx.compose.material3.ScrollableTabData
            r12.<init>(r11, r2, r10)
            r1.N(r12)
        L_0x006e:
            r2 = r12
            androidx.compose.material3.ScrollableTabData r2 = (androidx.compose.material3.ScrollableTabData) r2
            java.lang.Object r9 = r23.g()
            java.lang.Object r10 = r3.a()
            if (r9 != r10) goto L_0x0083
            androidx.compose.material3.TabRowKt$ScrollableTabRowImpl$1$scope$1$1 r9 = new androidx.compose.material3.TabRowKt$ScrollableTabRowImpl$1$scope$1$1
            r9.<init>(r8)
            r1.N(r9)
        L_0x0083:
            r8 = r9
            androidx.compose.material3.TabRowKt$ScrollableTabRowImpl$1$scope$1$1 r8 = (androidx.compose.material3.TabRowKt$ScrollableTabRowImpl$1$scope$1$1) r8
            androidx.compose.ui.Alignment$Companion r9 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r10 = r9.d()
            kotlin.jvm.functions.Function2 r11 = r0.f11302A
            kotlin.jvm.functions.Function2 r12 = r0.f11303B
            androidx.compose.foundation.ScrollState r14 = r0.f11304z
            float r15 = r0.C
            float r13 = r0.D
            r16 = r15
            int r15 = r0.E
            kotlin.jvm.functions.Function3 r7 = r0.F
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.ui.layout.MeasurePolicy r10 = androidx.compose.foundation.layout.BoxKt.g(r10, r5)
            int r19 = androidx.compose.runtime.ComposablesKt.a(r1, r5)
            androidx.compose.runtime.CompositionLocalMap r5 = r23.I()
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.ComposedModifierKt.e(r1, r4)
            androidx.compose.ui.node.ComposeUiNode$Companion r20 = androidx.compose.ui.node.ComposeUiNode.f17222h
            r24 = r13
            kotlin.jvm.functions.Function0 r13 = r20.a()
            androidx.compose.runtime.Applier r21 = r23.v()
            if (r21 != 0) goto L_0x00bf
            androidx.compose.runtime.ComposablesKt.d()
        L_0x00bf:
            r23.s()
            boolean r21 = r23.n()
            if (r21 == 0) goto L_0x00cc
            r1.y(r13)
            goto L_0x00cf
        L_0x00cc:
            r23.K()
        L_0x00cf:
            androidx.compose.runtime.Composer r13 = androidx.compose.runtime.Updater.b(r23)
            r21 = r15
            kotlin.jvm.functions.Function2 r15 = r20.c()
            androidx.compose.runtime.Updater.g(r13, r10, r15)
            kotlin.jvm.functions.Function2 r10 = r20.e()
            androidx.compose.runtime.Updater.g(r13, r5, r10)
            kotlin.jvm.functions.Function2 r5 = r20.b()
            boolean r10 = r13.n()
            if (r10 != 0) goto L_0x00fb
            java.lang.Object r10 = r13.g()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r19)
            boolean r10 = kotlin.jvm.internal.Intrinsics.d(r10, r15)
            if (r10 != 0) goto L_0x0109
        L_0x00fb:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r19)
            r13.N(r10)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r19)
            r13.A(r10, r5)
        L_0x0109:
            kotlin.jvm.functions.Function2 r5 = r20.d()
            androidx.compose.runtime.Updater.g(r13, r0, r5)
            androidx.compose.foundation.layout.BoxScopeInstance r0 = androidx.compose.foundation.layout.BoxScopeInstance.f3797a
            r11.m(r1, r6)
            androidx.compose.material3.TabRowKt$ScrollableTabRowImpl$1$1$1 r0 = new androidx.compose.material3.TabRowKt$ScrollableTabRowImpl$1$1$1
            r0.<init>(r7, r8)
            r5 = 54
            r7 = 509386037(0x1e5c9d35, float:1.1679213E-20)
            r10 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r7, r10, r0, r1, r5)
            r5 = 2
            kotlin.jvm.functions.Function2[] r7 = new kotlin.jvm.functions.Function2[r5]
            r11 = 0
            r7[r11] = r12
            r7[r10] = r0
            java.util.List r0 = kotlin.collections.CollectionsKt.p(r7)
            r7 = 0
            r12 = 0
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.layout.SizeKt.h(r4, r7, r10, r12)
            androidx.compose.ui.Alignment r7 = r9.h()
            androidx.compose.ui.Modifier r13 = androidx.compose.foundation.layout.SizeKt.E(r4, r7, r11, r5, r12)
            r18 = 14
            r19 = 0
            r15 = 0
            r4 = 0
            r17 = 0
            r5 = r24
            r7 = r16
            r9 = r21
            r16 = r4
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.ScrollKt.b(r13, r14, r15, r16, r17, r18, r19)
            androidx.compose.ui.Modifier r4 = androidx.compose.foundation.selection.SelectableGroupKt.a(r4)
            androidx.compose.ui.Modifier r4 = androidx.compose.ui.draw.ClipKt.b(r4)
            boolean r10 = r1.h(r7)
            boolean r11 = r1.h(r5)
            r10 = r10 | r11
            boolean r11 = r1.i(r9)
            r10 = r10 | r11
            boolean r11 = r1.l(r2)
            r10 = r10 | r11
            java.lang.Object r11 = r23.g()
            if (r10 != 0) goto L_0x0179
            java.lang.Object r10 = r3.a()
            if (r11 != r10) goto L_0x018a
        L_0x0179:
            androidx.compose.material3.TabRowKt$ScrollableTabRowImpl$1$1$2$1 r11 = new androidx.compose.material3.TabRowKt$ScrollableTabRowImpl$1$1$2$1
            r13 = r11
            r14 = r7
            r15 = r5
            r16 = r8
            r17 = r9
            r18 = r2
            r13.<init>(r14, r15, r16, r17, r18)
            r1.N(r11)
        L_0x018a:
            androidx.compose.ui.layout.MultiContentMeasurePolicy r11 = (androidx.compose.ui.layout.MultiContentMeasurePolicy) r11
            kotlin.jvm.functions.Function2 r0 = androidx.compose.ui.layout.LayoutKt.b(r0)
            boolean r2 = r1.W(r11)
            java.lang.Object r5 = r23.g()
            if (r2 != 0) goto L_0x01a0
            java.lang.Object r2 = r3.a()
            if (r5 != r2) goto L_0x01a7
        L_0x01a0:
            androidx.compose.ui.layout.MeasurePolicy r5 = androidx.compose.ui.layout.MultiContentMeasurePolicyKt.a(r11)
            r1.N(r5)
        L_0x01a7:
            androidx.compose.ui.layout.MeasurePolicy r5 = (androidx.compose.ui.layout.MeasurePolicy) r5
            r2 = 0
            int r2 = androidx.compose.runtime.ComposablesKt.a(r1, r2)
            androidx.compose.runtime.CompositionLocalMap r3 = r23.I()
            androidx.compose.ui.Modifier r4 = androidx.compose.ui.ComposedModifierKt.e(r1, r4)
            kotlin.jvm.functions.Function0 r7 = r20.a()
            androidx.compose.runtime.Applier r8 = r23.v()
            if (r8 != 0) goto L_0x01c3
            androidx.compose.runtime.ComposablesKt.d()
        L_0x01c3:
            r23.s()
            boolean r8 = r23.n()
            if (r8 == 0) goto L_0x01d0
            r1.y(r7)
            goto L_0x01d3
        L_0x01d0:
            r23.K()
        L_0x01d3:
            androidx.compose.runtime.Composer r7 = androidx.compose.runtime.Updater.b(r23)
            kotlin.jvm.functions.Function2 r8 = r20.c()
            androidx.compose.runtime.Updater.g(r7, r5, r8)
            kotlin.jvm.functions.Function2 r5 = r20.e()
            androidx.compose.runtime.Updater.g(r7, r3, r5)
            kotlin.jvm.functions.Function2 r3 = r20.b()
            boolean r5 = r7.n()
            if (r5 != 0) goto L_0x01fd
            java.lang.Object r5 = r7.g()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r5, r8)
            if (r5 != 0) goto L_0x020b
        L_0x01fd:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r7.N(r5)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r7.A(r2, r3)
        L_0x020b:
            kotlin.jvm.functions.Function2 r2 = r20.d()
            androidx.compose.runtime.Updater.g(r7, r4, r2)
            r0.m(r1, r6)
            r23.T()
            r23.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0228
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x0228
        L_0x0225:
            r23.B()
        L_0x0228:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TabRowKt$ScrollableTabRowImpl$1.b(androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
