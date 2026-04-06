package androidx.core.provider;

import android.util.Base64;
import androidx.core.util.Preconditions;
import java.util.List;

public final class FontRequest {

    /* renamed from: a  reason: collision with root package name */
    public final String f19995a;

    /* renamed from: b  reason: collision with root package name */
    public final String f19996b;

    /* renamed from: c  reason: collision with root package name */
    public final String f19997c;

    /* renamed from: d  reason: collision with root package name */
    public final List f19998d;

    /* renamed from: e  reason: collision with root package name */
    public final int f19999e = 0;

    /* renamed from: f  reason: collision with root package name */
    public final String f20000f;

    public FontRequest(String str, String str2, String str3, List list) {
        this.f19995a = (String) Preconditions.f(str);
        this.f19996b = (String) Preconditions.f(str2);
        this.f19997c = (String) Preconditions.f(str3);
        this.f19998d = (List) Preconditions.f(list);
        this.f20000f = a(str, str2, str3);
    }

    public final String a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public List b() {
        return this.f19998d;
    }

    public int c() {
        return this.f19999e;
    }

    public String d() {
        return this.f20000f;
    }

    public String e() {
        return this.f19995a;
    }

    public String f() {
        return this.f19996b;
    }

    public String g() {
        return this.f19997c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f19995a + ", mProviderPackage: " + this.f19996b + ", mQuery: " + this.f19997c + ", mCertificates:");
        for (int i2 = 0; i2 < this.f19998d.size(); i2++) {
            sb.append(" [");
            List list = (List) this.f19998d.get(i2);
            for (int i3 = 0; i3 < list.size(); i3++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i3), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f19999e);
        return sb.toString();
    }
}
