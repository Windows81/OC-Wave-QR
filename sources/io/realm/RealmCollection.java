package io.realm;

import io.realm.internal.Freezable;
import io.realm.internal.ManageableObject;
import java.util.Collection;

public interface RealmCollection<E> extends Collection<E>, ManageableObject, Freezable<RealmCollection<E>> {
    boolean isLoaded();

    boolean isManaged();
}
