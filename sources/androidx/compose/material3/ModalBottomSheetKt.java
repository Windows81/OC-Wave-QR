package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.AnchoredDraggableKt;
import androidx.compose.material3.internal.DraggableAnchors;
import androidx.compose.material3.internal.DraggableAnchorsConfig;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.R;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata
public final class ModalBottomSheetKt {

    /* renamed from: a  reason: collision with root package name */
    public static final float f10317a = Dp.m((float) 48);

    /* renamed from: b  reason: collision with root package name */
    public static final float f10318b = Dp.m((float) 24);

    /* renamed from: c  reason: collision with root package name */
    public static final long f10319c = TransformOriginKt.a(0.5f, 0.0f);

    @Metadata
    public /* synthetic */ class WhenMappings {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f10334a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                androidx.compose.material3.SheetValue[] r0 = androidx.compose.material3.SheetValue.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.material3.SheetValue r1 = androidx.compose.material3.SheetValue.Hidden     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.material3.SheetValue r1 = androidx.compose.material3.SheetValue.PartiallyExpanded     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.material3.SheetValue r1 = androidx.compose.material3.SheetValue.Expanded     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f10334a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ModalBottomSheetKt.WhenMappings.<clinit>():void");
        }
    }

    public static final Unit A(SheetState sheetState, CoroutineScope coroutineScope, Animatable animatable, Function0 function0) {
        SheetState sheetState2 = sheetState;
        if (sheetState.k() != SheetValue.Expanded || !sheetState.m()) {
            BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new ModalBottomSheetKt$ModalBottomSheet$3$1$3(sheetState2, (Continuation) null), 3, (Object) null).S(new C3(function0));
        } else {
            Job unused = BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new ModalBottomSheetKt$ModalBottomSheet$3$1$1(animatable, (Continuation) null), 3, (Object) null);
            Job unused2 = BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new ModalBottomSheetKt$ModalBottomSheet$3$1$2(sheetState2, (Continuation) null), 3, (Object) null);
        }
        return Unit.f40552a;
    }

    public static final Unit B(Function0 function0, Throwable th) {
        function0.invoke();
        return Unit.f40552a;
    }

    public static final Unit C(Function0 function0, Modifier modifier, SheetState sheetState, float f2, boolean z2, Shape shape, long j2, long j3, float f3, long j4, Function2 function2, Function2 function22, ModalBottomSheetProperties modalBottomSheetProperties, Function3 function3, int i2, int i3, int i4, Composer composer, int i5) {
        s(function0, modifier, sheetState, f2, z2, shape, j2, j3, f3, j4, function2, function22, modalBottomSheetProperties, function3, composer, RecomposeScopeImplKt.a(i2 | 1), RecomposeScopeImplKt.a(i3), i4);
        return Unit.f40552a;
    }

    public static final Unit D(SheetState sheetState, CoroutineScope coroutineScope, Function0 function0) {
        if (((Boolean) sheetState.j().s().invoke(SheetValue.Hidden)).booleanValue()) {
            BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new ModalBottomSheetKt$ModalBottomSheet$animateToDismiss$1$1$1(sheetState, (Continuation) null), 3, (Object) null).S(new B3(sheetState, function0));
        }
        return Unit.f40552a;
    }

    public static final Unit E(SheetState sheetState, Function0 function0, Throwable th) {
        if (!sheetState.s()) {
            function0.invoke();
        }
        return Unit.f40552a;
    }

    public static final Unit F(CoroutineScope coroutineScope, SheetState sheetState, Function0 function0, float f2) {
        BuildersKt__Builders_commonKt.d(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1$1(sheetState, f2, (Continuation) null), 3, (Object) null).S(new D3(sheetState, function0));
        return Unit.f40552a;
    }

    public static final Unit G(SheetState sheetState, Function0 function0, Throwable th) {
        if (!sheetState.s()) {
            function0.invoke();
        }
        return Unit.f40552a;
    }

    public static final void H(long j2, Function0 function0, boolean z2, boolean z3, Composer composer, int i2) {
        int i3;
        Composer composer2;
        Modifier modifier;
        boolean z4;
        long j3 = j2;
        Function0 function02 = function0;
        boolean z5 = z2;
        boolean z6 = z3;
        int i4 = i2;
        Composer q2 = composer.q(-391613911);
        if ((i4 & 6) == 0) {
            i3 = (q2.j(j3) ? 4 : 2) | i4;
        } else {
            i3 = i4;
        }
        if ((i4 & 48) == 0) {
            i3 |= q2.l(function02) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i3 |= q2.d(z5) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i3 |= q2.d(z6) ? 2048 : 1024;
        }
        int i5 = i3;
        if (q2.E((i5 & 1171) != 1170, i5 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-391613911, i5, -1, "androidx.compose.material3.Scrim (ModalBottomSheet.kt:514)");
            }
            if (j3 != 16) {
                q2.X(-1438582326);
                int i6 = i5;
                composer2 = q2;
                State d2 = AnimateAsStateKt.d(z5 ? 1.0f : 0.0f, MotionSchemeKt.b(MotionSchemeKeyTokens.DefaultEffects, q2, 6), 0.0f, (String) null, (Function1) null, q2, 0, 28);
                Strings.Companion companion = Strings.f12320b;
                String b2 = Strings_androidKt.b(Strings.a(R.string.f15527c), composer2, 0);
                if (z6) {
                    composer2.X(-1438283579);
                    Modifier.Companion companion2 = Modifier.f15489d;
                    int i7 = i6 & 112;
                    boolean z7 = i7 == 32;
                    Object g2 = composer2.g();
                    if (z7 || g2 == Composer.f14567a.a()) {
                        g2 = new ModalBottomSheetKt$Scrim$dismissSheet$1$1(function02);
                        composer2.N(g2);
                    }
                    Modifier c2 = SuspendingPointerInputFilterKt.c(companion2, function02, (PointerInputEventHandler) g2);
                    boolean W = (i7 == 32) | composer2.W(b2);
                    Object g3 = composer2.g();
                    if (W || g3 == Composer.f14567a.a()) {
                        g3 = new C0265v3(b2, function02);
                        composer2.N(g3);
                    }
                    z4 = true;
                    modifier = SemanticsModifierKt.c(c2, true, (Function1) g3);
                    composer2.M();
                } else {
                    z4 = true;
                    composer2.X(-1437857391);
                    composer2.M();
                    modifier = Modifier.f15489d;
                }
                Modifier o0 = SizeKt.f(Modifier.f15489d, 0.0f, z4 ? 1 : 0, (Object) null).o0(modifier);
                if ((i6 & 14) != 4) {
                    z4 = false;
                }
                boolean W2 = z4 | composer2.W(d2);
                Object g4 = composer2.g();
                if (W2 || g4 == Composer.f14567a.a()) {
                    g4 = new E3(j3, d2);
                    composer2.N(g4);
                }
                CanvasKt.b(o0, (Function1) g4, composer2, 0);
                composer2.M();
            } else {
                composer2 = q2;
                composer2.X(-1437676103);
                composer2.M();
            }
            if (ComposerKt.P()) {
                ComposerKt.X();
            }
        } else {
            composer2 = q2;
            composer2.B();
        }
        ScopeUpdateScope x2 = composer2.x();
        if (x2 != null) {
            x2.a(new F3(j2, function0, z2, z3, i2));
        }
    }

    public static final float I(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    public static final Unit J(String str, Function0 function0, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.I0(semanticsPropertyReceiver, 1.0f);
        SemanticsPropertiesKt.e0(semanticsPropertyReceiver, str);
        SemanticsPropertiesKt.C(semanticsPropertyReceiver, (String) null, new M3(function0), 1, (Object) null);
        return Unit.f40552a;
    }

    public static final boolean K(Function0 function0) {
        function0.invoke();
        return true;
    }

    public static final Unit L(long j2, State state, DrawScope drawScope) {
        DrawScope.A1(drawScope, j2, 0, 0, RangesKt.n(I(state), 0.0f, 1.0f), (DrawStyle) null, (ColorFilter) null, 0, 118, (Object) null);
        return Unit.f40552a;
    }

    public static final Unit M(long j2, Function0 function0, boolean z2, boolean z3, int i2, Composer composer, int i3) {
        H(j2, function0, z2, z3, composer, RecomposeScopeImplKt.a(i2 | 1));
        return Unit.f40552a;
    }

    public static final float R(GraphicsLayerScope graphicsLayerScope, float f2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (graphicsLayerScope.c() >> 32));
        if (Float.isNaN(intBitsToFloat) || intBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (MathHelpersKt.b(0.0f, Math.min(graphicsLayerScope.B1(f10317a), intBitsToFloat), f2) / intBitsToFloat);
    }

    public static final float S(GraphicsLayerScope graphicsLayerScope, float f2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (graphicsLayerScope.c() & 4294967295L));
        if (Float.isNaN(intBitsToFloat) || intBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (MathHelpersKt.b(0.0f, Math.min(graphicsLayerScope.B1(f10318b), intBitsToFloat), f2) / intBitsToFloat);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.material3.SheetState T(boolean r9, kotlin.jvm.functions.Function1 r10, androidx.compose.runtime.Composer r11, int r12, int r13) {
        /*
            r0 = r13 & 1
            if (r0 == 0) goto L_0x0005
            r9 = 0
        L_0x0005:
            r0 = r9
            r9 = r13 & 2
            if (r9 == 0) goto L_0x0021
            java.lang.Object r9 = r11.g()
            androidx.compose.runtime.Composer$Companion r10 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r10 = r10.a()
            if (r9 != r10) goto L_0x001e
            androidx.compose.material3.L3 r9 = new androidx.compose.material3.L3
            r9.<init>()
            r11.N(r9)
        L_0x001e:
            r10 = r9
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
        L_0x0021:
            r1 = r10
            boolean r9 = androidx.compose.runtime.ComposerKt.P()
            if (r9 == 0) goto L_0x0031
            r9 = -1
            java.lang.String r10 = "androidx.compose.material3.rememberModalBottomSheetState (ModalBottomSheet.kt:502)"
            r13 = -778250030(0xffffffffd19cd8d2, float:-8.4206567E10)
            androidx.compose.runtime.ComposerKt.Y(r13, r12, r9, r10)
        L_0x0031:
            androidx.compose.material3.SheetValue r2 = androidx.compose.material3.SheetValue.Hidden
            r9 = r12 & 14
            r9 = r9 | 384(0x180, float:5.38E-43)
            r10 = r12 & 112(0x70, float:1.57E-43)
            r7 = r9 | r10
            r8 = 56
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = r11
            androidx.compose.material3.SheetState r9 = androidx.compose.material3.SheetDefaultsKt.k(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            boolean r10 = androidx.compose.runtime.ComposerKt.P()
            if (r10 == 0) goto L_0x004e
            androidx.compose.runtime.ComposerKt.X()
        L_0x004e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ModalBottomSheetKt.T(boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):androidx.compose.material3.SheetState");
    }

    public static final boolean U(SheetValue sheetValue) {
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v0, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v0, resolved type: kotlin.jvm.functions.Function1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: kotlin.jvm.functions.Function0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v16, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v55, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v56, resolved type: int} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0174  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x034e  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x0367  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x0369  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x0374  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x0376  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x0385  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x0388  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x03aa  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x03ac  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x03b2  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x03b4  */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x03d8  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x03e6  */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x03f8  */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x03fa  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x0408  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x040a  */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x0479  */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x04b3  */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x04c2  */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x04d8  */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x04f9  */
    /* JADX WARNING: Removed duplicated region for block: B:325:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0111  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void s(kotlin.jvm.functions.Function0 r47, androidx.compose.ui.Modifier r48, androidx.compose.material3.SheetState r49, float r50, boolean r51, androidx.compose.ui.graphics.Shape r52, long r53, long r55, float r57, long r58, kotlin.jvm.functions.Function2 r60, kotlin.jvm.functions.Function2 r61, androidx.compose.material3.ModalBottomSheetProperties r62, kotlin.jvm.functions.Function3 r63, androidx.compose.runtime.Composer r64, int r65, int r66, int r67) {
        /*
            r1 = r47
            r15 = r65
            r14 = r66
            r12 = r67
            r0 = 1904798512(0x7188eb30, float:1.3559771E30)
            r2 = r64
            androidx.compose.runtime.Composer r2 = r2.q(r0)
            r3 = r12 & 1
            if (r3 == 0) goto L_0x0018
            r3 = r15 | 6
            goto L_0x0028
        L_0x0018:
            r3 = r15 & 6
            if (r3 != 0) goto L_0x0027
            boolean r3 = r2.l(r1)
            if (r3 == 0) goto L_0x0024
            r3 = 4
            goto L_0x0025
        L_0x0024:
            r3 = 2
        L_0x0025:
            r3 = r3 | r15
            goto L_0x0028
        L_0x0027:
            r3 = r15
        L_0x0028:
            r6 = r12 & 2
            if (r6 == 0) goto L_0x0031
            r3 = r3 | 48
        L_0x002e:
            r9 = r48
            goto L_0x0043
        L_0x0031:
            r9 = r15 & 48
            if (r9 != 0) goto L_0x002e
            r9 = r48
            boolean r10 = r2.W(r9)
            if (r10 == 0) goto L_0x0040
            r10 = 32
            goto L_0x0042
        L_0x0040:
            r10 = 16
        L_0x0042:
            r3 = r3 | r10
        L_0x0043:
            r10 = r15 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L_0x005d
            r10 = r12 & 4
            if (r10 != 0) goto L_0x0056
            r10 = r49
            boolean r16 = r2.W(r10)
            if (r16 == 0) goto L_0x0058
            r16 = 256(0x100, float:3.59E-43)
            goto L_0x005a
        L_0x0056:
            r10 = r49
        L_0x0058:
            r16 = 128(0x80, float:1.794E-43)
        L_0x005a:
            r3 = r3 | r16
            goto L_0x005f
        L_0x005d:
            r10 = r49
        L_0x005f:
            r16 = r12 & 8
            r17 = 1024(0x400, float:1.435E-42)
            r18 = 2048(0x800, float:2.87E-42)
            if (r16 == 0) goto L_0x006c
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0069:
            r7 = r50
            goto L_0x007f
        L_0x006c:
            r7 = r15 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x0069
            r7 = r50
            boolean r19 = r2.h(r7)
            if (r19 == 0) goto L_0x007b
            r19 = r18
            goto L_0x007d
        L_0x007b:
            r19 = r17
        L_0x007d:
            r3 = r3 | r19
        L_0x007f:
            r19 = r12 & 16
            if (r19 == 0) goto L_0x0088
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0085:
            r8 = r51
            goto L_0x009b
        L_0x0088:
            r8 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r8 != 0) goto L_0x0085
            r8 = r51
            boolean r21 = r2.d(r8)
            if (r21 == 0) goto L_0x0097
            r21 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0099
        L_0x0097:
            r21 = 8192(0x2000, float:1.14794E-41)
        L_0x0099:
            r3 = r3 | r21
        L_0x009b:
            r21 = 196608(0x30000, float:2.75506E-40)
            r21 = r15 & r21
            if (r21 != 0) goto L_0x00b5
            r21 = r12 & 32
            r11 = r52
            if (r21 != 0) goto L_0x00b0
            boolean r22 = r2.W(r11)
            if (r22 == 0) goto L_0x00b0
            r22 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b2
        L_0x00b0:
            r22 = 65536(0x10000, float:9.18355E-41)
        L_0x00b2:
            r3 = r3 | r22
            goto L_0x00b7
        L_0x00b5:
            r11 = r52
        L_0x00b7:
            r22 = 1572864(0x180000, float:2.204052E-39)
            r22 = r15 & r22
            if (r22 != 0) goto L_0x00d1
            r22 = r12 & 64
            r4 = r53
            if (r22 != 0) goto L_0x00cc
            boolean r23 = r2.j(r4)
            if (r23 == 0) goto L_0x00cc
            r23 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00ce
        L_0x00cc:
            r23 = 524288(0x80000, float:7.34684E-40)
        L_0x00ce:
            r3 = r3 | r23
            goto L_0x00d3
        L_0x00d1:
            r4 = r53
        L_0x00d3:
            r23 = 12582912(0xc00000, float:1.7632415E-38)
            r23 = r15 & r23
            if (r23 != 0) goto L_0x00ed
            r13 = r12 & 128(0x80, float:1.794E-43)
            r0 = r55
            if (r13 != 0) goto L_0x00e8
            boolean r24 = r2.j(r0)
            if (r24 == 0) goto L_0x00e8
            r24 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00ea
        L_0x00e8:
            r24 = 4194304(0x400000, float:5.877472E-39)
        L_0x00ea:
            r3 = r3 | r24
            goto L_0x00ef
        L_0x00ed:
            r0 = r55
        L_0x00ef:
            r13 = r12 & 256(0x100, float:3.59E-43)
            r25 = 100663296(0x6000000, float:2.4074124E-35)
            if (r13 == 0) goto L_0x00fa
            r3 = r3 | r25
            r0 = r57
            goto L_0x010c
        L_0x00fa:
            r25 = r15 & r25
            r0 = r57
            if (r25 != 0) goto L_0x010c
            boolean r1 = r2.h(r0)
            if (r1 == 0) goto L_0x0109
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x010b
        L_0x0109:
            r1 = 33554432(0x2000000, float:9.403955E-38)
        L_0x010b:
            r3 = r3 | r1
        L_0x010c:
            r1 = 805306368(0x30000000, float:4.656613E-10)
            r1 = r1 & r15
            if (r1 != 0) goto L_0x0127
            r1 = r12 & 512(0x200, float:7.175E-43)
            if (r1 != 0) goto L_0x0120
            r0 = r58
            boolean r25 = r2.j(r0)
            if (r25 == 0) goto L_0x0122
            r25 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0124
        L_0x0120:
            r0 = r58
        L_0x0122:
            r25 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0124:
            r3 = r3 | r25
            goto L_0x0129
        L_0x0127:
            r0 = r58
        L_0x0129:
            r0 = r12 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0134
            r1 = r14 | 6
            r25 = r1
            r1 = r60
            goto L_0x014c
        L_0x0134:
            r1 = r14 & 6
            if (r1 != 0) goto L_0x0148
            r1 = r60
            boolean r25 = r2.l(r1)
            if (r25 == 0) goto L_0x0143
            r25 = 4
            goto L_0x0145
        L_0x0143:
            r25 = 2
        L_0x0145:
            r25 = r14 | r25
            goto L_0x014c
        L_0x0148:
            r1 = r60
            r25 = r14
        L_0x014c:
            r26 = r14 & 48
            if (r26 != 0) goto L_0x0168
            r1 = r12 & 2048(0x800, float:2.87E-42)
            if (r1 != 0) goto L_0x015f
            r1 = r61
            boolean r26 = r2.l(r1)
            if (r26 == 0) goto L_0x0161
            r20 = 32
            goto L_0x0163
        L_0x015f:
            r1 = r61
        L_0x0161:
            r20 = 16
        L_0x0163:
            r25 = r25 | r20
        L_0x0165:
            r1 = r25
            goto L_0x016b
        L_0x0168:
            r1 = r61
            goto L_0x0165
        L_0x016b:
            r4 = r12 & 4096(0x1000, float:5.74E-42)
            if (r4 == 0) goto L_0x0174
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x0171:
            r5 = r62
            goto L_0x0187
        L_0x0174:
            r5 = r14 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x0171
            r5 = r62
            boolean r20 = r2.W(r5)
            if (r20 == 0) goto L_0x0183
            r21 = 256(0x100, float:3.59E-43)
            goto L_0x0185
        L_0x0183:
            r21 = 128(0x80, float:1.794E-43)
        L_0x0185:
            r1 = r1 | r21
        L_0x0187:
            r5 = r12 & 8192(0x2000, float:1.14794E-41)
            if (r5 == 0) goto L_0x0190
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x018d:
            r5 = r63
            goto L_0x01a0
        L_0x0190:
            r5 = r14 & 3072(0xc00, float:4.305E-42)
            if (r5 != 0) goto L_0x018d
            r5 = r63
            boolean r20 = r2.l(r5)
            if (r20 == 0) goto L_0x019e
            r17 = r18
        L_0x019e:
            r1 = r1 | r17
        L_0x01a0:
            r17 = 306783379(0x12492493, float:6.34695E-28)
            r5 = r3 & r17
            r7 = 306783378(0x12492492, float:6.3469493E-28)
            if (r5 != r7) goto L_0x01b3
            r5 = r1 & 1171(0x493, float:1.641E-42)
            r7 = 1170(0x492, float:1.64E-42)
            if (r5 == r7) goto L_0x01b1
            goto L_0x01b3
        L_0x01b1:
            r5 = 0
            goto L_0x01b4
        L_0x01b3:
            r5 = 1
        L_0x01b4:
            r7 = r3 & 1
            boolean r5 = r2.E(r5, r7)
            if (r5 == 0) goto L_0x04d8
            r2.p()
            r5 = r15 & 1
            r7 = 0
            r8 = 6
            if (r5 == 0) goto L_0x0214
            boolean r5 = r2.J()
            if (r5 == 0) goto L_0x01cc
            goto L_0x0214
        L_0x01cc:
            r2.B()
            r0 = r12 & 4
            if (r0 == 0) goto L_0x01d5
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x01d5:
            r0 = r12 & 32
            if (r0 == 0) goto L_0x01dd
            r0 = -458753(0xfffffffffff8ffff, float:NaN)
            r3 = r3 & r0
        L_0x01dd:
            r0 = r12 & 64
            if (r0 == 0) goto L_0x01e5
            r0 = -3670017(0xffffffffffc7ffff, float:NaN)
            r3 = r3 & r0
        L_0x01e5:
            r0 = r12 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x01ed
            r0 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r3 = r3 & r0
        L_0x01ed:
            r0 = r12 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x01f5
            r0 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r3 = r3 & r0
        L_0x01f5:
            r0 = r12 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x01fb
            r1 = r1 & -113(0xffffffffffffff8f, float:NaN)
        L_0x01fb:
            r0 = r50
            r18 = r55
            r13 = r57
            r5 = r61
            r21 = r62
            r7 = r1
            r12 = r3
            r20 = r9
            r6 = r10
            r10 = r51
            r8 = r53
            r3 = r58
            r1 = r60
            goto L_0x02d2
        L_0x0214:
            if (r6 == 0) goto L_0x0219
            androidx.compose.ui.Modifier$Companion r5 = androidx.compose.ui.Modifier.f15489d
            goto L_0x021a
        L_0x0219:
            r5 = r9
        L_0x021a:
            r6 = r12 & 4
            if (r6 == 0) goto L_0x0227
            r6 = 3
            r9 = 0
            androidx.compose.material3.SheetState r6 = T(r9, r7, r2, r9, r6)
            r3 = r3 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x0228
        L_0x0227:
            r6 = r10
        L_0x0228:
            if (r16 == 0) goto L_0x0231
            androidx.compose.material3.BottomSheetDefaults r9 = androidx.compose.material3.BottomSheetDefaults.f9266a
            float r9 = r9.k()
            goto L_0x0233
        L_0x0231:
            r9 = r50
        L_0x0233:
            if (r19 == 0) goto L_0x0237
            r10 = 1
            goto L_0x0239
        L_0x0237:
            r10 = r51
        L_0x0239:
            r16 = r12 & 32
            if (r16 == 0) goto L_0x0248
            androidx.compose.material3.BottomSheetDefaults r11 = androidx.compose.material3.BottomSheetDefaults.f9266a
            androidx.compose.ui.graphics.Shape r11 = r11.h(r2, r8)
            r16 = -458753(0xfffffffffff8ffff, float:NaN)
            r3 = r3 & r16
        L_0x0248:
            r16 = r12 & 64
            if (r16 == 0) goto L_0x025b
            androidx.compose.material3.BottomSheetDefaults r7 = androidx.compose.material3.BottomSheetDefaults.f9266a
            long r18 = r7.f(r2, r8)
            r7 = -3670017(0xffffffffffc7ffff, float:NaN)
            r3 = r3 & r7
            r48 = r9
            r8 = r18
            goto L_0x025f
        L_0x025b:
            r48 = r9
            r8 = r53
        L_0x025f:
            r7 = r12 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x0270
            int r7 = r3 >> 18
            r7 = r7 & 14
            long r18 = androidx.compose.material3.ColorSchemeKt.g(r8, r2, r7)
            r7 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r3 = r3 & r7
            goto L_0x0272
        L_0x0270:
            r18 = r55
        L_0x0272:
            if (r13 == 0) goto L_0x027c
            r7 = 0
            float r13 = (float) r7
            float r7 = androidx.compose.ui.unit.Dp.m(r13)
            r13 = r7
            goto L_0x027e
        L_0x027c:
            r13 = r57
        L_0x027e:
            r7 = r12 & 512(0x200, float:7.175E-43)
            if (r7 == 0) goto L_0x0290
            androidx.compose.material3.BottomSheetDefaults r7 = androidx.compose.material3.BottomSheetDefaults.f9266a
            r20 = r5
            r5 = 6
            long r25 = r7.j(r2, r5)
            r5 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r3 = r3 & r5
            goto L_0x0294
        L_0x0290:
            r20 = r5
            r25 = r58
        L_0x0294:
            if (r0 == 0) goto L_0x029d
            androidx.compose.material3.ComposableSingletons$ModalBottomSheetKt r0 = androidx.compose.material3.ComposableSingletons$ModalBottomSheetKt.f9556a
            kotlin.jvm.functions.Function2 r0 = r0.a()
            goto L_0x029f
        L_0x029d:
            r0 = r60
        L_0x029f:
            r5 = r12 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x02a8
            androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$1 r5 = androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$1.f10320z
            r1 = r1 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x02aa
        L_0x02a8:
            r5 = r61
        L_0x02aa:
            if (r4 == 0) goto L_0x02c4
            androidx.compose.material3.ModalBottomSheetProperties r4 = new androidx.compose.material3.ModalBottomSheetProperties
            r7 = 3
            r50 = r0
            r51 = r1
            r0 = 0
            r1 = 0
            r4.<init>(r0, r0, r7, r1)
            r0 = r48
            r1 = r50
            r7 = r51
            r12 = r3
            r21 = r4
        L_0x02c1:
            r3 = r25
            goto L_0x02d2
        L_0x02c4:
            r50 = r0
            r51 = r1
            r0 = r48
            r1 = r50
            r7 = r51
            r21 = r62
            r12 = r3
            goto L_0x02c1
        L_0x02d2:
            r2.U()
            boolean r25 = androidx.compose.runtime.ComposerKt.P()
            if (r25 == 0) goto L_0x02e3
            java.lang.String r14 = "androidx.compose.material3.ModalBottomSheet (ModalBottomSheet.kt:137)"
            r15 = 1904798512(0x7188eb30, float:1.3559771E30)
            androidx.compose.runtime.ComposerKt.Y(r15, r12, r7, r14)
        L_0x02e3:
            androidx.compose.material3.tokens.MotionSchemeKeyTokens r14 = androidx.compose.material3.tokens.MotionSchemeKeyTokens.DefaultSpatial
            r24 = r7
            r15 = 6
            androidx.compose.animation.core.FiniteAnimationSpec r7 = androidx.compose.material3.MotionSchemeKt.b(r14, r2, r15)
            androidx.compose.animation.core.FiniteAnimationSpec r14 = androidx.compose.material3.MotionSchemeKt.b(r14, r2, r15)
            r56 = r5
            androidx.compose.material3.tokens.MotionSchemeKeyTokens r5 = androidx.compose.material3.tokens.MotionSchemeKeyTokens.FastEffects
            androidx.compose.animation.core.FiniteAnimationSpec r5 = androidx.compose.material3.MotionSchemeKt.b(r5, r2, r15)
            r15 = r24
            r15 = r12 & 896(0x380, float:1.256E-42)
            r15 = r15 ^ 384(0x180, float:5.38E-43)
            r58 = r1
            r1 = 256(0x100, float:3.59E-43)
            if (r15 <= r1) goto L_0x030e
            boolean r23 = r2.W(r6)
            if (r23 != 0) goto L_0x030b
            goto L_0x030e
        L_0x030b:
            r59 = r13
            goto L_0x0314
        L_0x030e:
            r59 = r13
            r13 = r12 & 384(0x180, float:5.38E-43)
            if (r13 != r1) goto L_0x0316
        L_0x0314:
            r1 = 1
            goto L_0x0317
        L_0x0316:
            r1 = 0
        L_0x0317:
            boolean r13 = r2.l(r14)
            r1 = r1 | r13
            boolean r13 = r2.l(r5)
            r1 = r1 | r13
            boolean r13 = r2.l(r7)
            r1 = r1 | r13
            java.lang.Object r13 = r2.g()
            if (r1 != 0) goto L_0x0334
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
            if (r13 != r1) goto L_0x033c
        L_0x0334:
            androidx.compose.material3.w3 r13 = new androidx.compose.material3.w3
            r13.<init>(r6, r14, r5, r7)
            r2.N(r13)
        L_0x033c:
            kotlin.jvm.functions.Function0 r13 = (kotlin.jvm.functions.Function0) r13
            r1 = 0
            androidx.compose.runtime.EffectsKt.h(r13, r2, r1)
            java.lang.Object r5 = r2.g()
            androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r13 = r7.a()
            if (r5 != r13) goto L_0x0357
            kotlin.coroutines.EmptyCoroutineContext r5 = kotlin.coroutines.EmptyCoroutineContext.f40721z
            kotlinx.coroutines.CoroutineScope r5 = androidx.compose.runtime.EffectsKt.j(r5, r2)
            r2.N(r5)
        L_0x0357:
            kotlinx.coroutines.CoroutineScope r5 = (kotlinx.coroutines.CoroutineScope) r5
            r13 = 256(0x100, float:3.59E-43)
            if (r15 <= r13) goto L_0x0363
            boolean r14 = r2.W(r6)
            if (r14 != 0) goto L_0x0367
        L_0x0363:
            r14 = r12 & 384(0x180, float:5.38E-43)
            if (r14 != r13) goto L_0x0369
        L_0x0367:
            r13 = 1
            goto L_0x036a
        L_0x0369:
            r13 = r1
        L_0x036a:
            boolean r14 = r2.l(r5)
            r13 = r13 | r14
            r14 = r12 & 14
            r1 = 4
            if (r14 != r1) goto L_0x0376
            r1 = 1
            goto L_0x0377
        L_0x0376:
            r1 = 0
        L_0x0377:
            r1 = r1 | r13
            java.lang.Object r13 = r2.g()
            if (r1 != 0) goto L_0x0388
            java.lang.Object r1 = r7.a()
            if (r13 != r1) goto L_0x0385
            goto L_0x0388
        L_0x0385:
            r1 = r47
            goto L_0x0392
        L_0x0388:
            androidx.compose.material3.x3 r13 = new androidx.compose.material3.x3
            r1 = r47
            r13.<init>(r6, r5, r1)
            r2.N(r13)
        L_0x0392:
            r28 = r13
            kotlin.jvm.functions.Function0 r28 = (kotlin.jvm.functions.Function0) r28
            boolean r13 = r2.l(r5)
            r60 = r8
            r8 = 256(0x100, float:3.59E-43)
            if (r15 <= r8) goto L_0x03a6
            boolean r9 = r2.W(r6)
            if (r9 != 0) goto L_0x03aa
        L_0x03a6:
            r9 = r12 & 384(0x180, float:5.38E-43)
            if (r9 != r8) goto L_0x03ac
        L_0x03aa:
            r9 = 1
            goto L_0x03ad
        L_0x03ac:
            r9 = 0
        L_0x03ad:
            r8 = r13 | r9
            r9 = 4
            if (r14 != r9) goto L_0x03b4
            r9 = 1
            goto L_0x03b5
        L_0x03b4:
            r9 = 0
        L_0x03b5:
            r8 = r8 | r9
            java.lang.Object r9 = r2.g()
            if (r8 != 0) goto L_0x03c2
            java.lang.Object r8 = r7.a()
            if (r9 != r8) goto L_0x03ca
        L_0x03c2:
            androidx.compose.material3.y3 r9 = new androidx.compose.material3.y3
            r9.<init>(r5, r6, r1)
            r2.N(r9)
        L_0x03ca:
            r33 = r9
            kotlin.jvm.functions.Function1 r33 = (kotlin.jvm.functions.Function1) r33
            java.lang.Object r8 = r2.g()
            java.lang.Object r9 = r7.a()
            if (r8 != r9) goto L_0x03e6
            r8 = 0
            r9 = 0
            r62 = r11
            r11 = 0
            r13 = 2
            androidx.compose.animation.core.Animatable r8 = androidx.compose.animation.core.AnimatableKt.b(r8, r9, r13, r11)
            r2.N(r8)
            goto L_0x03e8
        L_0x03e6:
            r62 = r11
        L_0x03e8:
            androidx.compose.animation.core.Animatable r8 = (androidx.compose.animation.core.Animatable) r8
            r9 = 256(0x100, float:3.59E-43)
            if (r15 <= r9) goto L_0x03f4
            boolean r11 = r2.W(r6)
            if (r11 != 0) goto L_0x03f8
        L_0x03f4:
            r11 = r12 & 384(0x180, float:5.38E-43)
            if (r11 != r9) goto L_0x03fa
        L_0x03f8:
            r9 = 1
            goto L_0x03fb
        L_0x03fa:
            r9 = 0
        L_0x03fb:
            boolean r11 = r2.l(r5)
            r9 = r9 | r11
            boolean r11 = r2.l(r8)
            r9 = r9 | r11
            r11 = 4
            if (r14 != r11) goto L_0x040a
            r11 = 1
            goto L_0x040b
        L_0x040a:
            r11 = 0
        L_0x040b:
            r9 = r9 | r11
            java.lang.Object r11 = r2.g()
            if (r9 != 0) goto L_0x0418
            java.lang.Object r9 = r7.a()
            if (r11 != r9) goto L_0x0420
        L_0x0418:
            androidx.compose.material3.z3 r11 = new androidx.compose.material3.z3
            r11.<init>(r6, r5, r8, r1)
            r2.N(r11)
        L_0x0420:
            r9 = r11
            kotlin.jvm.functions.Function0 r9 = (kotlin.jvm.functions.Function0) r9
            androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$4 r11 = new androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$4
            r25 = r11
            r26 = r3
            r29 = r6
            r30 = r21
            r31 = r8
            r32 = r5
            r34 = r20
            r35 = r0
            r36 = r10
            r37 = r62
            r38 = r60
            r40 = r18
            r42 = r59
            r43 = r58
            r44 = r56
            r45 = r63
            r25.<init>(r26, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r40, r42, r43, r44, r45)
            r5 = 54
            r13 = 1010026864(0x3c33c970, float:0.010973319)
            r14 = 1
            androidx.compose.runtime.internal.ComposableLambda r5 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r13, r14, r11, r2, r5)
            int r11 = r12 >> 18
            r11 = r11 & 112(0x70, float:1.57E-43)
            r11 = r11 | 24576(0x6000, float:3.4438E-41)
            r13 = r24
            r13 = r13 & 896(0x380, float:1.256E-42)
            r11 = r11 | r13
            int r13 = androidx.compose.animation.core.Animatable.f2421m
            int r13 = r13 << 9
            r11 = r11 | r13
            r48 = r9
            r49 = r18
            r51 = r21
            r52 = r8
            r53 = r5
            r54 = r2
            r55 = r11
            androidx.compose.material3.ModalBottomSheet_androidKt.e(r48, r49, r51, r52, r53, r54, r55)
            boolean r5 = r6.l()
            if (r5 == 0) goto L_0x04b3
            r5 = 748459762(0x2c9c96f2, float:4.450545E-12)
            r2.X(r5)
            r5 = 256(0x100, float:3.59E-43)
            if (r15 <= r5) goto L_0x0489
            boolean r8 = r2.W(r6)
            if (r8 != 0) goto L_0x048d
        L_0x0489:
            r8 = r12 & 384(0x180, float:5.38E-43)
            if (r8 != r5) goto L_0x048f
        L_0x048d:
            r8 = r14
            goto L_0x0490
        L_0x048f:
            r8 = 0
        L_0x0490:
            java.lang.Object r5 = r2.g()
            if (r8 != 0) goto L_0x049c
            java.lang.Object r7 = r7.a()
            if (r5 != r7) goto L_0x04a5
        L_0x049c:
            androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$5$1 r5 = new androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$5$1
            r7 = 0
            r5.<init>(r6, r7)
            r2.N(r5)
        L_0x04a5:
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
            r7 = 6
            int r7 = r12 >> 6
            r7 = r7 & 14
            androidx.compose.runtime.EffectsKt.g(r6, r5, r2, r7)
            r2.M()
            goto L_0x04bc
        L_0x04b3:
            r5 = 748521266(0x2c9d8732, float:4.477218E-12)
            r2.X(r5)
            r2.M()
        L_0x04bc:
            boolean r5 = androidx.compose.runtime.ComposerKt.P()
            if (r5 == 0) goto L_0x04c5
            androidx.compose.runtime.ComposerKt.X()
        L_0x04c5:
            r15 = r56
            r14 = r58
            r11 = r59
            r7 = r60
            r12 = r3
            r3 = r6
            r5 = r10
            r9 = r18
            r16 = r21
            r6 = r62
            r4 = r0
            goto L_0x04f3
        L_0x04d8:
            r1 = r47
            r2.B()
            r4 = r50
            r5 = r51
            r7 = r53
            r12 = r58
            r14 = r60
            r15 = r61
            r16 = r62
            r20 = r9
            r3 = r10
            r6 = r11
            r9 = r55
            r11 = r57
        L_0x04f3:
            androidx.compose.runtime.ScopeUpdateScope r2 = r2.x()
            if (r2 == 0) goto L_0x0515
            androidx.compose.material3.A3 r0 = new androidx.compose.material3.A3
            r48 = r0
            r1 = r47
            r46 = r2
            r2 = r20
            r17 = r63
            r18 = r65
            r19 = r66
            r20 = r67
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r11, r12, r14, r15, r16, r17, r18, r19, r20)
            r1 = r48
            r0 = r46
            r0.a(r1)
        L_0x0515:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ModalBottomSheetKt.s(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.material3.SheetState, float, boolean, androidx.compose.ui.graphics.Shape, long, long, float, long, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.material3.ModalBottomSheetProperties, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r43v0, resolved type: kotlin.jvm.functions.Function3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v37, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v38, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v4, resolved type: androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v43, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v44, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v45, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v19, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v56, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v27, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v35, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v17, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v19, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v20, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v23, resolved type: int} */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0152, code lost:
        if (r6.j(r59) != false) goto L_0x0159;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0216  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x03f3  */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x03f6  */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x0408  */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x040a  */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x048c  */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x048e  */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x04a0  */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x04a2  */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x0515  */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x0528  */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x0545  */
    /* JADX WARNING: Removed duplicated region for block: B:327:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x012b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void t(androidx.compose.foundation.layout.BoxScope r49, androidx.compose.animation.core.Animatable r50, kotlinx.coroutines.CoroutineScope r51, kotlin.jvm.functions.Function0 r52, kotlin.jvm.functions.Function1 r53, androidx.compose.ui.Modifier r54, androidx.compose.material3.SheetState r55, float r56, boolean r57, androidx.compose.ui.graphics.Shape r58, long r59, long r61, float r63, kotlin.jvm.functions.Function2 r64, kotlin.jvm.functions.Function2 r65, kotlin.jvm.functions.Function3 r66, androidx.compose.runtime.Composer r67, int r68, int r69, int r70) {
        /*
            r1 = r49
            r2 = r50
            r5 = r53
            r15 = r68
            r13 = r69
            r14 = r70
            r7 = 128(0x80, float:1.794E-43)
            r8 = 16
            r9 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = 32
            r3 = 1
            r4 = 6
            r10 = -37400432(0xfffffffffdc55090, float:-3.2784527E37)
            r6 = r67
            androidx.compose.runtime.Composer r6 = r6.q(r10)
            r21 = -2147483648(0xffffffff80000000, float:-0.0)
            r21 = r14 & r21
            r22 = 4
            r10 = 2
            if (r21 == 0) goto L_0x002b
            r21 = r15 | 6
            goto L_0x003f
        L_0x002b:
            r21 = r15 & 6
            if (r21 != 0) goto L_0x003d
            boolean r21 = r6.W(r1)
            if (r21 == 0) goto L_0x0038
            r21 = r22
            goto L_0x003a
        L_0x0038:
            r21 = r10
        L_0x003a:
            r21 = r15 | r21
            goto L_0x003f
        L_0x003d:
            r21 = r15
        L_0x003f:
            r24 = r14 & 1
            if (r24 == 0) goto L_0x0048
            r21 = r21 | 48
        L_0x0045:
            r3 = r21
            goto L_0x0063
        L_0x0048:
            r24 = r15 & 48
            if (r24 != 0) goto L_0x0045
            r24 = r15 & 64
            if (r24 != 0) goto L_0x0055
            boolean r24 = r6.W(r2)
            goto L_0x0059
        L_0x0055:
            boolean r24 = r6.l(r2)
        L_0x0059:
            if (r24 == 0) goto L_0x005e
            r24 = r0
            goto L_0x0060
        L_0x005e:
            r24 = r8
        L_0x0060:
            r21 = r21 | r24
            goto L_0x0045
        L_0x0063:
            r21 = r14 & 2
            if (r21 == 0) goto L_0x006c
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x0069:
            r10 = r51
            goto L_0x007f
        L_0x006c:
            r10 = r15 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L_0x0069
            r10 = r51
            boolean r21 = r6.l(r10)
            if (r21 == 0) goto L_0x007b
            r21 = 256(0x100, float:3.59E-43)
            goto L_0x007d
        L_0x007b:
            r21 = r7
        L_0x007d:
            r3 = r3 | r21
        L_0x007f:
            r21 = r14 & 4
            if (r21 == 0) goto L_0x0088
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x0085:
            r11 = r52
            goto L_0x009b
        L_0x0088:
            r11 = r15 & 3072(0xc00, float:4.305E-42)
            if (r11 != 0) goto L_0x0085
            r11 = r52
            boolean r25 = r6.l(r11)
            if (r25 == 0) goto L_0x0097
            r25 = 2048(0x800, float:2.87E-42)
            goto L_0x0099
        L_0x0097:
            r25 = 1024(0x400, float:1.435E-42)
        L_0x0099:
            r3 = r3 | r25
        L_0x009b:
            r25 = r14 & 8
            if (r25 == 0) goto L_0x00a2
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00b2
        L_0x00a2:
            r4 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r4 != 0) goto L_0x00b2
            boolean r4 = r6.l(r5)
            if (r4 == 0) goto L_0x00af
            r4 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00b1
        L_0x00af:
            r4 = 8192(0x2000, float:1.14794E-41)
        L_0x00b1:
            r3 = r3 | r4
        L_0x00b2:
            r4 = r14 & 16
            r26 = 196608(0x30000, float:2.75506E-40)
            if (r4 == 0) goto L_0x00bd
            r3 = r3 | r26
            r8 = r54
            goto L_0x00d0
        L_0x00bd:
            r27 = r15 & r26
            r8 = r54
            if (r27 != 0) goto L_0x00d0
            boolean r28 = r6.W(r8)
            if (r28 == 0) goto L_0x00cc
            r28 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ce
        L_0x00cc:
            r28 = 65536(0x10000, float:9.18355E-41)
        L_0x00ce:
            r3 = r3 | r28
        L_0x00d0:
            r28 = 1572864(0x180000, float:2.204052E-39)
            r29 = r15 & r28
            if (r29 != 0) goto L_0x00ea
            r29 = r14 & 32
            r12 = r55
            if (r29 != 0) goto L_0x00e5
            boolean r31 = r6.W(r12)
            if (r31 == 0) goto L_0x00e5
            r31 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e7
        L_0x00e5:
            r31 = 524288(0x80000, float:7.34684E-40)
        L_0x00e7:
            r3 = r3 | r31
            goto L_0x00ec
        L_0x00ea:
            r12 = r55
        L_0x00ec:
            r31 = r14 & 64
            if (r31 == 0) goto L_0x00f4
            r3 = r3 | r9
            r9 = r56
            goto L_0x0107
        L_0x00f4:
            r32 = r15 & r9
            r9 = r56
            if (r32 != 0) goto L_0x0107
            boolean r33 = r6.h(r9)
            if (r33 == 0) goto L_0x0103
            r33 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0105
        L_0x0103:
            r33 = 4194304(0x400000, float:5.877472E-39)
        L_0x0105:
            r3 = r3 | r33
        L_0x0107:
            r0 = r14 & 128(0x80, float:1.794E-43)
            r34 = 100663296(0x6000000, float:2.4074124E-35)
            if (r0 == 0) goto L_0x0112
            r3 = r3 | r34
            r7 = r57
            goto L_0x0125
        L_0x0112:
            r34 = r15 & r34
            r7 = r57
            if (r34 != 0) goto L_0x0125
            boolean r35 = r6.d(r7)
            if (r35 == 0) goto L_0x0121
            r35 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0123
        L_0x0121:
            r35 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0123:
            r3 = r3 | r35
        L_0x0125:
            r35 = 805306368(0x30000000, float:4.656613E-10)
            r35 = r15 & r35
            if (r35 != 0) goto L_0x0141
            r7 = 256(0x100, float:3.59E-43)
            r8 = r14 & 256(0x100, float:3.59E-43)
            r7 = r58
            if (r8 != 0) goto L_0x013c
            boolean r8 = r6.W(r7)
            if (r8 == 0) goto L_0x013c
            r8 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x013e
        L_0x013c:
            r8 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x013e:
            r3 = r3 | r8
        L_0x013f:
            r8 = 6
            goto L_0x0144
        L_0x0141:
            r7 = r58
            goto L_0x013f
        L_0x0144:
            r35 = r13 & 6
            if (r35 != 0) goto L_0x015c
            r8 = r14 & 512(0x200, float:7.175E-43)
            if (r8 != 0) goto L_0x0155
            r7 = r59
            boolean r35 = r6.j(r7)
            if (r35 == 0) goto L_0x0157
            goto L_0x0159
        L_0x0155:
            r7 = r59
        L_0x0157:
            r22 = 2
        L_0x0159:
            r22 = r13 | r22
            goto L_0x0160
        L_0x015c:
            r7 = r59
            r22 = r13
        L_0x0160:
            r35 = r13 & 48
            if (r35 != 0) goto L_0x0180
            r7 = 1024(0x400, float:1.435E-42)
            r8 = r14 & 1024(0x400, float:1.435E-42)
            if (r8 != 0) goto L_0x0175
            r7 = r61
            boolean r35 = r6.j(r7)
            if (r35 == 0) goto L_0x0177
            r27 = 32
            goto L_0x0179
        L_0x0175:
            r7 = r61
        L_0x0177:
            r27 = 16
        L_0x0179:
            r22 = r22 | r27
        L_0x017b:
            r7 = r22
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0183
        L_0x0180:
            r7 = r61
            goto L_0x017b
        L_0x0183:
            r9 = r14 & 2048(0x800, float:2.87E-42)
            if (r9 == 0) goto L_0x018c
            r7 = r7 | 384(0x180, float:5.38E-43)
        L_0x0189:
            r8 = r63
            goto L_0x019f
        L_0x018c:
            r8 = r13 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x0189
            r8 = r63
            boolean r22 = r6.h(r8)
            if (r22 == 0) goto L_0x019b
            r34 = 256(0x100, float:3.59E-43)
            goto L_0x019d
        L_0x019b:
            r34 = 128(0x80, float:1.794E-43)
        L_0x019d:
            r7 = r7 | r34
        L_0x019f:
            r8 = r14 & 4096(0x1000, float:5.74E-42)
            if (r8 == 0) goto L_0x01a6
            r7 = r7 | 3072(0xc00, float:4.305E-42)
            goto L_0x01bc
        L_0x01a6:
            r10 = r13 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x01ba
            r10 = r64
            boolean r22 = r6.l(r10)
            if (r22 == 0) goto L_0x01b5
            r20 = 2048(0x800, float:2.87E-42)
            goto L_0x01b7
        L_0x01b5:
            r20 = 1024(0x400, float:1.435E-42)
        L_0x01b7:
            r7 = r7 | r20
            goto L_0x01bc
        L_0x01ba:
            r10 = r64
        L_0x01bc:
            r10 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r10 != 0) goto L_0x01d7
            r10 = 8192(0x2000, float:1.14794E-41)
            r11 = r14 & 8192(0x2000, float:1.14794E-41)
            r10 = r65
            if (r11 != 0) goto L_0x01d1
            boolean r11 = r6.l(r10)
            if (r11 == 0) goto L_0x01d1
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x01d3
        L_0x01d1:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x01d3:
            r7 = r7 | r11
        L_0x01d4:
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x01da
        L_0x01d7:
            r10 = r65
            goto L_0x01d4
        L_0x01da:
            r10 = r14 & 16384(0x4000, float:2.2959E-41)
            if (r10 == 0) goto L_0x01e3
            r7 = r7 | r26
            r11 = r66
            goto L_0x01f6
        L_0x01e3:
            r10 = r13 & r26
            r11 = r66
            if (r10 != 0) goto L_0x01f6
            boolean r10 = r6.l(r11)
            if (r10 == 0) goto L_0x01f2
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L_0x01f4
        L_0x01f2:
            r16 = 65536(0x10000, float:9.18355E-41)
        L_0x01f4:
            r7 = r7 | r16
        L_0x01f6:
            r10 = 306783379(0x12492493, float:6.34695E-28)
            r10 = r10 & r3
            r11 = 306783378(0x12492492, float:6.3469493E-28)
            if (r10 != r11) goto L_0x020c
            r10 = 74899(0x12493, float:1.04956E-40)
            r10 = r10 & r7
            r11 = 74898(0x12492, float:1.04954E-40)
            if (r10 == r11) goto L_0x0209
            goto L_0x020c
        L_0x0209:
            r10 = 0
        L_0x020a:
            r11 = 1
            goto L_0x020e
        L_0x020c:
            r10 = 1
            goto L_0x020a
        L_0x020e:
            r12 = r3 & 1
            boolean r10 = r6.E(r10, r12)
            if (r10 == 0) goto L_0x0528
            r6.p()
            r10 = r15 & 1
            r11 = 0
            if (r10 == 0) goto L_0x0269
            boolean r10 = r6.J()
            if (r10 == 0) goto L_0x0225
            goto L_0x0269
        L_0x0225:
            r6.B()
            r0 = 32
            r4 = r14 & 32
            if (r4 == 0) goto L_0x0232
            r0 = -3670017(0xffffffffffc7ffff, float:NaN)
            r3 = r3 & r0
        L_0x0232:
            r0 = 256(0x100, float:3.59E-43)
            r0 = r0 & r14
            if (r0 == 0) goto L_0x023b
            r0 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r3 = r3 & r0
        L_0x023b:
            r0 = r14 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0241
            r7 = r7 & -15
        L_0x0241:
            r0 = 1024(0x400, float:1.435E-42)
            r0 = r0 & r14
            if (r0 == 0) goto L_0x0248
            r7 = r7 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0248:
            r0 = 8192(0x2000, float:1.14794E-41)
            r0 = r0 & r14
            if (r0 == 0) goto L_0x0251
            r0 = -57345(0xffffffffffff1fff, float:NaN)
            r7 = r7 & r0
        L_0x0251:
            r0 = r54
            r10 = r55
            r12 = r56
            r11 = r58
            r19 = r61
            r4 = r63
            r9 = r64
            r34 = r65
            r13 = r3
            r14 = r7
            r3 = r57
            r7 = r59
            goto L_0x0316
        L_0x0269:
            if (r4 == 0) goto L_0x0270
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.f15489d
        L_0x026d:
            r10 = 32
            goto L_0x0273
        L_0x0270:
            r4 = r54
            goto L_0x026d
        L_0x0273:
            r12 = r14 & 32
            if (r12 == 0) goto L_0x0282
            r10 = 3
            r12 = 0
            androidx.compose.material3.SheetState r10 = T(r12, r11, r6, r12, r10)
            r12 = -3670017(0xffffffffffc7ffff, float:NaN)
            r3 = r3 & r12
            goto L_0x0284
        L_0x0282:
            r10 = r55
        L_0x0284:
            if (r31 == 0) goto L_0x028d
            androidx.compose.material3.BottomSheetDefaults r12 = androidx.compose.material3.BottomSheetDefaults.f9266a
            float r12 = r12.k()
            goto L_0x028f
        L_0x028d:
            r12 = r56
        L_0x028f:
            if (r0 == 0) goto L_0x0295
            r0 = 1
        L_0x0292:
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x0298
        L_0x0295:
            r0 = r57
            goto L_0x0292
        L_0x0298:
            r11 = r11 & r14
            if (r11 == 0) goto L_0x02aa
            androidx.compose.material3.BottomSheetDefaults r11 = androidx.compose.material3.BottomSheetDefaults.f9266a
            r54 = r0
            r0 = 6
            androidx.compose.ui.graphics.Shape r11 = r11.h(r6, r0)
            r20 = -1879048193(0xffffffff8fffffff, float:-2.5243547E-29)
            r3 = r3 & r20
            goto L_0x02ae
        L_0x02aa:
            r54 = r0
            r11 = r58
        L_0x02ae:
            r0 = r14 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x02c4
            androidx.compose.material3.BottomSheetDefaults r0 = androidx.compose.material3.BottomSheetDefaults.f9266a
            r55 = r3
            r3 = 6
            long r26 = r0.f(r6, r3)
            r7 = r7 & -15
            r56 = r4
            r3 = r26
            r0 = 1024(0x400, float:1.435E-42)
            goto L_0x02cc
        L_0x02c4:
            r55 = r3
            r56 = r4
            r0 = 1024(0x400, float:1.435E-42)
            r3 = r59
        L_0x02cc:
            r0 = r0 & r14
            if (r0 == 0) goto L_0x02d9
            r0 = r7 & 14
            long r20 = androidx.compose.material3.ColorSchemeKt.g(r3, r6, r0)
            r0 = r7 & -113(0xffffffffffffff8f, float:NaN)
            r7 = r0
            goto L_0x02db
        L_0x02d9:
            r20 = r61
        L_0x02db:
            if (r9 == 0) goto L_0x02e4
            androidx.compose.material3.BottomSheetDefaults r0 = androidx.compose.material3.BottomSheetDefaults.f9266a
            float r0 = r0.g()
            goto L_0x02e6
        L_0x02e4:
            r0 = r63
        L_0x02e6:
            if (r8 == 0) goto L_0x02f1
            androidx.compose.material3.ComposableSingletons$ModalBottomSheetKt r8 = androidx.compose.material3.ComposableSingletons$ModalBottomSheetKt.f9556a
            kotlin.jvm.functions.Function2 r8 = r8.b()
        L_0x02ee:
            r9 = 8192(0x2000, float:1.14794E-41)
            goto L_0x02f4
        L_0x02f1:
            r8 = r64
            goto L_0x02ee
        L_0x02f4:
            r9 = r9 & r14
            if (r9 == 0) goto L_0x030d
            androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$1 r9 = androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$1.f10325z
            r19 = -57345(0xffffffffffff1fff, float:NaN)
            r7 = r7 & r19
            r13 = r55
            r14 = r7
            r34 = r9
            r19 = r20
            r9 = r8
        L_0x0306:
            r7 = r3
            r3 = r54
            r4 = r0
            r0 = r56
            goto L_0x0316
        L_0x030d:
            r13 = r55
            r34 = r65
            r14 = r7
            r9 = r8
            r19 = r20
            goto L_0x0306
        L_0x0316:
            r6.U()
            boolean r21 = androidx.compose.runtime.ComposerKt.P()
            if (r21 == 0) goto L_0x032a
            java.lang.String r15 = "androidx.compose.material3.ModalBottomSheetContent (ModalBottomSheet.kt:272)"
            r63 = r4
            r4 = -37400432(0xfffffffffdc55090, float:-3.2784527E37)
            androidx.compose.runtime.ComposerKt.Y(r4, r13, r14, r15)
            goto L_0x032c
        L_0x032a:
            r63 = r4
        L_0x032c:
            androidx.compose.material3.internal.Strings$Companion r4 = androidx.compose.material3.internal.Strings.f12320b
            int r4 = androidx.compose.material3.R.string.f10658e
            int r4 = androidx.compose.material3.internal.Strings.a(r4)
            r15 = 0
            java.lang.String r4 = androidx.compose.material3.internal.Strings_androidKt.b(r4, r6, r15)
            androidx.compose.ui.Alignment$Companion r15 = androidx.compose.ui.Alignment.f15444a
            androidx.compose.ui.Alignment r15 = r15.m()
            androidx.compose.ui.Modifier r15 = r1.g(r0, r15)
            r35 = r0
            r0 = 0
            r64 = r7
            r1 = 0
            r7 = 1
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.A(r15, r0, r12, r7, r1)
            r8 = 0
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.SizeKt.h(r0, r8, r7, r1)
            if (r3 == 0) goto L_0x0396
            r1 = -1582035383(0xffffffffa1b40e49, float:-1.2201056E-18)
            r6.X(r1)
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.f15489d
            r7 = 3670016(0x380000, float:5.142788E-39)
            r7 = r7 & r13
            r7 = r7 ^ r28
            r8 = 1048576(0x100000, float:1.469368E-39)
            if (r7 <= r8) goto L_0x036c
            boolean r7 = r6.W(r10)
            if (r7 != 0) goto L_0x0370
        L_0x036c:
            r7 = r13 & r28
            if (r7 != r8) goto L_0x0372
        L_0x0370:
            r7 = 1
            goto L_0x0373
        L_0x0372:
            r7 = 0
        L_0x0373:
            java.lang.Object r8 = r6.g()
            if (r7 != 0) goto L_0x0381
            androidx.compose.runtime.Composer$Companion r7 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r7 = r7.a()
            if (r8 != r7) goto L_0x038a
        L_0x0381:
            androidx.compose.foundation.gestures.Orientation r7 = androidx.compose.foundation.gestures.Orientation.Vertical
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r8 = androidx.compose.material3.SheetDefaultsKt.f(r10, r7, r5)
            r6.N(r8)
        L_0x038a:
            androidx.compose.ui.input.nestedscroll.NestedScrollConnection r8 = (androidx.compose.ui.input.nestedscroll.NestedScrollConnection) r8
            r7 = 2
            r15 = 0
            androidx.compose.ui.Modifier r1 = androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt.b(r1, r8, r15, r7, r15)
            r6.M()
            goto L_0x03a1
        L_0x0396:
            r1 = -1582020872(0xffffffffa1b446f8, float:-1.221606E-18)
            r6.X(r1)
            r6.M()
            androidx.compose.ui.Modifier$Companion r1 = androidx.compose.ui.Modifier.f15489d
        L_0x03a1:
            androidx.compose.ui.Modifier r0 = r0.o0(r1)
            androidx.compose.material3.internal.AnchoredDraggableState r1 = r10.j()
            androidx.compose.foundation.gestures.Orientation r7 = androidx.compose.foundation.gestures.Orientation.Vertical
            r8 = 3670016(0x380000, float:5.142788E-39)
            r8 = r8 & r13
            r8 = r8 ^ r28
            r15 = 1048576(0x100000, float:1.469368E-39)
            if (r8 <= r15) goto L_0x03ba
            boolean r21 = r6.W(r10)
            if (r21 != 0) goto L_0x03bd
        L_0x03ba:
            r67 = r12
            goto L_0x03c0
        L_0x03bd:
            r67 = r12
            goto L_0x03c4
        L_0x03c0:
            r12 = r13 & r28
            if (r12 != r15) goto L_0x03c6
        L_0x03c4:
            r12 = 1
            goto L_0x03c7
        L_0x03c6:
            r12 = 0
        L_0x03c7:
            java.lang.Object r15 = r6.g()
            if (r12 != 0) goto L_0x03d5
            androidx.compose.runtime.Composer$Companion r12 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r12 = r12.a()
            if (r15 != r12) goto L_0x03dd
        L_0x03d5:
            androidx.compose.material3.G3 r15 = new androidx.compose.material3.G3
            r15.<init>(r10)
            r6.N(r15)
        L_0x03dd:
            kotlin.jvm.functions.Function2 r15 = (kotlin.jvm.functions.Function2) r15
            androidx.compose.ui.Modifier r36 = androidx.compose.material3.internal.AnchoredDraggableKt.g(r0, r1, r7, r15)
            androidx.compose.material3.internal.AnchoredDraggableState r0 = r10.j()
            androidx.compose.foundation.gestures.DraggableState r37 = r0.v()
            if (r3 == 0) goto L_0x03f6
            boolean r0 = r10.s()
            if (r0 == 0) goto L_0x03f6
            r39 = 1
            goto L_0x03f8
        L_0x03f6:
            r39 = 0
        L_0x03f8:
            androidx.compose.material3.internal.AnchoredDraggableState r0 = r10.j()
            boolean r41 = r0.z()
            r0 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r13
            r1 = 16384(0x4000, float:2.2959E-41)
            if (r0 != r1) goto L_0x040a
            r0 = 1
            goto L_0x040b
        L_0x040a:
            r0 = 0
        L_0x040b:
            java.lang.Object r1 = r6.g()
            if (r0 != 0) goto L_0x0419
            androidx.compose.runtime.Composer$Companion r0 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r0 = r0.a()
            if (r1 != r0) goto L_0x0422
        L_0x0419:
            androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$4$1 r1 = new androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$4$1
            r0 = 0
            r1.<init>(r5, r0)
            r6.N(r1)
        L_0x0422:
            r43 = r1
            kotlin.jvm.functions.Function3 r43 = (kotlin.jvm.functions.Function3) r43
            r45 = 168(0xa8, float:2.35E-43)
            r46 = 0
            r40 = 0
            r42 = 0
            r44 = 0
            r38 = r7
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.gestures.DraggableKt.h(r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)
            boolean r1 = r6.W(r4)
            java.lang.Object r7 = r6.g()
            if (r1 != 0) goto L_0x0448
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
            if (r7 != r1) goto L_0x0450
        L_0x0448:
            androidx.compose.material3.H3 r7 = new androidx.compose.material3.H3
            r7.<init>(r4)
            r6.N(r7)
        L_0x0450:
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            r1 = 0
            r4 = 0
            r12 = 1
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.semantics.SemanticsModifierKt.d(r0, r1, r7, r12, r4)
            float r4 = r10.n()
            int r4 = (int) r4
            int r4 = kotlin.ranges.RangesKt.e(r4, r1)
            r7 = 13
            r12 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r54 = r15
            r55 = r4
            r56 = r16
            r57 = r17
            r58 = r7
            r59 = r12
            androidx.compose.foundation.layout.WindowInsets r4 = androidx.compose.foundation.layout.WindowInsetsKt.b(r54, r55, r56, r57, r58, r59)
            androidx.compose.ui.Modifier r0 = androidx.compose.foundation.layout.WindowInsetsPaddingKt.b(r0, r4)
            r4 = 1048576(0x100000, float:1.469368E-39)
            if (r8 <= r4) goto L_0x0488
            boolean r7 = r6.W(r10)
            if (r7 != 0) goto L_0x048c
        L_0x0488:
            r7 = r13 & r28
            if (r7 != r4) goto L_0x048e
        L_0x048c:
            r4 = 1
            goto L_0x048f
        L_0x048e:
            r4 = r1
        L_0x048f:
            r7 = r13 & 112(0x70, float:1.57E-43)
            r8 = 32
            if (r7 == r8) goto L_0x04a2
            r7 = r13 & 64
            if (r7 == 0) goto L_0x04a0
            boolean r7 = r6.l(r2)
            if (r7 == 0) goto L_0x04a0
            goto L_0x04a2
        L_0x04a0:
            r12 = r1
            goto L_0x04a3
        L_0x04a2:
            r12 = 1
        L_0x04a3:
            r1 = r4 | r12
            java.lang.Object r4 = r6.g()
            if (r1 != 0) goto L_0x04b3
            androidx.compose.runtime.Composer$Companion r1 = androidx.compose.runtime.Composer.f14567a
            java.lang.Object r1 = r1.a()
            if (r4 != r1) goto L_0x04bb
        L_0x04b3:
            androidx.compose.material3.I3 r4 = new androidx.compose.material3.I3
            r4.<init>(r10, r2)
            r6.N(r4)
        L_0x04bb:
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            androidx.compose.ui.Modifier r0 = androidx.compose.ui.graphics.GraphicsLayerModifierKt.a(r0, r4)
            androidx.compose.ui.Modifier r21 = androidx.compose.material3.BottomSheetScaffoldKt.u(r0, r10)
            androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7 r0 = new androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheetContent$7
            r54 = r0
            r55 = r34
            r56 = r50
            r57 = r10
            r58 = r9
            r59 = r66
            r60 = r52
            r61 = r51
            r62 = r3
            r54.<init>(r55, r56, r57, r58, r59, r60, r61, r62)
            r1 = 54
            r4 = 728743275(0x2b6fbd6b, float:8.5172727E-13)
            r7 = 1
            androidx.compose.runtime.internal.ComposableLambda r30 = androidx.compose.runtime.internal.ComposableLambdaKt.e(r4, r7, r0, r6, r1)
            int r0 = r13 >> 24
            r0 = r0 & 112(0x70, float:1.57E-43)
            r1 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = r0 | r1
            r1 = 6
            int r1 = r14 << 6
            r4 = r1 & 896(0x380, float:1.256E-42)
            r0 = r0 | r4
            r4 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r4
            r4 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r4
            r32 = r0 | r1
            r33 = 96
            r28 = 0
            r29 = 0
            r22 = r11
            r23 = r64
            r25 = r19
            r27 = r63
            r31 = r6
            androidx.compose.material3.SurfaceKt.c(r21, r22, r23, r25, r27, r28, r29, r30, r31, r32, r33)
            boolean r0 = androidx.compose.runtime.ComposerKt.P()
            if (r0 == 0) goto L_0x0518
            androidx.compose.runtime.ComposerKt.X()
        L_0x0518:
            r15 = r63
            r8 = r67
            r16 = r9
            r7 = r10
            r10 = r11
            r13 = r19
            r17 = r34
            r11 = r64
            r9 = r3
            goto L_0x053f
        L_0x0528:
            r6.B()
            r35 = r54
            r7 = r55
            r8 = r56
            r9 = r57
            r10 = r58
            r11 = r59
            r13 = r61
            r15 = r63
            r16 = r64
            r17 = r65
        L_0x053f:
            androidx.compose.runtime.ScopeUpdateScope r6 = r6.x()
            if (r6 == 0) goto L_0x056a
            androidx.compose.material3.J3 r4 = new androidx.compose.material3.J3
            r0 = r4
            r1 = r49
            r2 = r50
            r3 = r51
            r47 = r4
            r4 = r52
            r5 = r53
            r48 = r6
            r6 = r35
            r18 = r66
            r19 = r68
            r20 = r69
            r21 = r70
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r15, r16, r17, r18, r19, r20, r21)
            r1 = r47
            r0 = r48
            r0.a(r1)
        L_0x056a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ModalBottomSheetKt.t(androidx.compose.foundation.layout.BoxScope, androidx.compose.animation.core.Animatable, kotlinx.coroutines.CoroutineScope, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.material3.SheetState, float, boolean, androidx.compose.ui.graphics.Shape, long, long, float, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final Pair u(SheetState sheetState, IntSize intSize, Constraints constraints) {
        SheetValue sheetValue;
        DraggableAnchors a2 = AnchoredDraggableKt.a(new K3((float) Constraints.k(constraints.r()), intSize, sheetState));
        int i2 = WhenMappings.f10334a[((SheetValue) sheetState.j().y()).ordinal()];
        if (i2 == 1) {
            sheetValue = SheetValue.Hidden;
        } else if (i2 == 2) {
            sheetValue = SheetValue.PartiallyExpanded;
            if (!a2.f(sheetValue)) {
                sheetValue = SheetValue.Expanded;
                if (!a2.f(sheetValue)) {
                    sheetValue = SheetValue.Hidden;
                }
            }
        } else if (i2 == 3) {
            sheetValue = SheetValue.Expanded;
            if (!a2.f(sheetValue)) {
                sheetValue = SheetValue.Hidden;
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return TuplesKt.a(a2, sheetValue);
    }

    public static final Unit v(float f2, IntSize intSize, SheetState sheetState, DraggableAnchorsConfig draggableAnchorsConfig) {
        draggableAnchorsConfig.a(SheetValue.Hidden, f2);
        if (((float) ((int) (intSize.j() & 4294967295L))) > f2 / ((float) 2) && !sheetState.p()) {
            draggableAnchorsConfig.a(SheetValue.PartiallyExpanded, f2 / 2.0f);
        }
        if (((int) (intSize.j() & 4294967295L)) != 0) {
            draggableAnchorsConfig.a(SheetValue.Expanded, Math.max(0.0f, f2 - ((float) ((int) (intSize.j() & 4294967295L)))));
        }
        return Unit.f40552a;
    }

    public static final Unit w(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.o0(semanticsPropertyReceiver, str);
        SemanticsPropertiesKt.I0(semanticsPropertyReceiver, 0.0f);
        return Unit.f40552a;
    }

    public static final Unit x(SheetState sheetState, Animatable animatable, GraphicsLayerScope graphicsLayerScope) {
        float x2 = sheetState.j().x();
        float intBitsToFloat = Float.intBitsToFloat((int) (graphicsLayerScope.c() & 4294967295L));
        if (!Float.isNaN(x2) && !Float.isNaN(intBitsToFloat) && intBitsToFloat != 0.0f) {
            float floatValue = ((Number) animatable.m()).floatValue();
            graphicsLayerScope.j(R(graphicsLayerScope, floatValue));
            graphicsLayerScope.i(S(graphicsLayerScope, floatValue));
            graphicsLayerScope.Q1(TransformOriginKt.a(0.5f, (x2 + intBitsToFloat) / intBitsToFloat));
        }
        return Unit.f40552a;
    }

    public static final Unit y(BoxScope boxScope, Animatable animatable, CoroutineScope coroutineScope, Function0 function0, Function1 function1, Modifier modifier, SheetState sheetState, float f2, boolean z2, Shape shape, long j2, long j3, float f3, Function2 function2, Function2 function22, Function3 function3, int i2, int i3, int i4, Composer composer, int i5) {
        t(boxScope, animatable, coroutineScope, function0, function1, modifier, sheetState, f2, z2, shape, j2, j3, f3, function2, function22, function3, composer, RecomposeScopeImplKt.a(i2 | 1), RecomposeScopeImplKt.a(i3), i4);
        return Unit.f40552a;
    }

    public static final Unit z(SheetState sheetState, FiniteAnimationSpec finiteAnimationSpec, FiniteAnimationSpec finiteAnimationSpec2, FiniteAnimationSpec finiteAnimationSpec3) {
        sheetState.x(finiteAnimationSpec);
        sheetState.w(finiteAnimationSpec2);
        sheetState.v(finiteAnimationSpec3);
        return Unit.f40552a;
    }
}
