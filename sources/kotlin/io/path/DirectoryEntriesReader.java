package kotlin.io.path;

import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class DirectoryEntriesReader extends SimpleFileVisitor<Path> {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f40828a;

    /* renamed from: b  reason: collision with root package name */
    public PathNode f40829b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayDeque f40830c = new ArrayDeque();

    public DirectoryEntriesReader(boolean z2) {
        this.f40828a = z2;
    }

    /* renamed from: a */
    public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes basicFileAttributes) {
        Intrinsics.i(path, "dir");
        Intrinsics.i(basicFileAttributes, "attrs");
        this.f40830c.add(new PathNode(path, basicFileAttributes.fileKey(), this.f40829b));
        FileVisitResult preVisitDirectory = super.preVisitDirectory(path, basicFileAttributes);
        Intrinsics.h(preVisitDirectory, "preVisitDirectory(...)");
        return preVisitDirectory;
    }

    public final List b(PathNode pathNode) {
        Intrinsics.i(pathNode, "directoryNode");
        this.f40829b = pathNode;
        Files.walkFileTree(pathNode.d(), LinkFollowing.f40835a.b(this.f40828a), 1, this);
        this.f40830c.removeFirst();
        ArrayDeque arrayDeque = this.f40830c;
        this.f40830c = new ArrayDeque();
        return arrayDeque;
    }

    /* renamed from: c */
    public FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) {
        Intrinsics.i(path, "file");
        Intrinsics.i(basicFileAttributes, "attrs");
        this.f40830c.add(new PathNode(path, (Object) null, this.f40829b));
        FileVisitResult visitFile = super.visitFile(path, basicFileAttributes);
        Intrinsics.h(visitFile, "visitFile(...)");
        return visitFile;
    }
}
