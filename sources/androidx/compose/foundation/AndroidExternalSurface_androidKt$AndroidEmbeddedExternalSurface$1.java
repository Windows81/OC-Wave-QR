package androidx.compose.foundation;

import android.content.Context;
import android.view.TextureView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$1 extends Lambda implements Function1<Context, TextureView> {

    /* renamed from: z  reason: collision with root package name */
    public static final AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$1 f2897z = new AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$1();

    public AndroidExternalSurface_androidKt$AndroidEmbeddedExternalSurface$1() {
        super(1);
    }

    /* renamed from: b */
    public final TextureView invoke(Context context) {
        return new TextureView(context);
    }
}
