package androidx.core.view.accessibility;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;

public class AccessibilityRecordCompat {

    /* renamed from: a  reason: collision with root package name */
    public final AccessibilityRecord f20415a;

    public static void a(AccessibilityRecord accessibilityRecord, int i2) {
        accessibilityRecord.setMaxScrollX(i2);
    }

    public static void b(AccessibilityRecord accessibilityRecord, int i2) {
        accessibilityRecord.setMaxScrollY(i2);
    }

    public static void c(AccessibilityRecord accessibilityRecord, View view, int i2) {
        accessibilityRecord.setSource(view, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessibilityRecordCompat)) {
            return false;
        }
        AccessibilityRecordCompat accessibilityRecordCompat = (AccessibilityRecordCompat) obj;
        AccessibilityRecord accessibilityRecord = this.f20415a;
        return accessibilityRecord == null ? accessibilityRecordCompat.f20415a == null : accessibilityRecord.equals(accessibilityRecordCompat.f20415a);
    }

    public int hashCode() {
        AccessibilityRecord accessibilityRecord = this.f20415a;
        if (accessibilityRecord == null) {
            return 0;
        }
        return accessibilityRecord.hashCode();
    }
}
