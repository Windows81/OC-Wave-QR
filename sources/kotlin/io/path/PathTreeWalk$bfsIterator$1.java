package kotlin.io.path;

import java.nio.file.Path;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;

@Metadata
@DebugMetadata(c = "kotlin.io.path.PathTreeWalk$bfsIterator$1", f = "PathTreeWalk.kt", l = {191, 197}, m = "invokeSuspend")
public final class PathTreeWalk$bfsIterator$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Path>, Continuation<? super Unit>, Object> {

    /* renamed from: B  reason: collision with root package name */
    public Object f40852B;
    public Object C;
    public Object D;
    public Object E;
    public Object F;
    public int G;
    public /* synthetic */ Object H;
    public final /* synthetic */ PathTreeWalk I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PathTreeWalk$bfsIterator$1(PathTreeWalk pathTreeWalk, Continuation continuation) {
        super(2, continuation);
        this.I = pathTreeWalk;
    }

    public final Continuation s(Object obj, Continuation continuation) {
        PathTreeWalk$bfsIterator$1 pathTreeWalk$bfsIterator$1 = new PathTreeWalk$bfsIterator$1(this.I, continuation);
        pathTreeWalk$bfsIterator$1.H = obj;
        return pathTreeWalk$bfsIterator$1;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0133 A[SYNTHETIC] */
    public final java.lang.Object x(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r12.G
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0044
            if (r1 == r3) goto L_0x0027
            if (r1 != r2) goto L_0x001f
            java.lang.Object r1 = r12.C
            kotlin.io.path.DirectoryEntriesReader r1 = (kotlin.io.path.DirectoryEntriesReader) r1
            java.lang.Object r5 = r12.f40852B
            kotlin.collections.ArrayDeque r5 = (kotlin.collections.ArrayDeque) r5
            java.lang.Object r6 = r12.H
            kotlin.sequences.SequenceScope r6 = (kotlin.sequences.SequenceScope) r6
            kotlin.ResultKt.b(r13)
            goto L_0x007d
        L_0x001f:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x0027:
            java.lang.Object r1 = r12.F
            java.nio.file.Path r1 = (java.nio.file.Path) r1
            java.lang.Object r5 = r12.E
            kotlin.io.path.PathTreeWalk r5 = (kotlin.io.path.PathTreeWalk) r5
            java.lang.Object r6 = r12.D
            kotlin.io.path.PathNode r6 = (kotlin.io.path.PathNode) r6
            java.lang.Object r7 = r12.C
            kotlin.io.path.DirectoryEntriesReader r7 = (kotlin.io.path.DirectoryEntriesReader) r7
            java.lang.Object r8 = r12.f40852B
            kotlin.collections.ArrayDeque r8 = (kotlin.collections.ArrayDeque) r8
            java.lang.Object r9 = r12.H
            kotlin.sequences.SequenceScope r9 = (kotlin.sequences.SequenceScope) r9
            kotlin.ResultKt.b(r13)
            goto L_0x00d8
        L_0x0044:
            kotlin.ResultKt.b(r13)
            java.lang.Object r13 = r12.H
            kotlin.sequences.SequenceScope r13 = (kotlin.sequences.SequenceScope) r13
            kotlin.collections.ArrayDeque r1 = new kotlin.collections.ArrayDeque
            r1.<init>()
            kotlin.io.path.DirectoryEntriesReader r5 = new kotlin.io.path.DirectoryEntriesReader
            kotlin.io.path.PathTreeWalk r6 = r12.I
            boolean r6 = r6.h()
            r5.<init>(r6)
            kotlin.io.path.PathNode r6 = new kotlin.io.path.PathNode
            kotlin.io.path.PathTreeWalk r7 = r12.I
            java.nio.file.Path r7 = r7.f40850a
            kotlin.io.path.PathTreeWalk r8 = r12.I
            java.nio.file.Path r8 = r8.f40850a
            kotlin.io.path.PathTreeWalk r9 = r12.I
            java.nio.file.LinkOption[] r9 = r9.j()
            java.lang.Object r8 = kotlin.io.path.PathTreeWalkKt.d(r8, r9)
            r6.<init>(r7, r8, r4)
            r1.addLast(r6)
            r6 = r13
            r11 = r5
            r5 = r1
            r1 = r11
        L_0x007d:
            boolean r13 = r5.isEmpty()
            if (r13 != 0) goto L_0x0133
            java.lang.Object r13 = r5.removeFirst()
            kotlin.io.path.PathNode r13 = (kotlin.io.path.PathNode) r13
            kotlin.io.path.PathTreeWalk r7 = r12.I
            java.nio.file.Path r8 = r13.d()
            kotlin.io.path.PathNode r9 = r13.c()
            if (r9 == 0) goto L_0x0098
            kotlin.io.path.PathsKt__PathRecursiveFunctionsKt.c(r8)
        L_0x0098:
            java.nio.file.LinkOption[] r9 = r7.j()
            int r10 = r9.length
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r9, r10)
            java.nio.file.LinkOption[] r9 = (java.nio.file.LinkOption[]) r9
            int r10 = r9.length
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r9, r10)
            java.nio.file.LinkOption[] r9 = (java.nio.file.LinkOption[]) r9
            boolean r9 = java.nio.file.Files.isDirectory(r8, r9)
            if (r9 == 0) goto L_0x010c
            boolean r9 = kotlin.io.path.PathTreeWalkKt.c(r13)
            if (r9 != 0) goto L_0x0102
            boolean r9 = r7.i()
            if (r9 == 0) goto L_0x00df
            r12.H = r6
            r12.f40852B = r5
            r12.C = r1
            r12.D = r13
            r12.E = r7
            r12.F = r8
            r12.G = r3
            java.lang.Object r9 = r6.c(r8, r12)
            if (r9 != r0) goto L_0x00d1
            return r0
        L_0x00d1:
            r9 = r6
            r6 = r13
            r11 = r7
            r7 = r1
            r1 = r8
            r8 = r5
            r5 = r11
        L_0x00d8:
            r13 = r6
            r6 = r9
            r11 = r8
            r8 = r1
            r1 = r7
            r7 = r5
            r5 = r11
        L_0x00df:
            java.nio.file.LinkOption[] r7 = r7.j()
            int r9 = r7.length
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r9)
            java.nio.file.LinkOption[] r7 = (java.nio.file.LinkOption[]) r7
            int r9 = r7.length
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r9)
            java.nio.file.LinkOption[] r7 = (java.nio.file.LinkOption[]) r7
            boolean r7 = java.nio.file.Files.isDirectory(r8, r7)
            if (r7 == 0) goto L_0x007d
            java.util.List r13 = r1.b(r13)
            java.util.Collection r13 = (java.util.Collection) r13
            r5.addAll(r13)
            goto L_0x007d
        L_0x0102:
            java.nio.file.FileSystemLoopException r13 = new java.nio.file.FileSystemLoopException
            java.lang.String r0 = r8.toString()
            r13.<init>(r0)
            throw r13
        L_0x010c:
            java.nio.file.LinkOption r13 = java.nio.file.LinkOption.NOFOLLOW_LINKS
            java.nio.file.LinkOption[] r13 = new java.nio.file.LinkOption[]{r13}
            java.lang.Object[] r13 = java.util.Arrays.copyOf(r13, r3)
            java.nio.file.LinkOption[] r13 = (java.nio.file.LinkOption[]) r13
            boolean r13 = java.nio.file.Files.exists(r8, r13)
            if (r13 == 0) goto L_0x007d
            r12.H = r6
            r12.f40852B = r5
            r12.C = r1
            r12.D = r4
            r12.E = r4
            r12.F = r4
            r12.G = r2
            java.lang.Object r13 = r6.c(r8, r12)
            if (r13 != r0) goto L_0x007d
            return r0
        L_0x0133:
            kotlin.Unit r13 = kotlin.Unit.f40552a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.path.PathTreeWalk$bfsIterator$1.x(java.lang.Object):java.lang.Object");
    }

    /* renamed from: z */
    public final Object m(SequenceScope sequenceScope, Continuation continuation) {
        return ((PathTreeWalk$bfsIterator$1) s(sequenceScope, continuation)).x(Unit.f40552a);
    }
}
