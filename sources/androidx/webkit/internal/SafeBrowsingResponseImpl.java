package androidx.webkit.internal;

import android.webkit.SafeBrowsingResponse;
import androidx.webkit.SafeBrowsingResponseCompat;
import androidx.webkit.internal.ApiFeature;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

public class SafeBrowsingResponseImpl extends SafeBrowsingResponseCompat {

    /* renamed from: a  reason: collision with root package name */
    public SafeBrowsingResponse f23148a;

    /* renamed from: b  reason: collision with root package name */
    public SafeBrowsingResponseBoundaryInterface f23149b;

    public SafeBrowsingResponseImpl(InvocationHandler invocationHandler) {
        this.f23149b = (SafeBrowsingResponseBoundaryInterface) BoundaryInterfaceReflectionUtil.a(SafeBrowsingResponseBoundaryInterface.class, invocationHandler);
    }

    public void a(boolean z2) {
        ApiFeature.O_MR1 o_mr1 = WebViewFeatureInternal.f23200z;
        if (o_mr1.c()) {
            ApiHelperForOMR1.a(c(), z2);
        } else if (o_mr1.d()) {
            b().showInterstitial(z2);
        } else {
            throw WebViewFeatureInternal.a();
        }
    }

    public final SafeBrowsingResponseBoundaryInterface b() {
        if (this.f23149b == null) {
            this.f23149b = (SafeBrowsingResponseBoundaryInterface) BoundaryInterfaceReflectionUtil.a(SafeBrowsingResponseBoundaryInterface.class, WebViewGlueCommunicator.c().b(this.f23148a));
        }
        return this.f23149b;
    }

    public final SafeBrowsingResponse c() {
        if (this.f23148a == null) {
            this.f23148a = WebViewGlueCommunicator.c().a(Proxy.getInvocationHandler(this.f23149b));
        }
        return this.f23148a;
    }

    public SafeBrowsingResponseImpl(SafeBrowsingResponse safeBrowsingResponse) {
        this.f23148a = safeBrowsingResponse;
    }
}
