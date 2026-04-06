package okio.internal;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;
import okio.FileSystem;
import okio.Path;

@Metadata
@DebugMetadata(c = "okio.internal.-FileSystem$commonListRecursively$1", f = "FileSystem.kt", l = {96}, m = "invokeSuspend")
/* renamed from: okio.internal.-FileSystem$commonListRecursively$1  reason: invalid class name */
final class FileSystem$commonListRecursively$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Path>, Continuation<? super Unit>, Object> {

    /* renamed from: B  reason: collision with root package name */
    public Object f43470B;
    public Object C;
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ Path F;
    public final /* synthetic */ FileSystem G;
    public final /* synthetic */ boolean H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FileSystem$commonListRecursively$1(Path path, FileSystem fileSystem, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.F = path;
        this.G = fileSystem;
        this.H = z2;
    }

    public final Continuation s(Object obj, Continuation continuation) {
        FileSystem$commonListRecursively$1 r0 = new FileSystem$commonListRecursively$1(this.F, this.G, this.H, continuation);
        r0.E = obj;
        return r0;
    }

    public final Object x(Object obj) {
        ArrayDeque arrayDeque;
        SequenceScope sequenceScope;
        Iterator it;
        Object f2 = IntrinsicsKt.f();
        int i2 = this.D;
        if (i2 == 0) {
            ResultKt.b(obj);
            ArrayDeque arrayDeque2 = new ArrayDeque();
            arrayDeque2.addLast(this.F);
            sequenceScope = (SequenceScope) this.E;
            arrayDeque = arrayDeque2;
            it = this.G.k(this.F).iterator();
        } else if (i2 == 1) {
            it = (Iterator) this.C;
            ResultKt.b(obj);
            arrayDeque = (ArrayDeque) this.f43470B;
            sequenceScope = (SequenceScope) this.E;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        while (it.hasNext()) {
            FileSystem fileSystem = this.G;
            boolean z2 = this.H;
            this.E = sequenceScope;
            this.f43470B = arrayDeque;
            this.C = it;
            this.D = 1;
            if (FileSystem.a(sequenceScope, fileSystem, arrayDeque, (Path) it.next(), z2, false, this) == f2) {
                return f2;
            }
        }
        return Unit.f40552a;
    }

    /* renamed from: z */
    public final Object m(SequenceScope sequenceScope, Continuation continuation) {
        return ((FileSystem$commonListRecursively$1) s(sequenceScope, continuation)).x(Unit.f40552a);
    }
}
