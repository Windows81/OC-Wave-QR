package io.realm.rx;

import io.realm.ObjectChangeSet;
import io.realm.RealmModel;

public class ObjectChange<E extends RealmModel> {

    /* renamed from: a  reason: collision with root package name */
    public final RealmModel f40380a;

    /* renamed from: b  reason: collision with root package name */
    public final ObjectChangeSet f40381b;

    public ObjectChange(RealmModel realmModel, ObjectChangeSet objectChangeSet) {
        this.f40380a = realmModel;
        this.f40381b = objectChangeSet;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ObjectChange objectChange = (ObjectChange) obj;
        if (!this.f40380a.equals(objectChange.f40380a)) {
            return false;
        }
        ObjectChangeSet objectChangeSet = this.f40381b;
        ObjectChangeSet objectChangeSet2 = objectChange.f40381b;
        return objectChangeSet != null ? objectChangeSet.equals(objectChangeSet2) : objectChangeSet2 == null;
    }

    public int hashCode() {
        int hashCode = this.f40380a.hashCode() * 31;
        ObjectChangeSet objectChangeSet = this.f40381b;
        return hashCode + (objectChangeSet != null ? objectChangeSet.hashCode() : 0);
    }

    public String toString() {
        return "ObjectChange{object=" + this.f40380a + ", changeset=" + this.f40381b + '}';
    }
}
