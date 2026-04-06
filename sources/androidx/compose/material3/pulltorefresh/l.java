package androidx.compose.material3.pulltorefresh;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

public final /* synthetic */ class l implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function0 f12643A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ Modifier f12644B;
    public final /* synthetic */ PullToRefreshState C;
    public final /* synthetic */ Alignment D;
    public final /* synthetic */ Function3 E;
    public final /* synthetic */ Function3 F;
    public final /* synthetic */ int G;
    public final /* synthetic */ int H;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f12645z;

    public /* synthetic */ l(boolean z2, Function0 function0, Modifier modifier, PullToRefreshState pullToRefreshState, Alignment alignment, Function3 function3, Function3 function32, int i2, int i3) {
        this.f12645z = z2;
        this.f12643A = function0;
        this.f12644B = modifier;
        this.C = pullToRefreshState;
        this.D = alignment;
        this.E = function3;
        this.F = function32;
        this.G = i2;
        this.H = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return PullToRefreshKt.o(this.f12645z, this.f12643A, this.f12644B, this.C, this.D, this.E, this.F, this.G, this.H, (Composer) obj, ((Integer) obj2).intValue());
    }
}
