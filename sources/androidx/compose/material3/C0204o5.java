package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* renamed from: androidx.compose.material3.o5  reason: case insensitive filesystem */
public final /* synthetic */ class C0204o5 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f12554A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f12555B;
    public final /* synthetic */ Function2 C;
    public final /* synthetic */ Function2 D;
    public final /* synthetic */ int E;
    public final /* synthetic */ long F;
    public final /* synthetic */ long G;
    public final /* synthetic */ WindowInsets H;
    public final /* synthetic */ Function3 I;
    public final /* synthetic */ int J;
    public final /* synthetic */ int K;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f12556z;

    public /* synthetic */ C0204o5(Modifier modifier, Function2 function2, Function2 function22, Function2 function23, Function2 function24, int i2, long j2, long j3, WindowInsets windowInsets, Function3 function3, int i3, int i4) {
        this.f12556z = modifier;
        this.f12554A = function2;
        this.f12555B = function22;
        this.C = function23;
        this.D = function24;
        this.E = i2;
        this.F = j2;
        this.G = j3;
        this.H = windowInsets;
        this.I = function3;
        this.J = i3;
        this.K = i4;
    }

    public final Object m(Object obj, Object obj2) {
        return ScaffoldKt.l(this.f12556z, this.f12554A, this.f12555B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, (Composer) obj, ((Integer) obj2).intValue());
    }
}
