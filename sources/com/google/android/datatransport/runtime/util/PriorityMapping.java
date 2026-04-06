package com.google.android.datatransport.runtime.util;

import android.util.SparseArray;
import com.google.android.datatransport.Priority;
import java.util.HashMap;

public final class PriorityMapping {

    /* renamed from: a  reason: collision with root package name */
    public static SparseArray f24308a = new SparseArray();

    /* renamed from: b  reason: collision with root package name */
    public static HashMap f24309b;

    static {
        HashMap hashMap = new HashMap();
        f24309b = hashMap;
        hashMap.put(Priority.DEFAULT, 0);
        f24309b.put(Priority.VERY_LOW, 1);
        f24309b.put(Priority.HIGHEST, 2);
        for (Priority priority : f24309b.keySet()) {
            f24308a.append(((Integer) f24309b.get(priority)).intValue(), priority);
        }
    }

    public static int a(Priority priority) {
        Integer num = (Integer) f24309b.get(priority);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + priority);
    }

    public static Priority b(int i2) {
        Priority priority = (Priority) f24308a.get(i2);
        if (priority != null) {
            return priority;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i2);
    }
}
