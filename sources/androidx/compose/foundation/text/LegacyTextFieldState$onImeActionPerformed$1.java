package androidx.compose.foundation.text;

import androidx.compose.ui.text.input.ImeAction;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LegacyTextFieldState$onImeActionPerformed$1 extends Lambda implements Function1<ImeAction, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LegacyTextFieldState f5808z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LegacyTextFieldState$onImeActionPerformed$1(LegacyTextFieldState legacyTextFieldState) {
        super(1);
        this.f5808z = legacyTextFieldState;
    }

    public final void b(int i2) {
        this.f5808z.f5799r.d(i2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b(((ImeAction) obj).p());
        return Unit.f40552a;
    }
}
