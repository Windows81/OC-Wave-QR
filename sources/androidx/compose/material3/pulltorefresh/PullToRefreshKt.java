package androidx.compose.material3.pulltorefresh;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MotionSchemeKt;
import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathEffect;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;

@Metadata
public final class PullToRefreshKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f12608a = Dp.m((float) 2.5d);

    /* renamed from: b  reason: collision with root package name */
    public static final float f12609b = Dp.m((float) 5.5d);

    /* renamed from: c  reason: collision with root package name */
    public static final float f12610c = Dp.m((float) 16);

    /* renamed from: d  reason: collision with root package name */
    public static final float f12611d = Dp.m((float) 40);

    /* renamed from: e  reason: collision with root package name */
    public static final float f12612e = Dp.m((float) 10);

    /* renamed from: f  reason: collision with root package name */
    public static final float f12613f = Dp.m((float) 5);

    public static final ArrowValues g(float f2) {
        float max = (Math.max(Math.min(1.0f, f2) - 0.4f, 0.0f) * ((float) 5)) / ((float) 3);
        float n2 = RangesKt.n(Math.abs(f2) - 1.0f, 0.0f, 2.0f);
        float pow = (((0.4f * max) - 16.0f) + (n2 - (((float) Math.pow((double) n2, (double) 2)) / ((float) 4)))) * 0.5f;
        float f3 = (float) 360;
        return new ArrowValues(pow, pow * f3, ((0.8f * max) + pow) * f3, Math.min(1.0f, max));
    }

    public static final void h(FloatProducer floatProducer, long j2, Composer composer, int i2) {
        int i3;
        Composer composer2;
        FloatProducer floatProducer2 = floatProducer;
        long j3 = j2;
        int i4 = i2;
        Composer q2 = composer.q(-1353562852);
        if ((i4 & 6) == 0) {
            i3 = ((i4 & 8) == 0 ? q2.W(floatProducer2) : q2.l(floatProducer2) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        if ((i4 & 48) == 0) {
            i3 |= q2.j(j3) ? 32 : 16;
        }
        if (q2.E((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-1353562852, i3, -1, "androidx.compose.material3.pulltorefresh.CircularArrowProgressIndicator (PullToRefresh.kt:631)");
            }
            Object g2 = q2.g();
            Composer.Companion companion = Composer.f14567a;
            Path path = g2;
            if (g2 == companion.a()) {
                Path a2 = AndroidPath_androidKt.a();
                a2.m(PathFillType.f16071b.a());
                q2.N(a2);
                path = a2;
            }
            Path path2 = (Path) path;
            Object g3 = q2.g();
            if (g3 == companion.a()) {
                g3 = SnapshotStateKt.e(new h(floatProducer2));
                q2.N(g3);
            }
            State d2 = AnimateAsStateKt.d(m((State) g3), MotionSchemeKt.b(MotionSchemeKeyTokens.DefaultEffects, q2, 6), 0.0f, (String) null, (Function1) null, q2, 0, 28);
            Modifier.Companion companion2 = Modifier.f15489d;
            int i5 = i3 & 14;
            boolean z2 = i5 == 4 || ((i3 & 8) != 0 && q2.l(floatProducer2));
            Object g4 = q2.g();
            if (z2 || g4 == companion.a()) {
                g4 = new i(floatProducer2);
                q2.N(g4);
            }
            Modifier t2 = SizeKt.t(SemanticsModifierKt.a(companion2, (Function1) g4), f12610c);
            boolean W = q2.W(d2) | (i5 == 4 || ((i3 & 8) != 0 && q2.l(floatProducer2))) | ((i3 & 112) == 32) | q2.l(path2);
            Object g5 = q2.g();
            if (W || g5 == companion.a()) {
                composer2 = q2;
                j jVar = new j(floatProducer, d2, j2, path2);
                composer2.N(jVar);
                g5 = jVar;
            } else {
                composer2 = q2;
            }
            CanvasKt.b(t2, (Function1) g5, composer2, 0);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            composer2 = q2;
            composer2.B();
        }
        ScopeUpdateScope x2 = composer2.x();
        if (x2 != null) {
            x2.a(new k(floatProducer2, j3, i4));
        }
    }

    public static final Unit i(FloatProducer floatProducer, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (floatProducer.invoke() > 0.0f) {
            SemanticsPropertiesKt.r0(semanticsPropertyReceiver, new ProgressBarRangeInfo(floatProducer.invoke(), RangesKt.b(0.0f, 1.0f), 0));
        }
        return Unit.f40552a;
    }

    /* JADX INFO: finally extract failed */
    public static final Unit j(FloatProducer floatProducer, State state, long j2, Path path, DrawScope drawScope) {
        DrawScope drawScope2 = drawScope;
        ArrowValues g2 = g(floatProducer.invoke());
        float floatValue = ((Number) state.getValue()).floatValue();
        float b2 = g2.b();
        long T1 = drawScope.T1();
        DrawContext G1 = drawScope.G1();
        long c2 = G1.c();
        G1.j().o();
        try {
            G1.e().i(b2, T1);
            float B1 = drawScope2.B1(f12609b);
            float f2 = f12608a;
            Rect b3 = RectKt.b(androidx.compose.ui.geometry.SizeKt.b(drawScope.c()), B1 + (drawScope2.B1(f2) / 2.0f));
            s(drawScope, j2, floatValue, g2, b3, f2);
            r(drawScope, path, b3, j2, floatValue, g2, f2);
            G1.j().t();
            G1.f(c2);
            return Unit.f40552a;
        } catch (Throwable th) {
            G1.j().t();
            G1.f(c2);
            throw th;
        }
    }

    public static final Unit k(FloatProducer floatProducer, long j2, int i2, Composer composer, int i3) {
        h(floatProducer, j2, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final float l(FloatProducer floatProducer) {
        return floatProducer.invoke() >= 1.0f ? 1.0f : 0.3f;
    }

    public static final float m(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:121:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00db  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void n(boolean r19, kotlin.jvm.functions.Function0 r20, androidx.compose.ui.Modifier r21, androidx.compose.material3.pulltorefresh.PullToRefreshState r22, androidx.compose.ui.Alignment r23, kotlin.jvm.functions.Function3 r24, kotlin.jvm.functions.Function3 r25, androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            r8 = r19
            r9 = r25
            r10 = r27
            r0 = -532332839(0xffffffffe0453ed9, float:-5.6852144E19)
            r1 = r26
            androidx.compose.runtime.Composer r11 = r1.q(r0)
            r1 = r28 & 1
            if (r1 == 0) goto L_0x0016
            r1 = r10 | 6
            goto L_0x0026
        L_0x0016:
            r1 = r10 & 6
            if (r1 != 0) goto L_0x0025
            boolean r1 = r11.d(r8)
            if (r1 == 0) goto L_0x0022
            r1 = 4
            goto L_0x0023
        L_0x0022:
            r1 = 2
        L_0x0023:
            r1 = r1 | r10
            goto L_0x0026
        L_0x0025:
            r1 = r10
        L_0x0026:
            r2 = r28 & 2
            if (r2 == 0) goto L_0x002f
            r1 = r1 | 48
            r12 = r20
            goto L_0x0041
        L_0x002f:
            r2 = r10 & 48
            r12 = r20
            if (r2 != 0) goto L_0x0041
            boolean r2 = r11.l(r12)
            if (r2 == 0) goto L_0x003e
            r2 = 32
            goto L_0x0040
        L_0x003e:
            r2 = 16
        L_0x0040:
            r1 = r1 | r2
        L_0x0041:
            r2 = r28 & 4
            if (r2 == 0) goto L_0x004a
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x0047:
            r3 = r21
            goto L_0x005c
        L_0x004a:
            r3 = r10 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x0047
            r3 = r21
            boolean r4 = r11.W(r3)
            if (r4 == 0) goto L_0x0059
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x005b
        L_0x0059:
            r4 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r1 = r1 | r4
        L_0x005c:
            r4 = r10 & 3072(0xc00, float:4.305E-42)
            if (r4 != 0) goto L_0x0075
            r4 = r28 & 8
            if (r4 != 0) goto L_0x006f
            r4 = r22
            boolean r5 = r11.W(r4)
            if (r5 == 0) goto L_0x0071
            r5 = 2048(0x800, float:2.87E-42)
            goto L_0x0073
        L_0x006f:
            r4 = r22
        L_0x0071:
            r5 = 1024(0x400, float:1.435E-42)
        L_0x0073:
            r1 = r1 | r5
            goto L_0x0077
        L_0x0075:
            r4 = r22
        L_0x0077:
            r5 = r28 & 16
            if (r5 == 0) goto L_0x0080
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x007d:
            r6 = r23
            goto L_0x0092
        L_0x0080:
            r6 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r6 != 0) goto L_0x007d
            r6 = r23
            boolean r7 = r11.W(r6)
            if (r7 == 0) goto L_0x008f
            r7 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0091
        L_0x008f:
            r7 = 8192(0x2000, float:1.14794E-41)
        L_0x0091:
            r1 = r1 | r7
        L_0x0092:
            r7 = r28 & 32
            r13 = 196608(0x30000, float:2.75506E-40)
            if (r7 == 0) goto L_0x009c
            r1 = r1 | r13
        L_0x0099:
            r13 = r24
            goto L_0x00ad
        L_0x009c:
            r13 = r13 & r10
            if (r13 != 0) goto L_0x0099
            r13 = r24
            boolean r14 = r11.l(r13)
            if (r14 == 0) goto L_0x00aa
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ac
        L_0x00aa:
            r14 = 65536(0x10000, float:9.18355E-41)
        L_0x00ac:
            r1 = r1 | r14
        L_0x00ad:
            r14 = r28 & 64
            r15 = 1572864(0x180000, float:2.204052E-39)
            if (r14 == 0) goto L_0x00b5
            r1 = r1 | r15
            goto L_0x00c5
        L_0x00b5:
            r14 = r10 & r15
            if (r14 != 0) goto L_0x00c5
            boolean r14 = r11.l(r9)
            if (r14 == 0) goto L_0x00c2
            r14 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c4
        L_0x00c2:
            r14 = 524288(0x80000, float:7.34684E-40)
        L_0x00c4:
            r1 = r1 | r14
        L_0x00c5:
            r14 = 599187(0x92493, float:8.3964E-40)
            r14 = r14 & r1
            r15 = 599186(0x92492, float:8.39638E-40)
            r6 = 0
            r0 = 1
            if (r14 == r15) goto L_0x00d2
            r14 = r0
            goto L_0x00d3
        L_0x00d2:
            r14 = r6
        L_0x00d3:
            r15 = r1 & 1
            boolean r14 = r11.E(r14, r15)
            if (r14 == 0) goto L_0x01f5
            r11.p()
            r14 = r10 & 1
            if (r14 == 0) goto L_0x00f9
            boolean r14 = r11.J()
            if (r14 == 0) goto L_0x00e9
            goto L_0x00f9
        L_0x00e9:
            r11.B()
            r0 = r28 & 8
            if (r0 == 0) goto L_0x00f2
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00f2:
            r15 = r23
            r5 = r1
            r14 = r4
            r7 = r13
            r13 = r3
            goto L_0x0131
        L_0x00f9:
            if (r2 == 0) goto L_0x00fe
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            goto L_0x00ff
        L_0x00fe:
            r2 = r3
        L_0x00ff:
            r3 = r28 & 8
            if (r3 == 0) goto L_0x010a
            androidx.compose.material3.pulltorefresh.PullToRefreshState r3 = x(r11, r6)
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
            goto L_0x010b
        L_0x010a:
            r3 = r4
        L_0x010b:
            if (r5 == 0) goto L_0x0114
            androidx.compose.ui.Alignment$Companion r4 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r4 = r4.o()
            goto L_0x0116
        L_0x0114:
            r4 = r23
        L_0x0116:
            if (r7 == 0) goto L_0x012c
            androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshBox$1 r5 = new androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshBox$1
            r5.<init>(r3, r8)
            r7 = 54
            r13 = 1028036671(0x3d46983f, float:0.048485037)
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r13, r0, r5, r11, r7)
            r7 = r0
            r5 = r1
            r13 = r2
            r14 = r3
            r15 = r4
            goto L_0x0131
        L_0x012c:
            r5 = r1
            r14 = r3
            r15 = r4
            r7 = r13
            r13 = r2
        L_0x0131:
            r11.U()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0143
            r0 = -1
            java.lang.String r1 = "androidx.compose.material3.pulltorefresh.PullToRefreshBox (PullToRefresh.kt:133)"
            r2 = -532332839(0xffffffffe0453ed9, float:-5.6852144E19)
            androidx.compose.runtime.ComposerKt.Y(r2, r5, r0, r1)
        L_0x0143:
            r16 = 12
            r17 = 0
            r3 = 0
            r4 = 0
            r0 = r13
            r1 = r19
            r2 = r14
            r18 = r5
            r5 = r20
            r6 = r16
            r8 = r7
            r7 = r17
            androidx.compose.ui.Modifier r0 = w(r0, r1, r2, r3, r4, r5, r6, r7)
            r1 = 0
            androidx.compose.ui.layout.MeasurePolicy r2 = androidx.compose.foundation.layout.BoxKt.g(r15, r1)
            int r1 = androidx.compose.runtime.ComposablesKt.a(r11, r1)
            androidx.compose.runtime.CompositionLocalMap r3 = r11.I()
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.ComposedModifierKt.e(r11, r0)
            androidx.compose.ui.node.ComposeUiNode$Companion r4 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r5 = r4.a()
            androidx.compose.runtime.Applier r6 = r11.v()
            if (r6 != 0) goto L_0x017a
            androidx.compose.runtime.ComposablesKt.d()
        L_0x017a:
            r11.s()
            boolean r6 = r11.n()
            if (r6 == 0) goto L_0x0187
            r11.y(r5)
            goto L_0x018a
        L_0x0187:
            r11.K()
        L_0x018a:
            androidx.compose.runtime.Composer r5 = androidx.compose.runtime.Updater.b(r11)
            kotlin.jvm.functions.Function2 r6 = r4.c()
            androidx.compose.runtime.Updater.g(r5, r2, r6)
            kotlin.jvm.functions.Function2 r2 = r4.e()
            androidx.compose.runtime.Updater.g(r5, r3, r2)
            kotlin.jvm.functions.Function2 r2 = r4.b()
            boolean r3 = r5.n()
            if (r3 != 0) goto L_0x01b4
            java.lang.Object r3 = r5.g()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            boolean r3 = kotlin.jvm.internal.Intrinsics.d(r3, r6)
            if (r3 != 0) goto L_0x01c2
        L_0x01b4:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r5.N(r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5.A(r1, r2)
        L_0x01c2:
            kotlin.jvm.functions.Function2 r1 = r4.d()
            androidx.compose.runtime.Updater.g(r5, r0, r1)
            androidx.compose.foundation.layout.BoxScopeInstance r0 = androidx.compose.foundation.layout.BoxScopeInstance.f3797a
            int r1 = r18 >> 15
            r1 = r1 & 112(0x70, float:1.57E-43)
            r2 = 6
            r1 = r1 | r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r9.d(r0, r11, r1)
            int r1 = r18 >> 12
            r1 = r1 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r8.d(r0, r11, r1)
            r11.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x01f0
            androidx.compose.runtime.ComposerKt.X()
        L_0x01f0:
            r6 = r8
            r3 = r13
            r4 = r14
            r5 = r15
            goto L_0x01fb
        L_0x01f5:
            r11.B()
            r5 = r23
            r6 = r13
        L_0x01fb:
            androidx.compose.runtime.ScopeUpdateScope r11 = r11.x()
            if (r11 == 0) goto L_0x0214
            androidx.compose.material3.pulltorefresh.l r13 = new androidx.compose.material3.pulltorefresh.l
            r0 = r13
            r1 = r19
            r2 = r20
            r7 = r25
            r8 = r27
            r9 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r11.a(r13)
        L_0x0214:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.pulltorefresh.PullToRefreshKt.n(boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.material3.pulltorefresh.PullToRefreshState, androidx.compose.ui.Alignment, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit o(boolean z2, Function0 function0, Modifier modifier, PullToRefreshState pullToRefreshState, Alignment alignment, Function3 function3, Function3 function32, int i2, int i3, Composer composer, int i4) {
        n(z2, function0, modifier, pullToRefreshState, alignment, function3, function32, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final void r(DrawScope drawScope, Path path, Rect rect, long j2, float f2, ArrowValues arrowValues, float f3) {
        DrawScope drawScope2 = drawScope;
        Path path2 = path;
        float f4 = f3;
        path.b();
        path2.q(0.0f, 0.0f);
        float f5 = f12612e;
        path2.z((drawScope2.B1(f5) * arrowValues.c()) / ((float) 2), drawScope2.B1(f12613f) * arrowValues.c());
        path2.z(drawScope2.B1(f5) * arrowValues.c(), 0.0f);
        float min = ((Math.min(rect.p() - rect.o(), rect.i() - rect.r()) / 2.0f) + Float.intBitsToFloat((int) (rect.m() >> 32))) - ((drawScope2.B1(f5) * arrowValues.c()) / 2.0f);
        float intBitsToFloat = Float.intBitsToFloat((int) (rect.m() & 4294967295L)) - drawScope2.B1(f4);
        long floatToRawIntBits = (long) Float.floatToRawIntBits(min);
        path2.v(Offset.e((((long) Float.floatToRawIntBits(intBitsToFloat)) & 4294967295L) | (floatToRawIntBits << 32)));
        float a2 = arrowValues.a() - drawScope2.B1(f4);
        long T1 = drawScope.T1();
        DrawContext G1 = drawScope.G1();
        long c2 = G1.c();
        G1.j().o();
        try {
            G1.e().i(a2, T1);
            DrawScope.E1(drawScope, path, j2, f2, new Stroke(drawScope2.B1(f4), 0.0f, 0, 0, (PathEffect) null, 30, (DefaultConstructorMarker) null), (ColorFilter) null, 0, 48, (Object) null);
        } finally {
            G1.j().t();
            G1.f(c2);
        }
    }

    public static final void s(DrawScope drawScope, long j2, float f2, ArrowValues arrowValues, Rect rect, float f3) {
        DrawScope drawScope2 = drawScope;
        DrawScope.a2(drawScope2, j2, arrowValues.d(), arrowValues.a() - arrowValues.d(), false, rect.t(), rect.q(), f2, new Stroke(drawScope2.B1(f3), 0.0f, StrokeCap.f16130b.a(), 0, (PathEffect) null, 26, (DefaultConstructorMarker) null), (ColorFilter) null, 0, 768, (Object) null);
    }

    public static final float t() {
        return f12611d;
    }

    public static final float u() {
        return f12610c;
    }

    public static final Modifier v(Modifier modifier, boolean z2, PullToRefreshState pullToRefreshState, boolean z3, float f2, Function0 function0) {
        return modifier.o0(new PullToRefreshElement(z2, function0, z3, pullToRefreshState, f2, (DefaultConstructorMarker) null));
    }

    public static /* synthetic */ Modifier w(Modifier modifier, boolean z2, PullToRefreshState pullToRefreshState, boolean z3, float f2, Function0 function0, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z3 = true;
        }
        boolean z4 = z3;
        if ((i2 & 8) != 0) {
            f2 = PullToRefreshDefaults.f12593a.q();
        }
        return v(modifier, z2, pullToRefreshState, z4, f2, function0);
    }

    public static final PullToRefreshState x(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(318623070, i2, -1, "androidx.compose.material3.pulltorefresh.rememberPullToRefreshState (PullToRefresh.kt:585)");
        }
        Object[] objArr = new Object[0];
        Saver a2 = PullToRefreshStateImpl.f12616b.a();
        Object g2 = composer.g();
        if (g2 == Composer.f14567a.a()) {
            g2 = new m();
            composer.N(g2);
        }
        PullToRefreshStateImpl pullToRefreshStateImpl = (PullToRefreshStateImpl) RememberSaveableKt.i(objArr, a2, (Function0) g2, composer, 384);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return pullToRefreshStateImpl;
    }

    public static final PullToRefreshStateImpl y() {
        return new PullToRefreshStateImpl();
    }
}
