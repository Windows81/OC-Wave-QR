package androidx.compose.material3.internal;

import androidx.compose.material3.TextFieldLabelPosition;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Size;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class a0 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ State f12390A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ MutableState f12391B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TextFieldLabelPosition f12392z;

    public /* synthetic */ a0(TextFieldLabelPosition textFieldLabelPosition, State state, MutableState mutableState) {
        this.f12392z = textFieldLabelPosition;
        this.f12390A = state;
        this.f12391B = mutableState;
    }

    public final Object invoke(Object obj) {
        return TextFieldImplKt.o(this.f12392z, this.f12390A, this.f12391B, (Size) obj);
    }
}
