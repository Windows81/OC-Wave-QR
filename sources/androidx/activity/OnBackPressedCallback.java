package androidx.activity;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public abstract class OnBackPressedCallback {

    /* renamed from: a  reason: collision with root package name */
    public boolean f77a;

    /* renamed from: b  reason: collision with root package name */
    public final CopyOnWriteArrayList f78b = new CopyOnWriteArrayList();

    /* renamed from: c  reason: collision with root package name */
    public Function0 f79c;

    public OnBackPressedCallback(boolean z2) {
        this.f77a = z2;
    }

    public final void a(Cancellable cancellable) {
        Intrinsics.i(cancellable, "cancellable");
        this.f78b.add(cancellable);
    }

    public final Function0 b() {
        return this.f79c;
    }

    public void c() {
    }

    public abstract void d();

    public void e(BackEventCompat backEventCompat) {
        Intrinsics.i(backEventCompat, "backEvent");
    }

    public void f(BackEventCompat backEventCompat) {
        Intrinsics.i(backEventCompat, "backEvent");
    }

    public final boolean g() {
        return this.f77a;
    }

    public final void h() {
        for (Cancellable cancel : this.f78b) {
            cancel.cancel();
        }
    }

    public final void i(Cancellable cancellable) {
        Intrinsics.i(cancellable, "cancellable");
        this.f78b.remove(cancellable);
    }

    public final void j(boolean z2) {
        this.f77a = z2;
        Function0 function0 = this.f79c;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void k(Function0 function0) {
        this.f79c = function0;
    }
}
