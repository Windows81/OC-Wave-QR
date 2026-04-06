package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class v8 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ MutableState f14440A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f14441z;

    public /* synthetic */ v8(String str, MutableState mutableState) {
        this.f14441z = str;
        this.f14440A = mutableState;
    }

    public final Object invoke(Object obj) {
        return WideNavigationRailKt.y(this.f14441z, this.f14440A, (SemanticsPropertyReceiver) obj);
    }
}
