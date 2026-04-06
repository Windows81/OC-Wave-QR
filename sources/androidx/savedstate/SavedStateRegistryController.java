package androidx.savedstate;

import android.os.Bundle;
import androidx.savedstate.internal.SavedStateRegistryImpl;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SavedStateRegistryController {

    /* renamed from: c  reason: collision with root package name */
    public static final Companion f22826c = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final SavedStateRegistryImpl f22827a;

    /* renamed from: b  reason: collision with root package name */
    public final SavedStateRegistry f22828b;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final Unit c(SavedStateRegistryOwner savedStateRegistryOwner) {
            savedStateRegistryOwner.a().a(new Recreator(savedStateRegistryOwner));
            return Unit.f40552a;
        }

        public final SavedStateRegistryController b(SavedStateRegistryOwner savedStateRegistryOwner) {
            Intrinsics.i(savedStateRegistryOwner, "owner");
            return new SavedStateRegistryController(new SavedStateRegistryImpl(savedStateRegistryOwner, new a(savedStateRegistryOwner)), (DefaultConstructorMarker) null);
        }

        public Companion() {
        }
    }

    public /* synthetic */ SavedStateRegistryController(SavedStateRegistryImpl savedStateRegistryImpl, DefaultConstructorMarker defaultConstructorMarker) {
        this(savedStateRegistryImpl);
    }

    public static final SavedStateRegistryController a(SavedStateRegistryOwner savedStateRegistryOwner) {
        return f22826c.b(savedStateRegistryOwner);
    }

    public final SavedStateRegistry b() {
        return this.f22828b;
    }

    public final void c() {
        this.f22827a.f();
    }

    public final void d(Bundle bundle) {
        this.f22827a.h(bundle);
    }

    public final void e(Bundle bundle) {
        Intrinsics.i(bundle, "outBundle");
        this.f22827a.i(bundle);
    }

    public SavedStateRegistryController(SavedStateRegistryImpl savedStateRegistryImpl) {
        this.f22827a = savedStateRegistryImpl;
        this.f22828b = new SavedStateRegistry(savedStateRegistryImpl);
    }
}
