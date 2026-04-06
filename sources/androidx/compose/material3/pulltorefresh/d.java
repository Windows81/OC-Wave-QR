package androidx.compose.material3.pulltorefresh;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

public final /* synthetic */ class d implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ PullToRefreshState f12625A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f12626B;
    public final /* synthetic */ Modifier C;
    public final /* synthetic */ float D;
    public final /* synthetic */ Shape E;
    public final /* synthetic */ long F;
    public final /* synthetic */ float G;
    public final /* synthetic */ Function3 H;
    public final /* synthetic */ int I;
    public final /* synthetic */ int J;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PullToRefreshDefaults f12627z;

    public /* synthetic */ d(PullToRefreshDefaults pullToRefreshDefaults, PullToRefreshState pullToRefreshState, boolean z2, Modifier modifier, float f2, Shape shape, long j2, float f3, Function3 function3, int i2, int i3) {
        this.f12627z = pullToRefreshDefaults;
        this.f12625A = pullToRefreshState;
        this.f12626B = z2;
        this.C = modifier;
        this.D = f2;
        this.E = shape;
        this.F = j2;
        this.G = f3;
        this.H = function3;
        this.I = i2;
        this.J = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return PullToRefreshDefaults.m(this.f12627z, this.f12625A, this.f12626B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, (Composer) obj, ((Integer) obj2).intValue());
    }
}
