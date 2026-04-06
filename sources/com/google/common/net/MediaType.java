package com.google.common.net;

import com.google.common.base.Ascii;
import com.google.common.base.CharMatcher;
import com.google.common.base.Charsets;
import com.google.common.base.Joiner;
import com.google.common.base.Objects;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimaps;
import com.google.errorprone.annotations.Immutable;
import java.util.Map;

@Immutable
@ElementTypesAreNonnullByDefault
public final class MediaType {

    /* renamed from: A  reason: collision with root package name */
    public static final MediaType f29086A = e("text", "vcard");
    public static final MediaType A0 = d("application", "jose");

    /* renamed from: B  reason: collision with root package name */
    public static final MediaType f29087B = e("text", "vnd.wap.wml");
    public static final MediaType B0 = d("application", "jose+json");
    public static final MediaType C = e("text", "xml");
    public static final MediaType C0 = e("application", "json");
    public static final MediaType D = e("text", "vtt");
    public static final MediaType D0 = e("application", "manifest+json");
    public static final MediaType E = d("image", "bmp");
    public static final MediaType E0 = d("application", "vnd.google-earth.kml+xml");
    public static final MediaType F = d("image", "x-canon-crw");
    public static final MediaType F0 = d("application", "vnd.google-earth.kmz");
    public static final MediaType G = d("image", "gif");
    public static final MediaType G0 = d("application", "mbox");
    public static final MediaType H = d("image", "vnd.microsoft.icon");
    public static final MediaType H0 = d("application", "x-apple-aspen-config");
    public static final MediaType I = d("image", "jpeg");
    public static final MediaType I0 = d("application", "vnd.ms-excel");
    public static final MediaType J = d("image", "png");
    public static final MediaType J0 = d("application", "vnd.ms-outlook");
    public static final MediaType K = d("image", "vnd.adobe.photoshop");
    public static final MediaType K0 = d("application", "vnd.ms-powerpoint");
    public static final MediaType L = e("image", "svg+xml");
    public static final MediaType L0 = d("application", "msword");
    public static final MediaType M = d("image", "tiff");
    public static final MediaType M0 = d("application", "dash+xml");
    public static final MediaType N = d("image", "webp");
    public static final MediaType N0 = d("application", "wasm");
    public static final MediaType O = d("image", "heif");
    public static final MediaType O0 = d("application", "x-nacl");
    public static final MediaType P = d("image", "jp2");
    public static final MediaType P0 = d("application", "x-pnacl");
    public static final MediaType Q = d("audio", "mp4");
    public static final MediaType Q0 = d("application", "octet-stream");
    public static final MediaType R = d("audio", "mpeg");
    public static final MediaType R0 = d("application", "ogg");
    public static final MediaType S = d("audio", "ogg");
    public static final MediaType S0 = d("application", "vnd.openxmlformats-officedocument.wordprocessingml.document");
    public static final MediaType T = d("audio", "webm");
    public static final MediaType T0 = d("application", "vnd.openxmlformats-officedocument.presentationml.presentation");
    public static final MediaType U = d("audio", "l16");
    public static final MediaType U0 = d("application", "vnd.openxmlformats-officedocument.spreadsheetml.sheet");
    public static final MediaType V = d("audio", "l24");
    public static final MediaType V0 = d("application", "vnd.oasis.opendocument.graphics");
    public static final MediaType W = d("audio", "basic");
    public static final MediaType W0 = d("application", "vnd.oasis.opendocument.presentation");
    public static final MediaType X = d("audio", "aac");
    public static final MediaType X0 = d("application", "vnd.oasis.opendocument.spreadsheet");
    public static final MediaType Y = d("audio", "vorbis");
    public static final MediaType Y0 = d("application", "vnd.oasis.opendocument.text");
    public static final MediaType Z = d("audio", "x-ms-wma");
    public static final MediaType Z0 = e("application", "opensearchdescription+xml");
    public static final MediaType a0 = d("audio", "x-ms-wax");
    public static final MediaType a1 = d("application", "pdf");
    public static final MediaType b0 = d("audio", "vnd.rn-realaudio");
    public static final MediaType b1 = d("application", "postscript");
    public static final MediaType c0 = d("audio", "vnd.wave");
    public static final MediaType c1 = d("application", "protobuf");
    public static final MediaType d0 = d("video", "mp4");
    public static final MediaType d1 = e("application", "rdf+xml");
    public static final MediaType e0 = d("video", "mpeg");
    public static final MediaType e1 = e("application", "rtf");
    public static final MediaType f0 = d("video", "ogg");
    public static final MediaType f1 = d("application", "font-sfnt");

