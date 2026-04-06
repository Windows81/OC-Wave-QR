package androidx.lifecycle;

import android.app.Application;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.ViewModelProviderImpl;
import androidx.lifecycle.viewmodel.internal.JvmViewModelProviders;
import androidx.lifecycle.viewmodel.internal.ViewModelProviders;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

@Metadata
public class ViewModelProvider {

    /* renamed from: b  reason: collision with root package name */
    public static final Companion f21994b = new Companion((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final CreationExtras.Key f21995c = new ViewModelProvider$special$$inlined$Key$1();

    /* renamed from: a  reason: collision with root package name */
    public final ViewModelProviderImpl f21996a;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ ViewModelProvider c(Companion companion, ViewModelStoreOwner viewModelStoreOwner, Factory factory, CreationExtras creationExtras, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                factory = ViewModelProviders.f22086a.c(viewModelStoreOwner);
            }
            if ((i2 & 4) != 0) {
                creationExtras = ViewModelProviders.f22086a.b(viewModelStoreOwner);
            }
            return companion.b(viewModelStoreOwner, factory, creationExtras);
        }

        public final ViewModelProvider a(ViewModelStore viewModelStore, Factory factory, CreationExtras creationExtras) {
            Intrinsics.i(viewModelStore, "store");
            Intrinsics.i(factory, "factory");
            Intrinsics.i(creationExtras, "extras");
            return new ViewModelProvider(viewModelStore, factory, creationExtras);
        }

        public final ViewModelProvider b(ViewModelStoreOwner viewModelStoreOwner, Factory factory, CreationExtras creationExtras) {
            Intrinsics.i(viewModelStoreOwner, "owner");
            Intrinsics.i(factory, "factory");
            Intrinsics.i(creationExtras, "extras");
            return new ViewModelProvider(viewModelStoreOwner.s(), factory, creationExtras);
        }

        public Companion() {
        }
    }

    @Metadata
    public interface Factory {

        /* renamed from: a  reason: collision with root package name */
        public static final Companion f22001a = Companion.f22002a;

        @Metadata
        public static final class Companion {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ Companion f22002a = new Companion();
        }

        ViewModel a(KClass kClass, CreationExtras creationExtras) {
            Intrinsics.i(kClass, "modelClass");
            Intrinsics.i(creationExtras, "extras");
            return c(JvmClassMappingKt.a(kClass), creationExtras);
        }

        ViewModel b(Class cls) {
            Intrinsics.i(cls, "modelClass");
            return ViewModelProviders.f22086a.e();
        }

        ViewModel c(Class cls, CreationExtras creationExtras) {
            Intrinsics.i(cls, "modelClass");
            Intrinsics.i(creationExtras, "extras");
            return b(cls);
        }
    }

    @Metadata
    public static class NewInstanceFactory implements Factory {

        /* renamed from: b  reason: collision with root package name */
        public static final Companion f22003b = new Companion((DefaultConstructorMarker) null);

        /* renamed from: c  reason: collision with root package name */
        public static NewInstanceFactory f22004c;

        /* renamed from: d  reason: collision with root package name */
        public static final CreationExtras.Key f22005d = ViewModelProvider.f21995c;

        @Metadata
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final NewInstanceFactory a() {
                if (NewInstanceFactory.f22004c == null) {
                    NewInstanceFactory.f22004c = new NewInstanceFactory();
                }
                NewInstanceFactory d2 = NewInstanceFactory.f22004c;
                Intrinsics.f(d2);
                return d2;
            }

            public Companion() {
            }
        }

        public ViewModel a(KClass kClass, CreationExtras creationExtras) {
            Intrinsics.i(kClass, "modelClass");
            Intrinsics.i(creationExtras, "extras");
            return c(JvmClassMappingKt.a(kClass), creationExtras);
        }

        public ViewModel b(Class cls) {
            Intrinsics.i(cls, "modelClass");
            return JvmViewModelProviders.f22081a.a(cls);
        }

