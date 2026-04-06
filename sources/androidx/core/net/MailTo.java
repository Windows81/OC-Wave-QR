package androidx.core.net;

import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

public final class MailTo {

    /* renamed from: a  reason: collision with root package name */
    public HashMap f19938a;

    public String toString() {
        StringBuilder sb = new StringBuilder("mailto:");
        sb.append('?');
        for (Map.Entry entry : this.f19938a.entrySet()) {
            sb.append(Uri.encode((String) entry.getKey()));
            sb.append('=');
            sb.append(Uri.encode((String) entry.getValue()));
            sb.append('&');
        }
        return sb.toString();
    }
}
