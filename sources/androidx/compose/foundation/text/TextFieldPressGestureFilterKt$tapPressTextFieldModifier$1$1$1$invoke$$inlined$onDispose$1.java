package androidx.compose.foundation.text;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;

@Metadata
public final class TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$1$1$invoke$$inlined$onDispose$1 implements DisposableEffectResult {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MutableState f5936a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f5937b;

    public TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$1$1$invoke$$inlined$onDispose$1(MutableState mutableState, MutableInteractionSource mutableInteractionSource) {
        this.f5936a = mutableState;
        this.f5937b = mutableInteractionSource;
    }

    public void d() {
        PressInteraction.Press press = (PressInteraction.Press) this.f5936a.getValue();
        if (press != null) {
            PressInteraction.Cancel cancel = new PressInteraction.Cancel(press);
            MutableInteractionSource mutableInteractionSource = this.f5937b;
            if (mutableInteractionSource != null) {
                mutableInteractionSource.b(cancel);
            }
            this.f5936a.setValue((Object) null);
        }
    }
}
