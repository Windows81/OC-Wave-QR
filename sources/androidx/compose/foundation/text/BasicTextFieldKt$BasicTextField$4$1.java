package androidx.compose.foundation.text;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.internal.TextFieldCoreModifier;
import androidx.compose.foundation.text.input.internal.TextFieldTextLayoutModifier;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BasicTextFieldKt$BasicTextField$4$1 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ TextFieldLineLimits f5543A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ TextLayoutState f5544B;
    public final /* synthetic */ TextStyle C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ TransformedTextFieldState G;
    public final /* synthetic */ TextFieldSelectionState H;
    public final /* synthetic */ Brush I;
    public final /* synthetic */ boolean J;
    public final /* synthetic */ boolean K;
    public final /* synthetic */ ScrollState L;
    public final /* synthetic */ Orientation M;
    public final /* synthetic */ boolean N;
    public final /* synthetic */ Function2 O;
    public final /* synthetic */ KeyboardOptions P;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldDecorator f5545z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasicTextFieldKt$BasicTextField$4$1(TextFieldDecorator textFieldDecorator, TextFieldLineLimits textFieldLineLimits, TextLayoutState textLayoutState, TextStyle textStyle, boolean z2, boolean z3, boolean z4, TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, Brush brush, boolean z5, boolean z6, ScrollState scrollState, Orientation orientation, boolean z7, Function2 function2, KeyboardOptions keyboardOptions) {
        super(2);
        this.f5545z = textFieldDecorator;
        this.f5543A = textFieldLineLimits;
        this.f5544B = textLayoutState;
        this.C = textStyle;
        this.D = z2;
        this.E = z3;
        this.F = z4;
        this.G = transformedTextFieldState;
        this.H = textFieldSelectionState;
        this.I = brush;
        this.J = z5;
        this.K = z6;
        this.L = scrollState;
        this.M = orientation;
        this.N = z7;
        this.O = function2;
        this.P = keyboardOptions;
    }

    public final void b(Composer composer, int i2) {
        Composer composer2 = composer;
        int i3 = i2;
        if (composer2.E((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.P()) {
                ComposerKt.Y(-673241599, i3, -1, "androidx.compose.foundation.text.BasicTextField.<anonymous>.<anonymous> (BasicTextField.kt:431)");
            }
            TextFieldDecorator textFieldDecorator = this.f5545z;
            if (textFieldDecorator == null) {
                textFieldDecorator = BasicTextFieldKt.f5504a;
            }
            final TextFieldLineLimits textFieldLineLimits = this.f5543A;
            final TextLayoutState textLayoutState = this.f5544B;
            final TextStyle textStyle = this.C;
            final boolean z2 = this.D;
            final boolean z3 = this.E;
            final boolean z4 = this.F;
            final TransformedTextFieldState transformedTextFieldState = this.G;
            final TextFieldSelectionState textFieldSelectionState = this.H;
            final Brush brush = this.I;
            final boolean z5 = this.J;
            final boolean z6 = this.K;
            final ScrollState scrollState = this.L;
            final Orientation orientation = this.M;
            final boolean z7 = this.N;
            final Function2 function2 = this.O;
            final KeyboardOptions keyboardOptions = this.P;
            textFieldDecorator.a(ComposableLambdaKt.e(1969169726, true, new Function2<Composer, Integer, Unit>() {
                public final void b(Composer composer, int i2) {
                    int i3;
                    int i4;
                    Composer composer2 = composer;
                    int i5 = i2;
                    if (composer2.E((i5 & 3) != 2, i5 & 1)) {
                        if (ComposerKt.P()) {
                            ComposerKt.Y(1969169726, i5, -1, "androidx.compose.foundation.text.BasicTextField.<anonymous>.<anonymous>.<anonymous> (BasicTextField.kt:433)");
                        }
                        TextFieldLineLimits textFieldLineLimits = textFieldLineLimits;
                        if (textFieldLineLimits instanceof TextFieldLineLimits.MultiLine) {
                            i4 = ((TextFieldLineLimits.MultiLine) textFieldLineLimits).b();
                            i3 = ((TextFieldLineLimits.MultiLine) textFieldLineLimits).a();
                        } else {
                            i4 = 1;
                            i3 = 1;
                        }
                        Modifier.Companion companion = Modifier.f15489d;
                        Modifier o0 = ClipKt.b(TextFieldSizeKt.a(HeightInLinesModifierKt.a(SizeKt.k(companion, textLayoutState.g(), 0.0f, 2, (Object) null), textStyle, i4, i3), textStyle)).o0(new TextFieldCoreModifier(z2 && z3, z4, textLayoutState, transformedTextFieldState, textFieldSelectionState, brush, z5 && !z6, scrollState, orientation));
                        TextLayoutState textLayoutState = textLayoutState;
                        TransformedTextFieldState transformedTextFieldState = transformedTextFieldState;
                        TextStyle textStyle = textStyle;
                        boolean z2 = z7;
                        Function2 function2 = function2;
                        KeyboardOptions keyboardOptions = keyboardOptions;
                        boolean z3 = z5;
                        boolean z4 = z2;
                        boolean z5 = z3;
                        TextFieldSelectionState textFieldSelectionState = textFieldSelectionState;
                        boolean z6 = z6;
                        MeasurePolicy g2 = BoxKt.g(Alignment.f15444a.o(), true);
                        int a2 = ComposablesKt.a(composer2, 0);
                        CompositionLocalMap I2 = composer.I();
                        Modifier e2 = ComposedModifierKt.e(composer2, o0);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.f17222h;
                        TextFieldSelectionState textFieldSelectionState2 = textFieldSelectionState;
                        Function0 a3 = companion2.a();
                        if (composer.v() == null) {
                            ComposablesKt.d();
                        }
                        composer.s();
                        if (composer.n()) {
                            composer2.y(a3);
                        } else {
                            composer.K();
                        }
                        Composer b2 = Updater.b(composer);
                        boolean z7 = z6;
                        Updater.g(b2, g2, companion2.c());
                        Updater.g(b2, I2, companion2.e());
                        Function2 b3 = companion2.b();
                        if (b2.n() || !Intrinsics.d(b2.g(), Integer.valueOf(a2))) {
                            b2.N(Integer.valueOf(a2));
                            b2.A(Integer.valueOf(a2), b3);
                        }
                        Updater.g(b2, e2, companion2.d());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3797a;
                        TextFieldSelectionState textFieldSelectionState3 = textFieldSelectionState2;
                        BoxKt.a(BringIntoViewRequesterKt.b(companion, textLayoutState.c()).o0(new TextFieldTextLayoutModifier(textLayoutState, transformedTextFieldState, textStyle, z2, function2, keyboardOptions)), composer2, 0);
                        if (!z3 || !z4 || !z5 || !textFieldSelectionState3.m0()) {
                            composer2.X(-1319893344);
                            composer.M();
                        } else {
                            composer2.X(-1320156658);
                            BasicTextFieldKt.m(textFieldSelectionState3, composer2, 0);
                            if (!z7) {
                                composer2.X(-1320029527);
                                BasicTextFieldKt.k(textFieldSelectionState3, composer2, 0);
                                composer.M();
                            } else {
                                composer2.X(-1319915168);
                                composer.M();
                            }
                            composer.M();
                        }
                        composer.T();
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
