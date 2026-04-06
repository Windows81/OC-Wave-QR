package androidx.compose.material3;

import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class NavigationDrawerKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f10427a = Dp.m((float) 400);

    /* renamed from: b  reason: collision with root package name */
    public static final float f10428b = Dp.m((float) 240);

    /* renamed from: c  reason: collision with root package name */
    public static final float f10429c = Dp.m((float) 12);

    /* renamed from: d  reason: collision with root package name */
    public static final float f10430d = Dp.m((float) 24);

    /* renamed from: e  reason: collision with root package name */
    public static final float f10431e = Dp.m((float) 48);

    /* renamed from: f  reason: collision with root package name */
    public static final TweenSpec f10432f = new TweenSpec(256, 0, (Easing) null, 6, (DefaultConstructorMarker) null);

    public static final Modifier A(Modifier modifier, FloatProducer floatProducer, float f2, boolean z2) {
        return GraphicsLayerModifierKt.a(modifier, new C0124i4(floatProducer, f2, z2));
    }

    public static final Unit B(FloatProducer floatProducer, float f2, boolean z2, GraphicsLayerScope graphicsLayerScope) {
        float invoke = floatProducer.invoke();
        float f3 = 1.0f;
        graphicsLayerScope.j(invoke > 0.0f ? ((float) 1) / ((invoke / f2) + 1.0f) : 1.0f);
        if (z2) {
            f3 = 0.0f;
        }
        graphicsLayerScope.Q1(TransformOriginKt.a(f3, 0.0f));
        return Unit.f40552a;
    }

    public static final Modifier C(Modifier modifier, FloatProducer floatProducer, float f2, boolean z2) {
        return GraphicsLayerModifierKt.a(modifier, new C0185m4(floatProducer, f2, z2));
    }

    public static final Unit D(FloatProducer floatProducer, float f2, boolean z2, GraphicsLayerScope graphicsLayerScope) {
        float invoke = floatProducer.invoke();
        float f3 = 0.0f;
        graphicsLayerScope.j(invoke > 0.0f ? (invoke / f2) + 1.0f : 1.0f);
        if (!z2) {
            f3 = 1.0f;
        }
        graphicsLayerScope.Q1(TransformOriginKt.a(f3, 0.5f));
        return Unit.f40552a;
    }

    public static final Modifier E(Modifier modifier, DrawerPredictiveBackState drawerPredictiveBackState, boolean z2) {
        return GraphicsLayerModifierKt.a(modifier, new C0158j4(drawerPredictiveBackState, z2));
    }

    public static final Unit F(DrawerPredictiveBackState drawerPredictiveBackState, boolean z2, GraphicsLayerScope graphicsLayerScope) {
        float y2 = y(graphicsLayerScope, drawerPredictiveBackState);
        float f2 = 1.0f;
        graphicsLayerScope.j(y2 == 0.0f ? 1.0f : z(graphicsLayerScope, drawerPredictiveBackState) / y2);
        if (z2) {
            f2 = 0.0f;
        }
        graphicsLayerScope.Q1(TransformOriginKt.a(f2, 0.0f));
        return Unit.f40552a;
    }

    public static final Modifier G(Modifier modifier, DrawerPredictiveBackState drawerPredictiveBackState, boolean z2) {
        return GraphicsLayerModifierKt.a(modifier, new C0194n4(drawerPredictiveBackState, z2));
    }

    public static final Unit H(DrawerPredictiveBackState drawerPredictiveBackState, boolean z2, GraphicsLayerScope graphicsLayerScope) {
        graphicsLayerScope.j(y(graphicsLayerScope, drawerPredictiveBackState));
        graphicsLayerScope.i(z(graphicsLayerScope, drawerPredictiveBackState));
        graphicsLayerScope.Q1(TransformOriginKt.a(z2 ? 1.0f : 0.0f, 0.5f));
        return Unit.f40552a;
    }

    public static final boolean g(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    public static final void h(MutableState mutableState, boolean z2) {
        mutableState.setValue(Boolean.valueOf(z2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x00fa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void i(androidx.compose.material3.DrawerPredictiveBackState r32, androidx.compose.foundation.layout.WindowInsets r33, androidx.compose.ui.Modifier r34, androidx.compose.ui.graphics.Shape r35, long r36, long r38, float r40, androidx.compose.material3.internal.FloatProducer r41, kotlin.jvm.functions.Function3 r42, androidx.compose.runtime.Composer r43, int r44, int r45) {
        /*
            r1 = r32
            r0 = r41
            r12 = r44
            r13 = r45
            r2 = 1560288494(0x5d001cee, float:5.7696969E17)
            r3 = r43
            androidx.compose.runtime.Composer r3 = r3.q(r2)
            r4 = r13 & 1
            if (r4 == 0) goto L_0x0018
            r4 = r12 | 6
            goto L_0x0028
        L_0x0018:
            r4 = r12 & 6
            if (r4 != 0) goto L_0x0027
            boolean r4 = r3.W(r1)
            if (r4 == 0) goto L_0x0024
            r4 = 4
            goto L_0x0025
        L_0x0024:
            r4 = 2
        L_0x0025:
            r4 = r4 | r12
            goto L_0x0028
        L_0x0027:
            r4 = r12
        L_0x0028:
            r5 = r13 & 2
            if (r5 == 0) goto L_0x0031
            r4 = r4 | 48
        L_0x002e:
            r5 = r33
            goto L_0x0043
        L_0x0031:
            r5 = r12 & 48
            if (r5 != 0) goto L_0x002e
            r5 = r33
            boolean r6 = r3.W(r5)
            if (r6 == 0) goto L_0x0040
            r6 = 32
            goto L_0x0042
        L_0x0040:
            r6 = 16
        L_0x0042:
            r4 = r4 | r6
        L_0x0043:
            r6 = r13 & 4
            if (r6 == 0) goto L_0x004c
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x0049:
            r7 = r34
            goto L_0x005e
        L_0x004c:
            r7 = r12 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x0049
            r7 = r34
            boolean r8 = r3.W(r7)
            if (r8 == 0) goto L_0x005b
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x005d
        L_0x005b:
            r8 = 128(0x80, float:1.794E-43)
        L_0x005d:
            r4 = r4 | r8
        L_0x005e:
            r8 = r13 & 8
            if (r8 == 0) goto L_0x0067
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x0064:
            r9 = r35
            goto L_0x0079
        L_0x0067:
            r9 = r12 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0064
            r9 = r35
            boolean r10 = r3.W(r9)
            if (r10 == 0) goto L_0x0076
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0078
        L_0x0076:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0078:
            r4 = r4 | r10
        L_0x0079:
            r10 = r12 & 24576(0x6000, float:3.4438E-41)
            if (r10 != 0) goto L_0x0092
            r10 = r13 & 16
            if (r10 != 0) goto L_0x008c
            r10 = r36
            boolean r14 = r3.j(r10)
            if (r14 == 0) goto L_0x008e
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0090
        L_0x008c:
            r10 = r36
        L_0x008e:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x0090:
            r4 = r4 | r14
            goto L_0x0094
        L_0x0092:
            r10 = r36
        L_0x0094:
            r14 = 196608(0x30000, float:2.75506E-40)
            r14 = r14 & r12
            if (r14 != 0) goto L_0x00af
            r14 = r13 & 32
            if (r14 != 0) goto L_0x00a8
            r14 = r38
            boolean r16 = r3.j(r14)
            if (r16 == 0) goto L_0x00aa
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ac
        L_0x00a8:
            r14 = r38
        L_0x00aa:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x00ac:
            r4 = r4 | r16
            goto L_0x00b1
        L_0x00af:
            r14 = r38
        L_0x00b1:
            r16 = r13 & 64
            r17 = 1572864(0x180000, float:2.204052E-39)
            if (r16 == 0) goto L_0x00bc
            r4 = r4 | r17
            r2 = r40
            goto L_0x00cf
        L_0x00bc:
            r17 = r12 & r17
            r2 = r40
            if (r17 != 0) goto L_0x00cf
            boolean r18 = r3.h(r2)
            if (r18 == 0) goto L_0x00cb
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00cd
        L_0x00cb:
            r18 = 524288(0x80000, float:7.34684E-40)
        L_0x00cd:
            r4 = r4 | r18
        L_0x00cf:
            r18 = 12582912(0xc00000, float:1.7632415E-38)
            r19 = r12 & r18
            if (r19 != 0) goto L_0x00ef
            r2 = r13 & 128(0x80, float:1.794E-43)
            if (r2 != 0) goto L_0x00ec
            r2 = 16777216(0x1000000, float:2.3509887E-38)
            r2 = r2 & r12
            if (r2 != 0) goto L_0x00e3
            boolean r2 = r3.W(r0)
            goto L_0x00e7
        L_0x00e3:
            boolean r2 = r3.l(r0)
        L_0x00e7:
            if (r2 == 0) goto L_0x00ec
            r2 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ee
        L_0x00ec:
            r2 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ee:
            r4 = r4 | r2
        L_0x00ef:
            r2 = r13 & 256(0x100, float:3.59E-43)
            r19 = 100663296(0x6000000, float:2.4074124E-35)
            if (r2 == 0) goto L_0x00fa
            r4 = r4 | r19
        L_0x00f7:
            r2 = r42
            goto L_0x010d
        L_0x00fa:
            r2 = r12 & r19
            if (r2 != 0) goto L_0x00f7
            r2 = r42
            boolean r19 = r3.l(r2)
            if (r19 == 0) goto L_0x0109
            r19 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010b
        L_0x0109:
            r19 = 33554432(0x2000000, float:9.403955E-38)
        L_0x010b:
            r4 = r4 | r19
        L_0x010d:
            r19 = 38347923(0x2492493, float:1.4777644E-37)
            r0 = r4 & r19
            r2 = 38347922(0x2492492, float:1.4777643E-37)
            r19 = 0
            if (r0 == r2) goto L_0x011b
            r0 = 1
            goto L_0x011d
        L_0x011b:
            r0 = r19
        L_0x011d:
            r2 = r4 & 1
            boolean r0 = r3.E(r0, r2)
            if (r0 == 0) goto L_0x0268
            r3.p()
            r0 = r12 & 1
            r2 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r20 = -458753(0xfffffffffff8ffff, float:NaN)
            r21 = -57345(0xffffffffffff1fff, float:NaN)
            r5 = 6
            if (r0 == 0) goto L_0x0158
            boolean r0 = r3.J()
            if (r0 == 0) goto L_0x013d
            goto L_0x0158
        L_0x013d:
            r3.B()
            r0 = r13 & 16
            if (r0 == 0) goto L_0x0146
            r4 = r4 & r21
        L_0x0146:
            r0 = r13 & 32
            if (r0 == 0) goto L_0x014c
            r4 = r4 & r20
        L_0x014c:
            r0 = r13 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0151
            r4 = r4 & r2
        L_0x0151:
            r0 = r40
        L_0x0153:
            r6 = r41
        L_0x0155:
            r27 = r14
            goto L_0x01a6
        L_0x0158:
            if (r6 == 0) goto L_0x015d
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            r7 = r0
        L_0x015d:
            if (r8 == 0) goto L_0x0164
            androidx.compose.ui.graphics.Shape r0 = androidx.compose.ui.graphics.RectangleShapeKt.a()
            r9 = r0
        L_0x0164:
            r0 = r13 & 16
            if (r0 == 0) goto L_0x0170
            androidx.compose.material3.DrawerDefaults r0 = androidx.compose.material3.DrawerDefaults.f9874a
            long r10 = r0.b(r3, r5)
            r4 = r4 & r21
        L_0x0170:
            r0 = r13 & 32
            if (r0 == 0) goto L_0x017f
            int r0 = r4 >> 12
            r0 = r0 & 14
            long r14 = androidx.compose.material3.ColorSchemeKt.g(r10, r3, r0)
            r0 = r4 & r20
            r4 = r0
        L_0x017f:
            if (r16 == 0) goto L_0x0188
            androidx.compose.material3.DrawerDefaults r0 = androidx.compose.material3.DrawerDefaults.f9874a
            float r0 = r0.a()
            goto L_0x018a
        L_0x0188:
            r0 = r40
        L_0x018a:
            r6 = r13 & 128(0x80, float:1.794E-43)
            if (r6 == 0) goto L_0x0153
            java.lang.Object r6 = r3.g()
            androidx.compose.runtime.Composer$Companion r8 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r8 = r8.a()
            if (r6 != r8) goto L_0x01a2
            androidx.compose.material3.k4 r6 = new androidx.compose.material3.k4
            r6.<init>()
            r3.N(r6)
        L_0x01a2:
            androidx.compose.material3.internal.FloatProducer r6 = (androidx.compose.material3.internal.FloatProducer) r6
            r4 = r4 & r2
            goto L_0x0155
        L_0x01a6:
            r3.U()
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x01b8
            r2 = -1
            java.lang.String r8 = "androidx.compose.material3.DrawerSheet (NavigationDrawer.kt:796)"
            r14 = 1560288494(0x5d001cee, float:5.7696969E17)
            androidx.compose.runtime.ComposerKt.Y(r14, r4, r2, r8)
        L_0x01b8:
            androidx.compose.runtime.ProvidableCompositionLocal r2 = androidx.compose.ui.platform.CompositionLocalsKt.g()
            java.lang.Object r2 = r3.C(r2)
            androidx.compose.ui.unit.Density r2 = (androidx.compose.ui.unit.Density) r2
            androidx.compose.material3.tokens.NavigationDrawerTokens r8 = androidx.compose.material3.tokens.NavigationDrawerTokens.f13594a
            float r8 = r8.a()
            float r2 = r2.B1(r8)
            androidx.compose.runtime.ProvidableCompositionLocal r14 = androidx.compose.ui.platform.CompositionLocalsKt.m()
            java.lang.Object r14 = r3.C(r14)
            androidx.compose.ui.unit.LayoutDirection r15 = androidx.compose.ui.unit.LayoutDirection.Rtl
            if (r14 != r15) goto L_0x01da
            r14 = 1
            goto L_0x01dc
        L_0x01da:
            r14 = r19
        L_0x01dc:
            if (r1 == 0) goto L_0x01e5
            androidx.compose.ui.Modifier$Companion r15 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.ui.Modifier r15 = G(r15, r1, r14)
            goto L_0x01e7
        L_0x01e5:
            androidx.compose.ui.Modifier$Companion r15 = androidx.compose.ui.Modifier.f15489d
        L_0x01e7:
            float r16 = f10428b
            r17 = 10
            r19 = 0
            r20 = 0
            r21 = 0
            r34 = r7
            r35 = r16
            r36 = r20
            r37 = r8
            r38 = r21
            r39 = r17
            r40 = r19
            androidx.compose.ui.Modifier r5 = androidx.compose.foundation.layout.SizeKt.x(r34, r35, r36, r37, r38, r39, r40)
            androidx.compose.ui.Modifier r5 = C(r5, r6, r2, r14)
            androidx.compose.ui.Modifier r5 = r5.o0(r15)
            r15 = 0
            r1 = 0
            r29 = r7
            r7 = 1
            androidx.compose.ui.Modifier r1 = androidx.compose.foundation.layout.SizeKt.d(r5, r15, r7, r1)
            androidx.compose.material3.NavigationDrawerKt$DrawerSheet$2 r5 = new androidx.compose.material3.NavigationDrawerKt$DrawerSheet$2
            r34 = r5
            r35 = r32
            r36 = r14
            r38 = r6
            r39 = r2
            r40 = r33
            r41 = r42
            r34.<init>(r35, r36, r37, r38, r39, r40, r41)
            r2 = 54
            r7 = -315420087(0xffffffffed331249, float:-3.463745E27)
            r8 = 1
            androidx.compose.runtime.internal.ComposableLambda r23 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r7, r8, r5, r3, r2)
            r2 = 6
            int r2 = r4 >> 6
            r4 = r2 & 112(0x70, float:1.57E-43)
            r4 = r4 | r18
            r5 = r2 & 896(0x380, float:1.256E-42)
            r4 = r4 | r5
            r5 = r2 & 7168(0x1c00, float:1.0045E-41)
            r4 = r4 | r5
            r5 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r5
            r25 = r4 | r2
            r26 = 96
            r22 = 0
            r14 = r1
            r15 = r9
            r16 = r10
            r18 = r27
            r20 = r0
            r24 = r3
            androidx.compose.material3.SurfaceKt.c(r14, r15, r16, r18, r20, r21, r22, r23, r24, r25, r26)
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x025e
            androidx.compose.runtime.ComposerKt.X()
        L_0x025e:
            r4 = r9
            r7 = r29
            r9 = r0
            r30 = r10
            r10 = r6
            r5 = r30
            goto L_0x0273
        L_0x0268:
            r3.B()
            r4 = r9
            r5 = r10
            r27 = r14
            r9 = r40
            r10 = r41
        L_0x0273:
            androidx.compose.runtime.ScopeUpdateScope r14 = r3.x()
            if (r14 == 0) goto L_0x028f
            androidx.compose.material3.l4 r15 = new androidx.compose.material3.l4
            r0 = r15
            r1 = r32
            r2 = r33
            r3 = r7
            r7 = r27
            r11 = r42
            r12 = r44
            r13 = r45
            r0.<init>(r1, r2, r3, r4, r5, r7, r9, r10, r11, r12, r13)
            r14.a(r15)
        L_0x028f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.i(androidx.compose.material3.DrawerPredictiveBackState, androidx.compose.foundation.layout.WindowInsets, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, float, androidx.compose.material3.internal.FloatProducer, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final float j() {
        return 0.0f;
    }

    public static final Unit k(DrawerPredictiveBackState drawerPredictiveBackState, WindowInsets windowInsets, Modifier modifier, Shape shape, long j2, long j3, float f2, FloatProducer floatProducer, Function3 function3, int i2, int i3, Composer composer, int i4) {
        i(drawerPredictiveBackState, windowInsets, modifier, shape, j2, j3, f2, floatProducer, function3, composer, RecomposeScopeImplKt.a(i2 | 1), i3);
        return Unit.f40552a;
    }

    public static final boolean l(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    public static final void m(MutableState mutableState, boolean z2) {
        mutableState.setValue(Boolean.valueOf(z2));
    }

    public static final float n(MutableFloatState mutableFloatState) {
        return mutableFloatState.c();
    }

    public static final void o(MutableFloatState mutableFloatState, float f2) {
        mutableFloatState.j(f2);
    }

    public static final float y(GraphicsLayerScope graphicsLayerScope, DrawerPredictiveBackState drawerPredictiveBackState) {
        float intBitsToFloat = Float.intBitsToFloat((int) (graphicsLayerScope.c() >> 32));
        if (Float.isNaN(intBitsToFloat) || intBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f + ((drawerPredictiveBackState.b() * ((float) (drawerPredictiveBackState.d() ? 1 : -1))) / intBitsToFloat);
    }

    public static final float z(GraphicsLayerScope graphicsLayerScope, DrawerPredictiveBackState drawerPredictiveBackState) {
        float intBitsToFloat = Float.intBitsToFloat((int) (graphicsLayerScope.c() & 4294967295L));
        if (Float.isNaN(intBitsToFloat) || intBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (drawerPredictiveBackState.c() / intBitsToFloat);
    }
}
