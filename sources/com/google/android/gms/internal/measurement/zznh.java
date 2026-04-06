package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map;

final class zznh extends zzne {
    public zznh() {
        super();
    }

    public final void n() {
        if (!p()) {
            for (int i2 = 0; i2 < a(); i2++) {
                Map.Entry g2 = g(i2);
                if (((zzkx) g2.getKey()).g()) {
                    g2.setValue(Collections.unmodifiableList((List) g2.getValue()));
                }
            }
            for (Map.Entry entry : h()) {
                if (((zzkx) entry.getKey()).g()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.n();
    }
}
