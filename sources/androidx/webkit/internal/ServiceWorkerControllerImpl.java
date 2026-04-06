package androidx.webkit.internal;

import android.webkit.ServiceWorkerController;
import androidx.webkit.ServiceWorkerControllerCompat;
import androidx.webkit.ServiceWorkerWebSettingsCompat;
import androidx.webkit.internal.ApiFeature;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;

public class ServiceWorkerControllerImpl extends ServiceWorkerControllerCompat {

    /* renamed from: a  reason: collision with root package name */
    public ServiceWorkerController f23151a;

    /* renamed from: b  reason: collision with root package name */
    public ServiceWorkerControllerBoundaryInterface f23152b;

    /* renamed from: c  reason: collision with root package name */
    public final ServiceWorkerWebSettingsCompat f23153c;

    public ServiceWorkerControllerImpl() {
        ApiFeature.N n2 = WebViewFeatureInternal.f23185k;
        if (n2.c()) {
            this.f23151a = ApiHelperForN.a();
            this.f23152b = null;
            this.f23153c = ApiHelperForN.c(a());
        } else if (n2.d()) {
            this.f23151a = null;
            ServiceWorkerControllerBoundaryInterface serviceWorkerController = WebViewGlueCommunicator.d().getServiceWorkerController();
            this.f23152b = serviceWorkerController;
            this.f23153c = new ServiceWorkerWebSettingsImpl(serviceWorkerController.getServiceWorkerWebSettings());
        } else {
            throw WebViewFeatureInternal.a();
        }
    }

    public final ServiceWorkerController a() {
        if (this.f23151a == null) {
            this.f23151a = ApiHelperForN.a();
        }
        return this.f23151a;
    }
}
