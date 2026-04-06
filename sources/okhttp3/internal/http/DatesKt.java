package okhttp3.internal.http;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;

@Metadata
public final class DatesKt {

    /* renamed from: a  reason: collision with root package name */
    public static final DatesKt$STANDARD_DATE_FORMAT$1 f42982a = new DatesKt$STANDARD_DATE_FORMAT$1();

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f42983b;

    /* renamed from: c  reason: collision with root package name */
    public static final DateFormat[] f42984c;

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f42983b = strArr;
        f42984c = new DateFormat[strArr.length];
    }

    public static final Date a(String str) {
        Intrinsics.i(str, "<this>");
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = ((DateFormat) f42982a.get()).parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return parse;
        }
        String[] strArr = f42983b;
        synchronized (strArr) {
            try {
                int length = strArr.length;
                for (int i2 = 0; i2 < length; i2++) {
                    DateFormat[] dateFormatArr = f42984c;
                    DateFormat dateFormat = dateFormatArr[i2];
                    if (dateFormat == null) {
                        dateFormat = new SimpleDateFormat(f42983b[i2], Locale.US);
                        dateFormat.setTimeZone(Util.f42803f);
                        dateFormatArr[i2] = dateFormat;
                    }
                    parsePosition.setIndex(0);
                    Date parse2 = dateFormat.parse(str, parsePosition);
                    if (parsePosition.getIndex() != 0) {
                        return parse2;
                    }
                }
                Unit unit = Unit.f40552a;
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final String b(Date date) {
        Intrinsics.i(date, "<this>");
        String format = ((DateFormat) f42982a.get()).format(date);
        Intrinsics.h(format, "STANDARD_DATE_FORMAT.get().format(this)");
        return format;
    }
}
