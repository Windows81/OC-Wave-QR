package o;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Qualified;
import com.google.firebase.perf.FirebasePerfRegistrar;

public final /* synthetic */ class b implements ComponentFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Qualified f34122a;

    public /* synthetic */ b(Qualified qualified) {
        this.f34122a = qualified;
    }

    public final Object a(ComponentContainer componentContainer) {
        return FirebasePerfRegistrar.lambda$getComponents$0(this.f34122a, componentContainer);
    }
}
