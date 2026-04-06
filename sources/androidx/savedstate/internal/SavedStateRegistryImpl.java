package androidx.savedstate.internal;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.SavedStateWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SavedStateRegistryImpl {

    /* renamed from: i  reason: collision with root package name */
    public static final Companion f22838i = new Companion((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    public final SavedStateRegistryOwner f22839a;

    /* renamed from: b  reason: collision with root package name */
    public final Function0 f22840b;

    /* renamed from: c  reason: collision with root package name */
    public final SynchronizedObject f22841c = new SynchronizedObject();

    /* renamed from: d  reason: collision with root package name */
    public final Map f22842d = new LinkedHashMap();

    /* renamed from: e  reason: collision with root package name */
    public boolean f22843e;

    /* renamed from: f  reason: collision with root package name */
    public Bundle f22844f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f22845g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f22846h = true;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public SavedStateRegistryImpl(SavedStateRegistryOwner savedStateRegistryOwner, Function0 function0) {
        Intrinsics.i(savedStateRegistryOwner, "owner");
        Intrinsics.i(function0, "onAttach");
        this.f22839a = savedStateRegistryOwner;
        this.f22840b = function0;
    }

    public static final void g(SavedStateRegistryImpl savedStateRegistryImpl, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.i(lifecycleOwner, "<unused var>");
        Intrinsics.i(event, "event");
        if (event == Lifecycle.Event.ON_START) {
            savedStateRegistryImpl.f22846h = true;
        } else if (event == Lifecycle.Event.ON_STOP) {
            savedStateRegistryImpl.f22846h = false;
        }
    }

    public final Bundle c(String str) {
        Intrinsics.i(str, "key");
        if (this.f22845g) {
            Bundle bundle = this.f22844f;
            if (bundle == null) {
                return null;
            }
            Bundle a2 = SavedStateReader.a(bundle);
            Bundle z2 = SavedStateReader.b(a2, str) ? SavedStateReader.z(a2, str) : null;
            SavedStateWriter.H(SavedStateWriter.a(bundle), str);
            if (SavedStateReader.K(SavedStateReader.a(bundle))) {
                this.f22844f = null;
            }
            return z2;
        }
        throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
    }

    public final SavedStateRegistry.SavedStateProvider d(String str) {
        SavedStateRegistry.SavedStateProvider savedStateProvider;
        Intrinsics.i(str, "key");
        synchronized (this.f22841c) {
            Iterator it = this.f22842d.entrySet().iterator();
            do {
                savedStateProvider = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                SavedStateRegistry.SavedStateProvider savedStateProvider2 = (SavedStateRegistry.SavedStateProvider) entry.getValue();
                if (Intrinsics.d((String) entry.getKey(), str)) {
                    savedStateProvider = savedStateProvider2;
                    continue;
                }
            } while (savedStateProvider == null);
        }
        return savedStateProvider;
    }

    public final boolean e() {
        return this.f22846h;
    }

    public final void f() {
        if (this.f22839a.a().b() != Lifecycle.State.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        } else if (!this.f22843e) {
            this.f22840b.invoke();
            this.f22839a.a().a(new a(this));
            this.f22843e = true;
        } else {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
    }

    public final void h(Bundle bundle) {
        if (!this.f22843e) {
            f();
        }
        if (this.f22839a.a().b().f(Lifecycle.State.STARTED)) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + this.f22839a.a().b()).toString());
        } else if (!this.f22845g) {
            Bundle bundle2 = null;
            if (bundle != null) {
                Bundle a2 = SavedStateReader.a(bundle);
                if (SavedStateReader.b(a2, "androidx.lifecycle.BundlableSavedStateRegistry.key")) {
                    bundle2 = SavedStateReader.z(a2, "androidx.lifecycle.BundlableSavedStateRegistry.key");
                }
            }
            this.f22844f = bundle2;
            this.f22845g = true;
        } else {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
    }

    public final void i(Bundle bundle) {
        Pair[] pairArr;
        Intrinsics.i(bundle, "outBundle");
        Map h2 = MapsKt.h();
        if (h2.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(h2.size());
            for (Map.Entry entry : h2.entrySet()) {
                arrayList.add(TuplesKt.a((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle a2 = BundleKt.a((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        Bundle a3 = SavedStateWriter.a(a2);
        Bundle bundle2 = this.f22844f;
        if (bundle2 != null) {
            SavedStateWriter.d(a3, bundle2);
        }
        synchronized (this.f22841c) {
            try {
                for (Map.Entry entry2 : this.f22842d.entrySet()) {
                    SavedStateWriter.A(a3, (String) entry2.getKey(), ((SavedStateRegistry.SavedStateProvider) entry2.getValue()).a());
                }
                Unit unit = Unit.f40552a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!SavedStateReader.K(SavedStateReader.a(a2))) {
            SavedStateWriter.A(SavedStateWriter.a(bundle), "androidx.lifecycle.BundlableSavedStateRegistry.key", a2);
        }
    }

    public final void j(String str, SavedStateRegistry.SavedStateProvider savedStateProvider) {
        Intrinsics.i(str, "key");
        Intrinsics.i(savedStateProvider, "provider");
        synchronized (this.f22841c) {
            if (!this.f22842d.containsKey(str)) {
                this.f22842d.put(str, savedStateProvider);
                Unit unit = Unit.f40552a;
            } else {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
        }
    }

    public final void k(String str) {
        Intrinsics.i(str, "key");
        synchronized (this.f22841c) {
            SavedStateRegistry.SavedStateProvider savedStateProvider = (SavedStateRegistry.SavedStateProvider) this.f22842d.remove(str);
        }
    }
}