        public ViewModel c(Class cls, CreationExtras creationExtras) {
            Intrinsics.i(cls, "modelClass");
            Intrinsics.i(creationExtras, "extras");
            return b(cls);
        }
    }

    @Metadata
    public static class OnRequeryFactory {
        public void d(ViewModel viewModel) {
            Intrinsics.i(viewModel, "viewModel");
        }
    }

    static {
        CreationExtras.Companion companion = CreationExtras.f22062b;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ViewModelProvider(ViewModelStore viewModelStore, Factory factory) {
        this(viewModelStore, factory, (CreationExtras) null, 4, (DefaultConstructorMarker) null);
        Intrinsics.i(viewModelStore, "store");
        Intrinsics.i(factory, "factory");
    }

    public ViewModel a(Class cls) {
        Intrinsics.i(cls, "modelClass");
        return c(JvmClassMappingKt.c(cls));
    }

    public final ViewModel b(String str, KClass kClass) {
        Intrinsics.i(str, "key");
        Intrinsics.i(kClass, "modelClass");
        return this.f21996a.d(kClass, str);
    }

    public final ViewModel c(KClass kClass) {
        Intrinsics.i(kClass, "modelClass");
        return ViewModelProviderImpl.e(this.f21996a, kClass, (String) null, 2, (Object) null);
    }

    @Metadata
    public static class AndroidViewModelFactory extends NewInstanceFactory {

        /* renamed from: f  reason: collision with root package name */
        public static final Companion f21997f = new Companion((DefaultConstructorMarker) null);

        /* renamed from: g  reason: collision with root package name */
        public static AndroidViewModelFactory f21998g;

        /* renamed from: h  reason: collision with root package name */
        public static final CreationExtras.Key f21999h = new ViewModelProvider$AndroidViewModelFactory$special$$inlined$Key$1();

        /* renamed from: e  reason: collision with root package name */
        public final Application f22000e;

        @Metadata
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final AndroidViewModelFactory a(Application application) {
                Intrinsics.i(application, "application");
                if (AndroidViewModelFactory.f21998g == null) {
                    AndroidViewModelFactory.f21998g = new AndroidViewModelFactory(application);
                }
                AndroidViewModelFactory f2 = AndroidViewModelFactory.f21998g;
                Intrinsics.f(f2);
                return f2;
            }

            public Companion() {
            }
        }

        static {
            CreationExtras.Companion companion = CreationExtras.f22062b;
        }

        public AndroidViewModelFactory(Application application, int i2) {
            this.f22000e = application;
        }

        public ViewModel b(Class cls) {
            Intrinsics.i(cls, "modelClass");
            Application application = this.f22000e;
            if (application != null) {
                return h(cls, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        public ViewModel c(Class cls, CreationExtras creationExtras) {
            Intrinsics.i(cls, "modelClass");
            Intrinsics.i(creationExtras, "extras");
            if (this.f22000e != null) {
                return b(cls);
            }
            Application application = (Application) creationExtras.a(f21999h);
            if (application != null) {
                return h(cls, application);
            }
            if (!AndroidViewModel.class.isAssignableFrom(cls)) {
                return super.b(cls);
            }
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }

        public final ViewModel h(Class cls, Application application) {
            if (!AndroidViewModel.class.isAssignableFrom(cls)) {
                return super.b(cls);
            }
            try {
                ViewModel viewModel = (ViewModel) cls.getConstructor(new Class[]{Application.class}).newInstance(new Object[]{application});
                Intrinsics.f(viewModel);
                return viewModel;
            } catch (NoSuchMethodException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            } catch (InstantiationException e4) {
                throw new RuntimeException("Cannot create an instance of " + cls, e4);
            } catch (InvocationTargetException e5) {
                throw new RuntimeException("Cannot create an instance of " + cls, e5);
            }
        }

        public AndroidViewModelFactory() {
            this((Application) null, 0);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public AndroidViewModelFactory(Application application) {
            this(application, 0);
            Intrinsics.i(application, "application");
        }
    }

    public ViewModelProvider(ViewModelProviderImpl viewModelProviderImpl) {
        this.f21996a = viewModelProviderImpl;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ViewModelProvider(ViewModelStore viewModelStore, Factory factory, CreationExtras creationExtras, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewModelStore, factory, (i2 & 4) != 0 ? CreationExtras.Empty.f22064c : creationExtras);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ViewModelProvider(ViewModelStore viewModelStore, Factory factory, CreationExtras creationExtras) {
        this(new ViewModelProviderImpl(viewModelStore, factory, creationExtras));
        Intrinsics.i(viewModelStore, "store");
        Intrinsics.i(factory, "factory");
        Intrinsics.i(creationExtras, "defaultCreationExtras");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ViewModelProvider(androidx.lifecycle.ViewModelStoreOwner r4) {
        /*
            r3 = this;
            java.lang.String r0 = "owner"
            kotlin.jvm.internal.Intrinsics.i(r4, r0)
            androidx.lifecycle.ViewModelStore r0 = r4.s()
            androidx.lifecycle.viewmodel.internal.ViewModelProviders r1 = androidx.lifecycle.viewmodel.internal.ViewModelProviders.f22086a
            androidx.lifecycle.ViewModelProvider$Factory r2 = r1.c(r4)
            androidx.lifecycle.viewmodel.CreationExtras r4 = r1.b(r4)
            r3.<init>(r0, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.ViewModelProvider.<init>(androidx.lifecycle.ViewModelStoreOwner):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ViewModelProvider(ViewModelStoreOwner viewModelStoreOwner, Factory factory) {
        this(viewModelStoreOwner.s(), factory, ViewModelProviders.f22086a.b(viewModelStoreOwner));
        Intrinsics.i(viewModelStoreOwner, "owner");
        Intrinsics.i(factory, "factory");
    }
}
