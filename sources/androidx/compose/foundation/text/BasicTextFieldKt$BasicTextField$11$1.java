package androidx.compose.foundation.text;

import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BasicTextFieldKt$BasicTextField$11$1 extends Lambda implements Function1<TextFieldValue, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function1 f5526A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldValue f5527z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasicTextFieldKt$BasicTextField$11$1(TextFieldValue textFieldValue, Function1 function1) {
        super(1);
        this.f5527z = textFieldValue;
        this.f5526A = function1;
    }

    public final void b(TextFieldValue textFieldValue) {
        if (!Intrinsics.d(this.f5527z, textFieldValue)) {
            this.f5526A.invoke(textFieldValue);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((TextFieldValue) obj);
        return Unit.f40552a;
    }
}
