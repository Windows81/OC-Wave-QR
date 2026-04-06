package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
final class TransformableKt$transformable$1 extends Lambda implements Function1<Offset, Boolean> {

    /* renamed from: z  reason: collision with root package name */
    public static final TransformableKt$transformable$1 f3615z = new TransformableKt$transformable$1();

    public TransformableKt$transformable$1() {
        super(1);
    }

    public final Boolean b(long j2) {
        return Boolean.TRUE;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return b(((Offset) obj).t());
    }
}
