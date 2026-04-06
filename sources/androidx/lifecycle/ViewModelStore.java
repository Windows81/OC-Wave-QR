package androidx.lifecycle;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public class ViewModelStore {

    /* renamed from: a  reason: collision with root package name */
    public final Map f22006a = new LinkedHashMap();

    public final void a() {
        for (ViewModel d2 : this.f22006a.values()) {
            d2.d();
        }
        this.f22006a.clear();
    }

    public final ViewModel b(String str) {
        Intrinsics.i(str, "key");
        return (ViewModel) this.f22006a.get(str);
    }

    public final Set c() {
        return new HashSet(this.f22006a.keySet());
    }

    public final void d(String str, ViewModel viewModel) {
        Intrinsics.i(str, "key");
        Intrinsics.i(viewModel, "viewModel");
        ViewModel viewModel2 = (ViewModel) this.f22006a.put(str, viewModel);
        if (viewModel2 != null) {
            viewModel2.d();
        }
    }
}
