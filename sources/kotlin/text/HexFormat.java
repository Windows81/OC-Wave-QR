package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class HexFormat {

    /* renamed from: d  reason: collision with root package name */
    public static final Companion f41137d = new Companion((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public static final HexFormat f41138e;

    /* renamed from: f  reason: collision with root package name */
    public static final HexFormat f41139f;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f41140a;

    /* renamed from: b  reason: collision with root package name */
    public final BytesHexFormat f41141b;

    /* renamed from: c  reason: collision with root package name */
    public final NumberHexFormat f41142c;

    @Metadata
    public static final class Builder {
    }

    @Metadata
    public static final class BytesHexFormat {

        /* renamed from: j  reason: collision with root package name */
        public static final Companion f41143j = new Companion((DefaultConstructorMarker) null);

        /* renamed from: k  reason: collision with root package name */
        public static final BytesHexFormat f41144k = new BytesHexFormat(Integer.MAX_VALUE, Integer.MAX_VALUE, "  ", "", "", "");

        /* renamed from: a  reason: collision with root package name */
        public final int f41145a;

        /* renamed from: b  reason: collision with root package name */
        public final int f41146b;

        /* renamed from: c  reason: collision with root package name */
        public final String f41147c;

        /* renamed from: d  reason: collision with root package name */
        public final String f41148d;

        /* renamed from: e  reason: collision with root package name */
        public final String f41149e;

        /* renamed from: f  reason: collision with root package name */
        public final String f41150f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f41151g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f41152h;

        /* renamed from: i  reason: collision with root package name */
        public final boolean f41153i;

        @Metadata
        public static final class Builder {
        }

        @Metadata
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final BytesHexFormat a() {
                return BytesHexFormat.f41144k;
            }

            public Companion() {
            }
        }

        public BytesHexFormat(int i2, int i3, String str, String str2, String str3, String str4) {
            Intrinsics.i(str, "groupSeparator");
            Intrinsics.i(str2, "byteSeparator");
            Intrinsics.i(str3, "bytePrefix");
            Intrinsics.i(str4, "byteSuffix");
            this.f41145a = i2;
            this.f41146b = i3;
            this.f41147c = str;
            this.f41148d = str2;
            this.f41149e = str3;
            this.f41150f = str4;
            boolean z2 = false;
            this.f41151g = i2 == Integer.MAX_VALUE && i3 == Integer.MAX_VALUE;
            this.f41152h = str3.length() == 0 && str4.length() == 0 && str2.length() <= 1;
            this.f41153i = (HexFormatKt.b(str) || HexFormatKt.b(str2) || HexFormatKt.b(str3) || HexFormatKt.b(str4)) ? true : z2;
        }

        public final StringBuilder b(StringBuilder sb, String str) {
            Intrinsics.i(sb, "sb");
            Intrinsics.i(str, "indent");
            sb.append(str);
            sb.append("bytesPerLine = ");
            sb.append(this.f41145a);
            sb.append(",");
            sb.append(10);
            sb.append(str);
            sb.append("bytesPerGroup = ");
            sb.append(this.f41146b);
            sb.append(",");
            sb.append(10);
            sb.append(str);
            sb.append("groupSeparator = \"");
            sb.append(this.f41147c);
            sb.append("\",");
            sb.append(10);
            sb.append(str);
            sb.append("byteSeparator = \"");
            sb.append(this.f41148d);
            sb.append("\",");
            sb.append(10);
            sb.append(str);
            sb.append("bytePrefix = \"");
            sb.append(this.f41149e);
            sb.append("\",");
            sb.append(10);
            sb.append(str);
            sb.append("byteSuffix = \"");
            sb.append(this.f41150f);
            sb.append("\"");
            return sb;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("BytesHexFormat(");
            sb.append(10);
            b(sb, "    ").append(10);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final HexFormat a() {
            return HexFormat.f41138e;
        }

        public Companion() {
        }
    }

    @Metadata
    public static final class NumberHexFormat {

        /* renamed from: h  reason: collision with root package name */
        public static final Companion f41154h = new Companion((DefaultConstructorMarker) null);

        /* renamed from: i  reason: collision with root package name */
        public static final NumberHexFormat f41155i = new NumberHexFormat("", "", false, 1);

        /* renamed from: a  reason: collision with root package name */
        public final String f41156a;

        /* renamed from: b  reason: collision with root package name */
        public final String f41157b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f41158c;

        /* renamed from: d  reason: collision with root package name */
        public final int f41159d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f41160e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f41161f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f41162g;

        @Metadata
        public static final class Builder {
        }

        @Metadata
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final NumberHexFormat a() {
                return NumberHexFormat.f41155i;
            }

            public Companion() {
            }
        }

        public NumberHexFormat(String str, String str2, boolean z2, int i2) {
            Intrinsics.i(str, "prefix");
            Intrinsics.i(str2, "suffix");
            this.f41156a = str;
            this.f41157b = str2;
            this.f41158c = z2;
            this.f41159d = i2;
            boolean z3 = false;
            boolean z4 = str.length() == 0 && str2.length() == 0;
            this.f41160e = z4;
            this.f41161f = z4 && i2 == 1;
            this.f41162g = (HexFormatKt.b(str) || HexFormatKt.b(str2)) ? true : z3;
        }

        public final StringBuilder b(StringBuilder sb, String str) {
            Intrinsics.i(sb, "sb");
            Intrinsics.i(str, "indent");
            sb.append(str);
            sb.append("prefix = \"");
            sb.append(this.f41156a);
            sb.append("\",");
            sb.append(10);
            sb.append(str);
            sb.append("suffix = \"");
            sb.append(this.f41157b);
            sb.append("\",");
            sb.append(10);
            sb.append(str);
            sb.append("removeLeadingZeros = ");
            sb.append(this.f41158c);
            sb.append(',');
            sb.append(10);
            sb.append(str);
            sb.append("minLength = ");
            sb.append(this.f41159d);
            return sb;
        }

        public final boolean c() {
            return this.f41162g;
        }

        public final String d() {
            return this.f41156a;
        }

        public final String e() {
            return this.f41157b;
        }

        public final boolean f() {
            return this.f41160e;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("NumberHexFormat(");
            sb.append(10);
            b(sb, "    ").append(10);
            sb.append(")");
            return sb.toString();
        }
    }

    static {
        BytesHexFormat.Companion companion = BytesHexFormat.f41143j;
        BytesHexFormat a2 = companion.a();
        NumberHexFormat.Companion companion2 = NumberHexFormat.f41154h;
        f41138e = new HexFormat(false, a2, companion2.a());
        f41139f = new HexFormat(true, companion.a(), companion2.a());
    }

    public HexFormat(boolean z2, BytesHexFormat bytesHexFormat, NumberHexFormat numberHexFormat) {
        Intrinsics.i(bytesHexFormat, "bytes");
        Intrinsics.i(numberHexFormat, "number");
        this.f41140a = z2;
        this.f41141b = bytesHexFormat;
        this.f41142c = numberHexFormat;
    }

    public final NumberHexFormat b() {
        return this.f41142c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HexFormat(");
        sb.append(10);
        sb.append("    upperCase = ");
        sb.append(this.f41140a);
        sb.append(",");
        sb.append(10);
        sb.append("    bytes = BytesHexFormat(");
        sb.append(10);
        this.f41141b.b(sb, "        ").append(10);
        sb.append("    ),");
        sb.append(10);
        sb.append("    number = NumberHexFormat(");
        sb.append(10);
        this.f41142c.b(sb, "        ").append(10);
        sb.append("    )");
        sb.append(10);
        sb.append(")");
        return sb.toString();
    }
}
