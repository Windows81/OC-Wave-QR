package androidx.compose.ui.graphics.layer;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "androidx.compose.ui.graphics.layer.GraphicsLayer", f = "AndroidGraphicsLayer.android.kt", l = {878}, m = "toImageBitmap")
public final class GraphicsLayer$toImageBitmap$1 extends ContinuationImpl {
    public /* synthetic */ Object C;
    public final /* synthetic */ GraphicsLayer D;
    public int E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GraphicsLayer$toImageBitmap$1(GraphicsLayer graphicsLayer, Continuation continuation) {
        super(continuation);
        this.D = graphicsLayer;
    }

    public final Object x(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.h0(this);
    }
}
