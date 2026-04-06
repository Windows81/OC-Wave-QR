package androidx.compose.foundation.text;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class CoreTextFieldKt$CoreTextField$4$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ TextInputService f5672A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ TextFieldValue f5673B;
    public final /* synthetic */ ImeOptions C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LegacyTextFieldState f5674z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$4$1(LegacyTextFieldState legacyTextFieldState, TextInputService textInputService, TextFieldValue textFieldValue, ImeOptions imeOptions) {
        super(1);
        this.f5674z = legacyTextFieldState;
        this.f5672A = textInputService;
        this.f5673B = textFieldValue;
        this.C = imeOptions;
    }

    /* renamed from: b */
    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
        if (this.f5674z.f()) {
            LegacyTextFieldState legacyTextFieldState = this.f5674z;
            legacyTextFieldState.H(TextFieldDelegate.f5899a.i(this.f5672A, this.f5673B, legacyTextFieldState.p(), this.C, this.f5674z.o(), this.f5674z.n()));
        }
        return new CoreTextFieldKt$CoreTextField$4$1$invoke$$inlined$onDispose$1();
    }
}
