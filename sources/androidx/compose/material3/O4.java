package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

public final /* synthetic */ class O4 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f10522A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function3 f10523B;
    public final /* synthetic */ Function2 C;
    public final /* synthetic */ Function2 D;
    public final /* synthetic */ Function2 E;
    public final /* synthetic */ Function2 F;
    public final /* synthetic */ Function2 G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ TextFieldLabelPosition I;
    public final /* synthetic */ FloatProducer J;
    public final /* synthetic */ Function1 K;
    public final /* synthetic */ Function2 L;
    public final /* synthetic */ Function2 M;
    public final /* synthetic */ PaddingValues N;
    public final /* synthetic */ int O;
    public final /* synthetic */ int P;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f10524z;

    public /* synthetic */ O4(Modifier modifier, Function2 function2, Function3 function3, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Function2 function26, boolean z2, TextFieldLabelPosition textFieldLabelPosition, FloatProducer floatProducer, Function1 function1, Function2 function27, Function2 function28, PaddingValues paddingValues, int i2, int i3) {
        this.f10524z = modifier;
        this.f10522A = function2;
        this.f10523B = function3;
        this.C = function22;
        this.D = function23;
        this.E = function24;
        this.F = function25;
        this.G = function26;
        this.H = z2;
        this.I = textFieldLabelPosition;
        this.J = floatProducer;
        this.K = function1;
        this.L = function27;
        this.M = function28;
        this.N = paddingValues;
        this.O = i2;
        this.P = i3;
    }

    public final Object m(Object obj, Object obj2) {
        int intValue = ((Integer) obj2).intValue();
        return OutlinedTextFieldKt.l(this.f10524z, this.f10522A, this.f10523B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, (Composer) obj, intValue);
    }
}
