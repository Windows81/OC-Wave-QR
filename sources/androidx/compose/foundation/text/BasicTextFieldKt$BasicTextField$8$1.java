package androidx.compose.foundation.text;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class BasicTextFieldKt$BasicTextField$8$1 extends Lambda implements Function1<TextFieldValue, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MutableState f5555A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ MutableState f5556B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f5557z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BasicTextFieldKt$BasicTextField$8$1(Function1 function1, MutableState mutableState, MutableState mutableState2) {
        super(1);
        this.f5557z = function1;
        this.f5555A = mutableState;
        this.f5556B = mutableState2;
    }

    public final void b(TextFieldValue textFieldValue) {
        BasicTextFieldKt.h(this.f5555A, textFieldValue);
        boolean d2 = Intrinsics.d(BasicTextFieldKt.i(this.f5556B), textFieldValue.i());
        BasicTextFieldKt.j(this.f5556B, textFieldValue.i());
        if (!d2) {
            this.f5557z.invoke(textFieldValue.i());
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((TextFieldValue) obj);
        return Unit.f40552a;
    }
}
