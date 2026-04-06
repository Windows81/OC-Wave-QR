package androidx.webkit.internal;

import android.webkit.ServiceWorkerController;
import android.webkit.ServiceWorkerWebSettings;

public class ApiHelperForN {
    public static ServiceWorkerController a() {
        return ServiceWorkerController.getInstance();
    }

    public static ServiceWorkerWebSettings b(ServiceWorkerController serviceWorkerController) {
        return serviceWorkerController.getServiceWorkerWebSettings();
    }

    public static ServiceWorkerWebSettingsImpl c(ServiceWorkerController serviceWorkerController) {
        return new ServiceWorkerWebSettingsImpl(b(serviceWorkerController));
    }
}
