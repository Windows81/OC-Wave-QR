package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.internal.FloatProducer;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* renamed from: androidx.compose.material3.f7  reason: case insensitive filesystem */
public final /* synthetic */ class C0100f7 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f12039A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f12040B;
    public final /* synthetic */ Function3 C;
    public final /* synthetic */ Function2 D;
    public final /* synthetic */ Function2 E;
    public final /* synthetic */ Function2 F;
    public final /* synthetic */ Function2 G;
    public final /* synthetic */ boolean H;
    public final /* synthetic */ TextFieldLabelPosition I;
    public final /* synthetic */ FloatProducer J;
    public final /* synthetic */ Function2 K;
    public final /* synthetic */ Function2 L;
    public final /* synthetic */ PaddingValues M;
    public final /* synthetic */ int N;
    public final /* synthetic */ int O;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f12041z;

    public /* synthetic */ C0100f7(Modifier modifier, Function2 function2, Function2 function22, Function3 function3, Function2 function23, Function2 function24, Function2 function25, Function2 function26, boolean z2, TextFieldLabelPosition textFieldLabelPosition, FloatProducer floatProducer, Function2 function27, Function2 function28, PaddingValues paddingValues, int i2, int i3) {
        this.f12041z = modifier;
        this.f12039A = function2;
        this.f12040B = function22;
        this.C = function3;
        this.D = function23;
        this.E = function24;
        this.F = function25;
        this.G = function26;
        this.H = z2;
        this.I = textFieldLabelPosition;
        this.J = floatProducer;
        this.K = function27;
        this.L = function28;
        this.M = paddingValues;
        this.N = i2;
        this.O = i3;
    }

    public final Object m(Object obj, Object obj2) {
        int intValue = ((Integer) obj2).intValue();
        return TextFieldKt.e(this.f12041z, this.f12039A, this.f12040B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, (Composer) obj, intValue);
    }
}
