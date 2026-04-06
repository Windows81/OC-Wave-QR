package kotlin.io.path;

import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final /* synthetic */ class PathsKt__PathRecursiveFunctionsKt$copyToRecursively$5$2 extends FunctionReferenceImpl implements Function2<Path, BasicFileAttributes, FileVisitResult> {
    public final /* synthetic */ ArrayList I;
    public final /* synthetic */ Function3 J;
    public final /* synthetic */ Path K;
    public final /* synthetic */ Path L;
    public final /* synthetic */ Path M;
    public final /* synthetic */ Function3 N;

    /* renamed from: v */
    public final FileVisitResult m(Path path, BasicFileAttributes basicFileAttributes) {
        Intrinsics.i(path, "p0");
        Intrinsics.i(basicFileAttributes, "p1");
        return PathsKt__PathRecursiveFunctionsKt.e(this.I, this.J, this.K, this.L, this.M, this.N, path, basicFileAttributes);
    }
}
