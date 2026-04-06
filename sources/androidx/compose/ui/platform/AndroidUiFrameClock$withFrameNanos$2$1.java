package androidx.compose.ui.platform;

import android.view.Choreographer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidUiFrameClock$withFrameNanos$2$1 extends Lambda implements Function1<Throwable, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Choreographer.FrameCallback f17644A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ AndroidUiDispatcher f17645z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidUiFrameClock$withFrameNanos$2$1(AndroidUiDispatcher androidUiDispatcher, Choreographer.FrameCallback frameCallback) {
        super(1);
        this.f17645z = androidUiDispatcher;
        this.f17644A = frameCallback;
    }

    public final void b(Throwable th) {
        this.f17645z.I1(this.f17644A);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((Throwable) obj);
        return Unit.f40552a;
    }
}
