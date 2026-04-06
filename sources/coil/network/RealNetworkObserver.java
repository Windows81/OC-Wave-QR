package coil.network;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import coil.network.NetworkObserver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class RealNetworkObserver implements NetworkObserver {

    /* renamed from: a  reason: collision with root package name */
    public final ConnectivityManager f23533a;

    /* renamed from: b  reason: collision with root package name */
    public final NetworkObserver.Listener f23534b;

    /* renamed from: c  reason: collision with root package name */
    public final RealNetworkObserver$networkCallback$1 f23535c;

    public RealNetworkObserver(ConnectivityManager connectivityManager, NetworkObserver.Listener listener) {
        this.f23533a = connectivityManager;
        this.f23534b = listener;
        RealNetworkObserver$networkCallback$1 realNetworkObserver$networkCallback$1 = new RealNetworkObserver$networkCallback$1(this);
        this.f23535c = realNetworkObserver$networkCallback$1;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), realNetworkObserver$networkCallback$1);
    }

    public boolean a() {
        for (Network c2 : this.f23533a.getAllNetworks()) {
            if (c(c2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean c(Network network) {
        NetworkCapabilities networkCapabilities = this.f23533a.getNetworkCapabilities(network);
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }

    public final void d(Network network, boolean z2) {
        Network[] allNetworks = this.f23533a.getAllNetworks();
        int length = allNetworks.length;
        boolean z3 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            Network network2 = allNetworks[i2];
            if (Intrinsics.d(network2, network) ? z2 : c(network2)) {
                z3 = true;
                break;
            }
            i2++;
        }
        this.f23534b.a(z3);
    }

    public void shutdown() {
        this.f23533a.unregisterNetworkCallback(this.f23535c);
    }
}
