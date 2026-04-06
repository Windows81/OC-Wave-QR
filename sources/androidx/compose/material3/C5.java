package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

public final /* synthetic */ class C5 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function2 f9342A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f9343B;
    public final /* synthetic */ Shape C;
    public final /* synthetic */ SearchBarColors D;
    public final /* synthetic */ float E;
    public final /* synthetic */ float F;
    public final /* synthetic */ Function3 G;
    public final /* synthetic */ int H;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SearchBarState f9344z;

    public /* synthetic */ C5(SearchBarState searchBarState, Function2 function2, Modifier modifier, Shape shape, SearchBarColors searchBarColors, float f2, float f3, Function3 function3, int i2) {
        this.f9344z = searchBarState;
        this.f9342A = function2;
        this.f9343B = modifier;
        this.C = shape;
        this.D = searchBarColors;
        this.E = f2;
        this.F = f3;
        this.G = function3;
        this.H = i2;
    }

    public final Object m(Object obj, Object obj2) {
        return SearchBarKt.i(this.f9344z, this.f9342A, this.f9343B, this.C, this.D, this.E, this.F, this.G, this.H, (Composer) obj, ((Integer) obj2).intValue());
    }
}
