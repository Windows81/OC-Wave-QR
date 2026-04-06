package androidx.compose.material;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;

@Metadata
final class TextFieldTransitionScope {

    /* renamed from: a  reason: collision with root package name */
    public static final TextFieldTransitionScope f8850a = new TextFieldTransitionScope();

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f8858a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                androidx.compose.material.InputPhase[] r0 = androidx.compose.material.InputPhase.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.material.InputPhase r1 = androidx.compose.material.InputPhase.Focused     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.material.InputPhase r1 = androidx.compose.material.InputPhase.UnfocusedEmpty     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.material.InputPhase r1 = androidx.compose.material.InputPhase.UnfocusedNotEmpty     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f8858a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldTransitionScope.WhenMappings.<clinit>():void");
        }
    }

    public static final float b(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    public static final float c(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    public static final long d(State state) {
        return ((Color) state.getValue()).v();
    }

    public static final long e(State state) {
        return ((Color) state.getValue()).v();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: androidx.compose.animation.core.TwoWayConverter} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0196, code lost:
        if (r8 != false) goto L_0x018c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01d5, code lost:
        if (r8 != false) goto L_0x01da;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01e0  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x022d  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0274  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0281  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x028c  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02a5  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02b2  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02b5  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x02bd  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x039e  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0186  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(androidx.compose.material.InputPhase r26, long r27, long r29, kotlin.jvm.functions.Function3 r31, boolean r32, kotlin.jvm.functions.Function6 r33, androidx.compose.runtime.Composer r34, int r35) {
        /*
            r25 = this;
            r2 = r26
            r7 = r31
            r8 = r32
            r10 = r35
            r0 = 1988729962(0x76899c6a, float:1.3955413E33)
            r1 = r34
            androidx.compose.runtime.Composer r1 = r1.q(r0)
            r3 = r10 & 6
            if (r3 != 0) goto L_0x0020
            boolean r3 = r1.W(r2)
            if (r3 == 0) goto L_0x001d
            r3 = 4
            goto L_0x001e
        L_0x001d:
            r3 = 2
        L_0x001e:
            r3 = r3 | r10
            goto L_0x0021
        L_0x0020:
            r3 = r10
        L_0x0021:
            r5 = r10 & 48
            if (r5 != 0) goto L_0x0034
            r5 = r27
            boolean r9 = r1.j(r5)
            if (r9 == 0) goto L_0x0030
            r9 = 32
            goto L_0x0032
        L_0x0030:
            r9 = 16
        L_0x0032:
            r3 = r3 | r9
            goto L_0x0036
        L_0x0034:
            r5 = r27
        L_0x0036:
            r9 = r10 & 384(0x180, float:5.38E-43)
            r14 = r29
            if (r9 != 0) goto L_0x0048
            boolean r9 = r1.j(r14)
            if (r9 == 0) goto L_0x0045
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0047
        L_0x0045:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0047:
            r3 = r3 | r9
        L_0x0048:
            r9 = r10 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0058
            boolean r9 = r1.l(r7)
            if (r9 == 0) goto L_0x0055
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x0057
        L_0x0055:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x0057:
            r3 = r3 | r9
        L_0x0058:
            r9 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r9 != 0) goto L_0x0068
            boolean r9 = r1.d(r8)
            if (r9 == 0) goto L_0x0065
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0067
        L_0x0065:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x0067:
            r3 = r3 | r9
        L_0x0068:
            r9 = 196608(0x30000, float:2.75506E-40)
            r9 = r9 & r10
            if (r9 != 0) goto L_0x007c
            r9 = r33
            boolean r11 = r1.l(r9)
            if (r11 == 0) goto L_0x0078
            r11 = 131072(0x20000, float:1.83671E-40)
            goto L_0x007a
        L_0x0078:
            r11 = 65536(0x10000, float:9.18355E-41)
        L_0x007a:
            r3 = r3 | r11
            goto L_0x007e
        L_0x007c:
            r9 = r33
        L_0x007e:
            r11 = 74899(0x12493, float:1.04956E-40)
            r11 = r11 & r3
            r12 = 74898(0x12492, float:1.04954E-40)
            r13 = 0
            if (r11 == r12) goto L_0x008a
            r11 = 1
            goto L_0x008b
        L_0x008a:
            r11 = r13
        L_0x008b:
            r12 = r3 & 1
            boolean r11 = r1.E(r11, r12)
            if (r11 == 0) goto L_0x03a2
            boolean r11 = androidx.compose.runtime.ComposerKt.P()
            r12 = -1
            if (r11 == 0) goto L_0x009f
            java.lang.String r11 = "androidx.compose.material.TextFieldTransitionScope.Transition (TextFieldImpl.kt:283)"
            androidx.compose.runtime.ComposerKt.Y(r0, r3, r12, r11)
        L_0x009f:
            r0 = r3 & 14
            r0 = r0 | 48
            java.lang.String r11 = "TextFieldInputState"
            androidx.compose.animation.core.Transition r0 = androidx.compose.animation.core.TransitionKt.j(r2, r11, r1, r0, r13)
            androidx.compose.material.TextFieldTransitionScope$Transition$labelProgress$2 r11 = androidx.compose.material.TextFieldTransitionScope$Transition$labelProgress$2.f8855z
            kotlin.jvm.internal.FloatCompanionObject r19 = kotlin.jvm.internal.FloatCompanionObject.f40896a
            androidx.compose.animation.core.TwoWayConverter r16 = androidx.compose.animation.core.VectorConvertersKt.i(r19)
            java.lang.Object r17 = r0.i()
            androidx.compose.material.InputPhase r17 = (androidx.compose.material.InputPhase) r17
            r4 = -1158004136(0xffffffffbafa4258, float:-0.0019093258)
            r1.X(r4)
            boolean r18 = androidx.compose.runtime.ComposerKt.P()
            java.lang.String r2 = "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:294)"
            if (r18 == 0) goto L_0x00c8
            androidx.compose.runtime.ComposerKt.Y(r4, r13, r12, r2)
        L_0x00c8:
            int[] r21 = androidx.compose.material.TextFieldTransitionScope.WhenMappings.f8858a
            int r17 = r17.ordinal()
            r12 = r21[r17]
            r22 = 0
            r13 = 3
            r23 = 1065353216(0x3f800000, float:1.0)
            r4 = 1
            if (r12 == r4) goto L_0x00dd
            r4 = 2
            if (r12 == r4) goto L_0x00e6
            if (r12 != r13) goto L_0x00e0
        L_0x00dd:
            r4 = r23
            goto L_0x00e8
        L_0x00e0:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00e6:
            r4 = r22
        L_0x00e8:
            boolean r12 = androidx.compose.runtime.ComposerKt.P()
            if (r12 == 0) goto L_0x00f1
            androidx.compose.runtime.ComposerKt.X()
        L_0x00f1:
            r1.M()
            java.lang.Float r12 = java.lang.Float.valueOf(r4)
            java.lang.Object r4 = r0.q()
            androidx.compose.material.InputPhase r4 = (androidx.compose.material.InputPhase) r4
            r13 = -1158004136(0xffffffffbafa4258, float:-0.0019093258)
            r1.X(r13)
            boolean r24 = androidx.compose.runtime.ComposerKt.P()
            if (r24 == 0) goto L_0x0110
            r5 = 0
            r6 = -1
            androidx.compose.runtime.ComposerKt.Y(r13, r5, r6, r2)
            goto L_0x0111
        L_0x0110:
            r6 = -1
        L_0x0111:
            int r2 = r4.ordinal()
            r2 = r21[r2]
            r4 = 1
            if (r2 == r4) goto L_0x012d
            r4 = 2
            if (r2 == r4) goto L_0x0129
            r4 = 3
            if (r2 != r4) goto L_0x0123
        L_0x0120:
            r2 = r23
            goto L_0x012f
        L_0x0123:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0129:
            r4 = 3
            r2 = r22
            goto L_0x012f
        L_0x012d:
            r4 = 3
            goto L_0x0120
        L_0x012f:
            boolean r5 = androidx.compose.runtime.ComposerKt.P()
            if (r5 == 0) goto L_0x0138
            androidx.compose.runtime.ComposerKt.X()
        L_0x0138:
            r1.M()
            java.lang.Float r13 = java.lang.Float.valueOf(r2)
            androidx.compose.animation.core.Transition$Segment r2 = r0.o()
            r5 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            java.lang.Object r2 = r11.d(r2, r1, r4)
            androidx.compose.animation.core.FiniteAnimationSpec r2 = (androidx.compose.animation.core.FiniteAnimationSpec) r2
            java.lang.String r4 = "LabelProgress"
            r24 = 196608(0x30000, float:2.75506E-40)
            r11 = r0
            r14 = r2
            r15 = r16
            r16 = r4
            r17 = r1
            r18 = r24
            androidx.compose.runtime.State r2 = androidx.compose.animation.core.TransitionKt.f(r11, r12, r13, r14, r15, r16, r17, r18)
            androidx.compose.material.TextFieldTransitionScope$Transition$placeholderOpacity$2 r4 = androidx.compose.material.TextFieldTransitionScope$Transition$placeholderOpacity$2.f8857z
            androidx.compose.animation.core.TwoWayConverter r15 = androidx.compose.animation.core.VectorConvertersKt.i(r19)
            java.lang.Object r11 = r0.i()
            androidx.compose.material.InputPhase r11 = (androidx.compose.material.InputPhase) r11
            r12 = -1376159017(0xffffffffadf97ad7, float:-2.8362574E-11)
            r1.X(r12)
            boolean r13 = androidx.compose.runtime.ComposerKt.P()
            java.lang.String r14 = "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:324)"
            if (r13 == 0) goto L_0x017d
            androidx.compose.runtime.ComposerKt.Y(r12, r5, r6, r14)
        L_0x017d:
            int r11 = r11.ordinal()
            r11 = r21[r11]
            r13 = 1
            if (r11 == r13) goto L_0x019c
            r13 = 2
            if (r11 == r13) goto L_0x0195
            r13 = 3
            if (r11 != r13) goto L_0x018f
        L_0x018c:
            r11 = r22
            goto L_0x019e
        L_0x018f:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0195:
            r13 = 3
            if (r8 == 0) goto L_0x0199
            goto L_0x018c
        L_0x0199:
            r11 = r23
            goto L_0x019e
        L_0x019c:
            r13 = 3
            goto L_0x0199
        L_0x019e:
            boolean r16 = androidx.compose.runtime.ComposerKt.P()
            if (r16 == 0) goto L_0x01a7
            androidx.compose.runtime.ComposerKt.X()
        L_0x01a7:
            r1.M()
            java.lang.Float r16 = java.lang.Float.valueOf(r11)
            java.lang.Object r11 = r0.q()
            androidx.compose.material.InputPhase r11 = (androidx.compose.material.InputPhase) r11
            r1.X(r12)
            boolean r17 = androidx.compose.runtime.ComposerKt.P()
            if (r17 == 0) goto L_0x01c0
            androidx.compose.runtime.ComposerKt.Y(r12, r5, r6, r14)
        L_0x01c0:
            int r11 = r11.ordinal()
            r11 = r21[r11]
            r12 = 1
            if (r11 == r12) goto L_0x01d8
            r12 = 2
            if (r11 == r12) goto L_0x01d5
            if (r11 != r13) goto L_0x01cf
            goto L_0x01da
        L_0x01cf:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01d5:
            if (r8 == 0) goto L_0x01d8
            goto L_0x01da
        L_0x01d8:
            r22 = r23
        L_0x01da:
            boolean r11 = androidx.compose.runtime.ComposerKt.P()
            if (r11 == 0) goto L_0x01e3
            androidx.compose.runtime.ComposerKt.X()
        L_0x01e3:
            r1.M()
            java.lang.Float r14 = java.lang.Float.valueOf(r22)
            androidx.compose.animation.core.Transition$Segment r11 = r0.o()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
            java.lang.Object r4 = r4.d(r11, r1, r12)
            androidx.compose.animation.core.FiniteAnimationSpec r4 = (androidx.compose.animation.core.FiniteAnimationSpec) r4
            java.lang.String r17 = "PlaceholderOpacity"
            r11 = r0
            r12 = r16
            r19 = r13
            r13 = r14
            r14 = r4
            r16 = r17
            r17 = r1
            r18 = r24
            androidx.compose.runtime.State r4 = androidx.compose.animation.core.TransitionKt.f(r11, r12, r13, r14, r15, r16, r17, r18)
            androidx.compose.material.TextFieldTransitionScope$Transition$labelTextStyleColor$2 r11 = androidx.compose.material.TextFieldTransitionScope$Transition$labelTextStyleColor$2.f8856z
            java.lang.Object r12 = r0.q()
            androidx.compose.material.InputPhase r12 = (androidx.compose.material.InputPhase) r12
            r13 = -1490209928(0xffffffffa72d3378, float:-2.4036474E-15)
            r1.X(r13)
            boolean r14 = androidx.compose.runtime.ComposerKt.P()
            java.lang.String r15 = "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:336)"
            if (r14 == 0) goto L_0x0224
            androidx.compose.runtime.ComposerKt.Y(r13, r5, r6, r15)
        L_0x0224:
            int r12 = r12.ordinal()
            r12 = r21[r12]
            r14 = 1
            if (r12 != r14) goto L_0x0230
            r16 = r27
            goto L_0x0232
        L_0x0230:
            r16 = r29
        L_0x0232:
            boolean r12 = androidx.compose.runtime.ComposerKt.P()
            if (r12 == 0) goto L_0x023b
            androidx.compose.runtime.ComposerKt.X()
        L_0x023b:
            r1.M()
            androidx.compose.ui.graphics.colorspace.ColorSpace r12 = androidx.compose.ui.graphics.Color.q(r16)
            boolean r14 = r1.W(r12)
            java.lang.Object r5 = r1.g()
            if (r14 != 0) goto L_0x0254
            androidx.compose.runtime.Composer$Companion r14 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r14 = r14.a()
            if (r5 != r14) goto L_0x0263
        L_0x0254:
            androidx.compose.ui.graphics.Color$Companion r5 = androidx.compose.ui.graphics.Color.f15975b
            kotlin.jvm.functions.Function1 r5 = androidx.compose.animation.ColorVectorConverterKt.a(r5)
            java.lang.Object r5 = r5.invoke(r12)
            androidx.compose.animation.core.TwoWayConverter r5 = (androidx.compose.animation.core.TwoWayConverter) r5
            r1.N(r5)
        L_0x0263:
            androidx.compose.animation.core.TwoWayConverter r5 = (androidx.compose.animation.core.TwoWayConverter) r5
            java.lang.Object r12 = r0.i()
            androidx.compose.material.InputPhase r12 = (androidx.compose.material.InputPhase) r12
            r1.X(r13)
            boolean r14 = androidx.compose.runtime.ComposerKt.P()
            if (r14 == 0) goto L_0x0278
            r14 = 0
            androidx.compose.runtime.ComposerKt.Y(r13, r14, r6, r15)
        L_0x0278:
            int r12 = r12.ordinal()
            r12 = r21[r12]
            r14 = 1
            if (r12 != r14) goto L_0x0284
            r16 = r27
            goto L_0x0286
        L_0x0284:
            r16 = r29
        L_0x0286:
            boolean r12 = androidx.compose.runtime.ComposerKt.P()
            if (r12 == 0) goto L_0x028f
            androidx.compose.runtime.ComposerKt.X()
        L_0x028f:
            r1.M()
            androidx.compose.ui.graphics.Color r12 = androidx.compose.ui.graphics.Color.h(r16)
            java.lang.Object r14 = r0.q()
            androidx.compose.material.InputPhase r14 = (androidx.compose.material.InputPhase) r14
            r1.X(r13)
            boolean r16 = androidx.compose.runtime.ComposerKt.P()
            if (r16 == 0) goto L_0x02a9
            r8 = 0
            androidx.compose.runtime.ComposerKt.Y(r13, r8, r6, r15)
        L_0x02a9:
            int r6 = r14.ordinal()
            r6 = r21[r6]
            r8 = 1
            if (r6 != r8) goto L_0x02b5
            r14 = r27
            goto L_0x02b7
        L_0x02b5:
            r14 = r29
        L_0x02b7:
            boolean r6 = androidx.compose.runtime.ComposerKt.P()
            if (r6 == 0) goto L_0x02c0
            androidx.compose.runtime.ComposerKt.X()
        L_0x02c0:
            r1.M()
            androidx.compose.ui.graphics.Color r13 = androidx.compose.ui.graphics.Color.h(r14)
            androidx.compose.animation.core.Transition$Segment r6 = r0.o()
            r8 = 0
            java.lang.Integer r14 = java.lang.Integer.valueOf(r8)
            java.lang.Object r6 = r11.d(r6, r1, r14)
            r14 = r6
            androidx.compose.animation.core.FiniteAnimationSpec r14 = (androidx.compose.animation.core.FiniteAnimationSpec) r14
            java.lang.String r16 = "LabelTextStyleColor"
            r11 = r0
            r15 = r5
            r17 = r1
            r18 = r24
            androidx.compose.runtime.State r5 = androidx.compose.animation.core.TransitionKt.f(r11, r12, r13, r14, r15, r16, r17, r18)
            androidx.compose.material.TextFieldTransitionScope$Transition$labelContentColor$2 r6 = androidx.compose.material.TextFieldTransitionScope$Transition$labelContentColor$2.f8854z
            r8 = r3 & 7168(0x1c00, float:1.0045E-41)
            r8 = r8 | 384(0x180, float:5.38E-43)
            java.lang.Object r11 = r0.q()
            int r12 = r8 >> 6
            r12 = r12 & 112(0x70, float:1.57E-43)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Object r11 = r7.d(r11, r1, r12)
            androidx.compose.ui.graphics.Color r11 = (androidx.compose.ui.graphics.Color) r11
            long r11 = r11.v()
            androidx.compose.ui.graphics.colorspace.ColorSpace r11 = androidx.compose.ui.graphics.Color.q(r11)
            boolean r12 = r1.W(r11)
            java.lang.Object r13 = r1.g()
            if (r12 != 0) goto L_0x0315
            androidx.compose.runtime.Composer$Companion r12 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r12 = r12.a()
            if (r13 != r12) goto L_0x0325
        L_0x0315:
            androidx.compose.ui.graphics.Color$Companion r12 = androidx.compose.ui.graphics.Color.f15975b
            kotlin.jvm.functions.Function1 r12 = androidx.compose.animation.ColorVectorConverterKt.a(r12)
            java.lang.Object r11 = r12.invoke(r11)
            r13 = r11
            androidx.compose.animation.core.TwoWayConverter r13 = (androidx.compose.animation.core.TwoWayConverter) r13
            r1.N(r13)
        L_0x0325:
            r15 = r13
            androidx.compose.animation.core.TwoWayConverter r15 = (androidx.compose.animation.core.TwoWayConverter) r15
            int r8 = r8 << 3
            r20 = 57344(0xe000, float:8.0356E-41)
            r8 = r8 & r20
            r11 = 3072(0xc00, float:4.305E-42)
            r8 = r8 | r11
            java.lang.Object r11 = r0.i()
            int r8 = r8 >> 9
            r8 = r8 & 112(0x70, float:1.57E-43)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r8)
            java.lang.Object r12 = r7.d(r11, r1, r12)
            java.lang.Object r11 = r0.q()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Object r13 = r7.d(r11, r1, r8)
            androidx.compose.animation.core.Transition$Segment r8 = r0.o()
            r11 = 0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Object r6 = r6.d(r8, r1, r11)
            r14 = r6
            androidx.compose.animation.core.FiniteAnimationSpec r14 = (androidx.compose.animation.core.FiniteAnimationSpec) r14
            r18 = 196608(0x30000, float:2.75506E-40)
            java.lang.String r16 = "LabelContentColor"
            r11 = r0
            r17 = r1
            androidx.compose.runtime.State r0 = androidx.compose.animation.core.TransitionKt.f(r11, r12, r13, r14, r15, r16, r17, r18)
            float r2 = b(r2)
            java.lang.Float r12 = java.lang.Float.valueOf(r2)
            long r5 = d(r5)
            androidx.compose.ui.graphics.Color r13 = androidx.compose.ui.graphics.Color.h(r5)
            long r5 = e(r0)
            androidx.compose.ui.graphics.Color r14 = androidx.compose.ui.graphics.Color.h(r5)
            float r0 = c(r4)
            java.lang.Float r15 = java.lang.Float.valueOf(r0)
            int r0 = r3 >> 3
            r0 = r0 & r20
            java.lang.Integer r17 = java.lang.Integer.valueOf(r0)
            r11 = r33
            r16 = r1
            r11.l(r12, r13, r14, r15, r16, r17)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x03a5
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x03a5
        L_0x03a2:
            r1.B()
        L_0x03a5:
            androidx.compose.runtime.ScopeUpdateScope r11 = r1.x()
            if (r11 == 0) goto L_0x03c4
            androidx.compose.material.TextFieldTransitionScope$Transition$1 r12 = new androidx.compose.material.TextFieldTransitionScope$Transition$1
            r0 = r12
            r1 = r25
            r2 = r26
            r3 = r27
            r5 = r29
            r7 = r31
            r8 = r32
            r9 = r33
            r10 = r35
            r0.<init>(r1, r2, r3, r5, r7, r8, r9, r10)
            r11.a(r12)
        L_0x03c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldTransitionScope.a(androidx.compose.material.InputPhase, long, long, kotlin.jvm.functions.Function3, boolean, kotlin.jvm.functions.Function6, androidx.compose.runtime.Composer, int):void");
    }
}
