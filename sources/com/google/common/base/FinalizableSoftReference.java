package com.google.common.base;

import java.lang.ref.SoftReference;

@ElementTypesAreNonnullByDefault
public abstract class FinalizableSoftReference<T> extends SoftReference<T> implements FinalizableReference {
}
