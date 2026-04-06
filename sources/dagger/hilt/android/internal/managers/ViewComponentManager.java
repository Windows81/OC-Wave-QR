package dagger.hilt.android.internal.managers;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import dagger.hilt.EntryPoints;
import dagger.hilt.android.internal.Contexts;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.Preconditions;

public final class ViewComponentManager implements GeneratedComponentManager<Object> {

    /* renamed from: A  reason: collision with root package name */
    public final Object f39748A;

    /* renamed from: B  reason: collision with root package name */
    public final boolean f39749B;
    public final View C;

    /* renamed from: z  reason: collision with root package name */
    public volatile Object f39750z;

    public static final class FragmentContextWrapper extends ContextWrapper {

        /* renamed from: a  reason: collision with root package name */
        public Fragment f39751a;

        /* renamed from: b  reason: collision with root package name */
        public LayoutInflater f39752b;

        /* renamed from: c  reason: collision with root package name */
        public LayoutInflater f39753c;

        /* renamed from: dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper$1  reason: invalid class name */
        public class AnonymousClass1 implements LifecycleEventObserver {

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ FragmentContextWrapper f39754z;

            public void j(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    Fragment unused = this.f39754z.f39751a = null;
                    LayoutInflater unused2 = this.f39754z.f39752b = null;
                    LayoutInflater unused3 = this.f39754z.f39753c = null;
                }
            }
        }

        public Fragment d() {
            Preconditions.b(this.f39751a, "The fragment has already been destroyed.");
            return this.f39751a;
        }

        public Object getSystemService(String str) {
            if (!"layout_inflater".equals(str)) {
                return getBaseContext().getSystemService(str);
            }
            if (this.f39753c == null) {
                if (this.f39752b == null) {
                    this.f39752b = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
                }
                this.f39753c = this.f39752b.cloneInContext(this);
            }
            return this.f39753c;
        }
    }

    public interface ViewComponentBuilderEntryPoint {
        ViewComponentBuilder d();
    }

    public interface ViewWithFragmentComponentBuilderEntryPoint {
        ViewWithFragmentComponentBuilder a();
    }

    private Object a() {
        GeneratedComponentManager b2 = b(false);
        return this.f39749B ? ((ViewWithFragmentComponentBuilderEntryPoint) EntryPoints.a(b2, ViewWithFragmentComponentBuilderEntryPoint.class)).a().a(this.C).d() : ((ViewComponentBuilderEntryPoint) EntryPoints.a(b2, ViewComponentBuilderEntryPoint.class)).d().a(this.C).d();
    }

    public static Context d(Context context, Class cls) {
        while ((context instanceof ContextWrapper) && !cls.isInstance(context)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    public final GeneratedComponentManager b(boolean z2) {
        Class<GeneratedComponentManager> cls = GeneratedComponentManager.class;
        if (this.f39749B) {
            Context c2 = c(FragmentContextWrapper.class, z2);
            if (c2 instanceof FragmentContextWrapper) {
                return (GeneratedComponentManager) ((FragmentContextWrapper) c2).d();
            }
            if (z2) {
                return null;
            }
            Context c3 = c(cls, z2);
            Preconditions.c(!(c3 instanceof GeneratedComponentManager), "%s, @WithFragmentBindings Hilt view must be attached to an @AndroidEntryPoint Fragment. Was attached to context %s", this.C.getClass(), c3.getClass().getName());
        } else {
            Context c4 = c(cls, z2);
            if (c4 instanceof GeneratedComponentManager) {
                return (GeneratedComponentManager) c4;
            }
            if (z2) {
                return null;
            }
        }
        throw new IllegalStateException(String.format("%s, Hilt view must be attached to an @AndroidEntryPoint Fragment or Activity.", new Object[]{this.C.getClass()}));
    }

    public final Context c(Class cls, boolean z2) {
        Context d2 = d(this.C.getContext(), cls);
        if (d2 != Contexts.a(d2.getApplicationContext())) {
            return d2;
        }
        Preconditions.c(z2, "%s, Hilt view cannot be created using the application context. Use a Hilt Fragment or Activity context.", this.C.getClass());
        return null;
    }

    public Object e() {
        if (this.f39750z == null) {
            synchronized (this.f39748A) {
                try {
                    if (this.f39750z == null) {
                        this.f39750z = a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f39750z;
    }
}
