package androidx.compose.ui.text.font;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;

@Metadata
@DebugMetadata(c = "androidx.compose.ui.text.font.AsyncTypefaceCache", f = "FontListFontFamilyTypefaceAdapter.kt", l = {412}, m = "runCached")
public final class AsyncTypefaceCache$runCached$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public boolean E;
    public /* synthetic */ Object F;
    public final /* synthetic */ AsyncTypefaceCache G;
    public int H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AsyncTypefaceCache$runCached$1(AsyncTypefaceCache asyncTypefaceCache, Continuation continuation) {
        super(continuation);
        this.G = asyncTypefaceCache;
    }

    public final Object x(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.g((Font) null, (PlatformFontLoader) null, false, (Function1) null, this);
    }
}
