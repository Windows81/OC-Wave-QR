package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class zzh {

    /* renamed from: a  reason: collision with root package name */
    public final zzh f25470a;

    /* renamed from: b  reason: collision with root package name */
    public zzbb f25471b;

    /* renamed from: c  reason: collision with root package name */
    public Map f25472c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public Map f25473d = new HashMap();

    public zzh(zzh zzh, zzbb zzbb) {
        this.f25470a = zzh;
        this.f25471b = zzbb;
    }

    public final zzaq a(zzaf zzaf) {
        zzaq zzaq = zzaq.f25336m;
        Iterator D = zzaf.D();
        while (D.hasNext()) {
            zzaq = this.f25471b.a(this, zzaf.s(((Integer) D.next()).intValue()));
            if (zzaq instanceof zzaj) {
                break;
            }
        }
        return zzaq;
    }

    public final zzaq b(zzaq zzaq) {
        return this.f25471b.a(this, zzaq);
    }

    public final zzaq c(String str) {
        zzh zzh = this;
        while (!zzh.f25472c.containsKey(str)) {
            zzh = zzh.f25470a;
            if (zzh == null) {
                throw new IllegalArgumentException(String.format("%s is not defined", new Object[]{str}));
            }
        }
        return (zzaq) zzh.f25472c.get(str);
    }

    public final zzh d() {
        return new zzh(this, this.f25471b);
    }

    public final void e(String str, zzaq zzaq) {
        if (this.f25473d.containsKey(str)) {
            return;
        }
        if (zzaq == null) {
            this.f25472c.remove(str);
        } else {
            this.f25472c.put(str, zzaq);
        }
    }

    public final void f(String str, zzaq zzaq) {
        e(str, zzaq);
        this.f25473d.put(str, Boolean.TRUE);
    }

    public final boolean g(String str) {
        zzh zzh = this;
        while (!zzh.f25472c.containsKey(str)) {
            zzh = zzh.f25470a;
            if (zzh == null) {
                return false;
            }
        }
        return true;
    }

    public final void h(String str, zzaq zzaq) {
        zzh zzh = this;
        while (!zzh.f25472c.containsKey(str) && (r1 = zzh.f25470a) != null && r1.g(str)) {
            zzh = zzh.f25470a;
        }
        if (zzh.f25473d.containsKey(str)) {
            return;
        }
        if (zzaq == null) {
            zzh.f25472c.remove(str);
        } else {
            zzh.f25472c.put(str, zzaq);
        }
    }
}
