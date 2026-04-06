package okhttp3.internal.connection;

import kotlin.Metadata;
import okio.AsyncTimeout;

@Metadata
public final class RealCall$timeout$1 extends AsyncTimeout {

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ RealCall f42935p;

    public RealCall$timeout$1(RealCall realCall) {
        this.f42935p = realCall;
    }

    public void D() {
        this.f42935p.cancel();
    }
}
