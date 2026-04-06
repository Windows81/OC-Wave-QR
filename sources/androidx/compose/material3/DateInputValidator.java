package androidx.compose.material3;

import androidx.compose.material3.internal.DateInputFormat;
import kotlin.Metadata;
import kotlin.ranges.IntRange;

@Metadata
public final class DateInputValidator {

    /* renamed from: a  reason: collision with root package name */
    public final IntRange f9647a;

    /* renamed from: b  reason: collision with root package name */
    public final SelectableDates f9648b;

    /* renamed from: c  reason: collision with root package name */
    public final DateInputFormat f9649c;

    /* renamed from: d  reason: collision with root package name */
    public final DatePickerFormatter f9650d;

    /* renamed from: e  reason: collision with root package name */
    public final String f9651e;

    /* renamed from: f  reason: collision with root package name */
    public final String f9652f;

    /* renamed from: g  reason: collision with root package name */
    public final String f9653g;

    /* renamed from: h  reason: collision with root package name */
    public final String f9654h;

    /* renamed from: i  reason: collision with root package name */
    public Long f9655i;

    /* renamed from: j  reason: collision with root package name */
    public Long f9656j;

    public DateInputValidator(IntRange intRange, SelectableDates selectableDates, DateInputFormat dateInputFormat, DatePickerFormatter datePickerFormatter, String str, String str2, String str3, String str4) {
        this.f9647a = intRange;
        this.f9648b = selectableDates;
        this.f9649c = dateInputFormat;
        this.f9650d = datePickerFormatter;
        this.f9651e = str;
        this.f9652f = str2;
        this.f9653g = str3;
        this.f9654h = str4;
    }

    public final void a(Long l2) {
        this.f9656j = l2;
    }

    public final void b(Long l2) {
        this.f9655i = l2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008a, code lost:
        if (r0 <= (r2 != null ? r2.longValue() : Long.MAX_VALUE)) goto L_0x008c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String c(androidx.compose.material3.internal.CalendarDate r9, int r10, java.util.Locale r11) {
        /*
            r8 = this;
            if (r9 != 0) goto L_0x001e
            java.lang.String r9 = r8.f9651e
            androidx.compose.material3.internal.DateInputFormat r10 = r8.f9649c
            java.lang.String r10 = r10.b()
            java.util.Locale r11 = java.util.Locale.ROOT
            java.lang.String r10 = r10.toUpperCase(r11)
            java.lang.String r11 = "toUpperCase(...)"
            kotlin.jvm.internal.Intrinsics.h(r10, r11)
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            java.lang.String r9 = androidx.compose.material3.internal.Strings_androidKt.a(r9, r10)
            return r9
        L_0x001e:
            kotlin.ranges.IntRange r0 = r8.f9647a
            int r1 = r9.k()
            boolean r0 = r0.u(r1)
            if (r0 != 0) goto L_0x0053
            java.lang.String r9 = r8.f9652f
            kotlin.ranges.IntRange r10 = r8.f9647a
            int r0 = r10.n()
            r5 = 7
            r6 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = r11
            java.lang.String r10 = androidx.compose.material3.CalendarLocale_jvmKt.c(r0, r1, r2, r3, r4, r5, r6)
            kotlin.ranges.IntRange r0 = r8.f9647a
            int r1 = r0.o()
            r6 = 7
            r7 = 0
            r4 = 0
            r5 = r11
            java.lang.String r11 = androidx.compose.material3.CalendarLocale_jvmKt.c(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object[] r10 = new java.lang.Object[]{r10, r11}
            java.lang.String r9 = androidx.compose.material3.internal.Strings_androidKt.a(r9, r10)
            return r9
        L_0x0053:
            androidx.compose.material3.SelectableDates r0 = r8.f9648b
            int r1 = r9.k()
            boolean r1 = r0.b(r1)
            if (r1 == 0) goto L_0x00af
            long r1 = r9.j()
            boolean r0 = r0.a(r1)
            if (r0 != 0) goto L_0x006a
            goto L_0x00af
        L_0x006a:
            androidx.compose.material3.InputIdentifier$Companion r11 = androidx.compose.material3.InputIdentifier.f10146b
            int r0 = r11.c()
            boolean r0 = androidx.compose.material3.InputIdentifier.f(r10, r0)
            if (r0 == 0) goto L_0x008c
            long r0 = r9.j()
            java.lang.Long r2 = r8.f9656j
            if (r2 == 0) goto L_0x0083
            long r2 = r2.longValue()
            goto L_0x0088
        L_0x0083:
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x0088:
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x00a9
        L_0x008c:
            int r11 = r11.a()
            boolean r10 = androidx.compose.material3.InputIdentifier.f(r10, r11)
            if (r10 == 0) goto L_0x00ac
            long r9 = r9.j()
            java.lang.Long r11 = r8.f9655i
            if (r11 == 0) goto L_0x00a3
            long r0 = r11.longValue()
            goto L_0x00a5
        L_0x00a3:
            r0 = -9223372036854775808
        L_0x00a5:
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 >= 0) goto L_0x00ac
        L_0x00a9:
            java.lang.String r9 = r8.f9654h
            return r9
        L_0x00ac:
            java.lang.String r9 = ""
            return r9
        L_0x00af:
            java.lang.String r10 = r8.f9653g
            androidx.compose.material3.DatePickerFormatter r0 = r8.f9650d
            long r1 = r9.j()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r4 = 4
            r5 = 0
            r3 = 0
            r2 = r11
            java.lang.String r9 = androidx.compose.material3.DatePickerFormatter.b(r0, r1, r2, r3, r4, r5)
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            java.lang.String r9 = androidx.compose.material3.internal.Strings_androidKt.a(r10, r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DateInputValidator.c(androidx.compose.material3.internal.CalendarDate, int, java.util.Locale):java.lang.String");
    }
}
