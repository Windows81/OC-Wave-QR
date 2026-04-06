package coil.network;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.core.content.ContextCompat;
import coil.network.NetworkObserver;
import coil.util.Contexts;
import coil.util.Logger;
import coil.util.Logs;
import kotlin.Metadata;

@Metadata
public final class NetworkObserverKt {
    public static final NetworkObserver a(Context context, NetworkObserver.Listener listener, Logger logger) {
        ConnectivityManager connectivityManager = (ConnectivityManager) ContextCompat.h(context, ConnectivityManager.class);
        if (connectivityManager == null || !Contexts.e(context, "android.permission.ACCESS_NETWORK_STATE")) {
            if (logger != null && logger.a() <= 5) {
                logger.b("NetworkObserver", 5, "Unable to register network observer.", (Throwable) null);
            }
            return new EmptyNetworkObserver();
        }
        try {
            return new RealNetworkObserver(connectivityManager, listener);
        } catch (Exception e2) {
            if (logger != null) {
                Logs.a(logger, "NetworkObserver", new RuntimeException("Failed to register network observer.", e2));
            }
            return new EmptyNetworkObserver();
        }
    }
}
