package okio;

import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class Path implements Comparable<Path> {

    /* renamed from: A  reason: collision with root package name */
    public static final Companion f43404A = new Companion((DefaultConstructorMarker) null);

    /* renamed from: B  reason: collision with root package name */
    public static final String f43405B;

    /* renamed from: z  reason: collision with root package name */
    public final ByteString f43406z;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Path d(Companion companion, File file, boolean z2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z2 = false;
            }
            return companion.a(file, z2);
        }

        public static /* synthetic */ Path e(Companion companion, String str, boolean z2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z2 = false;
            }
            return companion.b(str, z2);
        }

        public static /* synthetic */ Path f(Companion companion, java.nio.file.Path path, boolean z2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z2 = false;
            }
            return companion.c(path, z2);
        }

        public final Path a(File file, boolean z2) {
            Intrinsics.i(file, "<this>");
            String file2 = file.toString();
            Intrinsics.h(file2, "toString(...)");
            return b(file2, z2);
        }

        public final Path b(String str, boolean z2) {
            Intrinsics.i(str, "<this>");
            return okio.internal.Path.k(str, z2);
        }

        public final Path c(java.nio.file.Path path, boolean z2) {
            Intrinsics.i(path, "<this>");
            return b(path.toString(), z2);
        }

        public Companion() {
        }
    }

    static {
        String str = File.separator;
        Intrinsics.h(str, "separator");
        f43405B = str;
    }

    public Path(ByteString byteString) {
        Intrinsics.i(byteString, "bytes");
        this.f43406z = byteString;
    }

    public static /* synthetic */ Path y(Path path, Path path2, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return path.x(path2, z2);
    }

    public final java.nio.file.Path A() {
        java.nio.file.Path path = Paths.get(toString(), new String[0]);
        Intrinsics.h(path, "get(...)");
        return path;
    }

    public final Character B() {
        if (ByteString.x(f(), okio.internal.Path.f43471a, 0, 2, (Object) null) != -1 || f().N() < 2 || f().k(1) != 58) {
            return null;
        }
        char k2 = (char) f().k(0);
        if (('a' > k2 || k2 >= '{') && ('A' > k2 || k2 >= '[')) {
            return null;
        }
        return Character.valueOf(k2);
    }

    /* renamed from: d */
    public int compareTo(Path path) {
        Intrinsics.i(path, "other");
        return f().compareTo(path.f());
    }

    public boolean equals(Object obj) {
        return (obj instanceof Path) && Intrinsics.d(((Path) obj).f(), f());
    }

    public final ByteString f() {
        return this.f43406z;
    }

    public final Path h() {
        int h2 = okio.internal.Path.o(this);
        if (h2 == -1) {
            return null;
        }
        return new Path(f().R(0, h2));
    }

    public int hashCode() {
        return f().hashCode();
    }

    public final List j() {
        ArrayList arrayList = new ArrayList();
        int h2 = okio.internal.Path.o(this);
        if (h2 == -1) {
            h2 = 0;
        } else if (h2 < f().N() && f().k(h2) == 92) {
            h2++;
        }
        int N = f().N();
        int i2 = h2;
        while (h2 < N) {
            if (f().k(h2) == 47 || f().k(h2) == 92) {
                arrayList.add(f().R(i2, h2));
                i2 = h2 + 1;
            }
            h2++;
        }
        if (i2 < f().N()) {
            arrayList.add(f().R(i2, f().N()));
        }
        return arrayList;
    }

    public final boolean k() {
        return okio.internal.Path.o(this) != -1;
    }

    public final String l() {
        return m().U();
    }

    public final ByteString m() {
        int d2 = okio.internal.Path.l(this);
        return d2 != -1 ? ByteString.S(f(), d2 + 1, 0, 2, (Object) null) : (B() == null || f().N() != 2) ? f() : ByteString.D;
    }

    public final Path n() {
        return f43404A.b(toString(), true);
    }

    public final Path o() {
        Path path;
        if (Intrinsics.d(f(), okio.internal.Path.f43474d) || Intrinsics.d(f(), okio.internal.Path.f43471a) || Intrinsics.d(f(), okio.internal.Path.f43472b) || okio.internal.Path.n(this)) {
            return null;
        }
        int d2 = okio.internal.Path.l(this);
        if (d2 != 2 || B() == null) {
            if (d2 == 1 && f().Q(okio.internal.Path.f43472b)) {
                return null;
            }
            if (d2 != -1 || B() == null) {
                if (d2 == -1) {
                    return new Path(okio.internal.Path.f43474d);
                }
                if (d2 != 0) {
                    return new Path(ByteString.S(f(), 0, d2, 1, (Object) null));
                }
                path = new Path(ByteString.S(f(), 0, 1, 1, (Object) null));
            } else if (f().N() == 2) {
                return null;
            } else {
                path = new Path(ByteString.S(f(), 0, 2, 1, (Object) null));
            }
        } else if (f().N() == 3) {
            return null;
        } else {
            path = new Path(ByteString.S(f(), 0, 3, 1, (Object) null));
        }
        return path;
    }

    public final Path p(Path path) {
        Intrinsics.i(path, "other");
        if (Intrinsics.d(h(), path.h())) {
            List j2 = j();
            List j3 = path.j();
            int min = Math.min(j2.size(), j3.size());
            int i2 = 0;
            while (i2 < min && Intrinsics.d(j2.get(i2), j3.get(i2))) {
                i2++;
            }
            if (i2 == min && f().N() == path.f().N()) {
                return Companion.e(f43404A, ".", false, 1, (Object) null);
            }
            if (j3.subList(i2, j3.size()).indexOf(okio.internal.Path.f43475e) == -1) {
                Buffer buffer = new Buffer();
                ByteString f2 = okio.internal.Path.m(path);
                if (f2 == null && (f2 = okio.internal.Path.m(this)) == null) {
                    f2 = okio.internal.Path.s(f43405B);
                }
                int size = j3.size();
                for (int i3 = i2; i3 < size; i3++) {
                    buffer.k1(okio.internal.Path.f43475e);
                    buffer.k1(f2);
                }
                int size2 = j2.size();
                while (i2 < size2) {
                    buffer.k1((ByteString) j2.get(i2));
                    buffer.k1(f2);
                    i2++;
                }
                return okio.internal.Path.q(buffer, false);
            }
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + path).toString());
        }
        throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + path).toString());
    }

    public final Path r(String str) {
        Intrinsics.i(str, "child");
        return okio.internal.Path.j(this, okio.internal.Path.q(new Buffer().K0(str), false), false);
    }

    public final Path t(Path path) {
        Intrinsics.i(path, "child");
        return okio.internal.Path.j(this, path, false);
    }

    public String toString() {
        return f().U();
    }

    public final Path x(Path path, boolean z2) {
        Intrinsics.i(path, "child");
        return okio.internal.Path.j(this, path, z2);
    }

    public final File z() {
        return new File(toString());
    }
}
