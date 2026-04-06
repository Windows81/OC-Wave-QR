package androidx.navigation;

import android.content.Intent;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public class NavDeepLinkRequest {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f22319a;

    /* renamed from: b  reason: collision with root package name */
    public final String f22320b;

    /* renamed from: c  reason: collision with root package name */
    public final String f22321c;

    @Metadata
    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public static final Companion f22322a = new Companion((DefaultConstructorMarker) null);

        @Metadata
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public Companion() {
            }
        }
    }

    public NavDeepLinkRequest(Uri uri, String str, String str2) {
        this.f22319a = uri;
        this.f22320b = str;
        this.f22321c = str2;
    }

    public String a() {
        return this.f22320b;
    }

    public String b() {
        return this.f22321c;
    }

    public Uri c() {
        return this.f22319a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NavDeepLinkRequest");
        sb.append("{");
        if (c() != null) {
            sb.append(" uri=");
            sb.append(String.valueOf(c()));
        }
        if (a() != null) {
            sb.append(" action=");
            sb.append(a());
        }
        if (b() != null) {
            sb.append(" mimetype=");
            sb.append(b());
        }
        sb.append(" }");
        String sb2 = sb.toString();
        Intrinsics.h(sb2, "sb.toString()");
        return sb2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NavDeepLinkRequest(Intent intent) {
        this(intent.getData(), intent.getAction(), intent.getType());
        Intrinsics.i(intent, "intent");
    }
}
