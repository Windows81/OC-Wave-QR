package dagger.hilt.android.internal.managers;

import android.content.Context;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import dagger.Module;
import dagger.hilt.EntryPoints;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.lifecycle.RetainedLifecycleImpl;
import dagger.hilt.internal.GeneratedComponentManager;

final class ActivityRetainedComponentManager implements GeneratedComponentManager<ActivityRetainedComponent> {

    /* renamed from: A  reason: collision with root package name */
    public final Context f39728A;

    /* renamed from: B  reason: collision with root package name */
    public volatile ActivityRetainedComponent f39729B;
    public final Object C = new Object();

    /* renamed from: z  reason: collision with root package name */
    public final ViewModelStoreOwner f39730z;

    public interface ActivityRetainedComponentBuilderEntryPoint {
        ActivityRetainedComponentBuilder c();
    }

    public static final class ActivityRetainedComponentViewModel extends ViewModel {

        /* renamed from: b  reason: collision with root package name */
        public final ActivityRetainedComponent f39733b;

        /* renamed from: c  reason: collision with root package name */
        public final SavedStateHandleHolder f39734c;

        public ActivityRetainedComponentViewModel(ActivityRetainedComponent activityRetainedComponent, SavedStateHandleHolder savedStateHandleHolder) {
            this.f39733b = activityRetainedComponent;
            this.f39734c = savedStateHandleHolder;
        }

        public void f() {
            super.f();
            ((RetainedLifecycleImpl) ((ActivityRetainedLifecycleEntryPoint) EntryPoints.a(this.f39733b, ActivityRetainedLifecycleEntryPoint.class)).a()).a();
        }

        public ActivityRetainedComponent g() {
            return this.f39733b;
        }

        public SavedStateHandleHolder h() {
            return this.f39734c;
        }
    }

    public interface ActivityRetainedLifecycleEntryPoint {
        ActivityRetainedLifecycle a();
    }

    @Module
    public static abstract class LifecycleModule {
        public static ActivityRetainedLifecycle a() {
            return new RetainedLifecycleImpl();
        }
    }

    public ActivityRetainedComponentManager(ComponentActivity componentActivity) {
        this.f39730z = componentActivity;
        this.f39728A = componentActivity;
    }

    public final ActivityRetainedComponent a() {
        return ((ActivityRetainedComponentViewModel) d(this.f39730z, this.f39728A).a(ActivityRetainedComponentViewModel.class)).g();
    }

    /* renamed from: b */
    public ActivityRetainedComponent e() {
        if (this.f39729B == null) {
            synchronized (this.C) {
                try {
                    if (this.f39729B == null) {
                        this.f39729B = a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f39729B;
    }

    public SavedStateHandleHolder c() {
        return ((ActivityRetainedComponentViewModel) d(this.f39730z, this.f39728A).a(ActivityRetainedComponentViewModel.class)).h();
    }

    public final ViewModelProvider d(ViewModelStoreOwner viewModelStoreOwner, final Context context) {
        return new ViewModelProvider(viewModelStoreOwner, (ViewModelProvider.Factory) new ViewModelProvider.Factory() {
            public ViewModel c(Class cls, CreationExtras creationExtras) {
                SavedStateHandleHolder savedStateHandleHolder = new SavedStateHandleHolder(creationExtras);
                return new ActivityRetainedComponentViewModel(((ActivityRetainedComponentBuilderEntryPoint) EntryPointAccessors.a(context, ActivityRetainedComponentBuilderEntryPoint.class)).c().a(savedStateHandleHolder).d(), savedStateHandleHolder);
            }
        });
    }
}
