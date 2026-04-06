package androidx.webkit.internal;

import android.webkit.SafeBrowsingResponse;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceError;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

public class WebkitToCompatConverter {

    /* renamed from: a  reason: collision with root package name */
    public final WebkitToCompatConverterBoundaryInterface f23212a;

    public WebkitToCompatConverter(WebkitToCompatConverterBoundaryInterface webkitToCompatConverterBoundaryInterface) {
        this.f23212a = webkitToCompatConverterBoundaryInterface;
    }

    public SafeBrowsingResponse a(InvocationHandler invocationHandler) {
        return h.a(this.f23212a.convertSafeBrowsingResponse(invocationHandler));
    }

    public InvocationHandler b(SafeBrowsingResponse safeBrowsingResponse) {
        return this.f23212a.convertSafeBrowsingResponse((Object) safeBrowsingResponse);
    }

    public InvocationHandler c(WebMessagePort webMessagePort) {
        return this.f23212a.convertWebMessagePort((Object) webMessagePort);
    }

    public WebResourceError d(InvocationHandler invocationHandler) {
        return (WebResourceError) this.f23212a.convertWebResourceError(invocationHandler);
    }

    public InvocationHandler e(WebResourceError webResourceError) {
        return this.f23212a.convertWebResourceError((Object) webResourceError);
    }
}
