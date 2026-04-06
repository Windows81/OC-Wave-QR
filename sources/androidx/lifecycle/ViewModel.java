package androidx.lifecycle;

import androidx.lifecycle.viewmodel.internal.ViewModelImpl;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public abstract class ViewModel {

    /* renamed from: a  reason: collision with root package name */
    public final ViewModelImpl f21989a = new ViewModelImpl();

    public /* synthetic */ void b(Closeable closeable) {
        Intrinsics.i(closeable, "closeable");
        ViewModelImpl viewModelImpl = this.f21989a;
        if (viewModelImpl != null) {
            viewModelImpl.d(closeable);
        }
    }

    public final void c(String str, AutoCloseable autoCloseable) {
        Intrinsics.i(str, "key");
        Intrinsics.i(autoCloseable, "closeable");
        ViewModelImpl viewModelImpl = this.f21989a;
        if (viewModelImpl != null) {
            viewModelImpl.e(str, autoCloseable);
        }
    }

    public final void d() {
        ViewModelImpl viewModelImpl = this.f21989a;
        if (viewModelImpl != null) {
            viewModelImpl.f();
        }
        f();
    }

    public final AutoCloseable e(String str) {
        Intrinsics.i(str, "key");
        ViewModelImpl viewModelImpl = this.f21989a;
        if (viewModelImpl != null) {
            return viewModelImpl.h(str);
        }
        return null;
    }

    public void f() {
    }
}
