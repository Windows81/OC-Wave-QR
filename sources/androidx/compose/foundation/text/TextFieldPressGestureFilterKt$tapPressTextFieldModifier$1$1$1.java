package androidx.compose.foundation.text;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$1$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MutableInteractionSource f5940A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MutableState f5941z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$1$1(MutableState mutableState, MutableInteractionSource mutableInteractionSource) {
        super(1);
        this.f5941z = mutableState;
        this.f5940A = mutableInteractionSource;
    }

    /* renamed from: b */
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        return new TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$1$1$invoke$$inlined$onDispose$1(this.f5941z, this.f5940A);
    }
}
