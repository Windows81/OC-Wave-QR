package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.TextFieldState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class TransformedTextFieldState$collectImeNotifications$2$1 extends Lambda implements Function1<Throwable, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ TextFieldState.NotifyImeListener f6409A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TransformedTextFieldState f6410z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TransformedTextFieldState$collectImeNotifications$2$1(TransformedTextFieldState transformedTextFieldState, TextFieldState.NotifyImeListener notifyImeListener) {
        super(1);
        this.f6410z = transformedTextFieldState;
        this.f6409A = notifyImeListener;
    }

    public final void b(Throwable th) {
        this.f6410z.f6397a.o(this.f6409A);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Throwable) obj);
        return Unit.f40552a;
    }
}
