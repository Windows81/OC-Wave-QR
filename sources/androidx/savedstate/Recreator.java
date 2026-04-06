package androidx.savedstate;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.SavedStateRegistry;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class Recreator implements LifecycleEventObserver {

    /* renamed from: A  reason: collision with root package name */
    public static final Companion f22818A = new Companion((DefaultConstructorMarker) null);

    /* renamed from: z  reason: collision with root package name */
    public final SavedStateRegistryOwner f22819z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata
    public static final class SavedStateProvider implements SavedStateRegistry.SavedStateProvider {

        /* renamed from: a  reason: collision with root package name */
        public final Set f22820a = new LinkedHashSet();

        public SavedStateProvider(SavedStateRegistry savedStateRegistry) {
            Intrinsics.i(savedStateRegistry, "registry");
            savedStateRegistry.c("androidx.savedstate.Restarter", this);
        }

        public Bundle a() {
            Pair[] pairArr;
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
            SavedStateWriter.G(SavedStateWriter.a(a2), "classes_to_restore", CollectionsKt.M0(this.f22820a));
            return a2;
        }

        public final void b(String str) {
            Intrinsics.i(str, "className");
            this.f22820a.add(str);
        }
    }

    public Recreator(SavedStateRegistryOwner savedStateRegistryOwner) {
        Intrinsics.i(savedStateRegistryOwner, "owner");
        this.f22819z = savedStateRegistryOwner;
    }

    public final void b(String str) {
        try {
            Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(SavedStateRegistry.AutoRecreated.class);
            Intrinsics.f(asSubclass);
            try {
                Constructor<? extends U> declaredConstructor = asSubclass.getDeclaredConstructor((Class[]) null);
                declaredConstructor.setAccessible(true);
                try {
                    Object newInstance = declaredConstructor.newInstance((Object[]) null);
                    Intrinsics.f(newInstance);
                    ((SavedStateRegistry.AutoRecreated) newInstance).a(this.f22819z);
                } catch (Exception e2) {
                    throw new RuntimeException("Failed to instantiate " + str, e2);
                }
            } catch (NoSuchMethodException e3) {
                throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e3);
            }
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("Class " + str + " wasn't found", e4);
        }
    }

    public void j(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.i(lifecycleOwner, "source");
        Intrinsics.i(event, "event");
        if (event == Lifecycle.Event.ON_CREATE) {
            lifecycleOwner.a().d(this);
            Bundle a2 = this.f22819z.v().a("androidx.savedstate.Restarter");
            if (a2 != null) {
                List<String> I = SavedStateReader.I(SavedStateReader.a(a2), "classes_to_restore");
                if (I != null) {
                    for (String b2 : I) {
                        b(b2);
                    }
                    return;
                }
                throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
