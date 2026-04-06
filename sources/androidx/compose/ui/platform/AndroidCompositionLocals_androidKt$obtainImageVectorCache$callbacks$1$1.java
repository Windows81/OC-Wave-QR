package androidx.compose.ui.platform;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import androidx.compose.ui.res.ImageVectorCache;
import kotlin.Metadata;

@Metadata
public final class AndroidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1 implements ComponentCallbacks2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ImageVectorCache f17619A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Configuration f17620z;

    public AndroidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1(Configuration configuration, ImageVectorCache imageVectorCache) {
        this.f17620z = configuration;
        this.f17619A = imageVectorCache;
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.f17619A.c(this.f17620z.updateFrom(configuration));
        this.f17620z.setTo(configuration);
    }

    public void onLowMemory() {
        this.f17619A.a();
    }

    public void onTrimMemory(int i2) {
        this.f17619A.a();
    }
}
