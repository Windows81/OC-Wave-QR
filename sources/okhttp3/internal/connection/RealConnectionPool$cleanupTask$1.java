package okhttp3.internal.connection;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.concurrent.Task;

@Metadata
public final class RealConnectionPool$cleanupTask$1 extends Task {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ RealConnectionPool f42965e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RealConnectionPool$cleanupTask$1(RealConnectionPool realConnectionPool, String str) {
        super(str, false, 2, (DefaultConstructorMarker) null);
        this.f42965e = realConnectionPool;
    }

    public long f() {
        return this.f42965e.b(System.nanoTime());
    }
}
