package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.State;
import androidx.compose.ui.unit.IntRect;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata
public final class AndroidPopup_androidKt {

    /* renamed from: a  reason: collision with root package name */
    public static final ProvidableCompositionLocal f19277a = CompositionLocalKt.h((SnapshotMutationPolicy) null, AndroidPopup_androidKt$LocalPopupTestTag$1.f19279z, 1, (Object) null);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v22, resolved type: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v5, resolved type: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v43, resolved type: androidx.compose.ui.window.PopupLayout} */
    /* JADX WARNING: type inference failed for: r9v3 */
    /* JADX WARNING: type inference failed for: r5v9 */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x018f, code lost:
        if (r9 == r25.a()) goto L_0x0191;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01cf, code lost:
        if (r5 == r25.a()) goto L_0x01d1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x02e9  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x02f4  */
    /* JADX WARNING: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0089  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(androidx.compose.ui.window.PopupPositionProvider r35, kotlin.jvm.functions.Function0 r36, androidx.compose.ui.window.PopupProperties r37, kotlin.jvm.functions.Function2 r38, androidx.compose.runtime.Composer r39, int r40, int r41) {
        /*
            r11 = r35
            r12 = r38
            r13 = r40
            r0 = -830247068(0xffffffffce836f64, float:-1.1025577E9)
            r1 = r39
            androidx.compose.runtime.Composer r14 = r1.q(r0)
            r1 = r41 & 1
            if (r1 == 0) goto L_0x0016
            r1 = r13 | 6
            goto L_0x0026
        L_0x0016:
            r1 = r13 & 6
            if (r1 != 0) goto L_0x0025
            boolean r1 = r14.W(r11)
            if (r1 == 0) goto L_0x0022
            r1 = 4
            goto L_0x0023
        L_0x0022:
            r1 = 2
        L_0x0023:
            r1 = r1 | r13
            goto L_0x0026
        L_0x0025:
            r1 = r13
        L_0x0026:
            r2 = r41 & 2
            r10 = 32
            if (r2 == 0) goto L_0x0031
            r1 = r1 | 48
        L_0x002e:
            r3 = r36
            goto L_0x0042
        L_0x0031:
            r3 = r13 & 48
            if (r3 != 0) goto L_0x002e
            r3 = r36
            boolean r4 = r14.l(r3)
            if (r4 == 0) goto L_0x003f
            r4 = r10
            goto L_0x0041
        L_0x003f:
            r4 = 16
        L_0x0041:
            r1 = r1 | r4
        L_0x0042:
            r4 = r41 & 4
            r9 = 256(0x100, float:3.59E-43)
            if (r4 == 0) goto L_0x004d
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x004a:
            r5 = r37
            goto L_0x005e
        L_0x004d:
            r5 = r13 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x004a
            r5 = r37
            boolean r6 = r14.W(r5)
            if (r6 == 0) goto L_0x005b
            r6 = r9
            goto L_0x005d
        L_0x005b:
            r6 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r1 = r1 | r6
        L_0x005e:
            r6 = r41 & 8
            if (r6 == 0) goto L_0x0066
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x0064:
            r8 = r1
            goto L_0x0077
        L_0x0066:
            r6 = r13 & 3072(0xc00, float:4.305E-42)
            if (r6 != 0) goto L_0x0064
            boolean r6 = r14.l(r12)
            if (r6 == 0) goto L_0x0073
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x0075
        L_0x0073:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x0075:
            r1 = r1 | r6
            goto L_0x0064
        L_0x0077:
            r1 = r8 & 1171(0x493, float:1.641E-42)
            r6 = 1170(0x492, float:1.64E-42)
            r7 = 0
            if (r1 == r6) goto L_0x0080
            r1 = 1
            goto L_0x0081
        L_0x0080:
            r1 = r7
        L_0x0081:
            r6 = r8 & 1
            boolean r1 = r14.E(r1, r6)
            if (r1 == 0) goto L_0x02e9
            r6 = 0
            if (r2 == 0) goto L_0x008f
            r22 = r6
            goto L_0x0091
        L_0x008f:
            r22 = r3
        L_0x0091:
            if (r4 == 0) goto L_0x00a7
            androidx.compose.ui.window.PopupProperties r1 = new androidx.compose.ui.window.PopupProperties
            r28 = 15
            r29 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r23 = r1
            r23.<init>((boolean) r24, (boolean) r25, (boolean) r26, (boolean) r27, (int) r28, (kotlin.jvm.internal.DefaultConstructorMarker) r29)
            goto L_0x00a9
        L_0x00a7:
            r23 = r5
        L_0x00a9:
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x00b5
            r1 = -1
            java.lang.String r2 = "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:297)"
            androidx.compose.runtime.ComposerKt.Y(r0, r8, r1, r2)
        L_0x00b5:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.j()
            java.lang.Object r0 = r14.C(r0)
            r16 = r0
            android.view.View r16 = (android.view.View) r16
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.g()
            java.lang.Object r0 = r14.C(r0)
            r17 = r0
            androidx.compose.ui.unit.Density r17 = (androidx.compose.ui.unit.Density) r17
            androidx.compose.runtime.ProvidableCompositionLocal r0 = f19277a
            java.lang.Object r0 = r14.C(r0)
            r20 = r0
            java.lang.String r20 = (java.lang.String) r20
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.m()
            java.lang.Object r0 = r14.C(r0)
            androidx.compose.ui.unit.LayoutDirection r0 = (androidx.compose.ui.unit.LayoutDirection) r0
            androidx.compose.runtime.CompositionContext r5 = androidx.compose.runtime.ComposablesKt.e(r14, r7)
            int r1 = r8 >> 9
            r1 = r1 & 14
            androidx.compose.runtime.State r4 = androidx.compose.runtime.SnapshotStateKt.p(r12, r14, r1)
            java.lang.Object[] r1 = new java.lang.Object[r7]
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupId$1 r18 = androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupId$1.f19299z
            r19 = 3072(0xc00, float:4.305E-42)
            r21 = 6
            r2 = 0
            r3 = 0
            r15 = r4
            r4 = r18
            r30 = r5
            r5 = r14
            r6 = r19
            r7 = r21
            java.lang.Object r1 = androidx.compose.runtime.saveable.RememberSaveableKt.h(r1, r2, r3, r4, r5, r6, r7)
            r7 = r1
            java.util.UUID r7 = (java.util.UUID) r7
            java.lang.Object r1 = r14.g()
            androidx.compose.runtime.Composer$Companion r25 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r25.a()
            if (r1 != r2) goto L_0x0155
            androidx.compose.ui.window.PopupLayout r6 = new androidx.compose.ui.window.PopupLayout
            r18 = 128(0x80, float:1.794E-43)
            r19 = 0
            r21 = 0
            r4 = r0
            r5 = r20
            r0 = r6
            r1 = r22
            r2 = r23
            r3 = r5
            r31 = r4
            r4 = r16
            r32 = r5
            r5 = r17
            r33 = r6
            r6 = r35
            r34 = r8
            r8 = r21
            r9 = r18
            r12 = r10
            r10 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1 r0 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$popupLayout$1$1$1
            r1 = r33
            r0.<init>(r1, r15)
            r2 = 1302892335(0x4da88f2f, float:3.53494496E8)
            r3 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.c(r2, r3, r0)
            r2 = r30
            r1.r(r2, r0)
            r14.N(r1)
            goto L_0x015d
        L_0x0155:
            r31 = r0
            r34 = r8
            r12 = r10
            r32 = r20
            r3 = 1
        L_0x015d:
            androidx.compose.ui.window.PopupLayout r1 = (androidx.compose.ui.window.PopupLayout) r1
            boolean r0 = r14.l(r1)
            r2 = r34
            r4 = r2 & 112(0x70, float:1.57E-43)
            if (r4 != r12) goto L_0x016b
            r7 = r3
            goto L_0x016c
        L_0x016b:
            r7 = 0
        L_0x016c:
            r0 = r0 | r7
            r5 = r2 & 896(0x380, float:1.256E-42)
            r6 = 256(0x100, float:3.59E-43)
            if (r5 != r6) goto L_0x0175
            r7 = r3
            goto L_0x0176
        L_0x0175:
            r7 = 0
        L_0x0176:
            r0 = r0 | r7
            r7 = r32
            boolean r8 = r14.W(r7)
            r0 = r0 | r8
            r8 = r31
            boolean r9 = r14.W(r8)
            r0 = r0 | r9
            java.lang.Object r9 = r14.g()
            if (r0 != 0) goto L_0x0191
            java.lang.Object r0 = r25.a()
            if (r9 != r0) goto L_0x01a5
        L_0x0191:
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1 r9 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$2$1
            r16 = r9
            r17 = r1
            r18 = r22
            r19 = r23
            r20 = r7
            r21 = r8
            r16.<init>(r17, r18, r19, r20, r21)
            r14.N(r9)
        L_0x01a5:
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            r0 = 0
            androidx.compose.runtime.EffectsKt.c(r1, r9, r14, r0)
            boolean r9 = r14.l(r1)
            if (r4 != r12) goto L_0x01b3
            r4 = r3
            goto L_0x01b4
        L_0x01b3:
            r4 = r0
        L_0x01b4:
            r4 = r4 | r9
            if (r5 != r6) goto L_0x01b9
            r5 = r3
            goto L_0x01ba
        L_0x01b9:
            r5 = r0
        L_0x01ba:
            r4 = r4 | r5
            boolean r5 = r14.W(r7)
            r4 = r4 | r5
            boolean r5 = r14.W(r8)
            r4 = r4 | r5
            java.lang.Object r5 = r14.g()
            if (r4 != 0) goto L_0x01d1
            java.lang.Object r4 = r25.a()
            if (r5 != r4) goto L_0x01e5
        L_0x01d1:
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3$1 r5 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$3$1
            r16 = r5
            r17 = r1
            r18 = r22
            r19 = r23
            r20 = r7
            r21 = r8
            r16.<init>(r17, r18, r19, r20, r21)
            r14.N(r5)
        L_0x01e5:
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            androidx.compose.runtime.EffectsKt.h(r5, r14, r0)
            boolean r4 = r14.l(r1)
            r2 = r2 & 14
            r5 = 4
            if (r2 != r5) goto L_0x01f5
            r7 = r3
            goto L_0x01f6
        L_0x01f5:
            r7 = r0
        L_0x01f6:
            r3 = r4 | r7
            java.lang.Object r4 = r14.g()
            if (r3 != 0) goto L_0x0204
            java.lang.Object r3 = r25.a()
            if (r4 != r3) goto L_0x020c
        L_0x0204:
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4$1 r4 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$4$1
            r4.<init>(r1, r11)
            r14.N(r4)
        L_0x020c:
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            androidx.compose.runtime.EffectsKt.c(r11, r4, r14, r2)
            boolean r2 = r14.l(r1)
            java.lang.Object r3 = r14.g()
            if (r2 != 0) goto L_0x0221
            java.lang.Object r2 = r25.a()
            if (r3 != r2) goto L_0x022a
        L_0x0221:
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1 r3 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1
            r2 = 0
            r3.<init>(r1, r2)
            r14.N(r3)
        L_0x022a:
            kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
            androidx.compose.runtime.EffectsKt.g(r1, r3, r14, r0)
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            boolean r3 = r14.l(r1)
            java.lang.Object r4 = r14.g()
            if (r3 != 0) goto L_0x0241
            java.lang.Object r3 = r25.a()
            if (r4 != r3) goto L_0x0249
        L_0x0241:
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7$1 r4 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$7$1
            r4.<init>(r1)
            r14.N(r4)
        L_0x0249:
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            androidx.compose.ui.Modifier r2 = androidx.compose.ui.layout.OnGloballyPositionedModifierKt.a(r2, r4)
            boolean r3 = r14.l(r1)
            boolean r4 = r14.W(r8)
            r3 = r3 | r4
            java.lang.Object r4 = r14.g()
            if (r3 != 0) goto L_0x0264
            java.lang.Object r3 = r25.a()
            if (r4 != r3) goto L_0x026c
        L_0x0264:
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$1 r4 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$8$1
            r4.<init>(r1, r8)
            r14.N(r4)
        L_0x026c:
            androidx.compose.ui.layout.MeasurePolicy r4 = (androidx.compose.ui.layout.MeasurePolicy) r4
            int r0 = androidx.compose.runtime.ComposablesKt.a(r14, r0)
            androidx.compose.runtime.CompositionLocalMap r1 = r14.I()
            androidx.compose.ui.Modifier r2 = androidx.compose.ui.ComposedModifierKt.e(r14, r2)
            androidx.compose.ui.node.ComposeUiNode$Companion r3 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r5 = r3.a()
            androidx.compose.runtime.Applier r6 = r14.v()
            if (r6 != 0) goto L_0x0289
            androidx.compose.runtime.ComposablesKt.d()
        L_0x0289:
            r14.s()
            boolean r6 = r14.n()
            if (r6 == 0) goto L_0x0296
            r14.y(r5)
            goto L_0x0299
        L_0x0296:
            r14.K()
        L_0x0299:
            androidx.compose.runtime.Composer r5 = androidx.compose.runtime.Updater.b(r14)
            kotlin.jvm.functions.Function2 r6 = r3.c()
            androidx.compose.runtime.Updater.g(r5, r4, r6)
            kotlin.jvm.functions.Function2 r4 = r3.e()
            androidx.compose.runtime.Updater.g(r5, r1, r4)
            kotlin.jvm.functions.Function2 r1 = r3.b()
            boolean r4 = r5.n()
            if (r4 != 0) goto L_0x02c3
            java.lang.Object r4 = r5.g()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r4, r6)
            if (r4 != 0) goto L_0x02d1
        L_0x02c3:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r5.N(r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A(r0, r1)
        L_0x02d1:
            kotlin.jvm.functions.Function2 r0 = r3.d()
            androidx.compose.runtime.Updater.g(r5, r2, r0)
            r14.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x02e4
            androidx.compose.runtime.ComposerKt.X()
        L_0x02e4:
            r2 = r22
            r3 = r23
            goto L_0x02ee
        L_0x02e9:
            r14.B()
            r2 = r3
            r3 = r5
        L_0x02ee:
            androidx.compose.runtime.ScopeUpdateScope r7 = r14.x()
            if (r7 == 0) goto L_0x0305
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$9 r8 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$9
            r0 = r8
            r1 = r35
            r4 = r38
            r5 = r40
            r6 = r41
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x0305:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.AndroidPopup_androidKt.a(androidx.compose.ui.window.PopupPositionProvider, kotlin.jvm.functions.Function0, androidx.compose.ui.window.PopupProperties, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Function2 b(State state) {
        return (Function2) state.getValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: androidx.compose.ui.window.AlignmentOffsetPositionProvider} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(androidx.compose.ui.Alignment r25, long r26, kotlin.jvm.functions.Function0 r28, androidx.compose.ui.window.PopupProperties r29, kotlin.jvm.functions.Function2 r30, androidx.compose.runtime.Composer r31, int r32, int r33) {
        /*
            r7 = r32
            r0 = 295309329(0x119a1011, float:2.4306818E-28)
            r1 = r31
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r33 & 1
            if (r2 == 0) goto L_0x0015
            r4 = r7 | 6
            r5 = r4
            r4 = r25
            goto L_0x0029
        L_0x0015:
            r4 = r7 & 6
            if (r4 != 0) goto L_0x0026
            r4 = r25
            boolean r5 = r1.W(r4)
            if (r5 == 0) goto L_0x0023
            r5 = 4
            goto L_0x0024
        L_0x0023:
            r5 = 2
        L_0x0024:
            r5 = r5 | r7
            goto L_0x0029
        L_0x0026:
            r4 = r25
            r5 = r7
        L_0x0029:
            r6 = r33 & 2
            if (r6 == 0) goto L_0x0032
            r5 = r5 | 48
        L_0x002f:
            r9 = r26
            goto L_0x0044
        L_0x0032:
            r9 = r7 & 48
            if (r9 != 0) goto L_0x002f
            r9 = r26
            boolean r11 = r1.j(r9)
            if (r11 == 0) goto L_0x0041
            r11 = 32
            goto L_0x0043
        L_0x0041:
            r11 = 16
        L_0x0043:
            r5 = r5 | r11
        L_0x0044:
            r11 = r33 & 4
            if (r11 == 0) goto L_0x004d
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x004a:
            r12 = r28
            goto L_0x005f
        L_0x004d:
            r12 = r7 & 384(0x180, float:5.38E-43)
            if (r12 != 0) goto L_0x004a
            r12 = r28
            boolean r13 = r1.l(r12)
            if (r13 == 0) goto L_0x005c
            r13 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r13 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r5 = r5 | r13
        L_0x005f:
            r13 = r33 & 8
            if (r13 == 0) goto L_0x0068
            r5 = r5 | 3072(0xc00, float:4.305E-42)
        L_0x0065:
            r14 = r29
            goto L_0x007a
        L_0x0068:
            r14 = r7 & 3072(0xc00, float:4.305E-42)
            if (r14 != 0) goto L_0x0065
            r14 = r29
            boolean r15 = r1.W(r14)
            if (r15 == 0) goto L_0x0077
            r15 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r15 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r5 = r5 | r15
        L_0x007a:
            r15 = r33 & 16
            if (r15 == 0) goto L_0x0083
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
        L_0x0080:
            r15 = r30
            goto L_0x0096
        L_0x0083:
            r15 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r15 != 0) goto L_0x0080
            r15 = r30
            boolean r16 = r1.l(r15)
            if (r16 == 0) goto L_0x0092
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0094
        L_0x0092:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x0094:
            r5 = r5 | r16
        L_0x0096:
            r3 = r5 & 9363(0x2493, float:1.312E-41)
            r0 = 9362(0x2492, float:1.3119E-41)
            r8 = 0
            r17 = 1
            if (r3 == r0) goto L_0x00a2
            r0 = r17
            goto L_0x00a3
        L_0x00a2:
            r0 = r8
        L_0x00a3:
            r3 = r5 & 1
            boolean r0 = r1.E(r0, r3)
            if (r0 == 0) goto L_0x013e
            if (r2 == 0) goto L_0x00b4
            androidx.compose.ui.Alignment$Companion r0 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r0 = r0.o()
            goto L_0x00b5
        L_0x00b4:
            r0 = r4
        L_0x00b5:
            if (r6 == 0) goto L_0x00c9
            long r2 = (long) r8
            r4 = 32
            long r9 = r2 << r4
            r18 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r18
            long r2 = r2 | r9
            long r2 = androidx.compose.ui.unit.IntOffset.f(r2)
            goto L_0x00ca
        L_0x00c9:
            r2 = r9
        L_0x00ca:
            r4 = 0
            if (r11 == 0) goto L_0x00cf
            r6 = r4
            goto L_0x00d0
        L_0x00cf:
            r6 = r12
        L_0x00d0:
            if (r13 == 0) goto L_0x00e6
            androidx.compose.ui.window.PopupProperties r9 = new androidx.compose.ui.window.PopupProperties
            r23 = 15
            r24 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r18 = r9
            r18.<init>((boolean) r19, (boolean) r20, (boolean) r21, (boolean) r22, (int) r23, (kotlin.jvm.internal.DefaultConstructorMarker) r24)
            goto L_0x00e8
        L_0x00e6:
            r18 = r14
        L_0x00e8:
            boolean r9 = androidx.compose.runtime.ComposerKt.P()
            if (r9 == 0) goto L_0x00f7
            r9 = -1
            java.lang.String r10 = "androidx.compose.ui.window.Popup (AndroidPopup.android.kt:268)"
            r11 = 295309329(0x119a1011, float:2.4306818E-28)
            androidx.compose.runtime.ComposerKt.Y(r11, r5, r9, r10)
        L_0x00f7:
            r9 = r5 & 14
            r10 = 4
            if (r9 != r10) goto L_0x00ff
            r9 = r17
            goto L_0x0100
        L_0x00ff:
            r9 = r8
        L_0x0100:
            r10 = r5 & 112(0x70, float:1.57E-43)
            r11 = 32
            if (r10 != r11) goto L_0x0108
            r8 = r17
        L_0x0108:
            r8 = r8 | r9
            java.lang.Object r9 = r1.g()
            if (r8 != 0) goto L_0x0117
            androidx.compose.runtime.Composer$Companion r8 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r8 = r8.a()
            if (r9 != r8) goto L_0x011f
        L_0x0117:
            androidx.compose.ui.window.AlignmentOffsetPositionProvider r9 = new androidx.compose.ui.window.AlignmentOffsetPositionProvider
            r9.<init>(r0, r2, r4)
            r1.N(r9)
        L_0x011f:
            r8 = r9
            androidx.compose.ui.window.AlignmentOffsetPositionProvider r8 = (androidx.compose.ui.window.AlignmentOffsetPositionProvider) r8
            int r4 = r5 >> 3
            r13 = r4 & 8176(0x1ff0, float:1.1457E-41)
            r14 = 0
            r9 = r6
            r10 = r18
            r11 = r30
            r12 = r1
            a(r8, r9, r10, r11, r12, r13, r14)
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            if (r4 == 0) goto L_0x0139
            androidx.compose.runtime.ComposerKt.X()
        L_0x0139:
            r4 = r0
            r12 = r6
            r5 = r18
            goto L_0x0143
        L_0x013e:
            r1.B()
            r2 = r9
            r5 = r14
        L_0x0143:
            androidx.compose.runtime.ScopeUpdateScope r9 = r1.x()
            if (r9 == 0) goto L_0x015a
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$1 r10 = new androidx.compose.ui.window.AndroidPopup_androidKt$Popup$1
            r0 = r10
            r1 = r4
            r4 = r12
            r6 = r30
            r7 = r32
            r8 = r33
            r0.<init>(r1, r2, r4, r5, r6, r7, r8)
            r9.a(r10)
        L_0x015a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.AndroidPopup_androidKt.c(androidx.compose.ui.Alignment, long, kotlin.jvm.functions.Function0, androidx.compose.ui.window.PopupProperties, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void d(String str, Function2 function2, Composer composer, int i2) {
        int i3;
        Composer q2 = composer.q(-498879600);
        if ((i2 & 6) == 0) {
            i3 = (q2.W(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= q2.l(function2) ? 32 : 16;
        }
        if (q2.E((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-498879600, i3, -1, "androidx.compose.ui.window.PopupTestTag (AndroidPopup.android.kt:422)");
            }
            CompositionLocalKt.c(f19277a.d(str), function2, q2, (i3 & 112) | ProvidedValue.f14769i);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new AndroidPopup_androidKt$PopupTestTag$1(str, function2, i2));
        }
    }

    public static final int i(boolean z2, SecureFlagPolicy secureFlagPolicy, boolean z3) {
        int i2 = !z2 ? 262152 : 262144;
        if (secureFlagPolicy == SecureFlagPolicy.SecureOn) {
            i2 |= 8192;
        }
        return !z3 ? i2 | 512 : i2;
    }

    public static final int j(PopupProperties popupProperties, boolean z2) {
        return (!popupProperties.e() || !z2) ? (!popupProperties.e() || z2) ? popupProperties.d() : popupProperties.d() & -8193 : popupProperties.d() | 8192;
    }

    public static final boolean k(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }

    public static final IntRect l(Rect rect) {
        return new IntRect(rect.left, rect.top, rect.right, rect.bottom);
    }
}
