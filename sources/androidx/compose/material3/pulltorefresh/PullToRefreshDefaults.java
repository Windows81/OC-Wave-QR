package androidx.compose.material3.pulltorefresh;

import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.tokens.ElevationTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

@Metadata
public final class PullToRefreshDefaults {

    /* renamed from: a  reason: collision with root package name */
    public static final PullToRefreshDefaults f12593a = new PullToRefreshDefaults();

    /* renamed from: b  reason: collision with root package name */
    public static final Shape f12594b = RoundedCornerShapeKt.f();

    /* renamed from: c  reason: collision with root package name */
    public static final Shape f12595c = RoundedCornerShapeKt.f();

    /* renamed from: d  reason: collision with root package name */
    public static final float f12596d;

    /* renamed from: e  reason: collision with root package name */
    public static final float f12597e;

    /* renamed from: f  reason: collision with root package name */
    public static final float f12598f;

    /* renamed from: g  reason: collision with root package name */
    public static final float f12599g;

    static {
        float m2 = Dp.m((float) 80);
        f12596d = m2;
        f12597e = m2;
        ElevationTokens elevationTokens = ElevationTokens.f13121a;
        f12598f = elevationTokens.c();
        f12599g = elevationTokens.a();
    }

    /* JADX INFO: finally extract failed */
    public static final Unit i(ContentDrawScope contentDrawScope) {
        int b2 = ClipOp.f15971b.b();
        DrawContext G1 = contentDrawScope.G1();
        long c2 = G1.c();
        G1.j().o();
        try {
            G1.e().b(-3.4028235E38f, 0.0f, Float.MAX_VALUE, Float.MAX_VALUE, b2);
            contentDrawScope.q2();
            G1.j().t();
            G1.f(c2);
            return Unit.f40552a;
        } catch (Throwable th) {
            G1.j().t();
            G1.f(c2);
            throw th;
        }
    }

    public static final MeasureResult j(PullToRefreshState pullToRefreshState, boolean z2, float f2, float f3, Shape shape, MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        Placeable c0 = measurable.c0(constraints.r());
        return MeasureScope.R1(measureScope, c0.L0(), c0.C0(), (Map) null, new e(c0, pullToRefreshState, z2, f2, f3, shape), 4, (Object) null);
    }

    public static final Unit k(Placeable placeable, PullToRefreshState pullToRefreshState, boolean z2, float f2, float f3, Shape shape, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.x(placementScope, placeable, 0, 0, 0.0f, new f(pullToRefreshState, z2, f2, f3, shape), 4, (Object) null);
        return Unit.f40552a;
    }

    public static final Unit l(PullToRefreshState pullToRefreshState, boolean z2, float f2, float f3, Shape shape, GraphicsLayerScope graphicsLayerScope) {
        float f4 = 0.0f;
        boolean z3 = pullToRefreshState.b() > 0.0f || z2;
        graphicsLayerScope.h((pullToRefreshState.b() * ((float) graphicsLayerScope.P1(f2))) - Float.intBitsToFloat((int) (graphicsLayerScope.c() & 4294967295L)));
        if (z3) {
            f4 = graphicsLayerScope.B1(f3);
        }
        graphicsLayerScope.p(f4);
        graphicsLayerScope.s1(shape);
        graphicsLayerScope.R(true);
        return Unit.f40552a;
    }

