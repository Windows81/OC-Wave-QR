package androidx.webkit.internal;

import androidx.webkit.WebViewRenderProcess;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.util.WeakHashMap;
import org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

public class WebViewRenderProcessImpl extends WebViewRenderProcess {

    /* renamed from: c  reason: collision with root package name */
    public static final WeakHashMap f23209c = new WeakHashMap();

    /* renamed from: a  reason: collision with root package name */
    public WebViewRendererBoundaryInterface f23210a;

    /* renamed from: b  reason: collision with root package name */
    public WeakReference f23211b;

    public WebViewRenderProcessImpl(WebViewRendererBoundaryInterface webViewRendererBoundaryInterface) {
        this.f23210a = webViewRendererBoundaryInterface;
    }

    public static WebViewRenderProcessImpl b(android.webkit.WebViewRenderProcess webViewRenderProcess) {
        WeakHashMap weakHashMap = f23209c;
        WebViewRenderProcessImpl webViewRenderProcessImpl = (WebViewRenderProcessImpl) weakHashMap.get(webViewRenderProcess);
        if (webViewRenderProcessImpl != null) {
            return webViewRenderProcessImpl;
        }
        WebViewRenderProcessImpl webViewRenderProcessImpl2 = new WebViewRenderProcessImpl(webViewRenderProcess);
        weakHashMap.put(webViewRenderProcess, webViewRenderProcessImpl2);
        return webViewRenderProcessImpl2;
    }

    public static WebViewRenderProcessImpl c(InvocationHandler invocationHandler) {
        WebViewRendererBoundaryInterface webViewRendererBoundaryInterface = (WebViewRendererBoundaryInterface) BoundaryInterfaceReflectionUtil.a(WebViewRendererBoundaryInterface.class, invocationHandler);
        return (WebViewRenderProcessImpl) webViewRendererBoundaryInterface.getOrCreatePeer(new g(webViewRendererBoundaryInterface));
    }

    public static /* synthetic */ Object d(WebViewRendererBoundaryInterface webViewRendererBoundaryInterface) {
        return new WebViewRenderProcessImpl(webViewRendererBoundaryInterface);
    }

    public WebViewRenderProcessImpl(android.webkit.WebViewRenderProcess webViewRenderProcess) {
        this.f23211b = new WeakReference(webViewRenderProcess);
    }
}
