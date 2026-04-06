package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* renamed from: androidx.compose.material3.q5  reason: case insensitive filesystem */
public final /* synthetic */ class C0222q5 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f12656A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function3 f12657B;
    public final /* synthetic */ Function2 C;
    public final /* synthetic */ Function2 D;
    public final /* synthetic */ WindowInsets E;
    public final /* synthetic */ Function2 F;
    public final /* synthetic */ int G;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ int f12658z;

    public /* synthetic */ C0222q5(int i2, Function2 function2, Function3 function3, Function2 function22, Function2 function23, WindowInsets windowInsets, Function2 function24, int i3) {
        this.f12658z = i2;
        this.f12656A = function2;
        this.f12657B = function3;
        this.C = function22;
        this.D = function23;
        this.E = windowInsets;
        this.F = function24;
        this.G = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return ScaffoldKt.j(this.f12658z, this.f12656A, this.f12657B, this.C, this.D, this.E, this.F, this.G, (Composer) obj, ((Integer) obj2).intValue());
    }
}
