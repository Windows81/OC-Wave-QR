package androidx.compose.ui.platform;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import androidx.compose.ui.R;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class DisposableSaveableStateRegistry_androidKt {

    /* renamed from: a  reason: collision with root package name */
    public static final Class[] f17759a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    public static final DisposableSaveableStateRegistry b(View view, SavedStateRegistryOwner savedStateRegistryOwner) {
        ViewParent parent = view.getParent();
        Intrinsics.g(parent, "null cannot be cast to non-null type android.view.View");
        View view2 = (View) parent;
        Object tag = view2.getTag(R.id.H);
        String str = tag instanceof String ? (String) tag : null;
        if (str == null) {
            str = String.valueOf(view2.getId());
        }
        return c(str, savedStateRegistryOwner);
    }

    public static final DisposableSaveableStateRegistry c(String str, SavedStateRegistryOwner savedStateRegistryOwner) {
        boolean z2;
        String str2 = SaveableStateRegistry.class.getSimpleName() + ':' + str;
        SavedStateRegistry v2 = savedStateRegistryOwner.v();
        Bundle a2 = v2.a(str2);
        SaveableStateRegistry c2 = SaveableStateRegistryKt.c(a2 != null ? h(a2) : null, DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$saveableStateRegistry$1.f17763z);
        try {
            v2.c(str2, new v(c2));
            z2 = true;
        } catch (IllegalArgumentException unused) {
            z2 = false;
        }
        return new DisposableSaveableStateRegistry(c2, new DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$1(z2, v2, str2));
    }

    public static final Bundle d(SaveableStateRegistry saveableStateRegistry) {
        return g(saveableStateRegistry.d());
    }

    public static final boolean f(Object obj) {
        if (obj instanceof SnapshotMutableState) {
            SnapshotMutableState snapshotMutableState = (SnapshotMutableState) obj;
            if (snapshotMutableState.d() != SnapshotStateKt.k() && snapshotMutableState.d() != SnapshotStateKt.r() && snapshotMutableState.d() != SnapshotStateKt.o()) {
                return false;
            }
            Object value = snapshotMutableState.getValue();
            if (value == null) {
                return true;
            }
            return f(value);
        } else if ((obj instanceof Function) && (obj instanceof Serializable)) {
            return false;
        } else {
            for (Class isInstance : f17759a) {
                if (isInstance.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static final Bundle g(Map map) {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            bundle.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList(list));
        }
        return bundle;
    }

    public static final Map h(Bundle bundle) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : bundle.keySet()) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(str);
            Intrinsics.g(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Any?> }");
            linkedHashMap.put(str, parcelableArrayList);
        }
        return linkedHashMap;
    }
}
