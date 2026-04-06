package androidx.activity;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;

@Metadata
@DebugMetadata(c = "androidx.activity.FullyDrawnReporterKt", f = "FullyDrawnReporter.kt", l = {173}, m = "reportWhenComplete")
public final class FullyDrawnReporterKt$reportWhenComplete$1 extends ContinuationImpl {
    public Object C;
    public /* synthetic */ Object D;
    public int E;

    public FullyDrawnReporterKt$reportWhenComplete$1(Continuation continuation) {
        super(continuation);
    }

    public final Object x(Object obj) {
        this.D = obj;
        this.E |= Integer.MIN_VALUE;
        return FullyDrawnReporterKt.a((FullyDrawnReporter) null, (Function1) null, this);
    }
}
