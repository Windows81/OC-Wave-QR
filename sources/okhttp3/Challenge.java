package okhttp3;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class Challenge {

    /* renamed from: a  reason: collision with root package name */
    public final String f42563a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f42564b;

    public Challenge(String str, Map map) {
        String str2;
        Intrinsics.i(str, "scheme");
        Intrinsics.i(map, "authParams");
        this.f42563a = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            if (str3 != null) {
                Locale locale = Locale.US;
                Intrinsics.h(locale, "US");
                str2 = str3.toLowerCase(locale);
                Intrinsics.h(str2, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str2 = null;
            }
            linkedHashMap.put(str2, str4);
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.h(unmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.f42564b = unmodifiableMap;
    }

    public final Charset a() {
        String str = (String) this.f42564b.get("charset");
        if (str != null) {
            try {
                Charset forName = Charset.forName(str);
                Intrinsics.h(forName, "forName(charset)");
                return forName;
            } catch (Exception unused) {
            }
        }
        Charset charset = StandardCharsets.ISO_8859_1;
        Intrinsics.h(charset, "ISO_8859_1");
        return charset;
    }

    public final String b() {
        return (String) this.f42564b.get("realm");
    }

    public final String c() {
        return this.f42563a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Challenge) {
            Challenge challenge = (Challenge) obj;
            return Intrinsics.d(challenge.f42563a, this.f42563a) && Intrinsics.d(challenge.f42564b, this.f42564b);
        }
    }

    public int hashCode() {
        return ((899 + this.f42563a.hashCode()) * 31) + this.f42564b.hashCode();
    }

    public String toString() {
        return this.f42563a + " authParams=" + this.f42564b;
    }
}
