package com.google.type;

import com.google.protobuf.Internal;

public enum DayOfWeek implements Internal.EnumLite {
    DAY_OF_WEEK_UNSPECIFIED(0),
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7),
    UNRECOGNIZED(-1);
    
    public static final Internal.EnumLiteMap J = null;

    /* renamed from: z  reason: collision with root package name */
    public final int f32422z;

    public static final class DayOfWeekVerifier implements Internal.EnumVerifier {

        /* renamed from: a  reason: collision with root package name */
        public static final Internal.EnumVerifier f32423a = null;

        static {
            f32423a = new DayOfWeekVerifier();
        }

        public boolean a(int i2) {
            return DayOfWeek.d(i2) != null;
        }
    }

    static {
        J = new Internal.EnumLiteMap<DayOfWeek>() {
            /* renamed from: b */
            public DayOfWeek a(int i2) {
                return DayOfWeek.d(i2);
            }
        };
    }

    /* access modifiers changed from: public */
    DayOfWeek(int i2) {
        this.f32422z = i2;
    }

    public static DayOfWeek d(int i2) {
        switch (i2) {
            case 0:
                return DAY_OF_WEEK_UNSPECIFIED;
            case 1:
                return MONDAY;
            case 2:
                return TUESDAY;
            case 3:
                return WEDNESDAY;
            case 4:
                return THURSDAY;
            case 5:
                return FRIDAY;
            case 6:
                return SATURDAY;
            case 7:
                return SUNDAY;
            default:
                return null;
        }
    }

    public final int i() {
        if (this != UNRECOGNIZED) {
            return this.f32422z;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
