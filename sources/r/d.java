package r;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.google.pay.button.ButtonTheme;
import com.google.pay.button.ButtonType;
import com.google.pay.button.PayButtonKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class d implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f34138A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f34139B;
    public final /* synthetic */ ButtonTheme C;
    public final /* synthetic */ ButtonType D;
    public final /* synthetic */ float E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ Function1 G;
    public final /* synthetic */ Function2 H;
    public final /* synthetic */ int I;
    public final /* synthetic */ int J;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f34140z;

    public /* synthetic */ d(Function0 function0, String str, Modifier modifier, ButtonTheme buttonTheme, ButtonType buttonType, float f2, boolean z2, Function1 function1, Function2 function2, int i2, int i3) {
        this.f34140z = function0;
        this.f34138A = str;
        this.f34139B = modifier;
        this.C = buttonTheme;
        this.D = buttonType;
        this.E = f2;
        this.F = z2;
        this.G = function1;
        this.H = function2;
        this.I = i2;
        this.J = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return PayButtonKt.k(this.f34140z, this.f34138A, this.f34139B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, (Composer) obj, ((Integer) obj2).intValue());
    }
}
