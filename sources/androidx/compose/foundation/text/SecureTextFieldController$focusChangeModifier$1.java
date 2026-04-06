package androidx.compose.foundation.text;

import androidx.compose.ui.focus.FocusState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class SecureTextFieldController$focusChangeModifier$1 extends Lambda implements Function1<FocusState, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SecureTextFieldController f5867z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SecureTextFieldController$focusChangeModifier$1(SecureTextFieldController secureTextFieldController) {
        super(1);
        this.f5867z = secureTextFieldController;
    }

    public final void b(FocusState focusState) {
        if (!focusState.f()) {
            this.f5867z.f().b();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((FocusState) obj);
        return Unit.f40552a;
    }
}
