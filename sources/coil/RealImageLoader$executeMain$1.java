package coil;

import coil.request.ImageRequest;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "coil.RealImageLoader", f = "RealImageLoader.kt", l = {162, 174, 178}, m = "executeMain")
public final class RealImageLoader$executeMain$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public Object E;
    public Object F;
    public Object G;
    public /* synthetic */ Object H;
    public final /* synthetic */ RealImageLoader I;
    public int J;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RealImageLoader$executeMain$1(RealImageLoader realImageLoader, Continuation continuation) {
        super(continuation);
        this.I = realImageLoader;
    }

    public final Object x(Object obj) {
        this.H = obj;
        this.J |= Integer.MIN_VALUE;
        return this.I.g((ImageRequest) null, 0, this);
    }
}
