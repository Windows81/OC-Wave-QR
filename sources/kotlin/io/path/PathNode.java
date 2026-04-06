package kotlin.io.path;

import java.nio.file.Path;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class PathNode {

    /* renamed from: a  reason: collision with root package name */
    public final Path f40843a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f40844b;

    /* renamed from: c  reason: collision with root package name */
    public final PathNode f40845c;

    /* renamed from: d  reason: collision with root package name */
    public Iterator f40846d;

    public PathNode(Path path, Object obj, PathNode pathNode) {
        Intrinsics.i(path, "path");
        this.f40843a = path;
        this.f40844b = obj;
        this.f40845c = pathNode;
    }

    public final Iterator a() {
        return this.f40846d;
    }

    public final Object b() {
        return this.f40844b;
    }

    public final PathNode c() {
        return this.f40845c;
    }

    public final Path d() {
        return this.f40843a;
    }

    public final void e(Iterator it) {
        this.f40846d = it;
    }
}
