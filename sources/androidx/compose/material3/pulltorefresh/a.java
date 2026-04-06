package androidx.compose.material3.pulltorefresh;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function2;

public final /* synthetic */ class a implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ PullToRefreshState f12619A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ boolean f12620B;
    public final /* synthetic */ Modifier C;
    public final /* synthetic */ long D;
    public final /* synthetic */ long E;
    public final /* synthetic */ float F;
    public final /* synthetic */ int G;
    public final /* synthetic */ int H;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ PullToRefreshDefaults f12621z;

    public /* synthetic */ a(PullToRefreshDefaults pullToRefreshDefaults, PullToRefreshState pullToRefreshState, boolean z2, Modifier modifier, long j2, long j3, float f2, int i2, int i3) {
        this.f12621z = pullToRefreshDefaults;
        this.f12619A = pullToRefreshState;
        this.f12620B = z2;
        this.C = modifier;
        this.D = j2;
        this.E = j3;
        this.F = f2;
        this.G = i2;
        this.H = i3;
    }

    public final Object m(Object obj, Object obj2) {
        return PullToRefreshDefaults.n(this.f12621z, this.f12619A, this.f12620B, this.C, this.D, this.E, this.F, this.G, this.H, (Composer) obj, ((Integer) obj2).intValue());
    }
}
