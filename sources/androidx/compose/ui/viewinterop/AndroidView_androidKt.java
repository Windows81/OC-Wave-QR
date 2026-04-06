package androidx.compose.ui.viewinterop;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class AndroidView_androidKt {

    /* renamed from: a  reason: collision with root package name */
    public static final Function1 f19227a = AndroidView_androidKt$NoOpUpdate$1.f19239z;

    public static final void a(Function1 function1, Modifier modifier, Function1 function12, Composer composer, int i2, int i3) {
        int i4;
        Composer q2 = composer.q(-1783766393);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (q2.l(function1) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= q2.W(modifier) ? 32 : 16;
        }
        int i6 = i3 & 4;
        if (i6 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= q2.l(function12) ? 256 : 128;
        }
        if (q2.E((i4 & 147) != 146, i4 & 1)) {
            if (i5 != 0) {
                modifier = Modifier.f15489d;
            }
            if (i6 != 0) {
                function12 = f19227a;
            }
            if (ComposerKt.P()) {
                ComposerKt.Y(-1783766393, i4, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:104)");
            }
            b(function1, modifier, (Function1) null, f19227a, function12, q2, (i4 & 14) | 3072 | (i4 & 112) | ((i4 << 6) & 57344), 4);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        Modifier modifier2 = modifier;
        Function1 function13 = function12;
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new AndroidView_androidKt$AndroidView$1(function1, modifier2, function13, i2, i3));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(kotlin.jvm.functions.Function1 r24, androidx.compose.ui.Modifier r25, kotlin.jvm.functions.Function1 r26, kotlin.jvm.functions.Function1 r27, kotlin.jvm.functions.Function1 r28, androidx.compose.runtime.Composer r29, int r30, int r31) {
        /*
            r1 = r24
            r6 = r30
            r0 = -180024211(0xfffffffff5450c6d, float:-2.497887E32)
            r2 = r29
            androidx.compose.runtime.Composer r2 = r2.q(r0)
            r3 = r31 & 1
            if (r3 == 0) goto L_0x0014
            r3 = r6 | 6
            goto L_0x0024
        L_0x0014:
            r3 = r6 & 6
            if (r3 != 0) goto L_0x0023
            boolean r3 = r2.l(r1)
            if (r3 == 0) goto L_0x0020
            r3 = 4
            goto L_0x0021
        L_0x0020:
            r3 = 2
        L_0x0021:
            r3 = r3 | r6
            goto L_0x0024
        L_0x0023:
            r3 = r6
        L_0x0024:
            r4 = r31 & 2
            if (r4 == 0) goto L_0x002d
            r3 = r3 | 48
        L_0x002a:
            r5 = r25
            goto L_0x003f
        L_0x002d:
            r5 = r6 & 48
            if (r5 != 0) goto L_0x002a
            r5 = r25
            boolean r7 = r2.W(r5)
            if (r7 == 0) goto L_0x003c
            r7 = 32
            goto L_0x003e
        L_0x003c:
            r7 = 16
        L_0x003e:
            r3 = r3 | r7
        L_0x003f:
            r7 = r31 & 4
            if (r7 == 0) goto L_0x0048
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x0045:
            r8 = r26
            goto L_0x005a
        L_0x0048:
            r8 = r6 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x0045
            r8 = r26
            boolean r9 = r2.l(r8)
            if (r9 == 0) goto L_0x0057
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0059
        L_0x0057:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0059:
            r3 = r3 | r9
        L_0x005a:
            r9 = r31 & 8
            if (r9 == 0) goto L_0x0063
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0060:
            r10 = r27
            goto L_0x0075
        L_0x0063:
            r10 = r6 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x0060
            r10 = r27
            boolean r11 = r2.l(r10)
            if (r11 == 0) goto L_0x0072
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0074
        L_0x0072:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0074:
            r3 = r3 | r11
        L_0x0075:
            r11 = r31 & 16
            if (r11 == 0) goto L_0x007e
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x007b:
            r12 = r28
            goto L_0x0090
        L_0x007e:
            r12 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x007b
            r12 = r28
            boolean r13 = r2.l(r12)
            if (r13 == 0) goto L_0x008d
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x008f
        L_0x008d:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x008f:
            r3 = r3 | r13
        L_0x0090:
            r13 = r3 & 9363(0x2493, float:1.312E-41)
            r14 = 9362(0x2492, float:1.3119E-41)
            r15 = 0
            if (r13 == r14) goto L_0x0099
            r13 = 1
            goto L_0x009a
        L_0x0099:
            r13 = r15
        L_0x009a:
            r14 = r3 & 1
            boolean r13 = r2.E(r13, r14)
            if (r13 == 0) goto L_0x0196
            if (r4 == 0) goto L_0x00a7
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.f15489d
            goto L_0x00a8
        L_0x00a7:
            r4 = r5
        L_0x00a8:
            if (r7 == 0) goto L_0x00ac
            r5 = 0
            r8 = r5
        L_0x00ac:
            if (r9 == 0) goto L_0x00b1
            kotlin.jvm.functions.Function1 r5 = f19227a
            r10 = r5
        L_0x00b1:
            if (r11 == 0) goto L_0x00b6
            kotlin.jvm.functions.Function1 r5 = f19227a
            r12 = r5
        L_0x00b6:
            boolean r5 = androidx.compose.runtime.ComposerKt.P()
            if (r5 == 0) goto L_0x00c2
            r5 = -1
            java.lang.String r7 = "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:199)"
            androidx.compose.runtime.ComposerKt.Y(r0, r3, r5, r7)
        L_0x00c2:
            int r18 = androidx.compose.runtime.ComposablesKt.a(r2, r15)
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.viewinterop.FocusGroupNode_androidKt.e(r4)
            androidx.compose.ui.Modifier r17 = androidx.compose.ui.ComposedModifierKt.e(r2, r0)
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.g()
            java.lang.Object r0 = r2.C(r0)
            r19 = r0
            androidx.compose.ui.unit.Density r19 = (androidx.compose.ui.unit.Density) r19
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.m()
            java.lang.Object r0 = r2.C(r0)
            r22 = r0
            androidx.compose.ui.unit.LayoutDirection r22 = (androidx.compose.ui.unit.LayoutDirection) r22
            androidx.compose.runtime.CompositionLocalMap r23 = r2.I()
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.lifecycle.compose.LocalLifecycleOwnerKt.c()
            java.lang.Object r0 = r2.C(r0)
            r20 = r0
            androidx.lifecycle.LifecycleOwner r20 = (androidx.lifecycle.LifecycleOwner) r20
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner()
            java.lang.Object r0 = r2.C(r0)
            r21 = r0
            androidx.savedstate.SavedStateRegistryOwner r21 = (androidx.savedstate.SavedStateRegistryOwner) r21
            if (r8 == 0) goto L_0x014a
            r0 = 607780130(0x2439fd22, float:4.0329892E-17)
            r2.X(r0)
            r0 = r3 & 14
            kotlin.jvm.functions.Function0 r0 = d(r1, r2, r0)
            androidx.compose.runtime.Applier r3 = r2.v()
            boolean r3 = r3 instanceof androidx.compose.ui.node.UiApplier
            if (r3 != 0) goto L_0x011b
            androidx.compose.runtime.ComposablesKt.d()
        L_0x011b:
            r2.s()
            boolean r3 = r2.n()
            if (r3 == 0) goto L_0x0128
            r2.y(r0)
            goto L_0x012b
        L_0x0128:
            r2.K()
        L_0x012b:
            androidx.compose.runtime.Composer r0 = androidx.compose.runtime.Updater.b(r2)
            r16 = r0
            g(r16, r17, r18, r19, r20, r21, r22, r23)
            androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1 r3 = androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$1.f19231z
            androidx.compose.runtime.Updater.g(r0, r8, r3)
            androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2 r3 = androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$2.f19232z
            androidx.compose.runtime.Updater.g(r0, r12, r3)
            androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3 r3 = androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$2$3.f19233z
            androidx.compose.runtime.Updater.g(r0, r10, r3)
            r2.T()
            r2.M()
            goto L_0x018a
        L_0x014a:
            r0 = 608635513(0x24470a79, float:4.3160117E-17)
            r2.X(r0)
            r0 = r3 & 14
            kotlin.jvm.functions.Function0 r0 = d(r1, r2, r0)
            androidx.compose.runtime.Applier r3 = r2.v()
            boolean r3 = r3 instanceof androidx.compose.ui.node.UiApplier
            if (r3 != 0) goto L_0x0161
            androidx.compose.runtime.ComposablesKt.d()
        L_0x0161:
            r2.z()
            boolean r3 = r2.n()
            if (r3 == 0) goto L_0x016e
            r2.y(r0)
            goto L_0x0171
        L_0x016e:
            r2.K()
        L_0x0171:
            androidx.compose.runtime.Composer r0 = androidx.compose.runtime.Updater.b(r2)
            r16 = r0
            g(r16, r17, r18, r19, r20, r21, r22, r23)
            androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1 r3 = androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$1.f19234z
            androidx.compose.runtime.Updater.g(r0, r12, r3)
            androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2 r3 = androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$2.f19235z
            androidx.compose.runtime.Updater.g(r0, r10, r3)
            r2.T()
            r2.M()
        L_0x018a:
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0193
            androidx.compose.runtime.ComposerKt.X()
        L_0x0193:
            r3 = r8
            r5 = r12
            goto L_0x019b
        L_0x0196:
            r2.B()
            r4 = r5
            goto L_0x0193
        L_0x019b:
            androidx.compose.runtime.ScopeUpdateScope r8 = r2.x()
            if (r8 == 0) goto L_0x01b2
            androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$4 r9 = new androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$4
            r0 = r9
            r1 = r24
            r2 = r4
            r4 = r10
            r6 = r30
            r7 = r31
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x01b2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.viewinterop.AndroidView_androidKt.b(kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: androidx.compose.ui.viewinterop.AndroidView_androidKt$createAndroidViewNodeFactory$1$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: androidx.compose.ui.viewinterop.AndroidView_androidKt$createAndroidViewNodeFactory$1$1} */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0071, code lost:
        if (r0 == androidx.compose.runtime.Composer.f14567a.a()) goto L_0x0073;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlin.jvm.functions.Function0 d(kotlin.jvm.functions.Function1 r9, androidx.compose.runtime.Composer r10, int r11) {
        /*
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x000f
            r0 = -1
            java.lang.String r1 = "androidx.compose.ui.viewinterop.createAndroidViewNodeFactory (AndroidView.android.kt:252)"
            r2 = 2030558801(0x7907de51, float:4.4091824E34)
            androidx.compose.runtime.ComposerKt.Y(r2, r11, r0, r1)
        L_0x000f:
            r0 = 0
            int r6 = androidx.compose.runtime.ComposablesKt.a(r10, r0)
            androidx.compose.runtime.ProvidableCompositionLocal r1 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r1 = r10.C(r1)
            r2 = r1
            android.content.Context r2 = (android.content.Context) r2
            androidx.compose.runtime.CompositionContext r4 = androidx.compose.runtime.ComposablesKt.e(r10, r0)
            androidx.compose.runtime.ProvidableCompositionLocal r1 = androidx.compose.runtime.saveable.SaveableStateRegistryKt.g()
            java.lang.Object r1 = r10.C(r1)
            r5 = r1
            androidx.compose.runtime.saveable.SaveableStateRegistry r5 = (androidx.compose.runtime.saveable.SaveableStateRegistry) r5
            androidx.compose.runtime.ProvidableCompositionLocal r1 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.j()
            java.lang.Object r1 = r10.C(r1)
            r7 = r1
            android.view.View r7 = (android.view.View) r7
            boolean r1 = r10.l(r2)
            r3 = r11 & 14
            r3 = r3 ^ 6
            r8 = 4
            if (r3 <= r8) goto L_0x004a
            boolean r3 = r10.W(r9)
            if (r3 != 0) goto L_0x004e
        L_0x004a:
            r11 = r11 & 6
            if (r11 != r8) goto L_0x004f
        L_0x004e:
            r0 = 1
        L_0x004f:
            r11 = r1 | r0
            boolean r0 = r10.l(r4)
            r11 = r11 | r0
            boolean r0 = r10.l(r5)
            r11 = r11 | r0
            boolean r0 = r10.i(r6)
            r11 = r11 | r0
            boolean r0 = r10.l(r7)
            r11 = r11 | r0
            java.lang.Object r0 = r10.g()
            if (r11 != 0) goto L_0x0073
            androidx.compose.runtime.Composer$Companion r11 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r11 = r11.a()
            if (r0 != r11) goto L_0x007d
        L_0x0073:
            androidx.compose.ui.viewinterop.AndroidView_androidKt$createAndroidViewNodeFactory$1$1 r0 = new androidx.compose.ui.viewinterop.AndroidView_androidKt$createAndroidViewNodeFactory$1$1
            r1 = r0
            r3 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r10.N(r0)
        L_0x007d:
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r9 = androidx.compose.runtime.ComposerKt.P()
            if (r9 == 0) goto L_0x0088
            androidx.compose.runtime.ComposerKt.X()
        L_0x0088:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.viewinterop.AndroidView_androidKt.d(kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):kotlin.jvm.functions.Function0");
    }

    public static final Function1 e() {
        return f19227a;
    }

    public static final ViewFactoryHolder f(LayoutNode layoutNode) {
        AndroidViewHolder Y = layoutNode.Y();
        if (Y != null) {
            return (ViewFactoryHolder) Y;
        }
        InlineClassHelperKt.d("Required value was null.");
        throw new KotlinNothingValueException();
    }

    public static final void g(Composer composer, Modifier modifier, int i2, Density density, LifecycleOwner lifecycleOwner, SavedStateRegistryOwner savedStateRegistryOwner, LayoutDirection layoutDirection, CompositionLocalMap compositionLocalMap) {
        ComposeUiNode.Companion companion = ComposeUiNode.f17222h;
        Updater.g(composer, compositionLocalMap, companion.e());
        Updater.g(composer, modifier, AndroidView_androidKt$updateViewHolderParams$1.f19243z);
        Updater.g(composer, density, AndroidView_androidKt$updateViewHolderParams$2.f19244z);
        Updater.g(composer, lifecycleOwner, AndroidView_androidKt$updateViewHolderParams$3.f19245z);
        Updater.g(composer, savedStateRegistryOwner, AndroidView_androidKt$updateViewHolderParams$4.f19246z);
        Updater.g(composer, layoutDirection, AndroidView_androidKt$updateViewHolderParams$5.f19247z);
        Function2 b2 = companion.b();
        if (composer.n() || !Intrinsics.d(composer.g(), Integer.valueOf(i2))) {
            composer.N(Integer.valueOf(i2));
            composer.A(Integer.valueOf(i2), b2);
        }
    }
}
