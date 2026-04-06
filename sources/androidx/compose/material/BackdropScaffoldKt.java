package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class BackdropScaffoldKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f7190a = Dp.m((float) 20);

    /* renamed from: b  reason: collision with root package name */
    public static final float f7191b = Dp.m((float) 125);

    /* renamed from: c  reason: collision with root package name */
    public static final float f7192c = Dp.m((float) 56);

    public static final void a(BackdropValue backdropValue, Function2 function2, Function2 function22, Composer composer, int i2) {
        int i3;
        BackdropValue backdropValue2 = backdropValue;
        Function2 function23 = function2;
        Function2 function24 = function22;
        int i4 = i2;
        Composer q2 = composer.q(-950970976);
        if ((i4 & 6) == 0) {
            i3 = (q2.W(backdropValue2) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        if ((i4 & 48) == 0) {
            i3 |= q2.l(function23) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i3 |= q2.l(function24) ? 256 : 128;
        }
        int i5 = i3;
        if (q2.E((i5 & 147) != 146, 1 & i5)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-950970976, i5, -1, "androidx.compose.material.BackLayerTransition (BackdropScaffold.kt:520)");
            }
            State d2 = AnimateAsStateKt.d(backdropValue2 == BackdropValue.Revealed ? 0.0f : 2.0f, new TweenSpec(0, 0, (Easing) null, 7, (DefaultConstructorMarker) null), 0.0f, (String) null, (Function1) null, q2, 48, 28);
            float B1 = ((Density) q2.C(CompositionLocalsKt.g())).B1(f7190a);
            Modifier.Companion companion = Modifier.f15489d;
            Alignment.Companion companion2 = Alignment.f15444a;
            MeasurePolicy g2 = BoxKt.g(companion2.o(), false);
            int a2 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I = q2.I();
            Modifier e2 = ComposedModifierKt.e(q2, companion);
            ComposeUiNode.Companion companion3 = ComposeUiNode.f17222h;
            Function0 a3 = companion3.a();
            if (q2.v() == null) {
                ComposablesKt.d();
            }
            q2.s();
            if (q2.n()) {
                q2.y(a3);
            } else {
                q2.K();
            }
            Composer b2 = Updater.b(q2);
            Updater.g(b2, g2, companion3.c());
            Updater.g(b2, I, companion3.e());
            Function2 b3 = companion3.b();
            if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a2))) {
                b2.N(Integer.valueOf(a2));
                b2.A(Integer.valueOf(a2), b3);
            }
            Updater.g(b2, e2, companion3.d());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3797a;
            boolean W = q2.W(d2);
            Object g3 = q2.g();
            if (W || g3 == Composer.f14567a.a()) {
                g3 = new BackdropScaffoldKt$BackLayerTransition$1$1$1(d2);
                q2.N(g3);
            }
            Modifier a4 = LayoutModifierKt.a(companion, (Function3) g3);
            boolean W2 = q2.W(d2) | q2.h(B1);
            Object g4 = q2.g();
            if (W2 || g4 == Composer.f14567a.a()) {
                g4 = new BackdropScaffoldKt$BackLayerTransition$1$2$1(B1, d2);
                q2.N(g4);
            }
            Modifier a5 = GraphicsLayerModifierKt.a(a4, (Function1) g4);
            MeasurePolicy g5 = BoxKt.g(companion2.o(), false);
            int a6 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I2 = q2.I();
            Modifier e3 = ComposedModifierKt.e(q2, a5);
            Function0 a7 = companion3.a();
            if (q2.v() == null) {
                ComposablesKt.d();
            }
            q2.s();
            if (q2.n()) {
                q2.y(a7);
            } else {
                q2.K();
            }
            Composer b4 = Updater.b(q2);
            Updater.g(b4, g5, companion3.c());
            Updater.g(b4, I2, companion3.e());
            Function2 b5 = companion3.b();
            if (b4.n() || !Intrinsics.d(b4.g(), Integer.valueOf(a6))) {
                b4.N(Integer.valueOf(a6));
                b4.A(Integer.valueOf(a6), b5);
            }
            Updater.g(b4, e3, companion3.d());
            function23.m(q2, Integer.valueOf((i5 >> 3) & 14));
            q2.T();
            boolean W3 = q2.W(d2);
            Object g6 = q2.g();
            if (W3 || g6 == Composer.f14567a.a()) {
                g6 = new BackdropScaffoldKt$BackLayerTransition$1$4$1(d2);
                q2.N(g6);
            }
            Modifier a8 = LayoutModifierKt.a(companion, (Function3) g6);
            boolean W4 = q2.W(d2) | q2.h(B1);
            Object g7 = q2.g();
            if (W4 || g7 == Composer.f14567a.a()) {
                g7 = new BackdropScaffoldKt$BackLayerTransition$1$5$1(B1, d2);
                q2.N(g7);
            }
            Modifier a9 = GraphicsLayerModifierKt.a(a8, (Function1) g7);
            MeasurePolicy g8 = BoxKt.g(companion2.o(), false);
            int a10 = ComposablesKt.a(q2, 0);
            CompositionLocalMap I3 = q2.I();
            Modifier e4 = ComposedModifierKt.e(q2, a9);
            Function0 a11 = companion3.a();
            if (q2.v() == null) {
                ComposablesKt.d();
            }
            q2.s();
            if (q2.n()) {
                q2.y(a11);
            } else {
                q2.K();
            }
            Composer b6 = Updater.b(q2);
            Updater.g(b6, g8, companion3.c());
            Updater.g(b6, I3, companion3.e());
            Function2 b7 = companion3.b();
            if (b6.n() || !Intrinsics.d(b6.g(), Integer.valueOf(a10))) {
                b6.N(Integer.valueOf(a10));
                b6.A(Integer.valueOf(a10), b7);
            }
            Updater.g(b6, e4, companion3.d());
            function24.m(q2, Integer.valueOf((i5 >> 6) & 14));
            q2.T();
            q2.T();
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new BackdropScaffoldKt$BackLayerTransition$2(backdropValue, function23, function24, i4));
        }
    }

    public static final float b(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v4, resolved type: androidx.compose.ui.Modifier$Companion} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x050b  */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x052f  */
    /* JADX WARNING: Removed duplicated region for block: B:318:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0123  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(kotlin.jvm.functions.Function2 r51, kotlin.jvm.functions.Function2 r52, kotlin.jvm.functions.Function2 r53, androidx.compose.ui.Modifier r54, androidx.compose.material.BackdropScaffoldState r55, kotlin.jvm.functions.Function3 r56, boolean r57, float r58, float r59, boolean r60, boolean r61, long r62, long r64, androidx.compose.ui.graphics.Shape r66, float r67, long r68, long r70, long r72, androidx.compose.runtime.Composer r74, int r75, int r76, int r77) {
        /*
            r1 = r51
            r2 = r52
            r14 = r75
            r15 = r76
            r12 = r77
            r0 = 113877443(0x6c9a1c3, float:7.5845484E-35)
            r3 = r74
            androidx.compose.runtime.Composer r0 = r3.q(r0)
            r3 = r12 & 1
            if (r3 == 0) goto L_0x001a
            r3 = r14 | 6
            goto L_0x002a
        L_0x001a:
            r3 = r14 & 6
            if (r3 != 0) goto L_0x0029
            boolean r3 = r0.l(r1)
            if (r3 == 0) goto L_0x0026
            r3 = 4
            goto L_0x0027
        L_0x0026:
            r3 = 2
        L_0x0027:
            r3 = r3 | r14
            goto L_0x002a
        L_0x0029:
            r3 = r14
        L_0x002a:
            r6 = r12 & 2
            if (r6 == 0) goto L_0x0031
            r3 = r3 | 48
            goto L_0x0041
        L_0x0031:
            r6 = r14 & 48
            if (r6 != 0) goto L_0x0041
            boolean r6 = r0.l(r2)
            if (r6 == 0) goto L_0x003e
            r6 = 32
            goto L_0x0040
        L_0x003e:
            r6 = 16
        L_0x0040:
            r3 = r3 | r6
        L_0x0041:
            r6 = r12 & 4
            if (r6 == 0) goto L_0x004a
            r3 = r3 | 384(0x180, float:5.38E-43)
            r11 = r53
            goto L_0x005c
        L_0x004a:
            r6 = r14 & 384(0x180, float:5.38E-43)
            r11 = r53
            if (r6 != 0) goto L_0x005c
            boolean r6 = r0.l(r11)
            if (r6 == 0) goto L_0x0059
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x005b
        L_0x0059:
            r6 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r3 = r3 | r6
        L_0x005c:
            r6 = r12 & 8
            r16 = 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L_0x0067
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0064:
            r4 = r54
            goto L_0x007a
        L_0x0067:
            r4 = r14 & 3072(0xc00, float:4.305E-42)
            if (r4 != 0) goto L_0x0064
            r4 = r54
            boolean r17 = r0.W(r4)
            if (r17 == 0) goto L_0x0076
            r17 = r16
            goto L_0x0078
        L_0x0076:
            r17 = 1024(0x400, float:1.435E-42)
        L_0x0078:
            r3 = r3 | r17
        L_0x007a:
            r5 = r14 & 24576(0x6000, float:3.4438E-41)
            r18 = 8192(0x2000, float:1.14794E-41)
            if (r5 != 0) goto L_0x0096
            r5 = r12 & 16
            if (r5 != 0) goto L_0x008f
            r5 = r55
            boolean r20 = r0.W(r5)
            if (r20 == 0) goto L_0x0091
            r20 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0093
        L_0x008f:
            r5 = r55
        L_0x0091:
            r20 = r18
        L_0x0093:
            r3 = r3 | r20
            goto L_0x0098
        L_0x0096:
            r5 = r55
        L_0x0098:
            r20 = r12 & 32
            r21 = 65536(0x10000, float:9.18355E-41)
            r22 = 131072(0x20000, float:1.83671E-40)
            r23 = 196608(0x30000, float:2.75506E-40)
            if (r20 == 0) goto L_0x00a7
            r3 = r3 | r23
            r13 = r56
            goto L_0x00ba
        L_0x00a7:
            r23 = r14 & r23
            r13 = r56
            if (r23 != 0) goto L_0x00ba
            boolean r24 = r0.l(r13)
            if (r24 == 0) goto L_0x00b6
            r24 = r22
            goto L_0x00b8
        L_0x00b6:
            r24 = r21
        L_0x00b8:
            r3 = r3 | r24
        L_0x00ba:
            r24 = r12 & 64
            r38 = 1572864(0x180000, float:2.204052E-39)
            if (r24 == 0) goto L_0x00c5
            r3 = r3 | r38
            r10 = r57
            goto L_0x00d8
        L_0x00c5:
            r25 = r14 & r38
            r10 = r57
            if (r25 != 0) goto L_0x00d8
            boolean r26 = r0.d(r10)
            if (r26 == 0) goto L_0x00d4
            r26 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d6
        L_0x00d4:
            r26 = 524288(0x80000, float:7.34684E-40)
        L_0x00d6:
            r3 = r3 | r26
        L_0x00d8:
            r26 = 12582912(0xc00000, float:1.7632415E-38)
            r26 = r14 & r26
            if (r26 != 0) goto L_0x00f4
            r7 = r12 & 128(0x80, float:1.794E-43)
            if (r7 != 0) goto L_0x00ed
            r7 = r58
            boolean r27 = r0.h(r7)
            if (r27 == 0) goto L_0x00ef
            r27 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f1
        L_0x00ed:
            r7 = r58
        L_0x00ef:
            r27 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f1:
            r3 = r3 | r27
            goto L_0x00f6
        L_0x00f4:
            r7 = r58
        L_0x00f6:
            r27 = 100663296(0x6000000, float:2.4074124E-35)
            r27 = r14 & r27
            if (r27 != 0) goto L_0x0112
            r8 = r12 & 256(0x100, float:3.59E-43)
            if (r8 != 0) goto L_0x010b
            r8 = r59
            boolean r28 = r0.h(r8)
            if (r28 == 0) goto L_0x010d
            r28 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010f
        L_0x010b:
            r8 = r59
        L_0x010d:
            r28 = 33554432(0x2000000, float:9.403955E-38)
        L_0x010f:
            r3 = r3 | r28
            goto L_0x0114
        L_0x0112:
            r8 = r59
        L_0x0114:
            r9 = r12 & 512(0x200, float:7.175E-43)
            r29 = 805306368(0x30000000, float:4.656613E-10)
            if (r9 == 0) goto L_0x0123
            r3 = r3 | r29
            r30 = r3
            r29 = r9
            r9 = r60
            goto L_0x0140
        L_0x0123:
            r29 = r14 & r29
            if (r29 != 0) goto L_0x013b
            r29 = r9
            r9 = r60
            boolean r30 = r0.d(r9)
            if (r30 == 0) goto L_0x0134
            r30 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0136
        L_0x0134:
            r30 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0136:
            r3 = r3 | r30
        L_0x0138:
            r30 = r3
            goto L_0x0140
        L_0x013b:
            r29 = r9
            r9 = r60
            goto L_0x0138
        L_0x0140:
            r3 = r12 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x0149
            r17 = r15 | 6
            r9 = r61
            goto L_0x015f
        L_0x0149:
            r31 = r15 & 6
            r9 = r61
            if (r31 != 0) goto L_0x015d
            boolean r31 = r0.d(r9)
            if (r31 == 0) goto L_0x0158
            r17 = 4
            goto L_0x015a
        L_0x0158:
            r17 = 2
        L_0x015a:
            r17 = r15 | r17
            goto L_0x015f
        L_0x015d:
            r17 = r15
        L_0x015f:
            r31 = r15 & 48
            if (r31 != 0) goto L_0x0179
            r31 = r3
            r3 = r12 & 2048(0x800, float:2.87E-42)
            r9 = r62
            if (r3 != 0) goto L_0x0174
            boolean r3 = r0.j(r9)
            if (r3 == 0) goto L_0x0174
            r26 = 32
            goto L_0x0176
        L_0x0174:
            r26 = 16
        L_0x0176:
            r17 = r17 | r26
            goto L_0x017d
        L_0x0179:
            r9 = r62
            r31 = r3
        L_0x017d:
            r3 = r15 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x0195
            r3 = r12 & 4096(0x1000, float:5.74E-42)
            r9 = r64
            if (r3 != 0) goto L_0x0190
            boolean r3 = r0.j(r9)
            if (r3 == 0) goto L_0x0190
            r28 = 256(0x100, float:3.59E-43)
            goto L_0x0192
        L_0x0190:
            r28 = 128(0x80, float:1.794E-43)
        L_0x0192:
            r17 = r17 | r28
            goto L_0x0197
        L_0x0195:
            r9 = r64
        L_0x0197:
            r3 = r15 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L_0x01b1
            r3 = r12 & 8192(0x2000, float:1.14794E-41)
            if (r3 != 0) goto L_0x01aa
            r3 = r66
            boolean r19 = r0.W(r3)
            if (r19 == 0) goto L_0x01ac
            r23 = r16
            goto L_0x01ae
        L_0x01aa:
            r3 = r66
        L_0x01ac:
            r23 = 1024(0x400, float:1.435E-42)
        L_0x01ae:
            r17 = r17 | r23
            goto L_0x01b3
        L_0x01b1:
            r3 = r66
        L_0x01b3:
            r3 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L_0x01cb
            r3 = r12 & 16384(0x4000, float:2.2959E-41)
            if (r3 != 0) goto L_0x01c6
            r3 = r67
            boolean r16 = r0.h(r3)
            if (r16 == 0) goto L_0x01c8
            r18 = 16384(0x4000, float:2.2959E-41)
            goto L_0x01c8
        L_0x01c6:
            r3 = r67
        L_0x01c8:
            r17 = r17 | r18
            goto L_0x01cd
        L_0x01cb:
            r3 = r67
        L_0x01cd:
            r16 = 196608(0x30000, float:2.75506E-40)
            r16 = r15 & r16
            if (r16 != 0) goto L_0x01ea
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r12 & r16
            r9 = r68
            if (r16 != 0) goto L_0x01e5
            boolean r16 = r0.j(r9)
            if (r16 == 0) goto L_0x01e5
            r16 = r22
            goto L_0x01e7
        L_0x01e5:
            r16 = r21
        L_0x01e7:
            r17 = r17 | r16
            goto L_0x01ec
        L_0x01ea:
            r9 = r68
        L_0x01ec:
            r16 = r15 & r38
            if (r16 != 0) goto L_0x0204
            r16 = r12 & r21
            r9 = r70
            if (r16 != 0) goto L_0x01ff
            boolean r16 = r0.j(r9)
            if (r16 == 0) goto L_0x01ff
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x0201
        L_0x01ff:
            r16 = 524288(0x80000, float:7.34684E-40)
        L_0x0201:
            r17 = r17 | r16
            goto L_0x0206
        L_0x0204:
            r9 = r70
        L_0x0206:
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            r16 = r15 & r16
            if (r16 != 0) goto L_0x0220
            r16 = r12 & r22
            r9 = r72
            if (r16 != 0) goto L_0x021b
            boolean r16 = r0.j(r9)
            if (r16 == 0) goto L_0x021b
            r16 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x021d
        L_0x021b:
            r16 = 4194304(0x400000, float:5.877472E-39)
        L_0x021d:
            r17 = r17 | r16
            goto L_0x0222
        L_0x0220:
            r9 = r72
        L_0x0222:
            r16 = 306783379(0x12492493, float:6.34695E-28)
            r3 = r30 & r16
            r4 = 306783378(0x12492492, float:6.3469493E-28)
            r9 = 0
            if (r3 != r4) goto L_0x023a
            r3 = 4793491(0x492493, float:6.717112E-39)
            r3 = r17 & r3
            r4 = 4793490(0x492492, float:6.71711E-39)
            if (r3 == r4) goto L_0x0238
            goto L_0x023a
        L_0x0238:
            r3 = r9
            goto L_0x023b
        L_0x023a:
            r3 = 1
        L_0x023b:
            r4 = r30 & 1
            boolean r3 = r0.E(r3, r4)
            if (r3 == 0) goto L_0x050b
            r0.p()
            r3 = r14 & 1
            r16 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r18 = -57345(0xffffffffffff1fff, float:NaN)
            if (r3 == 0) goto L_0x02be
            boolean r3 = r0.J()
            if (r3 == 0) goto L_0x0258
            goto L_0x02be
        L_0x0258:
            r0.B()
            r3 = r12 & 16
            if (r3 == 0) goto L_0x0261
            r30 = r30 & r18
        L_0x0261:
            r3 = r12 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x0267
            r30 = r30 & r16
        L_0x0267:
            r3 = r12 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x0270
            r3 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r30 = r30 & r3
        L_0x0270:
            r3 = r12 & 2048(0x800, float:2.87E-42)
            if (r3 == 0) goto L_0x0276
            r17 = r17 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0276:
            r3 = r17
            r4 = r12 & 4096(0x1000, float:5.74E-42)
            if (r4 == 0) goto L_0x027e
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x027e:
            r4 = r12 & 8192(0x2000, float:1.14794E-41)
            if (r4 == 0) goto L_0x0284
            r3 = r3 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0284:
            r4 = r12 & 16384(0x4000, float:2.2959E-41)
            if (r4 == 0) goto L_0x028a
            r3 = r3 & r18
        L_0x028a:
            r4 = 32768(0x8000, float:4.5918E-41)
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0294
            r4 = -458753(0xfffffffffff8ffff, float:NaN)
            r3 = r3 & r4
        L_0x0294:
            r4 = r12 & r21
            if (r4 == 0) goto L_0x029c
            r4 = -3670017(0xffffffffffc7ffff, float:NaN)
            r3 = r3 & r4
        L_0x029c:
            r4 = r12 & r22
            if (r4 == 0) goto L_0x02a2
            r3 = r3 & r16
        L_0x02a2:
            r4 = r57
            r9 = r61
            r10 = r62
            r39 = r64
            r41 = r66
            r42 = r67
            r43 = r68
            r45 = r70
            r47 = r72
            r12 = r3
            r6 = r8
            r14 = r30
            r3 = r54
            r8 = r60
            goto L_0x03f3
        L_0x02be:
            if (r6 == 0) goto L_0x02c5
            androidx.compose.ui.Modifier$Companion r3 = androidx.compose.ui.Modifier.f15489d
            r19 = r3
            goto L_0x02c7
        L_0x02c5:
            r19 = r54
        L_0x02c7:
            r3 = r12 & 16
            if (r3 == 0) goto L_0x02e6
            androidx.compose.material.BackdropValue r3 = androidx.compose.material.BackdropValue.Concealed
            r23 = 6
            r26 = 14
            r4 = 0
            r5 = 0
            r6 = 0
            r27 = r31
            r7 = r0
            r8 = r23
            r10 = r9
            r23 = r29
            r9 = r26
            androidx.compose.material.BackdropScaffoldState r3 = p(r3, r4, r5, r6, r7, r8, r9)
            r30 = r30 & r18
            r5 = r3
            goto L_0x02eb
        L_0x02e6:
            r10 = r9
            r23 = r29
            r27 = r31
        L_0x02eb:
            if (r20 == 0) goto L_0x02f4
            androidx.compose.material.ComposableSingletons$BackdropScaffoldKt r3 = androidx.compose.material.ComposableSingletons$BackdropScaffoldKt.f7526a
            kotlin.jvm.functions.Function3 r3 = r3.a()
            r13 = r3
        L_0x02f4:
            if (r24 == 0) goto L_0x02f8
            r3 = 1
            goto L_0x02fa
        L_0x02f8:
            r3 = r57
        L_0x02fa:
            r4 = r12 & 128(0x80, float:1.794E-43)
            if (r4 == 0) goto L_0x0307
            androidx.compose.material.BackdropScaffoldDefaults r4 = androidx.compose.material.BackdropScaffoldDefaults.f7184a
            float r4 = r4.f()
            r30 = r30 & r16
            goto L_0x0309
        L_0x0307:
            r4 = r58
        L_0x0309:
            r6 = r12 & 256(0x100, float:3.59E-43)
            if (r6 == 0) goto L_0x031b
            androidx.compose.material.BackdropScaffoldDefaults r6 = androidx.compose.material.BackdropScaffoldDefaults.f7184a
            float r6 = r6.e()
            r7 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r7 = r30 & r7
            r30 = r7
            goto L_0x031d
        L_0x031b:
            r6 = r59
        L_0x031d:
            if (r23 == 0) goto L_0x0321
            r7 = 1
            goto L_0x0323
        L_0x0321:
            r7 = r60
        L_0x0323:
            if (r27 == 0) goto L_0x0327
            r8 = 1
            goto L_0x0329
        L_0x0327:
            r8 = r61
        L_0x0329:
            r9 = r12 & 2048(0x800, float:2.87E-42)
            r10 = 6
            if (r9 == 0) goto L_0x033f
            androidx.compose.material.MaterialTheme r9 = androidx.compose.material.MaterialTheme.f7937a
            androidx.compose.material.Colors r9 = r9.a(r0, r10)
            long r23 = r9.j()
            r17 = r17 & -113(0xffffffffffffff8f, float:NaN)
            r9 = r17
            r10 = r23
            goto L_0x0343
        L_0x033f:
            r10 = r62
            r9 = r17
        L_0x0343:
            r55 = r3
            r3 = r12 & 4096(0x1000, float:5.74E-42)
            if (r3 == 0) goto L_0x0354
            int r3 = r9 >> 3
            r3 = r3 & 14
            long r23 = androidx.compose.material.ColorsKt.b(r10, r0, r3)
            r9 = r9 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x0356
        L_0x0354:
            r23 = r64
        L_0x0356:
            r3 = r12 & 8192(0x2000, float:1.14794E-41)
            if (r3 == 0) goto L_0x0366
            androidx.compose.material.BackdropScaffoldDefaults r3 = androidx.compose.material.BackdropScaffoldDefaults.f7184a
            r56 = r4
            r4 = 0
            androidx.compose.ui.graphics.Shape r3 = r3.d(r0, r4)
            r9 = r9 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x036a
        L_0x0366:
            r56 = r4
            r3 = r66
        L_0x036a:
            r4 = r12 & 16384(0x4000, float:2.2959E-41)
            if (r4 == 0) goto L_0x0377
            androidx.compose.material.BackdropScaffoldDefaults r4 = androidx.compose.material.BackdropScaffoldDefaults.f7184a
            float r4 = r4.b()
            r9 = r9 & r18
            goto L_0x0379
        L_0x0377:
            r4 = r67
        L_0x0379:
            r17 = 32768(0x8000, float:4.5918E-41)
            r17 = r12 & r17
            r57 = r3
            if (r17 == 0) goto L_0x0395
            androidx.compose.material.MaterialTheme r3 = androidx.compose.material.MaterialTheme.f7937a
            r58 = r4
            r4 = 6
            androidx.compose.material.Colors r3 = r3.a(r0, r4)
            long r3 = r3.n()
            r17 = -458753(0xfffffffffff8ffff, float:NaN)
            r9 = r9 & r17
            goto L_0x0399
        L_0x0395:
            r58 = r4
            r3 = r68
        L_0x0399:
            r17 = r12 & r21
            if (r17 == 0) goto L_0x03ac
            int r17 = r9 >> 15
            r54 = r5
            r5 = r17 & 14
            long r17 = androidx.compose.material.ColorsKt.b(r3, r0, r5)
            r5 = -3670017(0xffffffffffc7ffff, float:NaN)
            r5 = r5 & r9
            goto L_0x03b1
        L_0x03ac:
            r54 = r5
            r17 = r70
            r5 = r9
        L_0x03b1:
            r9 = r12 & r22
            if (r9 == 0) goto L_0x03da
            androidx.compose.material.BackdropScaffoldDefaults r9 = androidx.compose.material.BackdropScaffoldDefaults.f7184a
            r21 = r3
            r3 = 0
            long r26 = r9.c(r0, r3)
            r3 = r5 & r16
            r5 = r54
            r4 = r55
            r41 = r57
            r42 = r58
            r12 = r3
            r9 = r8
            r45 = r17
            r3 = r19
            r43 = r21
            r39 = r23
            r47 = r26
            r14 = r30
        L_0x03d6:
            r8 = r7
            r7 = r56
            goto L_0x03f3
        L_0x03da:
            r21 = r3
            r4 = r55
            r41 = r57
            r42 = r58
            r47 = r72
            r12 = r5
            r9 = r8
            r45 = r17
            r3 = r19
            r43 = r21
            r39 = r23
            r14 = r30
            r5 = r54
            goto L_0x03d6
        L_0x03f3:
            r0.U()
            boolean r16 = androidx.compose.runtime.ComposerKt.P()
            if (r16 == 0) goto L_0x0407
            r15 = 113877443(0x6c9a1c3, float:7.5845484E-35)
            r66 = r10
            java.lang.String r10 = "androidx.compose.material.BackdropScaffold (BackdropScaffold.kt:364)"
            androidx.compose.runtime.ComposerKt.Y(r15, r14, r12, r10)
            goto L_0x0409
        L_0x0407:
            r66 = r10
        L_0x0409:
            androidx.compose.runtime.ProvidableCompositionLocal r10 = androidx.compose.ui.platform.CompositionLocalsKt.g()
            java.lang.Object r10 = r0.C(r10)
            androidx.compose.ui.unit.Density r10 = (androidx.compose.ui.unit.Density) r10
            r11 = 57344(0xe000, float:8.0356E-41)
            r11 = r11 & r14
            r11 = r11 ^ 24576(0x6000, float:3.4438E-41)
            r15 = 16384(0x4000, float:2.2959E-41)
            if (r11 <= r15) goto L_0x0423
            boolean r11 = r0.W(r5)
            if (r11 != 0) goto L_0x0427
        L_0x0423:
            r11 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r11 != r15) goto L_0x0429
        L_0x0427:
            r11 = 1
            goto L_0x042a
        L_0x0429:
            r11 = 0
        L_0x042a:
            boolean r14 = r0.W(r10)
            r11 = r11 | r14
            java.lang.Object r14 = r0.g()
            if (r11 != 0) goto L_0x043d
            androidx.compose.runtime.Composer$Companion r11 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r11 = r11.a()
            if (r14 != r11) goto L_0x0445
        L_0x043d:
            androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1 r14 = new androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$1$1
            r14.<init>(r5, r10)
            r0.N(r14)
        L_0x0445:
            kotlin.jvm.functions.Function0 r14 = (kotlin.jvm.functions.Function0) r14
            r10 = 0
            androidx.compose.runtime.EffectsKt.h(r14, r0, r10)
            androidx.compose.runtime.ProvidableCompositionLocal r10 = androidx.compose.ui.platform.CompositionLocalsKt.g()
            java.lang.Object r10 = r0.C(r10)
            androidx.compose.ui.unit.Density r10 = (androidx.compose.ui.unit.Density) r10
            float r32 = r10.B1(r7)
            androidx.compose.runtime.ProvidableCompositionLocal r10 = androidx.compose.ui.platform.CompositionLocalsKt.g()
            java.lang.Object r10 = r0.C(r10)
            androidx.compose.ui.unit.Density r10 = (androidx.compose.ui.unit.Density) r10
            float r10 = r10.B1(r6)
            androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$backLayer$1 r11 = new androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$backLayer$1
            r11.<init>(r8, r5, r1, r2)
            r14 = 54
            r15 = 461235665(0x1b7de5d1, float:2.1001927E-22)
            r1 = 1
            androidx.compose.runtime.internal.ComposableLambda r18 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r15, r1, r11, r0, r14)
            boolean r1 = r0.h(r10)
            java.lang.Object r11 = r0.g()
            if (r1 != 0) goto L_0x0488
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
            if (r11 != r1) goto L_0x0490
        L_0x0488:
            androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1 r11 = new androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1
            r11.<init>(r10)
            r0.N(r11)
        L_0x0490:
            r19 = r11
            kotlin.jvm.functions.Function1 r19 = (kotlin.jvm.functions.Function1) r19
            androidx.compose.material.AnchoredDraggableState r24 = r5.c()
            androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2 r1 = new androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$2
            r16 = r1
            r17 = r3
            r20 = r10
            r21 = r9
            r22 = r4
            r23 = r5
            r25 = r41
            r26 = r43
            r28 = r45
            r30 = r42
            r31 = r6
            r33 = r7
            r34 = r53
            r35 = r47
            r37 = r13
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r28, r30, r31, r32, r33, r34, r35, r37)
            r10 = 54
            r11 = 1961515015(0x74ea5807, float:1.4853307E32)
            r14 = 1
            androidx.compose.runtime.internal.ComposableLambda r1 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r11, r14, r1, r0, r10)
            int r10 = r12 << 3
            r11 = r10 & 896(0x380, float:1.256E-42)
            r11 = r11 | r38
            r10 = r10 & 7168(0x1c00, float:1.0045E-41)
            r10 = r10 | r11
            r11 = 51
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r54 = r12
            r55 = r14
            r56 = r66
            r58 = r39
            r60 = r15
            r61 = r16
            r62 = r1
            r63 = r0
            r64 = r10
            r65 = r11
            androidx.compose.material.SurfaceKt.a(r54, r55, r56, r58, r60, r61, r62, r63, r64, r65)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x04f5
            androidx.compose.runtime.ComposerKt.X()
        L_0x04f5:
            r10 = r8
            r11 = r9
            r14 = r39
            r16 = r41
            r17 = r42
            r18 = r43
            r20 = r45
            r22 = r47
            r9 = r6
            r8 = r7
            r6 = r13
            r12 = r66
            r7 = r4
            r4 = r3
            goto L_0x0529
        L_0x050b:
            r0.B()
            r4 = r54
            r7 = r57
            r8 = r58
            r9 = r59
            r10 = r60
            r11 = r61
            r14 = r64
            r16 = r66
            r17 = r67
            r18 = r68
            r20 = r70
            r22 = r72
            r6 = r13
            r12 = r62
        L_0x0529:
            androidx.compose.runtime.ScopeUpdateScope r3 = r0.x()
            if (r3 == 0) goto L_0x054c
            androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$3 r1 = new androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$3
            r0 = r1
            r49 = r1
            r1 = r51
            r2 = r52
            r50 = r3
            r3 = r53
            r24 = r75
            r25 = r76
            r26 = r77
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r16, r17, r18, r20, r22, r24, r25, r26)
            r1 = r49
            r0 = r50
            r0.a(r1)
        L_0x054c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BackdropScaffoldKt.c(kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, androidx.compose.material.BackdropScaffoldState, kotlin.jvm.functions.Function3, boolean, float, float, boolean, boolean, long, long, androidx.compose.ui.graphics.Shape, float, long, long, long, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final BackdropScaffoldState d(BackdropValue backdropValue, Density density, AnimationSpec animationSpec, Function1 function1, SnackbarHostState snackbarHostState) {
        BackdropScaffoldState backdropScaffoldState = new BackdropScaffoldState(backdropValue, animationSpec, function1, snackbarHostState);
        backdropScaffoldState.l(density);
        return backdropScaffoldState;
    }

    public static final void e(Modifier modifier, Function2 function2, Function1 function1, Function4 function4, Composer composer, int i2) {
        int i3;
        Composer q2 = composer.q(-1248995194);
        if ((i2 & 6) == 0) {
            i3 = (q2.W(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= q2.l(function2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= q2.l(function1) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= q2.l(function4) ? 2048 : 1024;
        }
        boolean z2 = true;
        if (q2.E((i3 & 1171) != 1170, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1248995194, i3, -1, "androidx.compose.material.BackdropStack (BackdropScaffold.kt:573)");
            }
            boolean z3 = ((i3 & 112) == 32) | ((i3 & 896) == 256);
            if ((i3 & 7168) != 2048) {
                z2 = false;
            }
            boolean z4 = z3 | z2;
            Object g2 = q2.g();
            if (z4 || g2 == Composer.f14567a.a()) {
                g2 = new BackdropScaffoldKt$BackdropStack$1$1(function2, function1, function4);
                q2.N(g2);
            }
            SubcomposeLayoutKt.a(modifier, (Function2) g2, q2, i3 & 14, 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new BackdropScaffoldKt$BackdropStack$2(modifier, function2, function1, function4, i2));
        }
    }

    public static final NestedScrollConnection f(AnchoredDraggableState anchoredDraggableState, Orientation orientation) {
        return new BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1(anchoredDraggableState, orientation);
    }

    public static final void g(long j2, Function0 function0, boolean z2, Composer composer, int i2) {
        int i3;
        Modifier modifier;
        long j3 = j2;
        Function0 function02 = function0;
        boolean z3 = z2;
        int i4 = i2;
        Composer q2 = composer.q(-92141505);
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
                ComposerKt.Y(-92141505, i5, -1, "androidx.compose.material.Scrim (BackdropScaffold.kt:494)");
            }
            if (j3 != 16) {
                q2.X(478794687);
                int i6 = i5;
                State d2 = AnimateAsStateKt.d(z3 ? 1.0f : 0.0f, new TweenSpec(0, 0, (Easing) null, 7, (DefaultConstructorMarker) null), 0.0f, (String) null, (Function1) null, q2, 48, 28);
                if (z3) {
                    q2.X(478960289);
                    Modifier.Companion companion = Modifier.f15489d;
                    Unit unit = Unit.f40552a;
                    boolean z4 = (i6 & 112) == 32;
                    Object g2 = q2.g();
                    if (z4 || g2 == Composer.f14567a.a()) {
                        g2 = new BackdropScaffoldKt$Scrim$dismissModifier$1$1(function02, (Continuation) null);
                        q2.N(g2);
                    }
                    modifier = companion.o0(new SuspendPointerInputElement(unit, (Object) null, (Object[]) null, new SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0((Function2) g2), 6, (DefaultConstructorMarker) null));
                    q2.M();
                } else {
                    q2.X(479060698);
                    q2.M();
                    modifier = Modifier.f15489d;
                }
                Modifier o0 = SizeKt.f(Modifier.f15489d, 0.0f, 1, (Object) null).o0(modifier);
                boolean W = q2.W(d2) | ((i6 & 14) == 4);
                Object g3 = q2.g();
                if (W || g3 == Composer.f14567a.a()) {
                    g3 = new BackdropScaffoldKt$Scrim$1$1(j3, d2);
                    q2.N(g3);
                }
                CanvasKt.b(o0, (Function1) g3, q2, 0);
                q2.M();
            } else {
                q2.X(479228098);
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
            x2.a(new BackdropScaffoldKt$Scrim$2(j2, function0, z2, i2));
        }
    }

    public static final float h(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006b, code lost:
        if (r4.W(r14) == false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b7, code lost:
        if (r5 == androidx.compose.runtime.Composer.f14567a.a()) goto L_0x00b9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.material.BackdropScaffoldState p(androidx.compose.material.BackdropValue r14, androidx.compose.animation.core.AnimationSpec r15, kotlin.jvm.functions.Function1 r16, androidx.compose.material.SnackbarHostState r17, androidx.compose.runtime.Composer r18, int r19, int r20) {
        /*
            r4 = r18
            r0 = r19
            r1 = r20 & 2
            if (r1 == 0) goto L_0x0010
            androidx.compose.material.BackdropScaffoldDefaults r1 = androidx.compose.material.BackdropScaffoldDefaults.f7184a
            androidx.compose.animation.core.AnimationSpec r1 = r1.a()
            r8 = r1
            goto L_0x0011
        L_0x0010:
            r8 = r15
        L_0x0011:
            r1 = r20 & 4
            if (r1 == 0) goto L_0x0019
            androidx.compose.material.BackdropScaffoldKt$rememberBackdropScaffoldState$1 r1 = androidx.compose.material.BackdropScaffoldKt$rememberBackdropScaffoldState$1.f7260z
            r9 = r1
            goto L_0x001b
        L_0x0019:
            r9 = r16
        L_0x001b:
            r1 = r20 & 8
            if (r1 == 0) goto L_0x0037
            java.lang.Object r1 = r18.g()
            androidx.compose.runtime.Composer$Companion r2 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r2 = r2.a()
            if (r1 != r2) goto L_0x0033
            androidx.compose.material.SnackbarHostState r1 = new androidx.compose.material.SnackbarHostState
            r1.<init>()
            r4.N(r1)
        L_0x0033:
            androidx.compose.material.SnackbarHostState r1 = (androidx.compose.material.SnackbarHostState) r1
            r10 = r1
            goto L_0x0039
        L_0x0037:
            r10 = r17
        L_0x0039:
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x0048
            r1 = -1
            java.lang.String r2 = "androidx.compose.material.rememberBackdropScaffoldState (BackdropScaffold.kt:257)"
            r3 = -862178912(0xffffffffcc9c31a0, float:-8.189056E7)
            androidx.compose.runtime.ComposerKt.Y(r3, r0, r1, r2)
        L_0x0048:
            androidx.compose.runtime.ProvidableCompositionLocal r1 = androidx.compose.ui.platform.CompositionLocalsKt.g()
            java.lang.Object r1 = r4.C(r1)
            r7 = r1
            androidx.compose.ui.unit.Density r7 = (androidx.compose.ui.unit.Density) r7
            java.lang.Object[] r1 = new java.lang.Object[]{r8, r9, r10}
            androidx.compose.material.BackdropScaffoldState$Companion r2 = androidx.compose.material.BackdropScaffoldState.f7264f
            androidx.compose.runtime.saveable.Saver r2 = r2.a(r8, r9, r10, r7)
            r3 = r0 & 14
            r3 = r3 ^ 6
            r5 = 0
            r6 = 1
            r11 = 4
            if (r3 <= r11) goto L_0x006e
            r3 = r14
            boolean r12 = r4.W(r14)
            if (r12 != 0) goto L_0x0073
            goto L_0x006f
        L_0x006e:
            r3 = r14
        L_0x006f:
            r12 = r0 & 6
            if (r12 != r11) goto L_0x0075
        L_0x0073:
            r11 = r6
            goto L_0x0076
        L_0x0075:
            r11 = r5
        L_0x0076:
            boolean r12 = r4.W(r7)
            r11 = r11 | r12
            boolean r12 = r4.l(r8)
            r11 = r11 | r12
            r12 = r0 & 896(0x380, float:1.256E-42)
            r12 = r12 ^ 384(0x180, float:5.38E-43)
            r13 = 256(0x100, float:3.59E-43)
            if (r12 <= r13) goto L_0x008e
            boolean r12 = r4.W(r9)
            if (r12 != 0) goto L_0x0092
        L_0x008e:
            r12 = r0 & 384(0x180, float:5.38E-43)
            if (r12 != r13) goto L_0x0094
        L_0x0092:
            r12 = r6
            goto L_0x0095
        L_0x0094:
            r12 = r5
        L_0x0095:
            r11 = r11 | r12
            r12 = r0 & 7168(0x1c00, float:1.0045E-41)
            r12 = r12 ^ 3072(0xc00, float:4.305E-42)
            r13 = 2048(0x800, float:2.87E-42)
            if (r12 <= r13) goto L_0x00a4
            boolean r12 = r4.W(r10)
            if (r12 != 0) goto L_0x00a8
        L_0x00a4:
            r0 = r0 & 3072(0xc00, float:4.305E-42)
            if (r0 != r13) goto L_0x00a9
        L_0x00a8:
            r5 = r6
        L_0x00a9:
            r0 = r11 | r5
            java.lang.Object r5 = r18.g()
            if (r0 != 0) goto L_0x00b9
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r5 != r0) goto L_0x00c3
        L_0x00b9:
            androidx.compose.material.BackdropScaffoldKt$rememberBackdropScaffoldState$3$1 r0 = new androidx.compose.material.BackdropScaffoldKt$rememberBackdropScaffoldState$3$1
            r5 = r0
            r6 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            r4.N(r0)
        L_0x00c3:
            r3 = r5
            kotlin.jvm.functions.Function0 r3 = (kotlin.jvm.functions.Function0) r3
            r5 = 0
            r6 = 4
            r7 = 0
            r0 = r1
            r1 = r2
            r2 = r7
            r4 = r18
            java.lang.Object r0 = androidx.compose.runtime.saveable.RememberSaveableKt.h(r0, r1, r2, r3, r4, r5, r6)
            androidx.compose.material.BackdropScaffoldState r0 = (androidx.compose.material.BackdropScaffoldState) r0
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x00dd
            androidx.compose.runtime.ComposerKt.X()
        L_0x00dd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BackdropScaffoldKt.p(androidx.compose.material.BackdropValue, androidx.compose.animation.core.AnimationSpec, kotlin.jvm.functions.Function1, androidx.compose.material.SnackbarHostState, androidx.compose.runtime.Composer, int, int):androidx.compose.material.BackdropScaffoldState");
    }
}
