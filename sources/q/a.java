package q;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.tracing.ComponentMonitor;

public final /* synthetic */ class a implements ComponentFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f34130a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Component f34131b;

    public /* synthetic */ a(String str, Component component) {
        this.f34130a = str;
        this.f34131b = component;
    }

    public final Object a(ComponentContainer componentContainer) {
        return ComponentMonitor.c(this.f34130a, this.f34131b, componentContainer);
    }
}
