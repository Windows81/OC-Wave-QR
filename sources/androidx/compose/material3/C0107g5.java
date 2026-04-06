package androidx.compose.material3;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import kotlin.jvm.functions.Function1;

/* renamed from: androidx.compose.material3.g5  reason: case insensitive filesystem */
public final /* synthetic */ class C0107g5 implements Function1 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ int f12054A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ float f12055B;
    public final /* synthetic */ float C;
    public final /* synthetic */ State D;
    public final /* synthetic */ State E;
    public final /* synthetic */ long F;
    public final /* synthetic */ Stroke G;
    public final /* synthetic */ long H;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ State f12056z;

    public /* synthetic */ C0107g5(State state, int i2, float f2, float f3, State state2, State state3, long j2, Stroke stroke, long j3) {
        this.f12056z = state;
        this.f12054A = i2;
        this.f12055B = f2;
        this.C = f3;
        this.D = state2;
        this.E = state3;
        this.F = j2;
        this.G = stroke;
        this.H = j3;
    }

    public final Object invoke(Object obj) {
        return ProgressIndicatorKt.p(this.f12056z, this.f12054A, this.f12055B, this.C, this.D, this.E, this.F, this.G, this.H, (DrawScope) obj);
    }
}
