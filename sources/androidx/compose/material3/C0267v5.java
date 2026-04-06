package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: androidx.compose.material3.v5  reason: case insensitive filesystem */
public final /* synthetic */ class C0267v5 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f14433A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function1 f14434B;
    public final /* synthetic */ Function1 C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ Function1 E;
    public final /* synthetic */ Modifier F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ Function2 H;
    public final /* synthetic */ Function2 I;
    public final /* synthetic */ Function2 J;
    public final /* synthetic */ TextFieldColors K;
    public final /* synthetic */ MutableInteractionSource L;
    public final /* synthetic */ int M;
    public final /* synthetic */ int N;
    public final /* synthetic */ int O;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SearchBarDefaults f14435z;

    public /* synthetic */ C0267v5(SearchBarDefaults searchBarDefaults, String str, Function1 function1, Function1 function12, boolean z2, Function1 function13, Modifier modifier, boolean z3, Function2 function2, Function2 function22, Function2 function23, TextFieldColors textFieldColors, MutableInteractionSource mutableInteractionSource, int i2, int i3, int i4) {
        this.f14435z = searchBarDefaults;
        this.f14433A = str;
        this.f14434B = function1;
        this.C = function12;
        this.D = z2;
        this.E = function13;
        this.F = modifier;
        this.G = z3;
        this.H = function2;
        this.I = function22;
        this.J = function23;
        this.K = textFieldColors;
        this.L = mutableInteractionSource;
        this.M = i2;
        this.N = i3;
        this.O = i4;
    }

    public final Object m(Object obj, Object obj2) {
        int intValue = ((Integer) obj2).intValue();
        return SearchBarDefaults.i(this.f14435z, this.f14433A, this.f14434B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, (Composer) obj, intValue);
    }
}
