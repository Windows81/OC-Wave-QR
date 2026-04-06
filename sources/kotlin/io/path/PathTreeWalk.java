package kotlin.io.path;

import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

@Metadata
public final class PathTreeWalk implements Sequence<Path> {

    /* renamed from: a  reason: collision with root package name */
    public final Path f40850a;

    /* renamed from: b  reason: collision with root package name */
    public final PathWalkOption[] f40851b;

    public final Iterator f() {
        return SequencesKt.a(new PathTreeWalk$bfsIterator$1(this, (Continuation) null));
    }

    public final Iterator g() {
        return SequencesKt.a(new PathTreeWalk$dfsIterator$1(this, (Continuation) null));
    }

    public final boolean h() {
        return ArraysKt.Y(this.f40851b, PathWalkOption.FOLLOW_LINKS);
    }

    public final boolean i() {
        return ArraysKt.Y(this.f40851b, PathWalkOption.INCLUDE_DIRECTORIES);
    }

    public Iterator iterator() {
        return k() ? f() : g();
    }

    public final LinkOption[] j() {
        return LinkFollowing.f40835a.a(h());
    }

    public final boolean k() {
        return ArraysKt.Y(this.f40851b, PathWalkOption.BREADTH_FIRST);
    }
}
