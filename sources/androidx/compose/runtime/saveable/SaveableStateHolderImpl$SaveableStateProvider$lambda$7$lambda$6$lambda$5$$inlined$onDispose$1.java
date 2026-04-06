package androidx.compose.runtime.saveable;

import androidx.compose.runtime.DisposableEffectResult;
import kotlin.Metadata;

@Metadata
public final class SaveableStateHolderImpl$SaveableStateProvider$lambda$7$lambda$6$lambda$5$$inlined$onDispose$1 implements DisposableEffectResult {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SaveableStateHolderImpl f15202a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f15203b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ SaveableStateRegistryWrapper f15204c;

    public SaveableStateHolderImpl$SaveableStateProvider$lambda$7$lambda$6$lambda$5$$inlined$onDispose$1(SaveableStateHolderImpl saveableStateHolderImpl, Object obj, SaveableStateRegistryWrapper saveableStateRegistryWrapper) {
        this.f15202a = saveableStateHolderImpl;
        this.f15203b = obj;
        this.f15204c = saveableStateRegistryWrapper;
    }

    public void d() {
        Object u2 = this.f15202a.f15199A.u(this.f15203b);
        SaveableStateRegistryWrapper saveableStateRegistryWrapper = this.f15204c;
        if (u2 == saveableStateRegistryWrapper) {
            SaveableStateHolderImpl saveableStateHolderImpl = this.f15202a;
            saveableStateHolderImpl.r(saveableStateRegistryWrapper, saveableStateHolderImpl.f15201z, this.f15203b);
        }
    }
}
