package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class DrawerKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f7706a;

    /* renamed from: b  reason: collision with root package name */
    public static final float f7707b;

    /* renamed from: c  reason: collision with root package name */
    public static final float f7708c = Dp.m((float) 400);

    /* renamed from: d  reason: collision with root package name */
    public static final TweenSpec f7709d = new TweenSpec(256, 0, (Easing) null, 6, (DefaultConstructorMarker) null);

    static {
        float f2 = (float) 56;
        f7706a = Dp.m(f2);
        f7707b = Dp.m(f2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x028d  */
    /* JADX WARNING: Removed duplicated region for block: B:175:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x010a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(kotlin.jvm.functions.Function3 r36, androidx.compose.ui.Modifier r37, androidx.compose.material.BottomDrawerState r38, boolean r39, androidx.compose.ui.graphics.Shape r40, float r41, long r42, long r44, long r46, kotlin.jvm.functions.Function2 r48, androidx.compose.runtime.Composer r49, int r50, int r51) {
        /*
            r14 = r50
            r15 = r51
            r0 = 625649286(0x254aa686, float:1.7577127E-16)
            r1 = r49
            androidx.compose.runtime.Composer r7 = r1.q(r0)
            r1 = r15 & 1
            if (r1 == 0) goto L_0x0016
            r1 = r14 | 6
            r8 = r36
            goto L_0x0028
        L_0x0016:
            r1 = r14 & 6
            r8 = r36
            if (r1 != 0) goto L_0x0027
            boolean r1 = r7.l(r8)
            if (r1 == 0) goto L_0x0024
            r1 = 4
            goto L_0x0025
        L_0x0024:
            r1 = 2
        L_0x0025:
            r1 = r1 | r14
            goto L_0x0028
        L_0x0027:
            r1 = r14
        L_0x0028:
            r2 = r15 & 2
            if (r2 == 0) goto L_0x0031
            r1 = r1 | 48
        L_0x002e:
            r3 = r37
            goto L_0x0043
        L_0x0031:
            r3 = r14 & 48
            if (r3 != 0) goto L_0x002e
            r3 = r37
            boolean r4 = r7.W(r3)
            if (r4 == 0) goto L_0x0040
            r4 = 32
            goto L_0x0042
        L_0x0040:
            r4 = 16
        L_0x0042:
            r1 = r1 | r4
        L_0x0043:
            r4 = r14 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x005c
            r4 = r15 & 4
            if (r4 != 0) goto L_0x0056
            r4 = r38
            boolean r5 = r7.l(r4)
            if (r5 == 0) goto L_0x0058
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x005a
        L_0x0056:
            r4 = r38
        L_0x0058:
            r5 = 128(0x80, float:1.794E-43)
        L_0x005a:
            r1 = r1 | r5
            goto L_0x005e
        L_0x005c:
            r4 = r38
        L_0x005e:
            r9 = r15 & 8
            if (r9 == 0) goto L_0x0067
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            r10 = r39
            goto L_0x0079
        L_0x0067:
            r5 = r14 & 3072(0xc00, float:4.305E-42)
            r10 = r39
            if (r5 != 0) goto L_0x0079
            boolean r5 = r7.d(r10)
            if (r5 == 0) goto L_0x0076
            r5 = 2048(0x800, float:2.87E-42)
            goto L_0x0078
        L_0x0076:
            r5 = 1024(0x400, float:1.435E-42)
        L_0x0078:
            r1 = r1 | r5
        L_0x0079:
            r5 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r5 != 0) goto L_0x0090
            r5 = r15 & 16
            r11 = r40
            if (r5 != 0) goto L_0x008c
            boolean r5 = r7.W(r11)
            if (r5 == 0) goto L_0x008c
            r5 = 16384(0x4000, float:2.2959E-41)
            goto L_0x008e
        L_0x008c:
            r5 = 8192(0x2000, float:1.14794E-41)
        L_0x008e:
            r1 = r1 | r5
            goto L_0x0092
        L_0x0090:
            r11 = r40
        L_0x0092:
            r12 = r15 & 32
            r5 = 196608(0x30000, float:2.75506E-40)
            if (r12 == 0) goto L_0x009c
            r1 = r1 | r5
            r13 = r41
            goto L_0x00ad
        L_0x009c:
            r5 = r5 & r14
            r13 = r41
            if (r5 != 0) goto L_0x00ad
            boolean r5 = r7.h(r13)
            if (r5 == 0) goto L_0x00aa
            r5 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ac
        L_0x00aa:
            r5 = 65536(0x10000, float:9.18355E-41)
        L_0x00ac:
            r1 = r1 | r5
        L_0x00ad:
            r5 = 1572864(0x180000, float:2.204052E-39)
            r5 = r5 & r14
            if (r5 != 0) goto L_0x00c8
            r5 = r15 & 64
            if (r5 != 0) goto L_0x00c1
            r5 = r42
            boolean r16 = r7.j(r5)
            if (r16 == 0) goto L_0x00c3
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c5
        L_0x00c1:
            r5 = r42
        L_0x00c3:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00c5:
            r1 = r1 | r16
            goto L_0x00ca
        L_0x00c8:
            r5 = r42
        L_0x00ca:
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            r16 = r14 & r16
            if (r16 != 0) goto L_0x00e3
            r0 = r15 & 128(0x80, float:1.794E-43)
            r5 = r44
            if (r0 != 0) goto L_0x00df
            boolean r0 = r7.j(r5)
            if (r0 == 0) goto L_0x00df
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e1
        L_0x00df:
            r0 = 4194304(0x400000, float:5.877472E-39)
        L_0x00e1:
            r1 = r1 | r0
            goto L_0x00e5
        L_0x00e3:
            r5 = r44
        L_0x00e5:
            r0 = 100663296(0x6000000, float:2.4074124E-35)
            r0 = r0 & r14
            if (r0 != 0) goto L_0x00fd
            r0 = r15 & 256(0x100, float:3.59E-43)
            r5 = r46
            if (r0 != 0) goto L_0x00f9
            boolean r0 = r7.j(r5)
            if (r0 == 0) goto L_0x00f9
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x00fb
        L_0x00f9:
            r0 = 33554432(0x2000000, float:9.403955E-38)
        L_0x00fb:
            r1 = r1 | r0
            goto L_0x00ff
        L_0x00fd:
            r5 = r46
        L_0x00ff:
            r0 = r15 & 512(0x200, float:7.175E-43)
            r17 = 805306368(0x30000000, float:4.656613E-10)
            if (r0 == 0) goto L_0x010a
            r1 = r1 | r17
        L_0x0107:
            r0 = r48
            goto L_0x011d
        L_0x010a:
            r0 = r14 & r17
            if (r0 != 0) goto L_0x0107
            r0 = r48
            boolean r17 = r7.l(r0)
            if (r17 == 0) goto L_0x0119
            r17 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x011b
        L_0x0119:
            r17 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x011b:
            r1 = r1 | r17
        L_0x011d:
            r17 = 306783379(0x12492493, float:6.34695E-28)
            r0 = r1 & r17
            r3 = 306783378(0x12492492, float:6.3469493E-28)
            r6 = 1
            if (r0 == r3) goto L_0x012a
            r0 = r6
            goto L_0x012b
        L_0x012a:
            r0 = 0
        L_0x012b:
            r3 = r1 & 1
            boolean r0 = r7.E(r0, r3)
            if (r0 == 0) goto L_0x0278
            r7.p()
            r0 = r14 & 1
            r17 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r18 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r19 = -3670017(0xffffffffffc7ffff, float:NaN)
            r20 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x017c
            boolean r0 = r7.J()
            if (r0 == 0) goto L_0x014d
            goto L_0x017c
        L_0x014d:
            r7.B()
            r0 = r15 & 4
            if (r0 == 0) goto L_0x0156
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0156:
            r0 = r15 & 16
            if (r0 == 0) goto L_0x015c
            r1 = r1 & r20
        L_0x015c:
            r0 = r15 & 64
            if (r0 == 0) goto L_0x0162
            r1 = r1 & r19
        L_0x0162:
            r0 = r15 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0168
            r1 = r1 & r18
        L_0x0168:
            r0 = r15 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x016e
            r1 = r1 & r17
        L_0x016e:
            r30 = r44
            r32 = r46
            r2 = r1
            r0 = r6
            r3 = r11
            r5 = r13
            r1 = r37
            r11 = r42
            goto L_0x01fd
        L_0x017c:
            if (r2 == 0) goto L_0x0181
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            goto L_0x0183
        L_0x0181:
            r0 = r37
        L_0x0183:
            r2 = r15 & 4
            if (r2 == 0) goto L_0x01a2
            androidx.compose.material.BottomDrawerValue r2 = androidx.compose.material.BottomDrawerValue.Closed
            r5 = 6
            r21 = 6
            r3 = 0
            r4 = 0
            r30 = r1
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r7
            r37 = r0
            r0 = r6
            r6 = r21
            androidx.compose.material.BottomDrawerState r1 = q(r1, r2, r3, r4, r5, r6)
            r2 = r30
            r2 = r2 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x01a7
        L_0x01a2:
            r37 = r0
            r2 = r1
            r0 = r6
            r1 = r4
        L_0x01a7:
            if (r9 == 0) goto L_0x01aa
            r10 = r0
        L_0x01aa:
            r3 = r15 & 16
            r4 = 6
            if (r3 == 0) goto L_0x01b8
            androidx.compose.material.DrawerDefaults r3 = androidx.compose.material.DrawerDefaults.f7703a
            androidx.compose.ui.graphics.Shape r3 = r3.e(r7, r4)
            r2 = r2 & r20
            goto L_0x01b9
        L_0x01b8:
            r3 = r11
        L_0x01b9:
            if (r12 == 0) goto L_0x01c2
            androidx.compose.material.DrawerDefaults r5 = androidx.compose.material.DrawerDefaults.f7703a
            float r5 = r5.c()
            goto L_0x01c3
        L_0x01c2:
            r5 = r13
        L_0x01c3:
            r6 = r15 & 64
            if (r6 == 0) goto L_0x01d0
            androidx.compose.material.DrawerDefaults r6 = androidx.compose.material.DrawerDefaults.f7703a
            long r11 = r6.b(r7, r4)
            r2 = r2 & r19
            goto L_0x01d2
        L_0x01d0:
            r11 = r42
        L_0x01d2:
            r6 = r15 & 128(0x80, float:1.794E-43)
            if (r6 == 0) goto L_0x01e1
            int r6 = r2 >> 18
            r6 = r6 & 14
            long r19 = androidx.compose.material.ColorsKt.b(r11, r7, r6)
            r2 = r2 & r18
            goto L_0x01e3
        L_0x01e1:
            r19 = r44
        L_0x01e3:
            r6 = r15 & 256(0x100, float:3.59E-43)
            if (r6 == 0) goto L_0x01f7
            androidx.compose.material.DrawerDefaults r6 = androidx.compose.material.DrawerDefaults.f7703a
            long r21 = r6.d(r7, r4)
            r2 = r2 & r17
            r4 = r1
            r30 = r19
            r32 = r21
        L_0x01f4:
            r1 = r37
            goto L_0x01fd
        L_0x01f7:
            r32 = r46
            r4 = r1
            r30 = r19
            goto L_0x01f4
        L_0x01fd:
            r7.U()
            boolean r6 = androidx.compose.runtime.ComposerKt.P()
            if (r6 == 0) goto L_0x020f
            r6 = -1
            java.lang.String r9 = "androidx.compose.material.BottomDrawer (Drawer.kt:592)"
            r13 = 625649286(0x254aa686, float:1.7577127E-16)
            androidx.compose.runtime.ComposerKt.Y(r13, r2, r6, r9)
        L_0x020f:
            java.lang.Object r2 = r7.g()
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r6 = r6.a()
            if (r2 != r6) goto L_0x0224
            kotlin.coroutines.EmptyCoroutineContext r2 = kotlin.coroutines.EmptyCoroutineContext.f40721z
            kotlinx.coroutines.CoroutineScope r2 = androidx.compose.runtime.EffectsKt.j(r2, r7)
            r7.N(r2)
        L_0x0224:
            r22 = r2
            kotlinx.coroutines.CoroutineScope r22 = (kotlinx.coroutines.CoroutineScope) r22
            r2 = 0
            r6 = 0
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.f(r1, r2, r0, r6)
            androidx.compose.material.DrawerKt$BottomDrawer$1 r6 = new androidx.compose.material.DrawerKt$BottomDrawer$1
            r16 = r6
            r17 = r10
            r18 = r4
            r19 = r48
            r20 = r32
            r23 = r3
            r24 = r11
            r26 = r30
            r28 = r5
            r29 = r36
            r16.<init>(r17, r18, r19, r20, r22, r23, r24, r26, r28, r29)
            r9 = 54
            r13 = 1220102512(0x48b94970, float:379467.5)
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r13, r0, r6, r7, r9)
            r6 = 3072(0xc00, float:4.305E-42)
            r9 = 6
            r13 = 0
            r16 = 0
            r37 = r2
            r38 = r13
            r39 = r16
            r40 = r0
            r41 = r7
            r42 = r6
            r43 = r9
            androidx.compose.foundation.layout.BoxWithConstraintsKt.a(r37, r38, r39, r40, r41, r42, r43)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0270
            androidx.compose.runtime.ComposerKt.X()
        L_0x0270:
            r2 = r1
            r6 = r5
            r5 = r3
            r3 = r4
            r4 = r10
            r9 = r30
            goto L_0x0287
        L_0x0278:
            r7.B()
            r2 = r37
            r32 = r46
            r3 = r4
            r4 = r10
            r5 = r11
            r6 = r13
            r11 = r42
            r9 = r44
        L_0x0287:
            androidx.compose.runtime.ScopeUpdateScope r13 = r7.x()
            if (r13 == 0) goto L_0x02a9
            androidx.compose.material.DrawerKt$BottomDrawer$2 r7 = new androidx.compose.material.DrawerKt$BottomDrawer$2
            r0 = r7
            r1 = r36
            r34 = r7
            r7 = r11
            r11 = r32
            r35 = r13
            r13 = r48
            r14 = r50
            r15 = r51
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r11, r13, r14, r15)
            r1 = r34
            r0 = r35
            r0.a(r1)
        L_0x02a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DrawerKt.a(kotlin.jvm.functions.Function3, androidx.compose.ui.Modifier, androidx.compose.material.BottomDrawerState, boolean, androidx.compose.ui.graphics.Shape, float, long, long, long, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(long j2, Function0 function0, boolean z2, Composer composer, int i2) {
        int i3;
        Modifier modifier;
        long j3 = j2;
        Function0 function02 = function0;
        boolean z3 = z2;
        int i4 = i2;
        Composer q2 = composer.q(-513067266);
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
                ComposerKt.Y(-513067266, i5, -1, "androidx.compose.material.BottomDrawerScrim (Drawer.kt:729)");
            }
            if (j3 != 16) {
                q2.X(1552573422);
                int i6 = i5;
                State d2 = AnimateAsStateKt.d(z3 ? 1.0f : 0.0f, new TweenSpec(0, 0, (Easing) null, 7, (DefaultConstructorMarker) null), 0.0f, (String) null, (Function1) null, q2, 48, 28);
                String a2 = Strings_androidKt.a(Strings.f8507b.a(), q2, 6);
                if (z3) {
                    q2.X(1552793770);
                    Modifier.Companion companion = Modifier.f15489d;
                    int i7 = i6 & 112;
                    boolean z4 = i7 == 32;
                    Object g2 = q2.g();
                    if (z4 || g2 == Composer.f14567a.a()) {
                        g2 = new DrawerKt$BottomDrawerScrim$dismissModifier$1$1(function02, (Continuation) null);
                        q2.N(g2);
                    }
                    Modifier e2 = companion.o0(new SuspendPointerInputElement(function02, (Object) null, (Object[]) null, new SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0((Function2) g2), 6, (DefaultConstructorMarker) null));
                    boolean W = (i7 == 32) | q2.W(a2);
                    Object g3 = q2.g();
                    if (W || g3 == Composer.f14567a.a()) {
                        g3 = new DrawerKt$BottomDrawerScrim$dismissModifier$2$1(a2, function02);
                        q2.N(g3);
                    }
                    modifier = SemanticsModifierKt.c(e2, true, (Function1) g3);
                    q2.M();
                } else {
                    q2.X(1553158454);
                    q2.M();
                    modifier = Modifier.f15489d;
                }
                Modifier o0 = SizeKt.f(Modifier.f15489d, 0.0f, 1, (Object) null).o0(modifier);
                boolean W2 = q2.W(d2) | ((i6 & 14) == 4);
                Object g4 = q2.g();
                if (W2 || g4 == Composer.f14567a.a()) {
                    g4 = new DrawerKt$BottomDrawerScrim$1$1(j3, d2);
                    q2.N(g4);
                }
                CanvasKt.b(o0, (Function1) g4, q2, 0);
                q2.M();
            } else {
                q2.X(1553326846);
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
            x2.a(new DrawerKt$BottomDrawerScrim$2(j2, function0, z2, i2));
        }
    }

    public static final float c(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    public static final NestedScrollConnection d(AnchoredDraggableState anchoredDraggableState) {
        return new DrawerKt$ConsumeSwipeWithinBottomSheetBoundsNestedScrollConnection$1(anchoredDraggableState);
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x026b  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:176:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x010d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(kotlin.jvm.functions.Function3 r34, androidx.compose.ui.Modifier r35, androidx.compose.material.DrawerState r36, boolean r37, androidx.compose.ui.graphics.Shape r38, float r39, long r40, long r42, long r44, kotlin.jvm.functions.Function2 r46, androidx.compose.runtime.Composer r47, int r48, int r49) {
        /*
            r14 = r48
            r15 = r49
            r0 = 1305806945(0x4dd50861, float:4.46762016E8)
            r1 = r47
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r15 & 1
            if (r2 == 0) goto L_0x0017
            r2 = r14 | 6
            r4 = r2
            r2 = r34
            goto L_0x002b
        L_0x0017:
            r2 = r14 & 6
            if (r2 != 0) goto L_0x0028
            r2 = r34
            boolean r4 = r1.l(r2)
            if (r4 == 0) goto L_0x0025
            r4 = 4
            goto L_0x0026
        L_0x0025:
            r4 = 2
        L_0x0026:
            r4 = r4 | r14
            goto L_0x002b
        L_0x0028:
            r2 = r34
            r4 = r14
        L_0x002b:
            r5 = r15 & 2
            if (r5 == 0) goto L_0x0034
            r4 = r4 | 48
        L_0x0031:
            r6 = r35
            goto L_0x0046
        L_0x0034:
            r6 = r14 & 48
            if (r6 != 0) goto L_0x0031
            r6 = r35
            boolean r7 = r1.W(r6)
            if (r7 == 0) goto L_0x0043
            r7 = 32
            goto L_0x0045
        L_0x0043:
            r7 = 16
        L_0x0045:
            r4 = r4 | r7
        L_0x0046:
            r7 = r14 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x005f
            r7 = r15 & 4
            if (r7 != 0) goto L_0x0059
            r7 = r36
            boolean r8 = r1.W(r7)
            if (r8 == 0) goto L_0x005b
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x0059:
            r7 = r36
        L_0x005b:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r4 = r4 | r8
            goto L_0x0061
        L_0x005f:
            r7 = r36
        L_0x0061:
            r8 = r15 & 8
            if (r8 == 0) goto L_0x006a
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r9 = r37
            goto L_0x007c
        L_0x006a:
            r9 = r14 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0067
            r9 = r37
            boolean r10 = r1.d(r9)
            if (r10 == 0) goto L_0x0079
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r4 = r4 | r10
        L_0x007c:
            r10 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r10 != 0) goto L_0x0095
            r10 = r15 & 16
            if (r10 != 0) goto L_0x008f
            r10 = r38
            boolean r11 = r1.W(r10)
            if (r11 == 0) goto L_0x0091
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0093
        L_0x008f:
            r10 = r38
        L_0x0091:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x0093:
            r4 = r4 | r11
            goto L_0x0097
        L_0x0095:
            r10 = r38
        L_0x0097:
            r11 = r15 & 32
            r12 = 196608(0x30000, float:2.75506E-40)
            if (r11 == 0) goto L_0x00a1
            r4 = r4 | r12
        L_0x009e:
            r12 = r39
            goto L_0x00b2
        L_0x00a1:
            r12 = r12 & r14
            if (r12 != 0) goto L_0x009e
            r12 = r39
            boolean r13 = r1.h(r12)
            if (r13 == 0) goto L_0x00af
            r13 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b1
        L_0x00af:
            r13 = 65536(0x10000, float:9.18355E-41)
        L_0x00b1:
            r4 = r4 | r13
        L_0x00b2:
            r13 = 1572864(0x180000, float:2.204052E-39)
            r13 = r13 & r14
            if (r13 != 0) goto L_0x00cf
            r13 = r15 & 64
            if (r13 != 0) goto L_0x00c7
            r13 = r4
            r3 = r40
            boolean r16 = r1.j(r3)
            if (r16 == 0) goto L_0x00ca
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cc
        L_0x00c7:
            r13 = r4
            r3 = r40
        L_0x00ca:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x00cc:
            r13 = r13 | r16
            goto L_0x00d2
        L_0x00cf:
            r13 = r4
            r3 = r40
        L_0x00d2:
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            r16 = r14 & r16
            if (r16 != 0) goto L_0x00eb
            r0 = r15 & 128(0x80, float:1.794E-43)
            r2 = r42
            if (r0 != 0) goto L_0x00e7
            boolean r0 = r1.j(r2)
            if (r0 == 0) goto L_0x00e7
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00e9
        L_0x00e7:
            r0 = 4194304(0x400000, float:5.877472E-39)
        L_0x00e9:
            r13 = r13 | r0
            goto L_0x00ed
        L_0x00eb:
            r2 = r42
        L_0x00ed:
            r0 = 100663296(0x6000000, float:2.4074124E-35)
            r0 = r0 & r14
            if (r0 != 0) goto L_0x0105
            r0 = r15 & 256(0x100, float:3.59E-43)
            r2 = r44
            if (r0 != 0) goto L_0x0101
            boolean r0 = r1.j(r2)
            if (r0 == 0) goto L_0x0101
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0103
        L_0x0101:
            r0 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0103:
            r13 = r13 | r0
            goto L_0x0107
        L_0x0105:
            r2 = r44
        L_0x0107:
            r0 = r15 & 512(0x200, float:7.175E-43)
            r4 = 805306368(0x30000000, float:4.656613E-10)
            if (r0 == 0) goto L_0x0111
            r13 = r13 | r4
            r4 = r46
            goto L_0x0123
        L_0x0111:
            r0 = r14 & r4
            r4 = r46
            if (r0 != 0) goto L_0x0123
            boolean r0 = r1.l(r4)
            if (r0 == 0) goto L_0x0120
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0122
        L_0x0120:
            r0 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0122:
            r13 = r13 | r0
        L_0x0123:
            r0 = 306783379(0x12492493, float:6.34695E-28)
            r0 = r0 & r13
            r2 = 306783378(0x12492492, float:6.3469493E-28)
            if (r0 == r2) goto L_0x012e
            r0 = 1
            goto L_0x012f
        L_0x012e:
            r0 = 0
        L_0x012f:
            r2 = r13 & 1
            boolean r0 = r1.E(r0, r2)
            if (r0 == 0) goto L_0x026b
            r1.p()
            r0 = r14 & 1
            r2 = 0
            r17 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r18 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r19 = -3670017(0xffffffffffc7ffff, float:NaN)
            r20 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x0180
            boolean r0 = r1.J()
            if (r0 == 0) goto L_0x0152
            goto L_0x0180
        L_0x0152:
            r1.B()
            r0 = r15 & 4
            if (r0 == 0) goto L_0x015b
            r13 = r13 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x015b:
            r0 = r15 & 16
            if (r0 == 0) goto L_0x0161
            r13 = r13 & r20
        L_0x0161:
            r0 = r15 & 64
            if (r0 == 0) goto L_0x0167
            r13 = r13 & r19
        L_0x0167:
            r0 = r15 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x016d
            r13 = r13 & r18
        L_0x016d:
            r0 = r15 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0173
            r13 = r13 & r17
        L_0x0173:
            r30 = r44
            r0 = r6
            r5 = r7
            r7 = r10
            r8 = r12
            r6 = r13
            r10 = r40
            r12 = r42
            goto L_0x01e9
        L_0x0180:
            if (r5 == 0) goto L_0x0185
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            goto L_0x0186
        L_0x0185:
            r0 = r6
        L_0x0186:
            r5 = r15 & 4
            r6 = 6
            if (r5 == 0) goto L_0x0195
            androidx.compose.material.DrawerValue r5 = androidx.compose.material.DrawerValue.Closed
            r7 = 2
            androidx.compose.material.DrawerState r5 = r(r5, r2, r1, r6, r7)
            r13 = r13 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x0196
        L_0x0195:
            r5 = r7
        L_0x0196:
            if (r8 == 0) goto L_0x0199
            r9 = 1
        L_0x0199:
            r7 = r15 & 16
            if (r7 == 0) goto L_0x01a6
            androidx.compose.material.DrawerDefaults r7 = androidx.compose.material.DrawerDefaults.f7703a
            androidx.compose.ui.graphics.Shape r7 = r7.e(r1, r6)
            r13 = r13 & r20
            goto L_0x01a7
        L_0x01a6:
            r7 = r10
        L_0x01a7:
            if (r11 == 0) goto L_0x01b0
            androidx.compose.material.DrawerDefaults r8 = androidx.compose.material.DrawerDefaults.f7703a
            float r8 = r8.c()
            goto L_0x01b1
        L_0x01b0:
            r8 = r12
        L_0x01b1:
            r10 = r15 & 64
            if (r10 == 0) goto L_0x01be
            androidx.compose.material.DrawerDefaults r10 = androidx.compose.material.DrawerDefaults.f7703a
            long r10 = r10.b(r1, r6)
            r13 = r13 & r19
            goto L_0x01c0
        L_0x01be:
            r10 = r40
        L_0x01c0:
            r12 = r15 & 128(0x80, float:1.794E-43)
            if (r12 == 0) goto L_0x01d0
            int r12 = r13 >> 18
            r12 = r12 & 14
            long r19 = androidx.compose.material.ColorsKt.b(r10, r1, r12)
            r12 = r13 & r18
            r13 = r12
            goto L_0x01d2
        L_0x01d0:
            r19 = r42
        L_0x01d2:
            r12 = r15 & 256(0x100, float:3.59E-43)
            if (r12 == 0) goto L_0x01e4
            androidx.compose.material.DrawerDefaults r12 = androidx.compose.material.DrawerDefaults.f7703a
            long r21 = r12.d(r1, r6)
            r13 = r13 & r17
            r6 = r13
            r12 = r19
            r30 = r21
            goto L_0x01e9
        L_0x01e4:
            r30 = r44
            r6 = r13
            r12 = r19
        L_0x01e9:
            r1.U()
            boolean r17 = androidx.compose.runtime.ComposerKt.P()
            if (r17 == 0) goto L_0x01fb
            r2 = -1
            java.lang.String r3 = "androidx.compose.material.ModalDrawer (Drawer.kt:465)"
            r4 = 1305806945(0x4dd50861, float:4.46762016E8)
            androidx.compose.runtime.ComposerKt.Y(r4, r6, r2, r3)
        L_0x01fb:
            java.lang.Object r2 = r1.g()
            androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r3 = r3.a()
            if (r2 != r3) goto L_0x0210
            kotlin.coroutines.EmptyCoroutineContext r2 = kotlin.coroutines.EmptyCoroutineContext.f40721z
            kotlinx.coroutines.CoroutineScope r2 = androidx.compose.runtime.EffectsKt.j(r2, r1)
            r1.N(r2)
        L_0x0210:
            r19 = r2
            kotlinx.coroutines.CoroutineScope r19 = (kotlinx.coroutines.CoroutineScope) r19
            r2 = 0
            r3 = 1
            r4 = 0
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.f(r0, r2, r3, r4)
            androidx.compose.material.DrawerKt$ModalDrawer$1 r3 = new androidx.compose.material.DrawerKt$ModalDrawer$1
            r16 = r3
            r17 = r5
            r18 = r9
            r20 = r30
            r22 = r7
            r23 = r10
            r25 = r12
            r27 = r8
            r28 = r46
            r29 = r34
            r16.<init>(r17, r18, r19, r20, r22, r23, r25, r27, r28, r29)
            r4 = 54
            r6 = 816674999(0x30ad78b7, float:1.2621716E-9)
            r16 = r0
            r0 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r6, r0, r3, r1, r4)
            r3 = 3072(0xc00, float:4.305E-42)
            r4 = 6
            r6 = 0
            r17 = 0
            r35 = r2
            r36 = r6
            r37 = r17
            r38 = r0
            r39 = r1
            r40 = r3
            r41 = r4
            androidx.compose.foundation.layout.BoxWithConstraintsKt.a(r35, r36, r37, r38, r39, r40, r41)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0260
            androidx.compose.runtime.ComposerKt.X()
        L_0x0260:
            r3 = r5
            r5 = r7
            r6 = r8
            r4 = r9
            r7 = r10
            r9 = r12
            r2 = r16
            r11 = r30
            goto L_0x0279
        L_0x026b:
            r1.B()
            r2 = r6
            r3 = r7
            r4 = r9
            r5 = r10
            r6 = r12
            r7 = r40
            r9 = r42
            r11 = r44
        L_0x0279:
            androidx.compose.runtime.ScopeUpdateScope r13 = r1.x()
            if (r13 == 0) goto L_0x0298
            androidx.compose.material.DrawerKt$ModalDrawer$2 r1 = new androidx.compose.material.DrawerKt$ModalDrawer$2
            r0 = r1
            r32 = r1
            r1 = r34
            r33 = r13
            r13 = r46
            r14 = r48
            r15 = r49
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r11, r13, r14, r15)
            r1 = r32
            r0 = r33
            r0.a(r1)
        L_0x0298:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DrawerKt.e(kotlin.jvm.functions.Function3, androidx.compose.ui.Modifier, androidx.compose.material.DrawerState, boolean, androidx.compose.ui.graphics.Shape, float, long, long, long, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void f(boolean z2, Function0 function0, Function0 function02, long j2, Composer composer, int i2) {
        int i3;
        Modifier modifier;
        boolean z3 = z2;
        Function0 function03 = function0;
        Function0 function04 = function02;
        long j3 = j2;
        int i4 = i2;
        Composer q2 = composer.q(1983403750);
        if ((i4 & 6) == 0) {
            i3 = (q2.d(z3) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        if ((i4 & 48) == 0) {
            i3 |= q2.l(function03) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i3 |= q2.l(function04) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i3 |= q2.j(j3) ? 2048 : 1024;
        }
        boolean z4 = true;
        if (q2.E((i3 & 1171) != 1170, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(1983403750, i3, -1, "androidx.compose.material.Scrim (Drawer.kt:755)");
            }
            String a2 = Strings_androidKt.a(Strings.f8507b.a(), q2, 6);
            if (z3) {
                q2.X(487534424);
                Modifier.Companion companion = Modifier.f15489d;
                int i5 = i3 & 112;
                boolean z5 = i5 == 32;
                Object g2 = q2.g();
                if (z5 || g2 == Composer.f14567a.a()) {
                    g2 = new DrawerKt$Scrim$dismissDrawer$1$1(function03, (Continuation) null);
                    q2.N(g2);
                }
                Modifier e2 = companion.o0(new SuspendPointerInputElement(function03, (Object) null, (Object[]) null, new SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0((Function2) g2), 6, (DefaultConstructorMarker) null));
                boolean W = (i5 == 32) | q2.W(a2);
                Object g3 = q2.g();
                if (W || g3 == Composer.f14567a.a()) {
                    g3 = new DrawerKt$Scrim$dismissDrawer$2$1(a2, function03);
                    q2.N(g3);
                }
                modifier = SemanticsModifierKt.c(e2, true, (Function1) g3);
                q2.M();
            } else {
                q2.X(487858498);
                q2.M();
                modifier = Modifier.f15489d;
            }
            Modifier o0 = SizeKt.f(Modifier.f15489d, 0.0f, 1, (Object) null).o0(modifier);
            boolean z6 = (i3 & 7168) == 2048;
            if ((i3 & 896) != 256) {
                z4 = false;
            }
            boolean z7 = z6 | z4;
            Object g4 = q2.g();
            if (z7 || g4 == Composer.f14567a.a()) {
                g4 = new DrawerKt$Scrim$1$1(j3, function04);
                q2.N(g4);
            }
            CanvasKt.b(o0, (Function1) g4, q2, 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new DrawerKt$Scrim$2(z2, function0, function02, j2, i2));
        }
    }

    public static final float p(float f2, float f3, float f4) {
        float f5 = (f4 - f2) / (f3 - f2);
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        if (f5 > 1.0f) {
            return 1.0f;
        }
        return f5;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.material.BottomDrawerState q(androidx.compose.material.BottomDrawerValue r8, kotlin.jvm.functions.Function1 r9, androidx.compose.animation.core.AnimationSpec r10, androidx.compose.runtime.Composer r11, int r12, int r13) {
        /*
            r0 = r13 & 2
            if (r0 == 0) goto L_0x0006
            androidx.compose.material.DrawerKt$rememberBottomDrawerState$1 r9 = androidx.compose.material.DrawerKt$rememberBottomDrawerState$1.f7777z
        L_0x0006:
            r0 = 4
            r13 = r13 & r0
            if (r13 == 0) goto L_0x0010
            androidx.compose.material.DrawerDefaults r10 = androidx.compose.material.DrawerDefaults.f7703a
            androidx.compose.animation.core.TweenSpec r10 = r10.a()
        L_0x0010:
            boolean r13 = androidx.compose.runtime.ComposerKt.P()
            if (r13 == 0) goto L_0x001f
            r13 = -1
            java.lang.String r1 = "androidx.compose.material.rememberBottomDrawerState (Drawer.kt:413)"
            r2 = 1477366969(0x580ed4b9, float:6.2817715E14)
            androidx.compose.runtime.ComposerKt.Y(r2, r12, r13, r1)
        L_0x001f:
            androidx.compose.runtime.ProvidableCompositionLocal r13 = androidx.compose.ui.platform.CompositionLocalsKt.g()
            java.lang.Object r13 = r11.C(r13)
            androidx.compose.ui.unit.Density r13 = (androidx.compose.ui.unit.Density) r13
            java.lang.Object[] r1 = new java.lang.Object[]{r13}
            androidx.compose.material.BottomDrawerState$Companion r2 = androidx.compose.material.BottomDrawerState.f7302c
            androidx.compose.runtime.saveable.Saver r2 = r2.a(r13, r9, r10)
            r3 = r12 & 14
            r3 = r3 ^ 6
            r4 = 0
            r5 = 1
            if (r3 <= r0) goto L_0x0041
            boolean r3 = r11.W(r8)
            if (r3 != 0) goto L_0x0045
        L_0x0041:
            r3 = r12 & 6
            if (r3 != r0) goto L_0x0047
        L_0x0045:
            r0 = r5
            goto L_0x0048
        L_0x0047:
            r0 = r4
        L_0x0048:
            boolean r3 = r11.W(r13)
            r0 = r0 | r3
            r3 = r12 & 112(0x70, float:1.57E-43)
            r3 = r3 ^ 48
            r6 = 32
            if (r3 <= r6) goto L_0x005b
            boolean r3 = r11.W(r9)
            if (r3 != 0) goto L_0x005f
        L_0x005b:
            r12 = r12 & 48
            if (r12 != r6) goto L_0x0060
        L_0x005f:
            r4 = r5
        L_0x0060:
            r12 = r0 | r4
            boolean r0 = r11.l(r10)
            r12 = r12 | r0
            java.lang.Object r0 = r11.g()
            if (r12 != 0) goto L_0x0075
            androidx.compose.runtime.Composer$Companion r12 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r12 = r12.a()
            if (r0 != r12) goto L_0x007d
        L_0x0075:
            androidx.compose.material.DrawerKt$rememberBottomDrawerState$2$1 r0 = new androidx.compose.material.DrawerKt$rememberBottomDrawerState$2$1
            r0.<init>(r8, r13, r9, r10)
            r11.N(r0)
        L_0x007d:
            r4 = r0
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r6 = 0
            r7 = 4
            r3 = 0
            r5 = r11
            java.lang.Object r8 = androidx.compose.runtime.saveable.RememberSaveableKt.h(r1, r2, r3, r4, r5, r6, r7)
            androidx.compose.material.BottomDrawerState r8 = (androidx.compose.material.BottomDrawerState) r8
            boolean r9 = androidx.compose.runtime.ComposerKt.P()
            if (r9 == 0) goto L_0x0093
            androidx.compose.runtime.ComposerKt.X()
        L_0x0093:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DrawerKt.q(androidx.compose.material.BottomDrawerValue, kotlin.jvm.functions.Function1, androidx.compose.animation.core.AnimationSpec, androidx.compose.runtime.Composer, int, int):androidx.compose.material.BottomDrawerState");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.material.DrawerState r(androidx.compose.material.DrawerValue r7, kotlin.jvm.functions.Function1 r8, androidx.compose.runtime.Composer r9, int r10, int r11) {
        /*
            r11 = r11 & 2
            if (r11 == 0) goto L_0x0006
            androidx.compose.material.DrawerKt$rememberDrawerState$1 r8 = androidx.compose.material.DrawerKt$rememberDrawerState$1.f7781z
        L_0x0006:
            boolean r11 = androidx.compose.runtime.ComposerKt.P()
            if (r11 == 0) goto L_0x0015
            r11 = -1
            java.lang.String r0 = "androidx.compose.material.rememberDrawerState (Drawer.kt:394)"
            r1 = -1435874229(0xffffffffaa6a4c4b, float:-2.0809844E-13)
            androidx.compose.runtime.ComposerKt.Y(r1, r10, r11, r0)
        L_0x0015:
            r11 = 0
            java.lang.Object[] r0 = new java.lang.Object[r11]
            androidx.compose.material.DrawerState$Companion r1 = androidx.compose.material.DrawerState.f7784c
            androidx.compose.runtime.saveable.Saver r1 = r1.a(r8)
            r2 = r10 & 14
            r2 = r2 ^ 6
            r3 = 1
            r4 = 4
            if (r2 <= r4) goto L_0x002c
            boolean r2 = r9.W(r7)
            if (r2 != 0) goto L_0x0030
        L_0x002c:
            r2 = r10 & 6
            if (r2 != r4) goto L_0x0032
        L_0x0030:
            r2 = r3
            goto L_0x0033
        L_0x0032:
            r2 = r11
        L_0x0033:
            r4 = r10 & 112(0x70, float:1.57E-43)
            r4 = r4 ^ 48
            r5 = 32
            if (r4 <= r5) goto L_0x0041
            boolean r4 = r9.W(r8)
            if (r4 != 0) goto L_0x0045
        L_0x0041:
            r10 = r10 & 48
            if (r10 != r5) goto L_0x0046
        L_0x0045:
            r11 = r3
        L_0x0046:
            r10 = r2 | r11
            java.lang.Object r11 = r9.g()
            if (r10 != 0) goto L_0x0056
            androidx.compose.runtime.Composer$Companion r10 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r10 = r10.a()
            if (r11 != r10) goto L_0x005e
        L_0x0056:
            androidx.compose.material.DrawerKt$rememberDrawerState$2$1 r11 = new androidx.compose.material.DrawerKt$rememberDrawerState$2$1
            r11.<init>(r7, r8)
            r9.N(r11)
        L_0x005e:
            r3 = r11
            kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3
            r5 = 0
            r6 = 4
            r2 = 0
            r4 = r9
            java.lang.Object r7 = androidx.compose.runtime.saveable.RememberSaveableKt.h(r0, r1, r2, r3, r4, r5, r6)
            androidx.compose.material.DrawerState r7 = (androidx.compose.material.DrawerState) r7
            boolean r8 = androidx.compose.runtime.ComposerKt.P()
            if (r8 == 0) goto L_0x0074
            androidx.compose.runtime.ComposerKt.X()
        L_0x0074:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.DrawerKt.r(androidx.compose.material.DrawerValue, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):androidx.compose.material.DrawerState");
    }
}
