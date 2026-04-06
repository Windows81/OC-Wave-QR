package io.realm;

import io.realm.internal.OsCollectionChangeSet;

public class SetChangeSet {

    /* renamed from: a  reason: collision with root package name */
    public final OsCollectionChangeSet f40071a;

    public SetChangeSet(OsCollectionChangeSet osCollectionChangeSet) {
        this.f40071a = osCollectionChangeSet;
    }

    public boolean a() {
        return this.f40071a.getNativePtr() == 0;
    }
}
