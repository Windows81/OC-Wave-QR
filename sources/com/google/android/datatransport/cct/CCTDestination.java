package com.google.android.datatransport.cct;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.EncodedDestination;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public final class CCTDestination implements EncodedDestination {

    /* renamed from: c  reason: collision with root package name */
    public static final String f23828c;

    /* renamed from: d  reason: collision with root package name */
    public static final String f23829d;

    /* renamed from: e  reason: collision with root package name */
    public static final String f23830e;

    /* renamed from: f  reason: collision with root package name */
    public static final Set f23831f = Collections.unmodifiableSet(new HashSet(Arrays.asList(new Encoding[]{Encoding.b("proto"), Encoding.b("json")})));

    /* renamed from: g  reason: collision with root package name */
    public static final CCTDestination f23832g;

    /* renamed from: h  reason: collision with root package name */
    public static final CCTDestination f23833h;

    /* renamed from: a  reason: collision with root package name */
    public final String f23834a;

    /* renamed from: b  reason: collision with root package name */
    public final String f23835b;

    static {
        String a2 = StringMerger.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f23828c = a2;
        String a3 = StringMerger.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f23829d = a3;
        String a4 = StringMerger.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f23830e = a4;
        f23832g = new CCTDestination(a2, (String) null);
        f23833h = new CCTDestination(a3, a4);
    }

    public CCTDestination(String str, String str2) {
        this.f23834a = str;
        this.f23835b = str2;
    }

    public static CCTDestination c(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new CCTDestination(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    public Set a() {
        return f23831f;
    }

    public byte[] b() {
        String str = this.f23835b;
        if (str == null && this.f23834a == null) {
            return null;
        }
        String str2 = this.f23834a;
        if (str == null) {
            str = "";
        }
        return String.format("%s%s%s%s", new Object[]{"1$", str2, "\\", str}).getBytes(Charset.forName("UTF-8"));
    }

    public String d() {
        return this.f23835b;
    }

    public String e() {
        return this.f23834a;
    }

    public byte[] getExtras() {
        return b();
    }

    public String getName() {
        return "cct";
    }
}
