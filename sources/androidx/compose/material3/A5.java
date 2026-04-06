package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.internal.PredictiveBackState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

public final /* synthetic */ class A5 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ PredictiveBackState f9115A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Function2 f9116B;
    public final /* synthetic */ Modifier C;
    public final /* synthetic */ Shape D;
    public final /* synthetic */ SearchBarColors E;
    public final /* synthetic */ float F;
    public final /* synthetic */ float G;
    public final /* synthetic */ WindowInsets H;
    public final /* synthetic */ Function3 I;
    public final /* synthetic */ int J;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SearchBarState f9117z;

    public /* synthetic */ A5(SearchBarState searchBarState, PredictiveBackState predictiveBackState, Function2 function2, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f2, float f3, WindowInsets windowInsets, Function3 function3, int i2) {
        this.f9117z = searchBarState;
        this.f9115A = predictiveBackState;
        this.f9116B = function2;
        this.C = modifier;
        this.D = shape;
        this.E = searchBarColors;
        this.F = f2;
        this.G = f3;
        this.H = windowInsets;
        this.I = function3;
        this.J = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return SearchBarKt.o(this.f9117z, this.f9115A, this.f9116B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, (Composer) obj, ((Integer) obj2).intValue());
    }
}
