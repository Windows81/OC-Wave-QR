package okio;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class Timeout$Companion$NONE$1 extends Timeout {
    public Timeout e(long j2) {
        return this;
    }

    public void g() {
    }

    public Timeout h(long j2, TimeUnit timeUnit) {
        Intrinsics.i(timeUnit, "unit");
        return this;
    }
}