    public static final Unit m(PullToRefreshDefaults pullToRefreshDefaults, PullToRefreshState pullToRefreshState, boolean z2, Modifier modifier, float f2, Shape shape, long j2, float f3, Function3 function3, int i2, int i3, Composer composer, int i4) {
        pullToRefreshDefaults.h(pullToRefreshState, z2, modifier, f2, shape, j2, f3, function3, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final Unit n(PullToRefreshDefaults pullToRefreshDefaults, PullToRefreshState pullToRefreshState, boolean z2, Modifier modifier, long j2, long j3, float f2, int i2, int i3, Composer composer, int i4) {
        pullToRefreshDefaults.g(pullToRefreshState, z2, modifier, j2, j3, f2, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00d9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(androidx.compose.material3.pulltorefresh.PullToRefreshState r26, boolean r27, androidx.compose.ui.Modifier r28, long r29, long r31, float r33, androidx.compose.runtime.Composer r34, int r35, int r36) {
        /*
            r25 = this;
            r13 = r25
            r14 = r26
            r15 = r27
            r12 = r35
            r0 = -1076870256(0xffffffffbfd04390, float:-1.6270618)
            r1 = r34
            androidx.compose.runtime.Composer r11 = r1.q(r0)
            r1 = r36 & 1
            if (r1 == 0) goto L_0x0018
            r1 = r12 | 6
            goto L_0x0028
        L_0x0018:
            r1 = r12 & 6
            if (r1 != 0) goto L_0x0027
            boolean r1 = r11.W(r14)
            if (r1 == 0) goto L_0x0024
            r1 = 4
            goto L_0x0025
        L_0x0024:
            r1 = 2
        L_0x0025:
            r1 = r1 | r12
            goto L_0x0028
        L_0x0027:
            r1 = r12
        L_0x0028:
            r2 = r36 & 2
            if (r2 == 0) goto L_0x002f
            r1 = r1 | 48
            goto L_0x003f
        L_0x002f:
            r2 = r12 & 48
            if (r2 != 0) goto L_0x003f
            boolean r2 = r11.d(r15)
            if (r2 == 0) goto L_0x003c
            r2 = 32
            goto L_0x003e
        L_0x003c:
            r2 = 16
        L_0x003e:
            r1 = r1 | r2
        L_0x003f:
            r2 = r36 & 4
            if (r2 == 0) goto L_0x0048
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x0045:
            r3 = r28
            goto L_0x005a
        L_0x0048:
            r3 = r12 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x0045
            r3 = r28
            boolean r4 = r11.W(r3)
            if (r4 == 0) goto L_0x0057
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0059
        L_0x0057:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0059:
            r1 = r1 | r4
        L_0x005a:
            r4 = r12 & 3072(0xc00, float:4.305E-42)
            if (r4 != 0) goto L_0x0073
            r4 = r36 & 8
            if (r4 != 0) goto L_0x006d
            r4 = r29
            boolean r6 = r11.j(r4)
            if (r6 == 0) goto L_0x006f
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x0071
        L_0x006d:
            r4 = r29
        L_0x006f:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x0071:
            r1 = r1 | r6
            goto L_0x0075
        L_0x0073:
            r4 = r29
        L_0x0075:
            r6 = r12 & 24576(0x6000, float:3.4438E-41)
            if (r6 != 0) goto L_0x008e
            r6 = r36 & 16
            if (r6 != 0) goto L_0x0088
            r6 = r31
            boolean r8 = r11.j(r6)
            if (r8 == 0) goto L_0x008a
            r8 = 16384(0x4000, float:2.2959E-41)
            goto L_0x008c
        L_0x0088:
            r6 = r31
        L_0x008a:
            r8 = 8192(0x2000, float:1.14794E-41)
        L_0x008c:
            r1 = r1 | r8
            goto L_0x0090
        L_0x008e:
            r6 = r31
        L_0x0090:
            r8 = 196608(0x30000, float:2.75506E-40)
            r8 = r8 & r12
            if (r8 != 0) goto L_0x00aa
            r8 = r36 & 32
            if (r8 != 0) goto L_0x00a4
            r8 = r33
            boolean r9 = r11.h(r8)
            if (r9 == 0) goto L_0x00a6
            r9 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00a8
        L_0x00a4:
            r8 = r33
        L_0x00a6:
            r9 = 65536(0x10000, float:9.18355E-41)
        L_0x00a8:
            r1 = r1 | r9
            goto L_0x00ac
        L_0x00aa:
            r8 = r33
        L_0x00ac:
            r9 = r36 & 64
            r10 = 1572864(0x180000, float:2.204052E-39)
            if (r9 == 0) goto L_0x00b4
            r1 = r1 | r10
            goto L_0x00c4
        L_0x00b4:
            r9 = r12 & r10
            if (r9 != 0) goto L_0x00c4
            boolean r9 = r11.W(r13)
            if (r9 == 0) goto L_0x00c1
            r9 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00c3
        L_0x00c1:
            r9 = 524288(0x80000, float:7.34684E-40)
        L_0x00c3:
            r1 = r1 | r9
        L_0x00c4:
            r9 = 599187(0x92493, float:8.3964E-40)
            r9 = r9 & r1
            r10 = 599186(0x92492, float:8.39638E-40)
            r0 = 1
            if (r9 == r10) goto L_0x00d0
            r9 = r0
            goto L_0x00d1
        L_0x00d0:
            r9 = 0
        L_0x00d1:
            r10 = r1 & 1
            boolean r9 = r11.E(r9, r10)
            if (r9 == 0) goto L_0x01a9
            r11.p()
            r9 = r12 & 1
            r10 = -458753(0xfffffffffff8ffff, float:NaN)
            r17 = -57345(0xffffffffffff1fff, float:NaN)
            if (r9 == 0) goto L_0x0109
            boolean r9 = r11.J()
            if (r9 == 0) goto L_0x00ed
            goto L_0x0109
        L_0x00ed:
            r11.B()
            r2 = r36 & 8
            if (r2 == 0) goto L_0x00f6
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00f6:
            r2 = r36 & 16
            if (r2 == 0) goto L_0x00fc
            r1 = r1 & r17
        L_0x00fc:
            r2 = r36 & 32
            if (r2 == 0) goto L_0x0101
            r1 = r1 & r10
        L_0x0101:
            r17 = r3
        L_0x0103:
            r18 = r4
            r9 = r6
            r20 = r8
            goto L_0x013e
        L_0x0109:
            if (r2 == 0) goto L_0x010e
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.f15489d
            goto L_0x010f
        L_0x010e:
            r2 = r3
        L_0x010f:
            r3 = r36 & 8
            if (r3 == 0) goto L_0x011e
            int r3 = r1 >> 18
            r3 = r3 & 14
            long r3 = r13.p(r11, r3)
            r1 = r1 & -7169(0xffffffffffffe3ff, float:NaN)
            r4 = r3
        L_0x011e:
            r3 = r36 & 16
            if (r3 == 0) goto L_0x012c
            int r3 = r1 >> 18
            r3 = r3 & 14
            long r6 = r13.o(r11, r3)
            r1 = r1 & r17
        L_0x012c:
            r3 = r36 & 32
            if (r3 == 0) goto L_0x013b
            float r3 = f12597e
            r1 = r1 & r10
            r17 = r2
            r20 = r3
            r18 = r4
            r9 = r6
            goto L_0x013e
        L_0x013b:
            r17 = r2
            goto L_0x0103
        L_0x013e:
            r11.U()
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0150
            r2 = -1
            java.lang.String r3 = "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.Indicator (PullToRefresh.kt:515)"
            r4 = -1076870256(0xffffffffbfd04390, float:-1.6270618)
            androidx.compose.runtime.ComposerKt.Y(r4, r1, r2, r3)
        L_0x0150:
            androidx.compose.material3.pulltorefresh.PullToRefreshDefaults$Indicator$1 r2 = new androidx.compose.material3.pulltorefresh.PullToRefreshDefaults$Indicator$1
            r2.<init>(r15, r9, r14)
            r3 = 54
            r4 = 298232649(0x11c6ab49, float:3.1344454E-28)
            androidx.compose.runtime.internal.ComposableLambda r16 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r4, r0, r2, r11, r3)
            r0 = r1 & 14
            r2 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r0 | r2
            r2 = r1 & 112(0x70, float:1.57E-43)
            r0 = r0 | r2
            r2 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r2
            int r2 = r1 >> 6
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            int r1 = r1 << 6
            r2 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r1
            r0 = r0 | r2
            r2 = 234881024(0xe000000, float:1.5777218E-30)
            r1 = r1 & r2
            r21 = r0 | r1
            r22 = 80
            r5 = 0
            r8 = 0
            r0 = r25
            r1 = r26
            r2 = r27
            r3 = r17
            r4 = r20
            r6 = r18
            r23 = r9
            r9 = r16
            r10 = r11
            r16 = r11
            r11 = r21
            r12 = r22
            r0.h(r1, r2, r3, r4, r5, r6, r8, r9, r10, r11, r12)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x01a0
            androidx.compose.runtime.ComposerKt.X()
        L_0x01a0:
            r4 = r17
            r5 = r18
            r9 = r20
            r7 = r23
            goto L_0x01b2
        L_0x01a9:
            r16 = r11
            r16.B()
            r9 = r8
            r7 = r6
            r5 = r4
            r4 = r3
        L_0x01b2:
            androidx.compose.runtime.ScopeUpdateScope r12 = r16.x()
            if (r12 == 0) goto L_0x01cc
            androidx.compose.material3.pulltorefresh.a r11 = new androidx.compose.material3.pulltorefresh.a
            r0 = r11
            r1 = r25
            r2 = r26
            r3 = r27
            r10 = r35
            r14 = r11
            r11 = r36
            r0.<init>(r1, r2, r3, r4, r5, r7, r9, r10, r11)
            r12.a(r14)
        L_0x01cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.g(androidx.compose.material3.pulltorefresh.PullToRefreshState, boolean, androidx.compose.ui.Modifier, long, long, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: androidx.compose.ui.Modifier$Companion} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v40, resolved type: androidx.compose.material3.pulltorefresh.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v2, resolved type: androidx.compose.material3.pulltorefresh.c} */
    /* JADX WARNING: type inference failed for: r5v18 */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0216, code lost:
        if (r5 == r7.a()) goto L_0x0218;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x02d8  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x02e7  */
    /* JADX WARNING: Removed duplicated region for block: B:193:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x011a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(androidx.compose.material3.pulltorefresh.PullToRefreshState r23, boolean r24, androidx.compose.ui.Modifier r25, float r26, androidx.compose.ui.graphics.Shape r27, long r28, float r30, kotlin.jvm.functions.Function3 r31, androidx.compose.runtime.Composer r32, int r33, int r34) {
        /*
            r22 = this;
            r10 = r31
            r11 = r33
            r12 = r34
            r0 = -1341144489(0xffffffffb00fc257, float:-5.229927E-10)
            r1 = r32
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r12 & 1
            if (r2 == 0) goto L_0x0019
            r2 = r11 | 6
            r4 = r2
            r2 = r23
            goto L_0x002d
        L_0x0019:
            r2 = r11 & 6
            if (r2 != 0) goto L_0x002a
            r2 = r23
            boolean r4 = r1.W(r2)
            if (r4 == 0) goto L_0x0027
            r4 = 4
            goto L_0x0028
        L_0x0027:
            r4 = 2
        L_0x0028:
            r4 = r4 | r11
            goto L_0x002d
        L_0x002a:
            r2 = r23
            r4 = r11
        L_0x002d:
            r5 = r12 & 2
            if (r5 == 0) goto L_0x0036
            r4 = r4 | 48
        L_0x0033:
            r5 = r24
            goto L_0x0048
        L_0x0036:
            r5 = r11 & 48
            if (r5 != 0) goto L_0x0033
            r5 = r24
            boolean r7 = r1.d(r5)
            if (r7 == 0) goto L_0x0045
            r7 = 32
            goto L_0x0047
        L_0x0045:
            r7 = 16
        L_0x0047:
            r4 = r4 | r7
        L_0x0048:
            r7 = r12 & 4
            if (r7 == 0) goto L_0x0051
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x004e:
            r8 = r25
            goto L_0x0063
        L_0x0051:
            r8 = r11 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x004e
            r8 = r25
            boolean r9 = r1.W(r8)
            if (r9 == 0) goto L_0x0060
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0062
        L_0x0060:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0062:
            r4 = r4 | r9
        L_0x0063:
            r9 = r11 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x007c
            r9 = r12 & 8
            if (r9 != 0) goto L_0x0076
            r9 = r26
            boolean r14 = r1.h(r9)
            if (r14 == 0) goto L_0x0078
            r14 = 2048(0x800, float:2.87E-42)
            goto L_0x007a
        L_0x0076:
            r9 = r26
        L_0x0078:
            r14 = 1024(0x400, float:1.435E-42)
        L_0x007a:
            r4 = r4 | r14
            goto L_0x007e
        L_0x007c:
            r9 = r26
        L_0x007e:
            r14 = r11 & 24576(0x6000, float:3.4438E-41)
            if (r14 != 0) goto L_0x0098
            r14 = r12 & 16
            if (r14 != 0) goto L_0x0091
            r14 = r27
            boolean r16 = r1.W(r14)
            if (r16 == 0) goto L_0x0093
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0095
        L_0x0091:
            r14 = r27
        L_0x0093:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x0095:
            r4 = r4 | r16
            goto L_0x009a
        L_0x0098:
            r14 = r27
        L_0x009a:
            r16 = r12 & 32
            r17 = 196608(0x30000, float:2.75506E-40)
            if (r16 == 0) goto L_0x00a5
            r4 = r4 | r17
            r13 = r28
            goto L_0x00b8
        L_0x00a5:
            r17 = r11 & r17
            r13 = r28
            if (r17 != 0) goto L_0x00b8
            boolean r17 = r1.j(r13)
            if (r17 == 0) goto L_0x00b4
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b6
        L_0x00b4:
            r17 = 65536(0x10000, float:9.18355E-41)
        L_0x00b6:
            r4 = r4 | r17
        L_0x00b8:
            r17 = 1572864(0x180000, float:2.204052E-39)
            r18 = r11 & r17
            if (r18 != 0) goto L_0x00d2
            r18 = r12 & 64
            r15 = r30
            if (r18 != 0) goto L_0x00cd
            boolean r19 = r1.h(r15)
            if (r19 == 0) goto L_0x00cd
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cf
        L_0x00cd:
            r19 = 524288(0x80000, float:7.34684E-40)
        L_0x00cf:
            r4 = r4 | r19
            goto L_0x00d4
        L_0x00d2:
            r15 = r30
        L_0x00d4:
            r6 = r12 & 128(0x80, float:1.794E-43)
            r20 = 12582912(0xc00000, float:1.7632415E-38)
            if (r6 == 0) goto L_0x00dd
            r4 = r4 | r20
            goto L_0x00ed
        L_0x00dd:
            r6 = r11 & r20
            if (r6 != 0) goto L_0x00ed
            boolean r6 = r1.l(r10)
            if (r6 == 0) goto L_0x00ea
            r6 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ec
        L_0x00ea:
            r6 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ec:
            r4 = r4 | r6
        L_0x00ed:
            r6 = r12 & 256(0x100, float:3.59E-43)
            if (r6 == 0) goto L_0x00f7
            r6 = 100663296(0x6000000, float:2.4074124E-35)
            r4 = r4 | r6
        L_0x00f4:
            r6 = r22
            goto L_0x010b
        L_0x00f7:
            r6 = 100663296(0x6000000, float:2.4074124E-35)
            r6 = r6 & r11
            if (r6 != 0) goto L_0x00f4
            r6 = r22
            boolean r20 = r1.W(r6)
            if (r20 == 0) goto L_0x0107
            r20 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0109
        L_0x0107:
            r20 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0109:
            r4 = r4 | r20
        L_0x010b:
            r20 = 38347923(0x2492493, float:1.4777644E-37)
            r3 = r4 & r20
            r0 = 38347922(0x2492492, float:1.4777643E-37)
            r21 = 1
            if (r3 == r0) goto L_0x011a
            r0 = r21
            goto L_0x011b
        L_0x011a:
            r0 = 0
        L_0x011b:
            r3 = r4 & 1
            boolean r0 = r1.E(r0, r3)
            if (r0 == 0) goto L_0x02d8
            r1.p()
            r0 = r11 & 1
            if (r0 == 0) goto L_0x014d
            boolean r0 = r1.J()
            if (r0 == 0) goto L_0x0131
            goto L_0x014d
        L_0x0131:
            r1.B()
            r0 = r12 & 8
            if (r0 == 0) goto L_0x013a
            r4 = r4 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x013a:
            r0 = r12 & 16
            if (r0 == 0) goto L_0x0142
            r0 = -57345(0xffffffffffff1fff, float:NaN)
            r4 = r4 & r0
        L_0x0142:
            r0 = r12 & 64
            if (r0 == 0) goto L_0x014a
            r0 = -3670017(0xffffffffffc7ffff, float:NaN)
            r4 = r4 & r0
        L_0x014a:
            r0 = r27
            goto L_0x017c
        L_0x014d:
            if (r7 == 0) goto L_0x0152
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            r8 = r0
        L_0x0152:
            r0 = r12 & 8
            if (r0 == 0) goto L_0x015b
            float r0 = f12597e
            r4 = r4 & -7169(0xffffffffffffe3ff, float:NaN)
            r9 = r0
        L_0x015b:
            r0 = r12 & 16
            if (r0 == 0) goto L_0x0167
            androidx.compose.ui.graphics.Shape r0 = f12595c
            r3 = -57345(0xffffffffffff1fff, float:NaN)
            r3 = r3 & r4
            r4 = r3
            goto L_0x0169
        L_0x0167:
            r0 = r27
        L_0x0169:
            if (r16 == 0) goto L_0x0171
            androidx.compose.ui.graphics.Color$Companion r3 = androidx.compose.ui.graphics.Color.f15975b
            long r13 = r3.f()
        L_0x0171:
            r3 = r12 & 64
            if (r3 == 0) goto L_0x017c
            float r3 = f12598f
            r7 = -3670017(0xffffffffffc7ffff, float:NaN)
            r4 = r4 & r7
            r15 = r3
        L_0x017c:
            r1.U()
            boolean r3 = androidx.compose.runtime.ComposerKt.P()
            if (r3 == 0) goto L_0x018e
            r3 = -1
            java.lang.String r7 = "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.IndicatorBox (PullToRefresh.kt:456)"
            r2 = -1341144489(0xffffffffb00fc257, float:-5.229927E-10)
            androidx.compose.runtime.ComposerKt.Y(r2, r4, r3, r7)
        L_0x018e:
            float r2 = androidx.compose.material3.pulltorefresh.PullToRefreshKt.t()
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.layout.SizeKt.t(r8, r2)
            java.lang.Object r3 = r1.g()
            androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r5 = r7.a()
            if (r3 != r5) goto L_0x01aa
            androidx.compose.material3.pulltorefresh.b r3 = new androidx.compose.material3.pulltorefresh.b
            r3.<init>()
            r1.N(r3)
        L_0x01aa:
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            androidx.compose.ui.Modifier r2 = androidx.compose.ui.draw.DrawModifierKt.d(r2, r3)
            r3 = r4 & 14
            r5 = 4
            if (r3 != r5) goto L_0x01b8
            r3 = r21
            goto L_0x01b9
        L_0x01b8:
            r3 = 0
        L_0x01b9:
            r5 = r4 & 112(0x70, float:1.57E-43)
            r6 = 32
            if (r5 != r6) goto L_0x01c2
            r5 = r21
            goto L_0x01c3
        L_0x01c2:
            r5 = 0
        L_0x01c3:
            r3 = r3 | r5
            r5 = r4 & 7168(0x1c00, float:1.0045E-41)
            r5 = r5 ^ 3072(0xc00, float:4.305E-42)
            r6 = 2048(0x800, float:2.87E-42)
            if (r5 <= r6) goto L_0x01d2
            boolean r5 = r1.h(r9)
            if (r5 != 0) goto L_0x01d6
        L_0x01d2:
            r5 = r4 & 3072(0xc00, float:4.305E-42)
            if (r5 != r6) goto L_0x01d9
        L_0x01d6:
            r5 = r21
            goto L_0x01da
        L_0x01d9:
            r5 = 0
        L_0x01da:
            r3 = r3 | r5
            r5 = 3670016(0x380000, float:5.142788E-39)
            r5 = r5 & r4
            r5 = r5 ^ r17
            r6 = 1048576(0x100000, float:1.469368E-39)
            if (r5 <= r6) goto L_0x01ea
            boolean r5 = r1.h(r15)
            if (r5 != 0) goto L_0x01ee
        L_0x01ea:
            r5 = r4 & r17
            if (r5 != r6) goto L_0x01f1
        L_0x01ee:
            r5 = r21
            goto L_0x01f2
        L_0x01f1:
            r5 = 0
        L_0x01f2:
            r3 = r3 | r5
            r5 = 57344(0xe000, float:8.0356E-41)
            r5 = r5 & r4
            r5 = r5 ^ 24576(0x6000, float:3.4438E-41)
            r6 = 16384(0x4000, float:2.2959E-41)
            if (r5 <= r6) goto L_0x0203
            boolean r5 = r1.W(r0)
            if (r5 != 0) goto L_0x020a
        L_0x0203:
            r5 = r4 & 24576(0x6000, float:3.4438E-41)
            if (r5 != r6) goto L_0x0208
            goto L_0x020a
        L_0x0208:
            r21 = 0
        L_0x020a:
            r3 = r3 | r21
            java.lang.Object r5 = r1.g()
            if (r3 != 0) goto L_0x0218
            java.lang.Object r3 = r7.a()
            if (r5 != r3) goto L_0x022c
        L_0x0218:
            androidx.compose.material3.pulltorefresh.c r5 = new androidx.compose.material3.pulltorefresh.c
            r25 = r5
            r26 = r23
            r27 = r24
            r28 = r9
            r29 = r15
            r30 = r0
            r25.<init>(r26, r27, r28, r29, r30)
            r1.N(r5)
        L_0x022c:
            kotlin.jvm.functions.Function3 r5 = (kotlin.jvm.functions.Function3) r5
            androidx.compose.ui.Modifier r2 = androidx.compose.ui.layout.LayoutModifierKt.a(r2, r5)
            androidx.compose.ui.Modifier r2 = androidx.compose.foundation.BackgroundKt.a(r2, r13, r0)
            androidx.compose.ui.Alignment$Companion r3 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r3 = r3.e()
            int r4 = r4 >> 12
            r4 = r4 & 7168(0x1c00, float:1.0045E-41)
            r4 = r4 | 48
            r5 = 0
            androidx.compose.ui.layout.MeasurePolicy r3 = androidx.compose.foundation.layout.BoxKt.g(r3, r5)
            int r5 = androidx.compose.runtime.ComposablesKt.a(r1, r5)
            androidx.compose.runtime.CompositionLocalMap r6 = r1.I()
            androidx.compose.ui.Modifier r2 = androidx.compose.ui.ComposedModifierKt.e(r1, r2)
            androidx.compose.ui.node.ComposeUiNode$Companion r7 = androidx.compose.ui.node.ComposeUiNode.f17222h
            r16 = r0
            kotlin.jvm.functions.Function0 r0 = r7.a()
            androidx.compose.runtime.Applier r17 = r1.v()
            if (r17 != 0) goto L_0x0264
            androidx.compose.runtime.ComposablesKt.d()
        L_0x0264:
            r1.s()
            boolean r17 = r1.n()
            if (r17 == 0) goto L_0x0271
            r1.y(r0)
            goto L_0x0274
        L_0x0271:
            r1.K()
        L_0x0274:
            androidx.compose.runtime.Composer r0 = androidx.compose.runtime.Updater.b(r1)
            r17 = r8
            kotlin.jvm.functions.Function2 r8 = r7.c()
            androidx.compose.runtime.Updater.g(r0, r3, r8)
            kotlin.jvm.functions.Function2 r3 = r7.e()
            androidx.compose.runtime.Updater.g(r0, r6, r3)
            kotlin.jvm.functions.Function2 r3 = r7.b()
            boolean r6 = r0.n()
            if (r6 != 0) goto L_0x02a0
            java.lang.Object r6 = r0.g()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            boolean r6 = kotlin.jvm.internal.Intrinsics.d(r6, r8)
            if (r6 != 0) goto L_0x02ae
        L_0x02a0:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r0.N(r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.A(r5, r3)
        L_0x02ae:
            kotlin.jvm.functions.Function2 r3 = r7.d()
            androidx.compose.runtime.Updater.g(r0, r2, r3)
            androidx.compose.foundation.layout.BoxScopeInstance r0 = androidx.compose.foundation.layout.BoxScopeInstance.f3797a
            int r2 = r4 >> 6
            r2 = r2 & 112(0x70, float:1.57E-43)
            r2 = r2 | 6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r10.d(r0, r1, r2)
            r1.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x02d0
            androidx.compose.runtime.ComposerKt.X()
        L_0x02d0:
            r5 = r9
            r7 = r13
            r9 = r15
            r6 = r16
            r4 = r17
            goto L_0x02e1
        L_0x02d8:
            r1.B()
            r6 = r27
            r4 = r8
            r5 = r9
            r7 = r13
            r9 = r15
        L_0x02e1:
            androidx.compose.runtime.ScopeUpdateScope r13 = r1.x()
            if (r13 == 0) goto L_0x02fc
            androidx.compose.material3.pulltorefresh.d r14 = new androidx.compose.material3.pulltorefresh.d
            r0 = r14
            r1 = r22
            r2 = r23
            r3 = r24
            r10 = r31
            r11 = r33
            r12 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r10, r11, r12)
            r13.a(r14)
        L_0x02fc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.h(androidx.compose.material3.pulltorefresh.PullToRefreshState, boolean, androidx.compose.ui.Modifier, float, androidx.compose.ui.graphics.Shape, long, float, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    public final long o(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-1441334156, i2, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.<get-indicatorColor> (PullToRefresh.kt:413)");
        }
        long G = MaterialTheme.f10273a.a(composer, 6).G();
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return G;
    }

    public final long p(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(-80510850, i2, -1, "androidx.compose.material3.pulltorefresh.PullToRefreshDefaults.<get-indicatorContainerColor> (PullToRefresh.kt:409)");
        }
        long Z = MaterialTheme.f10273a.a(composer, 6).Z();
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return Z;
    }

    public final float q() {
        return f12596d;
    }
}
