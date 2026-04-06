package kotlin.io.path;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class FileVisitorImpl extends SimpleFileVisitor<Path> {

    /* renamed from: a  reason: collision with root package name */
    public final Function2 f40831a;

    /* renamed from: b  reason: collision with root package name */
    public final Function2 f40832b;

    /* renamed from: c  reason: collision with root package name */
    public final Function2 f40833c;

    /* renamed from: d  reason: collision with root package name */
    public final Function2 f40834d;

    /* renamed from: a */
    public FileVisitResult postVisitDirectory(Path path, IOException iOException) {
        FileVisitResult fileVisitResult;
        Intrinsics.i(path, "dir");
        Function2 function2 = this.f40834d;
        if (function2 != null && (fileVisitResult = (FileVisitResult) function2.m(path, iOException)) != null) {
            return fileVisitResult;
        }
        FileVisitResult postVisitDirectory = super.postVisitDirectory(path, iOException);
        Intrinsics.h(postVisitDirectory, "postVisitDirectory(...)");
        return postVisitDirectory;
    }

    /* renamed from: b */
    public FileVisitResult preVisitDirectory(Path path, BasicFileAttributes basicFileAttributes) {
        FileVisitResult fileVisitResult;
        Intrinsics.i(path, "dir");
        Intrinsics.i(basicFileAttributes, "attrs");
        Function2 function2 = this.f40831a;
        if (function2 != null && (fileVisitResult = (FileVisitResult) function2.m(path, basicFileAttributes)) != null) {
            return fileVisitResult;
        }
        FileVisitResult preVisitDirectory = super.preVisitDirectory(path, basicFileAttributes);
        Intrinsics.h(preVisitDirectory, "preVisitDirectory(...)");
        return preVisitDirectory;
    }

    /* renamed from: c */
    public FileVisitResult visitFile(Path path, BasicFileAttributes basicFileAttributes) {
        FileVisitResult fileVisitResult;
        Intrinsics.i(path, "file");
        Intrinsics.i(basicFileAttributes, "attrs");
        Function2 function2 = this.f40832b;
        if (function2 != null && (fileVisitResult = (FileVisitResult) function2.m(path, basicFileAttributes)) != null) {
            return fileVisitResult;
        }
        FileVisitResult visitFile = super.visitFile(path, basicFileAttributes);
        Intrinsics.h(visitFile, "visitFile(...)");
        return visitFile;
    }

    /* renamed from: d */
    public FileVisitResult visitFileFailed(Path path, IOException iOException) {
        FileVisitResult fileVisitResult;
        Intrinsics.i(path, "file");
        Intrinsics.i(iOException, "exc");
        Function2 function2 = this.f40833c;
        if (function2 != null && (fileVisitResult = (FileVisitResult) function2.m(path, iOException)) != null) {
            return fileVisitResult;
        }
        FileVisitResult visitFileFailed = super.visitFileFailed(path, iOException);
        Intrinsics.h(visitFileFailed, "visitFileFailed(...)");
        return visitFileFailed;
    }
}
