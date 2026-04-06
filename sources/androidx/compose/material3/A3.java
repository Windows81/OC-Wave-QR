package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

public final /* synthetic */ class A3 implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f9109A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ SheetState f9110B;
    public final /* synthetic */ float C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ Shape E;
    public final /* synthetic */ long F;
    public final /* synthetic */ long G;
    public final /* synthetic */ float H;
    public final /* synthetic */ long I;
    public final /* synthetic */ Function2 J;
    public final /* synthetic */ Function2 K;
    public final /* synthetic */ ModalBottomSheetProperties L;
    public final /* synthetic */ Function3 M;
    public final /* synthetic */ int N;
    public final /* synthetic */ int O;
    public final /* synthetic */ int P;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function0 f9111z;

    public /* synthetic */ A3(Function0 function0, Modifier modifier, SheetState sheetState, float f2, boolean z2, Shape shape, long j2, long j3, float f3, long j4, Function2 function2, Function2 function22, ModalBottomSheetProperties modalBottomSheetProperties, Function3 function3, int i2, int i3, int i4) {
        this.f9111z = function0;
        this.f9109A = modifier;
        this.f9110B = sheetState;
        this.C = f2;
        this.D = z2;
        this.E = shape;
        this.F = j2;
        this.G = j3;
        this.H = f3;
        this.I = j4;
        this.J = function2;
        this.K = function22;
        this.L = modalBottomSheetProperties;
        this.M = function3;
        this.N = i2;
        this.O = i3;
        this.P = i4;
    }

    public final Object m(Object obj, Object obj2) {
        int intValue = ((Integer) obj2).intValue();
        return ModalBottomSheetKt.C(this.f9111z, this.f9109A, this.f9110B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P, (Composer) obj, intValue);
    }
}
