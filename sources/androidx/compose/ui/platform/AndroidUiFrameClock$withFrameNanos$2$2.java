package androidx.compose.ui.platform;

import android.view.Choreographer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidUiFrameClock$withFrameNanos$2$2 extends Lambda implements Function1<Throwable, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Choreographer.FrameCallback f17646A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AndroidUiFrameClock f17647z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidUiFrameClock$withFrameNanos$2$2(AndroidUiFrameClock androidUiFrameClock, Choreographer.FrameCallback frameCallback) {
        super(1);
        this.f17647z = androidUiFrameClock;
        this.f17646A = frameCallback;
    }

    public final void b(Throwable th) {
        this.f17647z.e().removeFrameCallback(this.f17646A);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Throwable) obj);
        return Unit.f40552a;
    }
}
