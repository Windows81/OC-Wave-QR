package okio.internal;

import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.sequences.SequenceScope;
import okio.FileSystem;
import okio.Path;

@Metadata
@DebugMetadata(c = "okio.internal.-FileSystem", f = "FileSystem.kt", l = {116, 135, 145}, m = "collectRecursively")
/* renamed from: okio.internal.-FileSystem$collectRecursively$1  reason: invalid class name */
public final class FileSystem$collectRecursively$1 extends ContinuationImpl {
    public Object C;
    public Object D;
    public Object E;
    public Object F;
    public Object G;
    public boolean H;
    public boolean I;
    public /* synthetic */ Object J;
    public int K;

    public FileSystem$collectRecursively$1(Continuation continuation) {
        super(continuation);
    }

    public final Object x(Object obj) {
        this.J = obj;
        this.K |= Integer.MIN_VALUE;
        return FileSystem.a((SequenceScope) null, (FileSystem) null, (ArrayDeque) null, (Path) null, false, false, this);
    }
}
