package kotlin.io.path;

import java.nio.file.Path;
import java.nio.file.Paths;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata
final class PathRelativizer {

    /* renamed from: a  reason: collision with root package name */
    public static final PathRelativizer f40847a = new PathRelativizer();

    /* renamed from: b  reason: collision with root package name */
    public static final Path f40848b = Paths.get("", new String[0]);

    /* renamed from: c  reason: collision with root package name */
    public static final Path f40849c = Paths.get("..", new String[0]);

    public final Path a(Path path, Path path2) {
        Intrinsics.i(path, "path");
        Intrinsics.i(path2, "base");
        Path normalize = path2.normalize();
        Path normalize2 = path.normalize();
        Path relativize = normalize.relativize(normalize2);
        int min = Math.min(normalize.getNameCount(), normalize2.getNameCount());
        int i2 = 0;
        while (i2 < min) {
            Path name = normalize.getName(i2);
            Path path3 = f40849c;
            if (!Intrinsics.d(name, path3)) {
                break;
            } else if (Intrinsics.d(normalize2.getName(i2), path3)) {
                i2++;
            } else {
                throw new IllegalArgumentException("Unable to compute relative path");
            }
        }
        if (Intrinsics.d(normalize2, normalize) || !Intrinsics.d(normalize, f40848b)) {
            String obj = relativize.toString();
            String separator = relativize.getFileSystem().getSeparator();
            Intrinsics.h(separator, "getSeparator(...)");
            normalize2 = StringsKt.A(obj, separator, false, 2, (Object) null) ? relativize.getFileSystem().getPath(StringsKt.j1(obj, relativize.getFileSystem().getSeparator().length()), new String[0]) : relativize;
        }
        Intrinsics.f(normalize2);
        return normalize2;
    }
}
