package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

@Metadata
@DebugMetadata(c = "androidx.datastore.core.FileStorageConnection", f = "FileStorage.kt", l = {101}, m = "readScope")
public final class FileStorageConnection$readScope$1<R> extends ContinuationImpl {
    public Object C;
    public Object D;
    public boolean E;
    public /* synthetic */ Object F;
    public final /* synthetic */ FileStorageConnection G;
    public int H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FileStorageConnection$readScope$1(FileStorageConnection fileStorageConnection, Continuation continuation) {
        super(continuation);
        this.G = fileStorageConnection;
    }

    public final Object x(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.e((Function3) null, this);
    }
}
