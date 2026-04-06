package coil.network;

import android.net.ConnectivityManager;
import android.net.Network;
import kotlin.Metadata;

@Metadata
public final class RealNetworkObserver$networkCallback$1 extends ConnectivityManager.NetworkCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RealNetworkObserver f23536a;

    public RealNetworkObserver$networkCallback$1(RealNetworkObserver realNetworkObserver) {
        this.f23536a = realNetworkObserver;
    }

    public void onAvailable(Network network) {
        this.f23536a.d(network, true);
    }

    public void onLost(Network network) {
        this.f23536a.d(network, false);
    }
}
