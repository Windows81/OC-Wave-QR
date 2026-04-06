package androidx.compose.ui.text.font;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata
@DebugMetadata(c = "androidx.compose.ui.text.font.AsyncFontListLoader", f = "FontListFontFamilyTypefaceAdapter.kt", l = {281, 295}, m = "load")
public final class AsyncFontListLoader$load$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public Object E;
    public int F;
    public int G;
    public /* synthetic */ Object H;
    public final /* synthetic */ AsyncFontListLoader I;
    public int J;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AsyncFontListLoader$load$1(AsyncFontListLoader asyncFontListLoader, Continuation continuation) {
        super(continuation);
        this.I = asyncFontListLoader;
    }

    public final Object x(Object obj) {
        this.H = obj;
        this.J |= Integer.MIN_VALUE;
        return this.I.i(this);
    }
}
