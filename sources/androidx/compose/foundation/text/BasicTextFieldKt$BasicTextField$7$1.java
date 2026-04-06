package androidx.compose.foundation.text;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BasicTextFieldKt$BasicTextField$7$1 extends Lambda implements Function0<Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MutableState f5553A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldValue f5554z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasicTextFieldKt$BasicTextField$7$1(TextFieldValue textFieldValue, MutableState mutableState) {
        super(0);
        this.f5554z = textFieldValue;
        this.f5553A = mutableState;
    }

    public final void invoke() {
        if (!TextRange.g(this.f5554z.h(), BasicTextFieldKt.g(this.f5553A).h()) || !Intrinsics.d(this.f5554z.g(), BasicTextFieldKt.g(this.f5553A).g())) {
            BasicTextFieldKt.h(this.f5553A, this.f5554z);
        }
    }
}
