package okio.internal;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.ByteString;

@Metadata
/* renamed from: okio.internal.-Path  reason: invalid class name */
public final class Path {

    /* renamed from: a  reason: collision with root package name */
    public static final ByteString f43471a;

    /* renamed from: b  reason: collision with root package name */
    public static final ByteString f43472b;

    /* renamed from: c  reason: collision with root package name */
    public static final ByteString f43473c;

    /* renamed from: d  reason: collision with root package name */
    public static final ByteString f43474d;

    /* renamed from: e  reason: collision with root package name */
    public static final ByteString f43475e;

    static {
        ByteString.Companion companion = ByteString.C;
        f43471a = companion.d("/");
        f43472b = companion.d("\\");
        f43473c = companion.d("/\\");
        f43474d = companion.d(".");
        f43475e = companion.d("..");
    }

    public static final okio.Path j(okio.Path path, okio.Path path2, boolean z2) {
        Intrinsics.i(path, "<this>");
        Intrinsics.i(path2, "child");
        if (path2.k() || path2.B() != null) {
            return path2;
        }
        ByteString m2 = m(path);
        if (m2 == null && (m2 = m(path2)) == null) {
            m2 = s(okio.Path.f43405B);
        }
        Buffer buffer = new Buffer();
        buffer.k1(path.f());
        if (buffer.n0() > 0) {
            buffer.k1(m2);
        }
        buffer.k1(path2.f());
        return q(buffer, z2);
    }

    public static final okio.Path k(String str, boolean z2) {
        Intrinsics.i(str, "<this>");
        return q(new Buffer().K0(str), z2);
    }

    public static final int l(okio.Path path) {
        int C = ByteString.C(path.f(), f43471a, 0, 2, (Object) null);
        return C != -1 ? C : ByteString.C(path.f(), f43472b, 0, 2, (Object) null);
    }

    public static final ByteString m(okio.Path path) {
        ByteString f2 = path.f();
        ByteString byteString = f43471a;
        if (ByteString.x(f2, byteString, 0, 2, (Object) null) != -1) {
            return byteString;
        }
        ByteString f3 = path.f();
        ByteString byteString2 = f43472b;
        if (ByteString.x(f3, byteString2, 0, 2, (Object) null) != -1) {
            return byteString2;
        }
        return null;
    }

    public static final boolean n(okio.Path path) {
        return path.f().j(f43475e) && (path.f().N() == 2 || path.f().E(path.f().N() + -3, f43471a, 0, 1) || path.f().E(path.f().N() + -3, f43472b, 0, 1));
    }

    public static final int o(okio.Path path) {
        if (path.f().N() == 0) {
            return -1;
        }
        if (path.f().k(0) == 47) {
            return 1;
        }
        if (path.f().k(0) != 92) {
            if (path.f().N() > 2 && path.f().k(1) == 58 && path.f().k(2) == 92) {
                char k2 = (char) path.f().k(0);
                if ('a' > k2 || k2 >= '{') {
                    return ('A' > k2 || k2 >= '[') ? -1 : 3;
                }
                return 3;
            }
        } else if (path.f().N() <= 2 || path.f().k(1) != 92) {
            return 1;
        } else {
            int r2 = path.f().r(f43472b, 2);
            return r2 == -1 ? path.f().N() : r2;
        }
    }

    public static final boolean p(Buffer buffer, ByteString byteString) {
        if (!Intrinsics.d(byteString, f43472b) || buffer.n0() < 2 || buffer.r(1) != 58) {
            return false;
        }
        char r2 = (char) buffer.r(0);
        return ('a' <= r2 && r2 < '{') || ('A' <= r2 && r2 < '[');
    }

    public static final okio.Path q(Buffer buffer, boolean z2) {
        ByteString byteString;
        ByteString byteString2;
        Buffer buffer2 = buffer;
        Intrinsics.i(buffer2, "<this>");
        Buffer buffer3 = new Buffer();
        ByteString byteString3 = null;
        int i2 = 0;
        while (true) {
            if (!buffer2.I(0, f43471a)) {
                byteString = f43472b;
                if (!buffer2.I(0, byteString)) {
                    break;
                }
            }
            byte readByte = buffer.readByte();
            if (byteString3 == null) {
                byteString3 = r(readByte);
            }
            i2++;
        }
        boolean z3 = i2 >= 2 && Intrinsics.d(byteString3, byteString);
        if (z3) {
            Intrinsics.f(byteString3);
            buffer3.k1(byteString3);
            buffer3.k1(byteString3);
        } else if (i2 > 0) {
            Intrinsics.f(byteString3);
            buffer3.k1(byteString3);
        } else {
            long G = buffer2.G(f43473c);
            if (byteString3 == null) {
                byteString3 = G == -1 ? s(okio.Path.f43405B) : r(buffer2.r(G));
            }
            if (p(buffer2, byteString3)) {
                if (G == 2) {
                    buffer3.N0(buffer2, 3);
                } else {
                    buffer3.N0(buffer2, 2);
                }
            }
        }
        boolean z4 = buffer3.n0() > 0;
        ArrayList arrayList = new ArrayList();
        while (!buffer.l0()) {
            long G2 = buffer2.G(f43473c);
            if (G2 == -1) {
                byteString2 = buffer.X();
            } else {
                byteString2 = buffer2.R(G2);
                buffer.readByte();
            }
            ByteString byteString4 = f43475e;
            if (Intrinsics.d(byteString2, byteString4)) {
                if (!z4 || !arrayList.isEmpty()) {
                    if (!z2 || (!z4 && (arrayList.isEmpty() || Intrinsics.d(CollectionsKt.p0(arrayList), byteString4)))) {
                        arrayList.add(byteString2);
                    } else if (!z3 || arrayList.size() != 1) {
                        CollectionsKt.L(arrayList);
                    }
                }
            } else if (!Intrinsics.d(byteString2, f43474d) && !Intrinsics.d(byteString2, ByteString.D)) {
                arrayList.add(byteString2);
            }
        }
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (i3 > 0) {
                buffer3.k1(byteString3);
            }
            buffer3.k1((ByteString) arrayList.get(i3));
        }
        if (buffer3.n0() == 0) {
            buffer3.k1(f43474d);
        }
        return new okio.Path(buffer3.X());
    }

    public static final ByteString r(byte b2) {
        if (b2 == 47) {
            return f43471a;
        }
        if (b2 == 92) {
            return f43472b;
        }
        throw new IllegalArgumentException("not a directory separator: " + b2);
    }

    public static final ByteString s(String str) {
        if (Intrinsics.d(str, "/")) {
            return f43471a;
        }
        if (Intrinsics.d(str, "\\")) {
            return f43472b;
        }
        throw new IllegalArgumentException("not a directory separator: " + str);
    }
}
