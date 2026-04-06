package androidx.compose.material;

import androidx.compose.runtime.State;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;

@Metadata
public final class MenuKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f7948a;

    /* renamed from: b  reason: collision with root package name */
    public static final float f7949b;

    /* renamed from: c  reason: collision with root package name */
    public static final float f7950c = Dp.m((float) 16);

    /* renamed from: d  reason: collision with root package name */
    public static final float f7951d;

    /* renamed from: e  reason: collision with root package name */
    public static final float f7952e = Dp.m((float) 112);

    /* renamed from: f  reason: collision with root package name */
    public static final float f7953f = Dp.m((float) 280);

    /* renamed from: g  reason: collision with root package name */
    public static final float f7954g;

    static {
        float f2 = (float) 8;
        f7948a = Dp.m(f2);
        float f3 = (float) 48;
        f7949b = Dp.m(f3);
        f7951d = Dp.m(f2);
        f7954g = Dp.m(f3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:117:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(androidx.compose.animation.core.MutableTransitionState r23, androidx.compose.runtime.MutableState r24, androidx.compose.foundation.ScrollState r25, androidx.compose.ui.Modifier r26, kotlin.jvm.functions.Function3 r27, androidx.compose.runtime.Composer r28, int r29, int r30) {
        /*
            r1 = r23
            r2 = r24
            r3 = r25
            r5 = r27
            r6 = r29
            r0 = 435109845(0x19ef3fd5, float:2.4737802E-23)
            r4 = r28
            androidx.compose.runtime.Composer r4 = r4.q(r0)
            r7 = r30 & 1
            if (r7 == 0) goto L_0x001a
            r7 = r6 | 6
            goto L_0x0033
        L_0x001a:
            r7 = r6 & 6
            if (r7 != 0) goto L_0x0032
            r7 = r6 & 8
            if (r7 != 0) goto L_0x0027
            boolean r7 = r4.W(r1)
            goto L_0x002b
        L_0x0027:
            boolean r7 = r4.l(r1)
        L_0x002b:
            if (r7 == 0) goto L_0x002f
            r7 = 4
            goto L_0x0030
        L_0x002f:
            r7 = 2
        L_0x0030:
            r7 = r7 | r6
            goto L_0x0033
        L_0x0032:
            r7 = r6
        L_0x0033:
            r8 = r30 & 2
            if (r8 == 0) goto L_0x003a
            r7 = r7 | 48
            goto L_0x004a
        L_0x003a:
            r8 = r6 & 48
            if (r8 != 0) goto L_0x004a
            boolean r8 = r4.W(r2)
            if (r8 == 0) goto L_0x0047
            r8 = 32
            goto L_0x0049
        L_0x0047:
            r8 = 16
        L_0x0049:
            r7 = r7 | r8
        L_0x004a:
            r8 = r30 & 4
            if (r8 == 0) goto L_0x0051
            r7 = r7 | 384(0x180, float:5.38E-43)
            goto L_0x0061
        L_0x0051:
            r8 = r6 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x0061
            boolean r8 = r4.W(r3)
            if (r8 == 0) goto L_0x005e
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r7 = r7 | r8
        L_0x0061:
            r8 = r30 & 8
            if (r8 == 0) goto L_0x006a
            r7 = r7 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r9 = r26
            goto L_0x007c
        L_0x006a:
            r9 = r6 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0067
            r9 = r26
            boolean r10 = r4.W(r9)
            if (r10 == 0) goto L_0x0079
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r7 = r7 | r10
        L_0x007c:
            r10 = r30 & 16
            if (r10 == 0) goto L_0x0084
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
        L_0x0082:
            r14 = r7
            goto L_0x0095
        L_0x0084:
            r10 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r10 != 0) goto L_0x0082
            boolean r10 = r4.l(r5)
            if (r10 == 0) goto L_0x0091
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0093
        L_0x0091:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x0093:
            r7 = r7 | r10
            goto L_0x0082
        L_0x0095:
            r7 = r14 & 9363(0x2493, float:1.312E-41)
            r10 = 9362(0x2492, float:1.3119E-41)
            r13 = 0
            if (r7 == r10) goto L_0x009e
            r7 = 1
            goto L_0x009f
        L_0x009e:
            r7 = r13
        L_0x009f:
            r10 = r14 & 1
            boolean r7 = r4.E(r7, r10)
            if (r7 == 0) goto L_0x022f
            if (r8 == 0) goto L_0x00ad
            androidx.compose.ui.Modifier$Companion r7 = androidx.compose.ui.Modifier.f15489d
            r11 = r7
            goto L_0x00ae
        L_0x00ad:
            r11 = r9
        L_0x00ae:
            boolean r7 = androidx.compose.runtime.ComposerKt.P()
            r10 = -1
            if (r7 == 0) goto L_0x00ba
            java.lang.String r7 = "androidx.compose.material.DropdownMenuContent (Menu.kt:156)"
            androidx.compose.runtime.ComposerKt.Y(r0, r14, r10, r7)
        L_0x00ba:
            int r0 = androidx.compose.animation.core.MutableTransitionState.f2620d
            r0 = r0 | 48
            r7 = r14 & 14
            r0 = r0 | r7
            java.lang.String r7 = "DropDownMenu"
            androidx.compose.animation.core.Transition r0 = androidx.compose.animation.core.TransitionKt.h(r1, r7, r4, r0, r13)
            androidx.compose.material.MenuKt$DropdownMenuContent$scale$2 r7 = androidx.compose.material.MenuKt$DropdownMenuContent$scale$2.f7965z
            kotlin.jvm.internal.FloatCompanionObject r16 = kotlin.jvm.internal.FloatCompanionObject.f40896a
            androidx.compose.animation.core.TwoWayConverter r17 = androidx.compose.animation.core.VectorConvertersKt.i(r16)
            java.lang.Object r8 = r0.i()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r9 = 1652594929(0x628098f1, float:1.1861019E21)
            r4.X(r9)
            boolean r18 = androidx.compose.runtime.ComposerKt.P()
            java.lang.String r12 = "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:172)"
            if (r18 == 0) goto L_0x00ea
            androidx.compose.runtime.ComposerKt.Y(r9, r13, r10, r12)
        L_0x00ea:
            r18 = 1061997773(0x3f4ccccd, float:0.8)
            r19 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L_0x00f4
            r8 = r19
            goto L_0x00f6
        L_0x00f4:
            r8 = r18
        L_0x00f6:
            boolean r20 = androidx.compose.runtime.ComposerKt.P()
            if (r20 == 0) goto L_0x00ff
            androidx.compose.runtime.ComposerKt.X()
        L_0x00ff:
            r4.M()
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            java.lang.Object r20 = r0.q()
            java.lang.Boolean r20 = (java.lang.Boolean) r20
            boolean r20 = r20.booleanValue()
            r4.X(r9)
            boolean r21 = androidx.compose.runtime.ComposerKt.P()
            if (r21 == 0) goto L_0x011c
            androidx.compose.runtime.ComposerKt.Y(r9, r13, r10, r12)
        L_0x011c:
            if (r20 == 0) goto L_0x0120
            r18 = r19
        L_0x0120:
            boolean r9 = androidx.compose.runtime.ComposerKt.P()
            if (r9 == 0) goto L_0x0129
            androidx.compose.runtime.ComposerKt.X()
        L_0x0129:
            r4.M()
            java.lang.Float r9 = java.lang.Float.valueOf(r18)
            androidx.compose.animation.core.Transition$Segment r12 = r0.o()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r13)
            java.lang.Object r7 = r7.d(r12, r4, r10)
            r10 = r7
            androidx.compose.animation.core.FiniteAnimationSpec r10 = (androidx.compose.animation.core.FiniteAnimationSpec) r10
            java.lang.String r12 = "FloatAnimation"
            r18 = 0
            r7 = r0
            r15 = -1
            r22 = r11
            r11 = r17
            r1 = r13
            r13 = r4
            r17 = r14
            r14 = r18
            androidx.compose.runtime.State r14 = androidx.compose.animation.core.TransitionKt.f(r7, r8, r9, r10, r11, r12, r13, r14)
            androidx.compose.material.MenuKt$DropdownMenuContent$alpha$2 r7 = androidx.compose.material.MenuKt$DropdownMenuContent$alpha$2.f7964z
            androidx.compose.animation.core.TwoWayConverter r11 = androidx.compose.animation.core.VectorConvertersKt.i(r16)
            java.lang.Object r8 = r0.i()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r9 = 388050693(0x17212f05, float:5.2081253E-25)
            r4.X(r9)
            boolean r10 = androidx.compose.runtime.ComposerKt.P()
            java.lang.String r12 = "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:193)"
            if (r10 == 0) goto L_0x0174
            androidx.compose.runtime.ComposerKt.Y(r9, r1, r15, r12)
        L_0x0174:
            r10 = 0
            if (r8 == 0) goto L_0x017a
            r8 = r19
            goto L_0x017b
        L_0x017a:
            r8 = r10
        L_0x017b:
            boolean r13 = androidx.compose.runtime.ComposerKt.P()
            if (r13 == 0) goto L_0x0184
            androidx.compose.runtime.ComposerKt.X()
        L_0x0184:
            r4.M()
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            java.lang.Object r13 = r0.q()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            r4.X(r9)
            boolean r16 = androidx.compose.runtime.ComposerKt.P()
            if (r16 == 0) goto L_0x01a1
            androidx.compose.runtime.ComposerKt.Y(r9, r1, r15, r12)
        L_0x01a1:
            if (r13 == 0) goto L_0x01a4
            goto L_0x01a6
        L_0x01a4:
            r19 = r10
        L_0x01a6:
            boolean r9 = androidx.compose.runtime.ComposerKt.P()
            if (r9 == 0) goto L_0x01af
            androidx.compose.runtime.ComposerKt.X()
        L_0x01af:
            r4.M()
            java.lang.Float r9 = java.lang.Float.valueOf(r19)
            androidx.compose.animation.core.Transition$Segment r10 = r0.o()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            java.lang.Object r7 = r7.d(r10, r4, r12)
            r10 = r7
            androidx.compose.animation.core.FiniteAnimationSpec r10 = (androidx.compose.animation.core.FiniteAnimationSpec) r10
            java.lang.String r12 = "FloatAnimation"
            r7 = r0
            r13 = r4
            r0 = r14
            r14 = r18
            androidx.compose.runtime.State r7 = androidx.compose.animation.core.TransitionKt.f(r7, r8, r9, r10, r11, r12, r13, r14)
            androidx.compose.ui.Modifier$Companion r8 = androidx.compose.ui.Modifier.f15489d
            boolean r9 = r4.W(r0)
            boolean r10 = r4.W(r7)
            r9 = r9 | r10
            r10 = r17 & 112(0x70, float:1.57E-43)
            r11 = 32
            if (r10 != r11) goto L_0x01e3
            r13 = 1
            goto L_0x01e4
        L_0x01e3:
            r13 = r1
        L_0x01e4:
            r1 = r9 | r13
            java.lang.Object r9 = r4.g()
            if (r1 != 0) goto L_0x01f4
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
            if (r9 != r1) goto L_0x01fc
        L_0x01f4:
            androidx.compose.material.MenuKt$DropdownMenuContent$1$1 r9 = new androidx.compose.material.MenuKt$DropdownMenuContent$1$1
            r9.<init>(r2, r0, r7)
            r4.N(r9)
        L_0x01fc:
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            androidx.compose.ui.Modifier r7 = androidx.compose.ui.graphics.GraphicsLayerModifierKt.a(r8, r9)
            float r14 = f7948a
            androidx.compose.material.MenuKt$DropdownMenuContent$2 r0 = new androidx.compose.material.MenuKt$DropdownMenuContent$2
            r1 = r22
            r0.<init>(r1, r3, r5)
            r8 = 54
            r9 = 895555282(0x356116d2, float:8.385224E-7)
            r10 = 1
            androidx.compose.runtime.internal.ComposableLambda r15 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r9, r10, r0, r4, r8)
            r17 = 1769472(0x1b0000, float:2.479558E-39)
            r18 = 30
            r8 = 0
            r9 = 0
            r11 = 0
            r13 = 0
            r16 = r4
            androidx.compose.material.CardKt.a(r7, r8, r9, r11, r13, r14, r15, r16, r17, r18)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x022d
            androidx.compose.runtime.ComposerKt.X()
        L_0x022d:
            r9 = r1
            goto L_0x0232
        L_0x022f:
            r4.B()
        L_0x0232:
            androidx.compose.runtime.ScopeUpdateScope r8 = r4.x()
            if (r8 == 0) goto L_0x024e
            androidx.compose.material.MenuKt$DropdownMenuContent$3 r10 = new androidx.compose.material.MenuKt$DropdownMenuContent$3
            r0 = r10
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r9
            r5 = r27
            r6 = r29
            r7 = r30
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r10)
        L_0x024e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.MenuKt.a(androidx.compose.animation.core.MutableTransitionState, androidx.compose.runtime.MutableState, androidx.compose.foundation.ScrollState, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final float b(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    public static final float c(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d(kotlin.jvm.functions.Function0 r25, androidx.compose.ui.Modifier r26, boolean r27, androidx.compose.foundation.layout.PaddingValues r28, androidx.compose.foundation.interaction.MutableInteractionSource r29, kotlin.jvm.functions.Function3 r30, androidx.compose.runtime.Composer r31, int r32, int r33) {
        /*
            r6 = r30
            r7 = r32
            r0 = 87134531(0x5319143, float:8.3491804E-36)
            r1 = r31
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r2 = r33 & 1
            if (r2 == 0) goto L_0x0017
            r2 = r7 | 6
            r3 = r2
            r2 = r25
            goto L_0x002b
        L_0x0017:
            r2 = r7 & 6
            if (r2 != 0) goto L_0x0028
            r2 = r25
            boolean r3 = r1.l(r2)
            if (r3 == 0) goto L_0x0025
            r3 = 4
            goto L_0x0026
        L_0x0025:
            r3 = 2
        L_0x0026:
            r3 = r3 | r7
            goto L_0x002b
        L_0x0028:
            r2 = r25
            r3 = r7
        L_0x002b:
            r4 = r33 & 2
            if (r4 == 0) goto L_0x0034
            r3 = r3 | 48
        L_0x0031:
            r5 = r26
            goto L_0x0046
        L_0x0034:
            r5 = r7 & 48
            if (r5 != 0) goto L_0x0031
            r5 = r26
            boolean r8 = r1.W(r5)
            if (r8 == 0) goto L_0x0043
            r8 = 32
            goto L_0x0045
        L_0x0043:
            r8 = 16
        L_0x0045:
            r3 = r3 | r8
        L_0x0046:
            r8 = r33 & 4
            if (r8 == 0) goto L_0x004f
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r9 = r27
            goto L_0x0061
        L_0x004f:
            r9 = r7 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x004c
            r9 = r27
            boolean r10 = r1.d(r9)
            if (r10 == 0) goto L_0x005e
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r3 = r3 | r10
        L_0x0061:
            r10 = r33 & 8
            if (r10 == 0) goto L_0x006a
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r11 = r28
            goto L_0x007c
        L_0x006a:
            r11 = r7 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x0067
            r11 = r28
            boolean r12 = r1.W(r11)
            if (r12 == 0) goto L_0x0079
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r3 = r3 | r12
        L_0x007c:
            r12 = r33 & 16
            if (r12 == 0) goto L_0x0085
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0082:
            r13 = r29
            goto L_0x0097
        L_0x0085:
            r13 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x0082
            r13 = r29
            boolean r14 = r1.W(r13)
            if (r14 == 0) goto L_0x0094
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0094:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r3 = r3 | r14
        L_0x0097:
            r14 = r33 & 32
            r15 = 196608(0x30000, float:2.75506E-40)
            if (r14 == 0) goto L_0x009f
            r3 = r3 | r15
            goto L_0x00af
        L_0x009f:
            r14 = r7 & r15
            if (r14 != 0) goto L_0x00af
            boolean r14 = r1.l(r6)
            if (r14 == 0) goto L_0x00ac
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ae
        L_0x00ac:
            r14 = 65536(0x10000, float:9.18355E-41)
        L_0x00ae:
            r3 = r3 | r14
        L_0x00af:
            r14 = 74899(0x12493, float:1.04956E-40)
            r14 = r14 & r3
            r15 = 74898(0x12492, float:1.04954E-40)
            r13 = 1
            if (r14 == r15) goto L_0x00bb
            r14 = r13
            goto L_0x00bc
        L_0x00bb:
            r14 = 0
        L_0x00bc:
            r15 = r3 & 1
            boolean r14 = r1.E(r14, r15)
            if (r14 == 0) goto L_0x01d5
            if (r4 == 0) goto L_0x00c9
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.f15489d
            goto L_0x00ca
        L_0x00c9:
            r4 = r5
        L_0x00ca:
            if (r8 == 0) goto L_0x00ce
            r5 = r13
            goto L_0x00cf
        L_0x00ce:
            r5 = r9
        L_0x00cf:
            if (r10 == 0) goto L_0x00d9
            androidx.compose.material.MenuDefaults r8 = androidx.compose.material.MenuDefaults.f7946a
            androidx.compose.foundation.layout.PaddingValues r8 = r8.a()
            r15 = r8
            goto L_0x00da
        L_0x00d9:
            r15 = r11
        L_0x00da:
            r14 = 0
            if (r12 == 0) goto L_0x00e0
            r17 = r14
            goto L_0x00e2
        L_0x00e0:
            r17 = r29
        L_0x00e2:
            boolean r8 = androidx.compose.runtime.ComposerKt.P()
            if (r8 == 0) goto L_0x00ee
            r8 = -1
            java.lang.String r9 = "androidx.compose.material.DropdownMenuItemContent (Menu.kt:230)"
            androidx.compose.runtime.ComposerKt.Y(r0, r3, r8, r9)
        L_0x00ee:
            r22 = 6
            r23 = 0
            r18 = 1
            r19 = 0
            r20 = 0
            androidx.compose.foundation.IndicationNodeFactory r10 = androidx.compose.material.RippleKt.f(r18, r19, r20, r22, r23)
            r0 = 24
            r16 = 0
            r12 = 0
            r3 = 0
            r8 = r4
            r9 = r17
            r11 = r5
            r13 = r3
            r3 = r14
            r14 = r25
            r24 = r15
            r15 = r0
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.ClickableKt.d(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r8 = 0
            r9 = 1
            androidx.compose.ui.Modifier r10 = androidx.compose.foundation.layout.SizeKt.h(r0, r8, r9, r3)
            float r11 = f7952e
            float r13 = f7953f
            float r12 = f7954g
            r15 = 8
            r14 = 0
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.x(r10, r11, r12, r13, r14, r15, r16)
            r8 = r24
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.PaddingKt.h(r0, r8)
            androidx.compose.ui.Alignment$Companion r3 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment$Vertical r3 = r3.i()
            androidx.compose.foundation.layout.Arrangement r10 = androidx.compose.foundation.layout.Arrangement.f3739a
            androidx.compose.foundation.layout.Arrangement$Horizontal r10 = r10.f()
            r11 = 48
            androidx.compose.ui.layout.MeasurePolicy r3 = androidx.compose.foundation.layout.RowKt.b(r10, r3, r1, r11)
            r10 = 0
            int r10 = androidx.compose.runtime.ComposablesKt.a(r1, r10)
            androidx.compose.runtime.CompositionLocalMap r12 = r1.I()
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.ComposedModifierKt.e(r1, r0)
            androidx.compose.ui.node.ComposeUiNode$Companion r13 = androidx.compose.ui.node.ComposeUiNode.f17222h
            kotlin.jvm.functions.Function0 r14 = r13.a()
            androidx.compose.runtime.Applier r15 = r1.v()
            if (r15 != 0) goto L_0x0158
            androidx.compose.runtime.ComposablesKt.d()
        L_0x0158:
            r1.s()
            boolean r15 = r1.n()
            if (r15 == 0) goto L_0x0165
            r1.y(r14)
            goto L_0x0168
        L_0x0165:
            r1.K()
        L_0x0168:
            androidx.compose.runtime.Composer r14 = androidx.compose.runtime.Updater.b(r1)
            kotlin.jvm.functions.Function2 r15 = r13.c()
            androidx.compose.runtime.Updater.g(r14, r3, r15)
            kotlin.jvm.functions.Function2 r3 = r13.e()
            androidx.compose.runtime.Updater.g(r14, r12, r3)
            kotlin.jvm.functions.Function2 r3 = r13.b()
            boolean r12 = r14.n()
            if (r12 != 0) goto L_0x0192
            java.lang.Object r12 = r14.g()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r10)
            boolean r12 = kotlin.jvm.internal.Intrinsics.d(r12, r15)
            if (r12 != 0) goto L_0x01a0
        L_0x0192:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)
            r14.N(r12)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r14.A(r10, r3)
        L_0x01a0:
            kotlin.jvm.functions.Function2 r3 = r13.d()
            androidx.compose.runtime.Updater.g(r14, r0, r3)
            androidx.compose.foundation.layout.RowScopeInstance r0 = androidx.compose.foundation.layout.RowScopeInstance.f4150a
            androidx.compose.material.MaterialTheme r3 = androidx.compose.material.MaterialTheme.f7937a
            r10 = 6
            androidx.compose.material.Typography r3 = r3.c(r1, r10)
            androidx.compose.ui.text.TextStyle r3 = r3.g()
            androidx.compose.material.MenuKt$DropdownMenuItemContent$1$1 r10 = new androidx.compose.material.MenuKt$DropdownMenuItemContent$1$1
            r10.<init>(r5, r6, r0)
            r0 = 54
            r12 = 1190489496(0x46f56d98, float:31414.797)
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r12, r9, r10, r1, r0)
            androidx.compose.material.TextKt.a(r3, r0, r1, r11)
            r1.T()
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x01d1
            androidx.compose.runtime.ComposerKt.X()
        L_0x01d1:
            r3 = r5
            r5 = r17
            goto L_0x01dd
        L_0x01d5:
            r1.B()
            r4 = r5
            r3 = r9
            r8 = r11
            r5 = r29
        L_0x01dd:
            androidx.compose.runtime.ScopeUpdateScope r9 = r1.x()
            if (r9 == 0) goto L_0x01f6
            androidx.compose.material.MenuKt$DropdownMenuItemContent$2 r10 = new androidx.compose.material.MenuKt$DropdownMenuItemContent$2
            r0 = r10
            r1 = r25
            r2 = r4
            r4 = r8
            r6 = r30
            r7 = r32
            r8 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r10)
        L_0x01f6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.MenuKt.d(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.interaction.MutableInteractionSource, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0055  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long h(androidx.compose.ui.unit.IntRect r5, androidx.compose.ui.unit.IntRect r6) {
        /*
            int r0 = r6.g()
            int r1 = r5.h()
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            if (r0 < r1) goto L_0x000f
        L_0x000d:
            r0 = r3
            goto L_0x0049
        L_0x000f:
            int r0 = r6.h()
            int r1 = r5.g()
            if (r0 > r1) goto L_0x001b
            r0 = r2
            goto L_0x0049
        L_0x001b:
            int r0 = r6.l()
            if (r0 != 0) goto L_0x0022
            goto L_0x000d
        L_0x0022:
            int r0 = r5.g()
            int r1 = r6.g()
            int r0 = java.lang.Math.max(r0, r1)
            int r1 = r5.h()
            int r4 = r6.h()
            int r1 = java.lang.Math.min(r1, r4)
            int r0 = r0 + r1
            int r0 = r0 / 2
            int r1 = r6.g()
            int r0 = r0 - r1
            float r0 = (float) r0
            int r1 = r6.l()
            float r1 = (float) r1
            float r0 = r0 / r1
        L_0x0049:
            int r1 = r6.j()
            int r4 = r5.d()
            if (r1 < r4) goto L_0x0055
        L_0x0053:
            r2 = r3
            goto L_0x008f
        L_0x0055:
            int r1 = r6.d()
            int r4 = r5.j()
            if (r1 > r4) goto L_0x0060
            goto L_0x008f
        L_0x0060:
            int r1 = r6.f()
            if (r1 != 0) goto L_0x0067
            goto L_0x0053
        L_0x0067:
            int r1 = r5.j()
            int r2 = r6.j()
            int r1 = java.lang.Math.max(r1, r2)
            int r5 = r5.d()
            int r2 = r6.d()
            int r5 = java.lang.Math.min(r5, r2)
            int r1 = r1 + r5
            int r1 = r1 / 2
            int r5 = r6.j()
            int r1 = r1 - r5
            float r5 = (float) r1
            int r6 = r6.f()
            float r6 = (float) r6
            float r2 = r5 / r6
        L_0x008f:
            long r5 = androidx.compose.ui.graphics.TransformOriginKt.a(r0, r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.MenuKt.h(androidx.compose.ui.unit.IntRect, androidx.compose.ui.unit.IntRect):long");
    }

    public static final float i() {
        return f7951d;
    }

    public static final float j() {
        return f7949b;
    }
}
