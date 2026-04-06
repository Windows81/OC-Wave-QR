package com.google.android.gms.tasks;

import java.util.ArrayList;
import java.util.Collection;

final class zzaa implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Collection f27187a;

    public final /* bridge */ /* synthetic */ Object a(Task task) {
        ArrayList arrayList = new ArrayList();
        for (Task k2 : this.f27187a) {
            arrayList.add(k2.k());
        }
        return arrayList;
    }
}
