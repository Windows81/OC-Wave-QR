package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.ui.semantics.LiveRegionMode;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SnackbarHostKt$FadeInFadeOutWithScale$1$1 implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SnackbarData f11162A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ FadeInFadeOutState f11163B;
    public final /* synthetic */ String C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SnackbarData f11164z;

    public SnackbarHostKt$FadeInFadeOutWithScale$1$1(SnackbarData snackbarData, SnackbarData snackbarData2, FadeInFadeOutState fadeInFadeOutState, String str) {
        this.f11164z = snackbarData;
        this.f11162A = snackbarData2;
        this.f11163B = fadeInFadeOutState;
        this.C = str;
    }

    public static final Unit h(SnackbarData snackbarData, FadeInFadeOutState fadeInFadeOutState) {
        if (!Intrinsics.d(snackbarData, fadeInFadeOutState.a())) {
            CollectionsKt.H(fadeInFadeOutState.b(), new B6(snackbarData));
            RecomposeScope c2 = fadeInFadeOutState.c();
            if (c2 != null) {
                c2.invalidate();
            }
        }
        return Unit.f40552a;
    }

    public static final boolean i(SnackbarData snackbarData, FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem) {
        return Intrinsics.d(fadeInFadeOutAnimationItem.c(), snackbarData);
    }

    public static final Unit k(boolean z2, String str, SnackbarData snackbarData, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (z2) {
            SemanticsPropertiesKt.m0(semanticsPropertyReceiver, LiveRegionMode.f18031b.b());
        }
        SemanticsPropertiesKt.n(semanticsPropertyReceiver, (String) null, new A6(snackbarData), 1, (Object) null);
        SemanticsPropertiesKt.o0(semanticsPropertyReceiver, str);
        return Unit.f40552a;
    }

    public static final boolean p(SnackbarData snackbarData) {
        snackbarData.dismiss();
        return true;
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        g((Function2) obj, (Composer) obj2, ((Number) obj3).intValue());
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(kotlin.jvm.functions.Function2 r38, androidx.compose.runtime.Composer r39, int r40) {
        /*
            r37 = this;
            r0 = r37
            r1 = r38
            r8 = r39
            r9 = 1
            r10 = 6
            r2 = r40 & 6
            if (r2 != 0) goto L_0x0019
            boolean r2 = r8.l(r1)
            if (r2 == 0) goto L_0x0014
            r2 = 4
            goto L_0x0015
        L_0x0014:
            r2 = 2
        L_0x0015:
            r2 = r40 | r2
            r11 = r2
            goto L_0x001b
        L_0x0019:
            r11 = r40
        L_0x001b:
            r2 = r11 & 19
            r3 = 18
            r12 = 0
            if (r2 == r3) goto L_0x0024
            r2 = r9
            goto L_0x0025
        L_0x0024:
            r2 = r12
        L_0x0025:
            r3 = r11 & 1
            boolean r2 = r8.E(r2, r3)
            if (r2 == 0) goto L_0x018b
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x003c
            r2 = -1
            java.lang.String r3 = "androidx.compose.material3.FadeInFadeOutWithScale.<anonymous>.<anonymous> (SnackbarHost.kt:338)"
            r4 = -1952400805(0xffffffff8ba0ba5b, float:-6.1910155E-32)
            androidx.compose.runtime.ComposerKt.Y(r4, r11, r2, r3)
        L_0x003c:
            androidx.compose.material3.SnackbarData r2 = r0.f11164z
            androidx.compose.material3.SnackbarData r3 = r0.f11162A
            boolean r13 = kotlin.jvm.internal.Intrinsics.d(r2, r3)
            androidx.compose.material3.tokens.MotionSchemeKeyTokens r2 = androidx.compose.material3.tokens.MotionSchemeKeyTokens.FastEffects
            androidx.compose.animation.core.FiniteAnimationSpec r2 = androidx.compose.material3.MotionSchemeKt.b(r2, r8, r10)
            androidx.compose.material3.SnackbarData r3 = r0.f11164z
            boolean r3 = r8.W(r3)
            androidx.compose.material3.FadeInFadeOutState r4 = r0.f11163B
            boolean r4 = r8.l(r4)
            r3 = r3 | r4
            androidx.compose.material3.SnackbarData r4 = r0.f11164z
            androidx.compose.material3.FadeInFadeOutState r5 = r0.f11163B
            java.lang.Object r6 = r39.g()
            if (r3 != 0) goto L_0x0069
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r6 != r3) goto L_0x0071
        L_0x0069:
            androidx.compose.material3.y6 r6 = new androidx.compose.material3.y6
            r6.<init>(r4, r5)
            r8.N(r6)
        L_0x0071:
            r4 = r6
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r6 = 0
            r7 = 0
            r3 = r13
            r5 = r39
            androidx.compose.runtime.State r2 = androidx.compose.material3.SnackbarHostKt.j(r2, r3, r4, r5, r6, r7)
            androidx.compose.material3.tokens.MotionSchemeKeyTokens r3 = androidx.compose.material3.tokens.MotionSchemeKeyTokens.FastSpatial
            androidx.compose.animation.core.FiniteAnimationSpec r3 = androidx.compose.material3.MotionSchemeKt.b(r3, r8, r10)
            androidx.compose.runtime.State r3 = androidx.compose.material3.SnackbarHostKt.l(r3, r13, r8, r12)
            androidx.compose.ui.Modifier$Companion r14 = androidx.compose.ui.Modifier.f15489d
            java.lang.Object r4 = r3.getValue()
            java.lang.Number r4 = (java.lang.Number) r4
            float r15 = r4.floatValue()
            java.lang.Object r3 = r3.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            float r16 = r3.floatValue()
            java.lang.Object r2 = r2.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            float r17 = r2.floatValue()
            r35 = 131064(0x1fff8, float:1.8366E-40)
            r36 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r32 = 0
            r34 = 0
            androidx.compose.ui.Modifier r2 = androidx.compose.ui.graphics.GraphicsLayerModifierKt.c(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r27, r28, r29, r30, r32, r34, r35, r36)
            boolean r3 = r8.d(r13)
            androidx.compose.material3.SnackbarData r4 = r0.f11164z
            boolean r4 = r8.W(r4)
            r3 = r3 | r4
            java.lang.String r4 = r0.C
            boolean r4 = r8.W(r4)
            r3 = r3 | r4
            java.lang.String r4 = r0.C
            androidx.compose.material3.SnackbarData r5 = r0.f11164z
            java.lang.Object r6 = r39.g()
            if (r3 != 0) goto L_0x00f0
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r6 != r3) goto L_0x00f8
        L_0x00f0:
            androidx.compose.material3.z6 r6 = new androidx.compose.material3.z6
            r6.<init>(r13, r4, r5)
            r8.N(r6)
        L_0x00f8:
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            r3 = 0
            androidx.compose.ui.Modifier r2 = androidx.compose.ui.semantics.SemanticsModifierKt.d(r2, r12, r6, r9, r3)
            androidx.compose.ui.Alignment$Companion r3 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r3 = r3.o()
            androidx.compose.ui.layout.MeasurePolicy r3 = androidx.compose.foundation.layout.BoxKt.g(r3, r12)
            int r4 = androidx.compose.runtime.ComposablesKt.a(r8, r12)
            androidx.compose.runtime.CompositionLocalMap r5 = r39.I()
            androidx.compose.ui.Modifier r2 = androidx.compose.ui.ComposedModifierKt.e(r8, r2)
            androidx.compose.ui.node.ComposeUiNode$Companion r6 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r7 = r6.a()
            androidx.compose.runtime.Applier r9 = r39.v()
            if (r9 != 0) goto L_0x0124
            androidx.compose.runtime.ComposablesKt.d()
        L_0x0124:
            r39.s()
            boolean r9 = r39.n()
            if (r9 == 0) goto L_0x0131
            r8.y(r7)
            goto L_0x0134
        L_0x0131:
            r39.K()
        L_0x0134:
            androidx.compose.runtime.Composer r7 = androidx.compose.runtime.Updater.b(r39)
            kotlin.jvm.functions.Function2 r9 = r6.c()
            androidx.compose.runtime.Updater.g(r7, r3, r9)
            kotlin.jvm.functions.Function2 r3 = r6.e()
            androidx.compose.runtime.Updater.g(r7, r5, r3)
            kotlin.jvm.functions.Function2 r3 = r6.b()
            boolean r5 = r7.n()
            if (r5 != 0) goto L_0x015e
            java.lang.Object r5 = r7.g()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r5, r9)
            if (r5 != 0) goto L_0x016c
        L_0x015e:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r7.N(r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7.A(r4, r3)
        L_0x016c:
            kotlin.jvm.functions.Function2 r3 = r6.d()
            androidx.compose.runtime.Updater.g(r7, r2, r3)
            androidx.compose.foundation.layout.BoxScopeInstance r2 = androidx.compose.foundation.layout.BoxScopeInstance.f3797a
            r2 = r11 & 14
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.m(r8, r2)
            r39.T()
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x018e
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x018e
        L_0x018b:
            r39.B()
        L_0x018e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$1$1.g(kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int):void");
    }
}
