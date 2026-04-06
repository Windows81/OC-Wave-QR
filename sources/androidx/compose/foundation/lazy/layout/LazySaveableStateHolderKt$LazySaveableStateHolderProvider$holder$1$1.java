package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazySaveableStateHolderKt$LazySaveableStateHolderProvider$holder$1$1 extends Lambda implements Function0<LazySaveableStateHolder> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ SaveableStateHolder f4949A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ SaveableStateRegistry f4950z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazySaveableStateHolderKt$LazySaveableStateHolderProvider$holder$1$1(SaveableStateRegistry saveableStateRegistry, SaveableStateHolder saveableStateHolder) {
        super(0);
        this.f4950z = saveableStateRegistry;
        this.f4949A = saveableStateHolder;
    }

    /* renamed from: b */
    public final LazySaveableStateHolder invoke() {
        return new LazySaveableStateHolder(this.f4950z, MapsKt.h(), this.f4949A);
    }
}
