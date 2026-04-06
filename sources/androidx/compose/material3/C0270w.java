package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* renamed from: androidx.compose.material3.w  reason: case insensitive filesystem */
public final /* synthetic */ class C0270w implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f14442A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f14443B;
    public final /* synthetic */ Function3 C;
    public final /* synthetic */ float D;
    public final /* synthetic */ WindowInsets E;
    public final /* synthetic */ TopAppBarColors F;
    public final /* synthetic */ TopAppBarScrollBehavior G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int I;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function2 f14444z;

    public /* synthetic */ C0270w(Function2 function2, Modifier modifier, Function2 function22, Function3 function3, float f2, WindowInsets windowInsets, TopAppBarColors topAppBarColors, TopAppBarScrollBehavior topAppBarScrollBehavior, int i2, int i3) {
        this.f14444z = function2;
        this.f14442A = modifier;
        this.f14443B = function22;
        this.C = function3;
        this.D = f2;
        this.E = windowInsets;
        this.F = topAppBarColors;
        this.G = topAppBarScrollBehavior;
        this.H = i2;
        this.I = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return AppBarKt.D(this.f14444z, this.f14442A, this.f14443B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, (Composer) obj, ((Integer) obj2).intValue());
    }
}
