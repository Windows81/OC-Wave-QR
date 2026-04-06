package androidx.compose.material3;

import android.view.KeyEvent;
import androidx.compose.material3.ExposedDropdownMenuAnchorType;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.math.MathKt;

@Metadata
public final class ExposedDropdownMenuKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f9947a = Dp.m((float) 16);

    public static final int A(IntRect intRect, Rect rect, int i2) {
        if (rect == null) {
            return 0;
        }
        int j2 = intRect.j() + i2;
        int d2 = intRect.d() - i2;
        return Math.max((rect.r() > ((float) intRect.d()) || rect.i() < ((float) intRect.j())) ? d2 - j2 : MathKt.d(Math.max(rect.r() - ((float) j2), ((float) d2) - rect.i())), 0);
    }

    public static final Modifier B(Modifier modifier, boolean z2, Function0 function0, String str, MutableState mutableState, String str2, String str3, String str4, SoftwareKeyboardController softwareKeyboardController) {
        String str5 = str;
        Modifier modifier2 = modifier;
        boolean z3 = z2;
        MutableState mutableState2 = mutableState;
        return SemanticsModifierKt.d(KeyInputModifierKt.b(SuspendingPointerInputFilterKt.c(modifier, function0, new ExposedDropdownMenuKt$expandable$1(str, function0)), new ExposedDropdownMenuKt$expandable$2(str, function0, z2, mutableState)), false, new G2(str5, z2, str2, str3, str4, function0, softwareKeyboardController), 1, (Object) null);
    }

    public static final Unit C(String str, boolean z2, String str2, String str3, String str4, Function0 function0, SoftwareKeyboardController softwareKeyboardController, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (ExposedDropdownMenuAnchorType.g(str, ExposedDropdownMenuAnchorType.f9935b.c())) {
            SemanticsPropertiesKt.s0(semanticsPropertyReceiver, Role.f18040b.a());
            if (!z2) {
                str2 = str3;
            }
            SemanticsPropertiesKt.x0(semanticsPropertyReceiver, str2);
            SemanticsPropertiesKt.e0(semanticsPropertyReceiver, str4);
        } else {
            SemanticsPropertiesKt.s0(semanticsPropertyReceiver, Role.f18040b.d());
        }
        SemanticsPropertiesKt.C(semanticsPropertyReceiver, (String) null, new H2(function0, str, softwareKeyboardController), 1, (Object) null);
        return Unit.f40552a;
    }

    public static final boolean D(Function0 function0, String str, SoftwareKeyboardController softwareKeyboardController) {
        function0.invoke();
        if (!ExposedDropdownMenuAnchorType.g(str, ExposedDropdownMenuAnchorType.f9935b.a()) || softwareKeyboardController == null) {
            return true;
        }
        softwareKeyboardController.b();
        return true;
    }

    public static final Rect E(LayoutCoordinates layoutCoordinates) {
        return (layoutCoordinates == null || !layoutCoordinates.b()) ? Rect.f15860e.a() : RectKt.c(LayoutCoordinatesKt.g(layoutCoordinates), IntSizeKt.e(layoutCoordinates.a()));
    }

    public static final boolean F(String str, String str2) {
        ExposedDropdownMenuAnchorType.Companion companion = ExposedDropdownMenuAnchorType.f9935b;
        if (ExposedDropdownMenuAnchorType.g(str, companion.b()) || ExposedDropdownMenuAnchorType.g(str, companion.a())) {
            return true;
        }
        if (ExposedDropdownMenuAnchorType.g(str, companion.c())) {
            return ExposedDropdownMenuAnchorType.g(str2, companion.c());
        }
        return false;
    }

    public static final boolean G(KeyEvent keyEvent) {
        return KeyEventType.f(KeyEvent_androidKt.b(keyEvent), KeyEventType.f16777b.b()) && (H(keyEvent) || Key.r(KeyEvent_androidKt.a(keyEvent), Key.f16750b.n()));
    }

    public static final boolean H(KeyEvent keyEvent) {
        long a2 = KeyEvent_androidKt.a(keyEvent);
        Key.Companion companion = Key.f16750b;
        return Key.r(a2, companion.b()) || Key.r(a2, companion.g()) || Key.r(a2, companion.k());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: androidx.compose.ui.Modifier$Companion} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: androidx.compose.material3.B2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v7, resolved type: androidx.compose.material3.B2} */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01fb, code lost:
        if (r2 == r23.a()) goto L_0x01fd;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0334  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0342  */
    /* JADX WARNING: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x008a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void h(boolean r29, kotlin.jvm.functions.Function1 r30, androidx.compose.ui.Modifier r31, kotlin.jvm.functions.Function3 r32, androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            r12 = r29
            r13 = r30
            r14 = r32
            r15 = r34
            r0 = 1597265892(0x5f3457e4, float:1.2995106E19)
            r1 = r33
            androidx.compose.runtime.Composer r11 = r1.q(r0)
            r16 = 1
            r1 = r35 & 1
            r10 = 4
            r2 = 2
            if (r1 == 0) goto L_0x001c
            r1 = r15 | 6
            goto L_0x002c
        L_0x001c:
            r1 = r15 & 6
            if (r1 != 0) goto L_0x002b
            boolean r1 = r11.d(r12)
            if (r1 == 0) goto L_0x0028
            r1 = r10
            goto L_0x0029
        L_0x0028:
            r1 = r2
        L_0x0029:
            r1 = r1 | r15
            goto L_0x002c
        L_0x002b:
            r1 = r15
        L_0x002c:
            r3 = r35 & 2
            if (r3 == 0) goto L_0x0033
            r1 = r1 | 48
            goto L_0x0043
        L_0x0033:
            r3 = r15 & 48
            if (r3 != 0) goto L_0x0043
            boolean r3 = r11.l(r13)
            if (r3 == 0) goto L_0x0040
            r3 = 32
            goto L_0x0042
        L_0x0040:
            r3 = 16
        L_0x0042:
            r1 = r1 | r3
        L_0x0043:
            r3 = r35 & 4
            if (r3 == 0) goto L_0x004c
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x0049:
            r4 = r31
            goto L_0x005e
        L_0x004c:
            r4 = r15 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x0049
            r4 = r31
            boolean r5 = r11.W(r4)
            if (r5 == 0) goto L_0x005b
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r5 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r1 = r1 | r5
        L_0x005e:
            r5 = r35 & 8
            if (r5 == 0) goto L_0x0066
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x0064:
            r8 = r1
            goto L_0x0077
        L_0x0066:
            r5 = r15 & 3072(0xc00, float:4.305E-42)
            if (r5 != 0) goto L_0x0064
            boolean r5 = r11.l(r14)
            if (r5 == 0) goto L_0x0073
            r5 = 2048(0x800, float:2.87E-42)
            goto L_0x0075
        L_0x0073:
            r5 = 1024(0x400, float:1.435E-42)
        L_0x0075:
            r1 = r1 | r5
            goto L_0x0064
        L_0x0077:
            r1 = r8 & 1171(0x493, float:1.641E-42)
            r5 = 1170(0x492, float:1.64E-42)
            r7 = 0
            if (r1 == r5) goto L_0x0081
            r1 = r16
            goto L_0x0082
        L_0x0081:
            r1 = r7
        L_0x0082:
            r5 = r8 & 1
            boolean r1 = r11.E(r1, r5)
            if (r1 == 0) goto L_0x0334
            if (r3 == 0) goto L_0x0090
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.f15489d
            r6 = r1
            goto L_0x0091
        L_0x0090:
            r6 = r4
        L_0x0091:
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x009d
            r1 = -1
            java.lang.String r3 = "androidx.compose.material3.ExposedDropdownMenuBox (ExposedDropdownMenu.kt:141)"
            androidx.compose.runtime.ComposerKt.Y(r0, r8, r1, r3)
        L_0x009d:
            androidx.compose.material3.WindowBoundsCalculator r5 = androidx.compose.material3.ExposedDropdownMenu_androidKt.k(r11, r7)
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.ui.platform.CompositionLocalsKt.g()
            java.lang.Object r0 = r11.C(r0)
            androidx.compose.ui.unit.Density r0 = (androidx.compose.ui.unit.Density) r0
            float r1 = androidx.compose.material3.MenuKt.n()
            int r4 = r0.P1(r1)
            java.lang.Object r1 = r11.g()
            androidx.compose.runtime.Composer$Companion r23 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r23.a()
            r9 = 0
            if (r1 != r3) goto L_0x00c7
            androidx.compose.runtime.MutableState r1 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.e(r9, r9, r2, r9)
            r11.N(r1)
        L_0x00c7:
            r3 = r1
            androidx.compose.runtime.MutableState r3 = (androidx.compose.runtime.MutableState) r3
            java.lang.Object r1 = r11.g()
            java.lang.Object r10 = r23.a()
            if (r1 != r10) goto L_0x00db
            androidx.compose.runtime.MutableIntState r1 = androidx.compose.runtime.SnapshotIntStateKt.a(r7)
            r11.N(r1)
        L_0x00db:
            r21 = r1
            androidx.compose.runtime.MutableIntState r21 = (androidx.compose.runtime.MutableIntState) r21
            java.lang.Object r1 = r11.g()
            java.lang.Object r10 = r23.a()
            if (r1 != r10) goto L_0x00f0
            androidx.compose.runtime.MutableIntState r1 = androidx.compose.runtime.SnapshotIntStateKt.a(r7)
            r11.N(r1)
        L_0x00f0:
            r10 = r1
            androidx.compose.runtime.MutableIntState r10 = (androidx.compose.runtime.MutableIntState) r10
            java.lang.Object r1 = r11.g()
            java.lang.Object r2 = r23.a()
            if (r1 != r2) goto L_0x0105
            androidx.compose.ui.focus.FocusRequester r1 = new androidx.compose.ui.focus.FocusRequester
            r1.<init>()
            r11.N(r1)
        L_0x0105:
            r2 = r1
            androidx.compose.ui.focus.FocusRequester r2 = (androidx.compose.ui.focus.FocusRequester) r2
            androidx.compose.runtime.ProvidableCompositionLocal r1 = androidx.compose.ui.platform.CompositionLocalsKt.q()
            java.lang.Object r1 = r11.C(r1)
            r19 = r1
            androidx.compose.ui.platform.SoftwareKeyboardController r19 = (androidx.compose.ui.platform.SoftwareKeyboardController) r19
            androidx.compose.material3.internal.Strings$Companion r1 = androidx.compose.material3.internal.Strings.f12320b
            int r1 = androidx.compose.material3.R.string.K
            int r1 = androidx.compose.material3.internal.Strings.a(r1)
            java.lang.String r20 = androidx.compose.material3.internal.Strings_androidKt.b(r1, r11, r7)
            int r1 = androidx.compose.material3.R.string.J
            int r1 = androidx.compose.material3.internal.Strings.a(r1)
            java.lang.String r22 = androidx.compose.material3.internal.Strings_androidKt.b(r1, r11, r7)
            int r1 = androidx.compose.material3.R.string.L
            int r1 = androidx.compose.material3.internal.Strings.a(r1)
            java.lang.String r24 = androidx.compose.material3.internal.Strings_androidKt.b(r1, r11, r7)
            java.lang.Object r1 = r11.g()
            java.lang.Object r7 = r23.a()
            if (r1 != r7) goto L_0x0151
            androidx.compose.material3.ExposedDropdownMenuAnchorType$Companion r1 = androidx.compose.material3.ExposedDropdownMenuAnchorType.f9935b
            java.lang.String r1 = r1.b()
            androidx.compose.material3.ExposedDropdownMenuAnchorType r1 = androidx.compose.material3.ExposedDropdownMenuAnchorType.d(r1)
            r7 = 2
            androidx.compose.runtime.MutableState r1 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.e(r1, r9, r7, r9)
            r11.N(r1)
            goto L_0x0152
        L_0x0151:
            r7 = 2
        L_0x0152:
            r18 = r1
            androidx.compose.runtime.MutableState r18 = (androidx.compose.runtime.MutableState) r18
            java.lang.Object r1 = r11.g()
            java.lang.Object r7 = r23.a()
            if (r1 != r7) goto L_0x016a
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r7 = 2
            androidx.compose.runtime.MutableState r1 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.e(r1, r9, r7, r9)
            r11.N(r1)
        L_0x016a:
            r7 = r1
            androidx.compose.runtime.MutableState r7 = (androidx.compose.runtime.MutableState) r7
            r9 = r8 & 14
            r1 = 4
            if (r9 != r1) goto L_0x0175
            r17 = r16
            goto L_0x0177
        L_0x0175:
            r17 = 0
        L_0x0177:
            r15 = r8 & 112(0x70, float:1.57E-43)
            r31 = r9
            r9 = 32
            if (r15 != r9) goto L_0x0182
            r25 = r16
            goto L_0x0184
        L_0x0182:
            r25 = 0
        L_0x0184:
            r17 = r17 | r25
            boolean r25 = r11.W(r5)
            r17 = r17 | r25
            boolean r0 = r11.W(r0)
            r0 = r17 | r0
            java.lang.Object r1 = r11.g()
            if (r0 != 0) goto L_0x01b1
            java.lang.Object r0 = r23.a()
            if (r1 != r0) goto L_0x019f
            goto L_0x01b1
        L_0x019f:
            r27 = r31
            r26 = r2
            r25 = r3
            r14 = r4
            r28 = r6
            r24 = r8
            r31 = r10
            r12 = r11
            r33 = r15
            r15 = r5
            goto L_0x01e6
        L_0x01b1:
            androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1 r1 = new androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1
            r0 = r1
            r13 = r1
            r17 = 4
            r1 = r2
            r33 = r15
            r15 = r2
            r2 = r29
            r25 = r3
            r3 = r7
            r7 = r4
            r4 = r20
            r26 = r15
            r15 = r5
            r5 = r22
            r12 = r6
            r6 = r24
            r14 = r7
            r7 = r19
            r24 = r8
            r8 = r18
            r27 = r31
            r9 = r30
            r31 = r10
            r10 = r21
            r28 = r12
            r12 = r11
            r11 = r31
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.N(r13)
            r1 = r13
        L_0x01e6:
            androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1 r1 = (androidx.compose.material3.ExposedDropdownMenuKt$ExposedDropdownMenuBox$scope$1$1) r1
            boolean r0 = r12.l(r15)
            boolean r2 = r12.i(r14)
            r0 = r0 | r2
            java.lang.Object r2 = r12.g()
            if (r0 != 0) goto L_0x01fd
            java.lang.Object r0 = r23.a()
            if (r2 != r0) goto L_0x020f
        L_0x01fd:
            androidx.compose.material3.B2 r2 = new androidx.compose.material3.B2
            r17 = r2
            r18 = r15
            r19 = r14
            r20 = r25
            r22 = r31
            r17.<init>(r18, r19, r20, r21, r22)
            r12.N(r2)
        L_0x020f:
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r4 = r28
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.layout.OnGloballyPositionedModifierKt.a(r4, r2)
            androidx.compose.ui.Alignment$Companion r2 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r2 = r2.o()
            r3 = 0
            androidx.compose.ui.layout.MeasurePolicy r2 = androidx.compose.foundation.layout.BoxKt.g(r2, r3)
            int r5 = androidx.compose.runtime.ComposablesKt.a(r12, r3)
            androidx.compose.runtime.CompositionLocalMap r6 = r12.I()
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.ComposedModifierKt.e(r12, r0)
            androidx.compose.ui.node.ComposeUiNode$Companion r7 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r8 = r7.a()
            androidx.compose.runtime.Applier r9 = r12.v()
            if (r9 != 0) goto L_0x023d
            androidx.compose.runtime.ComposablesKt.d()
        L_0x023d:
            r12.s()
            boolean r9 = r12.n()
            if (r9 == 0) goto L_0x024a
            r12.y(r8)
            goto L_0x024d
        L_0x024a:
            r12.K()
        L_0x024d:
            androidx.compose.runtime.Composer r8 = androidx.compose.runtime.Updater.b(r12)
            kotlin.jvm.functions.Function2 r9 = r7.c()
            androidx.compose.runtime.Updater.g(r8, r2, r9)
            kotlin.jvm.functions.Function2 r2 = r7.e()
            androidx.compose.runtime.Updater.g(r8, r6, r2)
            kotlin.jvm.functions.Function2 r2 = r7.b()
            boolean r6 = r8.n()
            if (r6 != 0) goto L_0x0277
            java.lang.Object r6 = r8.g()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            boolean r6 = kotlin.jvm.internal.Intrinsics.d(r6, r9)
            if (r6 != 0) goto L_0x0285
        L_0x0277:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r8.N(r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r8.A(r5, r2)
        L_0x0285:
            kotlin.jvm.functions.Function2 r2 = r7.d()
            androidx.compose.runtime.Updater.g(r8, r0, r2)
            androidx.compose.foundation.layout.BoxScopeInstance r0 = androidx.compose.foundation.layout.BoxScopeInstance.f3797a
            int r0 = r24 >> 6
            r0 = r0 & 112(0x70, float:1.57E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5 = r32
            r2 = r3
            r5.d(r1, r12, r0)
            r12.T()
            r1 = r29
            if (r1 == 0) goto L_0x02d6
            r0 = 209894723(0xc82bd43, float:2.014358E-31)
            r12.X(r0)
            boolean r0 = r12.l(r15)
            boolean r3 = r12.i(r14)
            r0 = r0 | r3
            java.lang.Object r3 = r12.g()
            if (r0 != 0) goto L_0x02be
            java.lang.Object r0 = r23.a()
            if (r3 != r0) goto L_0x02ca
        L_0x02be:
            androidx.compose.material3.C2 r3 = new androidx.compose.material3.C2
            r6 = r31
            r0 = r25
            r3.<init>(r15, r14, r0, r6)
            r12.N(r3)
        L_0x02ca:
            kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3
            androidx.compose.material3.ExposedDropdownMenu_androidKt.d(r3, r12, r2)
            r12.M()
        L_0x02d2:
            r3 = r27
            r0 = 4
            goto L_0x02e0
        L_0x02d6:
            r0 = 210228190(0xc87d3de, float:2.0927556E-31)
            r12.X(r0)
            r12.M()
            goto L_0x02d2
        L_0x02e0:
            if (r3 != r0) goto L_0x02e5
            r7 = r16
            goto L_0x02e6
        L_0x02e5:
            r7 = r2
        L_0x02e6:
            java.lang.Object r0 = r12.g()
            if (r7 != 0) goto L_0x02f2
            java.lang.Object r6 = r23.a()
            if (r0 != r6) goto L_0x02fc
        L_0x02f2:
            androidx.compose.material3.D2 r0 = new androidx.compose.material3.D2
            r6 = r26
            r0.<init>(r1, r6)
            r12.N(r0)
        L_0x02fc:
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            androidx.compose.runtime.EffectsKt.h(r0, r12, r2)
            r6 = r33
            r0 = 32
            if (r6 != r0) goto L_0x0308
            goto L_0x030a
        L_0x0308:
            r16 = r2
        L_0x030a:
            java.lang.Object r0 = r12.g()
            if (r16 != 0) goto L_0x031a
            java.lang.Object r6 = r23.a()
            if (r0 != r6) goto L_0x0317
            goto L_0x031a
        L_0x0317:
            r6 = r30
            goto L_0x0324
        L_0x031a:
            androidx.compose.material3.E2 r0 = new androidx.compose.material3.E2
            r6 = r30
            r0.<init>(r6)
            r12.N(r0)
        L_0x0324:
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            androidx.compose.material3.internal.BackHandler_androidKt.c(r1, r0, r12, r3, r2)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0332
            androidx.compose.runtime.ComposerKt.X()
        L_0x0332:
            r3 = r4
            goto L_0x033c
        L_0x0334:
            r1 = r12
            r6 = r13
            r5 = r14
            r12 = r11
            r12.B()
            goto L_0x0332
        L_0x033c:
            androidx.compose.runtime.ScopeUpdateScope r7 = r12.x()
            if (r7 == 0) goto L_0x0355
            androidx.compose.material3.F2 r8 = new androidx.compose.material3.F2
            r0 = r8
            r1 = r29
            r2 = r30
            r4 = r32
            r5 = r34
            r6 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x0355:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ExposedDropdownMenuKt.h(boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit i(WindowBoundsCalculator windowBoundsCalculator, int i2, MutableState mutableState, MutableIntState mutableIntState, MutableIntState mutableIntState2, LayoutCoordinates layoutCoordinates) {
        o(mutableState, layoutCoordinates);
        q(mutableIntState, (int) (layoutCoordinates.a() >> 32));
        s(mutableIntState2, A(windowBoundsCalculator.a(), E(k(mutableState)), i2));
        return Unit.f40552a;
    }

    public static final Unit j(WindowBoundsCalculator windowBoundsCalculator, int i2, MutableState mutableState, MutableIntState mutableIntState) {
        s(mutableIntState, A(windowBoundsCalculator.a(), E(k(mutableState)), i2));
        return Unit.f40552a;
    }

    public static final LayoutCoordinates k(MutableState mutableState) {
        return (LayoutCoordinates) mutableState.getValue();
    }

    public static final Unit l(boolean z2, FocusRequester focusRequester) {
        if (z2) {
            FocusRequester.i(focusRequester, 0, 1, (Object) null);
        }
        return Unit.f40552a;
    }

    public static final Unit m(Function1 function1) {
        function1.invoke(Boolean.FALSE);
        return Unit.f40552a;
    }

    public static final Unit n(boolean z2, Function1 function1, Modifier modifier, Function3 function3, int i2, int i3, Composer composer, int i4) {
        h(z2, function1, modifier, function3, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final void o(MutableState mutableState, LayoutCoordinates layoutCoordinates) {
        mutableState.setValue(layoutCoordinates);
    }

    public static final int p(MutableIntState mutableIntState) {
        return mutableIntState.e();
    }

    public static final void q(MutableIntState mutableIntState, int i2) {
        mutableIntState.k(i2);
    }

    public static final int r(MutableIntState mutableIntState) {
        return mutableIntState.e();
    }

    public static final void s(MutableIntState mutableIntState, int i2) {
        mutableIntState.k(i2);
    }
}
