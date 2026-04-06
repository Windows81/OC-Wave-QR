package androidx.compose.material.ripple;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

@Metadata
final class RippleHostMap {

    /* renamed from: a  reason: collision with root package name */
    public final Map f9078a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Map f9079b = new LinkedHashMap();

    public final RippleHostKey a(RippleHostView rippleHostView) {
        return (RippleHostKey) this.f9079b.get(rippleHostView);
    }

    public final RippleHostView b(RippleHostKey rippleHostKey) {
        return (RippleHostView) this.f9078a.get(rippleHostKey);
    }

    public final void c(RippleHostKey rippleHostKey) {
        RippleHostView rippleHostView = (RippleHostView) this.f9078a.get(rippleHostKey);
        if (rippleHostView != null) {
            RippleHostKey rippleHostKey2 = (RippleHostKey) this.f9079b.remove(rippleHostView);
        }
        this.f9078a.remove(rippleHostKey);
    }

    public final void d(RippleHostKey rippleHostKey, RippleHostView rippleHostView) {
        this.f9078a.put(rippleHostKey, rippleHostView);
        this.f9079b.put(rippleHostView, rippleHostKey);
    }
}
