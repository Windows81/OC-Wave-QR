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
@DebugMetadata(c = "kotlin.io.path.PathTreeWalk$dfsIterator$1", f = "PathTreeWalk.kt", l = {191, 197, 210, 216}, m = "invokeSuspend")
public final class PathTreeWalk$dfsIterator$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Path>, Continuation<? super Unit>, Object> {

    /* renamed from: B  reason: collision with root package name */
    public Object f40853B;
    public Object C;
    public Object D;
    public Object E;
    public Object F;
    public int G;
    public /* synthetic */ Object H;
    public final /* synthetic */ PathTreeWalk I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PathTreeWalk$dfsIterator$1(PathTreeWalk pathTreeWalk, Continuation continuation) {
        super(2, continuation);
        this.I = pathTreeWalk;
    }

    public final Continuation s(Object obj, Continuation continuation) {
        PathTreeWalk$dfsIterator$1 pathTreeWalk$dfsIterator$1 = new PathTreeWalk$dfsIterator$1(this.I, continuation);
        pathTreeWalk$dfsIterator$1.H = obj;
        return pathTreeWalk$dfsIterator$1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: kotlin.sequences.SequenceScope} */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0218 A[SYNTHETIC] */
    public final java.lang.Object x(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r1 = r14.G
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r1 == 0) goto L_0x0069
            if (r1 == r6) goto L_0x004c
            if (r1 == r4) goto L_0x003b
            if (r1 == r3) goto L_0x001e
            if (r1 != r2) goto L_0x0016
            goto L_0x003b
        L_0x0016:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L_0x001e:
            java.lang.Object r1 = r14.F
            java.nio.file.Path r1 = (java.nio.file.Path) r1
            java.lang.Object r4 = r14.E
            kotlin.io.path.PathTreeWalk r4 = (kotlin.io.path.PathTreeWalk) r4
            java.lang.Object r7 = r14.D
            kotlin.io.path.PathNode r7 = (kotlin.io.path.PathNode) r7
            java.lang.Object r8 = r14.C
            kotlin.io.path.DirectoryEntriesReader r8 = (kotlin.io.path.DirectoryEntriesReader) r8
            java.lang.Object r9 = r14.f40853B
            kotlin.collections.ArrayDeque r9 = (kotlin.collections.ArrayDeque) r9
            java.lang.Object r10 = r14.H
            kotlin.sequences.SequenceScope r10 = (kotlin.sequences.SequenceScope) r10
            kotlin.ResultKt.b(r15)
            goto L_0x01b3
        L_0x003b:
            java.lang.Object r1 = r14.C
            kotlin.io.path.DirectoryEntriesReader r1 = (kotlin.io.path.DirectoryEntriesReader) r1
            java.lang.Object r4 = r14.f40853B
            kotlin.collections.ArrayDeque r4 = (kotlin.collections.ArrayDeque) r4
            java.lang.Object r7 = r14.H
            kotlin.sequences.SequenceScope r7 = (kotlin.sequences.SequenceScope) r7
            kotlin.ResultKt.b(r15)
            goto L_0x0145
        L_0x004c:
            java.lang.Object r1 = r14.F
            java.nio.file.Path r1 = (java.nio.file.Path) r1
            java.lang.Object r4 = r14.E
            kotlin.io.path.PathTreeWalk r4 = (kotlin.io.path.PathTreeWalk) r4
            java.lang.Object r7 = r14.D
            kotlin.io.path.PathNode r7 = (kotlin.io.path.PathNode) r7
            java.lang.Object r8 = r14.C
            kotlin.io.path.DirectoryEntriesReader r8 = (kotlin.io.path.DirectoryEntriesReader) r8
            java.lang.Object r9 = r14.f40853B
            kotlin.collections.ArrayDeque r9 = (kotlin.collections.ArrayDeque) r9
            java.lang.Object r10 = r14.H
            kotlin.sequences.SequenceScope r10 = (kotlin.sequences.SequenceScope) r10
            kotlin.ResultKt.b(r15)
            goto L_0x00eb
        L_0x0069:
            kotlin.ResultKt.b(r15)
            java.lang.Object r15 = r14.H
            r7 = r15
            kotlin.sequences.SequenceScope r7 = (kotlin.sequences.SequenceScope) r7
            kotlin.collections.ArrayDeque r15 = new kotlin.collections.ArrayDeque
            r15.<init>()
            kotlin.io.path.DirectoryEntriesReader r1 = new kotlin.io.path.DirectoryEntriesReader
            kotlin.io.path.PathTreeWalk r8 = r14.I
            boolean r8 = r8.h()
            r1.<init>(r8)
            kotlin.io.path.PathNode r8 = new kotlin.io.path.PathNode
            kotlin.io.path.PathTreeWalk r9 = r14.I
            java.nio.file.Path r9 = r9.f40850a
            kotlin.io.path.PathTreeWalk r10 = r14.I
            java.nio.file.Path r10 = r10.f40850a
            kotlin.io.path.PathTreeWalk r11 = r14.I
            java.nio.file.LinkOption[] r11 = r11.j()
            java.lang.Object r10 = kotlin.io.path.PathTreeWalkKt.d(r10, r11)
            r8.<init>(r9, r10, r5)
            kotlin.io.path.PathTreeWalk r9 = r14.I
            java.nio.file.Path r10 = r8.d()
            kotlin.io.path.PathNode r11 = r8.c()
            if (r11 == 0) goto L_0x00ab
            kotlin.io.path.PathsKt__PathRecursiveFunctionsKt.c(r10)
        L_0x00ab:
            java.nio.file.LinkOption[] r11 = r9.j()
            int r12 = r11.length
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r12)
            java.nio.file.LinkOption[] r11 = (java.nio.file.LinkOption[]) r11
            int r12 = r11.length
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r12)
            java.nio.file.LinkOption[] r11 = (java.nio.file.LinkOption[]) r11
            boolean r11 = java.nio.file.Files.isDirectory(r10, r11)
            if (r11 == 0) goto L_0x0124
            boolean r4 = kotlin.io.path.PathTreeWalkKt.c(r8)
            if (r4 != 0) goto L_0x011a
            boolean r4 = r9.i()
            if (r4 == 0) goto L_0x00f2
            r14.H = r7
            r14.f40853B = r15
            r14.C = r1
            r14.D = r8
            r14.E = r9
            r14.F = r10
            r14.G = r6
            java.lang.Object r4 = r7.c(r10, r14)
            if (r4 != r0) goto L_0x00e4
            return r0
        L_0x00e4:
            r4 = r9
            r9 = r15
            r13 = r8
            r8 = r1
            r1 = r10
            r10 = r7
            r7 = r13
        L_0x00eb:
            r15 = r9
            r9 = r4
            r13 = r10
            r10 = r1
            r1 = r8
            r8 = r7
            r7 = r13
        L_0x00f2:
            java.nio.file.LinkOption[] r4 = r9.j()
            int r9 = r4.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r9)
            java.nio.file.LinkOption[] r4 = (java.nio.file.LinkOption[]) r4
            int r9 = r4.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r9)
            java.nio.file.LinkOption[] r4 = (java.nio.file.LinkOption[]) r4
            boolean r4 = java.nio.file.Files.isDirectory(r10, r4)
            if (r4 == 0) goto L_0x0118
            java.util.List r4 = r1.b(r8)
            java.util.Iterator r4 = r4.iterator()
            r8.e(r4)
            r15.addLast(r8)
        L_0x0118:
            r4 = r15
            goto L_0x0145
        L_0x011a:
            java.nio.file.FileSystemLoopException r15 = new java.nio.file.FileSystemLoopException
            java.lang.String r0 = r10.toString()
            r15.<init>(r0)
            throw r15
        L_0x0124:
            java.nio.file.LinkOption r8 = java.nio.file.LinkOption.NOFOLLOW_LINKS
            java.nio.file.LinkOption[] r8 = new java.nio.file.LinkOption[]{r8}
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r6)
            java.nio.file.LinkOption[] r8 = (java.nio.file.LinkOption[]) r8
            boolean r8 = java.nio.file.Files.exists(r10, r8)
            if (r8 == 0) goto L_0x0118
            r14.H = r7
            r14.f40853B = r15
            r14.C = r1
            r14.G = r4
            java.lang.Object r4 = r7.c(r10, r14)
            if (r4 != r0) goto L_0x0118
            return r0
        L_0x0145:
            boolean r15 = r4.isEmpty()
            if (r15 != 0) goto L_0x0218
            java.lang.Object r15 = r4.last()
            kotlin.io.path.PathNode r15 = (kotlin.io.path.PathNode) r15
            java.util.Iterator r15 = r15.a()
            kotlin.jvm.internal.Intrinsics.f(r15)
            boolean r8 = r15.hasNext()
            if (r8 == 0) goto L_0x0213
            java.lang.Object r15 = r15.next()
            kotlin.io.path.PathNode r15 = (kotlin.io.path.PathNode) r15
            kotlin.io.path.PathTreeWalk r8 = r14.I
            java.nio.file.Path r9 = r15.d()
            kotlin.io.path.PathNode r10 = r15.c()
            if (r10 == 0) goto L_0x0173
            kotlin.io.path.PathsKt__PathRecursiveFunctionsKt.c(r9)
        L_0x0173:
            java.nio.file.LinkOption[] r10 = r8.j()
            int r11 = r10.length
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r10, r11)
            java.nio.file.LinkOption[] r10 = (java.nio.file.LinkOption[]) r10
            int r11 = r10.length
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r10, r11)
            java.nio.file.LinkOption[] r10 = (java.nio.file.LinkOption[]) r10
            boolean r10 = java.nio.file.Files.isDirectory(r9, r10)
            if (r10 == 0) goto L_0x01ec
            boolean r10 = kotlin.io.path.PathTreeWalkKt.c(r15)
            if (r10 != 0) goto L_0x01e2
            boolean r10 = r8.i()
            if (r10 == 0) goto L_0x01ba
            r14.H = r7
            r14.f40853B = r4
            r14.C = r1
            r14.D = r15
            r14.E = r8
            r14.F = r9
            r14.G = r3
            java.lang.Object r10 = r7.c(r9, r14)
            if (r10 != r0) goto L_0x01ac
            return r0
        L_0x01ac:
            r10 = r7
            r7 = r15
            r13 = r8
            r8 = r1
            r1 = r9
            r9 = r4
            r4 = r13
        L_0x01b3:
            r15 = r7
            r7 = r10
            r13 = r9
            r9 = r1
            r1 = r8
            r8 = r4
            r4 = r13
        L_0x01ba:
            java.nio.file.LinkOption[] r8 = r8.j()
            int r10 = r8.length
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r10)
            java.nio.file.LinkOption[] r8 = (java.nio.file.LinkOption[]) r8
            int r10 = r8.length
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r10)
            java.nio.file.LinkOption[] r8 = (java.nio.file.LinkOption[]) r8
            boolean r8 = java.nio.file.Files.isDirectory(r9, r8)
            if (r8 == 0) goto L_0x0145
            java.util.List r8 = r1.b(r15)
            java.util.Iterator r8 = r8.iterator()
            r15.e(r8)
            r4.addLast(r15)
            goto L_0x0145
        L_0x01e2:
            java.nio.file.FileSystemLoopException r15 = new java.nio.file.FileSystemLoopException
            java.lang.String r0 = r9.toString()
            r15.<init>(r0)
            throw r15
        L_0x01ec:
            java.nio.file.LinkOption r15 = java.nio.file.LinkOption.NOFOLLOW_LINKS
            java.nio.file.LinkOption[] r15 = new java.nio.file.LinkOption[]{r15}
            java.lang.Object[] r15 = java.util.Arrays.copyOf(r15, r6)
            java.nio.file.LinkOption[] r15 = (java.nio.file.LinkOption[]) r15
            boolean r15 = java.nio.file.Files.exists(r9, r15)
            if (r15 == 0) goto L_0x0145
            r14.H = r7
            r14.f40853B = r4
            r14.C = r1
            r14.D = r5
            r14.E = r5
            r14.F = r5
            r14.G = r2
            java.lang.Object r15 = r7.c(r9, r14)
            if (r15 != r0) goto L_0x0145
            return r0
        L_0x0213:
            r4.removeLast()
            goto L_0x0145
        L_0x0218:
            kotlin.Unit r15 = kotlin.Unit.f40552a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.path.PathTreeWalk$dfsIterator$1.x(java.lang.Object):java.lang.Object");
    }

    /* renamed from: z */
    public final Object m(SequenceScope sequenceScope, Continuation continuation) {
        return ((PathTreeWalk$dfsIterator$1) s(sequenceScope, continuation)).x(Unit.f40552a);
    }
}
