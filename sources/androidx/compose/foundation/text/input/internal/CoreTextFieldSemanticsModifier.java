package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TransformedText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class CoreTextFieldSemanticsModifier extends ModifierNodeElement<CoreTextFieldSemanticsModifierNode> {

    /* renamed from: A  reason: collision with root package name */
    public final TextFieldValue f6141A;

    /* renamed from: B  reason: collision with root package name */
    public final LegacyTextFieldState f6142B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final OffsetMapping F;
    public final TextFieldSelectionManager G;
    public final ImeOptions H;
    public final FocusRequester I;

    /* renamed from: z  reason: collision with root package name */
    public final TransformedText f6143z;

    public CoreTextFieldSemanticsModifier(TransformedText transformedText, TextFieldValue textFieldValue, LegacyTextFieldState legacyTextFieldState, boolean z2, boolean z3, boolean z4, OffsetMapping offsetMapping, TextFieldSelectionManager textFieldSelectionManager, ImeOptions imeOptions, FocusRequester focusRequester) {
        this.f6143z = transformedText;
        this.f6141A = textFieldValue;
        this.f6142B = legacyTextFieldState;
        this.C = z2;
        this.D = z3;
        this.E = z4;
        this.F = offsetMapping;
        this.G = textFieldSelectionManager;
        this.H = imeOptions;
        this.I = focusRequester;
    }

    /* renamed from: c */
    public CoreTextFieldSemanticsModifierNode a() {
        return new CoreTextFieldSemanticsModifierNode(this.f6143z, this.f6141A, this.f6142B, this.C, this.D, this.E, this.F, this.G, this.H, this.I);
    }

    /* renamed from: d */
    public void b(CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode) {
        coreTextFieldSemanticsModifierNode.o3(this.f6143z, this.f6141A, this.f6142B, this.C, this.D, this.E, this.F, this.G, this.H, this.I);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoreTextFieldSemanticsModifier)) {
            return false;
        }
        CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier = (CoreTextFieldSemanticsModifier) obj;
        return Intrinsics.d(this.f6143z, coreTextFieldSemanticsModifier.f6143z) && Intrinsics.d(this.f6141A, coreTextFieldSemanticsModifier.f6141A) && Intrinsics.d(this.f6142B, coreTextFieldSemanticsModifier.f6142B) && this.C == coreTextFieldSemanticsModifier.C && this.D == coreTextFieldSemanticsModifier.D && this.E == coreTextFieldSemanticsModifier.E && Intrinsics.d(this.F, coreTextFieldSemanticsModifier.F) && Intrinsics.d(this.G, coreTextFieldSemanticsModifier.G) && Intrinsics.d(this.H, coreTextFieldSemanticsModifier.H) && Intrinsics.d(this.I, coreTextFieldSemanticsModifier.I);
    }

    public int hashCode() {
        return (((((((((((((((((this.f6143z.hashCode() * 31) + this.f6141A.hashCode()) * 31) + this.f6142B.hashCode()) * 31) + Boolean.hashCode(this.C)) * 31) + Boolean.hashCode(this.D)) * 31) + Boolean.hashCode(this.E)) * 31) + this.F.hashCode()) * 31) + this.G.hashCode()) * 31) + this.H.hashCode()) * 31) + this.I.hashCode();
    }

    public String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.f6143z + ", value=" + this.f6141A + ", state=" + this.f6142B + ", readOnly=" + this.C + ", enabled=" + this.D + ", isPassword=" + this.E + ", offsetMapping=" + this.F + ", manager=" + this.G + ", imeOptions=" + this.H + ", focusRequester=" + this.I + ')';
    }
}
