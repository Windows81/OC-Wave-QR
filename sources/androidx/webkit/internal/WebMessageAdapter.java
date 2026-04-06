package androidx.webkit.internal;

import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebMessagePortCompat;
import java.lang.reflect.InvocationHandler;
import java.util.Objects;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

public class WebMessageAdapter implements WebMessageBoundaryInterface {

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f23162b = {"WEB_MESSAGE_ARRAY_BUFFER"};

    /* renamed from: a  reason: collision with root package name */
    public final WebMessageCompat f23163a;

    public static WebMessagePortCompat[] a(InvocationHandler[] invocationHandlerArr) {
        WebMessagePortCompat[] webMessagePortCompatArr = new WebMessagePortCompat[invocationHandlerArr.length];
        for (int i2 = 0; i2 < invocationHandlerArr.length; i2++) {
            webMessagePortCompatArr[i2] = new WebMessagePortImpl(invocationHandlerArr[i2]);
        }
        return webMessagePortCompatArr;
    }

    public static WebMessageCompat b(WebMessageBoundaryInterface webMessageBoundaryInterface) {
        WebMessagePortCompat[] a2 = a(webMessageBoundaryInterface.getPorts());
        if (!WebViewFeatureInternal.C.d()) {
            return new WebMessageCompat(webMessageBoundaryInterface.getData(), a2);
        }
        WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) BoundaryInterfaceReflectionUtil.a(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
        int type = webMessagePayloadBoundaryInterface.getType();
        if (type == 0) {
            return new WebMessageCompat(webMessagePayloadBoundaryInterface.getAsString(), a2);
        }
        if (type != 1) {
            return null;
        }
        return new WebMessageCompat(webMessagePayloadBoundaryInterface.getAsArrayBuffer(), a2);
    }

    public String getData() {
        return this.f23163a.c();
    }

    public InvocationHandler getMessagePayload() {
        WebMessagePayloadAdapter webMessagePayloadAdapter;
        int e2 = this.f23163a.e();
        if (e2 == 0) {
            webMessagePayloadAdapter = new WebMessagePayloadAdapter(this.f23163a.c());
        } else if (e2 == 1) {
            byte[] b2 = this.f23163a.b();
            Objects.requireNonNull(b2);
            webMessagePayloadAdapter = new WebMessagePayloadAdapter(b2);
        } else {
            throw new IllegalStateException("Unknown web message payload type: " + this.f23163a.e());
        }
        return BoundaryInterfaceReflectionUtil.c(webMessagePayloadAdapter);
    }

    public InvocationHandler[] getPorts() {
        WebMessagePortCompat[] d2 = this.f23163a.d();
        if (d2 == null) {
            return null;
        }
        InvocationHandler[] invocationHandlerArr = new InvocationHandler[d2.length];
        for (int i2 = 0; i2 < d2.length; i2++) {
            invocationHandlerArr[i2] = d2[i2].a();
        }
        return invocationHandlerArr;
    }

    public String[] getSupportedFeatures() {
        return f23162b;
    }
}
