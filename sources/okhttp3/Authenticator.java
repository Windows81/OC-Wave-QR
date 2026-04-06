package okhttp3;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.authenticator.JavaNetAuthenticator;

@Metadata
public interface Authenticator {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f42496a = Companion.f42499a;

    /* renamed from: b  reason: collision with root package name */
    public static final Authenticator f42497b = new Companion.AuthenticatorNone();

    /* renamed from: c  reason: collision with root package name */
    public static final Authenticator f42498c = new JavaNetAuthenticator((Dns) null, 1, (DefaultConstructorMarker) null);

    @Metadata
    public static final class Companion {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ Companion f42499a = new Companion();

        @Metadata
        public static final class AuthenticatorNone implements Authenticator {
            public Request a(Route route, Response response) {
                Intrinsics.i(response, "response");
                return null;
            }
        }
    }

    Request a(Route route, Response response);
}
