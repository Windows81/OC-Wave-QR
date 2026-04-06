package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.foundation.text.selection.SimpleLayoutKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class CoreTextFieldKt$CoreTextField$5 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ LegacyTextFieldState f5675A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ TextStyle f5676B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;
    public final /* synthetic */ TextFieldScrollerPosition E;
    public final /* synthetic */ TextFieldValue F;
    public final /* synthetic */ VisualTransformation G;
    public final /* synthetic */ Modifier H;
    public final /* synthetic */ Modifier I;
    public final /* synthetic */ Modifier J;
    public final /* synthetic */ Modifier K;
    public final /* synthetic */ BringIntoViewRequester L;
    public final /* synthetic */ TextFieldSelectionManager M;
    public final /* synthetic */ boolean N;
    public final /* synthetic */ boolean O;
    public final /* synthetic */ Function1 P;
    public final /* synthetic */ OffsetMapping Q;
    public final /* synthetic */ Density R;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function3 f5677z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$5(Function3 function3, LegacyTextFieldState legacyTextFieldState, TextStyle textStyle, int i2, int i3, TextFieldScrollerPosition textFieldScrollerPosition, TextFieldValue textFieldValue, VisualTransformation visualTransformation, Modifier modifier, Modifier modifier2, Modifier modifier3, Modifier modifier4, BringIntoViewRequester bringIntoViewRequester, TextFieldSelectionManager textFieldSelectionManager, boolean z2, boolean z3, Function1 function1, OffsetMapping offsetMapping, Density density) {
        super(2);
        this.f5677z = function3;
        this.f5675A = legacyTextFieldState;
        this.f5676B = textStyle;
        this.C = i2;
        this.D = i3;
        this.E = textFieldScrollerPosition;
        this.F = textFieldValue;
        this.G = visualTransformation;
        this.H = modifier;
        this.I = modifier2;
        this.J = modifier3;
        this.K = modifier4;
        this.L = bringIntoViewRequester;
        this.M = textFieldSelectionManager;
        this.N = z2;
        this.O = z3;
        this.P = function1;
        this.Q = offsetMapping;
        this.R = density;
    }

    public final void b(Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        if (composer2.E((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-492537660, i3, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous> (CoreTextField.kt:555)");
            }
            Function3 function3 = this.f5677z;
            final LegacyTextFieldState legacyTextFieldState = this.f5675A;
            final TextStyle textStyle = this.f5676B;
            final int i4 = this.C;
            final int i5 = this.D;
            final TextFieldScrollerPosition textFieldScrollerPosition = this.E;
            final TextFieldValue textFieldValue = this.F;
            final VisualTransformation visualTransformation = this.G;
            final Modifier modifier = this.H;
            final Modifier modifier2 = this.I;
            final Modifier modifier3 = this.J;
            final Modifier modifier4 = this.K;
            final BringIntoViewRequester bringIntoViewRequester = this.L;
            final TextFieldSelectionManager textFieldSelectionManager = this.M;
            final boolean z2 = this.N;
            final boolean z3 = this.O;
            final Function1 function1 = this.P;
            final OffsetMapping offsetMapping = this.Q;
            final Density density = this.R;
            function3.d(ComposableLambdaKt.e(-1835647873, true, new Function2<Composer, Integer, Unit>() {
                public final void b(Composer composer, int i2) {
                    if (composer.E((i2 & 3) != 2, i2 & 1)) {
                        if (ComposerKt.P()) {
                            ComposerKt.Y(-1835647873, i2, -1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous> (CoreTextField.kt:558)");
                        }
                        Modifier a2 = HeightInLinesModifierKt.a(SizeKt.k(Modifier.f15489d, legacyTextFieldState.m(), 0.0f, 2, (Object) null), textStyle, i4, i5);
                        TextFieldScrollerPosition textFieldScrollerPosition = textFieldScrollerPosition;
                        TextFieldValue textFieldValue = textFieldValue;
                        VisualTransformation visualTransformation = visualTransformation;
                        boolean l2 = composer.l(legacyTextFieldState);
                        LegacyTextFieldState legacyTextFieldState = legacyTextFieldState;
                        Object g2 = composer.g();
                        if (l2 || g2 == Composer.f14567a.a()) {
                            g2 = new CoreTextFieldKt$CoreTextField$5$1$coreTextFieldModifier$1$1(legacyTextFieldState);
                            composer.N(g2);
                        }
                        Modifier b2 = BringIntoViewRequesterKt.b(TextFieldSizeKt.a(TextFieldScroll_androidKt.a(a2, textFieldScrollerPosition, textFieldValue, visualTransformation, (Function0) g2).o0(modifier).o0(modifier2), textStyle).o0(modifier3).o0(modifier4), bringIntoViewRequester);
                        final TextFieldSelectionManager textFieldSelectionManager = textFieldSelectionManager;
                        final LegacyTextFieldState legacyTextFieldState2 = legacyTextFieldState;
                        final boolean z2 = z2;
                        final boolean z3 = z3;
                        final Function1 function1 = function1;
                        final TextFieldValue textFieldValue2 = textFieldValue;
                        final OffsetMapping offsetMapping = offsetMapping;
                        final Density density = density;
                        final int i3 = i5;
                        SimpleLayoutKt.a(b2, ComposableLambdaKt.e(-1172467467, true, new Function2<Composer, Integer, Unit>() {
                            /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c7, code lost:
                                if (r6 != false) goto L_0x00cb;
                             */
                            /* Code decompiled incorrectly, please refer to instructions dump. */
                            public final void b(androidx.compose.runtime.Composer r13, int r14) {
                                /*
                                    r12 = this;
                                    r0 = r14 & 3
                                    r1 = 2
                                    r2 = 1
                                    r3 = 0
                                    if (r0 == r1) goto L_0x0009
                                    r0 = r2
                                    goto L_0x000a
                                L_0x0009:
                                    r0 = r3
                                L_0x000a:
                                    r1 = r14 & 1
                                    boolean r0 = r13.E(r0, r1)
                                    if (r0 == 0) goto L_0x0102
                                    boolean r0 = androidx.compose.runtime.ComposerKt.P()
                                    if (r0 == 0) goto L_0x0021
                                    r0 = -1
                                    java.lang.String r1 = "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous>.<anonymous> (CoreTextField.kt:579)"
                                    r4 = -1172467467(0xffffffffba1d90f5, float:-6.010675E-4)
                                    androidx.compose.runtime.ComposerKt.Y(r4, r14, r0, r1)
                                L_0x0021:
                                    androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$1$2 r14 = new androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1$1$2
                                    androidx.compose.foundation.text.LegacyTextFieldState r6 = r5
                                    kotlin.jvm.functions.Function1 r7 = r8
                                    androidx.compose.ui.text.input.TextFieldValue r8 = r9
                                    androidx.compose.ui.text.input.OffsetMapping r9 = r10
                                    androidx.compose.ui.unit.Density r10 = r11
                                    int r11 = r12
                                    r5 = r14
                                    r5.<init>(r6, r7, r8, r9, r10, r11)
                                    androidx.compose.ui.Modifier$Companion r0 = androidx.compose.ui.Modifier.f15489d
                                    int r1 = androidx.compose.runtime.ComposablesKt.a(r13, r3)
                                    androidx.compose.runtime.CompositionLocalMap r4 = r13.I()
                                    androidx.compose.ui.Modifier r0 = androidx.compose.ui.ComposedModifierKt.e(r13, r0)
                                    androidx.compose.ui.node.ComposeUiNode$Companion r5 = androidx.compose.ui.node.ComposeUiNode.f17222h
                                    kotlin.jvm.functions.Function0 r6 = r5.a()
                                    androidx.compose.runtime.Applier r7 = r13.v()
                                    if (r7 != 0) goto L_0x0050
                                    androidx.compose.runtime.ComposablesKt.d()
                                L_0x0050:
                                    r13.s()
                                    boolean r7 = r13.n()
                                    if (r7 == 0) goto L_0x005d
                                    r13.y(r6)
                                    goto L_0x0060
                                L_0x005d:
                                    r13.K()
                                L_0x0060:
                                    androidx.compose.runtime.Composer r6 = androidx.compose.runtime.Updater.b(r13)
                                    kotlin.jvm.functions.Function2 r7 = r5.c()
                                    androidx.compose.runtime.Updater.g(r6, r14, r7)
                                    kotlin.jvm.functions.Function2 r14 = r5.e()
                                    androidx.compose.runtime.Updater.g(r6, r4, r14)
                                    kotlin.jvm.functions.Function2 r14 = r5.b()
                                    boolean r4 = r6.n()
                                    if (r4 != 0) goto L_0x008a
                                    java.lang.Object r4 = r6.g()
                                    java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
                                    boolean r4 = kotlin.jvm.internal.Intrinsics.d(r4, r7)
                                    if (r4 != 0) goto L_0x0098
                                L_0x008a:
                                    java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
                                    r6.N(r4)
                                    java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                                    r6.A(r1, r14)
                                L_0x0098:
                                    kotlin.jvm.functions.Function2 r14 = r5.d()
                                    androidx.compose.runtime.Updater.g(r6, r0, r14)
                                    r13.T()
                                    androidx.compose.foundation.text.selection.TextFieldSelectionManager r14 = r4
                                    androidx.compose.foundation.text.LegacyTextFieldState r0 = r5
                                    androidx.compose.foundation.text.HandleState r0 = r0.e()
                                    androidx.compose.foundation.text.HandleState r1 = androidx.compose.foundation.text.HandleState.f5738z
                                    if (r0 == r1) goto L_0x00ca
                                    androidx.compose.foundation.text.LegacyTextFieldState r0 = r5
                                    androidx.compose.ui.layout.LayoutCoordinates r0 = r0.k()
                                    if (r0 == 0) goto L_0x00ca
                                    androidx.compose.foundation.text.LegacyTextFieldState r0 = r5
                                    androidx.compose.ui.layout.LayoutCoordinates r0 = r0.k()
                                    kotlin.jvm.internal.Intrinsics.f(r0)
                                    boolean r0 = r0.b()
                                    if (r0 == 0) goto L_0x00ca
                                    boolean r0 = r6
                                    if (r0 == 0) goto L_0x00ca
                                    goto L_0x00cb
                                L_0x00ca:
                                    r2 = r3
                                L_0x00cb:
                                    androidx.compose.foundation.text.CoreTextFieldKt.h(r14, r2, r13, r3)
                                    androidx.compose.foundation.text.LegacyTextFieldState r14 = r5
                                    androidx.compose.foundation.text.HandleState r14 = r14.e()
                                    androidx.compose.foundation.text.HandleState r0 = androidx.compose.foundation.text.HandleState.f5737B
                                    if (r14 != r0) goto L_0x00ef
                                    boolean r14 = r7
                                    if (r14 != 0) goto L_0x00ef
                                    boolean r14 = r6
                                    if (r14 == 0) goto L_0x00ef
                                    r14 = -7167858(0xffffffffff92a08e, float:NaN)
                                    r13.X(r14)
                                    androidx.compose.foundation.text.selection.TextFieldSelectionManager r14 = r4
                                    androidx.compose.foundation.text.CoreTextFieldKt.e(r14, r13, r3)
                                    r13.M()
                                    goto L_0x00f8
                                L_0x00ef:
                                    r14 = -7090978(0xffffffffff93ccde, float:NaN)
                                    r13.X(r14)
                                    r13.M()
                                L_0x00f8:
                                    boolean r13 = androidx.compose.runtime.ComposerKt.P()
                                    if (r13 == 0) goto L_0x0105
                                    androidx.compose.runtime.ComposerKt.X()
                                    goto L_0x0105
                                L_0x0102:
                                    r13.B()
                                L_0x0105:
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5.AnonymousClass1.AnonymousClass1.b(androidx.compose.runtime.Composer, int):void");
                            }

                            public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
                                b((Composer) obj, ((Number) obj2).intValue());
                                return Unit.f40552a;
                            }
                        }, composer, 54), composer, 48, 0);
                        if (ComposerKt.P()) {
                            ComposerKt.X();
                            return;
                        }
                        return;
                    }
                    composer.B();
                }

                public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
                    b((Composer) obj, ((Number) obj2).intValue());
                    return Unit.f40552a;
                }
            }, composer2, 54), composer2, 6);
            if (ComposerKt.P()) {
                ComposerKt.X();
                return;
            }
            return;
        }
        composer.B();
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
