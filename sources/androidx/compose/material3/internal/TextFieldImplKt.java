package androidx.compose.material3.internal;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.ContentColorKt;
import androidx.compose.material3.InteractiveComponentSizeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.MotionSchemeKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldLabelPosition;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.material3.tokens.SmallIconButtonTokens;
import androidx.compose.material3.tokens.TypeScaleTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.ranges.RangesKt;

@Metadata
public final class TextFieldImplKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f12326a;

    /* renamed from: b  reason: collision with root package name */
    public static final float f12327b;

    /* renamed from: c  reason: collision with root package name */
    public static final float f12328c;

    /* renamed from: d  reason: collision with root package name */
    public static final float f12329d;

    /* renamed from: e  reason: collision with root package name */
    public static final float f12330e = Dp.m((float) 2);

    /* renamed from: f  reason: collision with root package name */
    public static final float f12331f = Dp.m((float) 24);

    /* renamed from: g  reason: collision with root package name */
    public static final float f12332g;

    /* renamed from: h  reason: collision with root package name */
    public static final float f12333h;

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f12366a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f12367b;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|17) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0032 */
        static {
            /*
                androidx.compose.material3.internal.TextFieldType[] r0 = androidx.compose.material3.internal.TextFieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                androidx.compose.material3.internal.TextFieldType r2 = androidx.compose.material3.internal.TextFieldType.Filled     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                androidx.compose.material3.internal.TextFieldType r3 = androidx.compose.material3.internal.TextFieldType.Outlined     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f12366a = r0
                androidx.compose.material3.internal.InputPhase[] r0 = androidx.compose.material3.internal.InputPhase.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.material3.internal.InputPhase r3 = androidx.compose.material3.internal.InputPhase.Focused     // Catch:{ NoSuchFieldError -> 0x002a }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                androidx.compose.material3.internal.InputPhase r1 = androidx.compose.material3.internal.InputPhase.UnfocusedEmpty     // Catch:{ NoSuchFieldError -> 0x0032 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0032 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                androidx.compose.material3.internal.InputPhase r1 = androidx.compose.material3.internal.InputPhase.UnfocusedNotEmpty     // Catch:{ NoSuchFieldError -> 0x003b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003b }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003b }
            L_0x003b:
                f12367b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.TextFieldImplKt.WhenMappings.<clinit>():void");
        }
    }

    static {
        float f2 = (float) 16;
        f12326a = Dp.m(f2);
        float f3 = (float) 4;
        f12327b = Dp.m(f3);
        f12328c = Dp.m(f3);
        f12329d = Dp.m(f3);
        f12332g = Dp.m(f2);
        f12333h = Dp.m(f2);
    }

    public static final Unit A(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.o(semanticsPropertyReceiver, str);
        return Unit.f40552a;
    }

    public static final float B() {
        return f12328c;
    }

    public static final float C() {
        return f12327b;
    }

    public static final Alignment.Horizontal D(TextFieldLabelPosition textFieldLabelPosition) {
        if (textFieldLabelPosition instanceof TextFieldLabelPosition.Above) {
            return ((TextFieldLabelPosition.Above) textFieldLabelPosition).a();
        }
        if (textFieldLabelPosition instanceof TextFieldLabelPosition.Attached) {
            return ((TextFieldLabelPosition.Attached) textFieldLabelPosition).b();
        }
        throw new IllegalArgumentException("Unknown position: " + textFieldLabelPosition);
    }

    public static final float E() {
        return f12332g;
    }

    public static final float F() {
        return f12333h;
    }

    public static final float G() {
        return f12331f;
    }

    public static final Alignment.Horizontal H(TextFieldLabelPosition textFieldLabelPosition) {
        if (textFieldLabelPosition instanceof TextFieldLabelPosition.Above) {
            return ((TextFieldLabelPosition.Above) textFieldLabelPosition).a();
        }
        if (textFieldLabelPosition instanceof TextFieldLabelPosition.Attached) {
            return ((TextFieldLabelPosition.Attached) textFieldLabelPosition).c();
        }
        throw new IllegalArgumentException("Unknown position: " + textFieldLabelPosition);
    }

    public static final float I() {
        return f12330e;
    }

    public static final boolean J(TextFieldLabelPosition textFieldLabelPosition) {
        return (textFieldLabelPosition instanceof TextFieldLabelPosition.Attached) && !((TextFieldLabelPosition.Attached) textFieldLabelPosition).a();
    }

    public static final float K() {
        return f12329d;
    }

    public static final float L() {
        return f12326a;
    }

    public static final float M(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(1251545215, i2, -1, "androidx.compose.material3.internal.minimizedLabelHalfHeight (TextFieldImpl.kt:527)");
        }
        long s2 = MaterialTheme.f10273a.e(composer, 6).e().s();
        long A2 = TypeScaleTokens.f14320a.A();
        if (!TextUnit.k(s2)) {
            s2 = A2;
        }
        float m2 = Dp.m(((Density) composer.C(CompositionLocalsKt.g())).v(s2) / ((float) 2));
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return m2;
    }

    public static final Modifier N(Modifier modifier, ColorProducer colorProducer, Shape shape) {
        return DrawModifierKt.c(modifier, new V(shape, colorProducer));
    }

    public static final DrawResult O(Shape shape, ColorProducer colorProducer, CacheDrawScope cacheDrawScope) {
        return cacheDrawScope.q(new c0(shape.a(cacheDrawScope.c(), cacheDrawScope.getLayoutDirection(), cacheDrawScope), colorProducer));
    }

    public static final Unit P(Outline outline, ColorProducer colorProducer, DrawScope drawScope) {
        OutlineKt.e(drawScope, outline, colorProducer.a(), 0.0f, (DrawStyle) null, (ColorFilter) null, 0, 60, (Object) null);
        return Unit.f40552a;
    }

    public static final float Q(Composer composer, int i2) {
        if (ComposerKt.P()) {
            ComposerKt.Y(1986450462, i2, -1, "androidx.compose.material3.internal.textFieldHorizontalIconPadding (TextFieldImpl.kt:520)");
        }
        float t2 = ((Dp) composer.C(InteractiveComponentSizeKt.e())).t();
        if (Float.isNaN(t2)) {
            t2 = Dp.m((float) 0);
        }
        float m2 = Dp.m(RangesKt.d(Dp.m(Dp.m(t2 - SmallIconButtonTokens.f14035a.d()) / ((float) 2)), Dp.m((float) 0)));
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return m2;
    }

    public static final Modifier R(Modifier modifier, Function0 function0) {
        return LayoutModifierKt.a(modifier, new d0(function0));
    }

    public static final MeasureResult S(Function0 function0, MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        float t2 = ((Dp) function0.invoke()).t();
        Placeable c0 = measurable.c0(Constraints.d(constraints.r(), 0, 0, ConstraintsKt.f(constraints.r(), !Dp.o(t2, Dp.f19144A.c()) ? measureScope.P1(t2) : 0), 0, 11, (Object) null));
        return MeasureScope.R1(measureScope, c0.L0(), c0.C0(), (Map) null, new U(c0), 4, (Object) null);
    }

    public static final Unit T(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.j(placementScope, placeable, 0, 0, 0.0f, 4, (Object) null);
        return Unit.f40552a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v3, resolved type: androidx.compose.animation.core.TwoWayConverter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v5, resolved type: androidx.compose.animation.core.TwoWayConverter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v42, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0370, code lost:
        if (r4 != false) goto L_0x0368;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x03b2, code lost:
        if (r4 != false) goto L_0x03aa;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x02b5  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x02d1  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x02e0  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x02f8  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0349  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0355  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0362  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x037b  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0394  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x03a4  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x03bd  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0401  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x0411  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x0429  */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x0442  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x0452  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x0466  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x046f  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x04b6  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x04c4  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x04c7  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x04cf  */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x050c  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x051a  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x051d  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x0525  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x053e  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x054c  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x0554  */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x0596  */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x05a1  */
    /* JADX WARNING: Removed duplicated region for block: B:319:0x05de  */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x05e9  */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x0602  */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x0608  */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x060f  */
    /* JADX WARNING: Removed duplicated region for block: B:332:0x0643  */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x0653  */
    /* JADX WARNING: Removed duplicated region for block: B:337:0x0676  */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x06c2  */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x06e2  */
    /* JADX WARNING: Removed duplicated region for block: B:348:0x0700  */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x0718  */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x072b  */
    /* JADX WARNING: Removed duplicated region for block: B:357:0x0738  */
    /* JADX WARNING: Removed duplicated region for block: B:358:0x0759  */
    /* JADX WARNING: Removed duplicated region for block: B:363:0x0771  */
    /* JADX WARNING: Removed duplicated region for block: B:364:0x078f  */
    /* JADX WARNING: Removed duplicated region for block: B:367:0x07a1  */
    /* JADX WARNING: Removed duplicated region for block: B:368:0x07ac  */
    /* JADX WARNING: Removed duplicated region for block: B:371:0x07cc  */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x07d8  */
    /* JADX WARNING: Removed duplicated region for block: B:375:0x07f8  */
    /* JADX WARNING: Removed duplicated region for block: B:376:0x0805  */
    /* JADX WARNING: Removed duplicated region for block: B:379:0x0829  */
    /* JADX WARNING: Removed duplicated region for block: B:396:0x08ec  */
    /* JADX WARNING: Removed duplicated region for block: B:399:0x094c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void l(androidx.compose.material3.internal.TextFieldType r46, java.lang.CharSequence r47, kotlin.jvm.functions.Function2 r48, androidx.compose.material3.TextFieldLabelPosition r49, kotlin.jvm.functions.Function3 r50, kotlin.jvm.functions.Function2 r51, kotlin.jvm.functions.Function2 r52, kotlin.jvm.functions.Function2 r53, kotlin.jvm.functions.Function2 r54, kotlin.jvm.functions.Function2 r55, kotlin.jvm.functions.Function2 r56, boolean r57, boolean r58, boolean r59, androidx.compose.foundation.interaction.InteractionSource r60, androidx.compose.foundation.layout.PaddingValues r61, androidx.compose.material3.TextFieldColors r62, kotlin.jvm.functions.Function2 r63, androidx.compose.runtime.Composer r64, int r65, int r66) {
        /*
            r15 = r49
            r14 = r50
            r13 = r51
            r12 = r52
            r10 = r53
            r9 = r54
            r11 = r55
            r8 = r56
            r7 = r58
            r6 = r59
            r5 = r60
            r4 = r61
            r3 = r62
            r2 = r63
            r1 = r65
            r0 = r66
            r16 = 4194304(0x400000, float:5.877472E-39)
            r17 = 8388608(0x800000, float:1.17549435E-38)
            r18 = 12582912(0xc00000, float:1.7632415E-38)
            r19 = 524288(0x80000, float:7.34684E-40)
            r20 = 1048576(0x100000, float:1.469368E-39)
            r21 = 1572864(0x180000, float:2.204052E-39)
            r22 = 65536(0x10000, float:9.18355E-41)
            r23 = 131072(0x20000, float:1.83671E-40)
            r24 = 196608(0x30000, float:2.75506E-40)
            r25 = 8192(0x2000, float:1.14794E-41)
            r26 = 16384(0x4000, float:2.2959E-41)
            r27 = 1024(0x400, float:1.435E-42)
            r28 = 128(0x80, float:1.794E-43)
            r29 = 256(0x100, float:3.59E-43)
            r30 = 16
            r31 = 32
            r2 = 546805032(0x20979528, float:2.5679098E-19)
            r3 = r64
            androidx.compose.runtime.Composer r3 = r3.q(r2)
            r2 = 6
            r34 = r1 & 6
            r35 = 4
            if (r34 != 0) goto L_0x0062
            int r2 = r46.ordinal()
            boolean r2 = r3.i(r2)
            if (r2 == 0) goto L_0x005d
            r2 = r35
            goto L_0x005e
        L_0x005d:
            r2 = 2
        L_0x005e:
            r2 = r2 | r1
        L_0x005f:
            r32 = 48
            goto L_0x0064
        L_0x0062:
            r2 = r1
            goto L_0x005f
        L_0x0064:
            r34 = r1 & 48
            r4 = r47
            if (r34 != 0) goto L_0x0077
            boolean r34 = r3.l(r4)
            if (r34 == 0) goto L_0x0073
            r34 = r31
            goto L_0x0075
        L_0x0073:
            r34 = r30
        L_0x0075:
            r2 = r2 | r34
        L_0x0077:
            r4 = r1 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x008b
            r4 = r48
            boolean r34 = r3.l(r4)
            if (r34 == 0) goto L_0x0086
            r34 = r29
            goto L_0x0088
        L_0x0086:
            r34 = r28
        L_0x0088:
            r2 = r2 | r34
            goto L_0x008d
        L_0x008b:
            r4 = r48
        L_0x008d:
            r4 = r1 & 3072(0xc00, float:4.305E-42)
            if (r4 != 0) goto L_0x009d
            boolean r4 = r3.W(r15)
            if (r4 == 0) goto L_0x009a
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x009c
        L_0x009a:
            r4 = r27
        L_0x009c:
            r2 = r2 | r4
        L_0x009d:
            r4 = r1 & 24576(0x6000, float:3.4438E-41)
            if (r4 != 0) goto L_0x00ad
            boolean r4 = r3.l(r14)
            if (r4 == 0) goto L_0x00aa
            r4 = r26
            goto L_0x00ac
        L_0x00aa:
            r4 = r25
        L_0x00ac:
            r2 = r2 | r4
        L_0x00ad:
            r4 = r1 & r24
            if (r4 != 0) goto L_0x00bd
            boolean r4 = r3.l(r13)
            if (r4 == 0) goto L_0x00ba
            r4 = r23
            goto L_0x00bc
        L_0x00ba:
            r4 = r22
        L_0x00bc:
            r2 = r2 | r4
        L_0x00bd:
            r4 = r1 & r21
            if (r4 != 0) goto L_0x00cd
            boolean r4 = r3.l(r12)
            if (r4 == 0) goto L_0x00ca
            r4 = r20
            goto L_0x00cc
        L_0x00ca:
            r4 = r19
        L_0x00cc:
            r2 = r2 | r4
        L_0x00cd:
            r4 = r1 & r18
            if (r4 != 0) goto L_0x00dd
            boolean r4 = r3.l(r10)
            if (r4 == 0) goto L_0x00da
            r4 = r17
            goto L_0x00dc
        L_0x00da:
            r4 = r16
        L_0x00dc:
            r2 = r2 | r4
        L_0x00dd:
            r4 = 100663296(0x6000000, float:2.4074124E-35)
            r4 = r4 & r1
            if (r4 != 0) goto L_0x00ee
            boolean r4 = r3.l(r9)
            if (r4 == 0) goto L_0x00eb
            r4 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x00ed
        L_0x00eb:
            r4 = 33554432(0x2000000, float:9.403955E-38)
        L_0x00ed:
            r2 = r2 | r4
        L_0x00ee:
            r4 = 805306368(0x30000000, float:4.656613E-10)
            r4 = r4 & r1
            if (r4 != 0) goto L_0x00ff
            boolean r4 = r3.l(r11)
            if (r4 == 0) goto L_0x00fc
            r4 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x00fe
        L_0x00fc:
            r4 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x00fe:
            r2 = r2 | r4
        L_0x00ff:
            r4 = r2
            r2 = 6
            r34 = r0 & 6
            if (r34 != 0) goto L_0x0113
            boolean r2 = r3.l(r8)
            if (r2 == 0) goto L_0x010c
            goto L_0x010e
        L_0x010c:
            r35 = 2
        L_0x010e:
            r2 = r0 | r35
        L_0x0110:
            r32 = 48
            goto L_0x0115
        L_0x0113:
            r2 = r0
            goto L_0x0110
        L_0x0115:
            r34 = r0 & 48
            r15 = r57
            if (r34 != 0) goto L_0x0125
            boolean r34 = r3.d(r15)
            if (r34 == 0) goto L_0x0123
            r30 = r31
        L_0x0123:
            r2 = r2 | r30
        L_0x0125:
            r5 = r0 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x0133
            boolean r5 = r3.d(r7)
            if (r5 == 0) goto L_0x0131
            r28 = r29
        L_0x0131:
            r2 = r2 | r28
        L_0x0133:
            r5 = r0 & 3072(0xc00, float:4.305E-42)
            if (r5 != 0) goto L_0x0141
            boolean r5 = r3.d(r6)
            if (r5 == 0) goto L_0x013f
            r27 = 2048(0x800, float:2.87E-42)
        L_0x013f:
            r2 = r2 | r27
        L_0x0141:
            r5 = r0 & 24576(0x6000, float:3.4438E-41)
            if (r5 != 0) goto L_0x0154
            r5 = r60
            r15 = 2048(0x800, float:2.87E-42)
            boolean r27 = r3.W(r5)
            if (r27 == 0) goto L_0x0151
            r25 = r26
        L_0x0151:
            r2 = r2 | r25
            goto L_0x0158
        L_0x0154:
            r5 = r60
            r15 = 2048(0x800, float:2.87E-42)
        L_0x0158:
            r24 = r0 & r24
            r15 = r61
            if (r24 != 0) goto L_0x0168
            boolean r24 = r3.W(r15)
            if (r24 == 0) goto L_0x0166
            r22 = r23
        L_0x0166:
            r2 = r2 | r22
        L_0x0168:
            r21 = r0 & r21
            r8 = r62
            if (r21 != 0) goto L_0x0178
            boolean r21 = r3.W(r8)
            if (r21 == 0) goto L_0x0176
            r19 = r20
        L_0x0176:
            r2 = r2 | r19
        L_0x0178:
            r18 = r0 & r18
            r15 = r63
            r10 = 3
            if (r18 != 0) goto L_0x0189
            boolean r18 = r3.l(r15)
            if (r18 == 0) goto L_0x0187
            r16 = r17
        L_0x0187:
            r2 = r2 | r16
        L_0x0189:
            r16 = 306783379(0x12492493, float:6.34695E-28)
            r10 = r4 & r16
            r0 = 306783378(0x12492492, float:6.3469493E-28)
            if (r10 != r0) goto L_0x019f
            r0 = 4793491(0x492493, float:6.717112E-39)
            r0 = r0 & r2
            r10 = 4793490(0x492492, float:6.71711E-39)
            if (r0 == r10) goto L_0x019d
            goto L_0x019f
        L_0x019d:
            r0 = 0
            goto L_0x01a0
        L_0x019f:
            r0 = 1
        L_0x01a0:
            r10 = r4 & 1
            boolean r0 = r3.E(r0, r10)
            if (r0 == 0) goto L_0x0950
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x01b6
            java.lang.String r0 = "androidx.compose.material3.internal.CommonDecorationBox (TextFieldImpl.kt:98)"
            r10 = 546805032(0x20979528, float:2.5679098E-19)
            androidx.compose.runtime.ComposerKt.Y(r10, r4, r2, r0)
        L_0x01b6:
            int r0 = r2 >> 12
            r0 = r0 & 14
            androidx.compose.runtime.State r0 = androidx.compose.foundation.interaction.FocusInteractionKt.a(r5, r3, r0)
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r10 = r0.booleanValue()
            if (r10 == 0) goto L_0x01cd
            androidx.compose.material3.internal.InputPhase r0 = androidx.compose.material3.internal.InputPhase.Focused
            goto L_0x01d8
        L_0x01cd:
            int r0 = r47.length()
            if (r0 != 0) goto L_0x01d6
            androidx.compose.material3.internal.InputPhase r0 = androidx.compose.material3.internal.InputPhase.UnfocusedEmpty
            goto L_0x01d8
        L_0x01d6:
            androidx.compose.material3.internal.InputPhase r0 = androidx.compose.material3.internal.InputPhase.UnfocusedNotEmpty
        L_0x01d8:
            long r17 = r8.p(r7, r6, r10)
            androidx.compose.material3.MaterialTheme r15 = androidx.compose.material3.MaterialTheme.f10273a
            r1 = 6
            androidx.compose.material3.Typography r15 = r15.e(r3, r1)
            androidx.compose.ui.text.TextStyle r20 = r15.a()
            androidx.compose.ui.text.TextStyle r15 = r15.e()
            r21 = r2
            long r1 = r20.h()
            androidx.compose.ui.graphics.Color$Companion r22 = androidx.compose.ui.graphics.Color.f15975b
            r23 = r4
            long r4 = r22.f()
            boolean r1 = androidx.compose.ui.graphics.Color.n(r1, r4)
            if (r1 == 0) goto L_0x020d
            long r1 = r15.h()
            long r4 = r22.f()
            boolean r1 = androidx.compose.ui.graphics.Color.n(r1, r4)
            if (r1 == 0) goto L_0x0229
        L_0x020d:
            long r1 = r20.h()
            long r4 = r22.f()
            boolean r1 = androidx.compose.ui.graphics.Color.n(r1, r4)
            if (r1 != 0) goto L_0x022b
            long r1 = r15.h()
            long r4 = r22.f()
            boolean r1 = androidx.compose.ui.graphics.Color.n(r1, r4)
            if (r1 == 0) goto L_0x022b
        L_0x0229:
            r5 = 1
            goto L_0x022c
        L_0x022b:
            r5 = 0
        L_0x022c:
            long r1 = r15.h()
            if (r5 == 0) goto L_0x023b
            r24 = 16
            int r4 = (r1 > r24 ? 1 : (r1 == r24 ? 0 : -1))
            if (r4 == 0) goto L_0x0239
            goto L_0x023b
        L_0x0239:
            r1 = r17
        L_0x023b:
            long r24 = r20.h()
            if (r5 == 0) goto L_0x024a
            r26 = 16
            int r4 = (r24 > r26 ? 1 : (r24 == r26 ? 0 : -1))
            if (r4 == 0) goto L_0x0248
            goto L_0x024a
        L_0x0248:
            r24 = r17
        L_0x024a:
            if (r14 == 0) goto L_0x0256
            boolean r4 = J(r49)
            if (r4 == 0) goto L_0x0256
            r26 = r1
            r4 = 1
            goto L_0x0259
        L_0x0256:
            r26 = r1
            r4 = 0
        L_0x0259:
            java.lang.String r1 = "TextFieldInputState"
            r2 = 0
            r6 = 48
            androidx.compose.animation.core.Transition r0 = androidx.compose.animation.core.TransitionKt.j(r0, r1, r3, r6, r2)
            androidx.compose.material3.tokens.MotionSchemeKeyTokens r1 = androidx.compose.material3.tokens.MotionSchemeKeyTokens.FastSpatial
            r2 = 6
            androidx.compose.animation.core.FiniteAnimationSpec r1 = androidx.compose.material3.MotionSchemeKt.b(r1, r3, r2)
            androidx.compose.material3.internal.TextFieldImplKt$TextFieldTransitionScope$labelProgress$1 r2 = new androidx.compose.material3.internal.TextFieldImplKt$TextFieldTransitionScope$labelProgress$1
            r2.<init>(r1)
            kotlin.jvm.internal.FloatCompanionObject r1 = kotlin.jvm.internal.FloatCompanionObject.f40896a
            androidx.compose.animation.core.TwoWayConverter r37 = androidx.compose.animation.core.VectorConvertersKt.i(r1)
            java.lang.Object r28 = r0.i()
            androidx.compose.material3.internal.InputPhase r28 = (androidx.compose.material3.internal.InputPhase) r28
            r6 = -1436405362(0xffffffffaa62318e, float:-2.0090025E-13)
            r3.X(r6)
            boolean r29 = androidx.compose.runtime.ComposerKt.P()
            r6 = -1
            if (r29 == 0) goto L_0x0290
            java.lang.String r7 = "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:391)"
            r8 = 0
            r12 = -1436405362(0xffffffffaa62318e, float:-2.0090025E-13)
            androidx.compose.runtime.ComposerKt.Y(r12, r8, r6, r7)
        L_0x0290:
            int[] r7 = androidx.compose.material3.internal.TextFieldImplKt.WhenMappings.f12367b
            int r8 = r28.ordinal()
            r8 = r7[r8]
            r28 = 1065353216(0x3f800000, float:1.0)
            r12 = 1
            if (r8 == r12) goto L_0x02a3
            r12 = 2
            if (r8 == r12) goto L_0x02ac
            r12 = 3
            if (r8 != r12) goto L_0x02a6
        L_0x02a3:
            r8 = r28
            goto L_0x02af
        L_0x02a6:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x02ac:
            if (r4 == 0) goto L_0x02a3
            r8 = 0
        L_0x02af:
            boolean r12 = androidx.compose.runtime.ComposerKt.P()
            if (r12 == 0) goto L_0x02b8
            androidx.compose.runtime.ComposerKt.X()
        L_0x02b8:
            r3.M()
            java.lang.Float r34 = java.lang.Float.valueOf(r8)
            java.lang.Object r8 = r0.q()
            androidx.compose.material3.internal.InputPhase r8 = (androidx.compose.material3.internal.InputPhase) r8
            r12 = -1436405362(0xffffffffaa62318e, float:-2.0090025E-13)
            r3.X(r12)
            boolean r31 = androidx.compose.runtime.ComposerKt.P()
            if (r31 == 0) goto L_0x02d7
            java.lang.String r11 = "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:391)"
            r9 = 0
            androidx.compose.runtime.ComposerKt.Y(r12, r9, r6, r11)
        L_0x02d7:
            int r8 = r8.ordinal()
            r8 = r7[r8]
            r9 = 1
            if (r8 == r9) goto L_0x02e6
            r9 = 2
            if (r8 == r9) goto L_0x02ef
            r9 = 3
            if (r8 != r9) goto L_0x02e9
        L_0x02e6:
            r8 = r28
            goto L_0x02f2
        L_0x02e9:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x02ef:
            if (r4 == 0) goto L_0x02e6
            r8 = 0
        L_0x02f2:
            boolean r9 = androidx.compose.runtime.ComposerKt.P()
            if (r9 == 0) goto L_0x02fb
            androidx.compose.runtime.ComposerKt.X()
        L_0x02fb:
            r3.M()
            java.lang.Float r35 = java.lang.Float.valueOf(r8)
            androidx.compose.animation.core.Transition$Segment r8 = r0.o()
            r9 = 0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            java.lang.Object r2 = r2.d(r8, r3, r11)
            r36 = r2
            androidx.compose.animation.core.FiniteAnimationSpec r36 = (androidx.compose.animation.core.FiniteAnimationSpec) r36
            java.lang.String r38 = "LabelProgress"
            r2 = 196608(0x30000, float:2.75506E-40)
            r33 = r0
            r39 = r3
            r40 = r2
            androidx.compose.runtime.State r9 = androidx.compose.animation.core.TransitionKt.f(r33, r34, r35, r36, r37, r38, r39, r40)
            androidx.compose.material3.tokens.MotionSchemeKeyTokens r8 = androidx.compose.material3.tokens.MotionSchemeKeyTokens.FastEffects
            r11 = 6
            androidx.compose.animation.core.FiniteAnimationSpec r12 = androidx.compose.material3.MotionSchemeKt.b(r8, r3, r11)
            androidx.compose.material3.tokens.MotionSchemeKeyTokens r2 = androidx.compose.material3.tokens.MotionSchemeKeyTokens.SlowEffects
            androidx.compose.animation.core.FiniteAnimationSpec r2 = androidx.compose.material3.MotionSchemeKt.b(r2, r3, r11)
            androidx.compose.material3.internal.TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1 r11 = new androidx.compose.material3.internal.TextFieldImplKt$TextFieldTransitionScope$placeholderOpacity$1
            r11.<init>(r12, r2)
            androidx.compose.animation.core.TwoWayConverter r37 = androidx.compose.animation.core.VectorConvertersKt.i(r1)
            java.lang.Object r2 = r0.i()
            androidx.compose.material3.internal.InputPhase r2 = (androidx.compose.material3.internal.InputPhase) r2
            r6 = -1093194547(0xffffffffbed72ccd, float:-0.42026368)
            r3.X(r6)
            boolean r33 = androidx.compose.runtime.ComposerKt.P()
            if (r33 == 0) goto L_0x0355
            java.lang.String r13 = "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:416)"
            r42 = r5
            r41 = r10
            r5 = -1
            r10 = 0
            androidx.compose.runtime.ComposerKt.Y(r6, r10, r5, r13)
            goto L_0x0359
        L_0x0355:
            r42 = r5
            r41 = r10
        L_0x0359:
            int r2 = r2.ordinal()
            r2 = r7[r2]
            r5 = 1
            if (r2 == r5) goto L_0x0373
            r5 = 2
            if (r2 == r5) goto L_0x0370
            r5 = 3
            if (r2 != r5) goto L_0x036a
        L_0x0368:
            r2 = 0
            goto L_0x0375
        L_0x036a:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0370:
            if (r4 == 0) goto L_0x0373
            goto L_0x0368
        L_0x0373:
            r2 = r28
        L_0x0375:
            boolean r5 = androidx.compose.runtime.ComposerKt.P()
            if (r5 == 0) goto L_0x037e
            androidx.compose.runtime.ComposerKt.X()
        L_0x037e:
            r3.M()
            java.lang.Float r34 = java.lang.Float.valueOf(r2)
            java.lang.Object r2 = r0.q()
            androidx.compose.material3.internal.InputPhase r2 = (androidx.compose.material3.internal.InputPhase) r2
            r3.X(r6)
            boolean r5 = androidx.compose.runtime.ComposerKt.P()
            if (r5 == 0) goto L_0x039b
            java.lang.String r5 = "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:416)"
            r10 = 0
            r13 = -1
            androidx.compose.runtime.ComposerKt.Y(r6, r10, r13, r5)
        L_0x039b:
            int r2 = r2.ordinal()
            r2 = r7[r2]
            r5 = 1
            if (r2 == r5) goto L_0x03b5
            r5 = 2
            if (r2 == r5) goto L_0x03b2
            r5 = 3
            if (r2 != r5) goto L_0x03ac
        L_0x03aa:
            r2 = 0
            goto L_0x03b7
        L_0x03ac:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x03b2:
            if (r4 == 0) goto L_0x03b5
            goto L_0x03aa
        L_0x03b5:
            r2 = r28
        L_0x03b7:
            boolean r5 = androidx.compose.runtime.ComposerKt.P()
            if (r5 == 0) goto L_0x03c0
            androidx.compose.runtime.ComposerKt.X()
        L_0x03c0:
            r3.M()
            java.lang.Float r35 = java.lang.Float.valueOf(r2)
            androidx.compose.animation.core.Transition$Segment r2 = r0.o()
            r5 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            java.lang.Object r2 = r11.d(r2, r3, r6)
            r36 = r2
            androidx.compose.animation.core.FiniteAnimationSpec r36 = (androidx.compose.animation.core.FiniteAnimationSpec) r36
            java.lang.String r38 = "PlaceholderOpacity"
            r33 = r0
            r39 = r3
            r2 = 196608(0x30000, float:2.75506E-40)
            r40 = r2
            androidx.compose.runtime.State r10 = androidx.compose.animation.core.TransitionKt.f(r33, r34, r35, r36, r37, r38, r39, r40)
            androidx.compose.material3.internal.TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1 r2 = new androidx.compose.material3.internal.TextFieldImplKt$TextFieldTransitionScope$prefixSuffixOpacity$1
            r2.<init>(r12)
            androidx.compose.animation.core.TwoWayConverter r37 = androidx.compose.animation.core.VectorConvertersKt.i(r1)
            java.lang.Object r1 = r0.i()
            androidx.compose.material3.internal.InputPhase r1 = (androidx.compose.material3.internal.InputPhase) r1
            r5 = -1258455321(0xffffffffb4fd7ee7, float:-4.7217256E-7)
            r3.X(r5)
            boolean r6 = androidx.compose.runtime.ComposerKt.P()
            if (r6 == 0) goto L_0x0408
            java.lang.String r6 = "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:428)"
            r11 = 0
            r12 = -1
            androidx.compose.runtime.ComposerKt.Y(r5, r11, r12, r6)
        L_0x0408:
            int r1 = r1.ordinal()
            r1 = r7[r1]
            r6 = 1
            if (r1 == r6) goto L_0x0417
            r6 = 2
            if (r1 == r6) goto L_0x0420
            r6 = 3
            if (r1 != r6) goto L_0x041a
        L_0x0417:
            r1 = r28
            goto L_0x0423
        L_0x041a:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0420:
            if (r4 == 0) goto L_0x0417
            r1 = 0
        L_0x0423:
            boolean r6 = androidx.compose.runtime.ComposerKt.P()
            if (r6 == 0) goto L_0x042c
            androidx.compose.runtime.ComposerKt.X()
        L_0x042c:
            r3.M()
            java.lang.Float r34 = java.lang.Float.valueOf(r1)
            java.lang.Object r1 = r0.q()
            androidx.compose.material3.internal.InputPhase r1 = (androidx.compose.material3.internal.InputPhase) r1
            r3.X(r5)
            boolean r6 = androidx.compose.runtime.ComposerKt.P()
            if (r6 == 0) goto L_0x0449
            java.lang.String r6 = "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:428)"
            r11 = 0
            r12 = -1
            androidx.compose.runtime.ComposerKt.Y(r5, r11, r12, r6)
        L_0x0449:
            int r1 = r1.ordinal()
            r1 = r7[r1]
            r5 = 1
            if (r1 == r5) goto L_0x0466
            r5 = 2
            if (r1 == r5) goto L_0x0461
            r11 = 3
            if (r1 != r11) goto L_0x045b
        L_0x0458:
            r12 = r28
            goto L_0x0469
        L_0x045b:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0461:
            r11 = 3
            if (r4 == 0) goto L_0x0458
            r12 = 0
            goto L_0x0469
        L_0x0466:
            r5 = 2
            r11 = 3
            goto L_0x0458
        L_0x0469:
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x0472
            androidx.compose.runtime.ComposerKt.X()
        L_0x0472:
            r3.M()
            java.lang.Float r35 = java.lang.Float.valueOf(r12)
            androidx.compose.animation.core.Transition$Segment r1 = r0.o()
            r4 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            java.lang.Object r1 = r2.d(r1, r3, r6)
            r36 = r1
            androidx.compose.animation.core.FiniteAnimationSpec r36 = (androidx.compose.animation.core.FiniteAnimationSpec) r36
            java.lang.String r38 = "PrefixSuffixOpacity"
            r33 = r0
            r39 = r3
            r1 = 196608(0x30000, float:2.75506E-40)
            r40 = r1
            androidx.compose.runtime.State r12 = androidx.compose.animation.core.TransitionKt.f(r33, r34, r35, r36, r37, r38, r39, r40)
            r2 = 6
            androidx.compose.animation.core.FiniteAnimationSpec r1 = androidx.compose.material3.MotionSchemeKt.b(r8, r3, r2)
            androidx.compose.material3.internal.TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1 r4 = new androidx.compose.material3.internal.TextFieldImplKt$TextFieldTransitionScope$labelTextStyleColor$1
            r4.<init>(r1)
            java.lang.Object r6 = r0.q()
            androidx.compose.material3.internal.InputPhase r6 = (androidx.compose.material3.internal.InputPhase) r6
            r8 = -12973394(0xffffffffff3a0aae, float:-2.4729186E38)
            r3.X(r8)
            boolean r13 = androidx.compose.runtime.ComposerKt.P()
            java.lang.String r2 = "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:441)"
            if (r13 == 0) goto L_0x04bb
            r5 = -1
            r13 = 0
            androidx.compose.runtime.ComposerKt.Y(r8, r13, r5, r2)
        L_0x04bb:
            int r5 = r6.ordinal()
            r5 = r7[r5]
            r6 = 1
            if (r5 != r6) goto L_0x04c7
            r5 = r26
            goto L_0x04c9
        L_0x04c7:
            r5 = r24
        L_0x04c9:
            boolean r13 = androidx.compose.runtime.ComposerKt.P()
            if (r13 == 0) goto L_0x04d2
            androidx.compose.runtime.ComposerKt.X()
        L_0x04d2:
            r3.M()
            androidx.compose.ui.graphics.colorspace.ColorSpace r5 = androidx.compose.ui.graphics.Color.q(r5)
            boolean r6 = r3.W(r5)
            java.lang.Object r13 = r3.g()
            if (r6 != 0) goto L_0x04eb
            androidx.compose.runtime.Composer$Companion r6 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r6 = r6.a()
            if (r13 != r6) goto L_0x04f9
        L_0x04eb:
            kotlin.jvm.functions.Function1 r6 = androidx.compose.animation.ColorVectorConverterKt.a(r22)
            java.lang.Object r5 = r6.invoke(r5)
            r13 = r5
            androidx.compose.animation.core.TwoWayConverter r13 = (androidx.compose.animation.core.TwoWayConverter) r13
            r3.N(r13)
        L_0x04f9:
            r37 = r13
            androidx.compose.animation.core.TwoWayConverter r37 = (androidx.compose.animation.core.TwoWayConverter) r37
            java.lang.Object r5 = r0.i()
            androidx.compose.material3.internal.InputPhase r5 = (androidx.compose.material3.internal.InputPhase) r5
            r3.X(r8)
            boolean r6 = androidx.compose.runtime.ComposerKt.P()
            if (r6 == 0) goto L_0x0511
            r6 = 0
            r13 = -1
            androidx.compose.runtime.ComposerKt.Y(r8, r6, r13, r2)
        L_0x0511:
            int r5 = r5.ordinal()
            r5 = r7[r5]
            r6 = 1
            if (r5 != r6) goto L_0x051d
            r5 = r26
            goto L_0x051f
        L_0x051d:
            r5 = r24
        L_0x051f:
            boolean r13 = androidx.compose.runtime.ComposerKt.P()
            if (r13 == 0) goto L_0x0528
            androidx.compose.runtime.ComposerKt.X()
        L_0x0528:
            r3.M()
            androidx.compose.ui.graphics.Color r34 = androidx.compose.ui.graphics.Color.h(r5)
            java.lang.Object r5 = r0.q()
            androidx.compose.material3.internal.InputPhase r5 = (androidx.compose.material3.internal.InputPhase) r5
            r3.X(r8)
            boolean r6 = androidx.compose.runtime.ComposerKt.P()
            if (r6 == 0) goto L_0x0543
            r6 = 0
            r13 = -1
            androidx.compose.runtime.ComposerKt.Y(r8, r6, r13, r2)
        L_0x0543:
            int r2 = r5.ordinal()
            r2 = r7[r2]
            r5 = 1
            if (r2 != r5) goto L_0x054e
            r24 = r26
        L_0x054e:
            boolean r2 = androidx.compose.runtime.ComposerKt.P()
            if (r2 == 0) goto L_0x0557
            androidx.compose.runtime.ComposerKt.X()
        L_0x0557:
            r3.M()
            androidx.compose.ui.graphics.Color r35 = androidx.compose.ui.graphics.Color.h(r24)
            androidx.compose.animation.core.Transition$Segment r2 = r0.o()
            r5 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            java.lang.Object r2 = r4.d(r2, r3, r6)
            r36 = r2
            androidx.compose.animation.core.FiniteAnimationSpec r36 = (androidx.compose.animation.core.FiniteAnimationSpec) r36
            java.lang.String r38 = "LabelTextStyleColor"
            r33 = r0
            r39 = r3
            r2 = 196608(0x30000, float:2.75506E-40)
            r40 = r2
            androidx.compose.runtime.State r6 = androidx.compose.animation.core.TransitionKt.f(r33, r34, r35, r36, r37, r38, r39, r40)
            androidx.compose.material3.internal.TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1 r2 = new androidx.compose.material3.internal.TextFieldImplKt$TextFieldTransitionScope$labelContentColor$1
            r2.<init>(r1)
            java.lang.Object r1 = r0.q()
            androidx.compose.material3.internal.InputPhase r1 = (androidx.compose.material3.internal.InputPhase) r1
            r1 = -464752477(0xffffffffe44c70a3, float:-1.5085008E22)
            r3.X(r1)
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            java.lang.String r5 = "androidx.compose.material3.internal.TextFieldTransitionScope.<anonymous> (TextFieldImpl.kt:452)"
            if (r4 == 0) goto L_0x059b
            r4 = 0
            r7 = -1
            androidx.compose.runtime.ComposerKt.Y(r1, r4, r7, r5)
        L_0x059b:
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            if (r4 == 0) goto L_0x05a4
            androidx.compose.runtime.ComposerKt.X()
        L_0x05a4:
            r3.M()
            androidx.compose.ui.graphics.colorspace.ColorSpace r4 = androidx.compose.ui.graphics.Color.q(r17)
            boolean r7 = r3.W(r4)
            java.lang.Object r8 = r3.g()
            if (r7 != 0) goto L_0x05bd
            androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r7 = r7.a()
            if (r8 != r7) goto L_0x05cb
        L_0x05bd:
            kotlin.jvm.functions.Function1 r7 = androidx.compose.animation.ColorVectorConverterKt.a(r22)
            java.lang.Object r4 = r7.invoke(r4)
            r8 = r4
            androidx.compose.animation.core.TwoWayConverter r8 = (androidx.compose.animation.core.TwoWayConverter) r8
            r3.N(r8)
        L_0x05cb:
            r37 = r8
            androidx.compose.animation.core.TwoWayConverter r37 = (androidx.compose.animation.core.TwoWayConverter) r37
            java.lang.Object r4 = r0.i()
            androidx.compose.material3.internal.InputPhase r4 = (androidx.compose.material3.internal.InputPhase) r4
            r3.X(r1)
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            if (r4 == 0) goto L_0x05e3
            r4 = 0
            r7 = -1
            androidx.compose.runtime.ComposerKt.Y(r1, r4, r7, r5)
        L_0x05e3:
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            if (r4 == 0) goto L_0x05ec
            androidx.compose.runtime.ComposerKt.X()
        L_0x05ec:
            r3.M()
            androidx.compose.ui.graphics.Color r34 = androidx.compose.ui.graphics.Color.h(r17)
            java.lang.Object r4 = r0.q()
            androidx.compose.material3.internal.InputPhase r4 = (androidx.compose.material3.internal.InputPhase) r4
            r3.X(r1)
            boolean r4 = androidx.compose.runtime.ComposerKt.P()
            if (r4 == 0) goto L_0x0608
            r4 = -1
            r13 = 0
            androidx.compose.runtime.ComposerKt.Y(r1, r13, r4, r5)
            goto L_0x0609
        L_0x0608:
            r13 = 0
        L_0x0609:
            boolean r1 = androidx.compose.runtime.ComposerKt.P()
            if (r1 == 0) goto L_0x0612
            androidx.compose.runtime.ComposerKt.X()
        L_0x0612:
            r3.M()
            androidx.compose.ui.graphics.Color r35 = androidx.compose.ui.graphics.Color.h(r17)
            androidx.compose.animation.core.Transition$Segment r1 = r0.o()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
            java.lang.Object r1 = r2.d(r1, r3, r4)
            r36 = r1
            androidx.compose.animation.core.FiniteAnimationSpec r36 = (androidx.compose.animation.core.FiniteAnimationSpec) r36
            java.lang.String r38 = "LabelContentColor"
            r33 = r0
            r39 = r3
            r0 = 196608(0x30000, float:2.75506E-40)
            r40 = r0
            androidx.compose.runtime.State r4 = androidx.compose.animation.core.TransitionKt.f(r33, r34, r35, r36, r37, r38, r39, r40)
            java.lang.Object r0 = r3.g()
            androidx.compose.runtime.Composer$Companion r16 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r16.a()
            if (r0 != r1) goto L_0x064b
            androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$labelScope$1$1 r0 = new androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$labelScope$1$1
            r0.<init>(r9)
            r3.N(r0)
        L_0x064b:
            r8 = r0
            androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$labelScope$1$1 r8 = (androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$labelScope$1$1) r8
            r7 = 54
            r5 = 0
            if (r14 != 0) goto L_0x0676
            r0 = -1891724857(0xffffffff8f3e91c7, float:-9.395799E-30)
            r3.X(r0)
            r3.M()
            r11 = r62
            r14 = r3
            r6 = r5
            r64 = r9
            r25 = r12
            r24 = r15
            r18 = r21
            r43 = r23
            r17 = 6
            r22 = 48
            r15 = r58
            r9 = r59
            r12 = r7
        L_0x0673:
            r7 = r41
            goto L_0x06b4
        L_0x0676:
            r0 = -1891724856(0xffffffff8f3e91c8, float:-9.3958E-30)
            r3.X(r0)
            androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1 r2 = new androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1
            r0 = r2
            r1 = r20
            r14 = r63
            r13 = r2
            r18 = r21
            r11 = 2
            r17 = 6
            r22 = 48
            r2 = r15
            r11 = r62
            r14 = r3
            r3 = r9
            r64 = r9
            r43 = r23
            r9 = r61
            r9 = r5
            r5 = r42
            r9 = r59
            r25 = r12
            r24 = r15
            r15 = r58
            r12 = r7
            r7 = r50
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = -1076580032(0xffffffffbfd4b140, float:-1.6616592)
            r1 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r0, r1, r13, r14, r12)
            r14.M()
            r6 = r0
            goto L_0x0673
        L_0x06b4:
            long r2 = r11.r(r15, r9, r7)
            java.lang.Object r0 = r14.g()
            java.lang.Object r1 = r16.a()
            if (r0 != r1) goto L_0x06d2
            androidx.compose.runtime.SnapshotMutationPolicy r0 = androidx.compose.runtime.SnapshotStateKt.r()
            androidx.compose.material3.internal.Y r1 = new androidx.compose.material3.internal.Y
            r1.<init>(r10)
            androidx.compose.runtime.State r0 = androidx.compose.runtime.SnapshotStateKt.d(r0, r1)
            r14.N(r0)
        L_0x06d2:
            androidx.compose.runtime.State r0 = (androidx.compose.runtime.State) r0
            if (r51 == 0) goto L_0x0700
            int r1 = r47.length()
            if (r1 != 0) goto L_0x0700
            boolean r0 = q(r0)
            if (r0 == 0) goto L_0x0700
            r0 = -1890614312(0xffffffff8f4f83d8, float:-1.023128E-29)
            r14.X(r0)
            androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1 r8 = new androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1
            r0 = r8
            r1 = r10
            r4 = r20
            r5 = r51
            r0.<init>(r1, r2, r4, r5)
            r0 = 1405547205(0x53c6f2c5, float:1.70895304E12)
            r1 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r0, r1, r8, r14, r12)
            r14.M()
            r8 = r0
            goto L_0x070a
        L_0x0700:
            r0 = -1890217110(0xffffffff8f55936a, float:-1.0530102E-29)
            r14.X(r0)
            r14.M()
            r8 = 0
        L_0x070a:
            long r2 = r11.s(r15, r9, r7)
            java.lang.Object r0 = r14.g()
            java.lang.Object r1 = r16.a()
            if (r0 != r1) goto L_0x072b
            androidx.compose.runtime.SnapshotMutationPolicy r0 = androidx.compose.runtime.SnapshotStateKt.r()
            androidx.compose.material3.internal.Z r1 = new androidx.compose.material3.internal.Z
            r10 = r25
            r1.<init>(r10)
            androidx.compose.runtime.State r0 = androidx.compose.runtime.SnapshotStateKt.d(r0, r1)
            r14.N(r0)
            goto L_0x072d
        L_0x072b:
            r10 = r25
        L_0x072d:
            r13 = r0
            androidx.compose.runtime.State r13 = (androidx.compose.runtime.State) r13
            if (r54 == 0) goto L_0x0759
            boolean r0 = n(r13)
            if (r0 == 0) goto L_0x0759
            r0 = -1889877907(0xffffffff8f5ac06d, float:-1.078529E-29)
            r14.X(r0)
            androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedPrefix$1 r5 = new androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedPrefix$1
            r0 = r5
            r1 = r10
            r4 = r20
            r25 = r6
            r6 = r5
            r5 = r54
            r0.<init>(r1, r2, r4, r5)
            r0 = 606594655(0x2427e65f, float:3.6407484E-17)
            r1 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r0, r1, r6, r14, r12)
            r14.M()
            r6 = r0
            goto L_0x0765
        L_0x0759:
            r25 = r6
            r0 = -1889500886(0xffffffff8f60812a, float:-1.1068929E-29)
            r14.X(r0)
            r14.M()
            r6 = 0
        L_0x0765:
            long r2 = r11.t(r15, r9, r7)
            if (r55 == 0) goto L_0x078f
            boolean r0 = n(r13)
            if (r0 == 0) goto L_0x078f
            r0 = -1889301555(0xffffffff8f638bcd, float:-1.1218889E-29)
            r14.X(r0)
            androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedSuffix$1 r13 = new androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedSuffix$1
            r0 = r13
            r1 = r10
            r4 = r20
            r5 = r55
            r0.<init>(r1, r2, r4, r5)
            r0 = -45078754(0xfffffffffd50271e, float:-1.7292658E37)
            r1 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r0, r1, r13, r14, r12)
            r14.M()
            r13 = r0
            goto L_0x0799
        L_0x078f:
            r0 = -1888924534(0xffffffff8f694c8a, float:-1.1502528E-29)
            r14.X(r0)
            r14.M()
            r13 = 0
        L_0x0799:
            long r0 = r11.q(r15, r9, r7)
            r10 = r52
            if (r10 != 0) goto L_0x07ac
            r0 = -1888749663(0xffffffff8f6bf7a1, float:-1.1634086E-29)
            r14.X(r0)
            r14.M()
            r4 = 0
            goto L_0x07c3
        L_0x07ac:
            r2 = -1888749662(0xffffffff8f6bf7a2, float:-1.1634087E-29)
            r14.X(r2)
            androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedLeading$1$1 r2 = new androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedLeading$1$1
            r2.<init>(r0, r10)
            r0 = -1736293487(0xffffffff98824391, float:-3.3672437E-24)
            r1 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r0, r1, r2, r14, r12)
            r14.M()
            r4 = r0
        L_0x07c3:
            long r0 = r11.x(r15, r9, r7)
            r5 = r53
            r2 = 3
            if (r5 != 0) goto L_0x07d8
            r0 = -1888469888(0xffffffff8f703c80, float:-1.18445655E-29)
            r14.X(r0)
            r14.M()
            r20 = 0
            goto L_0x07f0
        L_0x07d8:
            r3 = -1888469887(0xffffffff8f703c81, float:-1.1844566E-29)
            r14.X(r3)
            androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedTrailing$1$1 r3 = new androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedTrailing$1$1
            r3.<init>(r0, r5)
            r0 = 1334518521(0x4f8b22f9, float:4.66865E9)
            r1 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r0, r1, r3, r14, r12)
            r14.M()
            r20 = r0
        L_0x07f0:
            long r0 = r11.u(r15, r9, r7)
            r7 = r56
            if (r7 != 0) goto L_0x0805
            r0 = -1888176380(0xffffffff8f74b704, float:-1.2065376E-29)
            r14.X(r0)
            r14.M()
            r1 = 1
            r24 = 0
            goto L_0x081f
        L_0x0805:
            r3 = -1888176379(0xffffffff8f74b705, float:-1.2065377E-29)
            r14.X(r3)
            androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedSupporting$1$1 r3 = new androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$decoratedSupporting$1$1
            r2 = r24
            r3.<init>(r0, r2, r7)
            r0 = 837168720(0x31e62e50, float:6.699146E-9)
            r1 = 1
            androidx.compose.runtime.internal.ComposableLambda r0 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r0, r1, r3, r14, r12)
            r14.M()
            r24 = r0
        L_0x081f:
            int[] r0 = androidx.compose.material3.internal.TextFieldImplKt.WhenMappings.f12366a
            int r2 = r46.ordinal()
            r0 = r0[r2]
            if (r0 == r1) goto L_0x08ec
            r1 = 2
            if (r0 != r1) goto L_0x08db
            r0 = -1886778186(0xffffffff8f8a0cb6, float:-1.3612747E-29)
            r14.X(r0)
            java.lang.Object r0 = r14.g()
            java.lang.Object r2 = r16.a()
            if (r0 != r2) goto L_0x084e
            androidx.compose.ui.geometry.Size$Companion r0 = androidx.compose.ui.geometry.Size.f15876b
            long r2 = r0.b()
            androidx.compose.ui.geometry.Size r0 = androidx.compose.ui.geometry.Size.c(r2)
            r2 = 0
            androidx.compose.runtime.MutableState r0 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.e(r0, r2, r1, r2)
            r14.N(r0)
        L_0x084e:
            androidx.compose.runtime.MutableState r0 = (androidx.compose.runtime.MutableState) r0
            androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$borderContainerWithId$1 r1 = new androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$borderContainerWithId$1
            r3 = r61
            r2 = r63
            r15 = r14
            r14 = r49
            r1.<init>(r0, r14, r3, r2)
            r2 = 528115858(0x1f7a6892, float:5.3026058E-20)
            r3 = 1
            androidx.compose.runtime.internal.ComposableLambda r12 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r2, r3, r1, r15, r12)
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$2 r2 = new androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$2
            r3 = r64
            r2.<init>(r3)
            androidx.compose.material3.internal.TextFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0 r10 = new androidx.compose.material3.internal.TextFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0
            r10.<init>(r2)
            r2 = r43
            r5 = r2 & 7168(0x1c00, float:1.0045E-41)
            r7 = 2048(0x800, float:2.87E-42)
            if (r5 != r7) goto L_0x087d
            r19 = 1
            goto L_0x087f
        L_0x087d:
            r19 = 0
        L_0x087f:
            boolean r5 = r15.W(r3)
            r5 = r19 | r5
            java.lang.Object r7 = r15.g()
            if (r5 != 0) goto L_0x0891
            java.lang.Object r5 = r16.a()
            if (r7 != r5) goto L_0x0899
        L_0x0891:
            androidx.compose.material3.internal.a0 r7 = new androidx.compose.material3.internal.a0
            r7.<init>(r14, r3, r0)
            r15.N(r7)
        L_0x0899:
            r0 = r7
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r11 = r0
            r0 = 3
            int r3 = r2 >> 3
            r0 = r3 & 112(0x70, float:1.57E-43)
            r0 = r0 | 6
            int r3 = r18 << 21
            r5 = 234881024(0xe000000, float:1.5777218E-30)
            r3 = r3 & r5
            r0 = r0 | r3
            int r2 = r2 << 18
            r3 = 1879048192(0x70000000, float:1.58456325E29)
            r2 = r2 & r3
            r16 = r0 | r2
            r0 = 57344(0xe000, float:8.0356E-41)
            r2 = 3
            int r2 = r18 >> 3
            r0 = r0 & r2
            r0 = r0 | 384(0x180, float:5.38E-43)
            r17 = r0
            r0 = r1
            r1 = r48
            r2 = r8
            r3 = r25
            r5 = r20
            r7 = r13
            r8 = r57
            r9 = r49
            r13 = r24
            r14 = r61
            r64 = r15
            androidx.compose.material3.OutlinedTextFieldKt.j(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r64.M()
            kotlin.Unit r0 = kotlin.Unit.f40552a
            r17 = r64
            goto L_0x0946
        L_0x08db:
            r64 = r14
            r0 = 493292232(0x1d670ac8, float:3.057817E-21)
            r14.X(r0)
            r14.M()
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x08ec:
            r3 = r64
            r2 = r43
            r0 = -1887830698(0xffffffff8f79fd56, float:-1.23254386E-29)
            r14.X(r0)
            androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$containerWithId$1 r0 = new androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$containerWithId$1
            r9 = r63
            r0.<init>(r9)
            r1 = -1729858187(0xffffffff98e47575, float:-5.905522E-24)
            r5 = 1
            androidx.compose.runtime.internal.ComposableLambda r11 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r1, r5, r0, r14, r12)
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
            androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$1 r1 = new androidx.compose.material3.internal.TextFieldImplKt$CommonDecorationBox$3$1
            r1.<init>(r3)
            androidx.compose.material3.internal.TextFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0 r3 = new androidx.compose.material3.internal.TextFieldImplKt$sam$androidx_compose_material3_internal_FloatProducer$0
            r10 = r3
            r3.<init>(r1)
            r1 = 3
            int r1 = r2 >> 3
            r1 = r1 & 112(0x70, float:1.57E-43)
            r1 = r1 | 6
            int r3 = r18 << 21
            r5 = 234881024(0xe000000, float:1.5777218E-30)
            r3 = r3 & r5
            r1 = r1 | r3
            int r2 = r2 << 18
            r3 = 1879048192(0x70000000, float:1.58456325E29)
            r2 = r2 & r3
            r15 = r1 | r2
            int r1 = r18 >> 6
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r16 = r1 | 48
            r1 = r48
            r2 = r25
            r3 = r8
            r5 = r20
            r7 = r13
            r8 = r57
            r9 = r49
            r12 = r24
            r13 = r61
            r17 = r14
            androidx.compose.material3.TextFieldKt.c(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r17.M()
            kotlin.Unit r0 = kotlin.Unit.f40552a
        L_0x0946:
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0955
            androidx.compose.runtime.ComposerKt.X()
            goto L_0x0955
        L_0x0950:
            r17 = r3
            r17.B()
        L_0x0955:
            androidx.compose.runtime.ScopeUpdateScope r15 = r17.x()
            if (r15 == 0) goto L_0x0994
            androidx.compose.material3.internal.b0 r14 = new androidx.compose.material3.internal.b0
            r0 = r14
            r1 = r46
            r2 = r47
            r3 = r48
            r4 = r49
            r5 = r50
            r6 = r51
            r7 = r52
            r8 = r53
            r9 = r54
            r10 = r55
            r11 = r56
            r12 = r57
            r13 = r58
            r44 = r14
            r14 = r59
            r45 = r15
            r15 = r60
            r16 = r61
            r17 = r62
            r18 = r63
            r19 = r65
            r20 = r66
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r1 = r44
            r0 = r45
            r0.a(r1)
        L_0x0994:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.TextFieldImplKt.l(androidx.compose.material3.internal.TextFieldType, java.lang.CharSequence, kotlin.jvm.functions.Function2, androidx.compose.material3.TextFieldLabelPosition, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.foundation.layout.PaddingValues, androidx.compose.material3.TextFieldColors, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final boolean m(State state) {
        return ((Number) state.getValue()).floatValue() > 0.0f;
    }

    public static final boolean n(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    public static final Unit o(TextFieldLabelPosition textFieldLabelPosition, State state, MutableState mutableState, Size size) {
        if (textFieldLabelPosition instanceof TextFieldLabelPosition.Above) {
            return Unit.f40552a;
        }
        float floatValue = ((Number) state.getValue()).floatValue();
        float intBitsToFloat = Float.intBitsToFloat((int) (size.m() >> 32)) * floatValue;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (size.m() & 4294967295L)) * floatValue;
        if (!(Float.intBitsToFloat((int) (((Size) mutableState.getValue()).m() >> 32)) == intBitsToFloat && Float.intBitsToFloat((int) (((Size) mutableState.getValue()).m() & 4294967295L)) == intBitsToFloat2)) {
            mutableState.setValue(Size.c(Size.d((((long) Float.floatToRawIntBits(intBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(intBitsToFloat2)) & 4294967295L))));
        }
        return Unit.f40552a;
    }

    public static final boolean p(State state) {
        return ((Number) state.getValue()).floatValue() > 0.0f;
    }

    public static final boolean q(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    public static final Unit r(TextFieldType textFieldType, CharSequence charSequence, Function2 function2, TextFieldLabelPosition textFieldLabelPosition, Function3 function3, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Function2 function26, Function2 function27, boolean z2, boolean z3, boolean z4, InteractionSource interactionSource, PaddingValues paddingValues, TextFieldColors textFieldColors, Function2 function28, int i2, int i3, Composer composer, int i4) {
        l(textFieldType, charSequence, function2, textFieldLabelPosition, function3, function22, function23, function24, function25, function26, function27, z2, z3, z4, interactionSource, paddingValues, textFieldColors, function28, composer, RecomposeScopeImplKt.a(i2 | 1), RecomposeScopeImplKt.a(i3));
        return Unit.f40552a;
    }

    public static final void s(long j2, TextStyle textStyle, Function2 function2, Composer composer, int i2) {
        int i3;
        Composer q2 = composer.q(396611577);
        if ((i2 & 6) == 0) {
            i3 = (q2.j(j2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= q2.W(textStyle) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= q2.l(function2) ? 256 : 128;
        }
        if (q2.E((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(396611577, i3, -1, "androidx.compose.material3.internal.Decoration (TextFieldImpl.kt:325)");
            }
            ProvideContentColorTextStyleKt.b(j2, textStyle, function2, q2, i3 & 1022);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new W(j2, textStyle, function2, i2));
        }
    }

    public static final void t(long j2, Function2 function2, Composer composer, int i2) {
        int i3;
        Composer q2 = composer.q(590397809);
        if ((i2 & 6) == 0) {
            i3 = (q2.j(j2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= q2.l(function2) ? 32 : 16;
        }
        if (q2.E((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(590397809, i3, -1, "androidx.compose.material3.internal.Decoration (TextFieldImpl.kt:330)");
            }
            CompositionLocalKt.c(ContentColorKt.a().d(Color.h(j2)), function2, q2, (i3 & 112) | ProvidedValue.f14769i);
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            q2.B();
        }
        ScopeUpdateScope x2 = q2.x();
        if (x2 != null) {
            x2.a(new X(j2, function2, i2));
        }
    }

    public static final Unit u(long j2, TextStyle textStyle, Function2 function2, int i2, Composer composer, int i3) {
        s(j2, textStyle, function2, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final Unit v(long j2, Function2 function2, int i2, Composer composer, int i3) {
        t(j2, function2, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final State y(boolean z2, boolean z3, boolean z4, TextFieldColors textFieldColors, float f2, float f3, Composer composer, int i2) {
        State p2;
        State state;
        boolean z5 = z2;
        boolean z6 = z4;
        Composer composer2 = composer;
        int i3 = i2;
        if (ComposerKt.P()) {
            ComposerKt.Y(2047013045, i3, -1, "androidx.compose.material3.internal.animateBorderStrokeAsState (TextFieldImpl.kt:472)");
        }
        boolean z7 = z3;
        long o2 = textFieldColors.o(z2, z3, z6);
        FiniteAnimationSpec b2 = MotionSchemeKt.b(MotionSchemeKeyTokens.FastEffects, composer2, 6);
        if (z5) {
            composer2.X(-1674507999);
            p2 = SingleValueAnimationKt.a(o2, b2, (String) null, (Function1) null, composer, 0, 12);
            composer.M();
        } else {
            composer2.X(-1674427244);
            p2 = SnapshotStateKt.p(Color.h(o2), composer2, 0);
            composer.M();
        }
        State state2 = p2;
        FiniteAnimationSpec b3 = MotionSchemeKt.b(MotionSchemeKeyTokens.FastSpatial, composer2, 6);
        if (z5) {
            composer2.X(-1674245832);
            state = AnimateAsStateKt.c(z6 ? f2 : f3, b3, (String) null, (Function1) null, composer, 0, 12);
            composer.M();
        } else {
            composer2.X(-1674063769);
            state = SnapshotStateKt.p(Dp.j(f3), composer2, (i3 >> 15) & 14);
            composer.M();
        }
        State p3 = SnapshotStateKt.p(BorderStrokeKt.a(((Dp) state.getValue()).t(), ((Color) state2.getValue()).v()), composer2, 0);
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        return p3;
    }

    public static final Modifier z(Modifier modifier, boolean z2, String str) {
        return z2 ? SemanticsModifierKt.d(modifier, false, new T(str), 1, (Object) null) : modifier;
    }
}
