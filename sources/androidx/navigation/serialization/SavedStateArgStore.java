package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class SavedStateArgStore extends ArgStore {

    /* renamed from: a  reason: collision with root package name */
    public final SavedStateHandle f22631a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f22632b;

    public SavedStateArgStore(SavedStateHandle savedStateHandle, Map map) {
        Intrinsics.i(savedStateHandle, "handle");
        Intrinsics.i(map, "typeMap");
        this.f22631a = savedStateHandle;
        this.f22632b = map;
    }

    public boolean a(String str) {
        Intrinsics.i(str, "key");
        return this.f22631a.b(str);
    }

    public Object b(String str) {
        Intrinsics.i(str, "key");
        Bundle a2 = BundleKt.a(TuplesKt.a(str, this.f22631a.c(str)));
        Object obj = this.f22632b.get(str);
        if (obj != null) {
            return ((NavType) obj).a(a2, str);
        }
        throw new IllegalStateException(("Failed to find type for " + str + " when decoding " + this.f22631a).toString());
    }
}
