package dagger.hilt.android.internal.managers;

import androidx.fragment.app.Fragment;
import dagger.hilt.EntryPoints;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.Preconditions;

public class FragmentComponentManager implements GeneratedComponentManager<Object> {

    /* renamed from: A  reason: collision with root package name */
    public final Object f39739A;

    /* renamed from: B  reason: collision with root package name */
    public final Fragment f39740B;

    /* renamed from: z  reason: collision with root package name */
    public volatile Object f39741z;

    public interface FragmentComponentBuilderEntryPoint {
        FragmentComponentBuilder f();
    }

    private Object a() {
        Preconditions.b(this.f39740B.D(), "Hilt Fragments must be attached before creating the component.");
        Preconditions.c(this.f39740B.D() instanceof GeneratedComponentManager, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", this.f39740B.D().getClass());
        b(this.f39740B);
        return ((FragmentComponentBuilderEntryPoint) EntryPoints.a(this.f39740B.D(), FragmentComponentBuilderEntryPoint.class)).f().a(this.f39740B).d();
    }

    public void b(Fragment fragment) {
    }

    public Object e() {
        if (this.f39741z == null) {
            synchronized (this.f39739A) {
                try {
                    if (this.f39741z == null) {
                        this.f39741z = a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f39741z;
    }
}
