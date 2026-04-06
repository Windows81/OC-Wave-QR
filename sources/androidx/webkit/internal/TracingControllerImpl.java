package androidx.webkit.internal;

import androidx.webkit.TracingController;
import androidx.webkit.internal.ApiFeature;
import org.chromium.support_lib_boundary.TracingControllerBoundaryInterface;

public class TracingControllerImpl extends TracingController {

    /* renamed from: a  reason: collision with root package name */
    public android.webkit.TracingController f23159a;

    /* renamed from: b  reason: collision with root package name */
    public TracingControllerBoundaryInterface f23160b;

    public TracingControllerImpl() {
        ApiFeature.P p2 = WebViewFeatureInternal.L;
        if (p2.c()) {
            this.f23159a = ApiHelperForP.a();
            this.f23160b = null;
        } else if (p2.d()) {
            this.f23159a = null;
            this.f23160b = WebViewGlueCommunicator.d().getTracingController();
        } else {
            throw WebViewFeatureInternal.a();
        }
    }
}
