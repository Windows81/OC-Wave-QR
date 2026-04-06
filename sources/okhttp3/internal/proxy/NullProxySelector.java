package okhttp3.internal.proxy;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata
public final class NullProxySelector extends ProxySelector {

    /* renamed from: a  reason: collision with root package name */
    public static final NullProxySelector f43232a = new NullProxySelector();

    public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }

    public List select(URI uri) {
        if (uri != null) {
            return CollectionsKt.e(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null");
    }
}
