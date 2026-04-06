package androidx.compose.material;

import androidx.compose.runtime.Composer;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SnackbarHostKt$FadeInFadeOutWithScale$1$1 extends Lambda implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SnackbarData f8432A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ List f8433B;
    public final /* synthetic */ FadeInFadeOutState C;
    public final /* synthetic */ String D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SnackbarData f8434z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnackbarHostKt$FadeInFadeOutWithScale$1$1(SnackbarData snackbarData, SnackbarData snackbarData2, List list, FadeInFadeOutState fadeInFadeOutState, String str) {
        super(3);
        this.f8434z = snackbarData;
        this.f8432A = snackbarData2;
        this.f8433B = list;
        this.C = fadeInFadeOutState;
        this.D = str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(kotlin.jvm.functions.Function2 r37, androidx.compose.runtime.Composer r38, int r39) {
        /*
            r36 = this;
            r0 = r36
            r1 = r37
            r8 = r38
            r9 = 1
            r2 = r39 & 6
            if (r2 != 0) goto L_0x0018
            boolean r2 = r8.l(r1)
            if (r2 == 0) goto L_0x0013
            r2 = 4
            goto L_0x0014
        L_0x0013:
            r2 = 2
        L_0x0014:
            r2 = r39 | r2
            r10 = r2
            goto L_0x001a
        L_0x0018:
            r10 = r39
        L_0x001a:
            r2 = r10 & 19
            r3 = 18
            r11 = 0
            if (r2 == r3) goto L_0x0023
            r2 = r9
            goto L_0x0024
        L_0x0023:
            r2 = r11
        L_0x0024:
            r3 = r10 & 1
            boolean r2 = r8.E(r2, r3)
            if (r2 == 0) goto L_0x01a8
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x003b
            r2 = -1
            java.lang.String r3 = "androidx.compose.material.FadeInFadeOutWithScale.<anonymous>.<anonymous> (SnackbarHost.kt:257)"
            r4 = 1471040642(0x57ae4c82, float:3.83287244E14)
            androidx.compose.runtime.ComposerKt.Y(r4, r10, r2, r3)
        L_0x003b:
            androidx.compose.material.SnackbarData r2 = r0.f8434z
            androidx.compose.material.SnackbarData r3 = r0.f8432A
            boolean r12 = kotlin.jvm.internal.Intrinsics.d(r2, r3)
            r2 = 75
            if (r12 == 0) goto L_0x004b
            r3 = 150(0x96, float:2.1E-43)
            r13 = r3
            goto L_0x004c
        L_0x004b:
            r13 = r2
        L_0x004c:
            if (r12 == 0) goto L_0x005c
            java.util.List r3 = r0.f8433B
            java.util.List r3 = androidx.compose.ui.util.ListUtilsKt.b(r3)
            int r3 = r3.size()
            if (r3 == r9) goto L_0x005c
            r14 = r2
            goto L_0x005d
        L_0x005c:
            r14 = r11
        L_0x005d:
            androidx.compose.animation.core.Easing r2 = androidx.compose.animation.core.EasingKt.e()
            androidx.compose.animation.core.TweenSpec r2 = androidx.compose.animation.core.AnimationSpecKt.m(r13, r14, r2)
            androidx.compose.material.SnackbarData r3 = r0.f8434z
            boolean r3 = r8.l(r3)
            androidx.compose.material.FadeInFadeOutState r4 = r0.C
            boolean r4 = r8.l(r4)
            r3 = r3 | r4
            androidx.compose.material.SnackbarData r4 = r0.f8434z
            androidx.compose.material.FadeInFadeOutState r5 = r0.C
            java.lang.Object r6 = r38.g()
            if (r3 != 0) goto L_0x0084
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r6 != r3) goto L_0x008c
        L_0x0084:
            androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1$1 r6 = new androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1$1
            r6.<init>(r4, r5)
            r8.N(r6)
        L_0x008c:
            r4 = r6
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r6 = 0
            r7 = 0
            r3 = r12
            r5 = r38
            androidx.compose.runtime.State r2 = androidx.compose.material.SnackbarHostKt.f(r2, r3, r4, r5, r6, r7)
            androidx.compose.animation.core.Easing r3 = androidx.compose.animation.core.EasingKt.d()
            androidx.compose.animation.core.TweenSpec r3 = androidx.compose.animation.core.AnimationSpecKt.m(r13, r14, r3)
            androidx.compose.runtime.State r3 = androidx.compose.material.SnackbarHostKt.g(r3, r12, r8, r11)
            androidx.compose.ui.Modifier$Companion r13 = androidx.compose.ui.Modifier.f15489d
            java.lang.Object r4 = r3.getValue()
            java.lang.Number r4 = (java.lang.Number) r4
            float r14 = r4.floatValue()
            java.lang.Object r3 = r3.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            float r15 = r3.floatValue()
            java.lang.Object r2 = r2.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            float r16 = r2.floatValue()
            r34 = 131064(0x1fff8, float:1.8366E-40)
            r35 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r31 = 0
            r33 = 0
            androidx.compose.ui.Modifier r2 = androidx.compose.ui.graphics.GraphicsLayerModifierKt.c(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r26, r27, r28, r29, r31, r33, r34, r35)
            boolean r3 = r8.d(r12)
            java.lang.String r4 = r0.D
            boolean r4 = r8.W(r4)
            r3 = r3 | r4
            androidx.compose.material.SnackbarData r4 = r0.f8434z
            boolean r4 = r8.l(r4)
            r3 = r3 | r4
            java.lang.String r4 = r0.D
            androidx.compose.material.SnackbarData r5 = r0.f8434z
            java.lang.Object r6 = r38.g()
            if (r3 != 0) goto L_0x010d
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r6 != r3) goto L_0x0115
        L_0x010d:
            androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1$1$1 r6 = new androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1$1$1
            r6.<init>(r12, r4, r5)
            r8.N(r6)
        L_0x0115:
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            r3 = 0
            androidx.compose.ui.Modifier r2 = androidx.compose.ui.semantics.SemanticsModifierKt.d(r2, r11, r6, r9, r3)
            androidx.compose.ui.Alignment$Companion r3 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r3 = r3.o()
            androidx.compose.ui.layout.MeasurePolicy r3 = androidx.compose.foundation.layout.BoxKt.g(r3, r11)
            int r4 = androidx.compose.runtime.ComposablesKt.a(r8, r11)
            androidx.compose.runtime.CompositionLocalMap r5 = r38.I()
            androidx.compose.ui.Modifier r2 = androidx.compose.ui.ComposedModifierKt.e(r8, r2)
            androidx.compose.ui.node.ComposeUiNode$Companion r6 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r7 = r6.a()
            androidx.compose.runtime.Applier r9 = r38.v()
            if (r9 != 0) goto L_0x0141
            androidx.compose.runtime.ComposablesKt.d()
        L_0x0141:
            r38.s()
            boolean r9 = r38.n()
            if (r9 == 0) goto L_0x014e
            r8.y(r7)
            goto L_0x0151
        L_0x014e:
            r38.K()
        L_0x0151:
            androidx.compose.runtime.Composer r7 = androidx.compose.runtime.Updater.b(r38)
            kotlin.jvm.functions.Function2 r9 = r6.c()
            androidx.compose.runtime.Updater.g(r7, r3, r9)
            kotlin.jvm.functions.Function2 r3 = r6.e()
            androidx.compose.runtime.Updater.g(r7, r5, r3)
            kotlin.jvm.functions.Function2 r3 = r6.b()
            boolean r5 = r7.n()
            if (r5 != 0) goto L_0x017b
            java.lang.Object r5 = r7.g()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r5, r9)
            if (r5 != 0) goto L_0x0189
        L_0x017b:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r7.N(r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7.A(r4, r3)
        L_0x0189:
            kotlin.jvm.functions.Function2 r3 = r6.d()
            androidx.compose.runtime.Updater.g(r7, r2, r3)
            androidx.compose.foundation.layout.BoxScopeInstance r2 = androidx.compose.foundation.layout.BoxScopeInstance.f3797a
            r2 = r10 & 14
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.m(r8, r2)
            r38.T()
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x01ab
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x01ab
        L_0x01a8:
            r38.B()
        L_0x01ab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1.b(kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int):void");
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        b((Function2) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }
}
