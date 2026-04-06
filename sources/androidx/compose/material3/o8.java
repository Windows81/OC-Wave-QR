package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class o8 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f12560A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f12561B;
    public final /* synthetic */ WideNavigationRailColors C;
    public final /* synthetic */ Shape D;
    public final /* synthetic */ Function2 E;
    public final /* synthetic */ WindowInsets F;
    public final /* synthetic */ Arrangement.Vertical G;
    public final /* synthetic */ Function2 H;
    public final /* synthetic */ int I;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Modifier f12562z;

    public /* synthetic */ o8(Modifier modifier, boolean z2, boolean z3, WideNavigationRailColors wideNavigationRailColors, Shape shape, Function2 function2, WindowInsets windowInsets, Arrangement.Vertical vertical, Function2 function22, int i2) {
        this.f12562z = modifier;
        this.f12560A = z2;
        this.f12561B = z3;
        this.C = wideNavigationRailColors;
        this.D = shape;
        this.E = function2;
        this.F = windowInsets;
        this.G = vertical;
        this.H = function22;
        this.I = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return WideNavigationRailKt.F(this.f12562z, this.f12560A, this.f12561B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, (Composer) obj, ((Integer) obj2).intValue());
    }
}
