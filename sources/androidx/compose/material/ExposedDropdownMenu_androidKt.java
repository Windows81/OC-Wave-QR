package androidx.compose.material;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.IntRect;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class ExposedDropdownMenu_androidKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v11, resolved type: androidx.compose.ui.Modifier$Companion} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: androidx.compose.material.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$1$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v5, resolved type: androidx.compose.material.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$1$1} */
    /* JADX WARNING: type inference failed for: r5v3 */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0146, code lost:
        if (r5 == r14.a()) goto L_0x0148;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0281  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x028b  */
    /* JADX WARNING: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0087  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(boolean r22, kotlin.jvm.functions.Function1 r23, androidx.compose.ui.Modifier r24, kotlin.jvm.functions.Function3 r25, androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            r1 = r22
            r2 = r23
            r4 = r25
            r5 = r27
            r0 = 2
            r3 = 6
            r6 = 1456052980(0x56c99af4, float:1.10833678E14)
            r7 = r26
            androidx.compose.runtime.Composer r7 = r7.q(r6)
            r8 = 1
            r9 = r28 & 1
            r10 = 4
            if (r9 == 0) goto L_0x001c
            r9 = r5 | 6
            goto L_0x002c
        L_0x001c:
            r9 = r5 & 6
            if (r9 != 0) goto L_0x002b
            boolean r9 = r7.d(r1)
            if (r9 == 0) goto L_0x0028
            r9 = r10
            goto L_0x0029
        L_0x0028:
            r9 = r0
        L_0x0029:
            r9 = r9 | r5
            goto L_0x002c
        L_0x002b:
            r9 = r5
        L_0x002c:
            r0 = r28 & 2
            if (r0 == 0) goto L_0x0033
            r9 = r9 | 48
            goto L_0x0043
        L_0x0033:
            r0 = r5 & 48
            if (r0 != 0) goto L_0x0043
            boolean r0 = r7.l(r2)
            if (r0 == 0) goto L_0x0040
            r0 = 32
            goto L_0x0042
        L_0x0040:
            r0 = 16
        L_0x0042:
            r9 = r9 | r0
        L_0x0043:
            r0 = r28 & 4
            if (r0 == 0) goto L_0x004c
            r9 = r9 | 384(0x180, float:5.38E-43)
        L_0x0049:
            r12 = r24
            goto L_0x005e
        L_0x004c:
            r12 = r5 & 384(0x180, float:5.38E-43)
            if (r12 != 0) goto L_0x0049
            r12 = r24
            boolean r13 = r7.W(r12)
            if (r13 == 0) goto L_0x005b
            r13 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r13 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r9 = r9 | r13
        L_0x005e:
            r13 = r28 & 8
            if (r13 == 0) goto L_0x0065
            r9 = r9 | 3072(0xc00, float:4.305E-42)
            goto L_0x0075
        L_0x0065:
            r13 = r5 & 3072(0xc00, float:4.305E-42)
            if (r13 != 0) goto L_0x0075
            boolean r13 = r7.l(r4)
            if (r13 == 0) goto L_0x0072
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x0074
        L_0x0072:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x0074:
            r9 = r9 | r13
        L_0x0075:
            r13 = r9 & 1171(0x493, float:1.641E-42)
            r14 = 1170(0x492, float:1.64E-42)
            r15 = 0
            if (r13 == r14) goto L_0x007e
            r13 = r8
            goto L_0x007f
        L_0x007e:
            r13 = r15
        L_0x007f:
            r14 = r9 & 1
            boolean r13 = r7.E(r13, r14)
            if (r13 == 0) goto L_0x0281
            if (r0 == 0) goto L_0x008c
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            r12 = r0
        L_0x008c:
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0098
            r0 = -1
            java.lang.String r13 = "androidx.compose.material.ExposedDropdownMenuBox (ExposedDropdownMenu.kt:94)"
            androidx.compose.runtime.ComposerKt.Y(r6, r9, r0, r13)
        L_0x0098:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.g()
            java.lang.Object r0 = r7.C(r0)
            androidx.compose.ui.unit.Density r0 = (androidx.compose.ui.unit.Density) r0
            androidx.compose.material.WindowBoundsCalculator r6 = androidx.compose.material.ExposedDropdownMenu_android.d(r7, r15)
            java.lang.Object r13 = r7.g()
            androidx.compose.runtime.Composer$Companion r14 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r8 = r14.a()
            if (r13 != r8) goto L_0x00b9
            androidx.compose.runtime.MutableIntState r13 = androidx.compose.runtime.SnapshotIntStateKt.a(r15)
            r7.N(r13)
        L_0x00b9:
            r8 = r13
            androidx.compose.runtime.MutableIntState r8 = (androidx.compose.runtime.MutableIntState) r8
            java.lang.Object r13 = r7.g()
            java.lang.Object r3 = r14.a()
            if (r13 != r3) goto L_0x00cd
            androidx.compose.runtime.MutableIntState r13 = androidx.compose.runtime.SnapshotIntStateKt.a(r15)
            r7.N(r13)
        L_0x00cd:
            androidx.compose.runtime.MutableIntState r13 = (androidx.compose.runtime.MutableIntState) r13
            float r3 = androidx.compose.material.MenuKt.j()
            int r3 = r0.P1(r3)
            java.lang.Object r15 = r7.g()
            java.lang.Object r10 = r14.a()
            if (r15 != r10) goto L_0x00e9
            androidx.compose.ui.node.Ref r15 = new androidx.compose.ui.node.Ref
            r15.<init>()
            r7.N(r15)
        L_0x00e9:
            androidx.compose.ui.node.Ref r15 = (androidx.compose.ui.node.Ref) r15
            int r10 = d(r13)
            int r11 = b(r8)
            boolean r16 = r7.W(r0)
            boolean r10 = r7.i(r10)
            r10 = r16 | r10
            boolean r11 = r7.i(r11)
            r10 = r10 | r11
            java.lang.Object r11 = r7.g()
            if (r10 != 0) goto L_0x010e
            java.lang.Object r10 = r14.a()
            if (r11 != r10) goto L_0x0116
        L_0x010e:
            androidx.compose.material.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1 r11 = new androidx.compose.material.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1
            r11.<init>(r0, r13, r8)
            r7.N(r11)
        L_0x0116:
            androidx.compose.material.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1 r11 = (androidx.compose.material.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1) r11
            java.lang.Object r0 = r7.g()
            java.lang.Object r10 = r14.a()
            if (r0 != r10) goto L_0x012a
            androidx.compose.ui.focus.FocusRequester r0 = new androidx.compose.ui.focus.FocusRequester
            r0.<init>()
            r7.N(r0)
        L_0x012a:
            androidx.compose.ui.focus.FocusRequester r0 = (androidx.compose.ui.focus.FocusRequester) r0
            boolean r10 = r7.l(r15)
            boolean r16 = r7.l(r6)
            r10 = r10 | r16
            boolean r16 = r7.i(r3)
            r10 = r10 | r16
            java.lang.Object r5 = r7.g()
            if (r10 != 0) goto L_0x0148
            java.lang.Object r10 = r14.a()
            if (r5 != r10) goto L_0x015c
        L_0x0148:
            androidx.compose.material.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$1$1 r5 = new androidx.compose.material.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$1$1
            r16 = r5
            r17 = r15
            r18 = r6
            r19 = r3
            r20 = r8
            r21 = r13
            r16.<init>(r17, r18, r19, r20, r21)
            r7.N(r5)
        L_0x015c:
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            androidx.compose.ui.Modifier r5 = androidx.compose.ui.layout.OnGloballyPositionedModifierKt.a(r12, r5)
            r8 = r9 & 112(0x70, float:1.57E-43)
            r10 = 32
            if (r8 != r10) goto L_0x016a
            r8 = 1
            goto L_0x016b
        L_0x016a:
            r8 = 0
        L_0x016b:
            r10 = r9 & 14
            r16 = r12
            r12 = 4
            if (r10 != r12) goto L_0x0174
            r12 = 1
            goto L_0x0175
        L_0x0174:
            r12 = 0
        L_0x0175:
            r8 = r8 | r12
            java.lang.Object r12 = r7.g()
            if (r8 != 0) goto L_0x0182
            java.lang.Object r8 = r14.a()
            if (r12 != r8) goto L_0x018a
        L_0x0182:
            androidx.compose.material.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$2$1 r12 = new androidx.compose.material.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$2$1
            r12.<init>(r2, r1)
            r7.N(r12)
        L_0x018a:
            kotlin.jvm.functions.Function0 r12 = (kotlin.jvm.functions.Function0) r12
            androidx.compose.material.Strings$Companion r8 = androidx.compose.material.Strings.f8507b
            int r8 = r8.d()
            r2 = 6
            java.lang.String r8 = androidx.compose.material.Strings_androidKt.a(r8, r7, r2)
            androidx.compose.ui.Modifier r2 = k(r5, r12, r8)
            androidx.compose.ui.Modifier r2 = androidx.compose.ui.focus.FocusRequesterModifierKt.a(r2, r0)
            androidx.compose.ui.Alignment$Companion r5 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r5 = r5.o()
            r8 = 0
            androidx.compose.ui.layout.MeasurePolicy r5 = androidx.compose.foundation.layout.BoxKt.g(r5, r8)
            int r12 = androidx.compose.runtime.ComposablesKt.a(r7, r8)
            androidx.compose.runtime.CompositionLocalMap r8 = r7.I()
            androidx.compose.ui.Modifier r2 = androidx.compose.ui.ComposedModifierKt.e(r7, r2)
            androidx.compose.ui.node.ComposeUiNode$Companion r17 = androidx.compose.ui.node.ComposeUiNode.f17222h
            r24 = r13
            kotlin.jvm.functions.Function0 r13 = r17.a()
            androidx.compose.runtime.Applier r18 = r7.v()
            if (r18 != 0) goto L_0x01c7
            androidx.compose.runtime.ComposablesKt.d()
        L_0x01c7:
            r7.s()
            boolean r18 = r7.n()
            if (r18 == 0) goto L_0x01d4
            r7.y(r13)
            goto L_0x01d7
        L_0x01d4:
            r7.K()
        L_0x01d7:
            androidx.compose.runtime.Composer r13 = androidx.compose.runtime.Updater.b(r7)
            r18 = r3
            kotlin.jvm.functions.Function2 r3 = r17.c()
            androidx.compose.runtime.Updater.g(r13, r5, r3)
            kotlin.jvm.functions.Function2 r3 = r17.e()
            androidx.compose.runtime.Updater.g(r13, r8, r3)
            kotlin.jvm.functions.Function2 r3 = r17.b()
            boolean r5 = r13.n()
            if (r5 != 0) goto L_0x0203
            java.lang.Object r5 = r13.g()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r12)
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r5, r8)
            if (r5 != 0) goto L_0x0211
        L_0x0203:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r12)
            r13.N(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r12)
            r13.A(r5, r3)
        L_0x0211:
            kotlin.jvm.functions.Function2 r3 = r17.d()
            androidx.compose.runtime.Updater.g(r13, r2, r3)
            androidx.compose.foundation.layout.BoxScopeInstance r2 = androidx.compose.foundation.layout.BoxScopeInstance.f3797a
            r2 = 6
            int r2 = r9 >> 6
            r2 = r2 & 112(0x70, float:1.57E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.d(r11, r7, r2)
            r7.T()
            r2 = 4
            if (r10 != r2) goto L_0x022e
            r8 = 1
            goto L_0x022f
        L_0x022e:
            r8 = 0
        L_0x022f:
            java.lang.Object r2 = r7.g()
            if (r8 != 0) goto L_0x023b
            java.lang.Object r3 = r14.a()
            if (r2 != r3) goto L_0x0243
        L_0x023b:
            androidx.compose.material.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$4$1 r2 = new androidx.compose.material.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$4$1
            r2.<init>(r1, r0)
            r7.N(r2)
        L_0x0243:
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            r0 = 0
            androidx.compose.runtime.EffectsKt.h(r2, r7, r0)
            boolean r0 = r7.l(r6)
            boolean r2 = r7.l(r15)
            r0 = r0 | r2
            r2 = r18
            boolean r3 = r7.i(r2)
            r0 = r0 | r3
            java.lang.Object r3 = r7.g()
            if (r0 != 0) goto L_0x0265
            java.lang.Object r0 = r14.a()
            if (r3 != r0) goto L_0x026f
        L_0x0265:
            androidx.compose.material.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$5$1 r3 = new androidx.compose.material.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$5$1
            r13 = r24
            r3.<init>(r6, r15, r2, r13)
            r7.N(r3)
        L_0x026f:
            kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3
            r0 = 0
            androidx.compose.material.ExposedDropdownMenu_android.a(r3, r7, r0)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x027e
            androidx.compose.runtime.ComposerKt.X()
        L_0x027e:
            r3 = r16
            goto L_0x0285
        L_0x0281:
            r7.B()
            r3 = r12
        L_0x0285:
            androidx.compose.runtime.ScopeUpdateScope r7 = r7.x()
            if (r7 == 0) goto L_0x029e
            androidx.compose.material.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$6 r8 = new androidx.compose.material.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$6
            r0 = r8
            r1 = r22
            r2 = r23
            r4 = r25
            r5 = r27
            r6 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x029e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ExposedDropdownMenu_androidKt.a(boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final int b(MutableIntState mutableIntState) {
        return mutableIntState.e();
    }

    public static final void c(MutableIntState mutableIntState, int i2) {
        mutableIntState.k(i2);
    }

    public static final int d(MutableIntState mutableIntState) {
        return mutableIntState.e();
    }

    public static final void e(MutableIntState mutableIntState, int i2) {
        mutableIntState.k(i2);
    }

    public static final Modifier k(Modifier modifier, Function0 function0, String str) {
        return SemanticsModifierKt.d(modifier.o0(new SuspendPointerInputElement(function0, (Object) null, (Object[]) null, new SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0(new ExposedDropdownMenu_androidKt$expandable$1(function0, (Continuation) null)), 6, (DefaultConstructorMarker) null)), false, new ExposedDropdownMenu_androidKt$expandable$2(str, function0), 1, (Object) null);
    }

    public static final void l(IntRect intRect, LayoutCoordinates layoutCoordinates, int i2, Function1 function1) {
        if (layoutCoordinates != null) {
            function1.invoke(Integer.valueOf(((int) Math.max(LayoutCoordinatesKt.c(layoutCoordinates).r() - ((float) intRect.j()), ((float) (intRect.d() - intRect.j())) - LayoutCoordinatesKt.c(layoutCoordinates).i())) - i2));
        }
    }
}
