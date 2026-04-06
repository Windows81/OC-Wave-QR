package r;

import androidx.compose.runtime.MutableState;
import com.google.android.gms.wallet.button.PayButton;
import com.google.pay.button.PayButtonKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class c implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f34135A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function0 f34136B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MutableState f34137z;

    public /* synthetic */ c(MutableState mutableState, boolean z2, Function0 function0) {
        this.f34137z = mutableState;
        this.f34135A = z2;
        this.f34136B = function0;
    }

    public final Object invoke(Object obj) {
        return PayButtonKt.i(this.f34137z, this.f34135A, this.f34136B, (PayButton) obj);
    }
}
