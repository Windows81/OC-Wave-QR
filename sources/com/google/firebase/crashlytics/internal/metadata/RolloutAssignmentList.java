package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RolloutAssignmentList {

    /* renamed from: a  reason: collision with root package name */
    public final List f30159a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final int f30160b;

    public RolloutAssignmentList(int i2) {
        this.f30160b = i2;
    }

    public List a() {
        List b2 = b();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < b2.size(); i2++) {
            arrayList.add(((RolloutAssignment) b2.get(i2)).h());
        }
        return arrayList;
    }

    public synchronized List b() {
        return Collections.unmodifiableList(new ArrayList(this.f30159a));
    }

    public synchronized boolean c(List list) {
        this.f30159a.clear();
        if (list.size() > this.f30160b) {
            Logger f2 = Logger.f();
            f2.k("Ignored " + 0 + " entries when adding rollout assignments. Maximum allowable: " + this.f30160b);
            return this.f30159a.addAll(list.subList(0, this.f30160b));
        }
        return this.f30159a.addAll(list);
    }
}
