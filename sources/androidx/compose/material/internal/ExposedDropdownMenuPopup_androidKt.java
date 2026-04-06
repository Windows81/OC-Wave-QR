package androidx.compose.material.internal;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata
public final class ExposedDropdownMenuPopup_androidKt {

    /* renamed from: a  reason: collision with root package name */
    public static final ProvidableCompositionLocal f8965a = CompositionLocalKt.h((SnapshotMutationPolicy) null, ExposedDropdownMenuPopup_androidKt$LocalPopupTestTag$1.f8987z, 1, (Object) null);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: androidx.compose.material.internal.PopupLayout} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: androidx.compose.material.internal.PopupLayout} */
    /* JADX WARNING: type inference failed for: r11v2 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(kotlin.jvm.functions.Function0 r23, androidx.compose.ui.window.PopupPositionProvider r24, kotlin.jvm.functions.Function2 r25, androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            r7 = r24
            r8 = r25
            r9 = r27
            r0 = -707851182(0xffffffffd5cf0c52, float:-2.84564778E13)
            r1 = r26
            androidx.compose.runtime.Composer r6 = r1.q(r0)
            r1 = r28 & 1
            r5 = 4
            if (r1 == 0) goto L_0x001a
            r2 = r9 | 6
            r3 = r2
            r2 = r23
            goto L_0x002e
        L_0x001a:
            r2 = r9 & 6
            if (r2 != 0) goto L_0x002b
            r2 = r23
            boolean r3 = r6.l(r2)
            if (r3 == 0) goto L_0x0028
            r3 = r5
            goto L_0x0029
        L_0x0028:
            r3 = 2
        L_0x0029:
            r3 = r3 | r9
            goto L_0x002e
        L_0x002b:
            r2 = r23
            r3 = r9
        L_0x002e:
            r4 = r28 & 2
            r15 = 32
            if (r4 == 0) goto L_0x0037
            r3 = r3 | 48
            goto L_0x0046
        L_0x0037:
            r4 = r9 & 48
            if (r4 != 0) goto L_0x0046
            boolean r4 = r6.W(r7)
            if (r4 == 0) goto L_0x0043
            r4 = r15
            goto L_0x0045
        L_0x0043:
            r4 = 16
        L_0x0045:
            r3 = r3 | r4
        L_0x0046:
            r4 = r28 & 4
            if (r4 == 0) goto L_0x004e
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r4 = r3
            goto L_0x005f
        L_0x004e:
            r4 = r9 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x004c
            boolean r4 = r6.l(r8)
            if (r4 == 0) goto L_0x005b
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r4 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r3 = r3 | r4
            goto L_0x004c
        L_0x005f:
            r3 = r4 & 147(0x93, float:2.06E-43)
            r10 = 146(0x92, float:2.05E-43)
            r14 = 0
            r13 = 1
            if (r3 == r10) goto L_0x0069
            r3 = r13
            goto L_0x006a
        L_0x0069:
            r3 = r14
        L_0x006a:
            r10 = r4 & 1
            boolean r3 = r6.E(r3, r10)
            if (r3 == 0) goto L_0x0259
            if (r1 == 0) goto L_0x0077
            r1 = 0
            r3 = r1
            goto L_0x0078
        L_0x0077:
            r3 = r2
        L_0x0078:
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x0084
            r1 = -1
            java.lang.String r2 = "androidx.compose.material.internal.ExposedDropdownMenuPopup (ExposedDropdownMenuPopup.android.kt:80)"
            androidx.compose.runtime.ComposerKt.Y(r0, r4, r1, r2)
        L_0x0084:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.j()
            java.lang.Object r0 = r6.C(r0)
            r17 = r0
            android.view.View r17 = (android.view.View) r17
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.g()
            java.lang.Object r0 = r6.C(r0)
            r18 = r0
            androidx.compose.ui.unit.Density r18 = (androidx.compose.ui.unit.Density) r18
            androidx.compose.runtime.ProvidableCompositionLocal r0 = f8965a
            java.lang.Object r0 = r6.C(r0)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.m()
            java.lang.Object r0 = r6.C(r0)
            r1 = r0
            androidx.compose.ui.unit.LayoutDirection r1 = (androidx.compose.ui.unit.LayoutDirection) r1
            androidx.compose.runtime.CompositionContext r0 = androidx.compose.runtime.ComposablesKt.e(r6, r14)
            int r10 = r4 >> 6
            r10 = r10 & 14
            androidx.compose.runtime.State r12 = androidx.compose.runtime.SnapshotStateKt.p(r8, r6, r10)
            java.lang.Object[] r10 = new java.lang.Object[r14]
            androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$popupId$1 r16 = androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$popupId$1.f8982z
            r19 = 3072(0xc00, float:4.305E-42)
            r20 = 6
            r11 = 0
            r21 = 0
            r22 = r12
            r12 = r21
            r13 = r16
            r14 = r6
            r15 = r19
            r16 = r20
            java.lang.Object r10 = androidx.compose.runtime.saveable.RememberSaveableKt.h(r10, r11, r12, r13, r14, r15, r16)
            java.util.UUID r10 = (java.util.UUID) r10
            java.lang.Object r11 = r6.g()
            androidx.compose.runtime.Composer$Companion r12 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r13 = r12.a()
            if (r11 != r13) goto L_0x0110
            androidx.compose.material.internal.PopupLayout r11 = new androidx.compose.material.internal.PopupLayout
            r13 = r0
            r0 = r11
            r14 = r1
            r1 = r3
            r15 = r2
            r8 = r3
            r3 = r17
            r16 = r4
            r4 = r18
            r9 = r5
            r5 = r24
            r9 = r6
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$popupLayout$1$1$1 r0 = new androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$popupLayout$1$1$1
            r1 = r22
            r0.<init>(r11, r1)
            r1 = 580081703(0x22935827, float:3.9937765E-18)
            r2 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.c(r1, r2, r0)
            r11.o(r13, r0)
            r9.N(r11)
            goto L_0x0117
        L_0x0110:
            r14 = r1
            r15 = r2
            r8 = r3
            r16 = r4
            r9 = r6
            r2 = 1
        L_0x0117:
            androidx.compose.material.internal.PopupLayout r11 = (androidx.compose.material.internal.PopupLayout) r11
            boolean r0 = r9.l(r11)
            r1 = r16 & 14
            r3 = 4
            if (r1 != r3) goto L_0x0124
            r3 = r2
            goto L_0x0125
        L_0x0124:
            r3 = 0
        L_0x0125:
            r0 = r0 | r3
            boolean r3 = r9.W(r15)
            r0 = r0 | r3
            boolean r3 = r9.W(r14)
            r0 = r0 | r3
            java.lang.Object r3 = r9.g()
            if (r0 != 0) goto L_0x013c
            java.lang.Object r0 = r12.a()
            if (r3 != r0) goto L_0x0144
        L_0x013c:
            androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$1$1 r3 = new androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$1$1
            r3.<init>(r11, r8, r15, r14)
            r9.N(r3)
        L_0x0144:
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            r0 = 0
            androidx.compose.runtime.EffectsKt.c(r11, r3, r9, r0)
            boolean r3 = r9.l(r11)
            r4 = 4
            if (r1 != r4) goto L_0x0153
            r1 = r2
            goto L_0x0154
        L_0x0153:
            r1 = r0
        L_0x0154:
            r1 = r1 | r3
            boolean r3 = r9.W(r15)
            r1 = r1 | r3
            boolean r3 = r9.W(r14)
            r1 = r1 | r3
            java.lang.Object r3 = r9.g()
            if (r1 != 0) goto L_0x016b
            java.lang.Object r1 = r12.a()
            if (r3 != r1) goto L_0x0173
        L_0x016b:
            androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$2$1 r3 = new androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$2$1
            r3.<init>(r11, r8, r15, r14)
            r9.N(r3)
        L_0x0173:
            kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3
            androidx.compose.runtime.EffectsKt.h(r3, r9, r0)
            boolean r1 = r9.l(r11)
            r3 = r16 & 112(0x70, float:1.57E-43)
            r4 = 32
            if (r3 != r4) goto L_0x0183
            goto L_0x0184
        L_0x0183:
            r2 = r0
        L_0x0184:
            r1 = r1 | r2
            java.lang.Object r2 = r9.g()
            if (r1 != 0) goto L_0x0191
            java.lang.Object r1 = r12.a()
            if (r2 != r1) goto L_0x0199
        L_0x0191:
            androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$3$1 r2 = new androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$3$1
            r2.<init>(r11, r7)
            r9.N(r2)
        L_0x0199:
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            int r1 = r16 >> 3
            r1 = r1 & 14
            androidx.compose.runtime.EffectsKt.c(r7, r2, r9, r1)
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.f15489d
            boolean r2 = r9.l(r11)
            java.lang.Object r3 = r9.g()
            if (r2 != 0) goto L_0x01b4
            java.lang.Object r2 = r12.a()
            if (r3 != r2) goto L_0x01bc
        L_0x01b4:
            androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$5$1 r3 = new androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$5$1
            r3.<init>(r11)
            r9.N(r3)
        L_0x01bc:
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.layout.OnGloballyPositionedModifierKt.a(r1, r3)
            boolean r2 = r9.l(r11)
            boolean r3 = r9.W(r14)
            r2 = r2 | r3
            java.lang.Object r3 = r9.g()
            if (r2 != 0) goto L_0x01d7
            java.lang.Object r2 = r12.a()
            if (r3 != r2) goto L_0x01df
        L_0x01d7:
            androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$6$1 r3 = new androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$6$1
            r3.<init>(r11, r14)
            r9.N(r3)
        L_0x01df:
            androidx.compose.ui.layout.MeasurePolicy r3 = (androidx.compose.ui.layout.MeasurePolicy) r3
            int r0 = androidx.compose.runtime.ComposablesKt.a(r9, r0)
            androidx.compose.runtime.CompositionLocalMap r2 = r9.I()
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.ComposedModifierKt.e(r9, r1)
            androidx.compose.ui.node.ComposeUiNode$Companion r4 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r5 = r4.a()
            androidx.compose.runtime.Applier r6 = r9.v()
            if (r6 != 0) goto L_0x01fc
            androidx.compose.runtime.ComposablesKt.d()
        L_0x01fc:
            r9.s()
            boolean r6 = r9.n()
            if (r6 == 0) goto L_0x0209
            r9.y(r5)
            goto L_0x020c
        L_0x0209:
            r9.K()
        L_0x020c:
            androidx.compose.runtime.Composer r5 = androidx.compose.runtime.Updater.b(r9)
            kotlin.jvm.functions.Function2 r6 = r4.c()
            androidx.compose.runtime.Updater.g(r5, r3, r6)
            kotlin.jvm.functions.Function2 r3 = r4.e()
            androidx.compose.runtime.Updater.g(r5, r2, r3)
            kotlin.jvm.functions.Function2 r2 = r4.b()
            boolean r3 = r5.n()
            if (r3 != 0) goto L_0x0236
            java.lang.Object r3 = r5.g()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            boolean r3 = kotlin.jvm.internal.Intrinsics.d(r3, r6)
            if (r3 != 0) goto L_0x0244
        L_0x0236:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r5.N(r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A(r0, r2)
        L_0x0244:
            kotlin.jvm.functions.Function2 r0 = r4.d()
            androidx.compose.runtime.Updater.g(r5, r1, r0)
            r9.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0257
            androidx.compose.runtime.ComposerKt.X()
        L_0x0257:
            r1 = r8
            goto L_0x025e
        L_0x0259:
            r9 = r6
            r9.B()
            r1 = r2
        L_0x025e:
            androidx.compose.runtime.ScopeUpdateScope r6 = r9.x()
            if (r6 == 0) goto L_0x0275
            androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$7 r8 = new androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$7
            r0 = r8
            r2 = r24
            r3 = r25
            r4 = r27
            r5 = r28
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r8)
        L_0x0275:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt.a(kotlin.jvm.functions.Function0, androidx.compose.ui.window.PopupPositionProvider, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Function2 b(State state) {
        return (Function2) state.getValue();
    }
}
