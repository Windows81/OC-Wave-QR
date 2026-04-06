package androidx.webkit.internal;

import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebMessagePortCompat;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

public class WebMessagePortImpl extends WebMessagePortCompat {

    /* renamed from: a  reason: collision with root package name */
    public WebMessagePort f23169a;

    /* renamed from: b  reason: collision with root package name */
    public WebMessagePortBoundaryInterface f23170b;

    public WebMessagePortImpl(WebMessagePort webMessagePort) {
        this.f23169a = webMessagePort;
    }

    public static WebMessageCompat b(WebMessage webMessage) {
        return ApiHelperForM.a(webMessage);
    }

    public static WebMessagePortCompat[] d(WebMessagePort[] webMessagePortArr) {
        if (webMessagePortArr == null) {
            return null;
        }
        WebMessagePortCompat[] webMessagePortCompatArr = new WebMessagePortCompat[webMessagePortArr.length];
        for (int i2 = 0; i2 < webMessagePortArr.length; i2++) {
            webMessagePortCompatArr[i2] = new WebMessagePortImpl(webMessagePortArr[i2]);
        }
        return webMessagePortCompatArr;
    }

    public InvocationHandler a() {
        return Proxy.getInvocationHandler(c());
    }

    public final WebMessagePortBoundaryInterface c() {
        if (this.f23170b == null) {
            this.f23170b = (WebMessagePortBoundaryInterface) BoundaryInterfaceReflectionUtil.a(WebMessagePortBoundaryInterface.class, WebViewGlueCommunicator.c().c(this.f23169a));
        }
        return this.f23170b;
    }

    public WebMessagePortImpl(InvocationHandler invocationHandler) {
        this.f23170b = (WebMessagePortBoundaryInterface) BoundaryInterfaceReflectionUtil.a(WebMessagePortBoundaryInterface.class, invocationHandler);
    }
}
