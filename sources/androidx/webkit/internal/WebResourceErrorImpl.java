package androidx.webkit.internal;

import android.webkit.WebResourceError;
import androidx.webkit.WebResourceErrorCompat;
import androidx.webkit.internal.ApiFeature;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

public class WebResourceErrorImpl extends WebResourceErrorCompat {

    /* renamed from: a  reason: collision with root package name */
    public WebResourceError f23171a;

    /* renamed from: b  reason: collision with root package name */
    public WebResourceErrorBoundaryInterface f23172b;

    public WebResourceErrorImpl(InvocationHandler invocationHandler) {
        this.f23172b = (WebResourceErrorBoundaryInterface) BoundaryInterfaceReflectionUtil.a(WebResourceErrorBoundaryInterface.class, invocationHandler);
    }

    public CharSequence a() {
        ApiFeature.M m2 = WebViewFeatureInternal.f23196v;
        if (m2.c()) {
            return ApiHelperForM.b(d());
        }
        if (m2.d()) {
            return c().getDescription();
        }
        throw WebViewFeatureInternal.a();
    }

    public int b() {
        ApiFeature.M m2 = WebViewFeatureInternal.f23197w;
        if (m2.c()) {
            return ApiHelperForM.c(d());
        }
        if (m2.d()) {
            return c().getErrorCode();
        }
        throw WebViewFeatureInternal.a();
    }

    public final WebResourceErrorBoundaryInterface c() {
        if (this.f23172b == null) {
            this.f23172b = (WebResourceErrorBoundaryInterface) BoundaryInterfaceReflectionUtil.a(WebResourceErrorBoundaryInterface.class, WebViewGlueCommunicator.c().e(this.f23171a));
        }
        return this.f23172b;
    }

    public final WebResourceError d() {
        if (this.f23171a == null) {
            this.f23171a = WebViewGlueCommunicator.c().d(Proxy.getInvocationHandler(this.f23172b));
        }
        return this.f23171a;
    }

    public WebResourceErrorImpl(WebResourceError webResourceError) {
        this.f23171a = webResourceError;
    }
}
