package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.navigation.NavType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class BundleArgStore extends ArgStore {

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f22585a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f22586b;

    public BundleArgStore(Bundle bundle, Map map) {
        Intrinsics.i(bundle, "bundle");
        Intrinsics.i(map, "typeMap");
        this.f22585a = bundle;
        this.f22586b = map;
    }

    public boolean a(String str) {
        Intrinsics.i(str, "key");
        return this.f22585a.containsKey(str);
    }

    public Object b(String str) {
        Intrinsics.i(str, "key");
        NavType navType = (NavType) this.f22586b.get(str);
        if (navType != null) {
            return navType.a(this.f22585a, str);
        }
        return null;
    }
}
