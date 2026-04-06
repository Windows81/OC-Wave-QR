package com.google.android.gms.tasks;

import java.util.ArrayList;
import java.util.Collection;

final class zzab implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Collection f27188a;

    public zzab(Collection collection) {
        this.f27188a = collection;
    }

    public final /* bridge */ /* synthetic */ Object a(Task task) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f27188a);
        return Tasks.e(arrayList);
    }
}
