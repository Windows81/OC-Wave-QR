package org.bson;

import java.util.Set;

public interface BSONObject {
    Object e(String str);

    Object g(String str, Object obj);

    boolean h(String str);

    Set keySet();
}
