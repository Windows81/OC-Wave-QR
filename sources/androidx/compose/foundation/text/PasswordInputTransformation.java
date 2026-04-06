package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.ui.text.TextRange;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata
public final class PasswordInputTransformation implements InputTransformation {

    /* renamed from: b  reason: collision with root package name */
    public final Function0 f5859b;

    /* renamed from: c  reason: collision with root package name */
    public final MutableIntState f5860c = SnapshotIntStateKt.a(-1);

    public PasswordInputTransformation(Function0 function0) {
        this.f5859b = function0;
    }

    public void X(TextFieldBuffer textFieldBuffer) {
        if (textFieldBuffer.f().a() == 1 && TextRange.j(textFieldBuffer.f().c(0)) == 1 && TextRange.j(textFieldBuffer.f().b(0)) == 0 && !textFieldBuffer.n()) {
            int l2 = TextRange.l(textFieldBuffer.f().c(0));
            if (a() != l2) {
                this.f5859b.invoke();
                c(l2);
                return;
            }
            return;
        }
        c(-1);
    }

    public final int a() {
        return this.f5860c.e();
    }

    public final void b() {
        c(-1);
    }

    public final void c(int i2) {
        this.f5860c.k(i2);
    }
}
