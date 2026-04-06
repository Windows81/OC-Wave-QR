package okhttp3.internal.connection;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Route;

@Metadata
public final class RouteDatabase {

    /* renamed from: a  reason: collision with root package name */
    public final Set f42966a = new LinkedHashSet();

    public final synchronized void a(Route route) {
        Intrinsics.i(route, "route");
        this.f42966a.remove(route);
    }

    public final synchronized void b(Route route) {
        Intrinsics.i(route, "failedRoute");
        this.f42966a.add(route);
    }

    public final synchronized boolean c(Route route) {
        Intrinsics.i(route, "route");
        return this.f42966a.contains(route);
    }
}
