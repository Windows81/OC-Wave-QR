package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class TextFieldCoreModifier extends ModifierNodeElement<TextFieldCoreModifierNode> {

    /* renamed from: A  reason: collision with root package name */
    public final boolean f6286A;

    /* renamed from: B  reason: collision with root package name */
    public final TextLayoutState f6287B;
    public final TransformedTextFieldState C;
    public final TextFieldSelectionState D;
    public final Brush E;
    public final boolean F;
    public final ScrollState G;
    public final Orientation H;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f6288z;

    public TextFieldCoreModifier(boolean z2, boolean z3, TextLayoutState textLayoutState, TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, Brush brush, boolean z4, ScrollState scrollState, Orientation orientation) {
        this.f6288z = z2;
        this.f6286A = z3;
        this.f6287B = textLayoutState;
        this.C = transformedTextFieldState;
        this.D = textFieldSelectionState;
        this.E = brush;
        this.F = z4;
        this.G = scrollState;
        this.H = orientation;
    }

    /* renamed from: c */
    public TextFieldCoreModifierNode a() {
        return new TextFieldCoreModifierNode(this.f6288z, this.f6286A, this.f6287B, this.C, this.D, this.E, this.F, this.G, this.H);
    }

    /* renamed from: d */
    public void b(TextFieldCoreModifierNode textFieldCoreModifierNode) {
        textFieldCoreModifierNode.t3(this.f6288z, this.f6286A, this.f6287B, this.C, this.D, this.E, this.F, this.G, this.H);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldCoreModifier)) {
            return false;
        }
        TextFieldCoreModifier textFieldCoreModifier = (TextFieldCoreModifier) obj;
        return this.f6288z == textFieldCoreModifier.f6288z && this.f6286A == textFieldCoreModifier.f6286A && Intrinsics.d(this.f6287B, textFieldCoreModifier.f6287B) && Intrinsics.d(this.C, textFieldCoreModifier.C) && Intrinsics.d(this.D, textFieldCoreModifier.D) && Intrinsics.d(this.E, textFieldCoreModifier.E) && this.F == textFieldCoreModifier.F && Intrinsics.d(this.G, textFieldCoreModifier.G) && this.H == textFieldCoreModifier.H;
    }

    public int hashCode() {
        return (((((((((((((((Boolean.hashCode(this.f6288z) * 31) + Boolean.hashCode(this.f6286A)) * 31) + this.f6287B.hashCode()) * 31) + this.C.hashCode()) * 31) + this.D.hashCode()) * 31) + this.E.hashCode()) * 31) + Boolean.hashCode(this.F)) * 31) + this.G.hashCode()) * 31) + this.H.hashCode();
    }

    public String toString() {
        return "TextFieldCoreModifier(isFocused=" + this.f6288z + ", isDragHovered=" + this.f6286A + ", textLayoutState=" + this.f6287B + ", textFieldState=" + this.C + ", textFieldSelectionState=" + this.D + ", cursorBrush=" + this.E + ", writeable=" + this.F + ", scrollState=" + this.G + ", orientation=" + this.H + ')';
    }
}
