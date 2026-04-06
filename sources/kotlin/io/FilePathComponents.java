package kotlin.io;

import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class FilePathComponents {

    /* renamed from: a  reason: collision with root package name */
    public final File f40762a;

    /* renamed from: b  reason: collision with root package name */
    public final List f40763b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilePathComponents)) {
            return false;
        }
        FilePathComponents filePathComponents = (FilePathComponents) obj;
        return Intrinsics.d(this.f40762a, filePathComponents.f40762a) && Intrinsics.d(this.f40763b, filePathComponents.f40763b);
    }

    public int hashCode() {
        return (this.f40762a.hashCode() * 31) + this.f40763b.hashCode();
    }

    public String toString() {
        return "FilePathComponents(root=" + this.f40762a + ", segments=" + this.f40763b + ')';
    }
}
