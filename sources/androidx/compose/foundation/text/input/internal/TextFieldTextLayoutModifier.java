package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TextFieldTextLayoutModifier extends ModifierNodeElement<TextFieldTextLayoutModifierNode> {

    /* renamed from: A  reason: collision with root package name */
    public final TransformedTextFieldState f6383A;

    /* renamed from: B  reason: collision with root package name */
    public final TextStyle f6384B;
    public final boolean C;
    public final Function2 D;
    public final KeyboardOptions E;

    /* renamed from: z  reason: collision with root package name */
    public final TextLayoutState f6385z;

    public TextFieldTextLayoutModifier(TextLayoutState textLayoutState, TransformedTextFieldState transformedTextFieldState, TextStyle textStyle, boolean z2, Function2 function2, KeyboardOptions keyboardOptions) {
        this.f6385z = textLayoutState;
        this.f6383A = transformedTextFieldState;
        this.f6384B = textStyle;
        this.C = z2;
        this.D = function2;
        this.E = keyboardOptions;
    }

    /* renamed from: c */
    public TextFieldTextLayoutModifierNode a() {
        return new TextFieldTextLayoutModifierNode(this.f6385z, this.f6383A, this.f6384B, this.C, this.D, this.E);
    }

    /* renamed from: d */
    public void b(TextFieldTextLayoutModifierNode textFieldTextLayoutModifierNode) {
        textFieldTextLayoutModifierNode.Z2(this.f6385z, this.f6383A, this.f6384B, this.C, this.D, this.E);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldTextLayoutModifier)) {
            return false;
        }
        TextFieldTextLayoutModifier textFieldTextLayoutModifier = (TextFieldTextLayoutModifier) obj;
        return Intrinsics.d(this.f6385z, textFieldTextLayoutModifier.f6385z) && Intrinsics.d(this.f6383A, textFieldTextLayoutModifier.f6383A) && Intrinsics.d(this.f6384B, textFieldTextLayoutModifier.f6384B) && this.C == textFieldTextLayoutModifier.C && Intrinsics.d(this.D, textFieldTextLayoutModifier.D) && Intrinsics.d(this.E, textFieldTextLayoutModifier.E);
    }

    public int hashCode() {
        int hashCode = ((((((this.f6385z.hashCode() * 31) + this.f6383A.hashCode()) * 31) + this.f6384B.hashCode()) * 31) + Boolean.hashCode(this.C)) * 31;
        Function2 function2 = this.D;
        return ((hashCode + (function2 == null ? 0 : function2.hashCode())) * 31) + this.E.hashCode();
    }

    public String toString() {
        return "TextFieldTextLayoutModifier(textLayoutState=" + this.f6385z + ", textFieldState=" + this.f6383A + ", textStyle=" + this.f6384B + ", singleLine=" + this.C + ", onTextLayout=" + this.D + ", keyboardOptions=" + this.E + ')';
    }
}
