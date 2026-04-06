package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class ModalBottomSheetKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f7986a = Dp.m((float) 56);

    /* renamed from: b  reason: collision with root package name */
    public static final float f7987b = Dp.m((float) 125);

    /* renamed from: c  reason: collision with root package name */
    public static final float f7988c = Dp.m((float) 640);

    public static final NestedScrollConnection a(AnchoredDraggableState anchoredDraggableState, Orientation orientation) {
        return new ModalBottomSheetKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1(anchoredDraggableState, orientation);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v31, resolved type: androidx.compose.ui.input.nestedscroll.NestedScrollConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v35, resolved type: androidx.compose.ui.input.nestedscroll.NestedScrollConnection} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0493  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x04aa  */
    /* JADX WARNING: Removed duplicated region for block: B:235:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0109  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(kotlin.jvm.functions.Function3 r40, androidx.compose.ui.Modifier r41, androidx.compose.material.ModalBottomSheetState r42, boolean r43, androidx.compose.ui.graphics.Shape r44, float r45, long r46, long r48, long r50, kotlin.jvm.functions.Function2 r52, androidx.compose.runtime.Composer r53, int r54, int r55) {
        /*
            r1 = r40
            r13 = r52
            r14 = r54
            r15 = r55
            r0 = -92970288(0xfffffffffa7562d0, float:-3.1852922E35)
            r2 = r53
            androidx.compose.runtime.Composer r9 = r2.q(r0)
            r2 = r15 & 1
            if (r2 == 0) goto L_0x0018
            r2 = r14 | 6
            goto L_0x0028
        L_0x0018:
            r2 = r14 & 6
            if (r2 != 0) goto L_0x0027
            boolean r2 = r9.l(r1)
            if (r2 == 0) goto L_0x0024
            r2 = 4
            goto L_0x0025
        L_0x0024:
            r2 = 2
        L_0x0025:
            r2 = r2 | r14
            goto L_0x0028
        L_0x0027:
            r2 = r14
        L_0x0028:
            r3 = r15 & 2
            if (r3 == 0) goto L_0x0031
            r2 = r2 | 48
        L_0x002e:
            r4 = r41
            goto L_0x0043
        L_0x0031:
            r4 = r14 & 48
            if (r4 != 0) goto L_0x002e
            r4 = r41
            boolean r5 = r9.W(r4)
            if (r5 == 0) goto L_0x0040
            r5 = 32
            goto L_0x0042
        L_0x0040:
            r5 = 16
        L_0x0042:
            r2 = r2 | r5
        L_0x0043:
            r5 = r14 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x005c
            r5 = r15 & 4
            if (r5 != 0) goto L_0x0056
            r5 = r42
            boolean r6 = r9.l(r5)
            if (r6 == 0) goto L_0x0058
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x005a
        L_0x0056:
            r5 = r42
        L_0x0058:
            r6 = 128(0x80, float:1.794E-43)
        L_0x005a:
            r2 = r2 | r6
            goto L_0x005e
        L_0x005c:
            r5 = r42
        L_0x005e:
            r11 = r15 & 8
            if (r11 == 0) goto L_0x0067
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            r12 = r43
            goto L_0x0079
        L_0x0067:
            r6 = r14 & 3072(0xc00, float:4.305E-42)
            r12 = r43
            if (r6 != 0) goto L_0x0079
            boolean r6 = r9.d(r12)
            if (r6 == 0) goto L_0x0076
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x0078
        L_0x0076:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x0078:
            r2 = r2 | r6
        L_0x0079:
            r6 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r6 != 0) goto L_0x0090
            r6 = r15 & 16
            r8 = r44
            if (r6 != 0) goto L_0x008c
            boolean r6 = r9.W(r8)
            if (r6 == 0) goto L_0x008c
            r6 = 16384(0x4000, float:2.2959E-41)
            goto L_0x008e
        L_0x008c:
            r6 = 8192(0x2000, float:1.14794E-41)
        L_0x008e:
            r2 = r2 | r6
            goto L_0x0092
        L_0x0090:
            r8 = r44
        L_0x0092:
            r6 = 196608(0x30000, float:2.75506E-40)
            r6 = r6 & r14
            if (r6 != 0) goto L_0x00aa
            r6 = r15 & 32
            r7 = r45
            if (r6 != 0) goto L_0x00a6
            boolean r6 = r9.h(r7)
            if (r6 == 0) goto L_0x00a6
            r6 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a8
        L_0x00a6:
            r6 = 65536(0x10000, float:9.18355E-41)
        L_0x00a8:
            r2 = r2 | r6
            goto L_0x00ac
        L_0x00aa:
            r7 = r45
        L_0x00ac:
            r16 = 1572864(0x180000, float:2.204052E-39)
            r6 = r14 & r16
            if (r6 != 0) goto L_0x00c5
            r6 = r15 & 64
            r0 = r46
            if (r6 != 0) goto L_0x00c1
            boolean r6 = r9.j(r0)
            if (r6 == 0) goto L_0x00c1
            r6 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c3
        L_0x00c1:
            r6 = 524288(0x80000, float:7.34684E-40)
        L_0x00c3:
            r2 = r2 | r6
            goto L_0x00c7
        L_0x00c5:
            r0 = r46
        L_0x00c7:
            r6 = 12582912(0xc00000, float:1.7632415E-38)
            r6 = r6 & r14
            if (r6 != 0) goto L_0x00e1
            r6 = r15 & 128(0x80, float:1.794E-43)
            r18 = r11
            r10 = r48
            if (r6 != 0) goto L_0x00dd
            boolean r6 = r9.j(r10)
            if (r6 == 0) goto L_0x00dd
            r6 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00df
        L_0x00dd:
            r6 = 4194304(0x400000, float:5.877472E-39)
        L_0x00df:
            r2 = r2 | r6
            goto L_0x00e5
        L_0x00e1:
            r18 = r11
            r10 = r48
        L_0x00e5:
            r6 = 100663296(0x6000000, float:2.4074124E-35)
            r6 = r6 & r14
            if (r6 != 0) goto L_0x00fd
            r6 = r15 & 256(0x100, float:3.59E-43)
            r7 = r50
            if (r6 != 0) goto L_0x00f9
            boolean r6 = r9.j(r7)
            if (r6 == 0) goto L_0x00f9
            r6 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x00fb
        L_0x00f9:
            r6 = 33554432(0x2000000, float:9.403955E-38)
        L_0x00fb:
            r2 = r2 | r6
            goto L_0x00ff
        L_0x00fd:
            r7 = r50
        L_0x00ff:
            r6 = r15 & 512(0x200, float:7.175E-43)
            r19 = 805306368(0x30000000, float:4.656613E-10)
            if (r6 == 0) goto L_0x0109
            r2 = r2 | r19
        L_0x0107:
            r6 = r2
            goto L_0x011a
        L_0x0109:
            r6 = r14 & r19
            if (r6 != 0) goto L_0x0107
            boolean r6 = r9.l(r13)
            if (r6 == 0) goto L_0x0116
            r6 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0118
        L_0x0116:
            r6 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0118:
            r2 = r2 | r6
            goto L_0x0107
        L_0x011a:
            r2 = 306783379(0x12492493, float:6.34695E-28)
            r2 = r2 & r6
            r0 = 306783378(0x12492492, float:6.3469493E-28)
            if (r2 == r0) goto L_0x0125
            r0 = 1
            goto L_0x0126
        L_0x0125:
            r0 = 0
        L_0x0126:
            r2 = r6 & 1
            boolean r0 = r9.E(r0, r2)
            if (r0 == 0) goto L_0x0493
            r9.p()
            r0 = r14 & 1
            r20 = -3670017(0xffffffffffc7ffff, float:NaN)
            r21 = -458753(0xfffffffffff8ffff, float:NaN)
            r22 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x017c
            boolean r0 = r9.J()
            if (r0 == 0) goto L_0x0145
            goto L_0x017c
        L_0x0145:
            r9.B()
            r0 = r15 & 4
            if (r0 == 0) goto L_0x014e
            r6 = r6 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x014e:
            r0 = r15 & 16
            if (r0 == 0) goto L_0x0154
            r6 = r6 & r22
        L_0x0154:
            r0 = r15 & 32
            if (r0 == 0) goto L_0x015a
            r6 = r6 & r21
        L_0x015a:
            r0 = r15 & 64
            if (r0 == 0) goto L_0x0160
            r6 = r6 & r20
        L_0x0160:
            r0 = r15 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0168
            r0 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r6 = r6 & r0
        L_0x0168:
            r0 = r15 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0170
            r0 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r6 = r6 & r0
        L_0x0170:
            r1 = r44
            r0 = r4
            r2 = r5
            r3 = r6
            r5 = r7
            r4 = r45
            r7 = r46
            goto L_0x01fe
        L_0x017c:
            if (r3 == 0) goto L_0x0181
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            goto L_0x0182
        L_0x0181:
            r0 = r4
        L_0x0182:
            r2 = r15 & 4
            if (r2 == 0) goto L_0x019c
            androidx.compose.material.ModalBottomSheetValue r2 = androidx.compose.material.ModalBottomSheetValue.Hidden
            r23 = 6
            r24 = 14
            r3 = 0
            r4 = 0
            r5 = 0
            r1 = r6
            r6 = r9
            r7 = r23
            r8 = r24
            androidx.compose.material.ModalBottomSheetState r2 = j(r2, r3, r4, r5, r6, r7, r8)
            r6 = r1 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x019e
        L_0x019c:
            r1 = r6
            r2 = r5
        L_0x019e:
            if (r18 == 0) goto L_0x01a1
            r12 = 1
        L_0x01a1:
            r1 = r15 & 16
            r3 = 6
            if (r1 == 0) goto L_0x01b3
            androidx.compose.material.MaterialTheme r1 = androidx.compose.material.MaterialTheme.f7937a
            androidx.compose.material.Shapes r1 = r1.b(r9, r3)
            androidx.compose.foundation.shape.CornerBasedShape r1 = r1.a()
            r6 = r6 & r22
            goto L_0x01b5
        L_0x01b3:
            r1 = r44
        L_0x01b5:
            r4 = r15 & 32
            if (r4 == 0) goto L_0x01c2
            androidx.compose.material.ModalBottomSheetDefaults r4 = androidx.compose.material.ModalBottomSheetDefaults.f7982a
            float r4 = r4.b()
            r6 = r6 & r21
            goto L_0x01c4
        L_0x01c2:
            r4 = r45
        L_0x01c4:
            r5 = r15 & 64
            if (r5 == 0) goto L_0x01d5
            androidx.compose.material.MaterialTheme r5 = androidx.compose.material.MaterialTheme.f7937a
            androidx.compose.material.Colors r3 = r5.a(r9, r3)
            long r7 = r3.n()
            r6 = r6 & r20
            goto L_0x01d7
        L_0x01d5:
            r7 = r46
        L_0x01d7:
            r3 = r15 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x01e8
            int r3 = r6 >> 18
            r3 = r3 & 14
            long r10 = androidx.compose.material.ColorsKt.b(r7, r9, r3)
            r3 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r3 = r3 & r6
            r6 = r3
        L_0x01e8:
            r3 = r15 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x01fb
            androidx.compose.material.ModalBottomSheetDefaults r3 = androidx.compose.material.ModalBottomSheetDefaults.f7982a
            r5 = 0
            long r20 = r3.c(r9, r5)
            r3 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r6 = r6 & r3
            r3 = r6
            r5 = r20
            goto L_0x01fe
        L_0x01fb:
            r3 = r6
            r5 = r50
        L_0x01fe:
            r9.U()
            boolean r18 = androidx.compose.runtime.ComposerKt.P()
            if (r18 == 0) goto L_0x0213
            r14 = -1
            java.lang.String r15 = "androidx.compose.material.ModalBottomSheetLayout (ModalBottomSheet.kt:352)"
            r47 = r4
            r4 = -92970288(0xfffffffffa7562d0, float:-3.1852922E35)
            androidx.compose.runtime.ComposerKt.Y(r4, r3, r14, r15)
            goto L_0x0215
        L_0x0213:
            r47 = r4
        L_0x0215:
            java.lang.Object r4 = r9.g()
            androidx.compose.runtime.Composer$Companion r14 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r15 = r14.a()
            if (r4 != r15) goto L_0x022a
            kotlin.coroutines.EmptyCoroutineContext r4 = kotlin.coroutines.EmptyCoroutineContext.f40721z
            kotlinx.coroutines.CoroutineScope r4 = androidx.compose.runtime.EffectsKt.j(r4, r9)
            r9.N(r4)
        L_0x022a:
            kotlinx.coroutines.CoroutineScope r4 = (kotlinx.coroutines.CoroutineScope) r4
            androidx.compose.foundation.gestures.Orientation r15 = androidx.compose.foundation.gestures.Orientation.Vertical
            androidx.compose.ui.Alignment$Companion r17 = androidx.compose.ui.Alignment.f15444a
            r48 = r10
            androidx.compose.ui.Alignment r10 = r17.o()
            r11 = 0
            androidx.compose.ui.layout.MeasurePolicy r10 = androidx.compose.foundation.layout.BoxKt.g(r10, r11)
            int r18 = androidx.compose.runtime.ComposablesKt.a(r9, r11)
            androidx.compose.runtime.CompositionLocalMap r11 = r9.I()
            r50 = r7
            androidx.compose.ui.Modifier r7 = androidx.compose.ui.ComposedModifierKt.e(r9, r0)
            androidx.compose.ui.node.ComposeUiNode$Companion r8 = androidx.compose.ui.node.ComposeUiNode.f17222h
            r35 = r0
            kotlin.jvm.functions.Function0 r0 = r8.a()
            androidx.compose.runtime.Applier r20 = r9.v()
            if (r20 != 0) goto L_0x025a
            androidx.compose.runtime.ComposablesKt.d()
        L_0x025a:
            r9.s()
            boolean r20 = r9.n()
            if (r20 == 0) goto L_0x0267
            r9.y(r0)
            goto L_0x026a
        L_0x0267:
            r9.K()
        L_0x026a:
            androidx.compose.runtime.Composer r0 = androidx.compose.runtime.Updater.b(r9)
            r36 = r1
            kotlin.jvm.functions.Function2 r1 = r8.c()
            androidx.compose.runtime.Updater.g(r0, r10, r1)
            kotlin.jvm.functions.Function2 r1 = r8.e()
            androidx.compose.runtime.Updater.g(r0, r11, r1)
            kotlin.jvm.functions.Function2 r1 = r8.b()
            boolean r10 = r0.n()
            if (r10 != 0) goto L_0x0296
            java.lang.Object r10 = r0.g()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r18)
            boolean r10 = kotlin.jvm.internal.Intrinsics.d(r10, r11)
            if (r10 != 0) goto L_0x02a4
        L_0x0296:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r18)
            r0.N(r10)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r18)
            r0.A(r10, r1)
        L_0x02a4:
            kotlin.jvm.functions.Function2 r1 = r8.d()
            androidx.compose.runtime.Updater.g(r0, r7, r1)
            androidx.compose.foundation.layout.BoxScopeInstance r0 = androidx.compose.foundation.layout.BoxScopeInstance.f3797a
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.f15489d
            r7 = 0
            r10 = 0
            r18 = r15
            r11 = 1
            androidx.compose.ui.Modifier r15 = androidx.compose.foundation.layout.SizeKt.f(r1, r7, r11, r10)
            androidx.compose.ui.Alignment r11 = r17.o()
            r7 = 0
            androidx.compose.ui.layout.MeasurePolicy r11 = androidx.compose.foundation.layout.BoxKt.g(r11, r7)
            int r21 = androidx.compose.runtime.ComposablesKt.a(r9, r7)
            androidx.compose.runtime.CompositionLocalMap r7 = r9.I()
            androidx.compose.ui.Modifier r15 = androidx.compose.ui.ComposedModifierKt.e(r9, r15)
            kotlin.jvm.functions.Function0 r10 = r8.a()
            androidx.compose.runtime.Applier r23 = r9.v()
            if (r23 != 0) goto L_0x02da
            androidx.compose.runtime.ComposablesKt.d()
        L_0x02da:
            r9.s()
            boolean r23 = r9.n()
            if (r23 == 0) goto L_0x02e7
            r9.y(r10)
            goto L_0x02ea
        L_0x02e7:
            r9.K()
        L_0x02ea:
            androidx.compose.runtime.Composer r10 = androidx.compose.runtime.Updater.b(r9)
            r37 = r12
            kotlin.jvm.functions.Function2 r12 = r8.c()
            androidx.compose.runtime.Updater.g(r10, r11, r12)
            kotlin.jvm.functions.Function2 r11 = r8.e()
            androidx.compose.runtime.Updater.g(r10, r7, r11)
            kotlin.jvm.functions.Function2 r7 = r8.b()
            boolean r11 = r10.n()
            if (r11 != 0) goto L_0x0316
            java.lang.Object r11 = r10.g()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r21)
            boolean r11 = kotlin.jvm.internal.Intrinsics.d(r11, r12)
            if (r11 != 0) goto L_0x0324
        L_0x0316:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r21)
            r10.N(r11)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r21)
            r10.A(r11, r7)
        L_0x0324:
            kotlin.jvm.functions.Function2 r7 = r8.d()
            androidx.compose.runtime.Updater.g(r10, r15, r7)
            int r7 = r3 >> 27
            r7 = r7 & 14
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r13.m(r9, r7)
            boolean r7 = r9.l(r2)
            boolean r8 = r9.l(r4)
            r7 = r7 | r8
            java.lang.Object r8 = r9.g()
            if (r7 != 0) goto L_0x034b
            java.lang.Object r7 = r14.a()
            if (r8 != r7) goto L_0x0353
        L_0x034b:
            androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1 r8 = new androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$1$1$1
            r8.<init>(r2, r4)
            r9.N(r8)
        L_0x0353:
            r7 = r8
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            androidx.compose.material.AnchoredDraggableState r8 = r2.d()
            java.lang.Object r8 = r8.x()
            androidx.compose.material.ModalBottomSheetValue r10 = androidx.compose.material.ModalBottomSheetValue.Hidden
            if (r8 == r10) goto L_0x0364
            r8 = 1
            goto L_0x0365
        L_0x0364:
            r8 = 0
        L_0x0365:
            int r11 = r3 >> 24
            r11 = r11 & 14
            r41 = r5
            r43 = r7
            r44 = r8
            r45 = r9
            r46 = r11
            c(r41, r43, r44, r45, r46)
            r9.T()
            androidx.compose.ui.Alignment r7 = r17.m()
            androidx.compose.ui.Modifier r0 = r0.g(r1, r7)
            float r7 = f7988c
            r8 = 1
            r11 = 0
            r12 = 0
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.A(r0, r11, r7, r8, r12)
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.h(r0, r11, r8, r12)
            if (r37 == 0) goto L_0x03c8
            r7 = -892908339(0xffffffffcac74ccd, float:-6530662.5)
            r9.X(r7)
            androidx.compose.material.AnchoredDraggableState r7 = r2.d()
            boolean r7 = r9.W(r7)
            java.lang.Object r8 = r9.g()
            if (r7 != 0) goto L_0x03af
            java.lang.Object r7 = r14.a()
            if (r8 != r7) goto L_0x03ab
            goto L_0x03af
        L_0x03ab:
            r7 = r8
            r8 = r18
            goto L_0x03bc
        L_0x03af:
            androidx.compose.material.AnchoredDraggableState r7 = r2.d()
            r8 = r18
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r7 = a(r7, r8)
            r9.N(r7)
        L_0x03bc:
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r7 = (androidx.compose.ui.input.nestedscroll.NestedScrollConnection) r7
            r11 = 2
            r12 = 0
            androidx.compose.ui.Modifier r7 = androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt.b(r1, r7, r12, r11, r12)
            r9.M()
            goto L_0x03d4
        L_0x03c8:
            r8 = r18
            r7 = -167335778(0xfffffffff606a89e, float:-6.828005E32)
            r9.X(r7)
            r9.M()
            r7 = r1
        L_0x03d4:
            androidx.compose.ui.Modifier r0 = r0.o0(r7)
            androidx.compose.ui.Modifier r26 = i(r0, r2)
            androidx.compose.material.AnchoredDraggableState r27 = r2.d()
            if (r37 == 0) goto L_0x03ef
            androidx.compose.material.AnchoredDraggableState r0 = r2.d()
            java.lang.Object r0 = r0.s()
            if (r0 == r10) goto L_0x03ef
            r29 = 1
            goto L_0x03f1
        L_0x03ef:
            r29 = 0
        L_0x03f1:
            r33 = 56
            r34 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r28 = r8
            androidx.compose.ui.Modifier r0 = androidx.compose.material.AnchoredDraggableKt.e(r26, r27, r28, r29, r30, r31, r32, r33, r34)
            if (r37 == 0) goto L_0x0433
            r7 = -891907876(0xffffffffcad690dc, float:-7030894.0)
            r9.X(r7)
            boolean r7 = r9.l(r2)
            boolean r8 = r9.l(r4)
            r7 = r7 | r8
            java.lang.Object r8 = r9.g()
            if (r7 != 0) goto L_0x041e
            java.lang.Object r7 = r14.a()
            if (r8 != r7) goto L_0x0426
        L_0x041e:
            androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$3$1 r8 = new androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$3$1
            r8.<init>(r2, r4)
            r9.N(r8)
        L_0x0426:
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            r4 = 0
            r7 = 1
            r10 = 0
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.semantics.SemanticsModifierKt.d(r1, r4, r8, r7, r10)
            r9.M()
            goto L_0x043c
        L_0x0433:
            r4 = -167257346(0xfffffffff607dafe, float:-6.888689E32)
            r9.X(r4)
            r9.M()
        L_0x043c:
            androidx.compose.ui.Modifier r0 = r0.o0(r1)
            androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4 r1 = new androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$1$4
            r7 = r40
            r1.<init>(r7)
            r4 = 54
            r8 = 17396558(0x109734e, float:2.5245653E-38)
            r10 = 1
            androidx.compose.runtime.internal.ComposableLambda r24 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r8, r10, r1, r9, r4)
            int r1 = r3 >> 9
            r1 = r1 & 112(0x70, float:1.57E-43)
            r1 = r1 | r16
            int r4 = r3 >> 12
            r8 = r4 & 896(0x380, float:1.256E-42)
            r1 = r1 | r8
            r4 = r4 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r4
            r4 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r4
            r26 = r1 | r3
            r27 = 16
            r22 = 0
            r16 = r0
            r17 = r36
            r18 = r50
            r20 = r48
            r23 = r47
            r25 = r9
            androidx.compose.material.SurfaceKt.a(r16, r17, r18, r20, r22, r23, r24, r25, r26, r27)
            r9.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0483
            androidx.compose.runtime.ComposerKt.X()
        L_0x0483:
            r14 = r48
            r10 = r50
            r3 = r2
            r16 = r5
            r2 = r35
            r5 = r36
            r4 = r37
            r6 = r47
            goto L_0x04a4
        L_0x0493:
            r7 = r40
            r9.B()
            r6 = r45
            r16 = r50
            r2 = r4
            r3 = r5
            r14 = r10
            r4 = r12
            r5 = r44
            r10 = r46
        L_0x04a4:
            androidx.compose.runtime.ScopeUpdateScope r12 = r9.x()
            if (r12 == 0) goto L_0x04ca
            androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2 r9 = new androidx.compose.material.ModalBottomSheetKt$ModalBottomSheetLayout$2
            r0 = r9
            r1 = r40
            r7 = r10
            r11 = r9
            r9 = r14
            r14 = r11
            r15 = r12
            r11 = r16
            r13 = r52
            r38 = r14
            r14 = r54
            r39 = r15
            r15 = r55
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r11, r13, r14, r15)
            r1 = r38
            r0 = r39
            r0.a(r1)
        L_0x04ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ModalBottomSheetKt.b(kotlin.jvm.functions.Function3, androidx.compose.ui.Modifier, androidx.compose.material.ModalBottomSheetState, boolean, androidx.compose.ui.graphics.Shape, float, long, long, long, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void c(long j2, Function0 function0, boolean z2, Composer composer, int i2) {
        int i3;
        Modifier modifier;
        long j3 = j2;
        Function0 function02 = function0;
        boolean z3 = z2;
        int i4 = i2;
        Composer q2 = composer.q(-526532668);
        if ((i4 & 6) == 0) {
            i3 = (q2.j(j3) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        if ((i4 & 48) == 0) {
            i3 |= q2.l(function02) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i3 |= q2.d(z3) ? 256 : 128;
        }
        int i5 = i3;
        if (q2.E((i5 & 147) != 146, i5 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-526532668, i5, -1, "androidx.compose.material.Scrim (ModalBottomSheet.kt:489)");
            }
            if (j3 != 16) {
                q2.X(477792612);
                int i6 = i5;
                State d2 = AnimateAsStateKt.d(z3 ? 1.0f : 0.0f, new TweenSpec(0, 0, (Easing) null, 7, (DefaultConstructorMarker) null), 0.0f, (String) null, (Function1) null, q2, 48, 28);
                String a2 = Strings_androidKt.a(Strings.f8507b.b(), q2, 6);
                if (z3) {
                    q2.X(478010511);
                    Modifier.Companion companion = Modifier.f15489d;
                    int i7 = i6 & 112;
                    boolean z4 = i7 == 32;
                    Object g2 = q2.g();
                    if (z4 || g2 == Composer.f14567a.a()) {
                        g2 = new ModalBottomSheetKt$Scrim$dismissModifier$1$1(function02, (Continuation) null);
                        q2.N(g2);
                    }
                    Modifier e2 = companion.o0(new SuspendPointerInputElement(function02, (Object) null, (Object[]) null, new SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0((Function2) g2), 6, (DefaultConstructorMarker) null));
                    boolean W = (i7 == 32) | q2.W(a2);
                    Object g3 = q2.g();
                    if (W || g3 == Composer.f14567a.a()) {
                        g3 = new ModalBottomSheetKt$Scrim$dismissModifier$2$1(a2, function02);
                        q2.N(g3);
                    }
                    modifier = SemanticsModifierKt.c(e2, true, (Function1) g3);
                    q2.M();
                } else {
                    q2.X(478374234);
                    q2.M();
                    modifier = Modifier.f15489d;
                }
                Modifier o0 = SizeKt.f(Modifier.f15489d, 0.0f, 1, (Object) null).o0(modifier);
                boolean W2 = q2.W(d2) | ((i6 & 14) == 4);
                Object g4 = q2.g();
                if (W2 || g4 == Composer.f14567a.a()) {
                    g4 = new ModalBottomSheetKt$Scrim$1$1(j3, d2);
                    q2.N(g4);
                }
                CanvasKt.b(o0, (Function1) g4, q2, 0);
                q2.M();
            } else {
                q2.X(478559490);
                q2.M();
            }
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new ModalBottomSheetKt$Scrim$2(j2, function0, z2, i2));
        }
    }

    public static final float d(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    public static final Modifier i(Modifier modifier, ModalBottomSheetState modalBottomSheetState) {
        return AnchoredDraggableKt.h(modifier, modalBottomSheetState.d(), Orientation.Vertical, new ModalBottomSheetKt$modalBottomSheetAnchors$1(modalBottomSheetState));
    }

    public static final ModalBottomSheetState j(ModalBottomSheetValue modalBottomSheetValue, AnimationSpec animationSpec, Function1 function1, boolean z2, Composer composer, int i2, int i3) {
        ModalBottomSheetValue modalBottomSheetValue2 = modalBottomSheetValue;
        Composer composer2 = composer;
        int i4 = i2;
        AnimationSpec a2 = (i3 & 2) != 0 ? ModalBottomSheetDefaults.f7982a.a() : animationSpec;
        ModalBottomSheetKt$rememberModalBottomSheetState$1 modalBottomSheetKt$rememberModalBottomSheetState$1 = (i3 & 4) != 0 ? ModalBottomSheetKt$rememberModalBottomSheetState$1.f8019z : function1;
        boolean z3 = false;
        boolean z4 = (i3 & 8) != 0 ? false : z2;
        if (ComposerKt.P()) {
            ComposerKt.Y(-126412120, i4, -1, "androidx.compose.material.rememberModalBottomSheetState (ModalBottomSheet.kt:277)");
        }
        Density density = (Density) composer2.C(CompositionLocalsKt.g());
        composer2.r(976451635, modalBottomSheetValue);
        Object[] objArr = {modalBottomSheetValue, a2, Boolean.valueOf(z4), modalBottomSheetKt$rememberModalBottomSheetState$1, density};
        Saver a3 = ModalBottomSheetState.f8023d.a(a2, modalBottomSheetKt$rememberModalBottomSheetState$1, z4, density);
        boolean W = ((((i4 & 14) ^ 6) > 4 && composer2.W(modalBottomSheetValue)) || (i4 & 6) == 4) | composer2.W(density) | ((((i4 & 896) ^ 384) > 256 && composer2.W(modalBottomSheetKt$rememberModalBottomSheetState$1)) || (i4 & 384) == 256) | composer2.l(a2);
        if ((((i4 & 7168) ^ 3072) > 2048 && composer2.d(z4)) || (i4 & 3072) == 2048) {
            z3 = true;
        }
        boolean z5 = W | z3;
        Object g2 = composer.g();
        if (z5 || g2 == Composer.f14567a.a()) {
            ModalBottomSheetKt$rememberModalBottomSheetState$2$1 modalBottomSheetKt$rememberModalBottomSheetState$2$1 = new ModalBottomSheetKt$rememberModalBottomSheetState$2$1(modalBottomSheetValue, density, modalBottomSheetKt$rememberModalBottomSheetState$1, a2, z4);
            composer2.N(modalBottomSheetKt$rememberModalBottomSheetState$2$1);
            g2 = modalBottomSheetKt$rememberModalBottomSheetState$2$1;
        }
        ModalBottomSheetState modalBottomSheetState = (ModalBottomSheetState) RememberSaveableKt.h(objArr, a3, (String) null, (Function0) g2, composer, 0, 4);
        composer.Q();
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return modalBottomSheetState;
    }
}
