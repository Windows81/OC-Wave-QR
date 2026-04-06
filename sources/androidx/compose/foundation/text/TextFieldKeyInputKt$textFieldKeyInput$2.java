package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextPreparedSelectionState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KFunction;

@Metadata
public final class TextFieldKeyInputKt$textFieldKeyInput$2 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ TextFieldSelectionManager f5933A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ TextFieldValue f5934B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ OffsetMapping E;
    public final /* synthetic */ UndoManager F;
    public final /* synthetic */ Function1 G;
    public final /* synthetic */ int H;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LegacyTextFieldState f5935z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldKeyInputKt$textFieldKeyInput$2(LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, boolean z2, boolean z3, OffsetMapping offsetMapping, UndoManager undoManager, Function1 function1, int i2) {
        super(3);
        this.f5935z = legacyTextFieldState;
        this.f5933A = textFieldSelectionManager;
        this.f5934B = textFieldValue;
        this.C = z2;
        this.D = z3;
        this.E = offsetMapping;
        this.F = undoManager;
        this.G = function1;
        this.H = i2;
    }

    public final Modifier b(Modifier modifier, Composer composer, int i2) {
        Composer composer2 = composer;
        composer2.X(851809892);
        if (ComposerKt.P()) {
            ComposerKt.Y(851809892, i2, -1, "androidx.compose.foundation.text.textFieldKeyInput.<anonymous> (TextFieldKeyInput.kt:252)");
        }
        Object g2 = composer.g();
        Composer.Companion companion = Composer.f14567a;
        if (g2 == companion.a()) {
            g2 = new TextPreparedSelectionState();
            composer2.N(g2);
        }
        TextPreparedSelectionState textPreparedSelectionState = (TextPreparedSelectionState) g2;
        Object g3 = composer.g();
        if (g3 == companion.a()) {
            g3 = new DeadKeyCombiner();
            composer2.N(g3);
        }
        TextFieldKeyInput textFieldKeyInput = new TextFieldKeyInput(this.f5935z, this.f5933A, this.f5934B, this.C, this.D, textPreparedSelectionState, this.E, this.F, (DeadKeyCombiner) g3, (KeyMapping) null, this.G, this.H, 512, (DefaultConstructorMarker) null);
        Modifier.Companion companion2 = Modifier.f15489d;
        boolean l2 = composer2.l(textFieldKeyInput);
        Object g4 = composer.g();
        if (l2 || g4 == companion.a()) {
            g4 = new TextFieldKeyInputKt$textFieldKeyInput$2$1$1(textFieldKeyInput);
            composer2.N(g4);
        }
        Modifier a2 = KeyInputModifierKt.a(companion2, (Function1) ((KFunction) g4));
        if (ComposerKt.P()) {
            ComposerKt.X();
        }
        composer.M();
        return a2;
    }

    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3) {
        return b((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }
}
