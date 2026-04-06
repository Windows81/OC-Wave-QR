package androidx.compose.ui.platform;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import androidx.compose.ui.res.ResourceIdCache;
import kotlin.Metadata;

@Metadata
public final class AndroidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$1 implements ComponentCallbacks2 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ ResourceIdCache f17623z;

    public AndroidCompositionLocals_androidKt$obtainResourceIdCache$callbacks$1$1(ResourceIdCache resourceIdCache) {
        this.f17623z = resourceIdCache;
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.f17623z.a();
    }

    public void onLowMemory() {
        this.f17623z.a();
    }

    public void onTrimMemory(int i2) {
        this.f17623z.a();
    }
}
