package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Handler;
import androidx.core.content.res.ResourcesCompat;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

@Metadata
public final class AndroidFontLoader_androidKt {
    public static final Typeface c(ResourceFont resourceFont, Context context) {
        Typeface f2 = ResourcesCompat.f(context, resourceFont.d());
        Intrinsics.f(f2);
        return f2;
    }

    public static final Object d(ResourceFont resourceFont, Context context, Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.c(continuation), 1);
        cancellableContinuationImpl.G();
        ResourcesCompat.h(context, resourceFont.d(), new AndroidFontLoader_androidKt$loadAsync$2$1(cancellableContinuationImpl, resourceFont), (Handler) null);
        Object A2 = cancellableContinuationImpl.A();
        if (A2 == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return A2;
    }
}
