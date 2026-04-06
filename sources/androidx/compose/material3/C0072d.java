package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.window.DialogProperties;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* renamed from: androidx.compose.material3.d  reason: case insensitive filesystem */
public final /* synthetic */ class C0072d implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f11987A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f11988B;
    public final /* synthetic */ Function2 C;
    public final /* synthetic */ Function2 D;
    public final /* synthetic */ Function2 E;
    public final /* synthetic */ Function2 F;
    public final /* synthetic */ Shape G;
    public final /* synthetic */ long H;
    public final /* synthetic */ long I;
    public final /* synthetic */ long J;
    public final /* synthetic */ long K;
    public final /* synthetic */ float L;
    public final /* synthetic */ DialogProperties M;
    public final /* synthetic */ int N;
    public final /* synthetic */ int O;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f11989z;

    public /* synthetic */ C0072d(Function0 function0, Function2 function2, Modifier modifier, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Shape shape, long j2, long j3, long j4, long j5, float f2, DialogProperties dialogProperties, int i2, int i3) {
        this.f11989z = function0;
        this.f11987A = function2;
        this.f11988B = modifier;
        this.C = function22;
        this.D = function23;
        this.E = function24;
        this.F = function25;
        this.G = shape;
        this.H = j2;
        this.I = j3;
        this.J = j4;
        this.K = j5;
        this.L = f2;
        this.M = dialogProperties;
        this.N = i2;
        this.O = i3;
    }

    public final Object m(Object obj, Object obj2) {
        Function0 function0 = this.f11989z;
        Function2 function2 = this.f11987A;
        return AlertDialogKt.k(function0, function2, this.f11988B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, (Composer) obj, ((Integer) obj2).intValue());
    }
}