    /* renamed from: g  reason: collision with root package name */
    public static final ImmutableListMultimap f29088g = ImmutableListMultimap.y("charset", Ascii.c(Charsets.f27683c.name()));
    public static final MediaType g0 = d("video", "quicktime");
    public static final MediaType g1 = d("application", "x-shockwave-flash");

    /* renamed from: h  reason: collision with root package name */
    public static final CharMatcher f29089h = CharMatcher.f().b(CharMatcher.n().r()).b(CharMatcher.m(' ')).b(CharMatcher.t("()<>@,;:\\\"/[]?="));
    public static final MediaType h0 = d("video", "webm");
    public static final MediaType h1 = d("application", "vnd.sketchup.skp");

    /* renamed from: i  reason: collision with root package name */
    public static final CharMatcher f29090i = CharMatcher.f().b(CharMatcher.t("\"\\\r"));
    public static final MediaType i0 = d("video", "x-ms-wmv");
    public static final MediaType i1 = e("application", "soap+xml");

    /* renamed from: j  reason: collision with root package name */
    public static final CharMatcher f29091j = CharMatcher.d(" \t\r\n");
    public static final MediaType j0 = d("video", "x-flv");
    public static final MediaType j1 = d("application", "x-tar");

    /* renamed from: k  reason: collision with root package name */
    public static final Map f29092k = Maps.z();
    public static final MediaType k0 = d("video", "3gpp");
    public static final MediaType k1 = d("application", "font-woff");

    /* renamed from: l  reason: collision with root package name */
    public static final MediaType f29093l = d("*", "*");
    public static final MediaType l0 = d("video", "3gpp2");
    public static final MediaType l1 = d("application", "font-woff2");

    /* renamed from: m  reason: collision with root package name */
    public static final MediaType f29094m = d("text", "*");
    public static final MediaType m0 = e("application", "xml");
    public static final MediaType m1 = e("application", "xhtml+xml");

    /* renamed from: n  reason: collision with root package name */
    public static final MediaType f29095n = d("image", "*");
    public static final MediaType n0 = e("application", "atom+xml");
    public static final MediaType n1 = e("application", "xrd+xml");

    /* renamed from: o  reason: collision with root package name */
    public static final MediaType f29096o = d("audio", "*");
    public static final MediaType o0 = d("application", "x-bzip2");
    public static final MediaType o1 = d("application", "zip");

    /* renamed from: p  reason: collision with root package name */
    public static final MediaType f29097p = d("video", "*");
    public static final MediaType p0 = e("application", "dart");
    public static final MediaType p1 = d("font", "collection");

    /* renamed from: q  reason: collision with root package name */
    public static final MediaType f29098q = d("application", "*");
    public static final MediaType q0 = d("application", "vnd.apple.pkpass");
    public static final MediaType q1 = d("font", "otf");

    /* renamed from: r  reason: collision with root package name */
    public static final MediaType f29099r = d("font", "*");
    public static final MediaType r0 = d("application", "vnd.ms-fontobject");
    public static final MediaType r1 = d("font", "sfnt");

    /* renamed from: s  reason: collision with root package name */
    public static final MediaType f29100s = e("text", "cache-manifest");
    public static final MediaType s0 = d("application", "epub+zip");
    public static final MediaType s1 = d("font", "ttf");

