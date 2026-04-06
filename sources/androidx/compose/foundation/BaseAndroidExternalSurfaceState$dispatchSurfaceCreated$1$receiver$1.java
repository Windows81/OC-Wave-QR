package androidx.compose.foundation;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;

@Metadata
public final class BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1$receiver$1 implements SurfaceCoroutineScope, SurfaceScope, CoroutineScope {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f2930A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ BaseAndroidExternalSurfaceState f2931z;

    public BaseAndroidExternalSurfaceState$dispatchSurfaceCreated$1$receiver$1(BaseAndroidExternalSurfaceState baseAndroidExternalSurfaceState, CoroutineScope coroutineScope) {
        this.f2931z = baseAndroidExternalSurfaceState;
        this.f2930A = coroutineScope;
    }

    public CoroutineContext getCoroutineContext() {
        return this.f2930A.getCoroutineContext();
    }
}
