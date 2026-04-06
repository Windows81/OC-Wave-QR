package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazySaveableStateHolder$Companion$saver$2 extends Lambda implements Function1<Map<String, ? extends List<? extends Object>>, LazySaveableStateHolder> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SaveableStateHolder f4941A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SaveableStateRegistry f4942z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazySaveableStateHolder$Companion$saver$2(SaveableStateRegistry saveableStateRegistry, SaveableStateHolder saveableStateHolder) {
        super(1);
        this.f4942z = saveableStateRegistry;
        this.f4941A = saveableStateHolder;
    }

    /* renamed from: b */
    public final LazySaveableStateHolder invoke(Map map) {
        return new LazySaveableStateHolder(this.f4942z, map, this.f4941A);
    }
}
