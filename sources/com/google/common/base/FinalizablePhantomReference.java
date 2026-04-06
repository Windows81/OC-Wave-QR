package com.google.common.base;

import java.lang.ref.PhantomReference;

@ElementTypesAreNonnullByDefault
public abstract class FinalizablePhantomReference<T> extends PhantomReference<T> implements FinalizableReference {
}
