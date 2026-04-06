package androidx.compose.foundation.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LegacyTextFieldState$onValueChange$1 extends Lambda implements Function1<TextFieldValue, Unit> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ LegacyTextFieldState f5809z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LegacyTextFieldState$onValueChange$1(LegacyTextFieldState legacyTextFieldState) {
        super(1);
        this.f5809z = legacyTextFieldState;
    }

    public final void b(TextFieldValue textFieldValue) {
        String i2 = textFieldValue.i();
        AnnotatedString y2 = this.f5809z.y();
        if (!Intrinsics.d(i2, y2 != null ? y2.k() : null)) {
            this.f5809z.E(HandleState.None);
            if (this.f5809z.i()) {
                this.f5809z.I(false);
            } else {
                this.f5809z.C(false);
            }
        }
        LegacyTextFieldState legacyTextFieldState = this.f5809z;
        TextRange.Companion companion = TextRange.f18496b;
        legacyTextFieldState.M(companion.a());
        this.f5809z.D(companion.a());
        this.f5809z.f5802u.invoke(textFieldValue);
        this.f5809z.q().invalidate();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((TextFieldValue) obj);
        return Unit.f40552a;
    }
}
