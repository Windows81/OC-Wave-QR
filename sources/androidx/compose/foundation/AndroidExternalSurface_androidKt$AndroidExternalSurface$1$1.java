package androidx.compose.foundation;

import android.content.Context;
import android.view.SurfaceView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidExternalSurface_androidKt$AndroidExternalSurface$1$1 extends Lambda implements Function1<Context, SurfaceView> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ AndroidExternalSurfaceState f2905A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Function1 f2906z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidExternalSurface_androidKt$AndroidExternalSurface$1$1(Function1 function1, AndroidExternalSurfaceState androidExternalSurfaceState) {
        super(1);
        this.f2906z = function1;
        this.f2905A = androidExternalSurfaceState;
    }

    /* renamed from: b */
    public final SurfaceView invoke(Context context) {
        SurfaceView surfaceView = new SurfaceView(context);
        Function1 function1 = this.f2906z;
        AndroidExternalSurfaceState androidExternalSurfaceState = this.f2905A;
        function1.invoke(androidExternalSurfaceState);
        surfaceView.getHolder().addCallback(androidExternalSurfaceState);
        return surfaceView;
    }
}
