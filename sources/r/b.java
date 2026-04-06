package r;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.google.pay.button.ButtonTheme;
import com.google.pay.button.ButtonType;
import com.google.pay.button.PayButtonKt;
import kotlin.jvm.functions.Function1;

public final /* synthetic */ class b implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ButtonType f34132A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f34133B;
    public final /* synthetic */ String C;
    public final /* synthetic */ Function1 D;
    public final /* synthetic */ MutableState E;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ButtonTheme f34134z;

    public /* synthetic */ b(ButtonTheme buttonTheme, ButtonType buttonType, int i2, String str, Function1 function1, MutableState mutableState) {
        this.f34134z = buttonTheme;
        this.f34132A = buttonType;
        this.f34133B = i2;
        this.C = str;
        this.D = function1;
        this.E = mutableState;
    }

    public final Object invoke(Object obj) {
        return PayButtonKt.h(this.f34134z, this.f34132A, this.f34133B, this.C, this.D, this.E, (Context) obj);
    }
}
