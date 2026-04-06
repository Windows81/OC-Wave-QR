package androidx.compose.runtime.saveable;

import androidx.collection.MutableScatterMap;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata
public final class SaveableStateRegistryImpl$registerProvider$3 implements SaveableStateRegistry.Entry {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MutableScatterMap f15208a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f15209b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Function0 f15210c;

    public SaveableStateRegistryImpl$registerProvider$3(MutableScatterMap mutableScatterMap, String str, Function0 function0) {
        this.f15208a = mutableScatterMap;
        this.f15209b = str;
        this.f15210c = function0;
    }

    public void a() {
        List list = (List) this.f15208a.u(this.f15209b);
        if (list != null) {
            list.remove(this.f15210c);
        }
        Collection collection = list;
        if (collection != null && !collection.isEmpty()) {
            this.f15208a.x(this.f15209b, list);
        }
    }
}
