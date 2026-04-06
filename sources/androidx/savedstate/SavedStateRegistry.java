package androidx.savedstate;

import android.os.Bundle;
import androidx.savedstate.Recreator;
import androidx.savedstate.internal.SavedStateRegistryImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SavedStateRegistry {

    /* renamed from: a  reason: collision with root package name */
    public final SavedStateRegistryImpl f22824a;

    /* renamed from: b  reason: collision with root package name */
    public Recreator.SavedStateProvider f22825b;

    @Metadata
    public interface AutoRecreated {
        void a(SavedStateRegistryOwner savedStateRegistryOwner);
    }

    @Metadata
    public interface SavedStateProvider {
        Bundle a();
    }

    public SavedStateRegistry(SavedStateRegistryImpl savedStateRegistryImpl) {
        Intrinsics.i(savedStateRegistryImpl, "impl");
        this.f22824a = savedStateRegistryImpl;
    }

    public final Bundle a(String str) {
        Intrinsics.i(str, "key");
        return this.f22824a.c(str);
    }

    public final SavedStateProvider b(String str) {
        Intrinsics.i(str, "key");
        return this.f22824a.d(str);
    }

    public final void c(String str, SavedStateProvider savedStateProvider) {
        Intrinsics.i(str, "key");
        Intrinsics.i(savedStateProvider, "provider");
        this.f22824a.j(str, savedStateProvider);
    }

    public final void d(Class cls) {
        Intrinsics.i(cls, "clazz");
        if (this.f22824a.e()) {
            Recreator.SavedStateProvider savedStateProvider = this.f22825b;
            if (savedStateProvider == null) {
                savedStateProvider = new Recreator.SavedStateProvider(this);
            }
            this.f22825b = savedStateProvider;
            try {
                cls.getDeclaredConstructor((Class[]) null);
                Recreator.SavedStateProvider savedStateProvider2 = this.f22825b;
                if (savedStateProvider2 != null) {
                    String name = cls.getName();
                    Intrinsics.h(name, "getName(...)");
                    savedStateProvider2.b(name);
                }
            } catch (NoSuchMethodException e2) {
                throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    public final void e(String str) {
        Intrinsics.i(str, "key");
        this.f22824a.k(str);
    }
}
