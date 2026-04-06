package com.google.type;

import com.google.protobuf.Internal;

public enum CalendarPeriod implements Internal.EnumLite {
    CALENDAR_PERIOD_UNSPECIFIED(0),
    DAY(1),
    WEEK(2),
    FORTNIGHT(3),
    MONTH(4),
    QUARTER(5),
    HALF(6),
    YEAR(7),
    UNRECOGNIZED(-1);
    
    public static final Internal.EnumLiteMap J = null;

    /* renamed from: z  reason: collision with root package name */
    public final int f32412z;

    public static final class CalendarPeriodVerifier implements Internal.EnumVerifier {

        /* renamed from: a  reason: collision with root package name */
        public static final Internal.EnumVerifier f32413a = null;

        static {
            f32413a = new CalendarPeriodVerifier();
        }

        public boolean a(int i2) {
            return CalendarPeriod.d(i2) != null;
        }
    }

    static {
        J = new Internal.EnumLiteMap<CalendarPeriod>() {
            /* renamed from: b */
            public CalendarPeriod a(int i2) {
                return CalendarPeriod.d(i2);
            }
        };
    }

    /* access modifiers changed from: public */
    CalendarPeriod(int i2) {
        this.f32412z = i2;
    }

    public static CalendarPeriod d(int i2) {
        switch (i2) {
            case 0:
                return CALENDAR_PERIOD_UNSPECIFIED;
            case 1:
                return DAY;
            case 2:
                return WEEK;
            case 3:
                return FORTNIGHT;
            case 4:
                return MONTH;
            case 5:
                return QUARTER;
            case 6:
                return HALF;
            case 7:
                return YEAR;
            default:
                return null;
        }
    }

    public final int i() {
        if (this != UNRECOGNIZED) {
            return this.f32412z;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
