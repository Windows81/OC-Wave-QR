package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

public final /* synthetic */ class M implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ float f10254A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ float f10255B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ Shape D;
    public final /* synthetic */ long E;
    public final /* synthetic */ long F;
    public final /* synthetic */ float G;
    public final /* synthetic */ float H;
    public final /* synthetic */ Function2 I;
    public final /* synthetic */ Function3 J;
    public final /* synthetic */ int K;
    public final /* synthetic */ int L;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SheetState f10256z;

    public /* synthetic */ M(SheetState sheetState, float f2, float f3, boolean z2, Shape shape, long j2, long j3, float f4, float f5, Function2 function2, Function3 function3, int i2, int i3) {
        this.f10256z = sheetState;
        this.f10254A = f2;
        this.f10255B = f3;
        this.C = z2;
        this.D = shape;
        this.E = j2;
        this.F = j3;
        this.G = f4;
        this.H = f5;
        this.I = function2;
        this.J = function3;
        this.K = i2;
        this.L = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return BottomSheetScaffoldKt.o(this.f10256z, this.f10254A, this.f10255B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, (Composer) obj, ((Integer) obj2).intValue());
    }
}
