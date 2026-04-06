package kotlin.io.path;

import java.nio.file.FileVisitOption;
import java.nio.file.LinkOption;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;

@Metadata
public final class LinkFollowing {

    /* renamed from: a  reason: collision with root package name */
    public static final LinkFollowing f40835a = new LinkFollowing();

    /* renamed from: b  reason: collision with root package name */
    public static final LinkOption[] f40836b = {LinkOption.NOFOLLOW_LINKS};

    /* renamed from: c  reason: collision with root package name */
    public static final LinkOption[] f40837c = new LinkOption[0];

    /* renamed from: d  reason: collision with root package name */
    public static final Set f40838d = SetsKt.d();

    /* renamed from: e  reason: collision with root package name */
    public static final Set f40839e = SetsKt.c(FileVisitOption.FOLLOW_LINKS);

    public final LinkOption[] a(boolean z2) {
        return z2 ? f40837c : f40836b;
    }

    public final Set b(boolean z2) {
        return z2 ? f40839e : f40838d;
    }
}
