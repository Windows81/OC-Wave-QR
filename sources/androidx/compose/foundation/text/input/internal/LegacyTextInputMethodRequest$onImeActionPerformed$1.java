package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.text.input.ImeAction;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LegacyTextInputMethodRequest$onImeActionPerformed$1 extends Lambda implements Function1<ImeAction, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public static final LegacyTextInputMethodRequest$onImeActionPerformed$1 f6256z = new LegacyTextInputMethodRequest$onImeActionPerformed$1();

    public LegacyTextInputMethodRequest$onImeActionPerformed$1() {
        super(1);
    }

    public final void b(int i2) {
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b(((ImeAction) obj).p());
        return Unit.f40552a;
    }
}
