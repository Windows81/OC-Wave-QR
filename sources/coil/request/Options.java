package coil.request;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import coil.size.Scale;
import coil.size.Size;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;

@Metadata
public final class Options {

    /* renamed from: a  reason: collision with root package name */
    public final Context f23649a;

    /* renamed from: b  reason: collision with root package name */
    public final Bitmap.Config f23650b;

    /* renamed from: c  reason: collision with root package name */
    public final ColorSpace f23651c;

    /* renamed from: d  reason: collision with root package name */
    public final Size f23652d;

    /* renamed from: e  reason: collision with root package name */
    public final Scale f23653e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f23654f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f23655g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f23656h;

    /* renamed from: i  reason: collision with root package name */
    public final String f23657i;

    /* renamed from: j  reason: collision with root package name */
    public final Headers f23658j;

    /* renamed from: k  reason: collision with root package name */
    public final Tags f23659k;

    /* renamed from: l  reason: collision with root package name */
    public final Parameters f23660l;

    /* renamed from: m  reason: collision with root package name */
    public final CachePolicy f23661m;

    /* renamed from: n  reason: collision with root package name */
    public final CachePolicy f23662n;

    /* renamed from: o  reason: collision with root package name */
    public final CachePolicy f23663o;

    public Options(Context context, Bitmap.Config config, ColorSpace colorSpace, Size size, Scale scale, boolean z2, boolean z3, boolean z4, String str, Headers headers, Tags tags, Parameters parameters, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3) {
        this.f23649a = context;
        this.f23650b = config;
        this.f23651c = colorSpace;
        this.f23652d = size;
        this.f23653e = scale;
        this.f23654f = z2;
        this.f23655g = z3;
        this.f23656h = z4;
        this.f23657i = str;
        this.f23658j = headers;
        this.f23659k = tags;
        this.f23660l = parameters;
        this.f23661m = cachePolicy;
        this.f23662n = cachePolicy2;
        this.f23663o = cachePolicy3;
    }

    public static /* synthetic */ Options b(Options options, Context context, Bitmap.Config config, ColorSpace colorSpace, Size size, Scale scale, boolean z2, boolean z3, boolean z4, String str, Headers headers, Tags tags, Parameters parameters, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, int i2, Object obj) {
        Options options2 = options;
        int i3 = i2;
        return options.a((i3 & 1) != 0 ? options2.f23649a : context, (i3 & 2) != 0 ? options2.f23650b : config, (i3 & 4) != 0 ? options2.f23651c : colorSpace, (i3 & 8) != 0 ? options2.f23652d : size, (i3 & 16) != 0 ? options2.f23653e : scale, (i3 & 32) != 0 ? options2.f23654f : z2, (i3 & 64) != 0 ? options2.f23655g : z3, (i3 & 128) != 0 ? options2.f23656h : z4, (i3 & 256) != 0 ? options2.f23657i : str, (i3 & 512) != 0 ? options2.f23658j : headers, (i3 & 1024) != 0 ? options2.f23659k : tags, (i3 & 2048) != 0 ? options2.f23660l : parameters, (i3 & 4096) != 0 ? options2.f23661m : cachePolicy, (i3 & 8192) != 0 ? options2.f23662n : cachePolicy2, (i3 & 16384) != 0 ? options2.f23663o : cachePolicy3);
    }

    public final Options a(Context context, Bitmap.Config config, ColorSpace colorSpace, Size size, Scale scale, boolean z2, boolean z3, boolean z4, String str, Headers headers, Tags tags, Parameters parameters, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3) {
        return new Options(context, config, colorSpace, size, scale, z2, z3, z4, str, headers, tags, parameters, cachePolicy, cachePolicy2, cachePolicy3);
    }

    public final boolean c() {
        return this.f23654f;
    }

    public final boolean d() {
        return this.f23655g;
    }

    public final ColorSpace e() {
        return this.f23651c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Options) {
            Options options = (Options) obj;
            return Intrinsics.d(this.f23649a, options.f23649a) && this.f23650b == options.f23650b && Intrinsics.d(this.f23651c, options.f23651c) && Intrinsics.d(this.f23652d, options.f23652d) && this.f23653e == options.f23653e && this.f23654f == options.f23654f && this.f23655g == options.f23655g && this.f23656h == options.f23656h && Intrinsics.d(this.f23657i, options.f23657i) && Intrinsics.d(this.f23658j, options.f23658j) && Intrinsics.d(this.f23659k, options.f23659k) && Intrinsics.d(this.f23660l, options.f23660l) && this.f23661m == options.f23661m && this.f23662n == options.f23662n && this.f23663o == options.f23663o;
        }
    }

    public final Bitmap.Config f() {
        return this.f23650b;
    }

    public final Context g() {
        return this.f23649a;
    }

    public final String h() {
        return this.f23657i;
    }

    public int hashCode() {
        int hashCode = ((this.f23649a.hashCode() * 31) + this.f23650b.hashCode()) * 31;
        ColorSpace colorSpace = this.f23651c;
        int i2 = 0;
        int hashCode2 = (((((((((((hashCode + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31) + this.f23652d.hashCode()) * 31) + this.f23653e.hashCode()) * 31) + Boolean.hashCode(this.f23654f)) * 31) + Boolean.hashCode(this.f23655g)) * 31) + Boolean.hashCode(this.f23656h)) * 31;
        String str = this.f23657i;
        if (str != null) {
            i2 = str.hashCode();
        }
        return ((((((((((((hashCode2 + i2) * 31) + this.f23658j.hashCode()) * 31) + this.f23659k.hashCode()) * 31) + this.f23660l.hashCode()) * 31) + this.f23661m.hashCode()) * 31) + this.f23662n.hashCode()) * 31) + this.f23663o.hashCode();
    }

    public final CachePolicy i() {
        return this.f23662n;
    }

    public final Headers j() {
        return this.f23658j;
    }

    public final CachePolicy k() {
        return this.f23663o;
    }

    public final boolean l() {
        return this.f23656h;
    }

    public final Scale m() {
        return this.f23653e;
    }

    public final Size n() {
        return this.f23652d;
    }

    public final Tags o() {
        return this.f23659k;
    }
}
