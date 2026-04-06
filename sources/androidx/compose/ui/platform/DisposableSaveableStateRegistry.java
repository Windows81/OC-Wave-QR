package androidx.compose.ui.platform;

import androidx.compose.runtime.saveable.SaveableStateRegistry;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata
public final class DisposableSaveableStateRegistry implements SaveableStateRegistry {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SaveableStateRegistry f17757A;

    /* renamed from: z  reason: collision with root package name */
    public final Function0 f17758z;

    public DisposableSaveableStateRegistry(SaveableStateRegistry saveableStateRegistry, Function0 function0) {
        this.f17758z = function0;
        this.f17757A = saveableStateRegistry;
    }

    public final void a() {
        this.f17758z.invoke();
    }

    public boolean b(Object obj) {
        return this.f17757A.b(obj);
    }

    public Map d() {
        return this.f17757A.d();
    }

    public Object e(String str) {
        return this.f17757A.e(str);
    }

    public SaveableStateRegistry.Entry f(String str, Function0 function0) {
        return this.f17757A.f(str, function0);
    }
}