    /* renamed from: t  reason: collision with root package name */
    public static final MediaType f29101t = e("text", "css");
    public static final MediaType t0 = d("application", "x-www-form-urlencoded");
    public static final MediaType t1 = d("font", "woff");

    /* renamed from: u  reason: collision with root package name */
    public static final MediaType f29102u = e("text", "csv");
    public static final MediaType u0 = d("application", "pkcs12");
    public static final MediaType u1 = d("font", "woff2");

    /* renamed from: v  reason: collision with root package name */
    public static final MediaType f29103v = e("text", "html");
    public static final MediaType v0 = d("application", "binary");
    public static final Joiner.MapJoiner v1 = Joiner.i("; ").l("=");

    /* renamed from: w  reason: collision with root package name */
    public static final MediaType f29104w = e("text", "calendar");
    public static final MediaType w0 = d("application", "geo+json");

    /* renamed from: x  reason: collision with root package name */
    public static final MediaType f29105x = e("text", "plain");
    public static final MediaType x0 = d("application", "x-gzip");

    /* renamed from: y  reason: collision with root package name */
    public static final MediaType f29106y = e("text", "javascript");
    public static final MediaType y0 = d("application", "hal+json");

    /* renamed from: z  reason: collision with root package name */
    public static final MediaType f29107z = e("text", "tab-separated-values");
    public static final MediaType z0 = e("application", "javascript");

    /* renamed from: a  reason: collision with root package name */
    public final String f29108a;

    /* renamed from: b  reason: collision with root package name */
    public final String f29109b;

    /* renamed from: c  reason: collision with root package name */
    public final ImmutableListMultimap f29110c;

    /* renamed from: d  reason: collision with root package name */
    public String f29111d;

    /* renamed from: e  reason: collision with root package name */
    public int f29112e;

    /* renamed from: f  reason: collision with root package name */
    public Optional f29113f;

    public static final class Tokenizer {
    }

    public MediaType(String str, String str2, ImmutableListMultimap immutableListMultimap) {
        this.f29108a = str;
        this.f29109b = str2;
        this.f29110c = immutableListMultimap;
    }

    public static MediaType b(MediaType mediaType) {
        f29092k.put(mediaType, mediaType);
        return mediaType;
    }

    public static MediaType d(String str, String str2) {
        MediaType b2 = b(new MediaType(str, str2, ImmutableListMultimap.x()));
        b2.f29113f = Optional.a();
        return b2;
    }

    public static MediaType e(String str, String str2) {
        MediaType b2 = b(new MediaType(str, str2, f29088g));
        b2.f29113f = Optional.d(Charsets.f27683c);
        return b2;
    }

    public static String f(String str) {
        StringBuilder sb = new StringBuilder(str.length() + 16);
        sb.append('\"');
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (charAt == 13 || charAt == '\\' || charAt == '\"') {
                sb.append('\\');
            }
            sb.append(charAt);
        }
        sb.append('\"');
        return sb.toString();
    }

    public static /* synthetic */ String g(String str) {
        return (!f29089h.p(str) || str.isEmpty()) ? f(str) : str;
    }

    public final String c() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f29108a);
        sb.append('/');
        sb.append(this.f29109b);
        if (!this.f29110c.isEmpty()) {
            sb.append("; ");
            v1.b(sb, Multimaps.e(this.f29110c, new a()).m());
        }
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MediaType)) {
            return false;
        }
        MediaType mediaType = (MediaType) obj;
        return this.f29108a.equals(mediaType.f29108a) && this.f29109b.equals(mediaType.f29109b) && h().equals(mediaType.h());
    }

    public final Map h() {
        return Maps.P(this.f29110c.E(), new b());
    }

    public int hashCode() {
        int i2 = this.f29112e;
        if (i2 != 0) {
            return i2;
        }
        int b2 = Objects.b(this.f29108a, this.f29109b, h());
        this.f29112e = b2;
        return b2;
    }

    public String toString() {
        String str = this.f29111d;
        if (str != null) {
            return str;
        }
        String c2 = c();
        this.f29111d = c2;
        return c2;
    }
}
