package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.node.ModifierNodeElement;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class LegacyAdaptingPlatformTextInputModifier extends ModifierNodeElement<LegacyAdaptingPlatformTextInputModifierNode> {

    /* renamed from: A  reason: collision with root package name */
    public final LegacyTextFieldState f6218A;

    /* renamed from: B  reason: collision with root package name */
    public final TextFieldSelectionManager f6219B;

    /* renamed from: z  reason: collision with root package name */
    public final LegacyPlatformTextInputServiceAdapter f6220z;

    public LegacyAdaptingPlatformTextInputModifier(LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter, LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager) {
        this.f6220z = legacyPlatformTextInputServiceAdapter;
        this.f6218A = legacyTextFieldState;
        this.f6219B = textFieldSelectionManager;
    }

    /* renamed from: c */
    public LegacyAdaptingPlatformTextInputModifierNode a() {
        return new LegacyAdaptingPlatformTextInputModifierNode(this.f6220z, this.f6218A, this.f6219B);
    }

    /* renamed from: d */
    public void b(LegacyAdaptingPlatformTextInputModifierNode legacyAdaptingPlatformTextInputModifierNode) {
        legacyAdaptingPlatformTextInputModifierNode.b3(this.f6220z);
        legacyAdaptingPlatformTextInputModifierNode.a3(this.f6218A);
        legacyAdaptingPlatformTextInputModifierNode.c3(this.f6219B);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegacyAdaptingPlatformTextInputModifier)) {
            return false;
        }
        LegacyAdaptingPlatformTextInputModifier legacyAdaptingPlatformTextInputModifier = (LegacyAdaptingPlatformTextInputModifier) obj;
        return Intrinsics.d(this.f6220z, legacyAdaptingPlatformTextInputModifier.f6220z) && Intrinsics.d(this.f6218A, legacyAdaptingPlatformTextInputModifier.f6218A) && Intrinsics.d(this.f6219B, legacyAdaptingPlatformTextInputModifier.f6219B);
    }

    public int hashCode() {
        return (((this.f6220z.hashCode() * 31) + this.f6218A.hashCode()) * 31) + this.f6219B.hashCode();
    }

    public String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.f6220z + ", legacyTextFieldState=" + this.f6218A + ", textFieldSelectionManager=" + this.f6219B + ')';
    }
}
