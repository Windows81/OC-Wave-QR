package kotlin.io.path;

import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final /* synthetic */ class PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$3 extends FunctionReferenceImpl implements Function2<Path, Exception, FileVisitResult> {
    public final /* synthetic */ Function3 I;
    public final /* synthetic */ Path J;
    public final /* synthetic */ Path K;
    public final /* synthetic */ Path L;

    /* renamed from: v */
    public final FileVisitResult m(Path path, Exception exc) {
        Intrinsics.i(path, "p0");
        Intrinsics.i(exc, "p1");
        return PathsKt__PathRecursiveFunctionsKt.g(this.I, this.J, this.K, this.L, path, exc);
    }
}
