package androidx.webkit.internal;

import android.webkit.ServiceWorkerWebSettings;
import androidx.webkit.ServiceWorkerWebSettingsCompat;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.ServiceWorkerWebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

public class ServiceWorkerWebSettingsImpl extends ServiceWorkerWebSettingsCompat {

    /* renamed from: a  reason: collision with root package name */
    public ServiceWorkerWebSettings f23154a;

    /* renamed from: b  reason: collision with root package name */
    public ServiceWorkerWebSettingsBoundaryInterface f23155b;

    public ServiceWorkerWebSettingsImpl(ServiceWorkerWebSettings serviceWorkerWebSettings) {
        this.f23154a = serviceWorkerWebSettings;
    }

    public ServiceWorkerWebSettingsImpl(InvocationHandler invocationHandler) {
        this.f23155b = (ServiceWorkerWebSettingsBoundaryInterface) BoundaryInterfaceReflectionUtil.a(ServiceWorkerWebSettingsBoundaryInterface.class, invocationHandler);
    }
}
