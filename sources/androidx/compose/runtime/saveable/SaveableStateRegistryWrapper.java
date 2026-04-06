package androidx.compose.runtime.saveable;

import android.os.Bundle;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.core.os.BundleKt;
import androidx.lifecycle.LifecycleRegistry;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.SavedStateWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;

@Metadata
public final class SaveableStateRegistryWrapper implements SaveableStateRegistry, SavedStateRegistryOwner {

    /* renamed from: A  reason: collision with root package name */
    public final SavedStateRegistryController f15212A;

    /* renamed from: B  reason: collision with root package name */
    public final LifecycleRegistry f15213B = LifecycleRegistry.f21909k.a(this);
    public final SavedStateRegistry C;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SaveableStateRegistry f15214z;

    public SaveableStateRegistryWrapper(SaveableStateRegistry saveableStateRegistry) {
        this.f15214z = saveableStateRegistry;
        SavedStateRegistryController b2 = SavedStateRegistryController.f22826c.b(this);
        this.f15212A = b2;
        this.C = b2.b();
        Object e2 = e("androidx.savedstate.SavedStateRegistry");
        b2.d(e2 instanceof Bundle ? (Bundle) e2 : null);
        f("androidx.savedstate.SavedStateRegistry", new l(this));
    }

    public static final Object h(SaveableStateRegistryWrapper saveableStateRegistryWrapper) {
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
        SavedStateWriter.a(a2);
        saveableStateRegistryWrapper.f15212A.e(a2);
        if (SavedStateReader.K(SavedStateReader.a(a2))) {
            return null;
        }
        return a2;
    }

    public boolean b(Object obj) {
        return this.f15214z.b(obj);
    }

    public Map d() {
        return this.f15214z.d();
    }

    public Object e(String str) {
        return this.f15214z.e(str);
    }

    public SaveableStateRegistry.Entry f(String str, Function0 function0) {
        return this.f15214z.f(str, function0);
    }

    public SavedStateRegistry v() {
        return this.C;
    }

    public LifecycleRegistry a() {
        return this.f15213B;
    }
}
