package okio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.Path;

@Metadata
public class NioSystemFileSystem extends JvmSystemFileSystem {
    public void c(Path path, Path path2) {
        Intrinsics.i(path, "source");
        Intrinsics.i(path2, "target");
        try {
            Files.move(path.A(), path2.A(), new CopyOption[]{StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING});
        } catch (NoSuchFileException e2) {
            throw new FileNotFoundException(e2.getMessage());
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        }
    }

    public FileMetadata n(Path path) {
        Intrinsics.i(path, "path");
        return x(path.A());
    }

    public String toString() {
        return "NioSystemFileSystem";
    }

    public final FileMetadata x(Path path) {
        Intrinsics.i(path, "nioPath");
        Long l2 = null;
        try {
            BasicFileAttributes readAttributes = Files.readAttributes(path, BasicFileAttributes.class, new LinkOption[]{LinkOption.NOFOLLOW_LINKS});
            Path readSymbolicLink = readAttributes.isSymbolicLink() ? Files.readSymbolicLink(path) : null;
            boolean isRegularFile = readAttributes.isRegularFile();
            boolean isDirectory = readAttributes.isDirectory();
            Path f2 = readSymbolicLink != null ? Path.Companion.f(Path.f43404A, readSymbolicLink, false, 1, (Object) null) : null;
            Long valueOf = Long.valueOf(readAttributes.size());
            FileTime creationTime = readAttributes.creationTime();
            Long y2 = creationTime != null ? y(creationTime) : null;
            FileTime lastModifiedTime = readAttributes.lastModifiedTime();
            Long y3 = lastModifiedTime != null ? y(lastModifiedTime) : null;
            FileTime lastAccessTime = readAttributes.lastAccessTime();
            if (lastAccessTime != null) {
                l2 = y(lastAccessTime);
            }
            return new FileMetadata(isRegularFile, isDirectory, f2, valueOf, y2, y3, l2, (Map) null, 128, (DefaultConstructorMarker) null);
        } catch (FileSystemException | NoSuchFileException unused) {
            return null;
        }
    }

    public final Long y(FileTime fileTime) {
        Long valueOf = Long.valueOf(fileTime.toMillis());
        if (valueOf.longValue() != 0) {
            return valueOf;
        }
        return null;
    }
}
