package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SheetDefaultsKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f10996a = Dp.m((float) 22);

    /* renamed from: b  reason: collision with root package name */
    public static final AnimationSpec f10997b = AnimationSpecKt.n(300, 0, EasingKt.d(), 2, (Object) null);

    public static final NestedScrollConnection f(SheetState sheetState, Orientation orientation, Function1 function1) {
        return new SheetDefaultsKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1(sheetState, function1, orientation);
    }

    public static final void g(ColumnScope columnScope, Function2 function2, Composer composer, int i2) {
        int i3;
        ColumnScope columnScope2 = columnScope;
        Function2 function22 = function2;
        int i4 = i2;
        Composer q2 = composer.q(1033612924);
        if ((i4 & 6) == 0) {
            i3 = (q2.W(columnScope2) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        if ((i4 & 48) == 0) {
            i3 |= q2.l(function22) ? 32 : 16;
        }
        int i5 = i3;
        if (q2.E((i5 & 19) != 18, i5 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1033612924, i5, -1, "androidx.compose.material3.DragHandleWithTooltip (SheetDefaults.kt:432)");
            }
            Strings.Companion companion = Strings.f12320b;
            String b2 = Strings_androidKt.b(Strings.a(R.string.f10656c), q2, 0);
            Modifier.Companion companion2 = Modifier.f15489d;
            Alignment.Companion companion3 = Alignment.f15444a;
            Modifier b3 = columnScope2.b(companion2, companion3.g());
            MeasurePolicy g2 = BoxKt.g(companion3.o(), false);
            int a2 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I = q2.I();
            Modifier e2 = ComposedModifierKt.e(q2, b3);
            ComposeUiNode.Companion companion4 = ComposeUiNode.f17222h;
            Function0 a3 = companion4.a();
            if (q2.v() == null) {
                ComposablesKt.d();
            }
            q2.s();
            if (q2.n()) {
                q2.y(a3);
            } else {
                q2.K();
            }
            Composer b4 = Updater.b(q2);
            Updater.g(b4, g2, companion4.c());
            Updater.g(b4, I, companion4.e());
            Function2 b5 = companion4.b();
            if (b4.n() || !Intrinsics.d(b4.g(), Integer.valueOf(a2))) {
                b4.N(Integer.valueOf(a2));
                b4.A(Integer.valueOf(a2), b5);
            }
            Updater.g(b4, e2, companion4.d());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3797a;
            Composer composer2 = q2;
            TooltipKt.j(TooltipDefaults.f11582a.e(TooltipAnchorPosition.f11568b.a(), 0.0f, composer2, 390, 2), ComposableLambdaKt.e(2059851063, true, new SheetDefaultsKt$DragHandleWithTooltip$1$1(b2), q2, 54), TooltipKt.z(false, false, (MutatorMutex) null, composer2, 0, 7), (Modifier) null, (Function0) null, false, false, false, function2, q2, ((i5 << 21) & 234881024) | 48, 248);
            q2.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new O5(columnScope2, function22, i4));
        }
    }

    public static final Unit h(ColumnScope columnScope, Function2 function2, int i2, Composer composer, int i3) {
        g(columnScope, function2, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: androidx.compose.material3.S5} */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0169, code lost:
        if (r4 == androidx.compose.runtime.Composer.f14567a.a()) goto L_0x016b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.material3.SheetState k(boolean r16, kotlin.jvm.functions.Function1 r17, androidx.compose.material3.SheetValue r18, boolean r19, float r20, float r21, androidx.compose.runtime.Composer r22, int r23, int r24) {
        /*
            r0 = r22
            r1 = r23
            r2 = r24 & 1
            r3 = 0
            if (r2 == 0) goto L_0x000b
            r5 = r3
            goto L_0x000d
        L_0x000b:
            r5 = r16
        L_0x000d:
            r2 = r24 & 2
            if (r2 == 0) goto L_0x0029
            java.lang.Object r2 = r22.g()
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r4 = r4.a()
            if (r2 != r4) goto L_0x0025
            androidx.compose.material3.P5 r2 = new androidx.compose.material3.P5
            r2.<init>()
            r0.N(r2)
        L_0x0025:
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r9 = r2
            goto L_0x002b
        L_0x0029:
            r9 = r17
        L_0x002b:
            r2 = r24 & 4
            if (r2 == 0) goto L_0x0033
            androidx.compose.material3.SheetValue r2 = androidx.compose.material3.SheetValue.Hidden
            r8 = r2
            goto L_0x0035
        L_0x0033:
            r8 = r18
        L_0x0035:
            r2 = r24 & 8
            if (r2 == 0) goto L_0x003b
            r10 = r3
            goto L_0x003d
        L_0x003b:
            r10 = r19
        L_0x003d:
            r2 = r24 & 16
            if (r2 == 0) goto L_0x0048
            androidx.compose.material3.BottomSheetDefaults r2 = androidx.compose.material3.BottomSheetDefaults.f9266a
            float r2 = r2.i()
            goto L_0x004a
        L_0x0048:
            r2 = r20
        L_0x004a:
            r4 = 32
            r6 = r24 & 32
            if (r6 == 0) goto L_0x0057
            androidx.compose.material3.BottomSheetDefaults r6 = androidx.compose.material3.BottomSheetDefaults.f9266a
            float r6 = r6.l()
            goto L_0x0059
        L_0x0057:
            r6 = r21
        L_0x0059:
            boolean r7 = androidx.compose.runtime.ComposerKt.P()
            if (r7 == 0) goto L_0x0068
            r7 = -1
            java.lang.String r11 = "androidx.compose.material3.rememberSheetState (SheetDefaults.kt:514)"
            r12 = -20307384(0xfffffffffeca2248, float:-1.3434103E38)
            androidx.compose.runtime.ComposerKt.Y(r12, r1, r7, r11)
        L_0x0068:
            androidx.compose.runtime.ProvidableCompositionLocal r7 = androidx.compose.ui.platform.CompositionLocalsKt.g()
            java.lang.Object r7 = r0.C(r7)
            androidx.compose.ui.unit.Density r7 = (androidx.compose.ui.unit.Density) r7
            boolean r11 = r0.W(r7)
            r12 = 57344(0xe000, float:8.0356E-41)
            r12 = r12 & r1
            r12 = r12 ^ 24576(0x6000, float:3.4438E-41)
            r13 = 16384(0x4000, float:2.2959E-41)
            r14 = 1
            if (r12 <= r13) goto L_0x0087
            boolean r12 = r0.h(r2)
            if (r12 != 0) goto L_0x008b
        L_0x0087:
            r12 = r1 & 24576(0x6000, float:3.4438E-41)
            if (r12 != r13) goto L_0x008d
        L_0x008b:
            r12 = r14
            goto L_0x008e
        L_0x008d:
            r12 = r3
        L_0x008e:
            r11 = r11 | r12
            java.lang.Object r12 = r22.g()
            if (r11 != 0) goto L_0x009d
            androidx.compose.runtime.Composer$Companion r11 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r11 = r11.a()
            if (r12 != r11) goto L_0x00a5
        L_0x009d:
            androidx.compose.material3.Q5 r12 = new androidx.compose.material3.Q5
            r12.<init>(r7, r2)
            r0.N(r12)
        L_0x00a5:
            r2 = r12
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            boolean r11 = r0.W(r7)
            r12 = 458752(0x70000, float:6.42848E-40)
            r12 = r12 & r1
            r13 = 196608(0x30000, float:2.75506E-40)
            r12 = r12 ^ r13
            r15 = 131072(0x20000, float:1.83671E-40)
            if (r12 <= r15) goto L_0x00bc
            boolean r12 = r0.h(r6)
            if (r12 != 0) goto L_0x00c0
        L_0x00bc:
            r12 = r1 & r13
            if (r12 != r15) goto L_0x00c2
        L_0x00c0:
            r12 = r14
            goto L_0x00c3
        L_0x00c2:
            r12 = r3
        L_0x00c3:
            r11 = r11 | r12
            java.lang.Object r12 = r22.g()
            if (r11 != 0) goto L_0x00d2
            androidx.compose.runtime.Composer$Companion r11 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r11 = r11.a()
            if (r12 != r11) goto L_0x00da
        L_0x00d2:
            androidx.compose.material3.R5 r12 = new androidx.compose.material3.R5
            r12.<init>(r7, r6)
            r0.N(r12)
        L_0x00da:
            r7 = r12
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r10)
            java.lang.Object[] r11 = new java.lang.Object[]{r6, r9, r11}
            androidx.compose.material3.SheetState$Companion r6 = androidx.compose.material3.SheetState.f11003h
            r16 = r6
            r17 = r5
            r18 = r2
            r19 = r7
            r20 = r9
            r21 = r10
            androidx.compose.runtime.saveable.Saver r12 = r16.c(r17, r18, r19, r20, r21)
            r6 = r1 & 14
            r6 = r6 ^ 6
            r13 = 4
            if (r6 <= r13) goto L_0x0108
            boolean r6 = r0.d(r5)
            if (r6 != 0) goto L_0x010c
        L_0x0108:
            r6 = r1 & 6
            if (r6 != r13) goto L_0x010e
        L_0x010c:
            r6 = r14
            goto L_0x010f
        L_0x010e:
            r6 = r3
        L_0x010f:
            boolean r13 = r0.W(r2)
            r6 = r6 | r13
            boolean r13 = r0.W(r7)
            r6 = r6 | r13
            r13 = r1 & 896(0x380, float:1.256E-42)
            r13 = r13 ^ 384(0x180, float:5.38E-43)
            r15 = 256(0x100, float:3.59E-43)
            if (r13 <= r15) goto L_0x012b
            int r13 = r8.ordinal()
            boolean r13 = r0.i(r13)
            if (r13 != 0) goto L_0x012f
        L_0x012b:
            r13 = r1 & 384(0x180, float:5.38E-43)
            if (r13 != r15) goto L_0x0131
        L_0x012f:
            r13 = r14
            goto L_0x0132
        L_0x0131:
            r13 = r3
        L_0x0132:
            r6 = r6 | r13
            r13 = r1 & 112(0x70, float:1.57E-43)
            r13 = r13 ^ 48
            if (r13 <= r4) goto L_0x013f
            boolean r13 = r0.W(r9)
            if (r13 != 0) goto L_0x0143
        L_0x013f:
            r13 = r1 & 48
            if (r13 != r4) goto L_0x0145
        L_0x0143:
            r4 = r14
            goto L_0x0146
        L_0x0145:
            r4 = r3
        L_0x0146:
            r4 = r4 | r6
            r6 = r1 & 7168(0x1c00, float:1.0045E-41)
            r6 = r6 ^ 3072(0xc00, float:4.305E-42)
            r13 = 2048(0x800, float:2.87E-42)
            if (r6 <= r13) goto L_0x0155
            boolean r6 = r0.d(r10)
            if (r6 != 0) goto L_0x015b
        L_0x0155:
            r1 = r1 & 3072(0xc00, float:4.305E-42)
            if (r1 != r13) goto L_0x015a
            goto L_0x015b
        L_0x015a:
            r14 = r3
        L_0x015b:
            r1 = r4 | r14
            java.lang.Object r4 = r22.g()
            if (r1 != 0) goto L_0x016b
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
            if (r4 != r1) goto L_0x0175
        L_0x016b:
            androidx.compose.material3.S5 r1 = new androidx.compose.material3.S5
            r4 = r1
            r6 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.N(r1)
        L_0x0175:
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            java.lang.Object r0 = androidx.compose.runtime.saveable.RememberSaveableKt.i(r11, r12, r4, r0, r3)
            androidx.compose.material3.SheetState r0 = (androidx.compose.material3.SheetState) r0
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x0186
            androidx.compose.runtime.ComposerKt.X()
        L_0x0186:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SheetDefaultsKt.k(boolean, kotlin.jvm.functions.Function1, androidx.compose.material3.SheetValue, boolean, float, float, androidx.compose.runtime.Composer, int, int):androidx.compose.material3.SheetState");
    }

    public static final SheetState l(boolean z2, Function0 function0, Function0 function02, SheetValue sheetValue, Function1 function1, boolean z3) {
        return new SheetState(z2, function0, function02, sheetValue, function1, z3);
    }

    public static final boolean m(SheetValue sheetValue) {
        return true;
    }

    public static final float n(Density density, float f2) {
        return density.B1(f2);
    }

    public static final float o(Density density, float f2) {
        return density.B1(f2);
    }
}
