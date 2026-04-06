package okhttp3;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealConnectionPool;

@Metadata
public final class ConnectionPool {

    /* renamed from: a  reason: collision with root package name */
    public final RealConnectionPool f42593a;

    public ConnectionPool(RealConnectionPool realConnectionPool) {
        Intrinsics.i(realConnectionPool, "delegate");
        this.f42593a = realConnectionPool;
    }

    public final RealConnectionPool a() {
        return this.f42593a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ConnectionPool(int i2, long j2, TimeUnit timeUnit) {
        this(new RealConnectionPool(TaskRunner.f42891i, i2, j2, timeUnit));
        Intrinsics.i(timeUnit, "timeUnit");
    }

    public ConnectionPool() {
        this(5, 5, TimeUnit.MINUTES);
    }
}
