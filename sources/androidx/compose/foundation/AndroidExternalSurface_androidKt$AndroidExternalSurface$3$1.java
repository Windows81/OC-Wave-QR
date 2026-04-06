package androidx.compose.foundation;

import android.view.SurfaceHolder;
import android.view.SurfaceView;
import androidx.compose.foundation.AndroidExternalSurfaceZOrder;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1 extends Lambda implements Function1<SurfaceView, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ boolean f2908A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ int f2909B;
    public final /* synthetic */ boolean C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ long f2910z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidExternalSurface_androidKt$AndroidExternalSurface$3$1(long j2, boolean z2, int i2, boolean z3) {
        super(1);
        this.f2910z = j2;
        this.f2908A = z2;
        this.f2909B = i2;
        this.C = z3;
    }

    public final void b(SurfaceView surfaceView) {
        if (!IntSize.e(this.f2910z, IntSize.f19170b.a())) {
            SurfaceHolder holder = surfaceView.getHolder();
            long j2 = this.f2910z;
            holder.setFixedSize((int) (j2 >> 32), (int) (j2 & 4294967295L));
        } else {
            surfaceView.getHolder().setSizeFromLayout();
        }
        surfaceView.getHolder().setFormat(this.f2908A ? -1 : -3);
        int i2 = this.f2909B;
        AndroidExternalSurfaceZOrder.Companion companion = AndroidExternalSurfaceZOrder.f2892b;
        if (AndroidExternalSurfaceZOrder.f(i2, companion.a())) {
            surfaceView.setZOrderOnTop(false);
        } else if (AndroidExternalSurfaceZOrder.f(i2, companion.b())) {
            surfaceView.setZOrderMediaOverlay(true);
        } else if (AndroidExternalSurfaceZOrder.f(i2, companion.c())) {
            surfaceView.setZOrderOnTop(true);
        }
        surfaceView.setSecure(this.C);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((SurfaceView) obj);
        return Unit.f40552a;
    }
}
