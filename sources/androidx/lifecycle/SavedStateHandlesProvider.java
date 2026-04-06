package androidx.lifecycle;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class SavedStateHandlesProvider implements SavedStateRegistry.SavedStateProvider {

    /* renamed from: a  reason: collision with root package name */
    public final SavedStateRegistry f21972a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f21973b;

    /* renamed from: c  reason: collision with root package name */
    public Bundle f21974c;

    /* renamed from: d  reason: collision with root package name */
    public final Lazy f21975d;

    public SavedStateHandlesProvider(SavedStateRegistry savedStateRegistry, ViewModelStoreOwner viewModelStoreOwner) {
        Intrinsics.i(savedStateRegistry, "savedStateRegistry");
        Intrinsics.i(viewModelStoreOwner, "viewModelStoreOwner");
        this.f21972a = savedStateRegistry;
        this.f21975d = LazyKt.b(new i(viewModelStoreOwner));
    }

    public static final SavedStateHandlesVM f(ViewModelStoreOwner viewModelStoreOwner) {
        return SavedStateHandleSupport.e(viewModelStoreOwner);
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
        Bundle a3 = SavedStateWriter.a(a2);
        Bundle bundle = this.f21974c;
        if (bundle != null) {
            SavedStateWriter.d(a3, bundle);
        }
        for (Map.Entry entry2 : d().g().entrySet()) {
            String str = (String) entry2.getKey();
            Bundle a4 = ((SavedStateHandle) entry2.getValue()).e().a();
            if (!SavedStateReader.K(SavedStateReader.a(a4))) {
                SavedStateWriter.A(a3, str, a4);
            }
        }
        this.f21973b = false;
        return a2;
    }

    public final Bundle c(String str) {
        Pair[] pairArr;
        Intrinsics.i(str, "key");
        e();
        Bundle bundle = this.f21974c;
        if (bundle == null || !SavedStateReader.b(SavedStateReader.a(bundle), str)) {
            return null;
        }
        Bundle A2 = SavedStateReader.A(SavedStateReader.a(bundle), str);
        if (A2 == null) {
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
            A2 = BundleKt.a((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
            SavedStateWriter.a(A2);
        }
        SavedStateWriter.H(SavedStateWriter.a(bundle), str);
        if (SavedStateReader.K(SavedStateReader.a(bundle))) {
            this.f21974c = null;
        }
        return A2;
    }

    public final SavedStateHandlesVM d() {
        return (SavedStateHandlesVM) this.f21975d.getValue();
    }

    public final void e() {
        Pair[] pairArr;
        if (!this.f21973b) {
            Bundle a2 = this.f21972a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
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
            Bundle a3 = BundleKt.a((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
            Bundle a4 = SavedStateWriter.a(a3);
            Bundle bundle = this.f21974c;
            if (bundle != null) {
                SavedStateWriter.d(a4, bundle);
            }
            if (a2 != null) {
                SavedStateWriter.d(a4, a2);
            }
            this.f21974c = a3;
            this.f21973b = true;
            d();
        }
    }
}
