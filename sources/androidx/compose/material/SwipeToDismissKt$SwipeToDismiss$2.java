package androidx.compose.material;

import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.runtime.Composer;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SwipeToDismissKt$SwipeToDismiss$2 extends Lambda implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f8547A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ DismissState f8548B;
    public final /* synthetic */ Function3 C;
    public final /* synthetic */ Function3 D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Set f8549z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwipeToDismissKt$SwipeToDismiss$2(Set set, Function1 function1, DismissState dismissState, Function3 function3, Function3 function32) {
        super(3);
        this.f8549z = set;
        this.f8547A = function1;
        this.f8548B = dismissState;
        this.C = function3;
        this.D = function32;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: kotlin.jvm.functions.Function2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(androidx.compose.foundation.layout.BoxWithConstraintsScope r21, androidx.compose.runtime.Composer r22, int r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            r2 = r23 & 6
            if (r2 != 0) goto L_0x0016
            r2 = r21
            boolean r3 = r1.W(r2)
            if (r3 == 0) goto L_0x0012
            r3 = 4
            goto L_0x0013
        L_0x0012:
            r3 = 2
        L_0x0013:
            r3 = r23 | r3
            goto L_0x001a
        L_0x0016:
            r2 = r21
            r3 = r23
        L_0x001a:
            r4 = r3 & 19
            r5 = 18
            r6 = 1
            r7 = 0
            if (r4 == r5) goto L_0x0024
            r4 = r6
            goto L_0x0025
        L_0x0024:
            r4 = r7
        L_0x0025:
            r5 = r3 & 1
            boolean r4 = r1.E(r4, r5)
            if (r4 == 0) goto L_0x02b1
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            if (r4 == 0) goto L_0x003c
            r4 = -1
            java.lang.String r5 = "androidx.compose.material.SwipeToDismiss.<anonymous> (SwipeToDismiss.kt:167)"
            r8 = 338007641(0x14259659, float:8.360022E-27)
            androidx.compose.runtime.ComposerKt.Y(r8, r3, r4, r5)
        L_0x003c:
            long r2 = r21.d()
            int r2 = androidx.compose.ui.unit.Constraints.l(r2)
            float r2 = (float) r2
            androidx.compose.runtime.ProvidableCompositionLocal r3 = androidx.compose.ui.platform.CompositionLocalsKt.m()
            java.lang.Object r3 = r1.C(r3)
            androidx.compose.ui.unit.LayoutDirection r4 = androidx.compose.ui.unit.LayoutDirection.Rtl
            if (r3 != r4) goto L_0x0053
            r13 = r6
            goto L_0x0054
        L_0x0053:
            r13 = r7
        L_0x0054:
            r3 = 0
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            androidx.compose.material.DismissValue r4 = androidx.compose.material.DismissValue.Default
            kotlin.Pair r3 = kotlin.TuplesKt.a(r3, r4)
            kotlin.Pair[] r3 = new kotlin.Pair[]{r3}
            java.util.Map r10 = kotlin.collections.MapsKt.l(r3)
            java.util.Set r3 = r0.f8549z
            androidx.compose.material.DismissDirection r5 = androidx.compose.material.DismissDirection.StartToEnd
            boolean r3 = r3.contains(r5)
            if (r3 == 0) goto L_0x0086
            java.lang.Float r3 = java.lang.Float.valueOf(r2)
            androidx.compose.material.DismissValue r8 = androidx.compose.material.DismissValue.DismissedToEnd
            kotlin.Pair r3 = kotlin.TuplesKt.a(r3, r8)
            java.lang.Object r8 = r3.e()
            java.lang.Object r3 = r3.f()
            r10.put(r8, r3)
        L_0x0086:
            java.util.Set r3 = r0.f8549z
            androidx.compose.material.DismissDirection r8 = androidx.compose.material.DismissDirection.EndToStart
            boolean r3 = r3.contains(r8)
            if (r3 == 0) goto L_0x00a6
            float r3 = -r2
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            androidx.compose.material.DismissValue r9 = androidx.compose.material.DismissValue.DismissedToStart
            kotlin.Pair r3 = kotlin.TuplesKt.a(r3, r9)
            java.lang.Object r9 = r3.e()
            java.lang.Object r3 = r3.f()
            r10.put(r9, r3)
        L_0x00a6:
            kotlin.jvm.functions.Function1 r3 = r0.f8547A
            boolean r3 = r1.W(r3)
            kotlin.jvm.functions.Function1 r9 = r0.f8547A
            java.lang.Object r11 = r22.g()
            if (r3 != 0) goto L_0x00bc
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r11 != r3) goto L_0x00c4
        L_0x00bc:
            androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2$thresholds$1$1 r11 = new androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2$thresholds$1$1
            r11.<init>(r9)
            r1.N(r11)
        L_0x00c4:
            r15 = r11
            kotlin.jvm.functions.Function2 r15 = (kotlin.jvm.functions.Function2) r15
            java.util.Set r3 = r0.f8549z
            boolean r3 = r3.contains(r8)
            r8 = 1101004800(0x41a00000, float:20.0)
            r9 = 1092616192(0x41200000, float:10.0)
            if (r3 == 0) goto L_0x00d5
            r3 = r9
            goto L_0x00d6
        L_0x00d5:
            r3 = r8
        L_0x00d6:
            java.util.Set r11 = r0.f8549z
            boolean r5 = r11.contains(r5)
            if (r5 == 0) goto L_0x00df
            r8 = r9
        L_0x00df:
            androidx.compose.ui.Modifier$Companion r5 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.foundation.gestures.Orientation r11 = androidx.compose.foundation.gestures.Orientation.Horizontal
            androidx.compose.material.DismissState r9 = r0.f8548B
            java.lang.Object r9 = r9.p()
            if (r9 != r4) goto L_0x00ed
            r12 = r6
            goto L_0x00ee
        L_0x00ed:
            r12 = r7
        L_0x00ee:
            androidx.compose.material.ResistanceConfig r4 = new androidx.compose.material.ResistanceConfig
            r4.<init>(r2, r3, r8)
            androidx.compose.material.DismissState r9 = r0.f8548B
            r18 = 288(0x120, float:4.04E-43)
            r19 = 0
            r14 = 0
            r17 = 0
            r8 = r5
            r16 = r4
            androidx.compose.ui.Modifier r2 = androidx.compose.material.SwipeableKt.g(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            kotlin.jvm.functions.Function3 r3 = r0.C
            androidx.compose.material.DismissState r4 = r0.f8548B
            kotlin.jvm.functions.Function3 r6 = r0.D
            androidx.compose.ui.Alignment$Companion r8 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r9 = r8.o()
            androidx.compose.ui.layout.MeasurePolicy r9 = androidx.compose.foundation.layout.BoxKt.g(r9, r7)
            int r10 = androidx.compose.runtime.ComposablesKt.a(r1, r7)
            androidx.compose.runtime.CompositionLocalMap r11 = r22.I()
            androidx.compose.ui.Modifier r2 = androidx.compose.ui.ComposedModifierKt.e(r1, r2)
            androidx.compose.ui.node.ComposeUiNode$Companion r12 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r13 = r12.a()
            androidx.compose.runtime.Applier r14 = r22.v()
            if (r14 != 0) goto L_0x012e
            androidx.compose.runtime.ComposablesKt.d()
        L_0x012e:
            r22.s()
            boolean r14 = r22.n()
            if (r14 == 0) goto L_0x013b
            r1.y(r13)
            goto L_0x013e
        L_0x013b:
            r22.K()
        L_0x013e:
            androidx.compose.runtime.Composer r13 = androidx.compose.runtime.Updater.b(r22)
            kotlin.jvm.functions.Function2 r14 = r12.c()
            androidx.compose.runtime.Updater.g(r13, r9, r14)
            kotlin.jvm.functions.Function2 r9 = r12.e()
            androidx.compose.runtime.Updater.g(r13, r11, r9)
            kotlin.jvm.functions.Function2 r9 = r12.b()
            boolean r11 = r13.n()
            if (r11 != 0) goto L_0x0168
            java.lang.Object r11 = r13.g()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r10)
            boolean r11 = kotlin.jvm.internal.Intrinsics.d(r11, r14)
            if (r11 != 0) goto L_0x0176
        L_0x0168:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r13.N(r11)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r13.A(r10, r9)
        L_0x0176:
            kotlin.jvm.functions.Function2 r9 = r12.d()
            androidx.compose.runtime.Updater.g(r13, r2, r9)
            androidx.compose.foundation.layout.BoxScopeInstance r2 = androidx.compose.foundation.layout.BoxScopeInstance.f3797a
            androidx.compose.ui.Modifier r2 = r2.a(r5)
            androidx.compose.foundation.layout.Arrangement r9 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Horizontal r10 = r9.f()
            androidx.compose.ui.Alignment$Vertical r11 = r8.l()
            androidx.compose.ui.layout.MeasurePolicy r10 = androidx.compose.foundation.layout.RowKt.b(r10, r11, r1, r7)
            int r11 = androidx.compose.runtime.ComposablesKt.a(r1, r7)
            androidx.compose.runtime.CompositionLocalMap r13 = r22.I()
            androidx.compose.ui.Modifier r2 = androidx.compose.ui.ComposedModifierKt.e(r1, r2)
            kotlin.jvm.functions.Function0 r14 = r12.a()
            androidx.compose.runtime.Applier r15 = r22.v()
            if (r15 != 0) goto L_0x01aa
            androidx.compose.runtime.ComposablesKt.d()
        L_0x01aa:
            r22.s()
            boolean r15 = r22.n()
            if (r15 == 0) goto L_0x01b7
            r1.y(r14)
            goto L_0x01ba
        L_0x01b7:
            r22.K()
        L_0x01ba:
            androidx.compose.runtime.Composer r14 = androidx.compose.runtime.Updater.b(r22)
            kotlin.jvm.functions.Function2 r15 = r12.c()
            androidx.compose.runtime.Updater.g(r14, r10, r15)
            kotlin.jvm.functions.Function2 r10 = r12.e()
            androidx.compose.runtime.Updater.g(r14, r13, r10)
            kotlin.jvm.functions.Function2 r10 = r12.b()
            boolean r13 = r14.n()
            if (r13 != 0) goto L_0x01e4
            java.lang.Object r13 = r14.g()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r11)
            boolean r13 = kotlin.jvm.internal.Intrinsics.d(r13, r15)
            if (r13 != 0) goto L_0x01f2
        L_0x01e4:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r11)
            r14.N(r13)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r14.A(r11, r10)
        L_0x01f2:
            kotlin.jvm.functions.Function2 r10 = r12.d()
            androidx.compose.runtime.Updater.g(r14, r2, r10)
            androidx.compose.foundation.layout.RowScopeInstance r2 = androidx.compose.foundation.layout.RowScopeInstance.f4150a
            r10 = 6
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r3.d(r2, r1, r11)
            r22.T()
            boolean r3 = r1.W(r4)
            java.lang.Object r11 = r22.g()
            if (r3 != 0) goto L_0x0218
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r11 != r3) goto L_0x0220
        L_0x0218:
            androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2$1$1$1 r11 = new androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2$1$1$1
            r11.<init>(r4)
            r1.N(r11)
        L_0x0220:
            kotlin.jvm.functions.Function1 r11 = (kotlin.jvm.functions.Function1) r11
            androidx.compose.ui.Modifier r3 = androidx.compose.foundation.layout.OffsetKt.a(r5, r11)
            androidx.compose.foundation.layout.Arrangement$Horizontal r4 = r9.f()
            androidx.compose.ui.Alignment$Vertical r5 = r8.l()
            androidx.compose.ui.layout.MeasurePolicy r4 = androidx.compose.foundation.layout.RowKt.b(r4, r5, r1, r7)
            int r5 = androidx.compose.runtime.ComposablesKt.a(r1, r7)
            androidx.compose.runtime.CompositionLocalMap r7 = r22.I()
            androidx.compose.ui.Modifier r3 = androidx.compose.ui.ComposedModifierKt.e(r1, r3)
            kotlin.jvm.functions.Function0 r8 = r12.a()
            androidx.compose.runtime.Applier r9 = r22.v()
            if (r9 != 0) goto L_0x024b
            androidx.compose.runtime.ComposablesKt.d()
        L_0x024b:
            r22.s()
            boolean r9 = r22.n()
            if (r9 == 0) goto L_0x0258
            r1.y(r8)
            goto L_0x025b
        L_0x0258:
            r22.K()
        L_0x025b:
            androidx.compose.runtime.Composer r8 = androidx.compose.runtime.Updater.b(r22)
            kotlin.jvm.functions.Function2 r9 = r12.c()
            androidx.compose.runtime.Updater.g(r8, r4, r9)
            kotlin.jvm.functions.Function2 r4 = r12.e()
            androidx.compose.runtime.Updater.g(r8, r7, r4)
            kotlin.jvm.functions.Function2 r4 = r12.b()
            boolean r7 = r8.n()
            if (r7 != 0) goto L_0x0285
            java.lang.Object r7 = r8.g()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            boolean r7 = kotlin.jvm.internal.Intrinsics.d(r7, r9)
            if (r7 != 0) goto L_0x0293
        L_0x0285:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r8.N(r7)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r8.A(r5, r4)
        L_0x0293:
            kotlin.jvm.functions.Function2 r4 = r12.d()
            androidx.compose.runtime.Updater.g(r8, r3, r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            r6.d(r2, r1, r3)
            r22.T()
            r22.T()
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x02b4
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x02b4
        L_0x02b1:
            r22.B()
        L_0x02b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeToDismissKt$SwipeToDismiss$2.b(androidx.compose.foundation.layout.BoxWithConstraintsScope, androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((BoxWithConstraintsScope) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
