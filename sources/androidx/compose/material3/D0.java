package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class D0 implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MutableState f9625z;

    public /* synthetic */ D0(MutableState mutableState) {
        this.f9625z = mutableState;
    }

    public final Object invoke(Object obj) {
        return DateInputKt.k(this.f9625z, (SemanticsPropertyReceiver) obj);
    }
}
