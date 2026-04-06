package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableSharedFlow;

@Metadata
public final class TextFieldDecoratorModifier extends ModifierNodeElement<TextFieldDecoratorModifierNode> {

    /* renamed from: A  reason: collision with root package name */
    public final TextLayoutState f6298A;

    /* renamed from: B  reason: collision with root package name */
    public final TextFieldSelectionState f6299B;
    public final InputTransformation C;
    public final boolean D;
    public final boolean E;
    public final KeyboardOptions F;
    public final KeyboardActionHandler G;
    public final boolean H;
    public final MutableInteractionSource I;
    public final boolean J;
    public final MutableSharedFlow K;

    /* renamed from: z  reason: collision with root package name */
    public final TransformedTextFieldState f6300z;

    public TextFieldDecoratorModifier(TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, TextFieldSelectionState textFieldSelectionState, InputTransformation inputTransformation, boolean z2, boolean z3, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, boolean z4, MutableInteractionSource mutableInteractionSource, boolean z5, MutableSharedFlow mutableSharedFlow) {
        this.f6300z = transformedTextFieldState;
        this.f6298A = textLayoutState;
        this.f6299B = textFieldSelectionState;
        this.C = inputTransformation;
        this.D = z2;
        this.E = z3;
        this.F = keyboardOptions;
        this.G = keyboardActionHandler;
        this.H = z4;
        this.I = mutableInteractionSource;
        this.J = z5;
        this.K = mutableSharedFlow;
    }

    /* renamed from: c */
    public TextFieldDecoratorModifierNode a() {
        return new TextFieldDecoratorModifierNode(this.f6300z, this.f6298A, this.f6299B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K);
    }

    /* renamed from: d */
    public void b(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        textFieldDecoratorModifierNode.K3(this.f6300z, this.f6298A, this.f6299B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldDecoratorModifier)) {
            return false;
        }
        TextFieldDecoratorModifier textFieldDecoratorModifier = (TextFieldDecoratorModifier) obj;
        return Intrinsics.d(this.f6300z, textFieldDecoratorModifier.f6300z) && Intrinsics.d(this.f6298A, textFieldDecoratorModifier.f6298A) && Intrinsics.d(this.f6299B, textFieldDecoratorModifier.f6299B) && Intrinsics.d(this.C, textFieldDecoratorModifier.C) && this.D == textFieldDecoratorModifier.D && this.E == textFieldDecoratorModifier.E && Intrinsics.d(this.F, textFieldDecoratorModifier.F) && Intrinsics.d(this.G, textFieldDecoratorModifier.G) && this.H == textFieldDecoratorModifier.H && Intrinsics.d(this.I, textFieldDecoratorModifier.I) && this.J == textFieldDecoratorModifier.J && Intrinsics.d(this.K, textFieldDecoratorModifier.K);
    }

    public int hashCode() {
        int hashCode = ((((this.f6300z.hashCode() * 31) + this.f6298A.hashCode()) * 31) + this.f6299B.hashCode()) * 31;
        InputTransformation inputTransformation = this.C;
        int i2 = 0;
        int hashCode2 = (((((((hashCode + (inputTransformation == null ? 0 : inputTransformation.hashCode())) * 31) + Boolean.hashCode(this.D)) * 31) + Boolean.hashCode(this.E)) * 31) + this.F.hashCode()) * 31;
        KeyboardActionHandler keyboardActionHandler = this.G;
        int hashCode3 = (((((((hashCode2 + (keyboardActionHandler == null ? 0 : keyboardActionHandler.hashCode())) * 31) + Boolean.hashCode(this.H)) * 31) + this.I.hashCode()) * 31) + Boolean.hashCode(this.J)) * 31;
        MutableSharedFlow mutableSharedFlow = this.K;
        if (mutableSharedFlow != null) {
            i2 = mutableSharedFlow.hashCode();
        }
        return hashCode3 + i2;
    }

    public String toString() {
        return "TextFieldDecoratorModifier(textFieldState=" + this.f6300z + ", textLayoutState=" + this.f6298A + ", textFieldSelectionState=" + this.f6299B + ", filter=" + this.C + ", enabled=" + this.D + ", readOnly=" + this.E + ", keyboardOptions=" + this.F + ", keyboardActionHandler=" + this.G + ", singleLine=" + this.H + ", interactionSource=" + this.I + ", isPassword=" + this.J + ", stylusHandwritingTrigger=" + this.K + ')';
    }
}
