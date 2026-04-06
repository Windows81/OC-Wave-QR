package okhttp3.internal.connection;

import java.io.IOException;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class RouteException extends RuntimeException {

    /* renamed from: A  reason: collision with root package name */
    public IOException f42967A;

    /* renamed from: z  reason: collision with root package name */
    public final IOException f42968z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RouteException(IOException iOException) {
        super(iOException);
        Intrinsics.i(iOException, "firstConnectException");
        this.f42968z = iOException;
        this.f42967A = iOException;
    }

    public final void a(IOException iOException) {
        Intrinsics.i(iOException, "e");
        ExceptionsKt.a(this.f42968z, iOException);
        this.f42967A = iOException;
    }

    public final IOException b() {
        return this.f42968z;
    }

    public final IOException c() {
        return this.f42967A;
    }
}
