package androidx.compose.ui.autofill;

import kotlin.Metadata;

@Metadata
public interface ContentType {

    /* renamed from: a  reason: collision with root package name */
    public static final Companion f15598a = Companion.f15601a;

    @Metadata
    public static final class Companion {

        /* renamed from: A  reason: collision with root package name */
        public static final ContentType f15599A = ContentType_androidKt.a("personNameSuffix");

        /* renamed from: B  reason: collision with root package name */
        public static final ContentType f15600B = ContentType_androidKt.a("phoneNumber");
        public static final ContentType C = ContentType_androidKt.a("phoneNumberDevice");
        public static final ContentType D = ContentType_androidKt.a("phoneCountryCode");
        public static final ContentType E = ContentType_androidKt.a("phoneNational");
        public static final ContentType F = ContentType_androidKt.a("gender");
        public static final ContentType G = ContentType_androidKt.a("birthDateFull");
        public static final ContentType H = ContentType_androidKt.a("birthDateDay");
        public static final ContentType I = ContentType_androidKt.a("birthDateMonth");
        public static final ContentType J = ContentType_androidKt.a("birthDateYear");
        public static final ContentType K = ContentType_androidKt.a("smsOTPCode");

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ Companion f15601a = new Companion();

        /* renamed from: b  reason: collision with root package name */
        public static final ContentType f15602b = ContentType_androidKt.a("username");

        /* renamed from: c  reason: collision with root package name */
        public static final ContentType f15603c = ContentType_androidKt.a("password");

        /* renamed from: d  reason: collision with root package name */
        public static final ContentType f15604d = ContentType_androidKt.a("emailAddress");

        /* renamed from: e  reason: collision with root package name */
        public static final ContentType f15605e = ContentType_androidKt.a("newUsername");

        /* renamed from: f  reason: collision with root package name */
        public static final ContentType f15606f = ContentType_androidKt.a("newPassword");

        /* renamed from: g  reason: collision with root package name */
        public static final ContentType f15607g = ContentType_androidKt.a("postalAddress");

        /* renamed from: h  reason: collision with root package name */
        public static final ContentType f15608h = ContentType_androidKt.a("postalCode");

        /* renamed from: i  reason: collision with root package name */
        public static final ContentType f15609i = ContentType_androidKt.a("creditCardNumber");

        /* renamed from: j  reason: collision with root package name */
        public static final ContentType f15610j = ContentType_androidKt.a("creditCardSecurityCode");

        /* renamed from: k  reason: collision with root package name */
        public static final ContentType f15611k = ContentType_androidKt.a("creditCardExpirationDate");

        /* renamed from: l  reason: collision with root package name */
        public static final ContentType f15612l = ContentType_androidKt.a("creditCardExpirationMonth");

        /* renamed from: m  reason: collision with root package name */
        public static final ContentType f15613m = ContentType_androidKt.a("creditCardExpirationYear");

        /* renamed from: n  reason: collision with root package name */
        public static final ContentType f15614n = ContentType_androidKt.a("creditCardExpirationDay");

        /* renamed from: o  reason: collision with root package name */
        public static final ContentType f15615o = ContentType_androidKt.a("addressCountry");

        /* renamed from: p  reason: collision with root package name */
        public static final ContentType f15616p = ContentType_androidKt.a("addressRegion");

        /* renamed from: q  reason: collision with root package name */
        public static final ContentType f15617q = ContentType_androidKt.a("addressLocality");

        /* renamed from: r  reason: collision with root package name */
        public static final ContentType f15618r = ContentType_androidKt.a("streetAddress");

        /* renamed from: s  reason: collision with root package name */
        public static final ContentType f15619s = ContentType_androidKt.a("extendedAddress");

        /* renamed from: t  reason: collision with root package name */
        public static final ContentType f15620t = ContentType_androidKt.a("extendedPostalCode");

        /* renamed from: u  reason: collision with root package name */
        public static final ContentType f15621u = ContentType_androidKt.a("personName");

        /* renamed from: v  reason: collision with root package name */
        public static final ContentType f15622v = ContentType_androidKt.a("personGivenName");

        /* renamed from: w  reason: collision with root package name */
        public static final ContentType f15623w = ContentType_androidKt.a("personFamilyName");

        /* renamed from: x  reason: collision with root package name */
        public static final ContentType f15624x = ContentType_androidKt.a("personMiddleName");

        /* renamed from: y  reason: collision with root package name */
        public static final ContentType f15625y = ContentType_androidKt.a("personMiddleInitial");

        /* renamed from: z  reason: collision with root package name */
        public static final ContentType f15626z = ContentType_androidKt.a("personNamePrefix");

        public final ContentType a() {
            return f15619s;
        }

        public final ContentType b() {
            return f15617q;
        }

        public final ContentType c() {
            return f15616p;
        }

        public final ContentType d() {
            return f15618r;
        }

        public final ContentType e() {
            return f15604d;
        }

        public final ContentType f() {
            return f15606f;
        }

        public final ContentType g() {
            return f15605e;
        }

        public final ContentType h() {
            return f15603c;
        }

        public final ContentType i() {
            return f15622v;
        }

        public final ContentType j() {
            return f15623w;
        }

        public final ContentType k() {
            return f15600B;
        }

        public final ContentType l() {
            return f15608h;
        }

        public final ContentType m() {
            return f15602b;
        }
    }

    ContentType a(ContentType contentType);
}
