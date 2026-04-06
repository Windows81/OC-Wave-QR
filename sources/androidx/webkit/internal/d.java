package androidx.webkit.internal;

import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;

public final /* synthetic */ class d implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ JsReplyProxyBoundaryInterface f23213a;

    public /* synthetic */ d(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        this.f23213a = jsReplyProxyBoundaryInterface;
    }

    public final Object call() {
        return JavaScriptReplyProxyImpl.c(this.f23213a);
    }
}
