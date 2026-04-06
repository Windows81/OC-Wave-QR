package okio.internal;

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
@DebugMetadata(c = "okio.internal.-FileSystem$commonDeleteRecursively$sequence$1", f = "FileSystem.kt", l = {75}, m = "invokeSuspend")
/* renamed from: okio.internal.-FileSystem$commonDeleteRecursively$sequence$1  reason: invalid class name */
final class FileSystem$commonDeleteRecursively$sequence$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Path>, Continuation<? super Unit>, Object> {

    /* renamed from: B  reason: collision with root package name */
    public int f43469B;
    public /* synthetic */ Object C;
    public final /* synthetic */ FileSystem D;
    public final /* synthetic */ Path E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FileSystem$commonDeleteRecursively$sequence$1(FileSystem fileSystem, Path path, Continuation continuation) {
        super(2, continuation);
        this.D = fileSystem;
        this.E = path;
    }

    public final Continuation s(Object obj, Continuation continuation) {
        FileSystem$commonDeleteRecursively$sequence$1 r0 = new FileSystem$commonDeleteRecursively$sequence$1(this.D, this.E, continuation);
        r0.C = obj;
        return r0;
    }

    public final Object x(Object obj) {
        Object f2 = IntrinsicsKt.f();
        int i2 = this.f43469B;
        if (i2 == 0) {
            ResultKt.b(obj);
            FileSystem fileSystem = this.D;
            ArrayDeque arrayDeque = new ArrayDeque();
            Path path = this.E;
            this.f43469B = 1;
            if (FileSystem.a((SequenceScope) this.C, fileSystem, arrayDeque, path, false, true, this) == f2) {
                return f2;
            }
        } else if (i2 == 1) {
            ResultKt.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.f40552a;
    }

    /* renamed from: z */
    public final Object m(SequenceScope sequenceScope, Continuation continuation) {
        return ((FileSystem$commonDeleteRecursively$sequence$1) s(sequenceScope, continuation)).x(Unit.f40552a);
    }
}
