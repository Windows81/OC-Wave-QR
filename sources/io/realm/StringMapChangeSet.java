package io.realm;

import io.realm.internal.OsMapChangeSet;

class StringMapChangeSet implements MapChangeSet<String> {

    /* renamed from: a  reason: collision with root package name */
    public final OsMapChangeSet f40086a;

    public StringMapChangeSet(long j2) {
        this.f40086a = new OsMapChangeSet(j2);
    }

    public boolean isEmpty() {
        return this.f40086a.a();
    }
}
