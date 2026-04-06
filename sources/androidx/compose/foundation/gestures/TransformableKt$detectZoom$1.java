package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.channels.Channel;

@Metadata
@DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableKt", f = "Transformable.kt", l = {337, 339, 385}, m = "detectZoom")
public final class TransformableKt$detectZoom$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public Object E;
    public Object F;
    public boolean G;
    public float H;
    public float I;
    public float J;
    public long K;
    public int L;
    public int M;
    public int N;
    public /* synthetic */ Object O;
    public int P;

    public TransformableKt$detectZoom$1(Continuation continuation) {
        super(continuation);
    }

    public final Object x(Object obj) {
        this.O = obj;
        this.P |= Integer.MIN_VALUE;
        return TransformableKt.g((AwaitPointerEventScope) null, false, (Channel) null, (Function1) null, this);
    }
}
